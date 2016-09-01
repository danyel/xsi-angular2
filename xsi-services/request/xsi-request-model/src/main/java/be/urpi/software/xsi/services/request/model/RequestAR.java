package be.urpi.software.xsi.services.request.model;

import be.urpi.software.xsi.core.model.api.AbstractBaseModel;
import be.urpi.software.xsi.core.util.builder.Builder;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import static javax.persistence.AccessType.FIELD;

/**
 * Created by daniel on 9/1/16.
 */
@Entity
@Table(schema = "domain", name = "td_request")
public class RequestAR extends AbstractBaseModel<String> {
    @Column(name = "name")
    @Access(value = FIELD)
    private String name;
    @Column(name = "project")
    @Access(value = FIELD)
    private String project;

    protected RequestAR() {
    }

    public RequestAR(RequestBuilder requestBuilder) {
        this();
        this.name = requestBuilder.name;
        this.project = requestBuilder.project;
    }

    public static RequestBuilder builder() {
        return new RequestBuilder();
    }

    public String getName() {
        return name;
    }

    public String getProject() {
        return project;
    }

    public static class RequestBuilder implements Builder<RequestAR> {
        private String name;
        private String project;

        public RequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public RequestBuilder withProject(String project) {
            this.project = project;
            return this;
        }

        @Override
        public RequestAR build() {
            return new RequestAR(this);
        }
    }
}
