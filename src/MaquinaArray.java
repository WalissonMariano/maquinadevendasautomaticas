import javax.swing.JOptionPane;
public class MaquinaArray {
    public static void main(String[] args) {
        int opcaoProduto;
        double somaProdutos;
        double valorPago;

        opcaoProduto = 0;
        somaProdutos=0;
        valorPago=0;

        String [] produtos = {"Feijão 500g - R$ 8,50", "Toddy 400g - R$ 4,50" , "Creme de leite - R$ 3,00",
                                "Fubá 500g - R$ 3,50", "Finalizar compra", "Cancelar compra"};

        while (opcaoProduto > (-1)){
            opcaoProduto = JOptionPane.showInternalOptionDialog(null,"Selecione a(s) bebida(s) desejada(s): "
                    +"\nValor da compra:R$"+ somaProdutos,
                    "Máquina de Bebidas", 0, JOptionPane.QUESTION_MESSAGE,null, produtos,"Coca Cola 350ML - R$ 4,50");

            if (opcaoProduto==0){
                somaProdutos = somaProdutos + 8.50;
            } else if (opcaoProduto==1) {
                somaProdutos = somaProdutos + 4.50;
            }else if (opcaoProduto==2) {
                somaProdutos = somaProdutos + 3.00;
            }else if (opcaoProduto==3) {
                somaProdutos = somaProdutos + 3.50;
            } else if (opcaoProduto==4) {
                break;
            } else if (opcaoProduto==5) {
                break;
            }
        }
        if (opcaoProduto==5){
            JOptionPane.showMessageDialog(null, "Compra cancelada.");
        }else {
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
}
