import javax.swing.JOptionPane;
public class Tabuada
{
public static void main (String args[])
	{
	int[] resultados = new int[11];
	int tabuada;
	String msg = "Informe a tabuada desejada: ";

	tabuada = Integer.parseInt(JOptionPane.showInputDialog(msg));
	System.out.printf("A tabuada escolhida foi a do %d n", tabuada);

	for (int i=0; i < resultados.length;i++)
		{
		resultados[i]=i*tabuada;
		}
	for (int i=0; i < resultados.length;i++)
		{
			System.out.printf("%d x %d = %d\n", tabuada, i, resultados[i]);
		}
		}


}
