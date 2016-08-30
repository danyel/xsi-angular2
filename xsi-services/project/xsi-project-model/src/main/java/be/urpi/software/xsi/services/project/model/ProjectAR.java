package be.urpi.software.xsi.services.project.model;

import be.urpi.software.xsi.core.model.api.sequence.UuidSequence;
import be.urpi.software.xsi.core.util.builder.Builder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by daniel on 27/08/16.
 */
@Entity
@Table(name = "td_project", schema = "domain")
public class ProjectAR {
    @Id
    @Column(name = "uuid", nullable = false, insertable = true, updatable = false, unique = true, length = 36)
    @Access(value = AccessType.FIELD)
    @GenericGenerator(name = "sequence_dep_id", strategy = UuidSequence.NAME)
    @GeneratedValue(generator = "sequence_dep_id")
    private UUID uuid;
    @Column(name = "name")
    @Access(value = AccessType.FIELD)
    private String name;

    private ProjectAR(ProjectBuilder projectBuilder) {
        this.name = projectBuilder.name;
    }

    public static ProjectBuilder builder() {
        return new ProjectBuilder();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public static class ProjectBuilder implements Builder<ProjectAR> {
        private String name;

        public ProjectBuilder withName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public ProjectAR build() {
            return new ProjectAR(this);
        }
    }
}
