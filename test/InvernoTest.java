import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvernoTest {

    @Test
    public void seRetornamTodosFelizesQuandoTemperaturaDesceDoPrimeiroParaOSegundoDiaESobeNoTerceiroDia(){
        int temperaturaDia1 = 20;
        int temperaturaDia2 = 10;
        int temperaturaDia3 = 12;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":)", valorRetornado);
    }
    @Test
    public void seRetornamTodosFelizesQuandoTemperaturaDesceDoPrimeiroParaOSegundoDiaEPermaneceNoTerceiroDia(){
        int temperaturaDia1 = 20;
        int temperaturaDia2 = 10;
        int temperaturaDia3 = 10;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":)", valorRetornado);
    }
    @Test
    public void seRetornamTodosTristesQuandoTemperaturaSobeDoPrimeiroParaOSegundoDiaMasDesceDoSegundoParaOTerceiro() {
        int temperaturaDia1 = 10;
        int temperaturaDia2 = 20;
        int temperaturaDia3 = 18;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":(", valorRetornado);
    }
    @Test
    public void seRetornamTodosTristesQuandoTemperaturaSobeDoPrimeiroParaOSegundoDiaMasPermaneceConstanteDoSegundoParaOTerceiro() {
        int temperaturaDia1 = 10;
        int temperaturaDia2 = 20;
        int temperaturaDia3 = 20;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":(", valorRetornado);
    }
    @Test
    public void seRetornamTodosTristesQuandoTemperaturaSobeDoPrimeiroParaOSegundoDiaEDoSegundoParaOTerceiroDia() {
        int temperaturaDia1 = 10;
        int temperaturaDia2 = 20;
        int temperaturaDia3 = 30;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":(", valorRetornado);
    }

    @Test
    public void seRetornamTodosTristesSeATemperarturaSubiuDoSegundoParaOTerceiroDiaMenosQueDoPrimeiroParaOSegundo(){
        int temperaturaDia1 = 10;
        int temperaturaDia2 = 20;
        int temperaturaDia3 = 25;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":(", valorRetornado);
    }

    @Test
    public void SeRetornamFelizesSeDesceuDoPrimeiroParaOSegundoEDoSegundoParaOTerceiro(){
        int temperaturaDia1 = 30;
        int temperaturaDia2 = 25    ;
        int temperaturaDia3 = 20;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":)", valorRetornado);
    }

    @Test
    public void seRetornamTodosFelizesSeATemperarturaDesceuDoSegundoParaOTerceiroDiaMenosQueDoPrimeiroParaOSegundo(){
        int temperaturaDia1 = 30;
        int temperaturaDia2 = 25;
        int temperaturaDia3 = 24;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":)", valorRetornado);
    }

    @Test
    public void seRetornamTodosFelizesSeATemperarturaPermaneceuDoPrimeiroParaOSegundoDiaESubiuNoTerceiroDia(){
        int temperaturaDia1 = 20;
        int temperaturaDia2 = 20    ;
        int temperaturaDia3 = 25;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":)", valorRetornado);
    }

    @Test
    public void seRetornamTodosTristesSeATemperarturaPermaneceuDoPrimeiroParaOSegundoDiaEDesceuNoTerceiroDia(){
        int temperaturaDia1 = 30;
        int temperaturaDia2 = 30    ;
        int temperaturaDia3 = 25;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":(", valorRetornado);
    }
    @Test
    public void seRetornamTodosTristesSeATemperarturaSubiuDoSegundoParaOTerceiroMenosDoQueSubiuDoPrimeiroParaOSegundo(){
        int temperaturaDia1 = 30;
        int temperaturaDia2 = 35;
        int temperaturaDia3 = 36;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":(", valorRetornado);
    }
    @Test
    public void seRetornamTodosFelizesSeATemperarturaSubiuDoSegundoParaOTerceiroMaisDoQueSubiuDoPrimeiroParaOSegundo(){
        int temperaturaDia1 = 30;
        int temperaturaDia2 = 35;
        int temperaturaDia3 = 41;
        Inverno inverno = new Inverno(temperaturaDia1, temperaturaDia2, temperaturaDia3);
        String valorRetornado = inverno.definirOHumorDasPessoas();
        assertEquals(":)", valorRetornado);
    }


}

