package Turma28;

public class Cliente {
 //declaração dos atributos da classe
	private String nomeCliente;
	private String cpf;
	private int idade;
	
	
	//método de construção
	public Cliente (String nomeCliente,String cpf,int idade) 
	{
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.idade = idade;
	}
		
	
	public String getNomeCliente() {
		return nomeCliente;
	}

    public void imprimirInfo()
    {
     System.out.print(nomeCliente+" "+"\nCliente portador do cpf: " +cpf+ "\nCom idade de: " +idade+  "anos");
     		

    }
     
    public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
    


}
