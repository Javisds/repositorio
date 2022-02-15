package jss;

/**
 * Esta clase contiene los atributos y metodos de una calculadora
 * @author javis
 * 
 */


public class Calculadora {
	
	/**
	 * Constructor por defecto
	 */
	public Calculadora(){
        
    }
    
	/**
	 *  Metodo que suma las variables
	 * @param num1 Variable1
	 * @param num2 Variable2
	 * @return Suma variables
	 */
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    /**
	 *  Metodo que resta las variables
	 * @param num1 Variable1
	 * @param num2 Variable2
	 * @return Resta variables
	 */ int resta(int num1,int num2){
        return num1-num2;
    }
    
	 /**
	  * Metodo que multiplica las variables
	  * @param num1 Variable1
	  * @param num2 Variable2
	  * @return Multiplicaciom variables
	  */
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    /**
	 *  Metodo que divide las variables excepto si la segunda es igual a 0
	 * @param num1 Variable1
	 * @param num2 Variable2
	 * @return Division variables o excepcion
	 */
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	private int valor1;
	private int valor2;
}
