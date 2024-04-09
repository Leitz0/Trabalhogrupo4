package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dao {
	public static Cliente encontrarCpf(String cpf) throws ParseException {
//		sql = select * from grupo4.clientes where cpf;
		String dataString = "2022-06-15";
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date dataNasc = formato.parse(dataString);
		Cliente cliente = new Cliente( "nome", "ender", "tel", "cpf", dataNasc);
		return cliente;
	}
	public static Cliente encontrarNome(String nome) throws ParseException {
//		sql = select * from grupo4.clientes where nome;
		String dataString = "2022-06-15";
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date dataNasc = formato.parse(dataString);
		Cliente cliente = new Cliente("nome", "ender", "tel", "cpf", dataNasc);
		return cliente;
	}
	
	public static Cliente encontrarCodigo(int codigo) throws ParseException {
//		sql = select * from grupo4.clientes where codigo;
		String dataString = "2022-06-15";
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date dataNasc = formato.parse(dataString);
		Cliente cliente = new Cliente("nome", "ender", "tel", "cpf", dataNasc);
		return cliente;
	}
}
