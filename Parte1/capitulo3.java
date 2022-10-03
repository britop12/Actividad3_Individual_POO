import java.awt.event.*;
import javax.swing.*; 

public class capitulo3 {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        JFrame w = new JFrame("Capitulo 3");
        JLabel t = new JLabel("Seleccione ejercicio");
        JButton b1 = new JButton("Ejercicio 18");
        JButton b2 = new JButton("Ejercicio 19");
        JButton b3 = new JButton("Finalizar");
        
        t.setBounds(230 ,0, 500, 30);
        b1.setBounds(200,60,200,30);
        b2.setBounds(200,100,200,30);
        b3.setBounds(200,140,200,30);

        w.add(t);
        w.add(b1);
        w.add(b2);
        w.add(b3);

        w.setLocation(0,0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Ejercicio18();
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Ejercicio19();
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
            }
        });


    }

    public static void Ejercicio18(){
        JFrame w = new JFrame("Ejercicio 18");

        // Botones
        JLabel h = new JLabel("Llene los campos y click en ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");

        // Campos de texto
        JTextField f1, f2, f3, f4, f5, a1, a2, a3, a4;
        f1 = new JTextField("Codigo de empleado (String)");
        f2 = new JTextField("Nombres (String)");
        f3 = new JTextField("Numero de horas trabajadas al mes (Double)");
        f4 = new JTextField("Valor hora trabajada (Double)");
        f5 = new JTextField("Porcentaje de retencion de la fuente (Double)");

        a1 = new JTextField("Codigo");
        a2 = new JTextField("Nombres");
        a3 = new JTextField("Salario Bruto");
        a4 = new JTextField("Salario Neto");

        // Panel
        b1.setBounds(220,350,200,30);
        b2.setBounds(220,450,200,30);
        h.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);
        f2.setBounds(100, 60, 400, 30);
        f3.setBounds(100, 90, 400, 30);
        f4.setBounds(100, 120, 400, 30);
        f5.setBounds(100, 150, 400, 30);

        a1.setBounds(100, 210, 400, 30);
        a2.setBounds(100, 240, 400, 30);
        a3.setBounds(100, 270, 400, 30);
        a4.setBounds(100, 300, 400, 30);
        a1.setEditable(false);
        a2.setEditable(false);
        a3.setEditable(false);
        a4.setEditable(false);

        // Eventos
        w.add(b1);
        w.add(b2);
        w.add(h);

        w.add(f1);
        w.add(f2);
        w.add(f3);
        w.add(f4);
        w.add(f5);
        w.add(a1);
        w.add(a2);
        w.add(a3);
        w.add(a4);

        // Configuracion de la ventana
        w.setLocation(0, 0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                infoEmpleado clase = new infoEmpleado(f1.getText(),
                                                      f2.getText(), 
                                                      Double.parseDouble(f3.getText()), 
                                                      Double.parseDouble(f4.getText()), 
                                                      Double.parseDouble(f5.getText()));

            a1.setText("Codigo: " + clase.getCodigo());
            a2.setText("Nombres: " + clase.getNombres());
            a3.setText("Salario Bruto: " + Double.toString(clase.getBruto()));
            a4.setText("Salario Neto: " + Double.toString(clase.getNeto()));
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Menu();
            }
        });
    }

    public static void Ejercicio19(){
        JFrame w = new JFrame("Ejercicio 19");
        // Botones
        JLabel h = new JLabel("Llene el campo y click en ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");
        // Campos de texto
        JTextField f1, a1, a2, a3;
        f1 = new JTextField("lado del triangulo (Double)");

        a1 = new JTextField("Perimetro");
        a2 = new JTextField("Altura");
        a3 = new JTextField("Area");

        // Panel
        b1.setBounds(220,350,200,30);
        b2.setBounds(220,450,200,30);
        h.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);

        a1.setBounds(100, 90, 400, 30);
        a2.setBounds(100, 120, 400, 30);
        a3.setBounds(100, 150, 400, 30);
        a1.setEditable(false);
        a2.setEditable(false);
        a3.setEditable(false);

        // Eventos
        w.add(b1);
        w.add(b2);
        w.add(h);


        w.add(f1);
        w.add(a1);
        w.add(a2);
        w.add(a3);
        // Configuracion de la ventana
        w.setLocation(0, 0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                trianguloEquilatero clase = new trianguloEquilatero(
                                                                    Double.parseDouble(f1.getText()));

            a1.setText("Perimetro: " + clase.getPerimetro());
            a2.setText("Altura: " + clase.getAltura());
            a3.setText("Area: " + clase.getArea());
            }
        }); 

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
            }
        });
    }

}

class infoEmpleado{
    String codigo;
    String nombres;
    Double horasTrabajadasMes;
    Double valorHoraTrabajada;
    Double porcentajeRetencion;

    public infoEmpleado(String code, String names, Double ht, Double vt, Double pr){
        codigo = code;
        nombres = names;
        horasTrabajadasMes = ht;
        valorHoraTrabajada = vt;
        porcentajeRetencion = pr;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombres(){
        return nombres;
    }

    public Double getBruto(){
        return (horasTrabajadasMes * valorHoraTrabajada);
    }

    public Double getNeto(){
        Double salario = (horasTrabajadasMes * valorHoraTrabajada);
        return (salario - (salario*porcentajeRetencion));
    }
}


class trianguloEquilatero{
    Double lado;
    public trianguloEquilatero(Double l){
        lado = l;
    }

    public Double getPerimetro(){
        return lado*3;
    }

    public Double getAltura(){
        return (Math.pow(3.0, 0.5)*lado)/2;
    }

    public Double getArea(){
        return getAltura() * lado;
    }
}
