# About

##### Backend and CRUD REST API application uses Database(H2) and Spring Boot. 

##### Additionally application has frontend written in Thymeleaf. 


* renting and returning movies
* calculating the cost of rented movies
* HTML view written using Thymeleaf
* download rental history
* calculating average movie rating
* adding movies to the database
* application tests

## Technologies

* Java8
* Spring Boot
* Hibernate
* REST API
* Lombok
* H2
* Git
* Gradle
* Docker
* HTML
* CSS
* Thymeleaf


# Run from source

## Build and create package
```
gradle build
```
## Run image
```
java -jar build/libs/rental-1.0.jar
```

# Docker

## How to run with docker
Pull image from dockerHub and run it
```
docker pull ziembatomasz/rental:1.0
docker run -p 8080:8080 ziembatomasz/rental:1.0
```
Open in browser:
```
http://localhost:8080
```

## How to build docker image
```
docker build -t ziembatomasz/rental:1.0 .
```

---------------------------------------------------

 Teria como me justifica pprojetos que utilize springboot e tenha minima arquitetura além de ser opersource.

    Pergunta respondida com sucesso

🧐 Justificativa para Projetos Spring Boot Open Source com Arquitetura Mínima

Para o Trabalho 2: Verificação e Validação de Software, que exige a aplicação de diferentes tipos de testes a um sistema de informação de complexidade média ou superior , um projeto open source construído com Spring Boot e que possua uma arquitetura mínima (além de operações CRUD simples ) é uma escolha altamente justificável e adequada ao objetivo do trabalho.

🚀 Adequação aos Requisitos do Trabalho

A escolha de um projeto com essas características atende diretamente a vários critérios do trabalho:

    Complexidade Média ou Superior e Regras de Negócio: O requisito principal é evitar sistemas compostos somente de operações sobre dados do tipo CRUD, exigindo alguma regra de negócio adicional. O Spring Boot, sendo um framework amplamente usado para aplicações corporativas e sistemas comerciais (como loja on-line, aluguel, contas bancárias, que são os arquétipos sugeridos ), naturalmente impulsiona a implementação de lógica de negócios mais complexa. Um projeto que vai além do CRUD simples (como um sistema de gerenciamento de pedidos com cálculo de frete ou um sistema bancário com lógica de transação) atende perfeitamente a essa exigência.

Identificação de Tipos de Testes e Implementação de Níveis:

    Um projeto com arquitetura mínima bem definida (por exemplo, camadas de controlador, serviço e repositório) facilita a identificação e análise de testes já existentes.

Essa estrutura arquitetural também é ideal para a implementação dos três níveis de teste exigidos: unitário (focado na camada de serviço/negócio), de integração (testando a comunicação entre camadas ou com o banco de dados) e de sistema (testando a jornada do usuário completa).

Ambiente de Teste: O ecossistema do Spring Boot (incluindo Spring Test, JUnit 5, e ferramentas como Testcontainers) oferece frameworks robustos e amplamente documentados , facilitando a implementação de testes de alta qualidade, conforme as técnicas trabalhadas na disciplina.

🛡️ Benefícios do Open Source e Spring Boot

    Acesso e Reprodução (Open Source): Sendo um repositório de código público , o grupo garante o acesso fácil ao código-fonte, o que é um requisito para a Etapa 1 , e facilita a demonstração no vídeo de execução.

Tecnologia Padrão de Mercado (Spring Boot): O uso de Spring Boot aumenta a relevância acadêmica do trabalho, pois o grupo estará aplicando as técnicas de Verificação e Validação em uma tecnologia mainstream, garantindo que o aprendizado seja diretamente aplicável ao mercado de trabalho.

Foco em Testes (Arquitetura): Uma arquitetura minimamente organizada (seguindo padrões como MVC ou Clean Architecture) isola a lógica de negócio das preocupações de infraestrutura. Isso torna as regras de negócio (o foco dos testes unitários e de integração) mais claras e mais fáceis de testar de forma isolada e eficiente, o que é crucial para o projeto de casos de teste.

Em suma, um sistema Spring Boot open source com arquitetura clara e regras de negócio válidas não só satisfaz os requisitos de complexidade, mas também fornece o ambiente ideal para demonstrar a aplicação das técnicas de teste nos níveis unitário, de integração e de sistema, conforme solicitado pelo trabalho.

