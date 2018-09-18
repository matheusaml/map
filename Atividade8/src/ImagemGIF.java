public class ImagemGIF implements Imagem {

	@Override
	public void carregarImagem() {
		System.out.println("Carregando GIF");
	}

	@Override
	public void desenharImagem() {
		System.out.println("Desenhando GIF");
	}

}