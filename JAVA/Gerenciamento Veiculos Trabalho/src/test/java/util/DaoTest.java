/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package util;

import java.util.List;
import modelo.Endereco;
import modelo.Motorista;
import modelo.Operador;
import modelo.Veiculo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author prog2
 */
public class DaoTest {
    
    public DaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

//    @Test
//    public void testSomeMethod() {
//        Veiculo v = new Veiculo("Ford", "Camaro", "ABC123", "Cinza");
//        Dao<Veiculo> dao = new Dao (Veiculo.class);
//        
//        dao.inserir(v);
//    }
//    
//    @Test
//    public void testLista() {
//        Dao<Veiculo> dao = new Dao (Veiculo.class);
//        List<Veiculo> lista = dao.listarTodos();
//        
//        for(Veiculo v : lista) {
//            System.out.println(v);
//        }
//    }
//    
//    @Test
//    public void testInsertMotorista() {
//        Endereco endereco = new Endereco();
//        endereco.setCep("28306-280");
//        endereco.setLocalidade("Bandeirantes");
//        endereco.setLogradouro("Rua torta");
//        endereco.setUf("PR");
//        
//        Motorista m = new Motorista("Abreu", endereco);
//        m.setCnh("123456456");
//        m.setSecao("CARA BRAVO");
//        Dao<Motorista> dao = new Dao(Motorista.class);
//        dao.inserir(m);
//    }
//    
//    @Test
//    public void testInsertOperador() {
//        Endereco endereco = new Endereco();
//        endereco.setCep("28306-280");
//        endereco.setLocalidade("Bandeirantes");
//        endereco.setLogradouro("Rua torta");
//        endereco.setUf("PR");
//        
//        Operador o = new Operador("Mateus", endereco);
//        o.setLogin("mateuzin157");
//        o.setSenha("123matomateus");
//        Dao<Operador> dao = new Dao(Operador.class);
//        dao.inserir(o);
//    }
}
