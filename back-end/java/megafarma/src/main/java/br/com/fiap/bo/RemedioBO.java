package br.com.fiap.bo;

import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioBO {
    // Atributo
    private RemedioDAO remedioDAO;

    public ArrayList<RemedioTO> findAll() {
        remedioDAO = new RemedioDAO();
        // Aqui se implementa as regras de negócio
        return remedioDAO.findAll();
    }

    public RemedioTO save(RemedioTO remedio) {
        remedioDAO = new RemedioDAO();
        // Regras de negócio
        // Verificando se o remédio está vencido
        if (remedio.getDataDeValidade().isBefore(LocalDate.now())) {
            return null;
        }
        return remedioDAO.save(remedio);
    }
}
