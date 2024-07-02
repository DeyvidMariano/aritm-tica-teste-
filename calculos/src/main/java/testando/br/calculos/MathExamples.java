package testando.br.calculos;
import java.math.BigDecimal;
import java.text.DecimalFormat;
public class MathExamples 
{
    public static void main( String[] args )
    {
    	int intNumA = 5;
    	int intNumB = 3;
    	double dblNumC = 5.2;
    	double dblNumD = 3.1;
    	double dblNumE = 0.1f;
    	double dblNumF = 0.2f;
    	double dblNumG = -9f;
    	DecimalFormat dFormat = new DecimalFormat("#, ###.###");
    	System.out.println(intNumA + " + " + intNumB + " = " + (intNumA + intNumB));
    	System.out.println(intNumA + " - " + intNumB + " = " + subtract(intNumA,intNumB));
    	System.out.println(intNumA + " x " + intNumB + " = " + multiply(intNumA,intNumB));
    	System.out.println(intNumA + " " + (char)247 + " " + intNumB + " = " + divide(intNumA,intNumB));
    	System.out.println(intNumA + " mod " + intNumB + " = " + modulo(intNumA, intNumB));
    	System.out.println(intNumA + " to the power of " + intNumB + " = " + exponent (intNumA, intNumB));
    	System.out.println(dblNumC + " + " + dblNumD + " = " + add(dblNumC,dblNumD));
    	System.out.println(dblNumE + " + " + dblNumF + " = " + add(dblNumE,dblNumF));
    	System.out.println((0.1f == 0.1d));
    	System.out.println(dblNumC + " - " + dblNumD + " = " + subtract(dblNumC,dblNumD));
    	System.out.println(dblNumC + " x " + dblNumD + " = " + multiply(dblNumC,dblNumD));
    	System.out.println (dblNumC + " " + (char) 247 + " " + dblNumD + " = "+ dFormat.format(divide(dblNumC,dblNumD)));
    	System.out.println(dblNumC + " to the power of " + dblNumD + " = "+ dFormat.format(exponent(dblNumC,dblNumD)));
    	System.out.println("The sguare root of " + dblNumC + " = " + dFormat.format(squareRoot(dblNumC)));
    	System.out.println("The cube root of " + dblNumC + " = " + dFormat.format(cubeRoot(dblNumC)));
    	System.out.println("The absolute value of " + dblNumC + " = " + dFormat.format(absoluteVal(dblNumC)));
    	System.out.println("The absolute value of " + dblNumG + " = " + dFormat.format(absoluteVal(dblNumG)));
    }
    public static int add(int intNum1, int intNum2) {

    	return intNum1 + intNum2;

    	}
    public static int subtract(int intNum1, int intNum2) {

    	return intNum1 - intNum2;

    	}
    public static int multiply(int intNum1, int intNum2) {

    	return intNum1 * intNum2;

    	}
    public static int divide(int intDividend, int intDivisor) {

    	return intDividend / intDivisor;

    	}
    public static int modulo(int intDividend, int intDivisor) {

    	return intDividend % intDivisor;

    	}
    public static int exponent(int base, int power) {
    	return (int) Math.pow(base, power);

    	}
    
    public static BigDecimal add(double dblNum1, double dblNum2) {
        return BigDecimal.valueOf(dblNum1).add(BigDecimal.valueOf(dblNum2));
        
    }

    public static double subtract(double dblNum1, double dblNum2) {

    	return dblNum1 - dblNum2;

    	}

    public static double multiply(double dblNum1, double dblNum2) {

    	return dblNum1 * dblNum2;

    	}

    public static double divide(double dblNum1, double dblNum2) {

    	return dblNum1 / dblNum2;

    	}
    
    public static double exponent(double base, double power) {

    	return Math.pow(base, power);

    	}

    public static double squareRoot(double number) {

    	return Math.sqrt(number);

    	}

    public static double cubeRoot(double number) {

    	return Math.cbrt(number);

    	}

    public static double absoluteVal(double number) {

    	return Math.abs(number);

    	}
    }