package net.ponzmild.sbcontainerdemo.usecase;

import lombok.Data;

import java.time.LocalDate;

/**
 * Result item for GetAllAccountsResult
 */
@Data
public class GetAllAccountsResultItem {
    private Long id;
    private String name;
    private LocalDate birthday;
}
