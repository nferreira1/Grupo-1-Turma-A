import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte iniciar = 0;

        System.out.println("""
                ████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████
                █░░░░░░░░░░░░░░░░███░░░░░░██░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░░░░░░░░░█░░░░░░█████████░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█
                █░░▄▀▄▀▄▀▄▀▄▀▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░░░░░░░░░██░░▄▀░░█
                █░░▄▀░░░░░░░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░░░░░▄▀░░░░░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░░░░░█░░▄▀▄▀▄▀▄▀▄▀░░██░░▄▀░░█
                █░░▄▀░░████░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░█████████████░░▄▀░░█████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░█████████░░▄▀░░░░░░▄▀░░██░░▄▀░░█
                █░░▄▀░░░░░░░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█████░░▄▀░░█████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█
                █░░▄▀▄▀▄▀▄▀▄▀▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀░░█████░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░█████████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█
                █░░▄▀░░░░░░▄▀░░░░███░░▄▀░░██░░▄▀░░█░░░░░░░░░░▄▀░░█████░░▄▀░░█████░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░█████████░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀░░██░░▄▀░░█
                █░░▄▀░░██░░▄▀░░█████░░▄▀░░██░░▄▀░░█████████░░▄▀░░█████░░▄▀░░█████░░▄▀▄▀░░▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░█████████░░▄▀░░█████████░░▄▀░░██░░▄▀░░░░░░▄▀░░█
                █░░▄▀░░██░░▄▀░░░░░░█░░▄▀░░░░░░▄▀░░█░░░░░░░░░░▄▀░░█████░░▄▀░░█████░░░░▄▀▄▀▄▀░░░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░█░░▄▀░░██░░▄▀▄▀▄▀▄▀▄▀░░█
                █░░▄▀░░██░░▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█████░░▄▀░░███████░░░░▄▀░░░░███░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░░░░░░░░░▄▀░░█
                █░░░░░░██░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█████░░░░░░█████████░░░░░░█████░░░░░░██░░░░░░█░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█░░░░░░██████████░░░░░░█
                ████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████
                """
        );

        do {
            try {
                System.out.println("<-- MENU DE OPÇÕES --> \n" +
                        "1 - INICIAR JOGO\n" +
                        "2 - INFORMAÇÕES\n" +
                        "3 - PERSONAGENS\n" +
                        "4 - CHEFES\n" +
                        "5 - ENCERRAR JOGO\n"
                );
                iniciar = sc.nextByte();

                switch (iniciar) {
                    case 1:

                        // DESAFIOS DILSONS, CHEFE DO PÂNTANO
                        String[] perguntasDilsons = {
                                "Quantas vezes o loop for executa no código a seguir?\n\nfor (int i = 0; i < 5; i++) {}",
                                "Quantas vezes o loop while executa no código a seguir?\n\nint i = 0;\nwhile (i < 3) {\ni++;\n}"
                        };

                        // DESAFIOS REDIAS, O LORDE DAS SOMBRAS
                        String[] perguntasRedias = {
                                "Qual a saída do código a seguir?\n\nint[] array = {1, 2, 3, 4, 5};\nfor (int i = 0; i < array.length; i++) {\n    if (array[i] % 2 == 0) {\n        System.out.print(array[i] + \\\" \\\");\n    }\n}\"",
                                "\"Qual a saída do código a seguir?\n\nint[] array = {1, 2, 3, 4, 5};\nfor (int i = array.length - 1; i >= 0; i--) {\n    System.out.print(array[i] + \\\" \\\");\n}\""
                        };

                        String[] respostasRedias = {
                                "a) 2, 4 \nb) 1, 3, 5 \nc) 1, 2, 3, 4, 5 \nd) 1, 5\n",
                                "a) 2, 4 \nb) 1, 3, 5 \nc) 1, 2, 3, 4, 5 \nd) 5, 4, 3, 2, 1\n",
                        };

                        // DESAFIO CLARUS, O DRAGÃO SOMBRIO
                        String[] perguntasClarus = {
                                "Qual a saída do código a seguir?\n\nint[] array = {1, 2, 3, 4, 5};\nint contador = 0;\nfor (int i = 0; i < array.length; i++) {\n    if (array[i] > 2) {\n        contador++;\n    }\n}\nSystem.out.println(contador);",
                                "Qual a saída do código a seguir?\n\nint[] array = {1, 2, 3, 4, 5};\nint soma = 0;\nfor (int i = 0; i < array.length; i++) {\n    if (array[i] % 2 == 0) {\n        soma += array[i];\n    }\n}\nSystem.out.println(soma);"
                        };

                        String[] respostasClarus = {
                                "a) 2, 4 \nb) 1, 3, 5 \nc) 3\nd) 1, 5, 4\n",
                                "a) 5 \nb) 6 \nc) 2 \nd) 16\n",
                        };

                        System.out.println("Era uma vez, em um reino chamado RustvaleN, um lugar repleto de magia e aventuras. Por séculos, RustvaleN prosperou em paz,\n" +
                                "até que um mal ancestral despertou nas profundezas do subterrâneo. Escuridão e caos começaram a se espalhar, ameaçando engolir o reino em trevas.\n" +
                                "Aria, Leon e Maya, três heróis valentes e destinados, foram chamados pelos deuses para enfrentar a terrível ameaça que pairava sobre RustvaleN.\n" +
                                "Cada um dos heróis possuía habilidades únicas e diferentes fraquezas e pontos fortes.\n\n"
                        );

                        // VIDA DO PERSONAGEM
                        short vidaPersonagem = 0;

                        // ESCOLHA DA DIFICULDADE DO JOGO
                        byte dificuldade = 0;
                        do {
                            try {
                                System.out.println("Escolha a dificuldade: ");
                                System.out.println("1 - Fácil\n" +
                                        "2 - Normal\n" +
                                        "3 - Difícil\n"
                                );
                                dificuldade = sc.nextByte();
                            } catch (InputMismatchException exception) {
                                System.out.println("Caracteres não permitido, insira apenas números.");
                                sc.nextLine();
                            }
                        } while (dificuldade < 1 || dificuldade > 3);

                        if (dificuldade == 1) {
                            vidaPersonagem = 999;
                        } else if (dificuldade == 2) {
                            vidaPersonagem = 100;
                        } else {
                            vidaPersonagem = 1;
                        }

                        // ESCOLHA DO PERSONAGEM
                        byte personagem = 0;
                        do {
                            try {
                                System.out.println("Escolha um personagem: ");
                                System.out.println("1 - Aria\n" +
                                        "2 - Leon\n" +
                                        "3 - Maya\n"
                                );
                                personagem = sc.nextByte();
                            } catch (InputMismatchException exception) {
                                System.out.println("Caracteres não permitido, insira apenas números.");
                                sc.nextLine();
                            }

                        } while (personagem < 1 || personagem > 3);

                        String personagemString;

                        if (personagem == 1) {
                            personagemString = "Aria";
                        } else if (personagem == 2) {
                            personagemString = "Leon";
                        } else {
                            personagemString = "Maya";
                        }

                        // INÍCIO DO JOGO
                        if (personagem == 2) {
                            System.out.printf("%s começou sua jornada na cidade de Edvilen, onde recebeu a primeira missão: encontrar o Amuleto da Luz, uma relíquia antiga capaz de banir as trevas.\n" +
                                            "Ele deve embarcar em uma jornada perigosa através das Terras Proibidas, uma região desolada e repleta de monstros.\n\n"
                                    , personagemString
                            );
                        } else {
                            System.out.printf("%s começou sua jornada na cidade de Edvilen, onde recebeu a primeira missão: encontrar o Amuleto da Luz, uma relíquia antiga capaz de banir as trevas.\n" +
                                            "Ela deve embarcar em uma jornada perigosa através das Terras Proibidas, uma região desolada e repleta de monstros.\n\n"
                                    , personagemString
                            );
                        }

                        System.out.printf("No caminho, %s enfrenta seu primeiro desafio, Dilsons, o Chefe do Pântano. Uma criatura terrível, meio humanoide, meio serpente, guarda a entrada para\n" +
                                        "as Terras Proibidas. Com sua agilidade e poder venenoso, o Chefe do Pântano tenta impedir %s de avançar.\n\n"
                                , personagemString, personagemString
                        );

                        // CAPÍTULO 01 - BATALHA NO PÂNTANO
                        System.out.println("<-- INÍCIO DA BATALHA -->\n");
                        System.out.printf("O Chefe do Pântano avança rapidamente em direção a %s. %s, ágil, antecipa o ataque iminente e se esquiva habilmente. Com uma destreza impressionante, %s\n" +
                                        "desvia dos movimentos serpenteantes do monstro, enquanto se prepara para contra-atacar.\n\n"
                                , personagemString, personagemString, personagemString
                        );
                        System.out.println("<-- PREPARAÇÃO DO ATAQUE -->\n");

                        if (personagem == 1) {
                            System.out.println(perguntasDilsons[0]);
                            byte resposta1 = sc.nextByte();

                            if (resposta1 == 5) {
                                System.out.println("Aria aproveita o momento oportuno e utiliza sua magia dos ventos. Com um movimento rápido de suas mãos, ela invoca uma rajada de vento poderosa,\n" +
                                        "que atinge em cheio o Chefe do Pântano. O monstro é jogado para trás, sua pele escamosa se contorcendo com dor.\n"
                                );

                                System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                            } else {
                                System.out.println("Aria, apesar de sua agilidade, é pega desprevenida pelo ataque rápido do monstro e não consegue desviar a tempo. O Chefe do Pântano a atinge com sua cauda,\n" +
                                        "lançando-a para o chão com força.\n"
                                );
                                vidaPersonagem -= 20;

                                System.out.printf("%s perdeu 20 pontos de vida.\n", personagemString);
                            }

                            if (vidaPersonagem <= 0) {
                                System.out.println("O impacto é devastador, drenando sua energia vital e deixando-a gravemente ferida. Com um último suspiro, Aria cai no chão, seus olhos se fecham e sua jornada chega a um fim trágico.\n" +
                                        "A bravura e coragem de Aria serão lembradas, e seu sacrifício servirá de motivação para os próximos heróis continuarem a luta contra as forças das trevas."
                                );

                                System.out.println("<-- FIM DE JOGO -->");
                                break;
                            }

                            System.out.println("Aria se prepara para dar outro golpe no monstro...\n");

                            System.out.println(perguntasDilsons[1]);
                            byte resposta2 = sc.nextByte();

                            if (resposta2 == 3) {
                                System.out.println("Com um gesto de suas mãos, Aria lança o redemoinho em direção ao Chefe do Pântano. O monstro é engolido pelo vento violento, lançado ao\n" +
                                        "ar e atingido repetidamente pelas forças selvagens da natureza. O Chefe do Pântano, debilitado e confuso, é finalmente derrotado pela poderosa magia\n" +
                                        "de Aria.\n\n"
                                );

                                System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                            } else {
                                System.out.println("Desta vez, Aria não consegue escapar totalmente do ataque. O Chefe do Pântano a atinge com sua garra afiada, causando um corte profundo em\n" +
                                        "seu braço. Aria sente a dor aguda, mas não se deixa abater. Ela usa sua magia de cura para fechar a ferida.\n" +
                                        "Apesar do dano sofrido, Aria se recompõe e concentra sua energia mágica. Ela canaliza sua determinação e lança uma poderosa onda de energia em direção\n" +
                                        "ao Chefe do Pântano. O monstro é atingido em cheio e morre instantaneamente.\n\n"
                                );
                                vidaPersonagem -= 40;

                                System.out.printf("%s perdeu 40 pontos de vida.\n", personagemString);
                            }
                        }
                        else if (personagem == 2) {
                            System.out.println(perguntasDilsons[0]);
                            byte resposta1 = sc.nextByte();

                            if (resposta1 == 5) {
                                System.out.println("Com um movimento rápido e preciso, Leon arremessa seus dardos em direção ao Chefe do Pântano. Os projéteis voam pelo ar, mirando nos pontos\n" +
                                        "vulneráveis do monstro. Alguns dardos acertam seu alvo, perfurando a pele escamosa do monstro e causando danos significativos.\n"
                                );

                                System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                            } else {
                                System.out.println("Leon, apesar de sua agilidade, é pego desprevenido pelo ataque rápido do monstro e não consegue desviar a tempo. O Chefe do Pântano a atinge com sua cauda,\n" +
                                        "lançando-a para o chão com força.\n"
                                );
                                vidaPersonagem -= 20;

                                System.out.printf("%s perdeu 20 pontos de vida.\n", personagemString);
                            }

                            if (vidaPersonagem <= 0) {
                                System.out.println("O impacto é devastador, drenando sua energia vital e deixando-a gravemente ferida. Com um último suspiro, Leon cai no chão, seus olhos se fecham e sua jornada chega a um fim trágico.\n" +
                                        "A bravura e coragem de Leon serão lembradas, e seu sacrifício servirá de motivação para os próximos heróis continuarem a luta contra as forças das trevas."
                                );

                                System.out.println("<-- FIM DE JOGO -->");
                                break;
                            }

                            System.out.println("Leon se prepara para dar outro golpe no monstro...\n");

                            System.out.println(perguntasDilsons[1]);
                            byte resposta2 = sc.nextByte();

                            if (resposta2 == 3) {
                                System.out.println("Com um último movimento hábil, Leon lança um dardo envenenado diretamente no coração do monstro. O veneno se espalha rapidamente pelo corpo\n" +
                                        "do Chefe do Pântano, enfraquecendo-o ainda mais. O monstro tomba no chão, derrotado pela perícia e estratégia de Leon.\n\n"
                                );

                                System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                            } else {
                                System.out.println("Desta vez, Leon não consegue escapar totalmente do ataque. O Chefe do Pântano a atinge com sua garra afiada, causando um corte profundo em\n" +
                                        "seu braço. Leon sente a dor aguda, mas não se deixa abater.\n" +
                                        "Com um olhar fixo no Chefe do Pântano, Leon canaliza suas últimas forças em um ataque derradeiro. Ele puxa um dardo especial, carregado com magia\n" +
                                        "concentrada, e o lança com uma velocidade surpreendente em direção ao monstro. O dardo perfura o coração do Chefe do Pântano, atingindo sua fraqueza oculta.\n" +
                                        "O monstro solta um rugido de dor e desespero enquanto a energia maligna que o corrompia é dissipada. O Chefe do Pântano se desintegra lentamente,\n" +
                                        "desaparecendo em uma névoa escura.\n\n"
                                );
                                vidaPersonagem -= 40;

                                System.out.printf("%s perdeu 40 pontos de vida.\n", personagemString);
                            }

                        }
                        else {
                            System.out.println(perguntasDilsons[0]);
                            byte resposta1 = sc.nextByte();

                            if (resposta1 == 5) {
                                System.out.println("Erguendo sua varinha mágica, Maya convoca uma explosão de palavras poderosas. Ela conjura uma tempestade de letras flamejantes que se dirigem em\n" +
                                        "direção ao Chefe do Pântano. As letras dançam no ar, formando palavras de fogo que consomem o monstro com intensidade.\n"
                                );

                                System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                            } else {
                                System.out.println("Maya, apesar de sua agilidade, é pego desprevenido pelo ataque rápido do monstro e não consegue desviar a tempo. O Chefe do Pântano a atinge com sua cauda,\n" +
                                        "lançando-a para o chão com força.\n"
                                );
                                vidaPersonagem -= 20;

                                System.out.printf("%s perdeu 20 pontos de vida.\n", personagemString);
                            }

                            if (vidaPersonagem <= 0) {
                                System.out.println("O impacto é devastador, drenando sua energia vital e deixando-a gravemente ferida. Com um último suspiro, Maya cai no chão, seus olhos se fecham e sua jornada chega a um fim trágico.\n" +
                                        "A bravura e coragem de Maya serão lembradas, e seu sacrifício servirá de motivação para os próximos heróis continuarem a luta contra as forças das trevas."
                                );

                                System.out.println("<-- FIM DE JOGO -->");
                                break;
                            }

                            System.out.println("Maya se prepara para dar outro golpe no monstro...\n");

                            System.out.println(perguntasDilsons[1]);
                            byte resposta2 = sc.nextByte();

                            if (resposta2 == 3) {
                                System.out.println("Ela pronuncia uma palavra de poder absoluto, e um raio de luz brilhante é liberado de sua varinha. O raio atravessa o coração do Chefe do Pântano,\n" +
                                        "dissipando a escuridão que o corrompia. O monstro se desintegra em fragmentos sombrios, que se dissipam no ar.\n\n"
                                );

                                System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                            } else {
                                System.out.println("Desta vez, Maya não consegue escapar totalmente do ataque. O Chefe do Pântano a atinge com sua garra afiada, causando um corte profundo em\n" +
                                        "seu braço. Maya sente a dor aguda, mas não se deixa abater.\n" +
                                        "Com um olhar fixo no Chefe do Pântano, Maya canaliza suas últimas forças em um ataque derradeiro. Ela pronuncia uma palavra de poder absoluto, e um raio de luz\n" +
                                        "brilhante é liberado de sua varinha. O raio atravessa o coração do Chefe do Pântano, dissipando a escuridão que o corrompia. O monstro se desintegra em fragmentos\n" +
                                        "sombrios, que se dissipam no ar.\n\n"
                                );
                                vidaPersonagem -= 40;

                                System.out.printf("%s perdeu 40 pontos de vida.\n", personagemString);
                            }
                        }

                        System.out.printf("Após derrotar o Chefe do Pântano, %s examina cuidadosamente o local da batalha, em busca de pistas ou objetos que possa ajudár em sua\n" +
                                        "jornada. Entre a vegetação encharcada e a lama do pântano, %s encontra um pergaminho antigo preso em um galho retorcido.\n" +
                                        "A abrir o pergaminho com cuidado, %s depara-se com uma mensagem enigmática escrita com uma letra elegante e curvilínea. As palavras são as seguintes:\n" +
                                        "\"A coragem é a Chave para acEnder o camiNho Da esperAnça\" \n\n"
                                , personagemString, personagemString, personagemString
                        );

                        System.out.printf("Com Dilsons, O Chefe do Pântano derrotado, %s sente um misto de alívio e determinação renovada. Sabendo que ainda há um longo caminho pela frente, %s\n" +
                                        "se prepara para o próximo desafio.\n\n"
                                , personagemString, personagemString
                        );

                        System.out.printf("Ao chegar diante da imponente porta que leva às Terras Proibidas, %s encontra um painel com seis slots vazios. %s sabe que para abrir a porta e\n" +
                                        "prosseguir em sua jornada, é necessário inserir a senha correta.\n\n"
                                , personagemString, personagemString
                        );

                        System.out.printf("%s percebe que a porta para as Terras Proibidas não é apenas uma passagem física, mas um desafio que testará sua habilidade em decifrar a senha correta.\n" +
                                        "Ao analisar o painel com os seis slots vazios, %s sabe que têm apenas três tentativas para inserir a senha correta.\n\n"
                                , personagemString, personagemString
                        );

                        byte tentativas = 3;

                        do {
                            System.out.print("Insira a senha: ");
                            String senha = sc.next();

                            if (senha.equalsIgnoreCase("ACENDA")) {
                                System.out.printf("Assim que a última letra é inserida, um brilho intenso irrompe dos slots, revelando a palavra \"ACENDA\". A porta, então, se abre majestosamente,\n" +
                                                "convidando %s a adentrar as Terras Proibidas, onde enfrentará novos desafios e perigos em sua missão de combater as trevas que assolam RustvaleN.\n\n"
                                        , personagemString
                                );

                                System.out.printf("Ao adentrar as Terras Proibidas, %s descobre que o segundo Chefe, conhecido como Redias, O Lorde das Sombras, está espalhando a escuridão em uma antiga\n" +
                                                "fortaleza. O Lorde das Sombras é um feiticeiro poderoso que se tornou corrupto pelo Flagelo das Trevas. Ele utiliza magias sombrias e invoca criaturas das trevas\n" +
                                                "para enfrentar os heróis.\n"
                                        , personagemString
                                );

                                // CAPÍTULO 02 - BATALHA NAS TERRAS SOMBRIAS
                                System.out.println("<-- INÍCIO DA BATALHA -->\n");

                                if (personagem == 2) {
                                    System.out.printf("O Lorde das Sombras concentra seu poder sombrio e lança um feitiço em direção a %s, visando envolvê-lo em um véu de trevas. %s, habilidoso e\n" +
                                                    "destemido, utiliza sua agilidade para se esquivar dos raios sombrios que se aproximam perigosamente. Com movimentos graciosos, ele escapa por entre as\n" +
                                                    "sombras, pronto para retaliar e enfrentar o poderoso Lorde das Sombras.\n\n"
                                            , personagemString, personagemString
                                    );
                                } else {
                                    System.out.printf("O Lorde das Sombras concentra seu poder sombrio e lança um feitiço em direção a %s, visando envolvê-la em um véu de trevas. %s, habilidosa e\n" +
                                                    "destemida, utiliza sua agilidade para se esquivar dos raios sombrios que se aproximam perigosamente. Com movimentos graciosos, ela escapa por entre as\n" +
                                                    "sombras, pronta para retaliar e enfrentar o poderoso Lorde das Sombras.\n\n"
                                            , personagemString, personagemString
                                    );
                                }

                                System.out.println("<-- PREPARAÇÃO DO ATAQUE -->\n");

                                if (personagem == 1) {
                                    System.out.println(perguntasRedias[0]);
                                    System.out.println(respostasRedias[0]);
                                    String resposta1 = sc.next();

                                    if (resposta1.equalsIgnoreCase("a")) {
                                        System.out.println("Aria, determinada a confrontar o Lorde das Sombras, concentra sua energia mágica e lança um feitiço luminoso em direção ao seu inimigo. Um raio de luz cortante é\n" +
                                                "disparado com precisão, atingindo o Lorde das Sombras em cheio. O feitiço revela a verdadeira forma do Lorde das Sombras, enfraquecendo suas defesas e expondo sua vulnerabilidade.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.println("Enquanto Aria busca uma oportunidade para atacar o Lorde das Sombras, ela antecipa seus movimentos e lança um poderoso raio sombrio em sua direção. Aria é pega de surpresa,\n" +
                                                "incapaz de se defender a tempo, e é atingida em cheio pelo ataque.\n"
                                        );
                                        vidaPersonagem -= 40;

                                        System.out.printf("%s perdeu 40 pontos de vida.\n", personagemString);
                                    }

                                    if (vidaPersonagem <= 0) {
                                        System.out.println("O impacto é devastador, drenando sua energia vital e deixando-a gravemente ferida. Com um último suspiro, Aria cai no chão, seus olhos se fecham e sua jornada chega a um fim trágico.\n" +
                                                "A bravura e coragem de Aria serão lembradas, e seu sacrifício servirá de motivação para os próximos heróis continuarem a luta contra as forças das trevas."
                                        );

                                        System.out.println("<-- FIM DE JOGO -->");
                                        break;
                                    }

                                    System.out.println("Aria se prepara para dar outro golpe no monstro...\n");

                                    System.out.println(perguntasRedias[1]);
                                    System.out.println(respostasRedias[1]);
                                    String resposta2 = sc.next();

                                    if (resposta2.equalsIgnoreCase("d")) {
                                        System.out.println("Aria libera um feixe de luz brilhante, uma explosão de energia luminosa que envolve o Lorde das Sombras. Seu ataque final é implacável, atravessando as defesas sombrias\n" +
                                                "e atingindo em cheio o coração do feiticeiro corrompido. O Lorde das Sombras é consumido pela luz, seu poder enfraquecido até ser completamente derrotado.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.println("Aria, focada em seu objetivo de derrotar o Lorde das Sombras, se prepara para seu ataque final. Porém, em um momento de descuido, o feiticeiro maligno lança um feitiço\n" +
                                                "poderoso em sua direção, atingindo-a em cheio. Aria é empurrada para trás, sentindo a dor lancinante do golpe.\n"
                                        );
                                        vidaPersonagem -= 60;

                                        System.out.printf("%s perdeu 60 pontos de vida.\n", personagemString);
                                    }

                                    if (vidaPersonagem <= 0) {
                                        System.out.println("O impacto é devastador, drenando sua energia vital e deixando-a gravemente ferida. Com um último suspiro, Aria cai no chão, seus olhos se fecham e sua jornada chega a um fim trágico.\n" +
                                                "A bravura e coragem de Aria serão lembradas, e seu sacrifício servirá de motivação para os próximos heróis continuarem a luta contra as forças das trevas."
                                        );

                                        System.out.println("<-- FIM DE JOGO -->");
                                        break;
                                    }

                                    System.out.println("Mesmo ferida, ela se levanta determinada e lança um poderoso feixe de luz, aniquilando o Lorde das Sombras de uma vez por todas. Aria triunfa sobre a escuridão e continua sua jornada\n" +
                                            "para salvar Rustvalen.\n"
                                    );
                                }
                                else if (personagem == 2) {
                                    System.out.println(perguntasRedias[0]);
                                    System.out.println(respostasRedias[0]);
                                    String resposta1 = sc.next();

                                    if (resposta1.equalsIgnoreCase("a")) {
                                        System.out.println("Leon, o Mestre dos Dardos, concentra sua energia e mira com precisão mortal. Com um rápido movimento, ele lança seu dardo, que corta o ar em direção ao Lorde das Sombras.\n" +
                                                "O projétil acerta em cheio, perfurando a escuridão e fazendo o feiticeiro tremer sob o impacto.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.println("Enquanto Leon busca uma oportunidade para atacar o Lorde das Sombras, ele antecipa seus movimentos e lança um poderoso raio sombrio em sua direção. Leon é pego de surpresa,\n" +
                                                "incapaz de se defender a tempo, e é atingido em cheio pelo ataque.\n"
                                        );
                                        vidaPersonagem -= 40;

                                        System.out.printf("%s perdeu 40 pontos de vida.\n", personagemString);
                                    }

                                    if (vidaPersonagem <= 0) {
                                        System.out.println("O impacto é devastador, drenando sua energia vital e deixando-o gravemente ferido. Com um último suspiro, Leon cai no chão, seus olhos se fecham e sua jornada chega a um fim trágico.\n" +
                                                "A bravura e coragem de Leon serão lembradas, e seu sacrifício servirá de motivação para os próximos heróis continuarem a luta contra as forças das trevas."
                                        );

                                        System.out.println("<-- FIM DE JOGO -->");
                                        break;
                                    }

                                    System.out.println("Leon se prepara para dar outro golpe no monstro...\n");

                                    System.out.println(perguntasRedias[1]);
                                    System.out.println(respostasRedias[1]);
                                    String resposta2 = sc.next();

                                    if (resposta2.equalsIgnoreCase("d")) {
                                        System.out.println("Leon, com sua destreza inigualável, aproveita o momento de fraqueza e realiza seu golpe final. Ele lança múltiplos dardos com uma velocidade impressionante, acertando o Lorde das Sombras\n" +
                                                "em pontos vitais. O feiticeiro é consumido pela escuridão e cai derrotado diante da determinação de Leon.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.println("Leon, focado em seu objetivo de derrotar o Lorde das Sombras, se prepara para seu ataque final. Porém, em um momento de descuido, o feiticeiro maligno lança um feitiço\n" +
                                                "poderoso em sua direção, atingindo-o em cheio. Leon é empurrada para trás, sentindo a dor lancinante do golpe.\n"
                                        );
                                        vidaPersonagem -= 60;

                                        System.out.printf("%s perdeu 60 pontos de vida.\n", personagemString);
                                    }

                                    if (vidaPersonagem <= 0) {
                                        System.out.println("O impacto é devastador, drenando sua energia vital e deixando-o gravemente ferido. Com um último suspiro, Leon cai no chão, seus olhos se fecham e sua jornada chega a um fim trágico.\n" +
                                                "A bravura e coragem de Leon serão lembradas, e seu sacrifício servirá de motivação para os próximos heróis continuarem a luta contra as forças das trevas."
                                        );

                                        System.out.println("<-- FIM DE JOGO -->");
                                        break;
                                    }

                                    System.out.print("Mesmo ferido, ele se levanta determinado e lança um poderoso dardo de luz, aniquilando o Lorde das Sombras de uma vez por todas. Leon triunfa sobre a escuridão e continua sua jornada\n" +
                                            "para salvar Rustvalen.\n"
                                    );

                                }
                                else {
                                    System.out.println(perguntasRedias[0]);
                                    System.out.println(respostasRedias[0]);
                                    String resposta1 = sc.next();

                                    if (resposta1.equalsIgnoreCase("a")) {
                                        System.out.println("Maya, a Maga das Palavras, concentra sua energia mágica e pronuncia palavras poderosas que ecoam pelo campo de batalha. Ela conjura uma tempestade de letras e palavras encantadas,\n" +
                                                "lançando-as em direção ao Lorde das Sombras. As palavras se transformam em projéteis brilhantes, atingindo o feiticeiro maligno e enfraquecendo seus poderes sombrios.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.println("Enquanto Maya busca uma oportunidade para atacar o Lorde das Sombras, ela antecipa seus movimentos e lança um poderoso raio sombrio em sua direção. Maya é pega de surpresa,\n" +
                                                "incapaz de se defender a tempo, e é atingida em cheio pelo ataque."
                                        );
                                        vidaPersonagem -= 40;

                                        System.out.printf("%s perdeu 40 pontos de vida.\n", personagemString);
                                    }

                                    if (vidaPersonagem <= 0) {
                                        System.out.println("O impacto é devastador, drenando sua energia vital e deixando-a gravemente ferida. Com um último suspiro, Maya cai no chão, seus olhos se fecham e sua jornada chega a um fim trágico.\n" +
                                                "A bravura e coragem de Maya serão lembradas, e seu sacrifício servirá de motivação para os próximos heróis continuarem a luta contra as forças das trevas."
                                        );

                                        System.out.println("<-- FIM DE JOGO -->");
                                        break;
                                    }

                                    System.out.println("Maya se prepara para dar outro golpe no monstro...\n");

                                    System.out.println(perguntasRedias[1]);
                                    System.out.println(respostasRedias[1]);
                                    String resposta2 = sc.next();

                                    if (resposta2.equalsIgnoreCase("d")) {
                                        System.out.println("Aria libera um feixe de luz brilhante, uma explosão de energia luminosa que envolve o Lorde das Sombras. Seu ataque final é implacável, atravessando as defesas sombrias\n" +
                                                "e atingindo em cheio o coração do feiticeiro corrompido. O Lorde das Sombras é consumido pela luz, seu poder enfraquecido até ser completamente derrotado.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.println("Maya, a Maga das Palavras, é atingida por um poderoso feitiço sombrio lançado pelo Lorde das Sombras. Ela sente a energia negra se espalhando por seu corpo, enfraquecendo-a\n" +
                                                "momentaneamente.\n"
                                        );
                                        vidaPersonagem -= 60;

                                        System.out.printf("%s perdeu 60 pontos de vida.\n", personagemString);
                                    }

                                    if (vidaPersonagem <= 0) {
                                        System.out.println("O impacto é devastador, drenando sua energia vital e deixando-o gravemente ferido. Com um último suspiro, Leon cai no chão, seus olhos se fecham e sua jornada chega a um fim trágico.\n" +
                                                "A bravura e coragem de Leon serão lembradas, e seu sacrifício servirá de motivação para os próximos heróis continuarem a luta contra as forças das trevas."
                                        );

                                        System.out.println("<-- FIM DE JOGO -->");
                                        break;
                                    }

                                    System.out.println("Mas em um último esforço de determinação, Maya canaliza suas últimas reservas de magia. Com uma explosão de energia, ela conjura um encantamento devastador que envolve o\n" +
                                            "Lorde das Sombras em chamas luminosas. O feiticeiro corrupto grita de dor e desespero enquanto é consumido pelas chamas da purificação. Com sua derrota, a escuridão se dissipa e a luz\n" +
                                            "retorna às Terras Proibidas.\n"
                                    );
                                }

                                System.out.printf("Após derrotar o Lorde das Sombras, %s sente uma sensação de triunfo e esperança se renovando em seu coração. Sabendo que a batalha final\n" +
                                                "para recuperar a luz em RustvaleN se aproxima, %s se prepara para a última e mais desafiadora etapa de sua jornada.\n\n"
                                        , personagemString, personagemString
                                );

                                // CAPÍTULO 3 - BATALHA FINAL
                                System.out.printf("Após uma longa jornada repleta de desafios e superações, %s finalmente alcança a entrada da caverna onde repousa o temível Dragão Sombrio.\n" +
                                                "A atmosfera ao redor é densa e sombria, repleta de um silêncio assustador.\n\n"
                                        , personagemString
                                );

                                System.out.printf("Ao enfrentarem o Dragão Sombrio, %s compreendem a terrível realidade: qualquer ataque que sofrerem das garras afiadas ou das chamas\n" +
                                                "abrasadoras do dragão resultará em morte instantânea. Cientes do risco iminente, %s sabe que essa batalha não permite erros ou hesitação. Com seus corações\n" +
                                                "cheios de coragem, %s se prepara para o confronto final, determinado a encontrar uma estratégia para superar o inimigo indomável e restaurar a luz ao mundo."
                                        , personagemString, personagemString, personagemString
                                );

                                System.out.println("<-- INÍCIO DA BATALHA -->\n");

                                System.out.printf("No início da batalha, o Dragão Sombrio lança-se ferozmente contra %s. Suas garras afiadas cortam o ar com velocidade impressionante,\n" +
                                                "enquanto suas chamas devoradoras ameaçam consumir tudo ao seu redor. %s, prepara para o confronto épico, se esquiva com agilidade e lança sua magia e\n" +
                                                "ataques contra a poderosa criatura.\n\n"
                                        , personagemString, personagemString
                                );

                                System.out.println("<-- PREPARAÇÃO DO ATAQUE -->\n");

                                if (personagem == 1) {
                                    System.out.println(perguntasClarus[0]);
                                    System.out.println(respostasClarus[0]);
                                    String resposta1 = sc.next();

                                    if (resposta1.equalsIgnoreCase("c")) {
                                        System.out.println("Aria concentra sua energia e lança um poderoso feitiço de luz em direção ao Dragão Sombrio. Um raio luminoso corta os céus, buscando atingir o ponto fraco da\n" +
                                                "criatura. Com precisão e determinação, o feitiço se choca contra as escamas negras do dragão, causando uma explosão de luz e enfraquecendo sua defesa.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.printf("O Dragão Sombrio, com sua imponente presença, lança um ataque avassalador contra %s. As chamas ardentes do Dragão Sombrio envolvem %s, consumindo sua força vital.\n" +
                                                        "Apesar de seus esforços para resistir, %s é incapaz de suportar o poder avassalador do dragão. Seu corpo é consumido pelo fogo, e %s cai derrotada diante do\n" +
                                                        "imponente monstro.\n"
                                                , personagemString, personagemString, personagemString, personagemString
                                        );
                                        vidaPersonagem -= 100;

                                        System.out.printf("%s perdeu 100 pontos de vida.\n", personagemString);
                                    }

                                    System.out.println("Aria se prepara para dar outro golpe no monstro...\n");

                                    System.out.println(perguntasClarus[1]);
                                    System.out.println(respostasClarus[1]);
                                    String resposta2 = sc.next();

                                    if (resposta2.equalsIgnoreCase("b")) {
                                        System.out.println("Aria, envolta em uma determinação feroz, convoca todas as suas habilidades e poderes mágicos para um último ataque contra o Dragão Sombrio. Com uma explosão de energia luminosa,\n" +
                                                "ela lança um feitiço poderoso que atravessa as defesas do monstro e atinge em cheio seu ponto fraco.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.printf("O Dragão Sombrio, com sua imponente presença, lança um ataque avassalador contra %s. As chamas ardentes do Dragão Sombrio envolvem %s, consumindo sua força vital.\n" +
                                                        "Apesar de seus esforços para resistir, %s é incapaz de suportar o poder avassalador do dragão. Seu corpo é consumido pelo fogo, e %s cai derrotada diante do\n" +
                                                        "imponente monstro.\n"
                                                , personagemString, personagemString, personagemString, personagemString
                                        );
                                        vidaPersonagem -= 100;

                                        System.out.printf("%s perdeu 100 pontos de vida.\n", personagemString);
                                    }

                                }
                                else if (personagem == 2) {
                                    System.out.println(perguntasClarus[0]);
                                    System.out.println(respostasClarus[0]);
                                    String resposta1 = sc.next();

                                    if (resposta1.equalsIgnoreCase("c")) {
                                        System.out.println("Leon, com seus dardos afiados e mira precisa, concentra-se em seu próximo alvo: o Dragão Sombrio. Com um movimento rápido, ele lança uma salva de dardos em direção ao\n" +
                                                "imponente monstro. Os dardos cortam o ar e atingem o corpo escamoso do dragão, perfurando sua pele resistente. O dragão solta um rugido de dor, mas permanece de pé, pronto para\n" +
                                                "retaliar.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.printf("O Dragão Sombrio, com sua imponente presença, lança um ataque avassalador contra %s. As chamas ardentes do Dragão Sombrio envolvem %s, consumindo sua força vital.\n" +
                                                        "Apesar de seus esforços para resistir, %s é incapaz de suportar o poder avassalador do dragão. Seu corpo é consumido pelo fogo, e %s cai derrotada diante do\n" +
                                                        "imponente monstro.\n"
                                                , personagemString, personagemString, personagemString, personagemString
                                        );
                                        vidaPersonagem -= 100;

                                        System.out.printf("%s perdeu 100 pontos de vida.\n", personagemString);
                                    }

                                    System.out.println("Leon se prepara para dar outro golpe no monstro...\n");

                                    System.out.println(perguntasClarus[1]);
                                    System.out.println(respostasClarus[1]);
                                    String resposta2 = sc.next();

                                    if (resposta2.equalsIgnoreCase("b")) {
                                        System.out.println("Com um último arremesso certeiro, Leon lança seus dardos com maestria contra o corpo do Dragão Sombrio. Os projéteis perfuram as escamas sombrias, causando uma\n" +
                                                "reação explosiva.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.printf("O Dragão Sombrio, com sua imponente presença, lança um ataque avassalador contra %s. As chamas ardentes do Dragão Sombrio envolvem %s, consumindo sua força vital.\n" +
                                                        "Apesar de seus esforços para resistir, %s é incapaz de suportar o poder avassalador do dragão. Seu corpo é consumido pelo fogo, e %s cai derrotada diante do\n" +
                                                        "imponente monstro.\n"
                                                , personagemString, personagemString, personagemString, personagemString
                                        );
                                        vidaPersonagem -= 100;

                                        System.out.printf("%s perdeu 100 pontos de vida.\n", personagemString);
                                    }
                                }
                                else {
                                    System.out.println(perguntasClarus[0]);
                                    System.out.println(respostasClarus[0]);
                                    String resposta1 = sc.next();

                                    if (resposta1.equalsIgnoreCase("c")) {
                                        System.out.println("\n" +
                                                "Com seu livro de magias em mãos, Maya, a Maga das Palavras, concentra todo o seu poder para lançar um feitiço devastador contra o Dragão Sombrio. Ela recita palavras arcanas com\n" +
                                                "determinação, enquanto símbolos mágicos se formam no ar ao seu redor. Em um estonteante espetáculo de magia, poderosas rajadas de energia elemental são disparadas em direção ao\n" +
                                                "dragão, envolvendo-o em um redemoinho de fogo, gelo e relâmpagos.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.printf("O Dragão Sombrio, com sua imponente presença, lança um ataque avassalador contra %s. As chamas ardentes do Dragão Sombrio envolvem %s, consumindo sua força vital.\n" +
                                                        "Apesar de seus esforços para resistir, %s é incapaz de suportar o poder avassalador do dragão. Seu corpo é consumido pelo fogo, e %s cai derrotada diante do\n" +
                                                        "imponente monstro.\n"
                                                , personagemString, personagemString, personagemString, personagemString
                                        );
                                        vidaPersonagem -= 100;

                                        System.out.printf("%s perdeu 100 pontos de vida.\n", personagemString);
                                    }

                                    System.out.println("Maya se prepara para dar outro golpe no monstro...\n");

                                    System.out.println(perguntasClarus[1]);
                                    System.out.println(respostasClarus[1]);
                                    String resposta2 = sc.next();

                                    if (resposta2.equalsIgnoreCase("b")) {
                                        System.out.println("Ela entoa encantamentos ancestrais e canaliza seu poder, criando uma esfera de energia pura em suas mãos. Com um gesto audacioso, Maya lança a esfera diretamente\n" +
                                                "no coração do monstro.\n"
                                        );

                                        System.out.printf("Pontos de vida: %d\n", vidaPersonagem);
                                    } else {
                                        System.out.printf("O Dragão Sombrio, com sua imponente presença, lança um ataque avassalador contra %s. As chamas ardentes do Dragão Sombrio envolvem %s, consumindo sua força vital.\n" +
                                                        "Apesar de seus esforços para resistir, %s é incapaz de suportar o poder avassalador do dragão. Seu corpo é consumido pelo fogo, e %s cai derrotada diante do\n" +
                                                        "imponente monstro.\n"
                                                , personagemString, personagemString, personagemString, personagemString
                                        );
                                        vidaPersonagem -= 100;

                                        System.out.printf("%s perdeu 100 pontos de vida.\n", personagemString);
                                    }
                                }

                                System.out.printf("O Dragão Sombrio solta um rugido estrondoso enquanto seu corpo é envolto em chamas purificadoras, que consomem sua essência maligna. O dragão\n" +
                                                "cambaleia e cai derrotado, dissipando-se em uma névoa sombria. %s, exausta, mas vitoriosa, observa o resultado de sua coragem e determinação, sabendo que\n" +
                                                "sua bravura foi crucial para trazer a luz de volta a RustvaleN.\n\n"
                                        , personagemString
                                );
if (personagem == 2) {
System.out.printf("O Amuleto da Luz é finalmente recuperado das garras do monstro, e seu brilho irradia esperança e renovação.\n" +
"RustvaleN, outrora mergulhada em trevas e desespero, agora é banhada pela luz radiante do amuleto sagrado. A escuridão é dissipada, revelando a beleza e a\n" +
"prosperidade da terra que há muito tempo estava perdida.\n\n" +
"%s celebra sua vitória, sabendo que sua coragem e sacrifício trouxeram a redenção para RustvaleN. As pessoas da terra se unem em gratidão,\n" +
"reconhecendo o herói que o libertou das garras do mal.\n\n" +
"Agora, com a luz restaurada, RustvaleN floresce mais uma vez. O legado do %s viverá para sempre na memória de todos, lembrando-os de que, mesmo\n" +
"diante das mais sombrias adversidades, a esperança e a determinação podem vencer todas as trevas.\n\n"
,personagemString, personagemString
);
} else {
System.out.printf("O Amuleto da Luz é finalmente recuperado das garras do monstro, e seu brilho irradia esperança e renovação.\n" +
"RustvaleN, outrora mergulhada em trevas e desespero, agora é banhada pela luz radiante do amuleto sagrado. A escuridão é dissipada, revelando a beleza e a\n" +
"prosperidade da terra que há muito tempo estava perdida.\n\n" +
"%s celebra sua vitória, sabendo que sua coragem e sacrifício trouxeram a redenção para RustvaleN. As pessoas da terra se unem em gratidão,\n" +
"reconhecendo o heroína que o libertou das garras do mal.\n\n" +
"Agora, com a luz restaurada, RustvaleN floresce mais uma vez. O legado do %s viverá para sempre na memória de todos, lembrando-os de que, mesmo\n" +
"diante das mais sombrias adversidades, a esperança e a determinação podem vencer todas as trevas.\n\n"
,personagemString, personagemString
);
}

System.out.println("<-- FIM DE JOGO -->");

System.out.println("<-- OBRIGADO POR JOGAR 👋👋👋👋 -->");




                            } else {
                                System.out.println("A senha digitada é incorreta. A porta permanece trancada, revelando a importância de encontrar o código correto antes que seja tarde demais.\n");
                                tentativas--;
                            }

                            if (tentativas == 0) {
                                System.out.printf("Com a terceira tentativa fracassada, a porta se fecha irrevogavelmente, impedindo o acesso às Terras Proibidas. O destino de RustavaleN permanece\n" +
                                                "envolto em trevas, enquanto a esperança de %s desvanece lentamente.\n\n"
                                        , personagemString
                                );

                                System.out.println("<-- FIM DE JOGO -->");

                                break;
                            }
                        } while (tentativas != 0);

                        break;
                    case 2:
                        System.out.println("<-- INFORMAÇÕES SOBRE O JOGO -->\n");

                        System.out.println("O RustvaleN é um projeto da disciplina Projeto Integrador I (PI) do curso de Tecnologia em Análise e Desenvolvimento de Sistemas do primeiro " + "\n" +
                                "semestre, no Centro Universitário Senac - Santo Amaro visa, na medida do possível, promover a integração de conhecimentos das diversas disciplinas oferecidas " + "\n" +
                                "em cada período correspondente a disciplina de PI. Dentro deste contexto, o projeto de PI I tem por objetivo primário aprimorar nosso conhecimento de Algoritmos " + "\n" +
                                "e Programação, adquirido na respectiva disciplina, considerando também outras disciplinas cursadas no 1º período do curso.\n" +
                                "Por fim, vale destacar que na avaliação do projeto o professor considerou fortemente a aplicação dos elementos de desenvolvimento abordados na disciplina \n" +
                                "Algoritmos e Programação durante o 1º período, assim como a aplicação da abordagem Design Thinking e utilização das ferramentas Trello e GitHub.\n"
                        );

                        System.out.println("<-- INFORMAÇÕES SOBRE A DIFICULDADE DO JOGO -->\n");

                        System.out.println("1 - Fácil: A vida do personagem é definida para 999 pontos de vida, o que significa que é impossível perder durante o jogo. Isso permite que os jogadores aproveitem mais a\n" +
                                "história e a experiência de jogo, sem se preocupar em perder suas vidas.\n\n"
                        );

                        System.out.println("2 - Normal: A vida do personagem é definida para 100 pontos de vida, o que significa que é possível de perder durante o jogo. A dificuldade se mantém constante ao longo da jornada,\n" +
                                "proporcionando uma experiência desafiadora desde o início até o final. Conforme o personagem enfrenta chefes e realiza desafios, ele pode perder vida caso cometa erros ou não tenha um desempenho\n" +
                                "satisfatório. Essa mecânica adiciona um elemento de tensão e estratégia, incentivando os jogadores a se concentrarem e aperfeiçoarem suas habilidades para progredir no jogo com sucesso.\n\n"
                        );

                        System.out.println("3 - Difícil: A vida do personagem é definida para 1 ponto de vida, o que significa que é possível perder durante o jogo. Essa configuração desafia os jogadores que buscam a perfeição,\n" +
                                "pois exige que acertem todos os desafios sem cometer nenhum erro. Qualquer deslize resultará em uma derrota imediata. Essa dificuldade extrema incentiva os jogadores a se concentrarem, melhorarem suas\n" +
                                "habilidades e executarem estratégias com precisão para avançar com sucesso no jogo. A sensação de conquista ao superar cada desafio sem errar é recompensadora para os amantes do perfeccionismo.\n\n"
                        );

                        break;
                    case 3:
                        System.out.println("<-- PERSONAGENS -->\n");

                        // ARIA
                        System.out.println("Aria, a Feiticeira das Chamas, foi escolhida pelos deuses para enfrentar essa terrível ameaça. Ela possuía uma habilidade única de manipular o\n" +
                                "fogo e um conhecimento profundo de magia. Seu ponto forte era sua maestria nas estruturas de repetições, permitindo que ela conjurasse feitiços poderosos e\n" +
                                "sustentasse ataques incansáveis contra seus inimigos. Com sua destreza em criar loops mágicos, Aria era capaz de lançar uma enxurrada de chamas destrutivas e\n" +
                                "controlar o fogo ao seu redor. No entanto, sua fraqueza residia em seu foco excessivo na perfeição. Aria era uma perfeccionista obstinada, sempre buscando\n" +
                                "otimizar suas estruturas de repetições. Isso a deixava suscetível a ficar sobrecarregada pelo peso da expectativa e podia afetar sua tomada de decisões rápidas\n" +
                                "durante batalhas intensas. Além disso, sua magia era menos eficaz contra inimigos resistentes ao fogo ou capazes de extinguir chamas com facilidade.\n\n"
                        );

                        // LEON
                        System.out.println("Leon, o Arqueiro Mestre dos Dardos, foi escolhido pelos deuses para enfrentar essa terrível ameaça. Ele possuía habilidades excepcionais com arcos e\n" +
                                "flechas e um conhecimento profundo sobre o uso de arrays. Seu ponto forte estava em sua capacidade de utilizar arrays para armazenar e manipular informações\n" +
                                "estratégicas, permitindo-lhe tomar decisões precisas e disparar ataques precisos contra seus inimigos. No entanto, sua fraqueza residia em sua vulnerabilidade\n" +
                                "à falta de visão ampla do cenário. Leon era um especialista em detalhes minuciosos e análises precisas, mas isso às vezes o impedia de ver a imagem completa.\n" +
                                "Essa fraqueza o tornava suscetível a estratégias de combate imprevisíveis e a situações caóticas onde a organização estrita dos arrays era menos eficaz.\n\n"
                        );

                        // MAYA
                        System.out.println("Maya, a Maga das Palavras, ela era conhecida por sua habilidade excepcional em trabalhar com textos e realizar operações complexas em cadeias de\n" +
                                "caracteres. O ponto forte de Maya estava em sua capacidade de manipular strings de maneira eficiente e realizar transformações poderosas. Ela podia dividir,\n" +
                                "combinar, substituir e formatar strings com facilidade, facilitando a resolução de problemas relacionados à manipulação de texto. Sua expertise em manipulação\n" +
                                "de strings a tornava uma programadora talentosa nesse aspecto. No entanto, sua fraqueza estava relacionada à dificuldade em lidar com problemas de localização\n" +
                                "e internacionalização. Maya tinha dificuldade em adaptar strings a diferentes idiomas, formatos de data e moedas, o que a deixava vulnerável a problemas de\n" +
                                "compatibilidade em aplicações multilíngues.\n\n"
                        );

                        break;
                    case 4:
                        System.out.println("<-- CHEFES -->\n");

                        // DILSONS, CHEFE DO PÂNTANO
                        System.out.println("Dilsons, O Chefe do Pântano é uma criatura meio humanoide, meio serpente, que guarda a entrada das Terras Proibidas. Sua força e poder venenoso representam um\n" +
                                "desafio para os heróis. No entanto, o Chefe do Pântano possui uma fraqueza peculiar: estruturas de repetição. Padrões repetitivos de ataques confundem\n" +
                                "e enfraquecem o chefe.\n\n"
                        );

                        // REDIAS, O LORDE DAS SOMBRAS
                        System.out.println("Redias, O Lorde das Sombras, um feiticeiro poderoso e corrompido pelo Flagelo das Trevas, é o segundo chefe que os heróis encontram em sua jornada.\n" +
                                "Apesar de sua habilidade em utilizar magias sombrias e invocar criaturas das trevas, o Lorde das Sombras possui uma fraqueza singular: arrays. A manipulação de\n" +
                                "conjuntos organizados de informações, como arrays, interfere na sua capacidade de conjurar feitiços e controlar as criaturas ao seu redor. Ao explorar essa fraqueza,\n"+
                                "os Guardiões Mágicos conseguem desequilibrar os poderes do Lorde das Sombras e derrotá-lo.\n\n"
                        );

                        // CLARUS, O DRAGÃO SOMBRIO
                        System.out.println("Clarus, O Dragão Sombrio, uma terrível criatura corrompida pelo Flagelo das Trevas, é o último desafio enfrentado pelos Guardiões Mágicos.\n" +
                                "Este poderoso dragão possui escamas resistentes e ataques de fogo devastadores, mas tem uma fraqueza surpreendente: arrays e estruturas de repetições.\n"+
                                "A capacidade dos Guardiões de utilizar conjuntos organizados de informações e realizar ações repetitivas enfraquece as defesas do Dragão Sombrio e o\n" +
                                "deixa suscetível a ataques. Ao explorar essa fraqueza estratégica, os heróis conseguem enfraquecer o dragão e banir a escuridão que o consome.\n\n"
                        );

                        break;
                    case 5:
                        System.out.print("<-- JOGO ENCERRADO, ATÉ LOGO! 👋👋👋 -->");
                        break;
                    default:
                        System.out.println("Você inseriu uma opção inválida! Digite novamente!");
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nCaracteres não permitidos, insira apenas números!\n");
                sc.nextLine();
            }
        } while (iniciar != 1 && iniciar != 5);

        sc.close();
    }
}

