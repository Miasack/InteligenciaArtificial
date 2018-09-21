import java.util.Scanner;

class Chatbot {
    public String lut[][];

    public Chatbot() {

        lut = new String[50][2];
        lut[0][0] = "ola";
        lut[0][1] = "Como vai você?";

        lut[1][0] = "estou bem e voce";
        lut[1][1] = "Otimo agora, falando com você!";

        lut[2][0] = "voce por acaso teria um nome";
        lut[2][1] = "Por enquanto não, meu criador ainda está pensando nisso.";

        lut[3][0] = "o que voce sabe fazer";
        lut[3][1] = "Poucas coisas ainda, como responder a algumas perguntas. Mas meu criador está trabalhando nisso";

        lut[4][0] = "quem e o seu criador";
        lut[4][1] = "Caio aquele lindo!";

        lut[5][0] = "vamo jogar um lolzinho";
        lut[5][1] = "Simbora men!";

        lut[6][0] = "qual e o teu main";
        lut[6][1] = "Meu main é Master Yi por que não precisa de dedo para jogar com ele. KKKKKK";

        lut[7][0] = "eoq maluco";
        lut[7][1] = "HIIIIIIII";

        lut[8][0] = "eu vou cair";
        lut[8][1] = "Qual foi borracha?";

        lut[9][0] = "tas com fome";
        lut[9][1] = "Vou comer seu... Bolo.";

        lut[10][0] = "bora fubar um dereguejohson";
        lut[10][1] = "nn men to de boa";

        lut[11][0] = "bora fubar um sehloiro";
        lut[11][1] = "ss fon trab";

        lut[12][0] = "olha o bixo vindo muleque";
        lut[12][1] = "Corre boy!!";

        lut[13][0] = "ios ou android";
        lut[13][1] = "Digamos que de acordo com a situação econônmica atual de todo o globo terrestre, eu concluo que você come o bolo.";

        lut[14][0] = "quem e o melhor cantor da atualidade";
        lut[14][1] = "Sem dúvidas é César, fala tu!";

        lut[15][0] = "vou assistir netflix";
        lut[15][1] = "Vai lá alone, nem tem a pitanguinha para assistir contigo.";

        lut[16][0] = "espelho espelho meu tem alguem mais bonito que eu";
        lut[16][1] = "Eu não queria dizer nada não, mas você nunca chegará aos pés de Breno.";

        lut[17][0] = "me indica uma musica boa";
        lut[17][1] = "Dedo no cu e gritaria - Rogério Skylab";

        lut[18][0] = "acho que vou jogar de vayne";
        lut[18][1] = "Quem joga com isso merece morrer!";

        lut[19][0] = "and i will always love ";
        lut[19][1] = "YOUUUUUUUUUUUUUUUUUUUU";

        lut[20][0] = "mc ou bk";
        lut[20][1] = "Só quem come Mc é criancinha, o négocio é comer Mega Stacker 4.0 Atômico e entupir as veias.";

        lut[21][0] = "bom dia";
        lut[21][1] = "Bom dia, flor do dia!";

        lut[22][0] = "boa tarde";
        lut[22][1] = "Tenho fome!";

        lut[23][0] = "boa noite";
        lut[23][1] = "Ta tarde men, vai dormir!";

        lut[24][0] = "tas bem";
        lut[24][1] = "Tô não, tenho depresso \"/";

        lut[25][0] = "que horas sao";
        lut[25][1] = "É hora da aventura";

        lut[26][0] = "ey ey eymael";
        lut[26][1] = "O democráta Cristão";

        lut[27][0] = "cade o baiano";
        lut[27][1] = "Nào sei sinhô, sou trabaiadô";

        lut[28][0] = "quem vai ser presidente do brasil";
        lut[28][1] = "Bononoro que não vai ser, glória a Deuxx";

        lut[29][0] = "fale um pouco sobre a ursal";
        lut[29][1] = "Criado por Ciro Gomes, Ursal a uma “nova ordem mundial”, que eliminaria todas as fronteiras do continente, surgindo uma única nação, a “Pátria Grande”";

        lut[30][0] = "se perder pra dex";
        lut[30][1] = "Eu mio desse joguinho";

        lut[31][0] = "jailton e breno";
        lut[31][1] = "São um casal, mas eles não assumem";

        lut[32][0] = "o que voce sabe sobre a excalibur";
        lut[32][1] = "Vai ser a nova ordem mundial de criação de softwares!";

        lut[33][0] = "qual foi borracha";
        lut[33][1] = "Irineu, você não sabe e nem eu!";

        lut[34][0] = "eae meu consagrado";
        lut[34][1] = "Fala meu confederado";

        lut[35][0] = "gosta de animes";
        lut[35][1] = "Meh!";

        lut[36][0] = "e na sola da mao";
        lut[36][1] = "É na palma da bota!";

        lut[37][0] = "e na palma da bota";
        lut[37][1] = "É na sola da mão!";

        lut[38][0] = "isso e um absurdo";
        lut[38][1] = "Dá que eu te dou outra!";

        lut[39][0] = "se o bolsonoro ganhar as eleicoes";
        lut[39][1] = "Se bolo de milho ganhar, eu mio desse país";

        lut[40][0] = "recife ta quente ou frio";
        lut[40][1] = "Ta estralando!";

        lut[41][0] = "amo voce";
        lut[41][1] = "Você me ama, somos uma familía feliz";

        lut[42][0] = "...";
        lut[42][1] = "...";

        lut[43][0] = "eu quero cafe";
        lut[43][1] = "Esse lugar é uma porcaria, que não... Merda nenhuma!";

        lut[44][0] = "manda um recado do dia dos namorados";
        lut[44][1] = "Olá Marilene. Tainha, vinho e muito sexo.";

        lut[45][0] = "qual a tua role no lol";
        lut[45][1] = "O que é role? Eu so jogo de blitz. Um abraço pra quem joga de blitz";

        lut[46][0] = "rexpeita o rato";
        lut[46][1] = "UHUUUUULL";

        lut[47][0] = "o que que houve";
        lut[47][1] = "Não to te entendendo!";

        lut[48][0] = "o mapa ta wardado neguin";
        lut[48][1] = "Então nem peita";

        lut[49][0] = "cesar morreu pra torre de novo";
        lut[49][1] = "4 report é ban!";
    }

