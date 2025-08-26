package br.fiap.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteDespesa {
    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        Despesa despesa = new Despesa();
        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // configurando os atributos do objeto
        //despesa.setId(101L);
        despesa.setDescricao("XYZ");
        despesa.setValor(25000.00);
        despesa.setCategoria(new Categoria(1L, ""));
        despesa.setData(LocalDate.parse("01/08/2025", mascara));
        dao.inserir(despesa);

    }
}
