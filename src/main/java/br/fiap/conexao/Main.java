package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
        //Categoria categoria = new Categoria(8L, "festa");
        //dao.inserir(categoria);
        List<Categoria> lista = dao.listar();
        for(Categoria categoria : lista) {
            System.out.println(categoria.getId() + " --> " + categoria.getCategoria());
        }
    }
}