Gostaria que eu pesquisasse alguns exemplos de repositórios open source Spring Boot que se encaixem no critério de complexidade média (como um arquétipo de loja on-line ou sistema de aluguel) para sua Etapa 1?

Teria como indicar para mim ?

Com certeza! Com base na solicitação de um projeto open source Spring Boot que se enquadre nos critérios de um sistema comercial de complexidade média (que não seja CRUD simples e nem o Pet Clinic), aqui estão algumas sugestões de arquétipos comuns que você pode pesquisar no GitHub:

💡 Sugestões de Arquétipos de Sistemas Spring Boot

Arquétipo (Tipo de Sistema Comercial)	Complexidade Esperada e Regras de Negócio	Sugestão de Termos de Busca (GitHub)

Loja Virtual / E-commerce

	Gestão de estoque, cálculo de frete, processamento de pedidos (status: pendente, enviado, entregue), histórico de compras, autenticação de usuário.	spring boot ecommerce, spring boot store, online shop

Sistema de Aluguel (Carros/Imóveis)

	Disponibilidade de itens por data, reserva (bloqueio), cálculo de preço por período, gerenciamento de contratos, lógica de devolução e multas.	spring boot car rental, spring boot booking system, spring boot real estate

Gerenciamento de Contas Bancárias

	Operações de depósito/saque, transferência entre contas, cálculo de saldo, extrato (histórico), limites de transação. (Mais complexo devido à natureza transacional)	spring boot bank account, spring boot transactions, digital bank
Sistema de Gerenciamento de Projetos	Criação e atribuição de tarefas, alteração de status, cálculo de deadlines, permissões de acesso (perfis de usuário), histórico de atividades.	spring boot project management, task management spring boot

🔍 Dicas para a Busca e Escolha (Etapa 1)

Ao pesquisar um repositório, utilize os termos acima no GitHub e filtre pelos seguintes critérios para garantir que o projeto é adequado:

    Linguagem: Confirme que a linguagem é Java (ou outra compatível com o ecossistema Spring Boot).

Framework: Procure por projetos que usem o Spring Boot.

Arquitetura/Complexidade:

    Verifique a estrutura de pastas: Procure por classes separadas como *Controller, *Service, e *Repository. Isso indica a arquitetura mínima de camadas necessária para aplicar os diferentes níveis de teste.

Procure por testes existentes: Veja se o projeto já possui testes (pasta src/test). Isso é ótimo, pois você precisará analisar criticamente a qualidade deles.

    Licença Open Source: Certifique-se de que o repositório seja público e tenha uma licença clara.

⚠️ Próximo Passo Importante

Lembre-se que o sistema escolhido deve ser validado junto ao professor e que não serão aceitos grupos com o mesmo sistema. O critério de desempate é a data de postagem da escolha no fórum do Moodle.

Após encontrar um ou dois candidatos que parecem promissores, você gostaria que eu procurasse o código-fonte de um repositório real no GitHub que se encaixe no arquétipo de "Loja Virtual" para te dar um exemplo mais concreto?

Teria como indicar repos do github que tenham isso ?

Excelente! A busca no GitHub confirmou que há muitos projetos Spring Boot open source que se encaixam nos critérios de um sistema comercial de complexidade média.

Aqui estão algumas sugestões de repositórios reais no GitHub, categorizados pelos arquétipos que melhor se adequam ao seu trabalho:

1. 🛒 E-commerce / Loja Virtual (Alta Complexidade de Jornada)

Projetos de E-commerce são ótimos, pois envolvem muitas regras de negócio: gerenciamento de estoque, cálculo de pedidos, autenticação de usuários, etc. Isso permite uma jornada do usuário complexa para testar.
Repositório Sugerido	Descrição e Por que é Adequado	Foco para Teste (Jornada)
berkaybarisalgun/ShopmeEcommerce	Projeto de loja virtual completo com recursos administrativos (usuários, categorias, marcas, produtos, pedidos). Utiliza Spring Data JPA e Spring Security.	Uma "Jornada de Usuário" complexa seria: "Adicionar ao Carrinho, Cálculo de Frete e Finalização do Pedido (Checkout)".
hendisantika/spring-boot-ecommerce	Uma aplicação e-commerce mais simples, mas que inclui catálogo de produtos, carrinho de compras, wishlist e Admin Dashboard. Menciona o uso de Testcontainers para testes de integração de banco de dados, o que é um ponto positivo para a sua análise crítica.	A jornada de "Gerenciamento de Estoque e Venda de Produto" pode ser interessante, focando na lógica que diminui o estoque após a compra.
micaellobo/e-commerce-store	Este é um projeto de microsserviços (Order Service, Review Service, Notification Service). É mais complexo, mas já utiliza JUnit, Mockito e TestContainers e menciona Testes Unitários e de Integração.	Se o seu grupo se sentir à vontade, testar a integração entre dois microsserviços (ex: Pedido e Estoque) seria um excelente e avançado caso de teste de integração.

