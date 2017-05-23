package com.ntechniks.nstudios.androidutils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/**
 * Copyright (C) 2017 Nikola Georgiev
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>
 * 
 */

/**
 * Official Git repository at https://github.com/marulka/android-utils
 * 
 * @author Nikola Georgiev
 * @version 1.0
 * @since 1.0
 * 
 */
public class Empty {

	/**
	 * Returns empty String. The string HAS a pointer, but also has a ZERO
	 * length.
	 * 
	 * @return {@link String}
	 * @since 1.0
	 */
	public static String string() {
		return "";
	}

	// =================================================================================================================================

	/**
	 * Returns empty {@link DialogInterface.OnClickListener}. The listener HAS
	 * pointer, but does NOT have an implemented business logic inside the
	 * onClick() callback.
	 * 
	 * @return {@link DialogInterface.OnClickListener}
	 * @since 1.0
	 */
	public static DialogInterface.OnClickListener onClickListener() {

		final OnClickListener listener = new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// Does nothing.
			}
		};

		return listener;
	}
}
