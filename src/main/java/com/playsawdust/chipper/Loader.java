/*
 * Chipper - an open polyglot game engine
 * Copyright (C) 2019-2020 the Chipper developers
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.playsawdust.chipper;

/**
 * Manages updating loading screen information.
 */
public interface Loader {

	// TODO more sophisticated stuff with support for determinate progress, nesting, et al.
	void setMessage(String message);

}