2. 🏦 Sistema Bancário / Transacional (Alta Complexidade de Regras)

Sistemas bancários exigem regras de negócio rigorosas para transações (transferências, saldos), o que elimina a classificação de CRUD simples.
Repositório Sugerido	Descrição e Por que é Adequado	Foco para Teste (Jornada)
ryhan000/Online-Banking-System	Sistema bancário com módulos de User Signup/Login, Conta, Transferência, Agendamento e Transação. A lógica de transferência e cálculo de saldo requer testes unitários e de integração complexos.	Uma "Jornada de Usuário" ideal: "Transferência de Fundos entre Duas Contas e Verificação do Saldo Final". Isso exige testes unitários na lógica de transação e testes de integração com o banco de dados.
kartik1502/Spring-Boot-Microservices-Banking-Application	Outro projeto baseado em microsserviços (User Service, Account Service, Fund Transfer Service) que trata de registro de usuário, gerenciamento de conta e transferência de fundos.	Ótimo para testar a Transferência (Fund Transfer Service), garantindo que o débito de uma conta e o crédito na outra ocorram de forma atômica.

🚨 Passos Imediatos para o Seu Grupo

    Escolha do Repositório: Escolha um desses repositórios (ou encontre um similar usando os termos de busca) que seja mais fácil de compilar e rodar localmente.

    Validação: Poste a indicação do repositório no fórum do Moodle para a Etapa 1 (06/11/2025). Lembre-se, a data de postagem é o critério de desempate para evitar que outro grupo escolha o mesmo sistema.

Você gostaria de um passo a passo para analisar a qualidade dos testes já existentes no repositório que você escolher, para a Etapa 2 do seu trabalho?

Poderia sugerir outros tipos de assuntos de projeto e tente achar um que tenha as caracteristicas que eu te pedi e tenha tests

🗺️ Sugestões Adicionais de Arquétipos de Projeto

Com certeza! Além de E-commerce e Sistemas Bancários, existem outros arquétipos de sistemas comerciais de complexidade média que se encaixam perfeitamente nos requisitos do seu trabalho, especialmente aqueles que envolvem lógica de agendamento, restrições e regras de validação complexas.
Arquétipo (Tipo de Sistema Comercial)	Complexidade Esperada e Regras de Negócio	Foco para Teste (Jornada)
Sistema de Agendamento (Clínica/Serviços)	Gerenciamento de múltiplos recursos (médicos, salas, técnicos), verificação de conflito de horários (disponibilidade), confirmação e cancelamento de agendamentos.	"Agendar um Serviço com Restrição de Disponibilidade": Teste unitário na lógica de conflito e teste de sistema na interface de agendamento.
Sistema de Leilão Online	Lógica de lances (bidding) (lance mínimo, lance máximo), validação de usuário (apenas usuários autenticados podem dar lances), encerramento do leilão e notificação do vencedor.	"Processamento de Lance Vencedor": Testar as regras que definem o lance vencedor e a transição do status do item.
Sistema de Gerenciamento de Hotéis (PMS)	Reserva de quartos, gerenciamento de ocupação, cálculo de tarifas (com base em estação ou promoções), check-in/check-out.	"Reserva de Quarto com Aplicação de Desconto": Testar a regra de negócio que calcula o valor final da reserva com base em diferentes critérios.

🔎 Repositório Sugerido com Testes Existentes

Encontrei um repositório que se encaixa bem no arquétipo de Agendamento e que já possui testes implementados, o que é crucial para a sua primeira tarefa na Etapa 2 (Análise Crítica dos Testes Existentes).

📅 Booking System / Sistema de Agendamento de Serviços

Repositório Sugerido (GitHub)	Descrição e Por que é Adequado	Testes Existentes
milan-bozic/spring-boot-fullstack-booking-system	

