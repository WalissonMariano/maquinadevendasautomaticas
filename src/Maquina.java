import javax.swing.JOptionPane;
public class Maquina {
    public static void main(String[] args) {
        int opcaoProduto;
        double somaProdutos;
        double valorPago;

        opcaoProduto = 0;
        somaProdutos=0;
        valorPago=0;

        //O COMANDO 55 SERÁ UTILIZADO PARA FINALIZAR COMPRA

        while (opcaoProduto != 55){
            opcaoProduto = Integer.parseInt(JOptionPane.showInputDialog("Valor total do pedido: R$"+ somaProdutos +
                    "\n\nDigite:"+"\n1- Coca Cola 350ML - R$ 4,50" +
                    "\n2- Guarana 350ml - R$ 4,50\n3- Água sem gás 500ml - R$ 3,00\n4- Água com gás 500ml - R$ 3,50" +
                    "\n5- Suco Del Vale 1L - R$ 7,00\n\nDigite 55 para finalizar a compra."));
            if (opcaoProduto==1){
                somaProdutos = somaProdutos + 4.50;
            } else if (opcaoProduto==2) {
                somaProdutos = somaProdutos + 4.50;
            }else if (opcaoProduto==3) {
                somaProdutos = somaProdutos + 3.00;
            }else if (opcaoProduto==4) {
                somaProdutos = somaProdutos + 3.50;
            }else if (opcaoProduto==5) {
                somaProdutos = somaProdutos + 7.00;
            } else if (opcaoProduto<1 || opcaoProduto>5 && opcaoProduto!=55) {
                JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente.");
            }
        }

        valorPago = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado: "));
        if (valorPago>somaProdutos){
            JOptionPane.showMessageDialog(null, "Seu troco é igual a R$ " + (valorPago-somaProdutos));
            JOptionPane.showMessageDialog(null, "Produto liberado com sucesso.");
        }else {
            JOptionPane.showMessageDialog(null, "O valor depositado e insuficiente.");
            JOptionPane.showMessageDialog(null, "R$" + valorPago + " devolvido." );
        }
    }
}
