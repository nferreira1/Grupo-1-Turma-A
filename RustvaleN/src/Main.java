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
                        break;
                    case 4:
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

