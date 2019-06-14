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

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Gabor Bergmann
 *
 */
public class CodegenUtil {
	public static final Pattern SEPARATORS =
			// split at non-identifier characters,
			// as well as at boundaries before the first uppercase letter in a sequence of
			// uppercase letters
			// (to split off at camel|Cases and abbreviat|IONs)
			// and at the boundary after the last uppercase letter in a sequence of at least
			// two
			// (to split off abbreviatION|s)
			Pattern.compile("[^a-zA-Z0-9]|(?<![A-Z])(?=[A-Z])|(?<=[A-Z][A-Z])(?![A-Z])");

	public static final String V4MD_PREFIX = "_v4md";
	public static final String V4MD_FIELD_PREFIX = V4MD_PREFIX+ "_field_";
	public static final Set<String> RESERVED = new HashSet<String>(Arrays.asList(
			// Python keywords in v3.7
			"False", "None", "True", "and", "as", "assert", "async", "await", "break", "class", "continue", "def",
			"del", "elif", "else", "except", "finally", "for", "from", "global", "if", "import", "in", "is", "lambda",
			"nonlocal", "not", "or", "pass", "raise", "return", "try", "while", "with", "yield",
			// Python builtins in v3.7
			"ArithmeticError", "AssertionError", "AttributeError", "BaseException", "BlockingIOError",
			"BrokenPipeError", "BufferError", "BytesWarning", "ChildProcessError", "ConnectionAbortedError",
			"ConnectionError", "ConnectionRefusedError", "ConnectionResetError", "DeprecationWarning", "EOFError",
			"Ellipsis", "EnvironmentError", "Exception", "False", "FileExistsError", "FileNotFoundError",
			"FloatingPointError", "FutureWarning", "GeneratorExit", "IOError", "ImportError", "ImportWarning",
			"IndentationError", "IndexError", "InterruptedError", "IsADirectoryError", "KeyError", "KeyboardInterrupt",
			"LookupError", "MemoryError", "ModuleNotFoundError", "NameError", "None", "NotADirectoryError",
			"NotImplemented", "NotImplementedError", "OSError", "OverflowError", "PendingDeprecationWarning",
			"PermissionError", "ProcessLookupError", "RecursionError", "ReferenceError", "ResourceWarning",
			"RuntimeError", "RuntimeWarning", "StopAsyncIteration", "StopIteration", "SyntaxError", "SyntaxWarning",
			"SystemError", "SystemExit", "TabError", "TimeoutError", "True", "TypeError", "UnboundLocalError",
			"UnicodeDecodeError", "UnicodeEncodeError", "UnicodeError", "UnicodeTranslateError", "UnicodeWarning",
			"UserWarning", "ValueError", "Warning", "WindowsError", "ZeroDivisionError", "_", "__build_class__",
			"__debug__", "__doc__", "__import__", "__loader__", "__name__", "__package__", "__spec__", "abs", "all",
			"any", "ascii", "bin", "bool", "breakpoint", "bytearray", "bytes", "callable", "chr", "classmethod",
			"compile", "complex", "copyright", "credits", "delattr", "dict", "dir", "divmod", "enumerate", "eval",
			"exec", "exit", "filter", "float", "format", "frozenset", "getattr", "globals", "hasattr", "hash", "help",
			"hex", "id", "input", "int", "isinstance", "issubclass", "iter", "len", "license", "list", "locals", "map",
			"max", "memoryview", "min", "next", "object", "oct", "open", "ord", "pow", "print", "property", "quit",
			"range", "repr", "reversed", "round", "set", "setattr", "slice", "sorted", "staticmethod", "str", "sum",
			"super", "tuple", "type", "vars", "zip"
	));

	@Pure
	public static String mangleName(String umlName) {
		String joined = SEPARATORS.splitAsStream(umlName).filter((seg) -> !seg.isEmpty()).map(
				(seg) -> seg.equals(seg.toUpperCase()) ? seg /* skip lower casing all-caps abbreviations, e.g. UML */
						: Character.toLowerCase(seg.charAt(0)) + seg.substring(1))
				.collect(Collectors.joining("_"));

		// Prefix if prefix or entire string is not permitted
		if (joined.isEmpty() || RESERVED.contains(joined) || Character.isDigit(joined.charAt(0)) || joined.startsWith(V4MD_PREFIX))
			return "_" + joined;
		else
			return joined;
	}
}
