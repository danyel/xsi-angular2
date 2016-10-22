package be.urpi.software.xsi.project.facade.dto;

import lombok.*;

import java.io.Serializable;

/**
 * Created by daniel on 15/09/16.
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Project implements Serializable {
    private String uuid;
    private String name;
}
