/*
* generated by Xtext
*/
package org.example.entities;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EntitiesUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.example.entities.ui.internal.EntitiesActivator.getInstance().getInjector("org.example.entities.Entities");
	}
	
}