import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof","Kaczka",20,"23.4.2001"));
      s.addStudent(new Student("Janusz","Pak", 40,"23.4.2001"));
			

			String imie;
			String nazwisko;
			int wiek;
			String data;
			
			int i=0;
			while(i==0)
				{
					System.out.println("1. Dodaj studenta");
					System.out.println("2. lista studentów");
					System.out.println("3. zamknij program");
					int w;
					Scanner sc = new Scanner(System.in);
					w = sc.nextInt();
					switch(w)
						{
							case 1:
								System.out.println("Podaj imie studenta");
								imie = sc.next();
								System.out.println("Podaj nazwisko studenta");
								nazwisko = sc.next();
								System.out.println("Podaj wiek studenta");
								wiek = sc.nextInt();
								System.out.println("Podaj date urodzenia studenta");
								data = sc.next();
								s.addStudent(new Student(imie,nazwisko, wiek,data));
								break;
							case 2:
								{
									var students = s.getStudents();
      						for(Student current : students) {
        		System.out.println(current.ToString());
      					}
									break;
						}
							case 3:
								{
									i = 1;
									break;
								}
							default:
								System.out.println("koniec");
				}
      
      }
    } catch (IOException e) {

    }
  }
}