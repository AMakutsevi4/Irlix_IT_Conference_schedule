package ru.irlix_it_conference_schedule.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Расписание IT конференций demo",
                description = "Приложение предоставляет возможность создавать аудитории " +
                        "и создавать в них доклады.", version = "1.0.0",
                contact = @Contact(
                        name = "Александр Макуцевич",
                        email = "amakutsevich@bk.ru",
                        url = "https://amakutsevich@bk.ru"
                )
        )
)
public class OpenApiConfig {
}
