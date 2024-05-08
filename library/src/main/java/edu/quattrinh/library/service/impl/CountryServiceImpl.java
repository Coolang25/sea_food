package edu.quattrinh.library.service.impl;

import edu.quattrinh.library.model.Country;
import edu.quattrinh.library.repository.CountryRepository;
import edu.quattrinh.library.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
