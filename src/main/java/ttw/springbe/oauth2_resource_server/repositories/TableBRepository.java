package ttw.springbe.oauth2_resource_server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ttw.springbe.oauth2_resource_server.entities.TableB;

@Repository
public interface TableBRepository extends JpaRepository<TableB, Integer> {
}
