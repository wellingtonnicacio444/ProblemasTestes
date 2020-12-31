import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IdadeTeste {
  
  @Test
  public void casoDeTeste1() {
    int M = 52;
    int A = 14;
    int B = 18;

    assertEquals(20, Idade.idade(M, A, B));
  } 

  @Test
  public void casoDeTeste2() {
    int M = 47;
    int A = 21;
    int B = 9;

    assertEquals(21, Idade.idade(M, A, B));
  } 
}
