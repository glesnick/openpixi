package org.openpixi.pixi.physics;

import org.openpixi.pixi.physics.boundary.HardWallBoundary;
import org.openpixi.pixi.physics.boundary.PeriodicBoundary;
import org.openpixi.pixi.physics.force.Force;
import org.openpixi.pixi.physics.force.SpringForce;

public class InitialConditions {

	public static void initRandomParticles(int count, int radius) {
		Simulation.f = new Force();
		Simulation.f.reset();
		Simulation.f.gy = - 1; //-ConstantsSI.g;
		//f.bz = 1;
		
		InitialConditions.createRandomParticles(count, radius);
		InitialConditions.setHardWallBoundary();
	}

	public static void initGravity(int count) {
		Simulation.f = new Force();
		Simulation.f.reset();
		Simulation.f.gy = -1; // -ConstantsSI.g;
		
		InitialConditions.createRandomParticles(count, 15);
		InitialConditions.setHardWallBoundary();
	}

	public static void initElectric(int count) {
		Simulation.f = new Force();
		Simulation.f.reset();
		Simulation.f.ey = -1;
		
		InitialConditions.createRandomParticles(count, 15);
		InitialConditions.setHardWallBoundary();
	}

	public static void initMagnetic(int count) {
		Simulation.f = new Force();
		Simulation.f.reset();
		Simulation.f.bz = .1;
		
		InitialConditions.createRandomParticles(count, 15);
		InitialConditions.setPeriodicBoundary();
	}

	public static void initSpring(int count) {
		Simulation.particles.clear();
		Simulation.f = new SpringForce();
		Simulation.f.reset();
		
		for (int k = 0; k < count; k++) {
			Particle2D par = new Particle2D();
			par.x = Simulation.width * Math.random();
			par.y = Simulation.height * Math.random();
			par.radius = 15;
			par.vx = 10 * Math.random();
			par.vy = 0;
			par.mass = 1;
			par.charge = 0;
			Simulation.particles.add(par);
		}
	
		InitialConditions.setPeriodicBoundary();
	}

	public static void createRandomParticles(int count, double radius) {
		Simulation.particles.clear();
		for (int k = 0; k < count; k++) {
			Particle2D par = new Particle2D();
			par.x = Simulation.width * Math.random();
			par.y = Simulation.height * Math.random();
			par.radius = radius;
			par.vx = 10 * Math.random();
			par.vy = 10 * Math.random();
			par.mass = 1;
			if (Math.random() > 0.5) {
				par.charge = 1;
			} else {
				par.charge = -1;
			}
			Simulation.particles.add(par);
		}
	}

	public static void setHardWallBoundary() {
		Simulation.boundary = new HardWallBoundary();
	}

	public static void setPeriodicBoundary() {
		Simulation.boundary = new PeriodicBoundary();
	}

}