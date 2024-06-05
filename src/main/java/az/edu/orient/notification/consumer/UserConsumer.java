package az.edu.orient.notification.consumer;

import az.edu.orient.notification.model.UserDto;
import az.edu.orient.notification.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserConsumer {

    private final MailService mailService;

    @RabbitListener(queues = "user.create.queue")
    public void handleMessage(UserDto userDto) {
        mailService.sendEmail(userDto.getEmail(), "Welcome", "Welcome "+userDto.getFirstName() + " " + userDto.getLastName());
    }
}
