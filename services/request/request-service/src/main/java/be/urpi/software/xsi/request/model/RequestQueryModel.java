package be.urpi.software.xsi.request.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * Created by daniel on 14/09/16.
 */
@Entity
@Table(name = "vw_requests", schema = "query")
public class RequestQueryModel implements Serializable{
    @Id
    @Column(name = "req_id")
    @Access(AccessType.FIELD)
    private UUID uuid;
    @Column(name = "proj_name")
    @Access(AccessType.FIELD)
    private String projectName;
    @Column(name = "req_name")
    @Access(AccessType.FIELD)
    private String requestName;

    public UUID getUuid() {
        return uuid;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getRequestName() {
        return requestName;
    }
}
