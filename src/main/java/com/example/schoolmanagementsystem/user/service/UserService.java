package com.example.schoolmanagementsystem.user.service;
import com.example.schoolmanagementsystem.common.exception.EmailAlreadyExistsException;
import com.example.schoolmanagementsystem.user.dto.RegisterRequest;
import com.example.schoolmanagementsystem.user.entity.User;
import com.example.schoolmanagementsystem.user.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Locale;


//write my logic

@Service
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
                this.passwordEncoder = passwordEncoder;


    }


    @Transactional
    public User register(
            RegisterRequest request)

    {
//        Normalize email
        String normalizedEmail = request.email().trim().toLowerCase(Locale.ROOT);


//        check if email exist
        if (userRepository.existsByEmail(normalizedEmail)){
            throw new EmailAlreadyExistsException("An account with this email already exist");
        }

    // 3. Hash the password
    String passwordHash = passwordEncoder.encode(request.password());


        // 4. Create the user
        User user = new User(
                request.firstName().trim(),
                request.lastName().trim(),
                normalizedEmail,
                passwordHash
        );


        // 5. Save the user
        return userRepository.save(user);
    }
}
