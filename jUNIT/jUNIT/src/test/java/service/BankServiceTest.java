package service;

import org.assertj.core.api.SoftAssertions;
import org.example.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.InMemoryClientRepository;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class BankServiceTest {
    public static final String CLIENT_1_MAIL = "a@a.pl";
    public static final int CLIENT_1_BALANCE = 1000;
    public static final Client CLIENT_FROM = new Client("Alek", CLIENT_1_MAIL, CLIENT_1_BALANCE);
    public static final String CLIENT_2_MAIL = "b@b.pl";
    public static final int CLIENT_2_BALANCE = 500;
    public static final Client CLIENT_TO = new Client("Bartek", CLIENT_2_MAIL, CLIENT_2_BALANCE);
    private BankService service;
private List<Client> clients;

    @BeforeEach
    public void setup() {
        clients = new LinkedList<>();
        clients.add(CLIENT_FROM);
        clients.add(CLIENT_TO);
        service = new BankService(new InMemoryClientRepository(clients));

    }


    @Test
    public void transfer_allParamsOk_fundsTransferred(){
        //given
        String emailFrom = CLIENT_1_MAIL;
        String emailTo = CLIENT_2_MAIL;
        final double ammount = 100;
        //when
        service.transfer(emailFrom,emailTo,ammount);
        //then
        final Client actualFromClient = service.findByEmail(emailFrom);
        final Client actualToClient = service.findByEmail(emailTo);
        final Client expectedClientFrom = new Client("Alek", emailFrom,900);
        final Client expectedClientTo = new Client("Bartek", emailTo, 600);

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(expectedClientFrom)
                        .isEqualTo(actualFromClient);
        softAssertions.assertThat(expectedClientTo)
                .isEqualTo(actualToClient);

        softAssertions.assertAll();



    }

    @Test
    public void transfer_allFunds_fundsTransferred(){
        //given
        String emailFrom = CLIENT_1_MAIL;
        String emailTo = CLIENT_2_MAIL;
        final double ammount=CLIENT_1_BALANCE;
        //when
        service.transfer(emailFrom,emailTo,ammount);
        //then
        final Client actualFromClient = service.findByEmail(emailFrom);
        final Client actualToClient = service.findByEmail(emailTo);
        final Client expectedClientFrom = new Client("Alek", emailFrom,0);
        final Client expectedClientTo = new Client("Bartek", emailTo, 1500);

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(expectedClientFrom)
                .isEqualTo(actualFromClient);
        softAssertions.assertThat(expectedClientTo)
                .isEqualTo(actualToClient);

        softAssertions.assertAll();


    }

}
