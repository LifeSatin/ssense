package study.ssense.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RefreshEntity {

    @Id @GeneratedValue
    private Long id;

    private String username;
    private String refresh;
    private String expiration;

    public RefreshEntity(String username, String refresh, String expiration) {
        this.username = username;
        this.refresh = refresh;
        this.expiration = expiration;
    }

    public static RefreshEntity createRefreshEntity(String username, String refresh, String expiration) {
        return new RefreshEntity(username, refresh, expiration);
    }
}
