/*
 * generated by Xtext 2.34.0
 */
package compilador;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SolemStandaloneSetup extends SolemStandaloneSetupGenerated {

	public static void doSetup() {
		new SolemStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
