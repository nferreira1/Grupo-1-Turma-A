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

                        break;
                    case 2:
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

