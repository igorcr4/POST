package repository;

import models.Volunteers;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CharityRepository {
    private List<Volunteers> volunteer = new ArrayList<>();

    public Volunteers findByFullName(String fullName) {
        for (Volunteers voluntar : volunteer) {
            if (fullName.equals(voluntar.getFullName())) {
                return voluntar;
            }
        }
        return null;
    }

    public void deleteByFullName(String fullName) {
        for (Volunteers voluntar : volunteer) {
            if (fullName.equals(voluntar.getFullName())) {
                volunteer.remove(voluntar);
            }
        }
    }

    public Volunteers save(Volunteers voluntar) {
        volunteer.add(voluntar);
        return voluntar;
    }

    public List<Volunteers> findAll() {
        return volunteer;
    }
}
