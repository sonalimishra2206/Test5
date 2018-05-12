package com.amdocs;

public class Triangle {
	/*Define Collections for points.*/
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	void draw()
	{
		System.out.println("Point A having co-ordinates:"+getPointA().getX()+","+ getPointA().getY());
		System.out.println("Point B having co-ordinates:"+getPointB().getX()+","+ getPointB().getY());
		System.out.println("Point C having co-ordinates:"+getPointC().getX()+","+ getPointC().getY());
	}
	
/*	
============================================================================================================================================================================================
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	void Draw()
	{
		System.out.println("Draw the Triangle with Points" + "co-ordinates are:"+"("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Draw the Triangle with Points" + "co-ordinates are:"+"("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Draw the Triangle with Points" + "co-ordinates are:"+"("+getPointC().getX()+","+getPointC().getY()+")");
		
	}
===================================================================================================================================================
*/

}
