package com.incquerylabs.magicdraw.plugin.example.ui.util;

import java.util.Collection;

import com.nomagic.magicdraw.ui.dialogs.selection.TypeFilterImpl;
import com.nomagic.magicdraw.uml.BaseElement;

public class PackageFilter extends TypeFilterImpl{
	public PackageFilter(Collection<?> select) {
		super(select);
	}

	@Override
	public boolean accept(BaseElement baseElement, boolean checkType) {
		return (baseElement instanceof com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package);
	}
}
