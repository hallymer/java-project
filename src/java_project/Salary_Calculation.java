package java_project;

import java.util.*;

public class Salary_Calculation {

	public static void main(String[] args) {
		int salary; // ������ �����ϱ� ���� int�� ���� salary ����
		long pay; // ������ ����Ͽ� �����ϱ� ���� long�� ���� pay ����
		Scanner input = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�.\n>>> "); // �Է¾ȳ� ���

		salary = input.nextInt();// �Է� ���� ���� ���� salary�� ����
		pay = salary * 12;// ����(����*12)�� ����Ͽ� pay�� ����

		System.out.println("\n���� >>> " + salary); //���ް� ������ ���
		System.out.println("���� >>> " + pay);
		input.close();
	}

}
