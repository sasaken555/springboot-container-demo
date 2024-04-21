package net.ponzmild.sbcontainerdemo.controller;

import net.ponzmild.sbcontainerdemo.usecase.GetAllAccountsCommand;
import net.ponzmild.sbcontainerdemo.usecase.GetAllAccountsResult;
import net.ponzmild.sbcontainerdemo.usecase.GetAllAccountsResultItem;
import net.ponzmild.sbcontainerdemo.usecase.GetAllAccountsUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * REST API controller to handle accounts
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final GetAllAccountsUseCase getAllAccountsUseCase;

    public AccountController(GetAllAccountsUseCase getAllAccountsUseCase) {
        this.getAllAccountsUseCase = getAllAccountsUseCase;
    }

    @GetMapping()
    public GetAllAccountsResponse getAllUsers() {
        // Execute use case
        GetAllAccountsCommand command = new GetAllAccountsCommand();
        GetAllAccountsResult result = getAllAccountsUseCase.execute(command);

        // Build response
        List<GetAllAccountsResponseItem> data = new ArrayList<>();
        for (GetAllAccountsResultItem item : result.items()) {
            GetAllAccountsResponseItem datum = new GetAllAccountsResponseItem(item.getId(), item.getName(), item.getBirthday());
            data.add(datum);
        }
        return new GetAllAccountsResponse(data);
    }
}
