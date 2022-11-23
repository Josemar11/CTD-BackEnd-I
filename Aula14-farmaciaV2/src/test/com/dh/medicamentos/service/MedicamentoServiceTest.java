package test.com.dh.medicamentos.service;

import com.dh.medicamentos.dao.ConfiguracaoJDBC;
import com.dh.medicamentos.dao.impl.MedicamentoDaoH2;
import com.dh.medicamentos.model.Medicamento;
import com.dh.medicamentos.service.MedicamentoService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MedicamentoServiceTest {

    private MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfiguracaoJDBC()));

    @Test
    public void guardarMedicamento(){
        Medicamento medicamento = new Medicamento(
                "Ibuprofeno", "Aché", 395, 23.0);
        medicamentoService.salvar(medicamento);
        Assert.assertTrue(medicamento.getId() != null);

        Medicamento medicamento2 = new Medicamento(
                "Cetoconazol", "Medley", 550, 26.5);
        medicamentoService.salvar(medicamento2);
        Assert.assertTrue(medicamento2.getId() != null);

    }
    //@Test
    //public void buscarPorId(){
        //Medicamento medicamento = medicamentoService.buscar(1);
        //Assert.assertTrue(medicamento != null);
    //}
}
