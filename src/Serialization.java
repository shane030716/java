import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public String name;
   public String address;
   public transient int SSN;
   public int number;
   
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name + " " + address);
   }
}

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.name = "First Last";
		emp.address = "Toronto, Ontario, Canada";
		emp.SSN = 123456789;
		emp.number = 5555555;
		
		serialize(emp);
		
		deserialize();
	}
	
	public static void serialize(Employee emp) {
		try {
			FileOutputStream fos = new FileOutputStream("../employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
			fos.close();
			System.out.println("Serialized data saved in ../employee.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deserialize() {
		try {
			FileInputStream fis = new FileInputStream("../employee.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			ois.close();
			fis.close();
			
			Employee emp = (Employee) obj;
			
			System.out.println("Deserialized employee: ");
			System.out.println("Name: " + emp.name);
			System.out.println("Address: " + emp.address);
			System.out.println("SSN: " + emp.SSN);
			System.out.println("Number: " + emp.number);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