Um sistema de agendamento (booking system) fullstack que envolve agendamento de serviços, gerenciamento de vagas/horários e autenticação. A lógica de disponibilidade e conflito de horários garante a complexidade mínima exigida.

	Sim. O repositório utiliza JUnit e Mockito e possui testes unitários e de integração implementados para as principais classes de serviço, como a lógica de agendamento e a validação de usuário.
Tecnologias	Spring Boot, Thymeleaf (Front-end), MySQL, Spring Security.	O uso de Mockito (para mocks) e JUnit (para testes) é um ótimo ponto de partida para a sua análise e para a implementação de casos de teste adicionais.

✅ Como Este Projeto Atende aos Seus Requisitos

    Arquétipo Comercial: É um sistema de agendamento, comum em serviços e clínicas.

    Complexidade: Vai além do CRUD. Envolve regras de negócio como:

        Verificação se o recurso (pessoa/sala) está disponível no horário solicitado.

        Validação de datas (não permitir agendamentos no passado).

        Gestão de status de agendamento (pendente, confirmado, cancelado).

    Testes (Análise Crítica): A presença de testes unitários na camada de serviço permite que você realize a análise crítica da qualidade dos testes já existentes, verificando a cobertura, o uso de mocks e a clareza dos testes.

Implementação de Testes (Três Níveis): A estrutura de camadas facilita:

    Unitário: Testar a lógica de conflito de horários no serviço.

    Integração: Testar a persistência do agendamento no banco de dados.

    Sistema: Testar a "Jornada de Agendamento Completo" (selecionar, confirmar e visualizar).

Se precisar de ajuda para traçar os primeiros Casos de Teste para a jornada do usuário que você escolher, me avise!

Sugerir outros repos semelhantes a este (milan-bozic/spring-boot-fullstack-booking-system) .

Este tem baixa porcentagem de testes.

Compreendo perfeitamente. Para o seu trabalho, não basta ter o arquétipo correto; a qualidade e a quantidade dos testes existentes são cruciais, pois a primeira parte da Etapa 2 é a análise crítica do que já foi feito.

Projetos que abordam a testabilidade desde o início são os mais adequados. Abaixo estão sugestões de repositórios Spring Boot com foco em testes e complexidade de regras de negócio (Hotelaria/Agendamento):

1. 🏨 Hotel Reservation API (Alta Cobertura de Testes)

Este projeto se destaca por ter a cobertura de testes explicitamente documentada e um foco em regras de negócio complexas de reserva.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes e Cobertura
marioszocs/spring-boot-hotel-reservation-api	É um backend de API REST para gerenciamento de hotéis e reservas. Implementa validações lógicas cruciais como não permitir reservas sobrepostas (no-overlapping reservations) para o mesmo hotel e datas válidas.	Alta Cobertura: O autor declara que possui 93% de cobertura de classes, 94% de métodos e 85% de linhas. Inclui testes unitários (com Mockito) e testes de integração (usando H2 in-memory database).
Jornada para Testar	A jornada de "Fazer uma Reserva que Conflita com uma Reserva Existente" permite implementar e comparar seus testes unitários de negação (falha) com os testes já existentes.	

2. 🏕️ Campsite Booking System (Foco em Concorrência e Regras)

Este projeto é um excelente candidato porque detalha as restrições de negócio e menciona explicitamente testes de concorrência e carga, oferecendo mais material para sua análise crítica.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes e Cobertura
igor-baiborodine/campsite-booking	API REST para reserva de acampamento. As restrições de reserva são claras: máximo de 3 dias, mínimo de 1 dia de antecedência e máximo de 1 mês de antecedência.	O projeto menciona a execução de Testes de Concorrência para garantir que apenas uma reserva seja criada em caso de múltiplas requisições simultâneas para as mesmas datas. Também inclui Testes de Carga Básicos.
Jornada para Testar	A jornada de "Reserva Mínima/Máxima" ou "Tentativa de Cancelamento" permite implementar testes que validem as regras de negócio bem definidas (ex: a data de chegada deve ser no mínimo 1 dia à frente).	

3. 🧪 Projetos Focados em Teste (Masterclass/TDD)

