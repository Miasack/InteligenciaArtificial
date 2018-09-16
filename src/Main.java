import java.util.Scanner;

class Chatbot {
    public String lut[][];

    public Chatbot() {

        lut = new String[50][3];
        lut[0][0] = "Pergunta A";
        lut[0][1] = "Resposta A";
        lut[0][2] = "Primeiro";


        lut[1][0] = "Pergunta B";
        lut[1][1] = "Resporta B";

        lut[2][0] = "Pergunta C";
        lut[2][1] = "Resporta C";

        lut[3][0] = "Pergunta D";
        lut[3][1] = "Resporta D";

        lut[4][0] = "Pergunta E";
        lut[4][1] = "Resporta E";

        lut[5][0] = "Pergunta F";
        lut[5][1] = "Resporta F";

        lut[6][0] = "Pergunta G";
        lut[6][1] = "Resporta G";

        lut[7][0] = "Pergunta G";
        lut[7][1] = "Resporta G";

        lut[8][0] = "Pergunta G";
        lut[8][1] = "Resporta G";

        lut[9][0] = "Pergunta G";
        lut[9][1] = "Resporta G";

        lut[10][0] = "Pergunta G";
        lut[10][1] = "Resporta G";

        lut[11][0] = "Pergunta G";
        lut[11][1] = "Resporta G";

        lut[12][0] = "Pergunta G";
        lut[12][1] = "Resporta G";

        lut[13][0] = "Pergunta G";
        lut[13][1] = "Resporta G";

        lut[14][0] = "Pergunta G";
        lut[14][1] = "Resporta G";

        lut[15][0] = "Pergunta G";
        lut[15][1] = "Resporta G";

        lut[16][0] = "Pergunta G";
        lut[16][1] = "Resporta G";

        lut[17][0] = "Pergunta G";
        lut[17][1] = "Resporta G";

        lut[18][0] = "Pergunta G";
        lut[18][1] = "Resporta G";

        lut[19][0] = "Pergunta G";
        lut[19][1] = "Resporta G";

        lut[20][0] = "Pergunta G";
        lut[20][1] = "Resporta G";

        lut[21][0] = "Pergunta G";
        lut[21][1] = "Resporta G";

        lut[22][0] = "Pergunta G";
        lut[23][1] = "Resporta G";

        lut[24][0] = "Pergunta G";
        lut[24][1] = "Resporta G";

        lut[25][0] = "Pergunta G";
        lut[25][1] = "Resporta G";

        lut[26][0] = "Pergunta G";
        lut[26][1] = "Resporta G";

        lut[27][0] = "Pergunta G";
        lut[27][1] = "Resporta G";

        lut[28][0] = "Pergunta G";
        lut[28][1] = "Resporta G";

        lut[29][0] = "Pergunta G";
        lut[29][1] = "Resporta G";

        lut[30][0] = "Pergunta G";
        lut[30][1] = "Resporta G";

        lut[31][0] = "Pergunta G";
        lut[31][1] = "Resporta G";

        lut[32][0] = "Pergunta G";
        lut[32][1] = "Resporta G";

        lut[33][0] = "Pergunta G";
        lut[33][1] = "Resporta G";

        lut[34][0] = "Pergunta G";
        lut[34][1] = "Resporta G";

        lut[35][0] = "Pergunta G";
        lut[35][1] = "Resporta G";

        lut[36][0] = "Pergunta G";
        lut[36][1] = "Resporta G";

        lut[37][0] = "Pergunta G";
        lut[37][1] = "Resporta G";

        lut[38][0] = "Pergunta G";
        lut[38][1] = "Resporta G";

        lut[39][0] = "Pergunta G";
        lut[39][1] = "Resporta G";

        lut[40][0] = "Pergunta G";
        lut[40][1] = "Resporta G";

        lut[41][0] = "Pergunta G";
        lut[41][1] = "Resporta G";

        lut[42][0] = "Pergunta G";
        lut[42][1] = "Resporta G";

        lut[43][0] = "Pergunta G";
        lut[43][1] = "Resporta G";

        lut[44][0] = "Pergunta G";
        lut[44][1] = "Resporta G";

        lut[45][0] = "Pergunta G";
        lut[45][1] = "Resporta G";

        lut[46][0] = "Pergunta G";
        lut[46][1] = "Resporta G";

        lut[47][0] = "Pergunta G";
        lut[47][1] = "Resporta G";

        lut[48][0] = "Pergunta G";
        lut[48][1] = "Resporta G";

        lut[49][0] = "Pergunta G";
        lut[49][1] = "Resporta G";
    }

    public String ask(String question) {
        String answer = "Não posso responder";
        boolean found = false;
        boolean end = false;
        int i = 0;
        while(!found && !end) {
            if(question.equalsIgnoreCase(lut[i][0]) || question.contains(lut[i][2])) {
                found = true;
                answer = lut[i][1];
            }
            ++i;
            if(i >= lut.length) {
                end = true;
            }
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        Chatbot bot = new Chatbot();

        Scanner s = new Scanner(System.in);
        System.out.println("Oi, eu sou um ChatBot! o que você quer saber?");
        String question = s.nextLine();



        while(!question.equalsIgnoreCase("sair")) {
            System.out.println(bot.ask(question));
            question = s.nextLine();
        }
    }
}