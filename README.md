# Início da Aplicação 
Ao abrir o aplicativo, o usuário é recebido pela tela de splash screen, responsável por apresentar a identidade visual da solução. 
Durante essa etapa, os recursos iniciais são carregados para garantir uma experiência fluida na navegação.
A mensagem "Monitoramento inteligente e alertas em tempo real" reforça o objetivo principal da aplicação: informar e proteger a população 
por meio de tecnologia e dados climáticos atualizados.

![Splash](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/341dc87d5fb071295b31fa754e8698c58d288ef8/splash.png)

## Apresentação da Plataforma
Após o carregamento inicial, o usuário é direcionado para um fluxo de onboarding composto por três telas.
Na primeira tela, é explicado que o aplicativo envia alertas climáticos relacionados à região do usuário, permitindo que ele receba informações importantes para proteger sua família e se preparar para possíveis situações de risco.

![Intro1](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/e34d69992de3535c5b1388d24b5d457521e81dd1/intro1.png)

Na segunda tela, o foco é demonstrar o monitoramento em tempo real realizado pela plataforma. O usuário compreende que os eventos climáticos são acompanhados continuamente e que as informações estarão sempre atualizadas.

![Intro2](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/e34d69992de3535c5b1388d24b5d457521e81dd1/intro2.png)

Na terceira tela, apresenta o sistema de alertas instantâneos, garantindo que notificações emergenciais sejam enviadas rapidamente sempre que uma situação crítica for identificada.
Após concluir a apresentação, o usuário seleciona a opção "Começar", sendo direcionado para a área principal do aplicativo.
![Intro3](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/e34d69992de3535c5b1388d24b5d457521e81dd1/intro3.png)

## Tela Principal -
A Home concentra as funcionalidades mais importantes da aplicação. Logo no topo é exibida a localização monitorada, permitindo que o usuário saiba qual região está sendo acompanhada pelo sistema.
Em seguida, é apresentado o status atual da região. Neste exemplo, o aplicativo identifica uma condição de atenção devido à possibilidade de chuva forte durante o dia. Essa informação permite que o usuário tome decisões preventivas com antecedência.
A tela também disponibiliza atalhos para as principais funcionalidades da plataforma:
Visualização de alertas ativos;
Consulta de dicas de prevenção;
Acesso rápido aos recursos de emergência.
Na parte inferior, é exibido o alerta mais recente registrado pelo sistema, destacando o evento identificado e seu respectivo nível de criticidade.

![Home](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/e34d69992de3535c5b1388d24b5d457521e81dd1/home.png)


## Consulta de Alertas -
Ao selecionar a opção "Ver Alertas", o usuário acessa uma tela contendo todos os alertas monitorados pela aplicação.
Cada registro apresenta informações como o tipo do evento climático, o nível de risco associado e o horário de emissão do alerta. Dessa forma, o usuário consegue acompanhar rapidamente as ocorrências registradas em sua região.
Para facilitar a navegação, o sistema disponibiliza filtros por nível de criticidade, permitindo visualizar apenas alertas classificados como Alto, Médio ou Baixo.

![Alertas](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/e34d69992de3535c5b1388d24b5d457521e81dd1/alertas.png)

## Criticidade Alta -
Quando o filtro Alto é selecionado, por exemplo, a lista é atualizada automaticamente, exibindo apenas eventos considerados mais críticos e que demandam maior atenção do usuário.
Essa funcionalidade torna a consulta mais rápida e eficiente, principalmente em situações de emergência.

![Nivel_Alerta](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/e34d69992de3535c5b1388d24b5d457521e81dd1/nivel-alerta.png)


## Dicas de Prevenção -
A tela Dicas de Prevenção, é responsável por fornecer orientações importantes para reduzir riscos antes e durante uma situação de emergência. Nela são exibidas recomendações como evitar áreas alagadas, não dirigir em ruas inundadas, desligar aparelhos elétricos para prevenir curtos-circuitos, manter documentos importantes em locais seguros e acompanhar constantemente os alertas emitidos pelos órgãos competentes

![Dicas](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/e34d69992de3535c5b1388d24b5d457521e81dd1/dicas.png)

## Emergência
A partir dessa área, o usuário pode acessar a tela Emergência, criada para agilizar o contato com os serviços de atendimento. Nessa tela é disponibilizado um botão de destaque denominado “Pedir Ajuda”, que permite ao usuário registrar rapidamente uma solicitação de socorro. Além disso, são apresentados os principais contatos de emergência do país, incluindo Defesa Civil (199), Bombeiros (193) e SAMU (192), facilitando o acesso imediato aos serviços responsáveis pelo atendimento em situações críticas.

![Emergencia](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/e34d69992de3535c5b1388d24b5d457521e81dd1/emergencia.png)

## Ajuda solicitada
Após o acionamento do botão de solicitação, o sistema direciona o usuário para a tela Ajuda Solicitada, que funciona como uma confirmação de que o pedido foi enviado com sucesso. Nessa etapa é exibida uma mensagem de confirmação acompanhada de um indicador visual de sucesso, transmitindo maior segurança ao usuário. A tela também apresenta orientações importantes, como manter a calma e permanecer em um local seguro enquanto a equipe responsável se desloca para prestar atendimento.

![Ajuda_Solicitada](https://github.com/isaconstance/GeoSat-gs-Kotlin/blob/e34d69992de3535c5b1388d24b5d457521e81dd1/ajuda.png)
