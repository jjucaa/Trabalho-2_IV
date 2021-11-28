package proxy;

public class Proxy implements Ascii {
	private Img ascii;
	private String nameImg = "Lotus";
	
	public Proxy(String nomeArquivo){
		this.nameImg = nameImg;
	}
	
	@Override
	public void print() {
		if(ascii == null) {
			System.out.println("\nImagem inexistente... Criando Imagem...\n");
			ascii = new Img(nameImg);
		}else{
			System.out.println("\nRecarregando Ascii " + nameImg + " ...\n");
		}
		ascii.print();
	}
}