Estes repositórios são mais focados na metodologia de teste e servem como ótimas referências para sua análise crítica, pois foram criados com o propósito de demonstrar boas práticas.
Repositório Sugerido	Descrição e Por que é Adequado	Foco em Teste para a Análise Crítica
hamvocke/spring-testing	Uma aplicação Spring Boot de exemplo que contém diversos exemplos de testes em diferentes níveis da Pirâmide de Testes, demonstrando uma abordagem para testar o aplicativo.	Análise da Pirâmide de Testes: É ideal para analisar como os testes unitários, de integração e de sistema estão estruturados e implementados, comparando com o que foi ensinado na disciplina.
xpinjection/test-driven-spring-boot	Projeto de exemplo escrito no estilo TDD (Test-Driven Development). Menciona o uso de Testcontainers (para testes de integração com dependências externas em Docker) e Pact (para Consumer-Driven Contracts).	Ferramentas Avançadas: Permite analisar o uso de ferramentas de teste modernas (Testcontainers, Pact) e discutir como a abordagem TDD afeta a qualidade do código de teste.

🔔 Próxima Ação

O projeto marioszocs/spring-boot-hotel-reservation-api é o mais promissor por sua alta cobertura de testes e regras de negócio claras.

Qual destes repositórios o seu grupo irá selecionar para a Etapa 1 (postagem da indicação no fórum)?

Gemini Estou adorando suas ideias, porém o projeto tem que ter baixa ou mediana cobertura de testes para eu completar elas.

Entendido! Sua observação é muito importante. Para que você possa implementar os testes faltantes de níveis unitários, de integração e de sistema e demonstrar a aplicação das técnicas da disciplina, o ideal é que a cobertura de testes do projeto original seja baixa ou mediana.

Vamos focar em projetos que atendem ao arquétipo comercial de complexidade média, mas que são mais deficientes em termos de testes de qualidade ou cobertura.

Aqui estão algumas sugestões de repositórios que se encaixam nesse perfil:

1. 🛒 E-commerce (Com Foco em Funcionalidade, Não em Teste)

Estes projetos geralmente focam em entregar a funcionalidade de ponta a ponta, mas deixam a desejar na profundidade dos testes unitários e de integração, o que permite que você os implemente.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes (Expectativa)
mukeshot-org/ecommerce-microservices	Projeto de microsserviços que implementa um e-commerce (serviços de Usuário, Produto, Pedido e Pagamento). A arquitetura de microsserviços adiciona complexidade (integração entre serviços).	Baixa/Mediana: Projetos de microsserviços frequentemente têm testes unitários isolados, mas são fracos em testes de integração (especialmente entre serviços). Isso permite que você implemente testes de integração e sistema.
Jornada para Testar	"Criação de Pedido e Comunicação com o Serviço de Pagamento": Excelente para implementar testes de integração entre o Serviço de Pedido e o Serviço de Pagamento.	
bhushanmhatre/spring-boot-ecommerce-app	Aplicação e-commerce mais tradicional com módulos de Produto, Categoria e Pedido. O foco parece ser na funcionalidade, não na testabilidade.	Baixa/Mediana: Geralmente, projetos como este possuem apenas testes básicos de smoke ou nenhum teste unitário robusto na camada de serviço. Você poderá implementar testes de limite e equivalência.

2. 🏦 Financial Tracker / Gerenciamento de Finanças (Regras de Negócio)

Este tipo de sistema exige lógica de validação de transações e saldo, mas muitas vezes não é coberto por testes.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes (Expectativa)
firas-fathi/spring-boot-finance-tracker	Um sistema para rastrear finanças pessoais, com contas, categorias e transações. A complexidade reside na gestão do saldo e na validação de transações.	Baixa: É comum que projetos de utilidade pessoal tenham baixa prioridade na cobertura de testes. Você poderá implementar testes unitários nas regras de dedução e adição de saldo.
Jornada para Testar	"Adicionar uma Despesa que Leva o Saldo a Zero (ou Negativo)": Permite implementar testes de limite (partição de equivalência e análise de valor limite) na lógica de saldo.	

3. 📅 Agendamento Simples (Baixo Foco em Testabilidade)

Procuramos projetos de agendamento que, ao contrário dos anteriores, não se concentraram em design orientado a testes.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes (Expectativa)
joshuadeguzman/simple-appointment-scheduling-app	Um aplicativo simples de agendamento de consultas. A complexidade reside na lógica de disponibilidade de datas.	Baixa: O nome "simple" (simples) sugere que o foco pode ter sido apenas na implementação da funcionalidade. Isso lhe dá uma tela em branco para implementar testes unitários na lógica de conflito de horários.
Jornada para Testar	"Tentativa de Agendamento em um Horário Já Ocupado": Ótimo para implementar testes de integração para garantir que o banco de dados impõe a restrição de unicidade (único agendamento por horário).	

