package OOPS;

import Inheritance.Car;

public class Audi {
	public class AudiMLi extends Car{
		public void openSunRoof() {
			System.out.println("Open sun roof");
		}
		public  void main(String[] args) {
			AudiMLi audi=new AudiMLi();
			audi.applyBreak();
			audi.switchOnAc();
			audi.openSunRoof();
		}

	