    public float percentageCommomWords(String stringA, String stringB) {
        String[] stringASplit = stringA.split(" ");
        String[] stringBSplit = stringB.split(" ");

        int count = 0;

        for (int i = 0; i < stringASplit.length ; i++) {
            for (int j = 0; j < stringBSplit.length ; j++) {
                if(stringASplit[i].equalsIgnoreCase(stringBSplit[j])) {
                    count++;
                }
            }
        }

        int min = Math.min(stringASplit.length, stringBSplit.length);

        return (float)count/(float)min;
    }

    public void print(String a) {

        a = RemoverAcentos.tirarInterrogacao(a);
        a = RemoverAcentos.remover(a);
        a = a.toLowerCase();

        for (int i = 0; i < lut.length ; i++) {
            System.out.printf(percentageCommomWords(a, lut[i][0])+" ");
            System.out.printf(lut[i][0]+" ");
            System.out.println(a);
        }
    }

    public String ask(String question) {
        String answer = "Não posso responder. Ainda...";
        boolean found = false;
        boolean end = false;
        int i = 0;

        question = RemoverAcentos.tirarInterrogacao(question);
        question = RemoverAcentos.remover(question);
        question = question.toLowerCase();
//        answer = question;

        while(!found && !end) {
            if(question.equals(lut[i][0])) {
                found = true;
                answer = lut[i][1];
            }

            if (!found) {
                double corte = 0;
                double perc;

                for (int j = 0; j < lut.length ; j++) {
                    perc = percentageCommomWords(question, lut[j][0]);
                    if( perc > corte) {
                        answer = lut[j][1];
                        corte = perc;
                        found = true;
                    }
                }
            }

            ++i;
            if(i >= lut.length) {
                end = true;
            }
        }
        return answer;
    }
}

class RemoverAcentos {
    static String acentuado = "çÇáéíóúýÁÉÍÓÚÝàèìòùÀÈÌÒÙãõñäëïöüÿÄËÏÖÜÃÕÑâêîôûÂÊÎÔÛ";
    static String semAcento = "cCaeiouyAEIOUYaeiouAEIOUaonaeiouyAEIOUAONaeiouAEIOU";
    static char[] tabela;
    static {
        tabela = new char[256];
        for (int i = 0; i < tabela.length; ++i) {
            tabela [i] = (char) i;
        }
        for (int i = 0; i < acentuado.length(); ++i) {
            tabela [acentuado.charAt(i)] = semAcento.charAt(i);
        }
    }
    public static String remover (final String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt (i);
            if (ch < 256) {
                sb.append (tabela [ch]);
            } else {
                sb.append (ch);
            }
        }
        return sb.toString();
    }
    public static String tirarInterrogacao(String nome) {
        nome = nome.replaceAll("\\?", "");
        nome = nome.replaceAll(",", "");
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {

        Chatbot bot = new Chatbot();

        Scanner s = new Scanner(System.in);
        System.out.println("Oi, eu sou um ChatBot! o que você quer saber?");
        String question = s.nextLine();

//        bot.print(question);

        while(!question.equalsIgnoreCase("sair")) {
            System.out.println(bot.ask(question));
            question = s.nextLine();
        }
    }
}
