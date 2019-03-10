package pl.sda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pmatusiak
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private String lastName;
    private int index;
}
