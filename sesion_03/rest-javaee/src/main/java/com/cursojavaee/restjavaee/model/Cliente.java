package com.cursojavaee.restjavaee.model;

import com.cursojavaee.restjavaee.annotation.SerialNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Cliente implements Serializable {
    private String nombre;
    @Min(value = 18, message = "Mínima edad requerida 18")
    @Max(50)
    private Integer edad;

    @SerialNumber
    private String serial;
}
