# AL : Microservices architecture

A rendre avan 18/1 23h59m59s

1 Point de penalité / jour de retard

Indiquez "Projet Fini" sur le .md

Envoyez le dépot au dépôt aux encadrants (Gitlab ISTIC) en Dev/Maintainer
- Ptemple
- wrundametkini

```mermaid
graph TB;
    user(User)
    front[Frontend
            ANGULAR];
    ws(HTTP Web Server
            NGINX);
    back[Backend
            NodeJS];
    data[(Database
            MySQL)];
    mom[(MOM
        RabbitMQ)];
    notif[Notification
            Quarkus/GraalVM];
    mail[Server Mail
        MailDev];

    user --80 : HTTP--> front;
    front --80 : HTTP--> ws;
    front--8080 : HTTP-->user;
    ws --80 : HTTP--> front;
    ws --3000 : HTTP--> back;
    back --80 : HTTP--> ws;
    back --3306 : TCP--> data;
    data --3000 : HTTP--> back;
    back --5672 : AMQP --> mom;
    mom --PORT : PROTOCOL--> notif;
    notif --25 : SMPT--> mail;
    mail --25 : SMTP--> user;
```

