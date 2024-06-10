package study.ssense.entity.member;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.*;

@Embeddable
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor
public class Name {
    private String first_name;
    private String last_name;
}
