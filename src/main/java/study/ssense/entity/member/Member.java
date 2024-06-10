package study.ssense.entity.member;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.EnumType.*;
import static lombok.AccessLevel.*;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private long id;

    private String username;

    private String password;

    private String role;

    @Embedded
    private Name name;

    @Embedded
    private Address address;

    public Member(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = "USER";
    }

    public static Member createJoinMember(String username, String password) {
        return new Member(username, password, "USER");
    }

    public static Member tempSessionMember(String username, String role) {
        return new Member(username, null, role);
    }
}
