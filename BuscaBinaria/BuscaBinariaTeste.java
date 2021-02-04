import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuscaBinariaTeste {

    @Test
    //Número existente no início de um array (par), buscando a posição do número da chave no array.
    public void numeroInicio(){
        int[] arrayInicio = {0, 1, 3, 4, 10, 20};
        int chave = 3;
        BuscaBinaria busc = new BuscaBinaria(); 
        assertEquals(2, busc.busca(arrayInicio, chave));
    }

    @Test
    // Número existente no meio do array, buscando a posição do número da chave no array.
    public void numeroMeio (){
        int[] arrayMeio = {0, 3, 7, 8, 14, 22, 25};
        int chave = 8;
        BuscaBinaria busc2 = new BuscaBinaria(); 
        assertEquals(3, busc2.busca(arrayMeio, chave));
    }

    @Test
    // Número existente no final, buscando a posição do número da chave no array
    public void numeroFim (){
        int[] arrayFim = {2, 4, 5, 8, 22, 56, 88, 105};
        int chave = 105;
        BuscaBinaria busc3 = new BuscaBinaria(); 
        assertEquals(7, busc3.busca(arrayFim, chave));
    }

    @Test
    // Número inexistente, procurando a posição de um número inexistente no array, passado pela chave
    public void numeroInexistente (){
        int[] arrayInex = {0, 2, 5, 8, 10, 16};
        int chave = 7;
        BuscaBinaria busc4 = new BuscaBinaria(); 
        assertEquals(-1, busc4.busca(arrayInex, chave));
    }
    
    @Test
    // Lista vazia 
    public void listaVazia(){
        int[] arrayVazio = {};
        int chave = 244;
        BuscaBinaria busc4 = new BuscaBinaria(); 
        assertEquals(0, busc4.busca(arrayVazio, chave));
    }
}