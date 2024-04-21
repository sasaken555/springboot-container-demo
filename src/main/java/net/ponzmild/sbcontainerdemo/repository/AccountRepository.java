package net.ponzmild.sbcontainerdemo.repository;

import net.ponzmild.sbcontainerdemo.entity.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
