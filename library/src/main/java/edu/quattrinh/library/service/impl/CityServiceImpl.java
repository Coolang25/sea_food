package edu.quattrinh.library.service.impl;

import edu.quattrinh.library.model.City;
import edu.quattrinh.library.repository.CityRepository;
import edu.quattrinh.library.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
