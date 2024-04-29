import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        double limite = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Limite do Cartão"));
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;

        while (sair != 0){
            String descricao = JOptionPane.showInputDialog(null, "Digite a descrição da compra!");

            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do compra"));

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
                sair = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 0 para sair ou 1 para continuar"));
            } else {
                JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
                sair = 0;
            }

            JOptionPane.showMessageDialog(null, "********************************************\n" +
                    "COMPRAS REALIZADAS\n" +
                    "********************************************");

            Collections.sort(cartao.getCompras());

            for (Compra c : cartao.getCompras()){
                JOptionPane.showMessageDialog(null,c.getDescicao() + " - " + " R$" + c.getValor() + " \nSaldo do Cartão:" + " R$" + cartao.getSaldo());
            }




        }

    }
}