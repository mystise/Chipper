/*
 * This software is based on or using the J-Ogg library available from
 * http://www.j-ogg.de and copyrighted by Tor-Einar Jarnbjo.
 *
 * You are free to use, modify, redistribute or include this software in your own
 * free or commercial software. The only restriction is, that you make it obvious
 * that your software is based on J-Ogg by including this notice in the
 * documentation, about box or wherever you feel appropriate.
 */

package de.jarnbjo.ogg;

import java.io.IOException;

/**
 * Exception thrown when reaching the end of an Ogg stream
 */

public class EndOfOggStreamException extends IOException {
	private static final long serialVersionUID = 6931269822427303991L;

	public EndOfOggStreamException() {}
	public EndOfOggStreamException(Throwable t) {
		super(t);
	}
}