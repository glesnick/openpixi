package org.openpixi.pixi.distributed;

import org.openpixi.pixi.physics.Settings;
import org.openpixi.pixi.physics.force.ConstantForce;
import org.openpixi.pixi.physics.grid.Interpolator;
import org.openpixi.pixi.physics.solver.Euler;
import org.openpixi.pixi.physics.solver.relativistic.SemiImplicitEulerRelativistic;
import org.openpixi.pixi.physics.util.ClassCopier;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class VariousSettings {

	public static Map<String, Settings> getSettingsMap() {
		Map<String, Settings> variousTestSettings = new HashMap<String, Settings>();
		Settings defaultSettings = getDefaultSettings();

		Settings settings = ClassCopier.copy(defaultSettings);
		settings.setNumOfNodes(2);
		variousTestSettings.put("2 nodes - self communication", settings);

		settings = ClassCopier.copy(defaultSettings);
		variousTestSettings.put("Euler", settings);

		// TODO find solution
//		settings = ClassCopier.copy(defaultSettings);
//		settings.setParticleSolver(new Boris());
//		variousTestSettings.put("Boris", settings);

		settings = ClassCopier.copy(defaultSettings);
		settings.setParticleSolver(
				new SemiImplicitEulerRelativistic(settings.getSpeedOfLight()));
		variousTestSettings.put("SemiImplicitEulerRelativistic", settings);

		// Fails because additional addition and subtraction cause the position to diverge
		// slowly from the position calculated by local simulation
		// TODO find solution
		settings = ClassCopier.copy(defaultSettings);
		settings.setIterations(10000);
		settings.setNumOfParticles(10);
		variousTestSettings.put("10 000 iterations", settings);

		// TODO find solution
//		settings = ClassCopier.copy(defaultSettings);
//		settings.setInterpolator(new ChargeConservingAreaWeighting());
//		variousTestSettings.put("ChargeConservingAreaWeighting", settings);

		settings = ClassCopier.copy(defaultSettings);
		settings.setInterpolator(new Interpolator());
		variousTestSettings.put("BaseInterpolator", settings);

		// Fails because YeeSolver relies too much on gridCellsX and gridCellsY which differ
		// in the distributed and local simulations.
		// TODO find solution
//		settings = ClassCopier.copy(defaultSettings);
//		settings.setGridSolver(new YeeSolver());
//		variousTestSettings.put("YeeSolver", settings);

		// Fails because SpringForce uses particle's absolute y position to calculate the force.
		// Since the y position in local and distributed simulation differs,
		// it also has a different effect.
		// TODO find solution
//		settings = ClassCopier.copy(defaultSettings);
//		settings.addForce(new SpringForce());
//		variousTestSettings.put("SpringForce", settings);

		settings = ClassCopier.copy(defaultSettings);
		ConstantForce constantForce = new ConstantForce();
		constantForce.bz = -1;
		settings.addForce(constantForce);
		variousTestSettings.put("MagneticForce", settings);

		return variousTestSettings;
	}


	public static Settings getDefaultSettings() {
		Settings settings = new Settings();
		settings.setNumOfNodes(16);
		settings.setGridCellsX(64);
		settings.setGridCellsY(128);
		settings.setSimulationWidth(10 * settings.getGridCellsX());
		settings.setSimulationHeight(10 * settings.getGridCellsY());
		settings.setNumOfParticles(100);
		settings.setIterations(100);
		settings.setParticleSolver(new Euler());
		return settings;
	}
}
