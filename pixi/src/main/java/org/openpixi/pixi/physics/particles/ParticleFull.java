/*
 * OpenPixi - Open Particle-In-Cell (PIC) Simulator
 * Copyright (C) 2012  OpenPixi.org
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.openpixi.pixi.physics.particles;


import java.awt.Color;
import java.io.Serializable;


public class ParticleFull extends Particle {

	/** x-coordinate */
	private double x;

	/** y-coordinate */
	private double y;
	
	/** z-coordinate */
	private double z;

	/** radius of particle */
	private double radius;

	/** color of particle (for display only) */
	private Color color;

	/** velocity in x-direction */
	private double vx;

	/** velocity in y-direction */
	private double vy;
	
	/** velocity in z-direction */
	private double vz;

	/** acceleration in x-direction */
	private double ax;

	/** acceleration in y-direction */
	private double ay;
	
	/** acceleration in z-direction */
	private double az;

	/** mass of the particle */
	private double mass;

	/** electric charge of the particle */
	private double charge;

	/**previous x position of particle*/
	private double prevX;
	/**previous y position of particle*/
	private double prevY;
	
	/**previous z position of particle*/
	private double prevZ;
	
	private double Ex;
	private double Ey;
	private double Ez;
	private double Bx;
	private double By;
	private double Bz;
	
	/**previous position component of the force in x - direction used in Boris & BorisDamped*/
	private double prevpositionComponentForceX;
	
	/**previous position component of the force in y - direction used in Boris & BorisDamped*/
	private double prevpositionComponentForceY;
	
	/**previous position component of the force in z - direction used in Boris & BorisDamped*/
	private double prevpositionComponentForceZ;

	/**previous tangent velocity component of the force in x - direction used in Boris*/
	private double prevtangentVelocityComponentOfForceX;

	/**previous tangent velocity component of the force in y - direction used in Boris*/
	private double prevtangentVelocityComponentOfForceY;
	
	/**previous tangent velocity component of the force in z - direction used in Boris*/
	private double prevtangentVelocityComponentOfForceZ;
	
	/**previous normal velocity component of the force in x - direction used in LeapFrogDamped*/
	private double prevnormalVelocityComponentOfForceX;

	/**previous normal velocity component of the force in y - direction used in LeapFrogDamped*/
	private double prevnormalVelocityComponentOfForceY;
	
	/**previous normal velocity component of the force in z - direction used in LeapFrogDamped*/
	private double prevnormalVelocityComponentOfForceZ;
	
	/**previous magnetic field in x - direction used in Boris & BorisDamped*/
	private double prevBx;
	
	/**previous magnetic field in y - direction used in Boris & BorisDamped*/
	private double prevBy;

	/**previous magnetic field in z - direction used in Boris & BorisDamped*/
	private double prevBz;
	
	/**previous linear drag coefficient used in BorisDamped*/
	private double prevLinearDragCoefficient;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void addX(double x) {
		this.x += x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void addY(double y) {
		this.y += y;
	}
	
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public void addZ(double z) {
		this.z += z;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}
	
	public double getVz() {
		return vz;
	}

	public void setVz(double vz) {
		this.vz = vz;
	}

	public double getAx() {
		return ax;
	}

	public void setAx(double ax) {
		this.ax = ax;
	}

	public double getAy() {
		return ay;
	}

	public void setAy(double ay) {
		this.ay = ay;
	}
	
	public double getAz() {
		return az;
	}

	public void setAz(double az) {
		this.az = az;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public double getPrevX() {
		return prevX;
	}

	public void setPrevX(double prevX) {
		this.prevX = prevX;
	}

	public void addPrevX(double x) {
		this.prevX += x;
	}

	public double getPrevY() {
		return prevY;
	}

	public void setPrevY(double prevY) {
		this.prevY = prevY;
	}

	public void addPrevY(double y) {
		this.prevY += y;
	}
	
	public double getPrevZ() {
		return prevZ;
	}

	public void setPrevZ(double prevZ) {
		this.prevZ = prevZ;
	}

	public void addPrevZ(double z) {
		this.prevZ += z;
	}
	
	public double getEx() {
		return Ex;
	}

	public void setEx(double Ex) {
		this.Ex = Ex;
	}

	public double getEy() {
		return Ey;
	}

	public void setEy(double Ey) {
		this.Ey = Ey;
	}
	
	public double getEz() {
		return Ez;
	}

	public void setEz(double Ez) {
		this.Ez = Ez;
	}
	
	public double getBx() {
		return Bx;
	}

	public void setBx(double Bx) {
		this.Bx = Bx;
	}
	
	public double getBy() {
		return By;
	}

	public void setBy(double By) {
		this.By = By;
	}

	public double getBz() {
		return Bz;
	}

	public void setBz(double Bz) {
		this.Bz = Bz;
	}

	public double getPrevPositionComponentForceX() {
		return prevpositionComponentForceX;
	}

	public void setPrevPositionComponentForceX(double prevpositionComponentForceX) {
		this.prevpositionComponentForceX = prevpositionComponentForceX;
	}
	
	public double getPrevPositionComponentForceY() {
		return prevpositionComponentForceY;
	}

	public void setPrevPositionComponentForceY(double prevpositionComponentForceY) {
		this.prevpositionComponentForceY = prevpositionComponentForceY;
	}

	public double getPrevPositionComponentForceZ() {
		return prevpositionComponentForceZ;
	}

	public void setPrevPositionComponentForceZ(double prevpositionComponentForceZ) {
		this.prevpositionComponentForceZ = prevpositionComponentForceZ;
	}
	
	public double getPrevTangentVelocityComponentOfForceX() {
		return prevtangentVelocityComponentOfForceX;
	}

	public void setPrevTangentVelocityComponentOfForceX(double prevtangentVelocityComponentOfForceX) {
		this.prevtangentVelocityComponentOfForceX = prevtangentVelocityComponentOfForceX;
	}

	public double getPrevTangentVelocityComponentOfForceY() {
		return prevtangentVelocityComponentOfForceY;
	}

	public void setPrevTangentVelocityComponentOfForceY(double prevtangentVelocityComponentOfForceY) {
		this.prevtangentVelocityComponentOfForceY = prevtangentVelocityComponentOfForceY;
	}
	
	public double getPrevTangentVelocityComponentOfForceZ() {
		return prevtangentVelocityComponentOfForceZ;
	}

	public void setPrevTangentVelocityComponentOfForceZ(double prevtangentVelocityComponentOfForceZ) {
		this.prevtangentVelocityComponentOfForceZ = prevtangentVelocityComponentOfForceZ;
	}
	
	public double getPrevNormalVelocityComponentOfForceX() {
		return prevnormalVelocityComponentOfForceX;
	}

	public void setPrevNormalVelocityComponentOfForceX(double prevnormalVelocityComponentOfForceX) {
		this.prevnormalVelocityComponentOfForceX = prevnormalVelocityComponentOfForceX;
	}

	public double getPrevNormalVelocityComponentOfForceY() {
		return prevnormalVelocityComponentOfForceY;
	}

	public void setPrevNormalVelocityComponentOfForceY(double prevnormalVelocityComponentOfForceY) {
		this.prevnormalVelocityComponentOfForceY = prevnormalVelocityComponentOfForceY;
	}
	
	public double getPrevNormalVelocityComponentOfForceZ() {
		return prevnormalVelocityComponentOfForceZ;
	}

	public void setPrevNormalVelocityComponentOfForceZ(double prevnormalVelocityComponentOfForceZ) {
		this.prevnormalVelocityComponentOfForceZ = prevnormalVelocityComponentOfForceZ;
	}
	
	public double getPrevBz() {
		return prevBz;
	}

	public void setPrevBz(double prevBz) {
		this.prevBz = prevBz;
	}
	
	public double getPrevBx() {
		return prevBx;
	}

	public void setPrevBx(double prevBx) {
		this.prevBx = prevBx;
	}
	
	public double getPrevBy() {
		return prevBy;
	}

	public void setPrevBy(double prevBy) {
		this.prevBy = prevBy;
	}
	
	public double getPrevLinearDragCoefficient() {
		return prevLinearDragCoefficient;
	}

	public void setPrevLinearDragCoefficient(double prevLinearDragCoefficient) {
		this.prevLinearDragCoefficient = prevLinearDragCoefficient;
	}


	/** Empty constructor */
	public ParticleFull() {
	}

	@Override
	public Particle copy() {
		Particle p = new ParticleFull();
		p.setX(x);
		p.setY(y);
		p.setZ(z);
		p.setRadius(radius);
		p.setColor(color);
		p.setVx(vx);
		p.setVy(vy);
		p.setVz(vz);
		p.setAx(ax);
		p.setAy(ay);
		p.setAz(az);
		p.setMass(mass);
		p.setCharge(charge);
		p.setPrevX(prevX);
		p.setPrevY(prevY);
		p.setPrevZ(prevZ);
		p.setEx(Ex);
		p.setEy(Ey);
		p.setEz(Ez);
		p.setBx(Bx);
		p.setBy(By);
		p.setBz(Bz);
		p.setPrevPositionComponentForceX(prevpositionComponentForceX);
		p.setPrevPositionComponentForceY(prevpositionComponentForceY);
		p.setPrevPositionComponentForceY(prevpositionComponentForceZ);
		p.setPrevTangentVelocityComponentOfForceX(prevtangentVelocityComponentOfForceX);
		p.setPrevTangentVelocityComponentOfForceY(prevtangentVelocityComponentOfForceY);
		p.setPrevTangentVelocityComponentOfForceY(prevtangentVelocityComponentOfForceZ);
		p.setPrevBz(prevBx);
		p.setPrevBz(prevBy);
		p.setPrevBz(prevBz);
		p.setPrevLinearDragCoefficient(prevLinearDragCoefficient);
		
		return p;
	}


	public void storePosition() {
		prevX = x;
		prevY = y;
		prevZ = z;
	}
	
	public void applyPeriodicBoundary(double boundaryX, double boundaryY, double boundaryZ) {
		x = (x + boundaryX) % boundaryX;
		y = (y + boundaryY) % boundaryY;
		z = (z + boundaryZ) % boundaryZ;
	}


	@Override
	public String toString() {
		return String.format("[%.3f,%.3f]", x, y, z);
	}
}
