package tn.esprit.pidev.RestControllers.AuthController.Param;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PasswordResetUtil {
    private String login;
    private String newPassword;
    private String token;
    private String confirmPassword;
}