package ro.mint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.mint.model.User;
import ro.mint.repo.MintRepository;

@Service
public class MintServiceImpl implements MintService {

    @Autowired
    MintRepository repository;

    @Override
    public void saveUser(User user){
        repository.save(user);
    }


}