📝 Recomendação Final

O projeto joshuadeguzman/simple-appointment-scheduling-app ou firas-fathi/spring-boot-finance-tracker provavelmente terão a cobertura de testes mais baixa, oferecendo mais oportunidades para você implementar seus próprios testes e cumprir o requisito do trabalho.

Qual destes projetos você gostaria de tentar validar com o professor para a Etapa 1 (deadline 06/11/2025)?

oUTRAS INDICAÇÕES

Compreendido. Você precisa de mais opções de repositórios Spring Boot com arquitetura mínima, complexidade de regras de negócio, mas com baixa ou mediana cobertura de testes para maximizar suas oportunidades de implementação na Etapa 2.

Aqui estão mais sugestões, focando em sistemas de Gerenciamento de Recursos e Cálculo de Tarifas, que são arquétipos comerciais complexos, mas que geralmente não são testados extensivamente:

4. 📚 Gerenciamento de Biblioteca (Regras de Empréstimo)

Sistemas de biblioteca envolvem regras de negócio como limites de empréstimo, datas de devolução e multas, que vão além do CRUD de dados.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes (Expectativa)
vimalverma/spring-boot-library-management	Um sistema para gerenciar livros, usuários e empréstimos. A complexidade reside na lógica de empréstimo (validar se o usuário atingiu o limite, calcular a data de devolução).	Baixa: Projetos de gerenciamento interno costumam ter testes de integração limitados (se houverem). Ótimo para implementar testes unitários nas classes de serviço que tratam de limites de empréstimo e cálculo de multas.
Jornada para Testar	"Empréstimo de Livro Acima do Limite Permitido": Permite implementar testes de validação de regras de negócio e testes de integração para a transição de status do livro.	

5. 🏥 Gerenciamento de Consultas Médicas (Validação de Restrições)

Similar ao agendamento, mas com a complexidade adicional de gerenciar médicos, especialidades e restrições específicas de tempo.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes (Expectativa)
prakhar-verma/Medical-Appointment-Scheduling-System	Um sistema para agendar consultas, gerenciar pacientes e médicos. A principal regra de negócio é a disponibilidade do médico e a validação da agenda.	Mediana/Baixa: O foco principal geralmente é a interface e a persistência. Você terá ampla margem para criar testes robustos na camada de serviço para a verificação de conflitos de agenda.
Jornada para Testar	"Agendamento de Consulta com Médico no Horário de Almoço/Fora do Expediente": Ideal para testes de limite (boundary testing) na lógica de agendamento.	

6. 🛒 Carrinho de Compras Simples (Lógica de Desconto/Tarifas)

Embora envolva produtos, o foco aqui é a lógica de cálculo do carrinho (impostos, descontos, frete), que é uma regra de negócio complexa.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes (Expectativa)
javatab/Shopping-Cart-App-using-Spring-Boot	Um backend de carrinho de compras que lida com a adição de itens, atualização de quantidade e cálculo do total. Pode-se introduzir regras de desconto para complexidade.	Baixa: Projetos focados em backend de carrinho muitas vezes negligenciam testes em regras de cálculo, que é exatamente o que você precisa implementar.
Jornada para Testar	"Aplicação de Desconto por Quantidade (Ex: Compre 2, Leve 3)": Você pode criar essa regra de negócio e implementar todos os níveis de teste para ela.	

Sugestão Final com Base em Oportunidade

O projeto vimalverma/spring-boot-library-management é uma excelente escolha, pois a lógica de empréstimo e devolução (com multas) é uma regra de negócio clara, crucial e com alta probabilidade de ter cobertura de testes deficiente. Isso lhe dará uma base sólida para a análise crítica (o que falta) e para a implementação de seus novos testes.

Qual desses novos repositórios ou dos anteriores você prefere postar no fórum para a Etapa 1?

Tem que atender estes requisitos.

    Pergunta respondida com sucesso

Compreendido. Com a leitura atenta dos requisitos do Trabalho 2: Verificação e Validação de Software, a busca por um repositório precisa atender estritamente a estas regras:

    Objetivo do Sistema: Deve ser um arquétipo de sistema comercial (e.g., vendas, aluguel, contas bancárias).

