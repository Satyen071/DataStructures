package ImplementLinkedList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Car{
	private String carNo;
	private String modelNo;
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	
}
 class CarParking{
	 
	 private Car car;
	 private int parkingFee;
	 private String date;
	 
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public int getParkingFee() {
		return parkingFee;
	}
	public void setParkingFee(int parkingFee) {
		this.parkingFee = parkingFee;
	}
	
	 
	 
 }
public class TestMatrix {

	public static void main(String[] args) {
		List<Car> carList=new ArrayList<Car>();
		List<CarParking> parkList = new ArrayList<CarParking>();
		
		Car car1 = new Car();
		car1.setCarNo("number1");
		car1.setModelNo("model1");
		Car car2 = new Car();
		car2.setCarNo("number2");
		car2.setModelNo("model2");
		Car car3 = new Car();
		car3.setCarNo("number3");
		car3.setModelNo("model3");
		
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		
		
		CarParking park1 = new CarParking();
		park1.setCar(car1);
		park1.setParkingFee(120);
		park1.setDate("date1");
		
		CarParking park2 = new CarParking();
		park2.setCar(car2);
		park2.setParkingFee(90);
		park2.setDate("date2");
		
		
		CarParking park3 = new CarParking();
		park3.setCar(car1);
		park3.setParkingFee(120);
		park3.setDate("date2");
		
		CarParking park4 = new CarParking();
		park4.setCar(car2);
		park4.setParkingFee(200);
		park4.setDate("date2");
		
		parkList.add(park1);
		parkList.add(park2);
		parkList.add(park3);
		parkList.add(park4);
		
		showParkingFee(carList,parkList);
		
		
	}

	private static void showParkingFee(List<Car> carList, List<CarParking> parkList) {
		// TODO Auto-generated method stub
		for(CarParking p:parkList) {
			for(Car c:carList) {
				if(p.getCar().getCarNo().equals(c.getCarNo())&&p.getParkingFee()>=100) {
					System.out.println("\n");
					System.out.print("carNumber: "+ c.getCarNo()+ "\nDate: "+ p.getDate()+"\nparkingFee: "+p.getParkingFee());
				}
			}
		}
	}

}
