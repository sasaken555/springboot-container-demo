package net.ponzmild.sbcontainerdemo.controller;

import java.time.LocalDate;

/**
 * Response parameter item for "GetAllAccounts" use case.
 */
public record GetAllAccountsResponseItem(Long accountId, String accountName, LocalDate birthday) {
}
