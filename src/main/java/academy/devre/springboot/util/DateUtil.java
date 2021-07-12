package academy.devre.springboot.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateUtil {
	public String formatLocalDateToTimeToDatabaseSytyle(LocalDateTime LocalDateTime) {
		return DateTimeFormatter.ofPattern("yyyy=MM=dd HH:mm:ss").format(LocalDateTime);
	}	
} 
