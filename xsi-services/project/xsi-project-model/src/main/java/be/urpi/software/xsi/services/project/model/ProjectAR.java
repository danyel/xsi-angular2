package be.urpi.software.xsi.services.project.model;

import be.urpi.software.xsi.core.model.api.AbstractBaseModel;
import be.urpi.software.xsi.core.util.builder.Builder;

import javax.persistence.*;

/**
 * Created by daniel on 27/08/16.
 */
@Entity
@Table(name = "td_project", schema = "domain")
public class ProjectAR extends AbstractBaseModel {
    @Column(name = "name")
    @Access(value = AccessType.FIELD)
    private String name;

    private ProjectAR(ProjectBuilder projectBuilder) {
        this.name = projectBuilder.name;
    }

    public static ProjectBuilder builder() {
        return new ProjectBuilder();
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
