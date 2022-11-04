package TesteIgualdade;
import java.io.*;

public class AppRegistraAluno {
	
public static void main(String[] args) throws IOException {
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	RegistraAluno aluno = new RegistraAluno();
	
	System.out.println("Bem-vindo ao registro de média dos alunos");
	System.out.println("Digite seu nome:");
	String nome = bfr.readLine();
	
	System.out.println("Digite seu endereço:");
	String endereco = bfr.readLine();
	
	System.out.println("Digite sua idade:");
	int idade = Integer.parseInt(bfr.readLine());
	
	System.out.println("Digite sua nota de portugues:");
	double notaPort = Integer.parseInt(bfr.readLine());
	
	System.out.println("Digite sua nota de geografia:");
	double notaGeo = Integer.parseInt(bfr.readLine());
	
	System.out.println("Digite sua nota de matematica:");
	double notaMat = Integer.parseInt(bfr.readLine());
	
	aluno.setNome(nome);
	aluno.setEndereco(endereco);
	aluno.setIdade(idade);
	aluno.setNotaGeo(notaGeo);
	aluno.setNotaMat(notaMat);
	aluno.setNotaPort(notaPort);
	
	System.out.println("Aluno " + RegistraAluno.getContador()+ "Registrado com sucesso!");
	System.out.println("Nome do aluno:"+ aluno.getNome());
	System.out.println("Endereço do aluno" + aluno.getEndereco());
	System.out.println("Idade do aluno: " + aluno.getIdade());
	System.out.println("Media do aluno: " + aluno.getMedia());
	
	
	
	
	
}
}
