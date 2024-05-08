package edu.quattrinh.library.service;

import edu.quattrinh.library.dto.AdminDto;
import edu.quattrinh.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);

//    void delete(Long id);
}
