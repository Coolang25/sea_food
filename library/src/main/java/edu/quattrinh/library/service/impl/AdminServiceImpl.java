package edu.quattrinh.library.service.impl;

import edu.quattrinh.library.dto.AdminDto;
import edu.quattrinh.library.model.Admin;
import edu.quattrinh.library.repository.AdminRepository;
import edu.quattrinh.library.repository.RoleRepository;
import edu.quattrinh.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public Admin save(AdminDto adminDto) {
        Admin admin = new Admin();
        admin.setFirstName(adminDto.getFirstName());
        admin.setLastName(adminDto.getLastName());
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles(Arrays.asList(roleRepository.findByName("ADMIN")));
        return adminRepository.save(admin);
    }

//    @Override
//    public void delete(Long id) {
//        adminRepository.deleteById(id);
//    }
}
