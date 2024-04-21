package net.ponzmild.sbcontainerdemo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * User entity
 */
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE, onConstructor = @__(@PersistenceCreator))
public class Account {
    @Id
    @With
    private final Long id;
    private String name;
    private LocalDate birthday;
    private LocalDateTime createdAt;

    /**
     * Constructor for new entity.
     *
     * @param name     User name
     * @param birthday User birthday YYYY-MM-DD
     */
    public Account(String name, LocalDate birthday) {
        this.id = null;
        this.name = name;
        this.birthday = birthday;
        this.createdAt = LocalDateTime.now();
    }
}
