/**
 * @file org/pepit/plugin/Utils.java
 * 
 * PepitMobil: an educational software
 * This file is a part of the PepitMobil environment
 * http://pepit.be
 *
 * Copyright (C) 2012-2013 Pepit Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.pepit.plugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipFile;

import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;

public class Utils {

    private static String getZipFileName(org.pepit.plugin.Interface plugin) {
	String name = new String();
	org.pepit.plugin.Info info = plugin.getInfo();

	name += info.level.toName();
	name += "_";
	name += info.subject.toName();
	name += "_";
	name += info.theme;
	name += ".zip";
	return name;
    }

    public static Bitmap getImage(org.pepit.plugin.Interface plugin,
	    String imageName) throws IOException {
	ZipFile zipFile = new ZipFile(Environment.getExternalStorageDirectory()
		.getPath() + "/pepitmobil/" + getZipFileName(plugin));
	InputStream in = zipFile.getInputStream(zipFile.getEntry("drawable/"
		+ imageName));

	return BitmapFactory.decodeStream(in);
    }

    public static InputStream getDataFile(org.pepit.plugin.Interface plugin,
	    String dataFileName) throws IOException {
	ZipFile zipFile = new ZipFile(Environment.getExternalStorageDirectory()
		.getPath() + "/pepitmobil/" + getZipFileName(plugin));

	return zipFile.getInputStream(zipFile.getEntry("data/" + dataFileName));
    }

    public static Class<?> getPluginClass(Context context,
	    String pluginFileName, String className) throws IOException,
	    ClassNotFoundException {
	String zipFileName = Environment.getExternalStorageDirectory()
		 .getPath() + "/pepitmobil/" + pluginFileName + ".zip";
	File dexClasses = new File(zipFileName);

	Log.d("DEX", "name: " + dexClasses.getAbsolutePath());
	Log.d("DEX", "classname: " + className);

	 DexFile dexFile = DexFile.loadDex(dexClasses.getAbsolutePath(),
	 context
	 .getDir("pepitmobil", Context.MODE_PRIVATE).getAbsolutePath()
	 + "/outputdexcontainer.dex", 0);
	 
	 Enumeration<String> classFileNames = dexFile.entries();
	 while (classFileNames.hasMoreElements())
	 {
	     String name = classFileNames.nextElement();
	     dexFile.loadClass(name, context.getClassLoader());	     
	 }
	 
	return dexFile.loadClass(className, context.getClassLoader());
    }

}