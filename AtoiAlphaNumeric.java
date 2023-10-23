package com.mphasis.gs;

public class AtoiAlphaNumeric {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("There are test failures");
		}
	}

	public static int atoi(String str) {

		String[] strArr = {};
		boolean flag = false;

		if (str.contains("-")) {
			strArr = str.split("-");
			str = strArr[1];
			flag = true;
		}
		int result = 0;
		int strLength = str.length();

		//System.out.println(flag);
		for (int i = 0; i < strLength; i++) {

			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				System.out.println(result);
				return result;

			} else {
				//System.out.println(result * 10 + str.charAt(i) - '0');
				//System.out.println(result * 10 + str.charAt(i)  );
				result = result * 10 + str.charAt(i) - '0';
			//	System.out.println(result);
				

			}

		}
		if (flag == true) {
			System.out.println(result * -1);
			return result * -1;
		}
		
		System.out.println(result);
		return result;
	}

	public static boolean doTestsPass() {
		// todo: implement more tests, please
		// feel free to make testing more elegant
		boolean result = true;
		 result = result && atoi("365") == 365;
		result = result && atoi("-3") == -3;
		 result = result && atoi("345a") == 345;
		 result = result && atoi("34b") == 34;
		 result = result && atoi("b23") == 0;

		return result;
	};

}
