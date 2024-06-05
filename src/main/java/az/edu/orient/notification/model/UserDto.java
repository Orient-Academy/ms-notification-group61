
package az.edu.orient.notification.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
  private Long id;
  private String firstName;
  private String lastName;
  private String country;
  private String email;
}
