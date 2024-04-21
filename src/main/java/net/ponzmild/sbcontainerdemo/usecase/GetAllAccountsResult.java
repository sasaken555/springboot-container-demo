package net.ponzmild.sbcontainerdemo.usecase;

import java.util.List;

/**
 * Result object for "GetAllAccounts" use case.
 */
public record GetAllAccountsResult(List<GetAllAccountsResultItem> items) {
}
