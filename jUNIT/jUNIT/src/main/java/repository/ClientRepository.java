package repository;
import org.example.Client;
public interface ClientRepository {
    void save(Client client);

    Client findByEmail(String email);
}
