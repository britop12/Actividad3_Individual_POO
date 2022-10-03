import java.awt.event.*;
import javax.swing.*; 

public class FigurasGeometricas
{
	public static void main(String[] args) {
	// Interfaz grafica
	Menu();
	}

	public static void Menu(){
        JFrame w = new JFrame("Figuras geometricas");

        JLabel t = new JLabel("Seleccione su figura gemetrica de interes");
        JButton b1 = new JButton("Circulo");
        JButton b2 = new JButton("Cuadrado");
        JButton b3 = new JButton("Rectangulo");
        JButton b4 = new JButton("Triangulo Rectangulo");
        JButton b5 = new JButton("Rombo");
        JButton b6 = new JButton("Trapecio");
        JButton b7 = new JButton("Finalizar");


        t.setBounds(150 ,0, 500, 30);

        b1.setBounds(200,60,200,30);
        b2.setBounds(200,100,200,30);
        b3.setBounds(200,140,200,30);
        b4.setBounds(200,180,200,30);
        b5.setBounds(200,220,200,30);
        b6.setBounds(200,260,200,30);
        b7.setBounds(200,350,200,30);


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
                Circulo();
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Cuadrado();
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Rectangulo();
            }
        });

        
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                TriangleRectangle();
            }
        });

        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Rombo();
            }
        });

        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
                Trapecio();
            }
        });

        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setVisible(false);
                w.dispose();
            }
        });

    }

	public static void Circulo(){
		JFrame w = new JFrame("Circulo");

        JLabel t = new JLabel("Llene los campos y click en Ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");

        JTextField f1, a1, a2;
        f1 = new JTextField("radio (Double)");

        a1 = new JTextField("Area");
        a2 = new JTextField("Perimetro");
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,200,30);
        t.setBounds(200 ,0, 500, 30);
        f1.setBounds(100, 30, 400, 30);

        a1.setBounds(100, 210, 400, 30);
        a2.setBounds(100, 240, 400, 30);
        a1.setEditable(false);
        a2.setEditable(false);

        w.add(b1);
        w.add(b2);
        w.add(t);

        w.add(f1);
        w.add(a1);
        w.add(a2);

        w.setLocation(0,0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Circulo clase = new Circulo(Double.parseDouble(f1.getText()));

            a1.setText("Area del circulo: " + clase.calcularArea());
            a2.setText("Perimetro del circulo : " + clase.calcularPerimetro());
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

	public static void Rectangulo(){
        JFrame w = new JFrame("Rectangulo");

        JLabel t = new JLabel("Llene los campos y click en Ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");

        JTextField f1, f2, a1, a2;
        f1 = new JTextField("Base (Double)");
        f2 = new JTextField("Altura (Double)");

        a1 = new JTextField("Area");
        a2 = new JTextField("Perimetro");

        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,200,30);
        t.setBounds(200 ,0, 500, 30);
        f1.setBounds(100, 30, 400, 30);
        f2.setBounds(100, 60, 400, 30);

        a1.setBounds(100, 210, 400, 30);
        a2.setBounds(100, 240, 400, 30);
        a1.setEditable(false);
        a2.setEditable(false);

        w.add(b1);
        w.add(b2);
        w.add(t);

        w.add(f1);
        w.add(f2);
        w.add(a1);
        w.add(a2);

        w.setLocation(0,0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Rectangulo clase = new Rectangulo(Double.parseDouble(f1.getText()), 
                                                  Double.parseDouble(f2.getText()));

            a1.setText("Area del rectangulo : " + clase.calcularArea());
            a2.setText("Perimetro del rectangulo : " + clase.calcularPerimetro());
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

	public static void Cuadrado(){
		JFrame w = new JFrame("Cuadrado");

        JLabel t = new JLabel("Llene los campos y click en Ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");
        JTextField f1, a1, a2;
        f1 = new JTextField("lado (Double)");

        a1 = new JTextField("Area");
        a2 = new JTextField("Perimetro");
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,200,30);
        t.setBounds(200 ,0, 500, 30);
        f1.setBounds(100, 30, 400, 30);

        a1.setBounds(100, 210, 400, 30);
        a2.setBounds(100, 240, 400, 30);
        a1.setEditable(false);
        a2.setEditable(false);

        w.add(b1);
        w.add(b2);
        w.add(t);

        w.add(f1);
        w.add(a1);
        w.add(a2);

        w.setLocation(0,0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Circulo clase = new Circulo(Double.parseDouble(f1.getText()));

            a1.setText("Area del cuadrado: " + clase.calcularArea());
            a2.setText("Perimetro del cuadrado : " + clase.calcularPerimetro());
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

	public static void TriangleRectangle(){
        JFrame w = new JFrame("Triangulo rectangulo");

        JLabel t = new JLabel("Llene los campos y click en Ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");
        JTextField f1, f2, a1, a2, a3, a4;
        f1 = new JTextField("base (Double)");
        f2 = new JTextField("altura (Double)");

        a1 = new JTextField("Area");
        a2 = new JTextField("Perimetro");
        a3 = new JTextField("Hipotenusa");
        a4 = new JTextField("Tipo");
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,200,30);
        t.setBounds(200 ,0, 500, 30);
        f1.setBounds(100, 30, 400, 30);
        f2.setBounds(100, 60, 400, 30);

        a1.setBounds(100, 210, 400, 30);
        a2.setBounds(100, 240, 400, 30);
        a3.setBounds(100, 270, 400, 30);
        a4.setBounds(100, 300, 400, 30);
        a1.setEditable(false);
        a2.setEditable(false);
        a3.setEditable(false);
        a4.setEditable(false);

        w.add(b1);
        w.add(b2);
        w.add(t);

        w.add(f1);
        w.add(f2);
        w.add(a1);
        w.add(a2);
        w.add(a3);
        w.add(a4);

        w.setLocation(0,0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                TrianguloRectangulo clase = new TrianguloRectangulo(Double.parseDouble(f1.getText()), 
                                                      				Double.parseDouble(f2.getText()));

            a1.setText("Area del triangulo: " + clase.calcularArea());
            a2.setText("Perimetro del triangulo: " + clase.calcularPerimetro());
            a3.setText("Hipotenusa: " + clase.calcularHipotenusa());
            a4.setText("Tipo de triangulo: " + clase.calcularTipodeTriangulo());
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

	public static void Rombo(){
        JFrame w = new JFrame("Rombo");

        JLabel t = new JLabel("Llene los campos y click en Ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");

        JTextField f1, f2, f3, a1, a2;
        f1 = new JTextField("lado (Double)");
        f2 = new JTextField("diagonal menor (Double)");
        f3 = new JTextField("diagonal mayor (Double)");

        a1 = new JTextField("Area");
        a2 = new JTextField("Perimetro");
        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,200,30);
        t.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);
        f2.setBounds(100, 60, 400, 30);
        f3.setBounds(100, 90, 400, 30);

        a1.setBounds(100, 210, 400, 30);
        a2.setBounds(100, 240, 400, 30);
        a1.setEditable(false);
        a2.setEditable(false);


        w.add(b1);
        w.add(b2);
        w.add(t);

        w.add(f1);
        w.add(f2);
        w.add(f3);
        w.add(a1);
        w.add(a2);

        w.setLocation(0,0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Rombo clase = new Rombo(Double.parseDouble(f1.getText()), 
                                        Double.parseDouble(f2.getText()), 
                                        Double.parseDouble(f3.getText()));

            a1.setText("Area del rombo: " + clase.calcularArea());
            a2.setText("Perimetro del rombo: " + clase.calcularPerimetro());
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

	public static void Trapecio(){
		JFrame w = new JFrame("Trapecio");

        JLabel t = new JLabel("Llene los campos y click en Ejecutar");
        JButton b1 = new JButton("Ejecutar");
        JButton b2 = new JButton("Volver al menu");

        JTextField f1, f2, f3, f4, f5, a1, a2;
        f1 = new JTextField("base menor (Double)");
        f2 = new JTextField("base mayor (Double)");
        f3 = new JTextField("lado 1 (Double)");
        f4 = new JTextField("lado 2 (Double)");
        f5 = new JTextField("altura (Double)");

        a1 = new JTextField("Area");
        a2 = new JTextField("Perimetro");

        
        b1.setBounds(100,400,100,30);
        b2.setBounds(350,400,200,30);
        t.setBounds(200 ,0, 500, 30);

        f1.setBounds(100, 30, 400, 30);
        f2.setBounds(100, 60, 400, 30);
        f3.setBounds(100, 90, 400, 30);
        f4.setBounds(100, 120, 400, 30);
        f5.setBounds(100, 150, 400, 30);

        a1.setBounds(100, 210, 400, 30);
        a2.setBounds(100, 240, 400, 30);
        a1.setEditable(false);
        a2.setEditable(false);

        w.add(b1);
        w.add(b2);
        w.add(t);

        w.add(f1);
        w.add(f2);
        w.add(f3);
        w.add(f4);
        w.add(f5);
        w.add(a1);
        w.add(a2);

        w.setLocation(0,0);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(600,600);  
        w.setLayout(null); 
        w.setVisible(true);  

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Trapecio clase = new Trapecio(Double.parseDouble(f1.getText()),
										  	  Double.parseDouble(f2.getText()), 
                                              Double.parseDouble(f3.getText()), 
                                              Double.parseDouble(f4.getText()), 
                                              Double.parseDouble(f5.getText()));

            a1.setText("Area: " + clase.calcularArea());
            a2.setText("Perimetro: " + clase.calcularPerimetro());
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

abstract class FiguraGeometrica {

	public abstract Double calcularArea();
	public abstract Double calcularPerimetro();
}

class Circulo extends FiguraGeometrica {
	Double radio;

	public Circulo(Double r){
		radio = r;
	}

	public Double calcularArea(){
		return (Math.PI * Math.pow(radio, 2));
	}

	public Double calcularPerimetro(){
		return (2*Math.PI*radio);
	}
}

class Rectangulo extends FiguraGeometrica {
	Double base;
	Double altura;

	public Rectangulo(double b, double h){
		base = b;
		altura = h;
	}

	public Double calcularArea(){
		return (base * altura);
	}

	public Double calcularPerimetro(){
		return (2*base + 2*altura);
	}
}

class Cuadrado extends FiguraGeometrica {
	Double lado;

	public Cuadrado(Double l){
		lado = l;
	}

	public Double calcularArea(){
		return (Math.pow(lado,2));
	}

	public Double calcularPerimetro(){
		return (4*lado);
	}
}

class TrianguloRectangulo extends FiguraGeometrica {
	Double base;
	Double altura;
	public TrianguloRectangulo(Double b, Double h){
		base = b;
		altura = h;
	}

	public Double calcularArea(){
		return (0.5*base*altura);
	}

	public Double calcularPerimetro(){
		return (base + altura + calcularHipotenusa());
	}

	public Double calcularHipotenusa(){
		return Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
	}

	public String calcularTipodeTriangulo(){
		String resultado = "";
		if ((base == altura) && (base == calcularHipotenusa())){
			resultado = "Equilatero";
		}

		else if ((base != altura) && (base != calcularHipotenusa())){
			resultado = "Escaleno";
		}

		else{
			resultado = "Isosceles";
		}

		return resultado;
	}
}

class Rombo extends FiguraGeometrica {
	Double lado;
	Double diagonalMenor;
	Double diagonalMayor;

		public Rombo(Double l, Double dMen, Double dMay){
		lado = l;
		diagonalMenor = dMen;
		diagonalMayor = dMay;
	}
	
	public Double calcularArea(){
		return ((diagonalMayor*diagonalMenor)/2);
	}

	public Double calcularPerimetro(){
		return (lado*4);
	}
}

class Trapecio extends FiguraGeometrica {
	Double baseMenor;
	Double baseMayor;
	Double lado1;
	Double lado2;
	Double altura;

	public Trapecio(Double bMen, Double bMay, Double t, Double l2, Double h){
		baseMenor = bMen;
		baseMayor = bMay;
		lado1 = t;
		lado2 = l2;
		altura = h;
	}
	
	public Double calcularArea(){
		return (((baseMenor + baseMayor)*altura)/2);
	}

	public Double calcularPerimetro(){
		return (baseMenor + baseMayor + lado1 + lado2);
	}
}