import java.awt.event.*;
import javax.swing.*; 

public class capitulo4 {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        JFrame w = new JFrame("Capitulo 3");
        JLabel t = new JLabel("Seleccione ejercicio");
        JButton b1 = new JButton("Ejercicio 7");
        JButton b2 = new JButton("Ejercicio 10");
        JButton b3 = new JButton("Ejercicio 22");
        JButton b4 = new JButton("Ejercicio 23");
        JButton b5 = new JButton("Ejercicio 40");
        JButton b6 = new JButton("Ejercicio 41");
        JButton b7 = new JButton("Finalizar");
        
        t.setBounds(230 ,0, 500, 30);
        b1.setBounds(200,60,200,30);
        b2.setBounds(200,100,200,30);
        b3.setBounds(200,140,200,30);
        b4.setBounds(200,180,200,30);
        b5.setBounds(200,220,200,30);
        b6.setBounds(200,260,200,30);
        b7.setBounds(200,300,200,30);

        w.add(t);
        w.add(b1);
        w.add(b2);
        w.add(b3);
        w.add(b4);
        w.add(b5);
        w.add(b6);
        w.add(b7);

        w.setLocation(0,0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Ejercicio7();
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Ejercicio10();
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Ejercicio22();
            }
        });

        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Ejercicio23();
            }
        });

        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Ejercicio40();
            }
        });

        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Ejercicio41();
            }
        });

        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
            }
        });


    }

    public static void Ejercicio7(){
        JFrame w = new JFrame("Ejercicio 7");

        JLabel h = new JLabel("Llene los campos y click en ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");
        // Campos de texto
        JTextField f1, f2, a1;
        f1 = new JTextField("Valor A (Double)");
        f2 = new JTextField("Valor B (Double)");

        a1 = new JTextField();

        // Panel
        b1.setBounds(220,350,200,30);
        b2.setBounds(220,450,200,30);
        h.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);
        f2.setBounds(100, 60, 400, 30);

        a1.setBounds(100, 120, 400, 30);
        a1.setEditable(false);

        // Eventos
        w.add(b1);
        w.add(b2);
        w.add(h);


        w.add(f1);
        w.add(f2);
        w.add(a1);

        // Configuracion de la ventana
        w.setLocation(0, 0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Mayor clase = new Mayor(Double.parseDouble(f1.getText()),
                                        Double.parseDouble(f2.getText()));

            a1.setText("El numero A es " + clase.getMayor() + " que el numero B");
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

    public static void Ejercicio10(){
        JFrame w = new JFrame("Ejercicio 10");

        JLabel h = new JLabel("Llene los campos y click en ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");

        // Campos de texto
        JTextField f1, f2, f3, f4, a1, a2, a3;
        f1 = new JTextField("Numero de inscripcion (String)");
        f2 = new JTextField("nombres (String)");
        f3 = new JTextField("Patrimonio (Double)");
        f4 = new JTextField("Estrato social (Double)");

        a1 = new JTextField("Numero de inscripcion");
        a2 = new JTextField("Nombres");
        a3 = new JTextField("Pago de matricula");

        // Panel
        b1.setBounds(220,350,200,30);
        b2.setBounds(220,450,200,30);
        h.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);
        f2.setBounds(100, 60, 400, 30);
        f3.setBounds(100, 90, 400, 30);
        f4.setBounds(100, 120, 400, 30);

        a1.setBounds(100, 210, 400, 30);
        a2.setBounds(100, 240, 400, 30);
        a3.setBounds(100, 270, 400, 30);
        a1.setEditable(false);
        a2.setEditable(false);
        a3.setEditable(false);

        // Eventos
        w.add(b1);
        w.add(b2);
        w.add(h);

        w.add(f1);
        w.add(f2);
        w.add(f3);
        w.add(f4);
        w.add(a1);
        w.add(a2);
        w.add(a3);

        // Configuracion de la ventana
        w.setLocation(0, 0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        // Eventos
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Matricula clase = new Matricula(f1.getText(),
                                                f2.getText(), 
                                                Double.parseDouble(f3.getText()), 
                                                Double.parseDouble(f4.getText()));

            a1.setText("Numero de inscripcion: " + clase.getNumero());
            a2.setText("Nombres: " + clase.getNombres());
            a3.setText("Pago de matricula: " + clase.pago());
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

    

    public static void Ejercicio22(){
        JFrame w = new JFrame("Ejercicio 22");

        JLabel h = new JLabel("Llene los campos y click en ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");
        // Campos de texto
        JTextField f1, f2, f3, a1;
        f1 = new JTextField("Nombre empleado (String)");
        f2 = new JTextField("Salario basico por hora (Double)");
        f3 = new JTextField("Numero de horas trabajadas al mes");

        a1 = new JTextField();

        // Panel
        b1.setBounds(220,350,200,30);
        b2.setBounds(220,450,200,30);
        h.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);
        f2.setBounds(100, 60, 400, 30);
        f3.setBounds(100, 90, 400, 30);

        a1.setBounds(100, 120, 400, 30);
        a1.setEditable(false);

        // Eventos
        w.add(b1);
        w.add(b2);
        w.add(h);


        w.add(f1);
        w.add(f2);
        w.add(f3);
        w.add(a1);

        // Configuracion de la ventana
        w.setLocation(0, 0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Salario clase = new Salario(f1.getText(),
                                            Double.parseDouble(f2.getText()),
                                            Double.parseDouble(f3.getText()));

            String adicional = "";
            if (clase.getSalarioMensual() > 450000){
                adicional = " gana " + Double.toString(clase.getSalarioMensual());
            }
            a1.setText(clase.getNombre() + adicional);
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

    public static void Ejercicio23(){
        JFrame w = new JFrame("Ejercicio 23");

        JLabel h = new JLabel("Llene los campos y click en ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");

        // Campos de texto
        JTextField f1, f2, f3, a1;
        f1 = new JTextField("Valor A (Double)");
        f2 = new JTextField("Valor B (Double)");
        f3 = new JTextField("Valor C (Double)");

        a1 = new JTextField("Soluciones");

        // Panel
        b1.setBounds(220,350,200,30);
        b2.setBounds(220,450,200,30);
        h.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);
        f2.setBounds(100, 60, 400, 30);
        f3.setBounds(100, 90, 400, 30);

        a1.setBounds(100, 120, 400, 30);
        a1.setEditable(false);

        // Eventos
        w.add(b1);
        w.add(b2);
        w.add(h);

        w.add(f1);
        w.add(f2);
        w.add(f3);
        w.add(a1);

        // Configuracion de la ventana
        w.setLocation(0, 0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Ecuacion clase = new Ecuacion(Double.parseDouble(f1.getText()),
                                              Double.parseDouble(f2.getText()),
                                              Double.parseDouble(f3.getText()));

            a1.setText("Soluciones: " + clase.getSol1() + ", " + clase.getSol2());
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

    public static void Ejercicio40(){
        JFrame w = new JFrame("Ejercicio 40");

        JLabel h = new JLabel("Llene los campos y click en ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");
        // Campos de texto
        JTextField f1, a1, a2, a3;
        f1 = new JTextField("Numero (Double)");

        a1 = new JTextField("Raiz cuadrada");
        a2 = new JTextField("Cuadrado");
        a3 = new JTextField("Cubo");
        
        // Panel
        b1.setBounds(220,350,200,30);
        b2.setBounds(220,450,200,30);
        h.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);

        a1.setBounds(100, 60, 400, 30);
        a1.setEditable(false);
        a2.setBounds(100, 90, 400, 30);
        a2.setEditable(false);
        a3.setBounds(100, 120, 400, 30);
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
                Operador clase = new Operador(Double.parseDouble(f1.getText()));

            a1.setText("Raiz Cuadrada: " + clase.getSqrt());
            a2.setText("Cuadrado: " + clase.getCuadrado());
            a3.setText("Cubo: " + clase.getCubo());
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

    public static void Ejercicio41(){
        JFrame w = new JFrame("Ejercicio 41");

        JLabel h = new JLabel("Llene los campos y click en ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");
        // Campos de texto
        JTextField f1, a1;
        f1 = new JTextField("Valores separados por comas: 1, 2, 3...");

        a1 = new JTextField("Maximo");

        // Panel        
        b1.setBounds(220,350,200,30);
        b2.setBounds(220,450,200,30);
        h.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);

        a1.setBounds(100, 60, 400, 30);
        a1.setEditable(false);

        // Eventos
        w.add(b1);
        w.add(b2);
        w.add(h);

        w.add(f1);
        w.add(a1);

        // Configuracion de la ventana
        w.setLocation(0, 0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                MayorTexto clase = new MayorTexto(f1.getText());

            a1.setText("Maximo: " + clase.getMax());
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
    
}

class Matricula{
    String numInscripcion;
    String nombres;
    Double patrimonio;
    Double estratoSocial;

    public Matricula(String ndi, String names, Double p, Double es){
        numInscripcion = ndi;
        nombres = names;
        patrimonio = p;
        estratoSocial = es;
    }

    public String getNumero(){
        return numInscripcion;
    }

    public String getNombres(){
        return nombres;
    }

    public Double pago(){
        if ((estratoSocial > 3) & (patrimonio > 2000000)){
            return (50000.0 + patrimonio*0.03);
        }

        else{
            return 50000.0;
        }
    }
}

class Mayor{
    Double a;
    Double b;
    public Mayor(Double a1, Double b1){
        a = a1;
        b = b1;
    }

    public String getMayor(){
        String respuesta;
        if (a > b){
            respuesta = "Mayor";
        }

        else if (a < b){
            respuesta = "Menor";
        }

        else{
            respuesta = "Igual";
        }

        return respuesta;
    }
}

class Salario{
    String nombre;
    Double salarioHora;
    Double horasTrabajadasMes;
    public Salario(String name, Double s, Double hm){
        nombre = name;
        salarioHora = s;
        horasTrabajadasMes = hm;
    }

    public String getNombre(){
        return nombre;
    }

    public Double getSalarioMensual(){
        return salarioHora * horasTrabajadasMes;
    }
}

class Ecuacion{
    Double a;
    Double b;
    Double c;
    public Ecuacion(Double A, Double B, Double C){
        a = A;
        b = B;
        c = C;
    }

    public Double getSol1(){
        Double num = -b + Math.sqrt(Math.pow(b,2) - (4*a*c));
        Double den = 2*a;

        return num/den;
    }

    public Double getSol2(){
        Double num = -b - Math.sqrt(Math.pow(b,2) - (4*a*c));
        Double den = 2*a;

        return num/den;
    }
}

class Operador{
    Double numero;
    public Operador(Double n){
        numero = n;
    }

    public Double getSqrt(){
        return Math.pow(numero, 0.5);
    }

    public Double getCuadrado(){
        return Math.pow(numero, 2);
    }

    public Double getCubo(){
        return Math.pow(numero, 3);
    }
}

class MayorTexto{
    String texto;
    public MayorTexto(String t){
        texto = t;
    }

    public Double getMax(){
        Double num = 0.0, res = 0.0;
        for (int i = 0; i<texto.length(); i++)
        {
            if (Character.isDigit(texto.charAt(i)))
                num = num * 10 + (texto.charAt(i)-'0');
            else
            {
                res = Math.max(res, num);
                num = 0.0;
            }
        }
        return Math.max(res, num);
    }
}
