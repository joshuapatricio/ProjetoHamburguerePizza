import javax.swing.JOptionPane;

public class Restaurante {
    public static void main (String[] args){

        String opcao = JOptionPane.showInputDialog("Informe o numero do pedido: \n 1 - Hamburguer \n 2 - Pizza \n 3 - Sair");

        if (opcao.equals("1")){
          String nome = JOptionPane.showInputDialog("Qual é o nome?");
          double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do Hamburguer ?"));
          String seArtesanal = JOptionPane.showInputDialog("Deseja que seja artesanal ?\nDigite\nS - Sim\n N - Não");
          boolean artesanalParaCalculo;

          if (seArtesanal.equals("S")){
              artesanalParaCalculo=true;
          }
          else{
              artesanalParaCalculo=false;
          }

          Hamburguer h = new Hamburguer();

          h.nome = nome;
          h.valor = Double.parseDouble(String.valueOf(valor));

          double valorTotal = h.CalculaValor(artesanalParaCalculo);

          JOptionPane.showMessageDialog(null,"O seu pedido ficou no valor de: \n" +"R$ "+ valorTotal + JOptionPane.INFORMATION_MESSAGE);

        }
        else if (opcao.equals("2")){
            String nome = JOptionPane.showInputDialog("Qual é o nome da Pizza?");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor?"));
            String possuirBorda = JOptionPane.showInputDialog("Deseja borda ?\nDigite:\nS - Sim\nN - Não");
            boolean bordaParaCalculo;

            if (possuirBorda.equals("S")){
                bordaParaCalculo=true;
            }
            else{
                bordaParaCalculo=false;
            }

            Pizza p = new Pizza();

            p.nome = nome;
            p.valor = Double.parseDouble(String.valueOf(valor));

            double valorTotal = p.CalculaValor(bordaParaCalculo);

            JOptionPane.showMessageDialog(null,"O seu pedido ficou no valor de: \n" +"R$ "+ valorTotal + JOptionPane.INFORMATION_MESSAGE);

        }
        else {
            JOptionPane.showMessageDialog(null,"Obrigado!" + JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
