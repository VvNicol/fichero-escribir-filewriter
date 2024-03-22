import java.io.FileWriter;
import java.io.IOException;

public class inicio {

	public static void main(String[] args) {

		String rutaArchivo = "archivo.txt";

		try {

			FileWriter sw = new FileWriter(rutaArchivo);

			sw.write("Hola, mundo\n");
			sw.write("soy un archivo txt, escribiendo desde java.");
			sw.close();

			System.out.println("Se ha creado y escrito exitosamente");
			
		} catch (IOException e) {
			System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
