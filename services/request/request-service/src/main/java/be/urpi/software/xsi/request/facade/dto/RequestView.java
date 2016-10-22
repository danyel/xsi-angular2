package be.urpi.software.xsi.request.facade.dto;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by daniel on 15/09/16.
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
@EqualsAndHashCode
public class RequestView implements Serializable {
    private UUID uuid;
    private String projectName;
    private String requestName;
}
