package net.ponzmild.sbcontainerdemo.usecase;

import net.ponzmild.sbcontainerdemo.entity.Account;
import net.ponzmild.sbcontainerdemo.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Use case for get all accounts.
 */
@Service
public class GetAllAccountsUseCase {
    private final AccountRepository accountRepository;

    public GetAllAccountsUseCase(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public GetAllAccountsResult execute(GetAllAccountsCommand command) {
        List<GetAllAccountsResultItem> items = new ArrayList<>();

        for (Account account : accountRepository.findAll()) {
            GetAllAccountsResultItem item = new GetAllAccountsResultItem();
            item.setId(account.getId());
            item.setName(account.getName());
            item.setBirthday(account.getBirthday());
            items.add(item);
        }

        return new GetAllAccountsResult(items);
    }
}
