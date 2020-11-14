package maptest;
import java.util.*;
public class mapTest {
	public static void main(String[] args) {
		Map <Integer, String> mapa= new HashMap<Integer,String>();
		mapa.put(455, "red");
		mapa.put(111, "green");
		mapa.put(213, "blue");
		System.out.println("Mapa:"+mapa);
		System.out.println("Keys:"+mapa.keySet());
		System.out.println("Keys:"+mapa.values());

	}
}