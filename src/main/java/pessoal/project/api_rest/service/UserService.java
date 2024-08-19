package pessoal.project.api_rest.service;

import pessoal.project.api_rest.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
