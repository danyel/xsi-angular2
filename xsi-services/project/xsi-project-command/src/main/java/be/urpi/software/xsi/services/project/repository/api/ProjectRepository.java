package be.urpi.software.xsi.services.project.repository.api;

import be.urpi.software.xsi.services.project.model.ProjectAR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by daniel on 27/08/16.
 */
@Repository
public interface ProjectRepository extends JpaRepository<ProjectAR, String> {
}
