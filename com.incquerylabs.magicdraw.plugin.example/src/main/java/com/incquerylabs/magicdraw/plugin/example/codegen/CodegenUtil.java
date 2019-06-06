/*******************************************************************************
 * Copyright (c) 2010-2019, Gabor Bergmann, IncQuery Labs Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabor Bergmann - initial API and implementation
 *******************************************************************************/
package com.incquerylabs.magicdraw.plugin.example.codegen;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Gabor Bergmann
 *
 */
public class CodegenUtil {
	public static final Pattern SEPARATORS = 
		// split at non-identifier characters, 
		// as well as at boundaries before the first uppercase letter in a sequence of uppercase letters 
		//		(to split off at camel|Cases and abbreviat|IONs)
		// and at the boundary after the last uppercase letter in a sequence of at least two
		//		(to split off abbreviatION|s)
		Pattern.compile("[^a-zA-Z0-9_]|(?<![A-Z])(?=[A-Z])|(?<=[A-Z][A-Z])(?![A-Z])");

	public static String mangleName(String umlName) {
		String joined = SEPARATORS.splitAsStream(umlName)
				.filter((seg) -> !seg.isEmpty())
				.map((seg) ->
					seg.equals(seg.toUpperCase()) ? 
						seg /* skip lower casing all-caps abbreviations, e.g. UML */ 
					: 
						Character.toLowerCase(seg.charAt(0)) + seg.substring(1)
				).collect(Collectors.joining("_"));
				
		if (joined.isEmpty() || Character.isUpperCase(joined.charAt(0)) )
			return "_" + joined;
		else 
			return joined;
	}
}
