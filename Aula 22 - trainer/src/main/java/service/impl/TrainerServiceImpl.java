package service.impl;

import model.Trainer;
import org.springframework.stereotype.Service;
import service.TrainerService;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {


    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Diogo"), new Trainer("Angel"));

    }
}
