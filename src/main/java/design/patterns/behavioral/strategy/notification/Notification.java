package design.patterns.behavioral.strategy.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Notification {
    private String category;
    private String content;
    private String iconPath;
    private boolean isHighPriority;
    private String title;
}
