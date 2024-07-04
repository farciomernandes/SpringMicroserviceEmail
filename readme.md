Projeto de Microserviços com Spring Boot e RabbitMQ
Este repositório contém um projeto de microserviços desenvolvido em Spring Boot, integrado com RabbitMQ para comunicação assíncrona entre os serviços User e Email. O serviço User atua como produtor, cadastrando usuários e enviando notificações para uma fila no RabbitMQ. O serviço Email age como consumidor da fila, enviando e-mails de notificação e registrando o status no banco de dados.

Passos para Execução
Configuração do Ambiente
Certifique-se de ter o Docker instalado e configurado na sua máquina.

Clonar o Repositório
bash
Copiar código
git clone <URL do repositório>
cd <nome do diretório>
Configuração do Docker Compose
Navegue até o diretório user/docker/docker-compose.

Execute o comando para iniciar os contêineres definidos no arquivo docker-compose.yml:

bash
Copiar código
docker-compose up -d
Executar os Serviços
Aguarde até que todos os serviços estejam inicializados e prontos para aceitar conexões.

Acessar os Serviços
Após a inicialização, você poderá acessar os serviços através dos endpoints definidos:

User Service: http://localhost:8080
Email Service: http://localhost:8090
Testar a Funcionalidade
Utilize ferramentas como Postman ou curl para enviar requisições para os endpoints do User Service e verifique se as mensagens são consumidas pelo Email Service.

Encerrar os Serviços
Para parar e remover os contêineres do Docker Compose, execute:

bash
Copiar código
docker-compose down
Detalhes Técnicos
Tecnologias Utilizadas
Spring Boot para desenvolvimento dos microserviços.
RabbitMQ para a comunicação assíncrona entre serviços.
Docker e Docker Compose para facilitar a configuração do ambiente de desenvolvimento.
MySQL para persistência dos dados relacionais.
Este projeto foi desenvolvido com o intuito de relembrar e aplicar conceitos de arquitetura de microserviços e integrações assíncronas utilizando Spring Boot e RabbitMQ. Para mais detalhes sobre a configuração específica de cada serviço e outras funcionalidades, consulte a documentação disponível nos respectivos diretórios.