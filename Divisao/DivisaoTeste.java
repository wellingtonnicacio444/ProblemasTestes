import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DivisaoTeste {

  @Test
  public void entradaIntSaidaInt() {
    int a = 4;
    int b = 2;
    
    Divisao d = new Divisao();

    assertEquals(2, d.divide(a, b), 0.001);
  }

  @Test
  public void entradaDecSaidaInt() {
    double a = 6.25;
    double b = 0.25;
    
    Divisao d = new Divisao();

    assertEquals(25, d.divide(a, b), 0.001);
  }

  @Test
  public void entradaIntSaidaDec() {
    int a = 3;
    int b = 2;
    
    Divisao d = new Divisao();

    assertEquals(1.5, d.divide(a, b), 0.001);
  }

  @Test
  public void entradaDecSaidaDec() {
    double a = 6.25;
    double b = 0.5;
    
    Divisao d = new Divisao();

    assertEquals(12.5, d.divide(a, b), 0.001);
  }

  @Test
  public void divisorZero() {
    double a = 4;
    double b = 0;
    
    Divisao d = new Divisao();

    assertEquals(Double.NaN, d.divide(a, b), 0.001);
  }
}