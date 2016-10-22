package be.urpi.software.xsi.user.model;

import be.urpi.software.xsi.core.model.api.AbstractBaseModel;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by daniel on 15/09/16.
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Entity
@Table(name = "td_role", schema = "domain")
public class Role extends AbstractBaseModel implements GrantedAuthority {
    @Column
    private String authority;
}
