/**
 * @file org/pepit/plugin/Message.java
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

import android.content.Context;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Message {

    static public void display(Context context, String msg, int textSize,
	    int color) {
	Toast t = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
	t.setGravity(Gravity.CENTER, 0, 0);
	LinearLayout l = (LinearLayout) t.getView();
	View child = l.getChildAt(0);
	TextView msgTv = (TextView) child;
	msgTv.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize);
	msgTv.setGravity(Gravity.CENTER);
	msgTv.setTextColor(color);
	t.show();
    }

}
