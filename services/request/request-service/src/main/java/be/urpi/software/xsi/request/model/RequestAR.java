package be.urpi.software.xsi.request.model;

import be.urpi.software.xsi.core.model.api.AbstractBaseModel;
import lombok.*;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

import static javax.persistence.AccessType.FIELD;

/**
 * Created by daniel on 9/1/16.
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@EqualsAndHashCode
@Entity
@Table(schema = "domain", name = "td_request")
public class RequestAR extends AbstractBaseModel {
    @Column(name = "name")
    @Access(value = FIELD)
    private String name;
    @Column(name = "project_id")
    @Access(value = FIELD)
    private UUID project;
}
