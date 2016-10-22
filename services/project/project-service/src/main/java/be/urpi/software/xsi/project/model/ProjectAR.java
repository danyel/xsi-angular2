package be.urpi.software.xsi.project.model;

import be.urpi.software.xsi.core.model.api.AbstractBaseModel;
import lombok.*;

import javax.persistence.*;

/**
 * Created by daniel on 27/08/16.
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Table(name = "td_project", schema = "domain")
public class ProjectAR extends AbstractBaseModel {
    @Column(name = "name")
    @Access(value = AccessType.FIELD)
    private String name;

}
