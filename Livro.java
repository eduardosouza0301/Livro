class Livro {
    private String titulo;
    private int paginas;

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
            System.out.println("Título: " + titulo);
        }
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
        if (paginas <= 150) {
            System.out.println("Quantidade normal de páginas.");
        } else {
            System.out.println("Quantidade acima do normal de páginas.");
        }
    }

    public String getTitulo() {
        return "Um belo título: " + this.titulo;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public String getInfoLivro() {
        return "Título: " + this.getTitulo() + ". Quantidade de páginas: " + this.getPaginas();
    }

    public void verificarTamanho() {
        if (paginas > 300) {
            mensagemLivroLongo();
        } else {
            System.out.println("Leitura rápida.");
        }
    }

    private void mensagemLivroLongo() {
        System.out.println("Este é um livro longo!");
    }
}

