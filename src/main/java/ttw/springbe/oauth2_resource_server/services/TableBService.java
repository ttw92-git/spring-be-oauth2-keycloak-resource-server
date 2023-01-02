package ttw.springbe.oauth2_resource_server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ttw.springbe.oauth2_resource_server.entities.TableB;
import ttw.springbe.oauth2_resource_server.repositories.TableBRepository;

import java.util.List;

@Service
public class TableBService {

    @Autowired
    private TableBRepository tableBRepository;

    public List<TableB> getAll() {
        return tableBRepository.findAll();
    }
}
