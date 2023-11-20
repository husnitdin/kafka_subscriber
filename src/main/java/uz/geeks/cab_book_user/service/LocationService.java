package uz.geeks.cab_book_user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LocationService {


    @KafkaListener
    public boolean cabLocation(String location) {

        return true;
    }

}
