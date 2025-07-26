package com.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados = new HashSet<>();


    public void adicionarConvidado(Convidado convidado) {
        if (convidados.add(convidado)) {
            System.out.println("Convidado adicionado: " + convidado);
        } else {
            System.out.println("Convidado já existe: " + convidado);
        }
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        convidados.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
    }

    public void contarConvidados() {
        System.out.println("Total de convidados: " + convidados.size());
    }

    public void exibirConvidados() {
        if (convidados.isEmpty()) {
            System.out.println("Nenhum convidado cadastrado.");
        } else {
            System.out.println("Lista de convidados:");
            for (Convidado convidado : convidados) {
                System.out.println(convidado);
            }
        }
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        // Exemplo de uso
        Convidado convidado1 = new Convidado("Alice", 101);
        Convidado convidado2 = new Convidado("Bob", 102);
        Convidado convidado3 = new Convidado("Charlie", 103);

        conjunto.adicionarConvidado(convidado1);
        conjunto.adicionarConvidado(convidado2);
        conjunto.adicionarConvidado(convidado3);

        conjunto.exibirConvidados();

        conjunto.contarConvidados();

        conjunto.removerConvidadoPorCodigo(102);
        System.out.println("O candidato de número 102 foi removido:" );
        conjunto.exibirConvidados();
    }

}


/* Este código define a classe ConjuntoConvidados, que gerencia um conjunto de convidados usando um HashSet.
 Ele permite adicionar, remover e exibir convidados, além de contar quantos estão cadastrados.
 A classe Convidado deve ser definida separadamente, conforme o exemplo comentado no início do arquivo.
 O método adicionarConvidado verifica se o convidado já existe antes de adicioná-lo ao conjunto,
 e o método removerConvidadoPorCodigo permite remover um convidado com base no seu código de convite.
 O método exibirConvidados imprime a lista de convidados ou uma mensagem
 de que não há convidados cadastrados.
 O método contarConvidados exibe o total de convidados no conjunto.
 */
