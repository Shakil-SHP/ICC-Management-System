package com.shakil.model;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Attachment extends BaseModel implements Serializable {

    private String fileName;
    private String fileTitle;
    private String fileURL;
    private String fileType;

}