package pl.sda.springdemo.repository;

import org.springframework.stereotype.Component;
import pl.sda.springdemo.model.Offer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class OffersRepository {

    private List<Offer> offers = new ArrayList<>();

    public Offer save(Offer offer) {
        offer.setId(UUID.randomUUID().toString());
        offers.add(offer);
        saveToFile();
        return offer;
    }

    public void saveToFile() {
        Path filePath = Paths.get("src/main/resources","", "base.txt");
        try {
            Files.writeString(filePath, offers.toString() + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}