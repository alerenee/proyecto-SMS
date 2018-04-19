
package ejerciciopractico7;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Nombre de clase: EjercicioPractico7
 * Fecha: 12/04/18
 * Version: 2.0
 * CopyRight: ITCA
 * @author alere
 */
public class EjercicioPractico7 {

    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.##");
        
        int n;
        double promedioT = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos:"));
        
            double promedioE = 0;
            double promedio[] = new double[n];
            int cantProm = 0;
            int cantReprob = 0;
            
            
            String carnet[] = new String[n];
            String nombre[] = new String[n];
            int edad[] = new int[n];
            double nota1[] = new double[n];
            double nota2[] = new double[n];
            
        
        for(int i=1; i<=n; i++)
        {
            
            carnet[i] = JOptionPane.showInputDialog("Ingrese su carnet:");
            nombre[i] = JOptionPane.showInputDialog("Ingrese su nombre:");
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            nota1[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota:"));
            nota2[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota:"));
            
            promedio[i] = (nota1[i]+nota2[i])/2;
            promedioE = promedioE + promedio[i];
            promedioT = promedioE/n;
            
            if(promedio[i]>promedioT)
            {
                cantProm++;
            }
            else if(promedio[i]<7)
            {
                cantReprob++;
            }
            
            JOptionPane.showMessageDialog(null, "\n Carnet: " +carnet+
                                                "\n Nombre: "+nombre+
                                                "\n Edad: "+edad+
                                                "\n Nota1: "+df.format(nota1)+
                                                "\n Nota2: "+df.format(nota2)+
                                                "\n Promedio: "+df.format(promedio));
            
        }
        
        
        
        JOptionPane.showMessageDialog(null, "\n Promedio del grupo: " +promedioT+
                                             "\n Promedios mayores al promedio grupal: "+cantProm+
                                             "\n Reprobados: "+cantReprob);
        
        
    }
    
}
