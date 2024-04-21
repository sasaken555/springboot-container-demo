package net.ponzmild.sbcontainerdemo.controller;

import java.util.List;

/**
 * Response parameters for "GetAllAccounts" use case.
 */

public record GetAllAccountsResponse(List<GetAllAccountsResponseItem> data) {
}
