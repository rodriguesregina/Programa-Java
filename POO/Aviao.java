package Turma28;

public class Aviao {
    
	private String Empresa;
	private String cor;
	private int fabricação;
	
	//método de construção do Avião
	public Aviao(String Empresa,String cor,int fabricação) {
	
		this.Empresa = Empresa;
		this.cor = cor;
		this.fabricação = fabricação;
	
	}
	 
	public String getEmpresa() {
		return Empresa;
	}
	
	public void imprimirInfo() 
	 {
		System.out.println("\nAvião da empresa:" +Empresa+ "\nNa cor: " +cor+ "\nData de Fabricação: " +fabricação);
	 }
	
	public void setEmpresa(String empresa) 
	{
		Empresa = empresa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getFabricação() {
		return fabricação;
	}
	public void setFabricação(int fabricação) {
		this.fabricação = fabricação;
	}
	
	 
}
