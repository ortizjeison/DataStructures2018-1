package C;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Clбnica {

	
	public void leerValoresReferencia(String nombreFichero) throws IOException {
		FileReader file= new FileReader(new File(nombreFichero));
		BufferedReader buffer= new BufferedReader(file);
		String line;
		boolean error1=true;// Error de fichero vac�o
		while ((line=buffer.readLine())!=null && line.compareTo("")!=0) {
			String[] infexamen=line.split(",");
			if (infexamen.length<3) {
				buffer.close();
				throw new ECantidadCampos();
			}			
			ValorExamen examen=new ValorExamen(infexamen[0], Double.parseDouble(infexamen[1]), Double.parseDouble(infexamen[2]));
			error1=false;
			if (valoresReferencia==null)
				valoresReferencia= new ValorExamen[1];
			else
				valoresReferencia=Arrays.copyOf(valoresReferencia, valoresReferencia.length+1);
			valoresReferencia[valoresReferencia.length-1]=examen;
		}
		buffer.close();
		if (error1) throw new EFicheroVacio();
	}
	
	public ExamenAlterado[] ExamenesAlterados(Date fecha){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		ExamenAlterado[] result=new ExamenAlterado[0];
		for (int i=0;i<pacientes.length;i++) {
			int[] temp=pacientes[i].ExamenesAlterado(fecha);
			if (temp.length!=0) {
				result=Arrays.copyOf(result, result.length+1);
				ExamenAlterado etemp= new ExamenAlterado(pacientes[i], temp);
				result[result.length-1]=etemp;
			}
		}
		return result;	
	}



}
