import javax.swing.JOptionPane;
public class entrada_joption {
    public static void main(String[] argr){
    String nome = JOptionPane.showInputDialog("Digite seu nome");
    String idade = JOptionPane.showInputDialog("Digite a sua idade");

    double altura = Double.parseDouble(JOptionPane.showInputDialog("digite a sua altura")); //conversão direta
    int idadeStr = Integer.parseInt(idade); //conversão indireta

    JOptionPane.showMessageDialog(null, nome + idadeStr + altura);
    }
}
