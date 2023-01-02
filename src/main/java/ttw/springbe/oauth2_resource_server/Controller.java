package ttw.springbe.oauth2_resource_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ttw.springbe.oauth2_resource_server.services.TableAService;
import ttw.springbe.oauth2_resource_server.services.TableBService;

@RestController
@RequestMapping("/api")
public class Controller {
    
    @Autowired
    private TableAService tableAService;
	@Autowired
	private TableBService tableBService;

	@GetMapping(value="/get-data-a")
	public ResponseEntity<Object> getAllDataA() {
		return new ResponseEntity<>(tableAService.getAll(), HttpStatus.OK);
	}

	@GetMapping(value="/get-data-b")
	public ResponseEntity<Object> getAllDataB() {
		return new ResponseEntity<>(tableBService.getAll(), HttpStatus.OK);
	}
}
