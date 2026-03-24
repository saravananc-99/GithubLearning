package automationFramework;

public class login {

	int emp_id = 123456;
	int temp = 22222;

	public login() {

		int emp_id = 78910;
		System.out.println(emp_id);
		System.out.println(this.emp_id);
		System.out.println(this.temp);

	}

	public static void main(String args[]) {

		login lg = new login();
		admin ad = new admin();

	}

}

class admin extends login {

	int a = 1;
	int b = 2;

	public admin() {

		int temp = a + b;
		System.out.println(temp);
		System.out.println(super.temp);
	}

}
