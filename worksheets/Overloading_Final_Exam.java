public class Overloading_Final_Exam {

	public static void main(String[] args) {

		C lang1 = new C();
		C lang2 = new CPP();
		C lang3 = new JAVA();
		CPP lang4 = new CPP();
		CPP lang5 = new JAVA();
		JAVA lang6 = new JAVA();

		lang6.print(lang6);
		((CPP) lang5).print((CPP)lang6);
		((JAVA) lang3).print((C)lang6);

	}

}