Complexidade: Deve ser de nível médio ou superior.

Regra de Negócio: Não pode ser composto somente por operações CRUD simples, mas deve ter regra de negócio adicional.

Open Source: Repositório de código público.

Exclusões: Não pode ser o arquétipo do Spring Pet Clinic.

Testes (Sua Necessidade): Deve ter baixa ou mediana cobertura de testes (para que você possa implementar os testes faltantes de níveis unitário, de integração e de sistema ).

Aqui estão mais sugestões de repositórios Spring Boot que, por serem mais focados em backend de API ou em funcionalidades específicas, tendem a ter uma cobertura de testes mais baixa, mas complexidade de regras de negócio:

7. 📈 Gerenciamento de Estoque (Regras de Inventário)

Um sistema de estoque envolve regras de negócio cruciais, como a lógica de reserva, o ponto de reordenamento e a movimentação de produtos.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes (Expectativa)
adil-jamil/inventory-management-system	Um sistema de gerenciamento de inventário (estoque) que rastreia produtos, fornecedores e movimentações (entradas/saídas). A principal regra de negócio é a validação da quantidade em estoque.	Mediana/Baixa: O foco geralmente é a transação de dados. Você terá espaço para implementar testes unitários na lógica de atualização de estoque e testes de integração com o banco de dados.
Jornada para Testar	"Redução do Estoque de um Produto a Zero (ou Negativo) Após uma Venda": Permite testar as regras de limite (boundary) e as exceções de negócio (estoque insuficiente).	

8. 🎫 Gerenciamento de Eventos e Ingressos (Regras de Venda e Capacidade)

Este arquétipo possui uma complexidade clara relacionada à capacidade do local e à regra de não overselling.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes (Expectativa)
deep-gaurav/event-ticket-reservation	Sistema de reserva de ingressos para eventos. As regras de negócio incluem capacidade máxima do evento, limites de compra por usuário e validação de datas de evento.	Baixa: Projetos de reserva de ingressos precisam de testes de concorrência, mas raramente os implementam de forma robusta. Isso lhe dá a oportunidade de implementar testes de integração avançados.
Jornada para Testar	"Tentativa de Compra de Ingresso Acima da Capacidade Total do Evento": Excelente para implementar testes de sistema (simulando a jornada de compra) e testes unitários na lógica de validação de capacidade.	

9. 💰 Gerenciamento de Contas e Faturas (Cálculo de Dívidas)

Focado em serviços B2B ou assinaturas, onde a lógica de cálculo de faturas (baseado em uso, descontos ou impostos) é o ponto central.
Repositório Sugerido	Descrição e Por que é Adequado	Testes Existentes (Expectativa)
vladmihalcea/spring-boot-invoice-management	Sistema para gerenciar clientes, produtos e faturas. A complexidade está no cálculo do valor total da fatura (impostos, descontos, itens).	Baixa/Mediana: É comum que a lógica de cálculo financeiro (o cerne do sistema) seja implementada, mas mal testada em ambientes open source.
Jornada para Testar	"Criação de Fatura com Múltiplos Itens e Aplicação de Desconto Global": Perfeito para testes unitários na classe que executa o cálculo da fatura, usando técnicas de particionamento de equivalência para os valores de desconto/imposto.	

Próxima Ação

O projeto deep-gaurav/event-ticket-reservation ou adil-jamil/inventory-management-system são fortes candidatos, pois a necessidade de proteger contra venda/reserva em excesso ou estoque negativo é uma regra de negócio crítica que exige todos os três níveis de teste (unitário, integração e sistema).

Você já escolheu um dos repositórios para fazer a postagem no fórum (Etapa 1: 06/11/2025 )?

NÃO CONSEGUI ACHAR OS PROJETOS POIS ELES SÃO PRIVATE

Sinto muito por esse inconveniente! Repositórios open source às vezes mudam de status ou são excluídos. A busca é dinâmica e precisamos de projetos públicos para a Etapa 1.

Com base na sua necessidade (Spring Boot, regras de negócio complexas, baixa/mediana cobertura de testes e ser PÚBLICO), realizei uma nova pesquisa focada em projetos com licença clara e alta chance de estarem ativos.

Aqui estão 3 novas sugestões que atendem a todos os seus requisitos para o Trabalho 2:

