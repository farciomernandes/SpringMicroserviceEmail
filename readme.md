Este repositório contém um projeto de microserviços desenvolvido em Spring Boot, integrado com RabbitMQ para comunicação assíncrona entre os serviços User e Email. 
- O serviço User atua como produtor, cadastrando usuários e enviando notificações para uma fila no RabbitMQ.
- O serviço Email age como consumidor da fila, enviando e-mails de notificação e registrando o status no banco de dados.

Detalhes Técnicos

- Spring Boot para desenvolvimento dos microserviços.
- RabbitMQ e CloudAMQP para a comunicação assíncrona entre serviços.
- Docker e Docker Compose para facilitar a configuração do banco de dados.
- PostgreSQL para persistência dos dados relacionais.
- SMTP Gmail para envio de emails.

  
Este projeto foi desenvolvido com o intuito de relembrar e aplicar conceitos de arquitetura de microserviços e integrações assíncronas utilizando Spring Boot e RabbitMQ. Para mais detalhes sobre a configuração específica de cada serviço e outras funcionalidades, consulte a documentação disponível nos respectivos diretórios.
