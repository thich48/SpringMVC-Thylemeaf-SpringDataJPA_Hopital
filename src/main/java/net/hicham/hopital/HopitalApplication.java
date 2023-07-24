package net.hicham.hopital;

import net.hicham.hopital.entities.Patient;
import net.hicham.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(Patient.builder()
                .nom("Toto")
                .dateNaissance(new Date())
                .score(56)
                .malade(true)
                .build());
        patientRepository.save(Patient.builder()
                .nom("Frank")
                .dateNaissance(new Date())
                .score(75)
                .malade(false)
                .build());
        patientRepository.save(Patient.builder()
                .nom("Hugo")
                .dateNaissance(new Date())
                .score(27)
                .malade(true)
                .build());
        patientRepository.save(Patient.builder()
                .nom("Frederic")
                .dateNaissance(new Date())
                .score(51)
                .malade(true)
                .build());
    }
}
