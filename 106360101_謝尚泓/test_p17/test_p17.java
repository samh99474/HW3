package test_p17;

public class test_p17 {
	
	public static void main(String[] args)
	{	
	Car car1;
	car1 = new Car();
	car1.setnumgas(1234,20.5);
	int number = car1.getnum();
	double gasline = car1.getgas();
	System.out.println("�լd�˫~�o��");
	System.out.println("�N����"+number+"�A�T�o���O"+gasline);
	}
}
class Car{
	int num;
	double gas;
	
	int getnum() {
		System.out.println("�լd����");
		return num;
	}
	double getgas() {
		System.out.println("�լd���o�q");
		return gas;
	}
	
	void setnumgas(int n,double g){
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o���]��"+gas);
	}
	
	}
