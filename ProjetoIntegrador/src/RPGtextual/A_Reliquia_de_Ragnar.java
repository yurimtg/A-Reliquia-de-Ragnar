package RPGtextual;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A_Reliquia_de_Ragnar {
	
static Scanner ent = new Scanner(System.in);
        //======================================= VARIAVEIS GLOBAIS ===============================================
         
        		static String Nome_P,Nome_I;                  // Variavel do nome dos inimigos.        
        		static int Nivel= 1, Cnivel; 				  // Variaveis de Niveis do personagem e uma de controle do nivel.
        		static int Personagem=0;       				  // Varivel da escolha do personagem.
        		static int HP = 0, cHP, ATK = 0, Mana = 3,cMana=3, Xp,cHP_I, HP_I,ATK_I;   // Variavel de ATK,HP,Mana,XP do personagem / inimigo.        
        		static int Q1; // Variavel que amarzena o numero da questao da batalha. e usada para chamar o feedback da questao.
        		static String Classe[] = {"Sabio","Arquimago","Arcano","Bardo","Atirador de Elite","Sentinela","Templario","Paladino","GuardiÃ£o"}; //Vetor de clases dos personagens.
        //===========================================================================================================
         


public static void main (String[]args) {

	
		Menu();    // chama a funcao menu.
		
		Limpar();
		System.out.println("===============================================================================");
		desenho(2);        //Chama a funcao desenho
		System.out.println("===============================================================================");
		Jornada(0); 	   // chama a funcao Jornada;
		
		Limpar();
		System.out.println("===============================================================================");
		desenho(3);	       //Chama a funcao desenho
		System.out.println("\n===========================================================================\n");
		tutorial(); 	   // chama a funcao tutorial. 
                
//================================ 1 batalha ====================================  
			
			Jornada(1); 										// Chama a funcao jornada.
			Xp = 4;												// Inicia com 4 de Xp, 
            
            HP_I=28; cHP_I=28; ATK_I = 12;  Nome_I = "Garruk"; 	//Inicia as variaveis com o status do inimigo da batalha.
            
            List Batalha = new ArrayList();						// Array list das perguntas da 1ª batalha.
            
            for (int i = 0; i < 5; i++) {						// Laco para prencher o ArrayList das perguntas de 0 a 5; 
				Batalha.add(i);				
			}
            
            
            Collections.shuffle(Batalha);					 	// Embaralha a ordem das perguntas.
            
            for (int i = 0; i < 5; i++) {						// Laco para chama as perguntas.
            	
            	Limpar(); 									    // funcao para pula linhas e limpa a tela.     
            	int Q = PrimeiraBatalha((int)Batalha.get(i));   // Variavel (Q) receber o numero da pergunta.
            	feedbackPrimeiraBatalha(Q);						// Chama a funcao do feedback usando o numero da pergunta da variavel (Q).
            	ent.nextLine(); ent.nextLine();					// Press enter para continuar o codigo.	
                Ataque();										//Chama a funcao Ataque.
            	ent.nextLine();ent.nextLine();
            	if(cHP_I<=0) {desenho (13); ent.nextLine(); break;}	// se o Hp do enimigo chegar a 0 terminha o desafio
                Limpar();										
                	
                if(i==5 && cHP>0 && cHP_I>0) {i=0;}				// se acabar as perguntas e o enimigo nao morrer o repete as pergutas ate zerar o hp do inimigo
         }
              													// Experiencia que o personagem ganha ao finalizar a batalha com sucesso.
             Nivel();											//Chama a funcao nivel
             Xp=0;												// zera o Xp.
             													// Chama a funcao do nivel para aplica a XP ganhado.	
             
//================================ 2 batalha ====================================   
             
             Jornada (2);										// Chama a funcao jornada.
             Xp = 6;											// Inicia com 4 de Xp, 

             HP_I= 54; cHP_I=54; ATK_I = 16; Nome_I = "Guardiao da Terra"; //Inicia as variaveis com o status do inimigo da batalha.
                      
            Collections.shuffle(Batalha);
            for (int i = 0; i < 5; i++) {
            	
            	Limpar();
            	int Q = Segunda_Batalha((int)Batalha.get(i));
                feedback_Segunda_Batalha(Q);
                ent.nextLine(); ent.nextLine();
                Ataque();
                ent.nextLine();ent.nextLine();
                if(cHP_I<=0) {desenho (13); break;}
                Limpar();
                if(i==5 && cHP>0 && cHP_I>0) {i=0;}
                
    }
              
              Nivel();
              Xp=0;
              
//================================ 3 batalha ====================================   
             
              Jornada (3);
              Xp = 6; 
              
              HP_I= 66; cHP_I=66; ATK_I = 17; Nome_I = "Guardiao da Agua";
              
              Collections.shuffle(Batalha);
             
             for (int i = 0; i < 5; i++) {
            	
            	 Limpar();
                 int Q = Terceira_Batalha((int)Batalha.get(i));
                 feedback_Terceira_Batalha(Q);
                 ent.nextLine();ent.nextLine(); 
                 Ataque();
                 ent.nextLine();ent.nextLine();
                 if(cHP_I<=0) {  desenho (13); ent.nextLine(); break; }
                 Limpar();           
                 if(i==5 && cHP>0 && cHP_I>0) {i=0;}
             }
               
               Nivel();
               Xp=0;
               
//================================ 4 batalha ====================================   
               
               
               Jornada (4);
               Xp = 6;
               
               HP_I= 85; cHP_I=85; ATK_I = 19; Nome_I = "Guardiao da Ar";
               
              Collections.shuffle(Batalha);
              
              for (int i = 0; i < 5; i++) {
             	
             	 Limpar();
                  int Q = Quarta_batalha((int)Batalha.get(i));
                  feedback_Quarta_Batalha(Q);
                  ent.nextLine();ent.nextLine(); 
                  Ataque();
                  ent.nextLine();ent.nextLine();
                  if(cHP_I<=0) {  desenho (13); ent.nextLine(); break; }
                  Limpar();           
                  if(i==5 && cHP>0 && cHP_I>0) {i=0;}
                  
              }
              
              
                
                Nivel();   
                Xp=0;
                
//================================ 5 batalha ====================================   
                
                
                Jornada (5);
                Xp = 4;
                
                HP_I= 170; cHP_I=170; ATK_I = 20; Nome_I = "Guardiao do fogo";
                
               Collections.shuffle(Batalha);
               
               for (int i = 6; i < 8; i++) {						 
   				Batalha.add(i);				
   			}
               
               for (int i = 0; i < 8; i++) {
              	
              	 Limpar();
                   int Q = Quinta_Batalha((int)Batalha.get(i));
                   feedback_Quinta_Batalha(Q);
                   ent.nextLine();ent.nextLine(); 
                   Ataque();
                   ent.nextLine();ent.nextLine();
                   if(cHP_I<=0) {  desenho (13); ent.nextLine(); break; }
                   Limpar();           
                   if(i==8 && cHP>0 && cHP_I>0) {i=0;}
               }
                 
                 Nivel();  
                 Xp=0;
                 
                 Jornada(6);
                 
                 
                
	}

// Funcao do menu.
static void Menu() {
	desenho(1);
	int x=0;	
	do {
			System.out.println("MENU:\n(1)Jogar\n(2)Informacao\n\nDigite a opcao desejada:");	
			
			x = ent.nextInt();   // usa para entar em uma das duas opcoes 
			
			if (x==2) {inf();}   // se 
			if (x<1||x>2){System.out.println("Escolha invalida\n");}
			
		}while(x<1||x>2);
	
}	

//Funcao de informacoes do menu.
static void inf(){  
	Limpar();
	System.out.println("=====================================================================\n");
	desenho(7);
	System.out.println("=====================================================================\n");
	
	System.out.println(""+
	"\nA Reliquia de Ragnar, e um jogo RPG que foi desenvolvido como objetivo\n"
	+ "auxiliar nos estudos de matematica. O jogo tem uma historia interesantte\n"
	+ "que prende o jogador, e um sistema de batalha que deixa o aprendizado "
	+ "\nmuito mais divertido e dinamico \n"+
    "\nA Reliquia de Ragnar e um jogo bem intuitivo, Quando o jogo for iniciado"
    +"\ntera um tutorial para entendermos melhor como funciona as batalhas no jogo\n"+
    "\nPara passar os textos basta aperta o enter.\n"+
    "\nPrecione enter para voltar ao menu.\n");
	ent.nextLine();ent.nextLine();
	Limpar();
	Menu();   //retorna para o menu
	
}

// Funcao do tutorial.
static void tutorial() {
    String resposta = null; // variavel de contro de resposta 
    Nome_I = "Barbaro";     //nome do inimigo
    ATK_I = 7; HP_I = 20 ; cHP_I=20; // Ataque e HP do inimigo
    
System.out.println("================================================================================\n"
				 + "Escolha um heroi e junte-se a ele, para aveinturas e historias inimaginaveis\n"
		         + "e desafios assustadores, use estrategia para derrotar seus inimigos e guiar\n"
		         + "nosso heroi ao seu objetivo.\n"
		         + "=================================================================================\n");
        
        System.out.println("Escolha um personagem para seguir com essa incrivel aventura: ");
                           
        Personagens();  // chama a funcao personagem
        	
        System.out.println("\n\n================================================================================\n"
        				 + "Assim que se inicia uma batalha aparecera uma questao relacionado a materia de\n"
        				 + "matematica, responda a pergunta corretamente e cause dano ao seu inimigo, se \n"
        				 + "errar quem sofrera o dano sera voce! \n"
        				 + "================================================================================\n");
        
        ent.nextLine();ent.nextLine();
        
        Limpar();           
       do{
           
           desenho(4);
           desenho(5);
           desenho(10);
        
        System.out.println("Questao1:\n\nO Avicultor diz: \"Se eu tivesse dois Patos a mais, o dobro \ndesse numero"
                + "seria 100.\" Quantos Patos tem ele?\n"
                + "a)  72 Patos\n" +
                  "b)  60 Patos\n" +
                  "c)  80 Patos\n" +
                  "d)  54 Patos\n" +
                  "e)  48 Patos");  //  resposta correta:
        
        System.out.println("Digite a alternativa correta: "); 
        
            
        resposta = ent.next(); // jogador escolhe a alternativa 
        System.out.println("\n");
        
        if(resposta.equalsIgnoreCase("e")){  // se a aternativa estiver correta
           desenho(6);
           cHP_I = cHP_I - ATK;         // inimigo recebe dano
           Xp = Xp +2;                  // jogador recebe +2 de XP
           desenho(10);
           ent.nextLine();ent.nextLine();
            
        }else{System.out.println("Voce errou!, Tente Novamete ");
            
            
            
            ent.nextLine();ent.nextLine();
        }
        
        }while(!resposta.equalsIgnoreCase("e"));  //repete o laco caso a alternativa estiver errada.
        for(int i=0;i<50; i++){System.out.println("");}
       do{
           desenho(4);
           desenho(5);
           desenho(10);
           
        System.out.println("Questao 2:\n\nA Mae e tres vezes mais velha que a filha.\n"
        		         + "Juntas tem 48 anos. Qual a idade de cada uma?\n\n" +
                            "a)  34 e 14\n" +
                            "b)  33 e 15\n" +
                            "c)  36 e 12\n" + // Resposta correta
                            "d)  32 e 16\n" +
                            "e)  30 e 18");                
System.out.println("\nDigite a alternativa correta: ");
            
        resposta = ent.next();
        
        if(resposta.equalsIgnoreCase("c")){
           desenho(6);
           cHP_I = cHP_I - ATK;
           Xp = Xp +2;
           desenho(10);
           ent.nextLine();ent.nextLine();
            
        }else{System.out.println("Voce errou!, Tente Novamete ");

            ent.nextLine();ent.nextLine();
        }
        
        }while(!resposta.equalsIgnoreCase("c"));
        desenho(13);
        Nivel();

}

// Funcao da jornada, que contem toda a historia do jogo.
static void Jornada (int Historia) {
    
	int Desisao, x;   
    boolean caminho = false;
 switch(Historia){ // recebe da variavel historia por parametro pelo main
        /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    
         ================================= Primeira parte da historia =======================================    
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
         case 0:  
        	 
    System.out.println("===============================================================================\n"
   					 + "Na cidade de gali ao norte do Reino de Jace, estavam um grupo com tres amigos\n"
   					 + "aventureiros na taverna do Moe, conversando sobre suas aventuras e tempos \n"
   					 + "de infancia.\n\n"
   					 + "Quando de repente chega um forasteiro desesperado implorando por ajuda...\n"
   					 + "===============================================================================\n");
   	
   	ent.nextLine();ent.nextLine();
   	
   	System.out.println("===============================================================================\n"
   			+ "FORASTEIRO: Por favor alguem me ajuda, estao me seguindo!!!\n\n"
   			+ "Porem ninguem se importa com o pobre rapaz...\n\n" 
   			+ "Em pratos ele se ajoelha e implora mais uma  vez por ajuda.\n"
   			+ "===============================================================================\n");
   	ent.nextLine();
   	
   	System.out.println("===============================================================================\n"
   			+ "Quando aparece um barbaro e vai na direcao do forasteiro com adaga na mao pronto\n"
   			+ "a ataca-lo, e o acerta pelas costas. Nesse momento os aventureiros se levantam e\n"
   			+ "inicia-se a batalha contra o misterioso barbaro...\n"
   			+ "===============================================================================\n");
   	ent.nextLine();
    break;    	 
    
   	
         case 1:
   	System.out.println("=======================================================================================\n"
        		 		  + "Apos a ardua batalha contra o Barbaro, "+Nome_P+" se volta para homem caido no\n"
        		 		  + "chao e pergunta.\n\n"
        		 		  +  Nome_P+": -Quem e voce!!!\n"
        		 		  + "Por que esse guerreiro estava te perseguindo?\n\n"
        		 		  + "O forasteiro muito debilitado devido ao golpe da adaga que ainda continua\n"
        		 		  + "cravada em suas costas, responde...\n"
        		 		  + "=======================================================================================\n");

    				ent.nextLine();

    	 System.out.println("=======================================================================================\n"
    			 		  + "Forasteiro:  Eu me chamo Tamond, e carrego  comigo  um  mapa muito valioso que\n"
    			 		  + "contem o local exato da reliquia perdida de Ragnar, mais para isso e necessario\n"
    			 		  + "comprir desafios no meio do caminho, para que o local da reliquia seja revelada.\n\n"
    			 		  + "Antes desse mapa parar em minhas maos, muitos ja¡ tentaram, mas ninguem nunca \n"
    			 		  + "consequiu chegar ao final da jornada. Confio esse  mapa a voca jovem  guerreiro,\n "
    			 		  + "pois se cair em maos  erradas  o destino da humanidade estara em jogo.\n"
    			 		  + "=======================================================================================\n");
           ent.nextLine();
         
         System.out.println("=======================================================================================\n"
                          + "Apos Tamond entregar o mapa para ao "+Nome_P+", ele nao resiste ao ferimento\n"
                          + "e morre.\n\n"
                          +  Nome_P+" olha  fixamente para o mapa e ver que esta em branco, e pensam em tudo\n"
                          + "que acabou de acontecer, meio confusos com a situacao permanecem em silencio \n"
                          + "por alguns segundos, ate que ele guarda o mapa, e pensa que isso deve ser uma \n"
                          + "besteira.\n"
                          + "=======================================================================================\n");
         ent.nextLine();
                 
         System.out.println("=======================================================================================\n"
                          + "Apos o acontecido, "+Nome_P+" partir da Taverna, ate a estalagem...\n\n"
                          + "Assim que ele chega tira o mapa do bolso e perseber que algo esta diferente no\n"
                          + "mapa uma localizacao aparece, e aponta para Floresta sombria proximo da cidade\n "
                          + "de Zendka, curioso ele acha melhor obter mais informacoes.\n\n"
                          + "No dia seguinte parte para a cidade de Eubrus, onde vive o seu antigo mestre\n"
                          + "que talvez consiga ter alguma informacoes sobre essa tal reliquia de ragna.\n" 
                          + "=======================================================================================\n");
         ent.nextLine();
         System.out.println("=======================================================================================\n"
        		 		  + "Durante a viagem diversas vezes "+Nome_P+" foi atacado por ciraturas estranhas\n"
        		 		  + "que estavam atras do mapa que ele carregava, assim ele percebe a seriedade daqui-\n"
        		 		  + "lo que estar carregando. Por um momento "+Nome_P+" parou pensou se continuaria \n"
        		 		  + "com sua viagem ou se colocaria um fim nisso tudo:\n"
        		 		  + "========================================================================================\n");
         	ent.nextLine();
         System.out.println("Escolha o que deseja fazer:\n");
            
          
        
 
            do{  // Nao sai do laco enquanto o jogador nao escolher uma opcao valida
         System.out.println("Escolha uma opcao:\n"			
                          + "(1)Quero destruir o mapa e por um fim nisso!!\n"
                          + "(2)Quero permanecer com o mapa e continua a viagem.\n ");
         Desisao = ent.nextInt();   // escolhe Desição a ser tomada
            
         switch(Desisao){         
         
         // +++++++++++++++++++++++++++++++++++ Caso for a primeira. ++++++++++++++++++++++++++++++++++++++++
         
                case 1:														
                    
         System.out.println("=======================================================================================\n"
                            + Nome_P+" taca fogo no mapa, mais percebe que nada acontece.\n\n"
                            + Nome_P+": -im..im..im..impossivel!!!, o mapa nao queima!!\n"
                            + "=====================================================================================\n");
         ent.nextLine();ent.nextLine();
                                     
         System.out.println("========================================================================================\n"
                            + Nome_P+": Isso nao parece ser um simples pedaco de papel, estou sintindo um for-\n"
                            + "te poder magico emanando dele, acredito que tenho que permanecer com o mapa \n"
                            + "mesmo contra minha vontade...\n"
                            + "======================================================================================\n");
          ent.nextLine();
                            break;
                            
              // +++++++++++++++++++++++++++++++++++ Caso for a segunda. ++++++++++++++++++++++++++++++++++++++++
                            
                case 2:														
                	
         System.out.println("========================================================================================\n"
                            + "Apos pensa muito, "+Nome_P+" decide que vai tras do tesouro de ragnar, mas para\n"
                            + "isso tem que melhorar suas habilidades pois a jornada que o espera nao sera¡ nada\n"
                            + "facil¦\n"
                            + "======================================================================================\n");
          ent.nextLine();ent.nextLine();
                            break;
                default:
          System.out.println("Opcao Invalida!");
                            break;
                }
          }while(Desisao<1||Desisao>2);
            
                   
          System.out.println("=======================================================================================\n"
                           + "Ao chegar na cidade "+Nome_P+" se reune com seu antigo mestre Garruk, e explica \n"
                           + "a situacao.\n\n "
                           + "Garruk ver o mapa e fica espantado, e comesa a explica o que ele sabe...\n"
                           + "=======================================================================================\n");
          ent.nextLine();
          System.out.println("=======================================================================================\n"
                           + "Garruk: Segundo a lenda, Ragnar foi um antigo Rei muito ambicioso que sempre estava\n"
                           + "em busca de mais poder, ate que um dia ele utilizou de uma forte magia proibida e\n"
                           + "extremamente poderosa, porem ele pagou um preco muito alto. Ao portar extremo\n"
                           + "poder o rei ragnar acabou ficando louco e destruindo seu proprio reino e a si mesmo.\n"
                           + "=======================================================================================\n");
           ent.nextLine();
          System.out.println("=======================================================================================\n"
                           +  Nome_P+" mais o que aconteceu com a Reliquia?\n"
                           + "=======================================================================================\n");
          ent.nextLine();                            
          System.out.println("=======================================================================================\n"
                           + "Garruk: Apos a morte do rei um feiticeiro muito poderoso decidiu envocar quatro \n"
                           + "guardioes para defender a reliquia, com medo do que poderia acontecer se tal poder\n"
                           + "caissem em maos erradas e decidiu selar a reliquia onde ninguem pudesse descobrir.\n"
                           + "========================================================================================\n");
          ent.nextLine();
          System.out.println("========================================================================================\n"
                           + Nome_P+": Se nao era para ninguem descobrir de onde surgiu esse mapa??\n"
                           + "========================================================================================\n");
          ent.nextLine();
          System.out.println("========================================================================================\n"
                           + "Garruk: Ha rumores  que  antes da reliquia ser selada, ela gerou um mapa\n"
                           + "onde possuia sua localizacao. Mas ate entao isso nao passava de uma lenda.\n\n"
                           + "Se voce realmente pretender ir atras dessa relequia tera que fica muito mais\n"
                           + "forte, para isso tera que passar arduo treinamento para melhorar sua habilidades.\n"
                           + "=======================================================================================\n");                 
          ent.nextLine();
          System.out.println("=======================================================================================\n"
                           + Nome_P+" passa dias em um arduo treinamento, e por fim como desafio final para ver\n"
                           + "se esta apto a encarar uma jornada tao perigosa, ele enfrenta seu mestre Garruk\n"
                           + "=======================================================================================\n");
          ent.nextLine();
                                 
                           break;
                           
                           
                   /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    
 				    ================================= terceira parte da Historia ===============================    
                    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/                           
                           
        			case 2:
        				
          System.out.println("=======================================================================================\n"
        				   + "Garruk: vejo que seu treinamento deu resultado, agora voce esta pronto para\n"
        				   + " enfrentar sua jornada\n"
        				   + "=======================================================================================\n");
          ent.nextLine();
    	  System.out.println("=======================================================================================\n"
    					   + Nome_P+" pega o mapa, e ver que o primeiro local que o mapa indica e a floresta\n"
    					   + "sombria, proximo da cidade Zendkar.\n\n"
    					   + "E assim se despede de Garruk e parte para a floresta...\n"
    					   + "=======================================================================================\n");
    	  ent.nextLine();
    	  System.out.println("=======================================================================================\n"
    	  				   + "Para cheaga na floresta "+Nome_P+" precisava passar pelo pantano lamacento,um\n"
    	  				   + "caminho bastante perigoso, e "+Nome_P+" sabia disso. A forma mais segura de atravesar\n"
    	  				   + "seria com a ajuda de pescador que vivia proximo a região, conehcido como Pescador\n"
    	  				   + "do pantanal\n."
    	  				   + Nome_P+" vai em busca do pescador e pede ajuda para atravesar o pantano.\n"
    	  				   + "=======================================================================================\n");
    	  ent.nextLine();
    	  System.out.println("=======================================================================================\n"
    	  		           +Nome_P+": -Ouvi diser que o senhor conhece muito bem esse pantano e pode me ajudar a\n"
    	  	               + "atravesa-lo, e verdade? \n"
    	  	               + "=======================================================================================\n");
    	  ent.nextLine();
    	  
    	  
    	  // +++++++++++++++++++++++++++++++++++ Primeiro desafio ++++++++++++++++++++++++++++++++++++++++ 
    	  
    	  
    	  System.out.println("=======================================================================================\n"
    			           +"Pescador do pantano: -Claro meu jovem, conheco esse pantano como a palma da minha mao\n"
    	  		           + "e terei o prazer de ajudalo a atravesar, se voce me responder a uma pengunta. Mas fique\n"
    	  		           + "esperto pois voce tera apenas uma tentativa, casso contrario tera que atravesar sozinho\n"
    	  		           + "esta preparado para a pergunta?.\n"
    	  		           + "=======================================================================================\n");
    	ent.nextLine();
        System.out.println(Nome_P+": -Estou prepado, pode perguntar");
        
        caminho = caminho(0);	// Chama a funcao caminho com a pergunta.
        
        // +++++++++++++++++++++++++++++++++++ Se acerta o primeiro desafio ++++++++++++++++++++++++++++++++++++++++
    	
        if(caminho == true) {
    	System.out.println("=========================================================================================\n"
    	  				 + "pescador do pantano: -Parabens meu jovem, Voce acertou elem de ganhar 3 de xp, irei te\n"
    	  				 + "acompanhar atraves do pantano.\n"
    	  				 + "\napos uma longa viagem finalmente eles atravesam. entao "+Nome_P+" se despede do pes-\n"
    	  				 + "cador e parte rumo a floresta maldita\n"
    	  				 + "=========================================================================================\n");
    	  Xp=2;	// Ganha XP
    	  Nivel();
    	  Xp=0;
    	 
        }
        
        // +++++++++++++++++++++++++++++++++++ Se errar o primeiro desafio ++++++++++++++++++++++++++++++++++++++++
        
        else {
       System.out.println("==========================================================================================\n"
    	  		  		 +"Pescador do pantano: -Infelismente voce errou, nao poderei lhe acompanhar, voce tera\n"
    	  				 +"que seguir sozinho.\n"
    	  				 +"Entao"+ Nome_P+" segue sozinho pelo pantano, e no meio do caminho se depara com cria-\n"
    	  				 +"turas bizarras no qual teve de enfrentar para poder seguir viagem, e nesses confronto\n"
    	  				 +"acaba perdendo 5 de HP:"); cHP=cHP-5; System.out.print(" HP = "+cHP+"\n"									// Perde HP
    	  			     + "=========================================================================================\n");
    	  				 }
    	ent.nextLine(); 
    	
    	
        System.out.println("=========================================================================================\n"
    					 + "Apos "+Nome_P+" chega na entrada da floresta resolver pega o mapa, e percebe que um\n"
    					 + "nome sungindo lentamente\n"
    				     + Nome_P+": -Guardiao da Terra, mais o que sera isso?\n"
    					 + "=========================================================================================\n");
       ent.nextLine();
    								
       System.out.println("==========================================================================================\n"
    					 + "Quando das sombras sugir uma criatura grande e assustadora, e "+Nome_P+" perseber \n"
    				     + "que se trata de um Troll de pedra.\n"
    					 + "=========================================================================================\n");			
       ent.nextLine();
       System.out.println("==========================================================================================\n"
    					 + "Troll: Eu sou o primeiro Guardiao da reliquia e vejo que voce possui o mapa\n"
    					 + "mais se pretender conquista o seu poder da reliquia e preciso e me derrota!\n\n"
    					 + "Sem tempo nem para pensa a critura o ataca e inicia a batalha!!!\n"
    					 + "=========================================================================================\n");
    	ent.nextLine();
    					  break;
    					  
    					  
    	           /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    
    	 			================================= Terceira parte da Historia ===============================    
    	            +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/    					  
    					  
    					  
        case 3:
        				
        System.out.println("=========================================================================================\n"
        				 + "Quando termina a batalha "+Nome_P+" olha para o mapa percebe que um novo caminho \n"
        				 + "aparecer comeca a surgir, apontando para a gruta de Delfine.\n\n"
        				 + "Exausto ele parte em direcao a seu novo destino!\n"
        				 + "=========================================================================================\n");
  		ent.nextLine();
  		System.out.println("=========================================================================================\n"
       					 + "Apos caminha durante uma semana por vales, campos abertos em meio a chuvas e tempestades\n"
       					 + "e paisagens lindas "+Nome_P+" chega proximo da gruta de delfine, mais para chega la,\n "
       					 + "ele precisa e um barco a remo para atravessa um lago que esta no caminho.\n"
       					 + "=========================================================================================\n");
 		ent.nextLine();	
 		
 		
 	// +++++++++++++++++++++++++++++++++++ Segundo desafio  ++++++++++++++++++++++++++++++++++++++++
 		
  		System.out.println("=========================================================================================\n"
  					     + Nome_P+" ver um senhor que aparenta ser um mercador de barcos local, e decide ir falar\n"
  						 + "com ele \n"
  						 +Nome_P+": -Bom dia senhor, preciso chega na gruta mais estou sem um barco voce tem como\n"
  						 + "me empresta o barco?\n\n"
  						 + "Mercador: -Mais e claro que empresto jovem guerreiro mais antes vamos ver se voce\n "
  						 + "e esperto...\n"
  						 + "Me responda uma simples pergunta...\n"
  						 + "=========================================================================================\n");
  		ent.nextLine();
  		
  		caminho = caminho(1);	// Chama a funcao caminho com a pergunta.
  		
  		
  	// +++++++++++++++++++++++++++++++++++ Se acerta o segundo desafio ++++++++++++++++++++++++++++++++++++++++	
  		
   	    if(caminho == true) {
   	    System.out.println("=========================================================================================\n"
   	    				 + "Mercado: -Parabens guerreiro, estou muito impresionado com sua inteligencia, por\n "
   	    				 + "acertar minha pergunta te emprestarei um dos meus melhores barcos,e ganhara mais\n"
   	    				 + "3 de Xp. Esse barco pasara desbercebido pelas aguas e certamente não atraira a\n"
   	    				 + "atencao de nem uma criatura marinha.\n\n"
   	    				 + Nome_P+" agradece pelo barco e continua sua viagem.\n"
   	    				 + "=========================================================================================\n");
   	    
   	    Xp=2;	//Ganha XP
   	    Nivel();
   	    Xp=0;
   	    
   	    }
   	    
   	// +++++++++++++++++++++++++++++++++++ Se errar o segundo desafio ++++++++++++++++++++++++++++++++++++++++
   	    
   	    else {
   	    System.out.println("=========================================================================================\n"
   	    			     + "Mercador: -infelismente voce nao acertou minha pergunta, irei te emprestar mas sera\n"
   	    			     + "apenas uma pequena canoa. Mas tome bastante cuidado, pois essas aguas são cheias de\n"
   	    			     + "criaturas marinhas, reme com bastante cautela, pois podera desperta a furia de alguma\n"
   	    			     + "delas, e voce nao vai querer que isso aconteca.\n\n"
   	    			     + Nome_P+": -agradece pela canoa e continua sua viagem. Porem no meio do caminho desperta\n"
   	    			     + "a furia de umas das criaturas que acaba o atacando. "+Nome_P+" consegue vencer porem\n"
   	    			     + "acaba perdendo 5 de HP:");cHP=cHP-5; System.out.print("HP = "+cHP+"\n"										//Perde HP
   	    			     + "=========================================================================================\n");

   	    }
   	    ent.nextLine();
  						

        System.out.println("=========================================================================================\n"
        				 + "Ao chegar na gruta "+Nome_P+" pega o mapa e ver um novo nome surgindo.\n\n"
        				 + Nome_P+": -Guardiao das Aguas! \n\n"
        				 + Nome_P+" -caminhando pela gruta desertas e umida, ele percebe uma pequena\n"
        				 + " movimentacao nas aguas, e aos poucos vai surgindo uma criatura estranha\n"
        				 + "e escamosa, e ver que a criatura e uma especie de tritao.\n"
        				 + "=========================================================================================\n");
       ent.nextLine();
       System.out.println("==========================================================================================\n"
        				+ "Tritao: Eu sou o segundo Guardiao da reliquia, vejo que derrotou o primeiro, mas \n"
        			    + "nao sera facil dessa vez, se prepara para a batalha!\n"
        				+ "==========================================================================================\n");					
       ent.nextLine();	
       break;
       
       /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    
		================================= Quarta parte da Historia ===============================    
        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/      
       
       
       case 4:
       
    	System.out.println("=========================================================================================\n"
        				+ "Apos vence o segundo guardiao ele olha o mapa e ver que seu novo destino fica  \n"
        			    + "na montanha nebulosa, nao muito longe de onde ele se encontra. Apos descansa na\n"
        			    + "cidade de Katengar proxima as grutas "+Nome_P+" de cide partir para a montanha...\n"
        				+ "==========================================================================================\n");
       ent.nextLine();
       
       
    // +++++++++++++++++++++++++++++++++++ Terceiro desafio ++++++++++++++++++++++++++++++++++++++++
       
       
       System.out.println("==========================================================================================\n"
        			    + "A escalada ate o pico da montanha nao e nada facil, para chegar no topo tem que\n"
        			    + "encarar uma escalada bastante perigosa, mas existia uma passagem secreta por den-\n"
        			    + "tro da montanha, por la era bem facil chegar ao topo da montanha, um camilho tota-\n"
        			    + "lmente livre de perigo. mas para passar por la tinha de desvendar um enigma milenar\n"
        			    + "que estava escrito nas rochas da montanha, so assim a passagem se revelara, porem\n"
        			    + "e possivel tentar apenas uma vez, caso erre a passagem nunca sera revelada.\n"
        			    + Nome_P+" entao le o enigma e tenta desvendalo.\n"
        				+ "==========================================================================================\n");	
       ent.nextLine();
 		
 		caminho = caminho(2); 	// Chama a funcao caminho com a pergunta.
 		
 		
 	// +++++++++++++++++++++++++++++++++++ Se acerta o terceiro desafio ++++++++++++++++++++++++++++++++++++++++	
 		
 		
  	    if(caminho == true) {
  	    System.out.println("=========================================================================================\n"
  	    				 + "Apos devendar o enigma "+Nome_P+" ganha +3 de Xp e passagem e revelada, assim ele parte\n"
  	    				 + "rumo ao topo da montanha,\n."
  	    				 + "=========================================================================================\n");
  	    
  	    Xp=2;	// Ganha XP
  	    Nivel();
  	  Xp=0;
  	    
  	    }
  	    
  	// +++++++++++++++++++++++++++++++++++ Se errar o terceiro desafio ++++++++++++++++++++++++++++++++++++++++  
  	    
  	    else {
  	    System.out.println("=========================================================================================\n"
  	    			      + Nome_P+" nao consegue desvendar o enigma acaba tendo que escalar a montanha. a escalada\n"
  	    			      +"exige muito dele e o deixa exautao "+Nome_P+" chega ao topo da montanha com sua forca\n"
  	    			      +"reduzida: ATK = ");ATK=ATK-5; System.out.print(ATK+"\n"											//Perde ATK
  	    			      +"=========================================================================================\n");
  	    
  	    }
  	    System.out.print  ("=================================================================================\n"
  	    				  + "Ao chegar ele ve no mapa quem sera seu adversario, entao "+Nome_P+" le guardiao \n"
  	    				  + "do Ar, quando derrepende vem uma criatura voando em sua direcao pronto para \n"
  	    				  + "ataca-lo, a criatura era estremamente rapida,"+Nome_P+" mau consequir desviar\n"
  	    				  + "de seu primeiro ataque, ele percebe que a criatura nada mais era do que um grifo,\n"
  	    				  + "ele entao se prepara para a batalha.\n"
	           	  		  + "=================================================================================\n");
  	    ent.nextLine();
  
        				break;
        				
        				
        	/*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++    
        	================================= Quinta parte da Historia ===============================    
        	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/          				
        				
        				
        case 5:
        
        System.out.println("==========================================================================================\n"
        				  +"Depois de uma longa batalha contra o grifo "+Nome_P+" etava extremamente cansado, quando\n"
        				  +"ele olha para o mapa ver um novo caminho surgindo, dessa vez o mapa apontava para a\n "
        				  +"masmorra de Sauron, um lugar tao sombrio que ninguem jamais ousou pisar Para chegar na\n"
        				  +"masmorra de Sauron "+Nome_P+" teve que enrentar diversos caminhos extremente peigoso\n"
        				  +"mas o mais perigoso seria a terra dos orcs, essas criaturas eram tao selvagem que ninguem\n"
        				  +"ousava atravessar suas terras, porem nao tinha outro jeito "+Nome_P+" precissaria passar\n"
        				  +"por la, era o unico caminho ate a masmorra.\n"
        				  +"Mas antes de passar por tal caminho, "+Nome_P+" ouviu diser que um mercenario na cidade\n"
        				  +"das almas um manto estremamente raro fabricado pelo elfos lendarios, esse manto era capaz\n"
        				  +"de camuflar qualquer ser perante aos olhos dos orcs, isso permitiria um travesia tranquila\n"
        				  +Nome_P+" entao foi em busca desse mercenario. ao encontralo ele fala que precissava daquele\n"
        				  +"manto.\n"
        				  +"===========================================================================================\n");
  	    ent.nextLine();  
  	    System.out.println("==========================================================================================\n"
  	    				  + "Mercenario: -Admiro sua bravura por tentar passar pelas terras dos Orcs, por \n"
  	    				  + "isso lhe darei o manto casso remponda minha pergunta corretamente, caso contrario \n"
  	    				  + "receio que voce tera que enfrentar sua jornada sem o manto.\n "
  	    				  +"Se prepara la vai minha pergunta...\n"
  	    				  + "=================================================================================\n");
  	  caminho = caminho(3); // Chama a funcao caminho com a pergunta.
  	    
 		
 		
 		
 	// +++++++++++++++++++++++++++++++++++ Se acerta o quarto desafio ++++++++++++++++++++++++++++++++++++++++ 
 		
 		
  	    if(caminho == true) {
  	    System.out.println("=========================================================================================\n"
  	    				  +"Mercenario: -Resposta exata meu caro guerreiro, aqui esta como prometido a manta Orc.\n"
  	    				  +Nome_P+" pega a manta e parate para a masmorra de Sauron. \n"
  	    				  +"=========================================================================================\n");
  	    
  	    Xp=2;	// Ganha XP
  	    Nivel();
  	    Xp=0;
  	    
  	    }
  	    
  	// +++++++++++++++++++++++++++++++++++ Se errar o quarto desafio ++++++++++++++++++++++++++++++++++++++++ 
  	    
  	    else {
  	    System.out.println("==========================================================================================\n"
  	    			      +"Mercenario: -E uma pena voce errou.\n"
  	    			      +"Derrepente o homen some bem na frente dos olhos de "+Nome_P+" sem nem uma explicacao.\n"
  	    			      +"entao "+Nome_P+" percebe que tera que seguir sem o manto, e assim ele faz. sua passagem\n"
  	    			      +"pela terras dos Orcs foi repleta de terro e batalhas assutadoras e mesmo sofrendo alguns\n"
  	    			      +"danos no seu caminho e acabar perdendo um pouco de HP = ");cHP=cHP-5; System.out.print("HP = "+cHP+"\n."	//Perde HP
  	    			      +Nome_P+" consegue atravesar a terra dos Orcs\n"
  	    			      +"=========================================================================================\n");
  	    }
  	   ent.nextLine(); 
  	   System.out.println("===========================================================================================\n"
  	   					 +"Ao chegar na masmorra "+Nome_P+" sente uma presenca assustadora, e esculta um rugido que\n"
  	   					 +"o deixa paralisado. Ele entao pega o mapa e le o nome 'Guardiao do fogo', logo em seguida\n"
  	   					 +"esculta uma voz em sua cabeça o chamando para dentro da masmorra. apavorado ele entra,\n"
  	   					 +"e se depara com uma criatura enorme com fumaca saindo de suas narinas.\n"
  	   					 +"Quando ele se da conta que aquilo era uma dragao ele fica desesperado, mas nao dava mas\n"
  	   					 +"tempo de fugir era tarde demias para isso, o dragao entao se vira para o guerreiro e diz.\n"
  	   					 +"\n"
  	   					 +"DRAGAO: -Vejo que chegou longe, mas acredite, daqui voce nao passara, eu defendo essa re-\n"
  	   					 +"liquia a mais de 3 mil anos, e voce nao e o primeiro a chegar ate mim. \n"
  	   					 + "============================================================================================\n");
  	   ent.nextLine();
  	    				 

  	   //==================================================FINAIS ALTERNATIVOS==============================================
  	   
  	   if(Nivel < 8 ) {  // historia a ser printada se o NV do jgador for menor que 8
  	   System.out.println("=============================================================================================\n"
  	    			    + "Voce nao tem a menor chance de me derrotar e voce sabe muito bem disso. Voce exala medo,\n"
  	    			    + "mas por sua bravura irei te fazer uma proposta, caso se recuse serei obrigado a te destruir.\n"
  	   					+ "\n"+Nome_P+" entao olhou fixamente para o dragao e esculta o que ele tem a diser com muita\n"
  	   					+ "atecao.\n\n"
  	   					+ "DRAGAO: -Torne-se um quardiao da reliquia, pois voce nao faz ideia do poder que ela carrega\n"
  	   					+ "meu dever assim como os demais Guardioes e manter essa poderosa arma longe da mao de tolos\n"
  	   					+ "e ingnorante como voce. Antes que decida irei te mostrar o poder que essa reliquia carrega\n"
  	   					+ "O dragao entao mostra para "+Nome_P+" como surgiu a reliquia. Ele voltou em um passado\n"
  	   					+ "bem distante, quando os 8 reinos estavam em guerra, o rei Ragnar muito ambicioso, querendo\n"
  	  					+ "o poder dos 8 reinos para si, conjurou uma poderosa magia proibida, em um machado que usou\n"
  	  					+ "em diversas batalhas, apartir de entao quem portava o machado recebia um poder inimaginal\n"
  	   					+ "Mas Ragnar cometeu um terrivel erro, pois ele nao sabia com o que estava lidando.\n"
  	   					+ "Alguns messes depois de adquirir tal poder, ele percebeu que tinha invocado uma forca\n"
  	   					+ "maligna, de um ser que estava dormente a milares de anos, ao invocar tal magia\n"
  	   					+ "essa forca tomou conta do artefato, entao aquele que portava a reliquia era dominado por essa\n"
  	   					+ "forca. Foi o que aconteceu com o rei, depois de potar o machado com tal poder, nao demorou\n"
  	   					+ "muito para que ele se conrropese; e o preco que pagou foi extremamente alto. Ragnar ficou louco\n"
  	   					+ "e acabou destruindo seu proprio reino e a si mesmo. foi so depois da destruicao de Ragnar que\n"
  	   					+ "o feitceiro anciao decidiu selar a reliquia, e invocou quatro Guardoes para mater a reliquia\n"
  	  					+ "em seguranca.\n"
  	   					+ "\nDRAGAO: -Agora que ja sabe da verdade, te darei a opcao de se tornar um guardiao e manter\n"
  	   					+ "a reliquia em seguranca, ou eu serei obrigado a te destruir.\n\n"
  	   					+ "==============================================================================================\n");
  	    			    	   	do {
  	    			    	   	System.out.println("Deseja se tornar um guardiao? \n(1)Sim\n(2)Nao  ");
  	    			    	   					
  	    			    	   	x=ent.nextInt();
  	    			    	   switch(x) {
  	    			    	   	case 1:
  	    	System.out.println("===============================================================================================\n"
  	    	 	    		 + "DRAGAO: -Sabia escolha Guerreiro, vejo que entendeu o proposito do Guardiao,  e quao\n"
  	    					 + "perigoso e essa reliquia.\n\n"
  	    			    	 + "Assim que o Dragao o batizou como quardiao da reliquia, o mapa que "+Nome_P+" carregou\n"
  	    			    	 + "toda sua jornada se desmancha bem na sua frente.\n"
  	    			    	 + "\n"+Nome_P+" -O que ouve com o mapa, onde ele foi parar??\n\n"
  	    			    	 + "DRAGAO: -Nao se preocupe guerreiro e apenas a reliquia tentando encontrar um novo portador.\n"
  	    			    	 + "Treine muito e se prepare que logo alguem vira atras do poder amaldicoado de Ragnar.....\n"
  	    			    	 + "===============================================================================================\n");
  	    	ent.nextLine();
  	    					desenho(14);
  	    	break;
  	    			    	   	case 2:
  	    	System.out.println("===============================================================================================\n"
  	    					 + "DRAGAO: -Que pena vejo que nao entendeu meu proposito, nao terei outra escolha a nao ser\n"
  	    					 + "destruilo...\n\n"
  	    					 + Nome_P+" enfrentou o dragao bravamente, mais a diferença de poder entre eles era gigantesca.\n"
  	    					 + "Nao demorou muito para que "+Nome_P+" fosse derrotado.\n\n"
  	    					 + "DRAGAO: -Pobre guerreiro tinha um grande potencial mais sua ganancia por poder o destruiu...\n\n"
  	    					 + "O dragao volta a dormi esperando seu proximo desafiante..."
  	    					 + "===============================================================================================\n");
  	    		ent.nextLine();
  	    					desenho(14);	
  	    	break;
  	    	default:
  	    		System.out.println("Opcao invalida!");
  	    		ent.nextLine();
  	    		break;
  	    			    	   		
  	   					}
  	   					}while(x<1 || x>2); //Permanece no lacho enquanto o jogador nao digitar uma opcao valida
  	    			    	   					
  	   
  	   }
  	   if(Nivel>=8) {      // historia a ser printada se o NV do jgador for maior ou iqual a 8
  		   
  	  	   System.out.println("=============================================================================================\n"
	    			    + "DRAGAO: -Antes de te destruir irei te mostrar o poder que essa reliquia carrega...\n\n"
	   					+ "O dragao entao mostra para "+Nome_P+" como surgiu a reliquia. Ele voltou em um passado\n"
	   					+ "bem distante, quando os 8 reinos estavam em guerra, o rei Ragnar muito ambicioso, querendo\n"
	  					+ "o poder dos 8 reinos para si, conjurou uma poderosa magia proibida, em um machado que usou\n"
	  					+ "em diversas batalhas, apartir de entao quem portava o machado recebia um poder inimaginal\n"
	   					+ "Mas Ragnar cometeu um terrivel erro, pois ele nao sabia com o que estava lidando.\n"
	   					+ "Alguns messes depois de adquirir tal poder, ele percebeu que tinha invocado uma forca\n"
	   					+ "maligna, de um ser que estava dormente a milares de anos, ao invocar tal magia\n"
	   					+ "essa forca tomou conta do artefato, entao aquele que portava a reliquia era dominado por essa\n"
	   					+ "forca. Foi o que aconteceu com o rei, depois de potar o machado com tal poder, nao demorou\n"
	   					+ "muito para que ele se conrropese; e o preco que pagou foi extremamente alto. Ragnar ficou louco\n"
	   					+ "e acabou destruindo seu proprio reino e a si mesmo. foi so depois da destruicao de Ragnar que\n"
	   					+ "o feitceiro anciao decidiu selar a reliquia, e invocou quatro Guardoes para mater a reliquia\n"
	  					+ "em seguranca.\n"
	   					+ "\nDRAGAO: -Agora que voce ja sabe a maldicao que essa reliquia carrega, nao posso deixar voce\n"
	   					+ "porta-la\n"
	   					+ "==============================================================================================\n");
  	  	
  	   }
  	     	   
  	    			    	   ent.nextLine();
  	    			    	   break;
        case 6:
        	
        if(Nivel <=9) {
           System.out.println("===============================================================================================\n"
           				    + "Apos "+Nome_P+" vencer a batalha, ele percebe que o peito do dragao esta brilhado, entao\n"
           					+ "ele abre o peito do dragao e arranca a reliquia. Quando "+Nome_P+" segura o Machado ele\n"
           					+ "sente um enorme poder, mas percebe uma forca maligna por tras. E quando ele\n"
           					+ "tem de decidir se ira destruir a reliquia ou portara o poder para si.\n"
           					+ "===============================================================================================\n");
           
          do {
           System.out.println("Escolha uma das opcoes: \n(1)Irei destruir a reliquia!!!\n(2)Quero esse poder para mim!!!" );
           			
           x = ent.nextInt();
           
           					switch(x) {
           					
           					case 1: 
           	System.out.println("===============================================================================================\n"
           					+ "Alem do poder da reliquia ele sentir um poder vindo do dragao caido, e uma voz surgir na sua\n"
           					+ "cabeca, que nada mais e do que o feiticeiro anciao e diz:\n "
           					+ "-Selei um feitiço no dragao que somente um guerreiro forte o suficiente para o matar poderia\n"
           					+ "obter a chama dele mais so serve para uma coisa destruir a reliquia e vejo que sua decisao\n"
           					+ "foi correta...\n\n"
           					+ "Com o poder obtido ele incendeia o machado ate vira cinzas, "+Nome_P+" se sentir aliviado por ter\n"
           					+ "se livrado dessa maldição de uma vez por todas. podendo assim viver novamente em paz\n"
           					+ "================================================================================================\n");
           					ent.nextLine();
           					desenho(14);
           					break;
           					
           					case 2:
           	System.out.println("===============================================================================================\n"
           					+ Nome_P+": -Com esse poder me sinto invencivel!\n\n "
           					+ "Com o poder em sua maos "+Nome_P+" sai em busca de conquista reinos para si em poucos anos ele consegue  \n"
           					+ "conquista territorios mais por nao ser forte o suficiente o machado possui sua mente e o consome"
           					+ "o forçado destruir seu proprio reino e todos aqueles que amava e conhecia e por ultimo ele mesmo."
           					+ "================================================================================================\n");
           					ent.nextLine();
           					desenho(14);
           					break;
           					
           					default:
           						System.out.println("Opcao invalida!");
           						ent.nextLine();
               					break;
           					}
             }while(x<1 || x>2); 
        
             }else if(Nivel ==10) { // historia a ser printada se o NV do jgador for iqual a 10
        	
        	 System.out.println("===============================================================================================\n\n" 
        			 		  + "Apos "+Nome_P+" vencer a batalha, ele percebe que o peito do dragao esta brilhado, entao\n" 
        			 		  + "ele abre o peito do dragao e arranca a reliquia. Quando "+Nome_P+" segura o Machado ele\n" 
        			 		  + "sente um enorme poder, mas percebe uma forca maligna por tras.\n\n "
        			 		  + Nome_P+" Volta para seu reino portando esse enorme poder, perdido durantes milhares de anos.\n"
        			 		  + "Quando ele finalmente volta e recebido pelo rei, que o esperava com um enorme exercito\n"
        			 		  + "Pronto para mata-lo, pois temia o poder que a reliquia carregava. mas "+Nome_P+" estava tao\n"
        			 		  + "forte que para ele nao foi problema nem um derrotar o exercito do rei.\n"
        			 		  + Nome_P+" se torna entao rei do reino de Jace, e apartir dali conquista os demias reinos,\n"
        			 		  + "a maldicao contida no machado nao foi capaz de conrropelo pois "+Nome_P+" estava muito forte.\n"
        			 		  + Nome_P+" reinou por 70 anos, mas antes de sua morte ele decidiu destruir a reliquia\n"
        			 		  + "para que nao parace em maos erradas e acabase com tudo aquio  que tinha contruido nesses 70 anos.\n"
        			 		  + "=================================================================================================\n");
        	ent.nextLine();
        	desenho(14);
        }
 }//Switch geral
}       
	
// Funcao caminho e desafios que contem no meio da jornada.
static boolean caminho (int atalho) { 
	
	String R;                    //variavel de resposta
	boolean caminho = false;
	
switch (atalho) {

	case 0:
	System.out.println("=======================================================================================\n"
			         + "1. A sequencia a seguir a formada por um padrao logico matematico: 25; 32; 39; 46\n" + 
					   "Qual e o setimo termo desta sequencia?\r\n" + 
				       "a) 69.\r\n" + 
					   "b) 67.\r\n" + // Resposta correta
					   "c) 70.\r\n" + 
					   "d) 75.\r\n" + 
					   "e) 71.\n"
					 + "\nEscolha a alternativa correta:\n");
		R = ent.next();
		Limpar();
		if(R.equalsIgnoreCase("B")) {
			
			
            desenho(8); desenho(11); desenho(6);
			caminho = true;
			
		
		}else {
			desenho(8); desenho(9);
			caminho = false;            
			
		}
		
	System.out.println("============================= Resolucao ==================================\n"
					 + "---------------------------alternatiiva (B) ------------------------------\n"
					 + "Dada a sequencia: 25; 32; 39; 46;...\r\n" + 
					   "Percebemos que o termo seguinte e sempre a soma do termo anterior com 7.\r\n" + 
					   "Assim: 25 primeiro termo\r\n" + 
					   "25 + 7 = 32\r\n" + 
					   "32 + 7 = 39\r\n" + 
					   "39 + 7 = 46\r\n" + 
					   "46 + 7 = 53\r\n" + 
					   "53 + 7 = 60\r\n" + 
					   "60 + 7 = 67 setimo termo da sequencia.\r\n");
		ent.nextLine(); ent.nextLine();
		Limpar();
		break;
		
	case 1:
	System.out.println("=======================================================================================\n"
					 + "2. Existem quantas maneiras de se ter vinte e cinco reais apenas com cedulas \n"
					 + "de um, cinco e dez reais?\r\n" + 
					   "a) 9\r\n" + 
		         	   "b) 10\r\n" + 
		         	   "c) 11\r\n" + 
		         	   "d) 12\r\n" + // Resposta Correta
					   "e) 15"
					 + "\nEscolha a alternativa correta:");
		R = ent.next();   					  // jogador escolhe a alternativa do desafio
		if(R.equalsIgnoreCase("d")) { 		  // compara se a resposta esta correta
		
			Limpar();
            desenho(8); desenho(11); desenho(6);
			caminho = true;					  // caminho recebe true
							
		}else {								  // Compara se a resposta esta errada					
			desenho(8); desenho(9);
			caminho = false;               	  // Caminho recebe false
			}
	System.out.println("============================= Resolucao ==================================\n"  
					+ "---------------------------alternatiiva (D) ------------------------------\n\n"
					 + "1. Tudo de 1\r\n" + 
					   "2. tudo de 5\r\n" + 
					   "3. 1 de 5 o resto de 1\r\n" + 
					   "4. 2 de 5 o resto de 1\r\n" + 
					   "5. 3 de 5 o resto de \r\n" + 
					   "6. 4 de 5 o resto de 1\r\n" + 
					   "7. 1 de 10 o resto de 1\r\n" + 
					   "8. 2 de 10 o resto de 1\r\n" + 
					   "9. 1 de 10 o resto de 5\r\n" + 
					   "10. 2 de 10 o resto de 5\r\n" + 
					   "11. 1 de 10 1 de 5 o resto de 1\r\n" + 
					   "12. 1 de 10 2 de 5 o resto de 1\r\n");
	ent.nextLine(); ent.nextLine();
	Limpar();
		break;
	case 2:
	System.out.println("====================================================================================\n"
				     + "3. Em um edificio com apartamentos somente nos andares de 1º ao 4º, moram 4 meninas,\n"
				     + "em andares distintos: Joana,Yara, Kelly e Bete, nao necessariamente nessa ordem. \n"
				     + "Cada uma delas tem um animal de estimacao diferente: gato, cachorro, passarinho\n"
				     + "e tartaruga, nao necessariamente nessa ordem. Bete vive reclamando do barulho feito\n" + 
					   "pelo cachorro, no andar imediatamente acima do seu. Joana, que nao mora no 4 andar,\n"
					 + "e mora um andar acima do de Kelly, que tem o passarinho e nao mora no 2 andar. \n"
					 + "Quem mora no 3 andar tem uma tartaruga. Sendo assim, e correto afirmar que\n\n" +
					   "a) Kelly nao mora no 1º andar.\n" + 
					   "b) Bete tem um gato.\n" + 
					   "c) Yara mora no 4 andar e tem um cachorro.\n" +  // Resposta correta
					   "d) o gato e o animal de estimacao da menina que mora no 1 andar.\n" + 
					   "e) Joana mora no 3 andar e tem um gato.");
			R = ent.next();
			
			if(R.equalsIgnoreCase("C")) {
				Limpar();
	            desenho(8); desenho(11); desenho(6);
				caminho = true;
			
			}else {
				desenho(8); desenho(9);
				caminho = false;
				}
	System.out.println("============================= Resolucao ==================================\n"  
					+ "---------------------------alternatiiva (C) ------------------------------\n"
					  +"Se bete reclama do barulho do cachorro do andar de cima, logo bete \n" + 
					   "nao mora no 4 andar. joana nao mora no 4 andar e mora um andar\n" + 
				       "acima da kelly, que nao mora no 2 andar, logo kelly nao porde morar\n" + 
					   "no 4, pois joana mora 1 andar acima, e nem no 3, pois  joana nao mora \n" + 
					   "no 4 andar, entao kely mora no 1 andar e joana no segundo, e se bete \n" + 
					   "nao mora no quarto, ela mora no 3 e tem uma tartaruga, e reclama do cachorro\n"
					  +"do andar de cima, logo Yara mora no quarto andar e tem um cachorro.\n");
	ent.nextLine(); ent.nextLine();
	Limpar();
			break;
	case 3:
	System.out.println("=================================================================================\\n"
				     + "4. Helena acha que seu relogio esta 3 minutos\n" + 
				       "atrasado, quando na verdade ele esta 12 minutos adiantado. Ontem\n" + 
				       "Helena compareceu ao trabalho julgando que estava 8 minutos atrasada,\n" + 
				       "porem, na realidade ela estava\r\n" + 
				       "a) 7 minutos atrasada.\n" + 
				       "b) 3 minutos adiantada.\n" + // Resposta correta
				       "c) 5 minutos atrasada.\n" + 
				       "d) 5 minutos adiantada.\n" + 
					   "e) 1 minuto adiantada");
			R = ent.next();
			if(R.equalsIgnoreCase("B")) {
			
				Limpar();
	            desenho(8); desenho(11); desenho(6);
				caminho = true;
			
			}else {
				desenho(8); desenho(9);
				caminho = false;
				}
	System.out.println("============================= Resolucao ==================================\n"  
			     + 	"---------------------------alternatiiva (B) ------------------------------\n"
					  +"Se o relogio esta marcando 7 horas e 20 minutos, Helena acha que\r\n" + 
					  "são 7 horas e 23 minutos (pois ela acha que esta 3 minutos atrasado), e\r\n" + 
					  "na verdade sao apenas 7 horas e 8 minutos (pois o relogio esta 12\r\n" + 
					  "minutos adiantado). Veja que ha uma diferença de 23 – 8 = 15 minutos\r\n" + 
					  "entre o horario correto e o horário que Helena tem em mente. Se ela acha\r\n" + 
					  "que atrasou 8 minutos, na verdade o horário correto e 15 minutos a\r\n" + 
					  "menos, o que nos mostra que ela está 7 minutos adiantada.\r\n");
	ent.nextLine(); ent.nextLine();
	Limpar();
			break;
	
	}
	
	return caminho;   //Retorna caminho para funcao jornada
}

// Funcao com as questoes da primeira batalha.
static int PrimeiraBatalha(int Batalha) {
        
        String Resposta;
  
        
        /*
        ================ Perguntas de conjuntos numericos =====================
         */
        switch (Batalha) {
            
            case 0:
                do {
                                       
                   desenho(4); desenho(5); desenho(10);
                
                    System.out.println("1. Se os conjuntos {0, 7, 1} e {x, y, 1}"
                            + "sao iguais. \nEntao, podemos afirmar que:\n\n"
                            + " a)x = 0 e y = 5\n"
                            + " b)x + y = 7\n" // Resposta Correta
                            + " c)x = 0 e y = 1\n"
                            + " d)x + 2 y = 7\n"
                            + " e)x = y\n\n"
                            + " Digite a alternativa correta:");
                    Resposta = ent.next();

                    if (Resposta.equalsIgnoreCase("B")) { // Compara de a resposta esta certa 
                      
                    	Limpar();
                        desenho(8); desenho(11); desenho(6);
                        
                       
                    } else {							 // Compara de a resposta esta errada
                    	Xp=Xp-1;						 // subtrai menos 1 do xp
                    	Limpar();
                        cHP = cHP - ATK_I;				 // Jogador sofre dano e HP e subtraido do ataque do inimigo
                        if(cHP<=0){ cHP=0; desenho(12); }  // se HP do jogado for iqual a 0 jogador pede o jogo e printa Game Over
                        desenho(8); desenho(9);
                        System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                        desenho(10);
                        ent.nextLine(); ent.nextLine();
                        Limpar();
                        
                    }
                } while (!Resposta.equalsIgnoreCase("B"));     // repete o laco enquanto a respota estiver errada

                break;

            case 1:

                do {
                                       
                   desenho(4); desenho(5); desenho(10);
                    
                    System.out.println("2. Num colegio de 100 alunos, 80 gostam de sorvete de chocolate, 70\n "
                            + "gostam de sorvete de creme e 60 gostam dos dois sabores. Quantos nÃ£o\n "
                            + "gostam de nenhum dos dois sabores?\n\n"
                            + "  a)0\n"
                            + "  b)10\n" // Resposta Correta
                            + "  c)20\n"
                            + "  d)30\n"
                            + "  e)5\n\n"
                            + "Digite a alternativa correta:\n");
                    Resposta = ent.next();

                    if (Resposta.equalsIgnoreCase("B")) {
                      
                    	Limpar();
                    	desenho(8); desenho(11);  desenho(6);
  
                    } else {
                    	Xp=Xp-1;
                    	Limpar();                       
                        cHP = cHP - ATK_I;
                        if(cHP<=0){ cHP=0; desenho(12); }
                        desenho(8); desenho(9);
                        System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                        desenho(10);
                        ent.nextLine(); ent.nextLine();
                        Limpar();
                    }
                } while (!Resposta.equalsIgnoreCase("B"));

                break;

            case 2:
                do {
                                       
                   desenho(4); desenho(5); desenho(10);
                   
                    System.out.println("3. A respeito dos conjuntos numericos, de suas definicoes e das relacoes\n"
                            + "de inclusao existentes entre eles, assinale a alternativa verdadeira:\n\n"
                            + "  a)O conjunto dos numeros naturais sao formado pelos numeros inteiros positivos.\n"
                            + "  b)O conjunto dos numeros inteiros sao formado por todos os numeros inteiros positivos negativos.\n"
                            + "  c)O conjunto dos numeros racionais contem o conjunto dos numeros reais.\n"
                            + "  d)O conjunto dos numeros inteiros contem o conjunto dos numeros naturais.\n" // Resposta correta
                            + "  e)O conjunto dos numeros reais sao disjunto do conjunto dos numeros racionais.\n\n"
                            + "Digite a alternativa correta:\n");
                    Resposta = ent.next();

                    if (Resposta.equalsIgnoreCase("d")) {
                       
                    	Limpar();
                        desenho(8); desenho(11); desenho(6);
                                          
                    } else {
                    	Xp=Xp-1;
                    	Limpar();
                    	cHP = cHP - ATK_I;
                    	if(cHP<=0){ cHP=0; desenho(12); }
                        desenho(8);  desenho(9);
                        System.out.println("Voce Recebeu dano do"+Nome_I+"!\n\nTENTE NOVAMENTE!!!");
                        desenho(10);
                        ent.nextLine(); ent.nextLine();
                        Limpar();
                    }
                } while (!Resposta.equalsIgnoreCase("d"));

                break;

            case 3:
                do {
                                       
                   desenho(4); desenho(5); desenho(10);
                
                    System.out.println("4. A soma entre os 10 sucessores de um numero natural e igual a 155.\n"
                            + "Que numero natural e esse?\n\n"
                            + "  a)6\n"
                            + "  b)7\n"
                            + "  c)8\n"
                            + "  d)9\n"
                            + "  e)10\n\n" // Resposta correta
                            + "Digite a alternativa correta:\n");
                    Resposta = ent.next();
                    
                    if (Resposta.equalsIgnoreCase("e")) {
                    	
                    	Limpar();
                    	desenho(8); desenho(11); desenho(6);
                            
                    } else {
                    	Xp=Xp-1;
                        Limpar();
                        cHP = cHP - ATK_I;
                        if(cHP<=0){ cHP=0; desenho(12); }
                        desenho(8);
                        desenho(9);
                        System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                        desenho(10);
                        ent.nextLine(); ent.nextLine();
                        Limpar();
                    }
                } while (!Resposta.equalsIgnoreCase("e"));
                break;
                
            case 4:
                do {
                   
                   desenho(4);  desenho(5); desenho(10);
                
                    System.out.println("5. A soma entre 7 numeros impares consecutivos e igual a 301.\n"
                            + "Qual e o primeiro desses numeros?\n\n"
                            + "  a)37\n" // Resposta correta
                            + "  b)35\n"
                            + "  c)41\n"
                            + "  d)43\n"
                            + "  e)47\n\n"
                            + "Digite a alternativa correta:\n");
                    Resposta = ent.next();

                    if (Resposta.equalsIgnoreCase("a")) {
                    	
                    	Limpar();
                    	desenho(8); desenho(11); desenho(6);
                                              
                    } else {
                    	Xp=Xp-1;
                    	Limpar();
                    	cHP = cHP - ATK_I;
                    	if(cHP<=0){ cHP=0; desenho(12); }
                        desenho(8); desenho(9);
                        System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                        desenho(10);
                        ent.nextLine(); ent.nextLine();
                        Limpar();
                    
                    }
                } while (!Resposta.equalsIgnoreCase("a"));
                  break;
            
            case 5:
                do {
                                       
                   desenho(4); desenho(5); desenho(10);
                
                    System.out.println("6. Um retangulo tem largura de 22 cm e seu comprimento e o triplo\n"
                            + "da medida de sua largura, logo a medida de seu perimetro e de:\n\n"
                            + "  a)158\n"
                            + "  b)162\n"
                            + "  c)174\n"
                            + "  d)175\n"
                            + "  e)176\n\n" //Resposta correta
                            + "Digite a alternativa correta:\n");
                    Resposta = ent.next();

                    if (Resposta.equalsIgnoreCase("e")) {
                       
                    	Limpar();
                        desenho(8); desenho(11); desenho(6);
                                              
                    } else {
                    	Xp=Xp-1;
                    	Limpar();
                    	cHP = cHP - ATK_I;
                    	if(cHP<=0){ cHP=0; desenho(12);}
                        desenho(8); desenho(9);
                        System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                        desenho(10);
                        ent.nextLine(); ent.nextLine();
                        Limpar(); 
                        
                    }
                } while (!Resposta.equalsIgnoreCase("e"));
                break;
        }
        
        return Batalha;
    }

//Funcao com as feedback da primeira batalha.
static void feedbackPrimeiraBatalha(int Q) {
        
        /*
        ================ Feedback de conjuntos numericos =====================
         */
            switch (Q){
                case 0:
                	System.out.println("==================== Resolucao =====================\n"
                					 + "---------------- Resposta Correta (B) --------------\n"
                                     + "X=0 e Y=7\n");
                    break;
                
                case 1:
                	System.out.println("==================== Resolucao =====================\n"
               		     + "---------------- Resposta Correta (B) --------------\n"
                                        +" 20 + 10 + 60 + x = 100\n" 
                                        +" 90 + x = 100\n" 
                                        +" x = 10.\n");
                    break;
                
               
                case 2:
                	System.out.println("==================== Resolucao =====================\n"
               		     + "---------------- Resposta Correta (D) --------------\n"
                            + "O conjunto dos numeros inteiros contem o conjunto dos numeros naturais.\n");    
                            break;
                      
                case 3:
                	System.out.println("==================== Resolucao =====================\n"
               		     + "---------------- Resposta Correta (E) --------------\n"
                            + "(x +1) + (x + 2) + (x + 3) + (x + 4) + (x + 5) + (x + 6) + (x + 7) + (x + 8) + (x +9) + (x +10) = 155\n" 
                                       +"10x + 55 = 155\n" 
                                       +"10x = 155 - 55\n" 
                                       +"x = 100/10\n" 
                                       +"x = 10\n");
                break;                
                  
                case 4:
                	System.out.println("==================== Resolucao =====================\n"
               		     + "---------------- Resposta Correta (A) --------------\n"
                            + "x + x+ 2 + x + 4 + x +6 + x + 8 + x + 10 + x + 12 = 301\n" 
                            + "7x = 301 - 42\n" 
                            + "7x = 259\n" 
                            + " x = 259/7\n" 
                            + " x = 37\n");
                    break;
             
                case 5:
                	System.out.println("==================== Resolucao =====================\n"
               		     + "---------------- Resposta Correta (E) --------------\n"
                            + "Largura = 22cm\n"
                            + "Comprimento = 22*3= 66cm\n"
                            + "Perimetro = 22*2+66*2= 176cm\n");
                    break;
            }
}

//Funcao com as questoes da segunda batalha.
static int Segunda_Batalha(int Batalha) {
    
    String Resposta; 
   

    /*
    ================ Perguntas de Potenciacao =====================
     */
    switch (Batalha) {
        
        case 0:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
            
                System.out.println("1. Qual dos resultados a seguir e solucao da potencia 10^-6?\r\n" + 
                		"a)0,01\n" + 
                		"b) 0,001\n" + 
                		"c) 0,0001\n" + 
                		"d) 0,00001\n" + 
                		"e) 0,000001\n" // Resposta correta
                	  + "Digite a alternativa correta:"); 
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("e")) { // Compara de a resposta da certa 
                   
                	Limpar();
                	desenho(8); desenho(11); desenho(6);
                	                
                } else {
                	Xp=Xp-1;
                	Limpar();
                    cHP = cHP - ATK_I;
                    if(cHP<=0){ cHP=0;  desenho(12); }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                    
                }
                
            } while (!Resposta.equalsIgnoreCase("e"));

            break;

        case 1:

            do {
                                   
               desenho(4); desenho(5);  desenho(10);
            
               System.out.println("2. A respeito das propriedades de potencias, qual das seguintes alternativas esta correta?\n" + 
                		      "a) No produto entre duas potencias de mesmo expoente, conserva-se\n "
                		    + "   a base e somam-se os expoentes.\n" + 
                	          "b) Na divisao entre duas potencias de mesmo expoente, conserva-se\n"
                	        + "   a base e subtraem-se os expoentes.\n" + 
                	          "c) Em uma potencia de expoente negativo, inverte-se a base e troca-se\n" // Resposta correta
                            + "   o sinal do expoente.\n" + 
                              "d) Em uma potencia de potencia, conserva-se a base e somam-se os\n"
                    	    + "   expoentes.\n" + 
                		      "e) N. D. A.\n"
                		      + "Digite a alternativa correta:");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("C")) {
                   
                	Limpar();
                	desenho(8); desenho(11); desenho(6);
                	
                   
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                }
                
            } while (!Resposta.equalsIgnoreCase("C"));

            break;

        case 2:
            do {
                                   
               desenho(4);  desenho(5); desenho(10);
                System.out.println("3. Usando as propriedades de potencias, qual e a forma mais simples\n"
                		+ " de escrever a expressao: a^2 x b^-3 x a^-3 x b^2\n"
                		+ "a) 1/ab\n" //Resposta correta
                		+ "b) a\n"
                		+ "c) b\n"
                		+ "d) ab\n"
                		+ "e) 1\n"
                		+ "Digite a alternativa correta:");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("A")) {
                    
                	Limpar();
                    desenho(8);  desenho(11); desenho(6);
                                     
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                    
                }
                
            } while (!Resposta.equalsIgnoreCase("A"));
            break;

        case 3:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
            
                System.out.println("4. O valor da expressÃ£o (-1)^0 + (-6) / (-2) - 2^4 e:\n"
                		+ "a) 20\n"
                        + "b) -12\n" // Resposta correta
                 		+ "c) 19,5\n" 
                		+ "d) 12\n"
                		+ "e) -10\n"
                		+ "Digite a alternativa correta:");
                Resposta = ent.next();
               
                if (Resposta.equalsIgnoreCase("b")) {
                		
                    Limpar();
                    desenho(8); desenho(11); desenho(6);
                                        
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8);  desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                }
                
            } while (!Resposta.equalsIgnoreCase("b"));
            break;
            
        case 4:
            do {
               
               desenho(4);  desenho(5); desenho(10);
            
               System.out.println("5. Dadas as expressoes (A= -a^2 - 2a + 5) e (B= b^2 + 2b + 5) :\n" + 
               		"a) Se a=2 e b=-2, entao A=B\n" + // Resposta correta
               		"b) Se a=2 e b=2, entao A=B;\n" + 
               		"c) Se a=-2 e b=-2, entao A=B\n" + 
               		"d) Se a=-2 e b=2, entao A=B;\n" + 
               		"e) Se a=-2 e b=2, entao A=B\n"
               	  + "Digite a alternativa correta:");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("a")) {
                   
                	Limpar();
                	desenho(8); desenho(11); desenho(6);
                	
                   
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8);  desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                }
                
            } while (!Resposta.equalsIgnoreCase("a"));
              break;
        
        case 5:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
            
               System.out.println("6. Utilizando as propriedades da potenciacao simplifique 2^3 x 4^4:\n"
               		+ "a) 2^9\n"
               		+ "b) 4^3\n"
               		+ "c) 2^11\n" // Resposta correta
               		+ "d) 2^13\n"
               		+ "e) 4^5\n"
               		+ "Digite a alternativa correta:");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("C")) {
                	
                   Limpar();
                   desenho(8); desenho(11);  desenho(6);
                  
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8);
                    desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                    
                }
                
            } while (!Resposta.equalsIgnoreCase("C"));
            break;
    }
    
    return Batalha;
}

//Funcao com as feedback da segunda batalha.
static void feedback_Segunda_Batalha(int Q) {
    
    /*
    =============================== Feedback de conjuntos numericos =================================
     */
        switch (Q){
            case 0:
                System.out.println("==================== Resolucao =====================\n"
                		     + "---------------- Resposta Correta (E) --------------\n"
                	             + "Para resolver esse problema, e necesserio usar a propriedade\n"
                		     + "de potencia que envolve um expoente negativo. Para isso,\n"
                		     + "basta inverter a base e trocar o sinal do expoente.\n");
                break;
            
            case 1:
                System.out.println("==================== Resolucao =====================\n" 
                		+      "---------------- Resposta Correta (C) --------------\n"
                		+ "a) Incorreta!\r\n" + 
                		  "   A propriedade correta e: no produto entre potencias de mesma\n"
                		+ "   base, conserva-se a base e somam-se os expoentes.\n\n" + 
                		  "b) Incorreta!\n" + 
                		  "   Na divisao entre potencias de mesma base, conserva-se a base\n"
                	        + "   e somam-se os expoentes.\n\n" +  
                		  "d) Incorreta!\n" + 
                		  "   Em uma potencia de potencia, conserva-se a base e multiplica-se\n"
                		+ "   o expoente.\n\n" + 
                		  "e) Incorreta!\r\n");
                break;
            
           
            case 2:
                System.out.println("==================== Resolucao =====================\n"  
                   		     + "---------------- Resposta Correta (A) --------------\n"  
                	             + "a^2 x b^-3 x a^-3 x b^2 \n"  
                		     + "=> a^-1 x b^-1 \n" 
                		     + "=> 1/a x 1/b \n"
                		     + "=> 1/ab \n");
                 break; 
            case 3:
                System.out.println("==================== Resolucao =====================\n"  
                                 + "---------------- Resposta Correta (B) --------------\n"  
          		             + "(-1)^0 + (-6) / (-2) -2^4 \n"  
          		             + "=> 1 + (-6) / (-2) -2^4 \n" 
          		             + "=> 1+3-16 \n"
          		             + "=> -12 \n");
            break;                
              
            case 4:
                System.out.println("==================== Resolucao =====================\n"  
 		                     + "---------------- Resposta Correta (A) --------------\n"  
 		         	     + "A = -a^2 - 2a + 5 \n"  
 		                     + "=> -2^2 - 2x2 + 5  \n" 
 		                     + "=> -4 -4 + 5  \n"
 		                     + "=> -8+5 \n"
 		                     + "=> -3\n\n"
 		                     + "B = b^2 + 2b + 5\n"
 		                     + "=> -2^2 -2.2 + 5\n"
 		                     + "=> -4 -4 + 5\n"
 		                     + "=> -8+5\n"
 		                     + "=> -3");
                break;
         
            case 5:
                System.out.println("==================== Resolucao =====================\n"  
		         	     + "---------------- Resposta Correta (C) --------------\n"  
		                     + "2^3 x 4^4 \n"  
		                     + "=> 2^3 x (2^4)^2  \n" 
		                     + "=> 2^3 x 2^8  \n"
		                     + "=> 2^11\n");
                break;
        }
}

//Funcao com as questoes da terceira batalha.
static int Terceira_Batalha(int batalha) {
    
    String Resposta; 
   

    /*
    ================ Perguntas de equacao 1 grau =====================
     */
    switch (batalha) {
        
        case 0:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
            
               System.out.println("1. Determine um numero de (a) para que as expressoes\n"
                       + " (3a + 6)/ 8 e (2a + 10)/6 sejam iguais.\n" + 
               		"a) 30\n" + 
               		"b) 22\n" + // Resposta Correta 
               		"c) 18\n" + 
               		"d) 10\n" + 
               		"e) 26\n"
               		+ "Digite a alternativa correta:");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("b")) { // Compara de a resposta da certa 
                   
                	Limpar();
                	desenho(8);  desenho(11); desenho(6);
                   
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                    if(cHP<=0){cHP=0; desenho(12); }
                    desenho(8);desenho(9);
                    System.out.println("Voce Recebeu dano do enimigo\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                    
                }
            } while (!Resposta.equalsIgnoreCase("b"));

            break;

        case 1:

            do {
                                   
               desenho(4);  desenho(5); desenho(10);
            
               System.out.println("2. Um pacote do biscoito Saboroso custa R$ 1,25. Se Joao comprou N pacotes\n"
                       + "desse biscoito gastando R$ 13,75, o valor de N e igual a?\n"  
      		         +  "a) 11\n"    // Resposta Correta                        
      	             +  "b) 12\n"  
      		         +  "c) 13\n"  
      		         +  "d) 14\n"  
      		         +  "e) 15\n"
      		         + "Digite a alternativa correta:");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("a")) {
                	
                   Limpar();
                   desenho(8); desenho(11); desenho(6);
                                       
                   
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                    if(cHP<=0){ cHP=0;  desenho(12); }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do enimigo\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                }
                
            } while (!Resposta.equalsIgnoreCase("A"));

            break;

        case 2:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
               System.out.println("3. Resolva a equacao: 7(2x-3)+2(x+1)-5(x-9)=3x+10.\n"
               		+ "a) 2\n"
               		+ "b) 4\n"
               		+ "c) 3\n"
               		+ "d) -2\n" // Resposta Correta
               		+ "e) -4\n"
               		+ "Digite a alternativa correta:");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("D")) {
                    
                	Limpar();
                    desenho(8); desenho(11); desenho(6);
                                       
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do"+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                }
                
            } while (!Resposta.equalsIgnoreCase("D"));
            break;

        case 3:
            do {
                                   
               desenho(4); desenho(5);  desenho(10);
            
               System.out.println("4. Que numero eu sou? O dobro de meu antecessor, menos 3, e igual a 25\n"
               		+ "a) 16\n"
               		+ "b) 13\n"
               		+ "c) 15\n" // Resposta Correta
               		+ "d) 14\n"
               		+ "e) 12\n"
               		+ "Digite a alternativa correta:");
                Resposta = ent.next();
                if (Resposta.equalsIgnoreCase("C")) {
                   
                	Limpar();
                	desenho(8); desenho(11); desenho(6);
                	
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                    
                }
                
            } while (!Resposta.equalsIgnoreCase("C"));
            break;
            
        case 4:
            do {
               
               desenho(4); desenho(5); desenho(10);
            
               System.out.println("5. Os 44 alunos da 7 serie A de uma escola representam 40%\n"
                       + " de todos os alunos da 7 serie dessa mesma instituicao. Quantos \n"
                       + "sao os alunos da 7 serie dessa escola?\n"  
                       + "a) 120\n"  
                       + "b) 105\n" 
                       + "c) 90\n"  
                       + "d) 110\n" // Resposta correta
                       + "e) 100\n"
                       + "Digite a alternativa correta:");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("D")) {
                    
                	Limpar();
                	desenho(8);desenho(11); desenho(6);
                                   
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12);  }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                    
                }
            
            } while (!Resposta.equalsIgnoreCase("D"));
              break;
        
        case 5:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
            
               System.out.println("6. Sabe-se que o preso a ser pago por uma corrida de taxi\n"
                       + "inclui uma parcela fixa, que e denominada bandeirada, e\n"
                       + "uma parcela variavel, que e funcao da distancia percorrida.\n"
                       + "Se o preso da bandeirada e R$4,60 e o quilimetro rodado e\n"
                       + "R$0,96, qual a distancia percorrida por um passageiro que\n"
                       + "pagou R$19,00?\n"
                       + "a) 15 Km\n" // Resposta correta
                       + "b) 16 Km\n"
                       + "c) 17 Km\n"
                       + "d) 18 Km\n"
                       + "e) 19 Km\n"
                       + "Digite a alternativa correta:");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("A")) {
                	
                   Limpar();
                   desenho(8);  desenho(11); desenho(6);
                                     
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0;  desenho(12);  }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                    
                }
                
            } while (!Resposta.equalsIgnoreCase("A"));
            break;
    }
    
    return batalha;
}

//Funcao com as feedback da terceira batalha.
static void feedback_Terceira_Batalha(int Q) {
    
    /*
    =============================== Feedback de conjuntos numericos =================================
     */
        switch (Q){
            case 0:
            	System.out.println("==================== Resolucao =====================\n"
            					 + "---------------- Resposta Correta (B) --------------\n"
            					 + "(3a + 6) / 8 = (2a + 10) / 6\n"
            					 + "=> 6 (3a + 6) = 8 (2a + 10)\n"
            					 + "=> 18a + 36 = 16a + 80\n"
            					 + "=> 2a =  44\n"
            					 + "=> a = 44/2\n "
            					 + "a = 22\n");
                break;
            
            case 1:
            	System.out.println("==================== Resolucao =====================\n" 
                        + "---------------- Resposta Correta (A) --------------\n"
                        + "1,25.N = 13,75\n"
                        + "N = 13,75/1,25\n"
                        + "N = 11\n");
                break;
            
           
            case 2:
            	System.out.println("==================== Resolucao =====================\"\n"  
            					+ "---------------- Resposta Correta (D) --------------)\"\n"  
          		         		+ "Primeiro, precisamos eliminar os parateses e depois isolar a letra x :\n"  
          		         		+ "7(2x-3)+2(x+1)-5(x-9)=3x+10 \n" 
          		         		+ "14x-21+2x+2-5x+45=3x+10\n"
          		         		+ "14x+2x-5x-3x = 10+21-2-45\n"
                                + "8x=-16\n"
                                + "x=-16/8\n"
                                + "x= -2\n");
                 break; 
            case 3:
            	System.out.println("==================== Resolucao =====================\"\n"  
                        + "---------------- Resposta Correta (C) --------------\n"  
		         	    + "Um numero: x \n"  
		                + "Antecessor: x -1\n" 
		                + "Dobro do meu antecessor menos tres= 2(x -1) -3 = 25\n\n"
		                + "Resolvendo a equacao \n"
                        + "2(x -1) -3 = 25\n"
                        + "2x -2 -3 = 25\n"
                        + "2x -5 = 25\n"
                        + "2x = 30\n"
                        + "x = 30/2\n"
                        + "x = 15\n");
            break;                
              
            case 4:
            	System.out.println("==================== Resolucao =====================\n"  
            						+ "---------------- Resposta Correta (D) --------------\n"  
		         		 			+ "Alunos: x \n"  
                                    + "40% = 40/100 = 2/5 dos alunos \n" 
                                    + "2/5 de x\n"
                                    + "(2/5)x = 44\n"
                                    + "2x = 44 * 5\n\n"
                                    + "2x = 220\n"
                                    + "x = 220/2\n"
                                    + "x = 110\n");
                break;
         
            case 5:
            	System.out.println("==================== Resolucao =====================\n"  
		         		 + "---------------- Resposta Correta (A) --------------\n"  
		         		 + "19 = 0,96x + 4,60 \n"  
                                    + "-0,96x = 4,6 -19 \n" 
                                    + "-0,96x = -14,4 \n"
                                    + "x = -14,4/- 0,96\n"
                                    + "x = 15\n"); 
                break;
        }
}

//Funcao com as questoes da quarta batalha.
static int Quarta_batalha (int Batalha) {
	
    String Resposta;

    
    /*
    ============================== Perguntas de sistemas numericos ===================================
     */
    
    switch (Batalha) {
        
        case 0:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
            
                System.out.println("1.Indique qual dos seguintes numeros nao e hexadecimais validos:\r\n" + 
                				   "BED, CAB, DEAD, BAG e F0CA.\n\n"
                				 + "a) BAG\n"
                				 + "b) CAB\n"
                				 + "c) F0CA\n" // resposta correta
                				 + "d) BED\n"
                				 + "e) DEAD\n");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("a")) { // Compara de a resposta da certa 
                  
                	Limpar();
                    desenho(8); desenho(11); desenho(6);
                    
                   
                } else {
                	Xp=Xp-1;
                	Limpar();
                    cHP = cHP - ATK_I;
                    if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                    
                }
            } while (!Resposta.equalsIgnoreCase("a"));

            break;

        case 1:

            do {
                                   
               desenho(4); desenho(5); desenho(10);
                
                System.out.println("2. Zezinho tem 18hex (Hexadecimal) bolas. Da 100b (binario) para Luizinho\n"
                				 + "e ambos ficarao com quantidades iguais. Quantas bolas tinhas Luizinho\n"
                				 + "inicialmente?\n\n"
                				 + 	"a) 10100 b (binario)\n" + 
                				 	"b) 18 d    (Decimal)\n" + 
                				 	"c) 1A hex  (hexadecimal)\n" + 
                				 	"d) 1110 b  (binario)\n" + 
                				 	"e) 16 d    (decimal)\n"); // Resposta Correta
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("e")) {
                  
                	Limpar();
                	desenho(8); desenho(11);  desenho(6);

                } else {
                	Xp=Xp-1;
                	Limpar();                       
                    cHP = cHP - ATK_I;
                    if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                }
            } while (!Resposta.equalsIgnoreCase("e"));

            break;

        case 2:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
               
                System.out.println("3.Resolva o calculo abaixo:\n" + 
                		"(1000b * 101b) / 10b + (11010b - 1100b)\n\n" + 
                		"a) 30d\n" + 
                		"b) 34d\n" + // Resposta Correta
                		"c) 40d\n" + 
                		"d) 42d\n" + 
                		"e) 28d\n");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("b")) {
                   
                	Limpar();
                    desenho(8); desenho(11); desenho(6);
                                      
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8);  desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"!\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                }
            } while (!Resposta.equalsIgnoreCase("b"));

            break;

        case 3:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
            
                System.out.println("4. Oito estudantes se encontram e cada um cumprimenta o outro com um aperto de mao.\n" + 
                				   "Quantos apertos de mao se trocaram?. responda em binario.\n\n" + 
                				   "a)  11110b\n" + 
                				   "b)  100010b\n" + // Resposta Correta
                				   "c)  11100b\n" + 
                				   "d)  100000b\n" + 
                				   "e)  11010b\n");
                Resposta = ent.next();
                
                if (Resposta.equalsIgnoreCase("b")) {
                	
                	Limpar();
                	desenho(8); desenho(11); desenho(6);
                        
                } else {
                	Xp=Xp-1;
                    Limpar();
                    cHP = cHP - ATK_I;
                    if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8);
                    desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                }
            } while (!Resposta.equalsIgnoreCase("b"));
            break;
            
        case 4:
            do {
               
               desenho(4);  desenho(5); desenho(10);
            
                System.out.println("5. Um sistema de numeracao visa a representar valores de forma consistente atraves\n" + 
                				   "da utilizacao de simbolos e dando significado ao posicionamento destes. O sistema \n" + 
                				   "de numeracao mais conhecido e o decimal, que opera com a base 10. No entanto, existem\n" + 
                				   "diversos outros sistemas de numeracao, como e o caso do octal, hexadecimal e binario. \n" + 
                				   "A respeito dos sistemas de numeracao e alguns de seus conceitos e considerando a \n" + 
                				   "representacao 1E1, analise as afirmativas abaixo.\n" + 
                				   "\n" + 
                				   "I - E uma representacao pertencente ao sistema de numeracao hexadecimal.\n" + 
                				   "II - Convertendo-a para base binaria, verificaremos que possui o bit menos" +
                				   "significativo igual a 0.\n" + 
                				   "III - Se convertida para a base decimal, equivale ao numero 481.\n" + 
                				   "Assinale a alternativa correta:\n\n" + 
                				   "a) somente as afirmativas I e II estao corretas.\n" + 
                				   "b) somente a afirmativa III esta correta.\n" + 
                				   "c) somente a afirmativa I esta correta.\n" + 
                				   "d) somente as afirmativas I e III estao corretas.\n" + // Resposta correta 
                				   "e) todas as afirmativas estao corretas.\n");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("d")) {
                	
                	Limpar();
                	desenho(8); desenho(11); desenho(6);
                                          
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12); }
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar();
                
                }
            } while (!Resposta.equalsIgnoreCase("d"));
              break;
        
        case 5:
            do {
                                   
               desenho(4); desenho(5); desenho(10);
            
                System.out.println("6.Considerando o numero 31, em base decimal, assinale a alternativa que indica o valor \n" + 
                		"que representa este numero nas bases Hexadecimal e Octal, respectivamente.\n\n" +
                		"a) 1F e 37\n" + // Resposta correta
                		"b) 2E e 35\n" + 
                		"c) A e 8\n" + 
                		"d) 3A e 42\n" + 
                		"e) 3C e 12\n");
                Resposta = ent.next();

                if (Resposta.equalsIgnoreCase("a")) {
                   
                	Limpar();
                    desenho(8); desenho(11); desenho(6);
                                          
                } else {
                	Xp=Xp-1;
                	Limpar();
                	cHP = cHP - ATK_I;
                	if(cHP<=0){ cHP=0; desenho(12);}
                    desenho(8); desenho(9);
                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
                    desenho(10);
                    ent.nextLine(); ent.nextLine();
                    Limpar(); 
                    
                }
            } while (!Resposta.equalsIgnoreCase("a"));
            break;
    }
    
    		return Batalha;
	
    }

//Funcao com as feedback da quarta batalha.
static void feedback_Quarta_Batalha(int Q) {
	
	/*
    =============================== Feedback de sistema numericos =================================
     */
        switch (Q){
            case 0:
            	System.out.println("==================== Resolucao =====================\n"
            					 + "---------------- Resposta Correta (C) --------------\n"
            					 + "Os numeros hexadecimais sao composto por:\n\n" 
            					 + "0,1,3,4,5,6,7,8,9,a,b,c,d,e,f\n" 
            					 + "Resposta correta a) BAG - G nao faz parte do sistema hexadecimal\n");
                break;
            
            case 1:
            	System.out.println("==================== Resolucao =====================\n" 
                        + "---------------- Resposta Correta (A) --------------\n"
                        + "Transfore 18 hex em binario.\n" +
                        "Fazer por parte:\n" + 
                        "1 hex = 0001b\n" + 
                        "8 hex = 1000b\n" + 
                        "18 hex = 00011000b = 11000b.\n\n" +
                        "transforme o 11000b e 101b em decimal:\n" + 
                        "2^4 | 2^3 | 2^2 | 2^1 | 2^0\r\n" + 
                        " 1  |  1  |  0  |  0  |  0  = 24d (decimal)\n" + 
                        " 0  |  0  |  1  |  0  |  0  = 4d  (decimal)\n\n" + 
                        "se zezinho tem 24 bolas e da 4 para luizinho ele ficara com 20,\n" + 
                        "se luizinho fica com a mesma quantidade ele tinha inicialmente \n" + 
                        "20 - 4 = 16 bolas:\n");
                break;
            
           
            case 2:
            	System.out.println("==================== Resolucao =====================\"\n"  
            					+ "---------------- Resposta Correta (B) --------------)\"\n"  
          		         		+ "Transforme tudo em decimal:\n" + 
          		         		"\n" + 
          		         		"| 2^4 | 2^3 | 2^2 | 2^1 | 2^0\n" + 
          		         		"|  0  |  1  |  0  |  0  |  0  = 8d \n" + 
          		         		"|  0  |  0  |  1  |  0  |  1  = 5d  \n" + 
          		         		"|  0  |  0  |  0  |  1  |  0  = 2d \n" + 
          		         		"|  1  |  1  |  0  |  1  |  0  = 26d \n" + 
          		         		"|  0  |  1  |  1  |  0  |  0  = 12d\n" + 
          		         		"\n" + 
          		         		"(8 * 5) / 2 + (26 - 12)\n" + 
          		         		"40/2 + 14  \n" + 
          		         		"20 + 14 = 34\n");
                 break; 
            case 3:
            	System.out.println("==================== Resolucao =====================\"\n"  
                        + "---------------- Resposta Correta (B) --------------\n"  
		         	    + "Primeiro estudante comprimenta 7 pessoas\r\n" + 
		         	    "Segundo estudante comprimenta 7-1 pessoas\r\n" + 
		         	    "Terceiro estudante comprimenta 7-2 pessoas\r\n" + 
		         	    "Quarto estudante comprimenta 7-3 pessoas\r\n" + 
		         	    "Quinti estudante comprimenta 7-4 pessoas\r\n" + 
		         	    "Sexto estudante comprimenta 7-5 pessoas\r\n" + 
		         	    "Setimo estudante comprimenta 7-6 pessoas\r\n" + 
		         	    "Oitavo estudante comprimenta 7-7 pessoas\r\n" + 
		         	    "\n" + 
		         	    "7+6+5+4+3+2+1+0 = 28 apertos de mÃ£o\r\n" + 
		         	    "\n" + 
		         	    "converta as resposta em decimal:\r\n" + 
		         	    "\n" + 
		         	    "2^5 | 2^4 | 2^3 | 2^2 | 2^1 | 2^0\r\n" + 
		         	    " 0  |  1  |  1  |  1  |  1  |  0  = 30d \r\n" + 
		         	    " 1  |  0  |  0  |  0  |  1  |  0  = 34d  \r\n" + 
		         	    " 0  |  1  |  1  |  1  |  0  |  0  = 28d \r\n" + 
		         	    " 1  |  0  |  0  |  0  |  0  |  0  = 32d  \r\n" + 
		         	    " 0  |  1  |  1  |  0  |  1  |  0  = 26d\r\n");
            break;                
              
            case 4:
            	System.out.println("==================== Resolucao =====================\n"  
            						+ "---------------- Resposta Correta (D) --------------\n"
            						+ "Os numeros hexadecimais sao composto por:\n" + 
            						"0,1,3,4,5,6,7,8,9,a,b,c,d,e,f: \n" + 
            						"afirmativa I esta correta:\n" + 
            						"\n" + 
            						"converta 1E1 hex em binario\n" + 
            						"1 hex = 0001b\n" + 
            						"E hex = 1110b\n" + 
            						"1 hex = 0001b\n" + 
            						"1E1 hex = 111100001b\r\n" + 
            						"\n" + 
            						"Afirmativa II esta incorreta pois o bit menos significativo = 1\n" + 
            						"\n" + 
            						"converta agora para decimal\n" + 
            						"E hex = 14d\n" + 
            						"1 hex = 1d\n" + 
            						"1*16^2 = 256| E*16^1 = 224 | 1*16^0 = 1\n" + 
            						"\n" + 
            						"256+224+1= 481\n" + 
            						"\n" + 
            						"Afirmativa III esta correta\n");
                break;
         
            case 5:
            	System.out.println("==================== Resolucao =====================\n"  
		         		 + "---------------- Resposta Correta (A) --------------\n"  
		         		 + "converta 31 para hexadecimal\n" + 
		         		 "\n" + 
		         		 "31/16 = 1\n" + 
		         		 "resta = 15\n" + 
		         		 "resposta = 1f hexadecimal\n" + 
		         		 "\n" + 
		         		 "converta 31 para octal\n" + 
		         		 "\n" + 
		         		 "31/8 = 3\n" + 
		         		 "resta = 7\n" + 
		         		 "resposta = 37 octal\n"); 
                break;
        }
}

//Funcao com as questoes da quinta batalha.
static int Quinta_Batalha(int Batalha) { 
	
	 String Resposta;

	    
	    /*
	    ================ Perguntas de funcao de 1º e 2º grau =====================
	     */
	    switch (Batalha) {
	        
	        case 0:
	            do {
	                                   
	               desenho(4); desenho(5); desenho(10);
	            
	                System.out.println("1. Dada a funcao de primeiro grau f(x) = 2x + 3, qual e o valor de f(10)?\r\n" + 
	                		"\n" + 
	                		"a)35\r\n" + 
	                		"b)28\r\n" + 
	                		"c)33\r\n" + 
	                		"d)16\r\n" + 
	                		"e)23\r\n"); // Resposta correta
	                Resposta = ent.next();    // jogador escolhe um das alterativas 

	                if (Resposta.equalsIgnoreCase("e")) { // Compara se a resposta esta correta 
	                  
	                	Limpar();
	                    desenho(8); desenho(11); desenho(6);
	                    
	                   
	                } else {    //se a esposta esta errada 
	                	Xp=Xp-1;     // subtrai 1 de xp do jogador    
	                	Limpar();
	                    cHP = cHP - ATK_I;  // Hp do personagem e subtraido pelo ataque do  inimigo 
	                    if(cHP<=0){ cHP=0; desenho(12); }   // caso o HP do jogador zerar entra no desenho 12 e prita Game over e sai do jogo
	                    desenho(8); desenho(9);
	                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
	                    desenho(10);
	                    ent.nextLine(); ent.nextLine();
	                    Limpar();
	                    
	                }
	            } while (!Resposta.equalsIgnoreCase("e"));  //Repete o laco enquanto a resposta for incorreta

	            break;

	        case 1:

	            do {
	                                   
	               desenho(4); desenho(5); desenho(10);
	                
	                System.out.println("2. Qual e o coeficiente angular (taxa de variacao) da funcao de primeiro grau f(x) = 9x - 27?\n\n" + 
	                		"a)-27\n" + 
	                		"b)x\n" + 
	                		"c)-9\n" + 
	                		"d)9\n" + // Resposta Correta
	                		"e)27\n"); 
	                Resposta = ent.next();

	                if (Resposta.equalsIgnoreCase("d")) {
	                  
	                	Limpar();
	                	desenho(8); desenho(11);  desenho(6);

	                } else {
	                	Xp=Xp-1;
	                	Limpar();                       
	                    cHP = cHP - ATK_I;
	                    if(cHP<=0){ cHP=0; desenho(12); }
	                    desenho(8); desenho(9);
	                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
	                    desenho(10);
	                    ent.nextLine(); ent.nextLine();
	                    Limpar();
	                }
	            } while (!Resposta.equalsIgnoreCase("d"));

	            break;

	        case 2:
	            do {
	                                   
	               desenho(4); desenho(5); desenho(10);
	               
	                System.out.println("3. Qual e a razao da funcao do primeiro grau f(x) = 5x + 15?\n\n" + 
	                		"a)-3\n" + // Resposta correta
	                		"b)5\n" + 
	                		"c)10\n" + 
	                		"d)-5\n" + 
	                		"e)3\n");
	                Resposta = ent.next();

	                if (Resposta.equalsIgnoreCase("a")) {
	                   
	                	Limpar();
	                    desenho(8); desenho(11); desenho(6);
	                                      
	                } else {
	                	Xp=Xp-1;
	                	Limpar();
	                	cHP = cHP - ATK_I;
	                	if(cHP<=0){ cHP=0; desenho(12); }
	                    desenho(8);  desenho(9);
	                    System.out.println("Voce Recebeu dano do "+Nome_I+"!\n\nTENTE NOVAMENTE!!!");
	                    desenho(10);
	                    ent.nextLine(); ent.nextLine();
	                    Limpar();
	                }
	            } while (!Resposta.equalsIgnoreCase("a"));

	            break;

	        case 3:
	            do {
	                                   
	               desenho(4); desenho(5); desenho(10);
	            
	                System.out.println("4. As duas solucoes de uma equacao do Segundo grau sao -1 e 1/3. Entao a equacao e:\r\n" + 
	                		"\n\n" + 
	                		"a) 3x^2 -x -1 = 0\n" +  
	                		"b) 3x^2 + x -1 = 0\n" +
	                		"c) 3x^2 + 2x -1 = 0\n" + // Resposta correta
	                		"d) 3x^2 -2x -2 = 0\n" +
	                		"e) 3x^2 -x + 1 = 0\n");
	                Resposta = ent.next();
	                
	                if (Resposta.equalsIgnoreCase("c")) {
	                	
	                	Limpar();
	                	desenho(8); desenho(11); desenho(6);
	                        
	                } else {
	                	Xp=Xp-1;
	                    Limpar();
	                    cHP = cHP - ATK_I;
	                    if(cHP<=0){ cHP=0; desenho(12); }
	                    desenho(8);
	                    desenho(9);
	                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
	                    desenho(10);
	                    ent.nextLine(); ent.nextLine();
	                    Limpar();
	                }
	            } while (!Resposta.equalsIgnoreCase("c"));
	            break;
	            
	        case 4:
	            do {
	               
	               desenho(4);  desenho(5); desenho(10);
	            
	                System.out.println("5. A maior raiz da equacao -2x^2 + 3x + 5 = 0 vale:\n\n" +
	                		"a) -1\n" + 
	                		"b) 1\n" + 
	                		"c) 2\n" + 
	                		"d) 2,5\n" + // Resposta correta
	                		"e) (3 + v19)/4\n");
	                Resposta = ent.next();

	                if (Resposta.equalsIgnoreCase("d")) {
	                	
	                	Limpar();
	                	desenho(8); desenho(11); desenho(6);
	                                          
	                } else {
	                	Xp=Xp-1;
	                	Limpar();
	                	cHP = cHP - ATK_I;
	                	if(cHP<=0){ cHP=0; desenho(12); }
	                    desenho(8); desenho(9);
	                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
	                    desenho(10);
	                    ent.nextLine(); ent.nextLine();
	                    Limpar();
	                
	                }
	            } while (!Resposta.equalsIgnoreCase("d"));
	              break;
	        
	        case 5:
	            do {
	                                   
	               desenho(4); desenho(5); desenho(10);
	            
	                System.out.println("6. A respeito do estudo dos sinais de uma funcao do segundo grau,"
	                				 + "e possivel afirmar, com certeza, que:\n\n" +  
	                				   "a) O valor do discriminante(delta) nao pode ser usado para determinar a "
	                				 + "   quantidade de razes reais que uma \n" + 
	                				   "	funcao do segundo grau possui.\r\n" + 
	                				   "b) Se o valor do discriminante(delta) for igual a zero e o coeficiente a "
	                				 + "   for positivo, entao todos os pontos dessa funcao do segundo grau "
	                				 + "   estarao sob o eixo x.\r\n" +  
	                		           "c) Se o valor do discriminante(delta) for igual a zero e o coeficiente a for" //Resposta correta
	                		         + "   positivo, entao todos os pontos dessa funcao estarao acima do eixo x,"
	                	             + "   exceto pelo vertice que estara¡ sobre esse eixo.\r\n" +					
	                	               "d) Se o valor do discriminante(delta) for menor que zero, a funcao possui"
	                	             + "   duas raizes reais e distintas e outras duas raizes complexas.\n" +  
	                	           	   "e) Se o valor do discriminante(delta) for maior que zero, nao sera¡ possivel"
	                	             + "   calcular as raizes dessa funcao.\n");
	                Resposta = ent.next();

	                if (Resposta.equalsIgnoreCase("c")) {
	                   
	                	Limpar();
	                    desenho(8); desenho(11); desenho(6);
	                                          
	                } else {
	                	Xp=Xp-1;
	                	Limpar();
	                	cHP = cHP - ATK_I;
	                	if(cHP<=0){ cHP=0; desenho(12);}
	                    desenho(8); desenho(9);
	                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
	                    desenho(10);
	                    ent.nextLine(); ent.nextLine();
	                    Limpar(); 
	                    
	                }
	            } while (!Resposta.equalsIgnoreCase("c"));
	            break;
	            
	        case 6:
	            do {
	                                   
	               desenho(4); desenho(5); desenho(10);
	            
	                System.out.println("7. Dada a equacao 23x –2 · 8x + 1 = 4x – 1, podemos afirmar que sua solucao e um numero:\r\n" + 
	                		"a) natural.\r\n" + 
	                		"b) maior do que 1.\r\n" + 
	                		"c) de modulo maior do que 1.\r\n" + 
	                		"d) par.\r\n" + 
	                		"e) de modulo menor do que 1."); // Resposta correta
	                Resposta = ent.next();

	                if (Resposta.equalsIgnoreCase("e")) {
	                   
	                	Limpar();
	                    desenho(8); desenho(11); desenho(6);
	                                          
	                } else {
	                	Xp=Xp-1;
	                	Limpar();
	                	cHP = cHP - ATK_I;
	                	if(cHP<=0){ cHP=0; desenho(12);}
	                    desenho(8); desenho(9);
	                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
	                    desenho(10);
	                    ent.nextLine(); ent.nextLine();
	                    Limpar(); 
	                    
	                }
	            } while (!Resposta.equalsIgnoreCase("e"));
	            break;
	            
	        case 7:
	            do {
	                                   
	               desenho(4); desenho(5); desenho(10);
	            
	                System.out.println("8. Numa certa cidade, o numero de habitantes, num raio de r jm a \n"
	                		+ "partir do seu centro e dado por P(r) = k * 23r, em que k e constante e\n"
	                		+ " r > 0. Se há 98 304 habitantes num raio de 5 km do centro, quantos\n "
	                		+ "habitantes ha num raio de 3 km do centro?\r\n" + 
	                		" \r\n" + 
	                		"a)1536\r\n" + // Resposta correta
	                		"b)1330\r\n" + 
	                		"c)1028\r\n" + 
	                		"d)1442\r\n" + 
	                		"e)1516\r\n"); 
	                Resposta = ent.next();

	                if (Resposta.equalsIgnoreCase("A")) {
	                   
	                	Limpar();
	                    desenho(8); desenho(11); desenho(6);
	                                          
	                } else {
	                	Xp=Xp-1;
	                	Limpar();
	                	cHP = cHP - ATK_I;
	                	if(cHP<=0){ cHP=0; desenho(12);}
	                    desenho(8); desenho(9);
	                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
	                    desenho(10);
	                    ent.nextLine(); ent.nextLine();
	                    Limpar(); 
	                    
	                }
	            } while (!Resposta.equalsIgnoreCase("A"));
	            break;	            
	  
	        case 8:
	            do {
	                                   
	               desenho(4); desenho(5); desenho(10);
	            
	                System.out.println("9. O numero -3 e a raiz da equacao x2 - 7x - 2c = 0. Nessas condicoes,\n"
	                		+ "determine o valor do coeficiente c:\r\n" + 
	                		"a)18\r\n" + 
	                		"b)25\r\n" + 
	                		"c)9\r\n" + 
	                		"d)15\r\n" +  // Resposta correta
	                		"e)12\r\n"); 
	                Resposta = ent.next();

	                if (Resposta.equalsIgnoreCase("D")) {
	                   
	                	Limpar();
	                    desenho(8); desenho(11); desenho(6);
	                                          
	                } else {
	                	Xp=Xp-1;
	                	Limpar();
	                	cHP = cHP - ATK_I;
	                	if(cHP<=0){ cHP=0; desenho(12);}
	                    desenho(8); desenho(9);
	                    System.out.println("Voce Recebeu dano do "+Nome_I+"\n\nTENTE NOVAMENTE!!!");
	                    desenho(10);
	                    ent.nextLine(); ent.nextLine();
	                    Limpar(); 
	                    
	                }
	            } while (!Resposta.equalsIgnoreCase("D"));
	            break;	            
	            
	    }
	    
	    return Batalha;
}

//Funcao com as feedback da quinta batalha.
static void feedback_Quinta_Batalha(int Q) {
	
	/*
    =============================== Feedback de sistema numericos =================================
     */
        switch (Q){   // recebe o numero da questao por parametro (int Q)
            
        case 0:
            	System.out.println("==================== Resolucao =====================\n"
            					 + "---------------- Resposta Correta (E) --------------\n"
            					 + "f(10) = 2x+3\n" + 
            					 "f=2*10+3\n" + 
            					 "f=20+3\n" + 
            					 "f=23\n");
                break;
            
            case 1:
            	System.out.println("==================== Resolucao =====================\n" 
                        + "---------------- Resposta Correta (D) --------------\n"
                        + "O coeficiente angular de uma funcao do primeiro grau e \n" + 
                        "o numero que acompanha o x, logo temos que e 9.\n");
                break;
            
           
            case 2:
            	System.out.println("==================== Resolucao =====================\"\n"  
            					+ "---------------- Resposta Correta (A) --------------)\"\n"  
          		         		+ "Para encontrar a intercecao -x/zero, substitua f(x)=0\r\n" + 
          		         		"0=5x+15\r\n" + 
          		         		"-5x=15\r\n" + 
          		         		"x=15/-5\r\n" + 
          		         		"x=-3\r\n");
                 break; 
            case 3:
            	System.out.println("==================== Resolucao =====================\"\n"  
                        + "---------------- Resposta Correta (C) --------------\n"  
		         	    + "Para encontrar a equacao do segundo grau a partir de suas raizes, basta fazer:\n\n" + 
		         	    "(x -S1) · (x -S2) = 0\n\n" +
		         	    "S1 e S2 sao as raizes da equacao. Vamos substituilas na operacao acima:\n\n" +
		         	    "(x -(-1)) · (x -(1/3)) = 0\n" + 
		         	    "(x + 1) · (x -(1/3)) = 0\n" + 
		         	    "x^2 -(1/3)x + x -1/3 = 0\n" + 
		         	    "x^2 + (2/3)x -1/3 = 0\n\n" + 
		         	    "Podemos multiplicar toda a equacao por 3:\n" + 
		         	    "3x^2 + 2x -1 = 0\n");
            break;                
              
            case 4:
            	System.out.println("==================== Resolucao =====================\n"  
            						+ "---------------- Resposta Correta (D) --------------\n"
            						+ "Para resolver essa equacao do segundo grau, vamos utilizar a Formula de Bhaskara. \n" + 
            						"Os coeficientes da equacao sao a = -2, b=3 e c=5.\n" + 
            						"Substituindo-os na furmula, temos:\n\n" + 
            						"? = 3^2 -4.(-2).5\n" + 
            						"? = 9 + 40\n" + 
            						"? = 49\n" + 
            						"\r\n" + 
            						"x = -3 (+-) v49\n" + 
            						"      2.(-2)\n\n" + 
            						"x = -3  (+-)7\n" + 
            						"      -4\n\n" +
            						"x' = -3 + 7 = 4 = -1\n" + 
            						" -4     -4\n" + 
            						"x'' = -3 -7 = -10 = 2,5\n" + 
            						"-4       -4\n\n" + 
            						"Encontramos duas raizes para a equacao, x' = -1 e x'' = 2,5; e a maior delas e x'' = 2,5.\n");
                break;
         
            case 5:
            	System.out.println("==================== Resolucao =====================\n"  
		         		 + "---------------- Resposta Correta (C) --------------\n"  
		         		 + "a) Incorreta!\r\n" + 
		         		 "\r\n" + 
		         		 "O valor do discriminante pode ser usado pra descobrir quantas "
		         	   + "raizes reais a funcao do segundo grau possuir.\n\n"+ 
		         		 "b) Incorreta!\n\n" + 
		         		 "Nessas hipoteses, todos os pontos da parabola, exceto o vertice, "
		         	   + "estarao acima do eixo x.\n\n" + 
		         		 "c) Correta!\n\n" + 
		         		 "d) Incorreta!\n\n" + 
		         		 "Nessa hipotese, a funcao nao possui raizes reais. Embora possua "
		         	   + "raizes complexas.\n\n" + 
		         		 "e) Incorreta!\n\n" + 
		         		 "Se o valor do discriminante e maior que zero, entao e possivel "
		         	   + "calcular as raizes de uma funcao do segundo grau.\n"); 
                break;
                
            case 6:
            	System.out.println("==================== Resolucao =====================\n"  
		         		 + "---------------- Resposta Correta (E) --------------\n"  
		         		 + "A fim de facilitar a resolucao da equacao exponencial 23x – 2 · 8x + 1 = 4x – 1,\n"
		         		 + "vamos reescrever todas as potencias na base 2. A saber, temos: 4 = 22 e 8 = 23.\n "
		         		 + "Substituindo na equacao:\r\n" + 
		         		 "23x –2 · 8x + 1 = 4x –1\r\n" + 
		         		 "23x –2 · (23)x + 1 = (22)x –1\r\n" + 
		         		 "23x –2 · 23(x + 1) = 22(x –1)\r\n" + 
		         		 "23x –2 · 23x + 3 = 22x –2\r\n" + 
		         		 "2(3x –2 ) + (3x + 3) = 22x –2\r\n" + 
		         		 "Como temos uma equacao exponencial que apresenta potencias de mesma base nos dois lados\n"
		         		 + "da equacao, podemos igualar os expoentes:\r\n" + 
		         		 "(3x –2) + (3x + 3) = 2x –2\r\n" + 
		         		 "6x + 1 = 2x –2\r\n" + 
		         		 "6x –2x = –2 –1\r\n" + 
		         		 "4x = –3\r\n" + 
		         		 "x = –3\r\n" + 
		         		 "      4\r\n" + 
		         		 "|x| = 3/4\r\n" + 
		         		 "Portanto, a alternativa que classifica corretamente o resultado da equacao e a letra e, que "
		         		 + "afirma que x e um numero de modulo menor do que 1.\r\n"); 
                break; 
                
            case 7:
            	System.out.println("==================== Resolucao =====================\n"  
            			+ "---------------- Resposta Correta (A) --------------\\n"
            			+ "(r) = k * 23r\n" + 
            			"98 304 = k * 2 3*5\r\n" + 
            			"98 304 = k * 215\r\n" + 
            			"98 304 = k * 32 768\r\n" + 
            			"k =98 304 / 32 768\r\n" + 
            			"k = 3\r\n" + 
            			"Calculando o numero de habitantes num raio de 3 km\r\n" + 
            			"P (r) = k * 23r\r\n" + 
            			"P (3) = 3 * 23*3\r\n" + 
            			"P (3) = 3 * 512\r\n" + 
            			"P(3) = 1536\r\n" + 
            			"O numero de habitantes num raio de 3 km e igual a 1536.\r\n"); 
                break;

            case 8:
            	System.out.println("==================== Resolucao =====================\n"  
            			+"---------------- Resposta Correta (D) --------------\n"
            			+ "(-3)^2 - 7*(-3) - 2c = 0\r\n" + 
            			"9 +21 - 2c = 0\r\n" + 
            			"30 = 2c\r\n" + 
            			"c = 15"); 
                break; 
        }
}

// Funcao com todos os desenhos no jogo.
static void desenho(int x) {
	switch(x) {   								 // O switch chama o desenho que deve ser printado na tela.
		
		case 1:
                        System.out.println("\n"+
                "				BEM VINDO A \n"+
	            "===================================================================================\r\n"+
				"`7MM\"\"\"Mq.           `7MM    db                           db               \r\n" + 
				"  MM   `MM.            MM                                                  \r\n" + 
				"  MM   ,M9   .gP\"Ya    MM  `7MM    ,dW\"Yvd  `7MM  `7MM  `7MM   ,6\"Yb.      \r\n" + 
				"  MMmmdM9   ,M'   Yb   MM    MM   ,W'   MM    MM    MM    MM  8)   MM      \r\n" + 
				"  MM  YM.   8M\"\"\"\"\"\"   MM    MM   8M    MM    MM    MM    MM   ,pm9MM      \r\n" + 
				"  MM   `Mb. YM.    ,   MM    MM   YA.   MM    MM    MM    MM  8M   MM      \r\n" + 
				".JMML. .JMM. `Mbmmd' .JMML..JMML.  `MbmdMM    `Mbod\"YML..JMML.`Moo9^Yo.    \r\n" + 
				"                                        MM                                 \r\n" + 
				"                                      .JMML.                           \r\n"+
				"====================================================================================\n"+
				"			    ,,           \r\n" + 
				"			     `7MM           \r\n" + 
				"			       MM           \r\n" + 
				"			  ,M\"\"bMM   .gP\"Ya  \r\n" + 
				"			,AP    MM  ,M'   Yb \r\n" + 
				"			8MI    MM  8M\"\"\"\"\"\" \r\n" + 
				"			`Mb    MM  YM.    , \r\n" + 
				"			 `Wbmd\"MML. `Mbmmd' \r\n"+
				"====================================================================================\n"+
				"`7MM\"\"\"Mq.                                                   \r\n" + 
				"  MM   `MM.                                                  \r\n" + 
				"  MM   ,M9   ,6\"Yb.   .P\"Ybmmm `7MMpMMMb.   ,6\"Yb.  `7Mb,od8 \r\n" + 
				"  MMmmdM9   8)   MM  :MI  I8     MM    MM  8)   MM    MM' \"' \r\n" + 
				"  MM  YM.    ,pm9MM   WmmmP\"     MM    MM   ,pm9MM    MM     \r\n" + 
				"  MM   `Mb. 8M   MM  8M          MM    MM  8M   MM    MM     \r\n" + 
				".JMML. .JMM.`Moo9^Yo. YMMMMMb  .JMML  JMML.`Moo9^Yo..JMML.   \r\n" + 
				"                     6'     dP                               \r\n" + 
				"                     Ybmmmd\n"+
				"====================================================================================\n");
				break;
		case 2: 
         System.out.println(" ___          _                    _                          \r\n" + 
              " |_ _|  _ _   | |_   _ _   ___   __| |  _  _   __   __ _   ___ \r\n" + 
              "  | |  | ' \\  |  _| | '_| / _ \\ / _` | | || | / _| / _` | / _ \\\r\n" + 
              " |___| |_||_|  \\__| |_|   \\___/ \\__,_|  \\_,_| \\__| \\__,_| \\___/\n");
				break;
		case 3: 
         System.out.println(""
                        	  + " _            _                 _          _ \r\n" + 
                        		" | |_   _  _  | |_   ___   _ _  (_)  __ _  | |\r\n" + 
                        		" |  _| | || | |  _| / _ \\ | '_| | | / _` | | |\r\n" + 
                        		"  \\__|  \\_,_|  \\__| \\___/ |_|   |_| \\__,_| |_");
				break;
        case 4: 
         System.out.println("         _ _,,           ,        ,, ,,          \n" +
                                "         -/  )    _    ||    _   || ||      _   \n" +
                                "        ~||_<    < \\, =||=  < \\, || ||/\\\\  < \\, \n" +
                                "         || \\\\   /-||  ||   /-|| || || ||  /-|| \n" +
                                "         ,/--|| (( ||  ||  (( || || || || (( || \n" +
                                "        _--_-'   \\/\\\\  \\\\,  \\/\\\\ \\\\ \\\\ |/  \\/\\\\ \n" +
                                "       (                              _/ ");
                                    break;
                   
       case 5: System.out.println("\n   	            q(ง •̀_•́)ง ผ(•̀_•́ผ)");
                                    break;
                   
       case 6:   System.out.println(
                            "(\\____/)\n" +
                            "( ° ͜ º)\n" +
                            "\\╭☞ \\╭☞"
                          + "\nPARABENS!!!");
                                break;
       case 7: System.out.println("                     \n"+
            			    " ____  ____  ____  ____  ____ \r\n" + 
            			    "||I ||||n ||||f ||||o ||||: ||\r\n" + 
            			    "||__||||__||||__||||__||||__||\r\n" + 
            			    "|/__\\||/__\\||/__\\||/__\\||/__\\|\r\n");
                    break;
                    
                    case 8: System.out.println(""
 + " _______  _______  _______  _______  _______  _______ _________ _______ \n" +
   "(  ____ )(  ____ \\(  ____ \\(  ____ )(  ___  )(  ____ \\\\__   __/(  ___  )\n" +
   "| (    )|| (    \\/| (    \\/| (    )|| (   ) || (    \\/   ) (   | (   ) |\n" +
   "| (____)|| (__    | (_____ | (____)|| |   | || (_____    | |   | (___) |\n" +
   "|     __)|  __)   (_____  )|  _____)| |   | |(_____  )   | |   |  ___  |\n" +
   "| (\\ (   | (            ) || (      | |   | |      ) |   | |   | (   ) |\n" +
   "| ) \\ \\__| (____/\\/\\____) || )      | (___) |/\\____) |   | |   | )   ( |\n" +
                    		"|/   \\__/(_______/\\_______)|/       (_______)\\_______)   )_(   |/     \\|");
                        break;
                    
    case 9: System.out.println(""+
                    		" ____  ____  ____  ____  ____  ____ \n" +
							"||E ||||r ||||r ||||a ||||d ||||a ||\n" +
							"||__||||__||||__||||__||||__||||__||\n" +
                    		"|/__\\||/__\\||/__\\||/__\\||/__\\||/__\\|");
                        break;
                        
                        
                        
                        
                        
     case 10: 
                       
                    
      System.out.println("===============================================================================\n"
                       + "             "+Nome_P+" | Nv: "+Nivel+" | HP: "+cHP+"/"+HP+" | ATK:"+ATK+" | Mana:"+cMana+"/"+Mana+"\n"
                       + "===============================================================================\n"
                       + "                    "+Nome_I+" HP:"+cHP_I+"/"+HP_I+" | ATK:"+ATK_I+"\n"
    		  		   + "===============================================================================\n");
                    
                    
                    break;
                        
                        
                        
                        
                        
                    
        case 11: System.out.println(
                    					" ____  ____  ____  ____  ____  ____  ____ \n" +
                    					"||C ||||o ||||r ||||r ||||e ||||t ||||a ||\n" +
                    					"||__||||__||||__||||__||||__||||__||||__||\n" +
                    					"|/__\\||/__\\||/__\\||/__\\||/__\\||/__\\||/__\\|");
                        break;
                        
                        
         case 12:
         System.out.println(""
         		+ "_______  _______  _______  _______    _______           _______  _______ \n" +
         		"(  ____ \\(  ___  )(       )(  ____ \\  (  ___  )|\\     /|(  ____ \\(  ____ )\n" +
         		"| (    \\/| (   ) || () () || (    \\/  | (   ) || )   ( || (    \\/| (    )|\n" +
         		"| |      | (___) || || || || (__      | |   | || |   | || (__    | (____)|\n" +
         		"| | ____ |  ___  || |(_)| ||  __)     | |   | |( (   ) )|  __)   |     __)\n" +
         		"| | \\_  )| (   ) || |   | || (        | |   | | \\ \\_/ / | (      | (\\ (   \n" +
         		"| (___) || )   ( || )   ( || (____/\\  | (___) |  \\   /  | (____/\\| ) \\ \\__\n" +
        		 "(_______)|/     \\||/     \\|(_______/  (_______)   \\_/   (_______/|/   \\__/\n\n\n\n\n\n\n\n\n");

                        ent.nextLine();
                    	System.exit(0);
                    	break;
                    
         case 13:
         System.out.println(""
                    	+	    "             _______ _________ _______   \r\n" + 
                    			"            (  ____ \\\\__   __/(       )  \r\n" + 
                    			"            | (    \\/   ) (   | () () |  \r\n" + 
                    			"            | (__       | |   | || || |  \r\n" + 
                    			"            |  __)      | |   | |(_)| |  \r\n" + 
                    			"            | (         | |   | |   | |  \r\n" + 
                    			"            | )      ___) (___| )   ( |  \r\n" + 
                    			"            |/       \\_______/|/     \\|  \n\n");
                    	System.out.println("               ______   _______   \r\n" + 
                    			"              (  __  \\ (  ____ \\  \r\n" + 
                    			"              | (  \\  )| (    \\/  \r\n" + 
                    			"              | |   ) || (__      \r\n" + 
                    			"              | |   | ||  __)     \r\n" + 
                    			"              | |   ) || (        \r\n" + 
                    			"              | (__/  )| (____/\\  \r\n" + 
                    			"              (______/ (_______/\n\n");
                    	
                    	System.out.println(" ______   _______ _________ _______  _                 _______ \r\n" + 
                    			"(  ___ \\ (  ___  )\\__   __/(  ___  )( \\      |\\     /|(  ___  )\r\n" + 
                    			"| (   ) )| (   ) |   ) (   | (   ) || (      | )   ( || (   ) |\r\n" + 
                    			"| (__/ / | (___) |   | |   | (___) || |      | (___) || (___) |\r\n" + 
                    			"|  __ (  |  ___  |   | |   |  ___  || |      |  ___  ||  ___  |\r\n" + 
                    			"| (  \\ \\ | (   ) |   | |   | (   ) || |      | (   ) || (   ) |\r\n" + 
                    			"| )___) )| )   ( |   | |   | )   ( || (____/\\| )   ( || )   ( |\r\n" + 
                    			"|/ \\___/ |/     \\|   )_(   |/     \\|(_______/|/     \\||/     \\|\n\n");
                    	
                    	System.out.println( "                Voce venceu a batalha!!");
                    	
                    	break;
         case 14:
        	 Limpar();
        	 			System.out.println("\r\n" + 
        	 					"					 _______ _________ _______ \r\n" + 
        	 					"					(  ____ \\\\__   __/(       )\r\n" + 
        	 					"					| (    \\/   ) (   | () () |\r\n" + 
        	 					"					| (__       | |   | || || |\r\n" + 
        	 					"					|  __)      | |   | |(_)| |\r\n" + 
        	 					"					| (         | |   | |   | |\r\n" + 
        	 					"					| )      ___) (___| )   ( |\r\n" + 
        	 					"					|/       \\_______/|/     \\|\r\n\n\n\n\n" + 
        	 					"                           ");
        	 			System.exit(0);
        	 			break;
		}
	}

//Funcao da escolha dos personagem.
static void Personagens(){
    int x;
    do{    // repete o laco eenquanto nao for escolhido uma opcao valida
    
    System.out.println("\n(1) Mago:\n"
    				 + "HP: 30 / ATK: 10 / MANA: 03 \n"
    				 + "+6 HP / +4 ATK / +2 MANA por nivel\n"
    				 + "\n(2) Arqueiro:\n"
    				 + "HP: 30 / ATK: 10 / MANA: 03 \n"
    				 + "+8 HP / +3 ATK / +2 MANA  por nivel\n"
    				 + "\n(3) Espadachim:\n"
    				 + "HP: 30 / ATK: 10/ MANA: 03 \n"
    				 + "+10 HP / +2 ATK / +2 MANA  por nivel\n");
            	
    x = ent.nextInt();         					 // escolha do personagem
    Personagem = x;
    
    }while(x<1 || x>3);
    
    //Printa o personagem escolhido e atribuita valores de ATK e HP.
    if(Personagem == 1){System.out.println("Voce escolheu o Mago:"); HP = 30; cHP = 30; ATK = 10; cMana = 3;}  
    if(Personagem == 2){System.out.println("Voce escolheu o Arqueiro:");HP = 30; cHP = 30; ATK = 10; cMana = 3;}
    if(Personagem == 3){System.out.println("Voce escolheu o Espadachim:");HP = 30; cHP = 30; ATK = 10; cMana = 3;}
    
    System.out.println("\nDe um nome ao nosso aventureiro:");
    Nome_P = ent.next();   						 // escolhe nome do personagem

}

// Funcao para subir de nivel.
static void Nivel() {
	Cnivel = Cnivel + Xp;  // a varialvel Cnivel e usada para armazena o xp do jogador 
	
	ent.nextLine();
	
	if (Cnivel >= 4) {    
        
		Cnivel = Cnivel - 4;  // diminui 4 da variavel Cnivel
		Nivel++;              //Acresenta 1 na variavel Nivel
        
		if(Personagem == 1){   // caso seja o mago
		HP = HP+6; cHP = cHP+6; ATK = ATK+4; Mana = Mana+1; cMana = cMana+1; // acresenta HP, ATK e mana do personagem
			System.out.println("-------------------------------------------------------------------------------\n"
							 + "                         PARABENS VOCE SUBIU DE NIVEL         \n"
							 + "-------------------------------------------------------------------------------\n"
							 + "                                  "+ Nome_P+"							\n"
							 + "                       HP: +6 | ATK: +4 | Mana: +1 | Nv:"+Nivel+"\n"
							 + "-------------------------------------------------------------------------------\n");
   		
		}  
        		
		if(Personagem == 2){  // caso seja o arqueiro
			HP = HP+8; cHP = cHP+8; ATK = ATK+3;Mana = Mana+1; cMana = cMana+1;
			System.out.println("-------------------------------------------------------------------------------\n"
					 + "                         PARABENS VOCE SUBIU DE NIVEL         \n"
					 + "-------------------------------------------------------------------------------\n"
					 + "                                  "+ Nome_P+"							\n"
					 + "                       HP: +6 | ATK: +4 | Mana: +1 | Nv:"+Nivel+"\n"
					 + "-------------------------------------------------------------------------------\n");
			}
        if(Personagem == 3){  // caso seja o espadachin
        	HP = HP+10; cHP = cHP+10; Mana = Mana+1; cMana = cMana+1;
        	System.out.println("-------------------------------------------------------------------------------\n"
					 + "                         PARABENS VOCE SUBIU DE NIVEL         \n"
					 + "-------------------------------------------------------------------------------\n"
					 + "                                  "+ Nome_P+"							\n"
					 + "                       HP: +6 | ATK: +4 | Mana: +1 | Nv:"+Nivel+"\n"
					 + "-------------------------------------------------------------------------------\n");
			}
        
       
        
        		classe();
        
        		ent.nextLine();
	}  
}

// Funcao de classes dos personagens
static void classe() {
	
	switch (Personagem) {  
	
	case 1:  // Personagem = 1, jogador escolheu o mago
		if(Nivel == 3) { // aparece a mensagem que voce subiu de nivel e classe
		System.out.println("=======================================================================================\n"
						 + "Parabens "+Nome_P+" suiu para o nivel "+Nivel+" e se tornou um "+Classe[0]+".\n"
						 + "---------------------------------------------------------------------------------------\n"
						 + "HABILIDADE NOVA ADQUIRIDA: CURA 							                   \n"
						 + "=======================================================================================\n");}
		if(Nivel == 5) {
		System.out.println("=======================================================================================\n"
						 + "Parabens "+Nome_P+" suiu para o nivel "+Nivel+" e se tornou um "+Classe[1]+".\n"
						 + "---------------------------------------------------------------------------------------\n"
						 + "HABILIDADE NOVA ADQUIRIDA: FURIA 									   \n"
						 + "=======================================================================================\n");}
		if(Nivel == 10) {
		System.out.println("=======================================================================================\n"
						 + "Parabens "+Nome_P+" suiu para o nivel "+Nivel+" e se tornou um "+Classe[2]+".\n"
						 + "---------------------------------------------------------------------------------------\n"
						 + "AGORA VOCE POSSUI O PODER NECESSARIO PARA PORTAR A RELIQUIA 			   \n"
						 + "=======================================================================================\n");}
		
		break;
	case 2:  //Personagem = 1, jogador escolheu o arqueiro
		if(Nivel == 3) {
		System.out.println("=======================================================================================\n"
						 + "Parabens "+Nome_P+" suiu para o nivel "+Nivel+" e se tornou um "+Classe[3]+".\n"
						 + "---------------------------------------------------------------------------------------\n"
						 + "HABILIDADE NOVA ADQUIRIDA: CURA                   							   \n"
						 + "=======================================================================================\n");}
		if(Nivel == 5) {
		System.out.println("=======================================================================================\n"
						 + "Parabens "+Nome_P+" suiu para o nivel "+Nivel+" e se tornou um "+Classe[4]+"\n"
						 + "---------------------------------------------------------------------------------------\n"
						 + "HABILIDADE NOVA ADQUIRIDA: FURIA 									   \n"
						 + "=======================================================================================\n");}
		if(Nivel == 10) {
		System.out.println("=======================================================================================\n"
						 + "Parabens "+Nome_P+" suiu para o nivel "+Nivel+" e se tornou um "+Classe[5]+".\n"
						 + "---------------------------------------------------------------------------------------\n"
						 + "AGORA VOCE POSSUI O PODER NECESSARIO PARA PORTAR A RELIQUIA 			   \n"
						 + "=======================================================================================\n");}	
		break;
	case 3:   //Personagem = 1, jogador escolheu o Espadachin
		if(Nivel == 3) {
		System.out.println("=======================================================================================\n"
						 + "Parabens "+Nome_P+" suiu para o nivel "+Nivel+" e se tornou um "+Classe[6]+".\n"
						 + "---------------------------------------------------------------------------------------\n"
						 + "HABILIDADE NOVA ADQUIRIDA:  CURA  									   \n"
						 + "=======================================================================================\n");}
		if(Nivel == 5) {
		System.out.println("=======================================================================================\n"
						 + "Parabens "+Nome_P+" suiu para o nivel "+Nivel+" e se tornou um "+Classe[7]+".\n"
						 + "---------------------------------------------------------------------------------------\n"
						 + "HABILIDADE NOVA ADQUIRIDA: FURIA 							        		   \n"
						 + "=======================================================================================\n");}
		if(Nivel == 10) {
		System.out.println("=======================================================================================\n"
						 + "Parabens "+Nome_P+" suiu para o nivel "+Nivel+" e se tornou um "+Classe[8]+".\n"
						 + "---------------------------------------------------------------------------------------\n"
						 + "AGORA VOCE POSSUI O PODER NECESSARIO PARA PORTAR A RELIQUIA 			   \n"
						 + "=======================================================================================\n");}
		break;

	} 
	
}

//Nessa funcao o jogador escolher qual Habilidade ira usar
static void Ataque() {
	
	int X;
	
	if(Nivel<3) {         
	   if(Personagem==1) {                     //Se o jogador escolher o mago
	      cMana = cMana +2;				       //Mana recebe mais 2
	      if(cMana>Mana) {cMana= Mana;}        //Nao deicha a variavel controle ser meior que a Mana

			
			do {							    // repete o laco ate o jogador escolher uma opcao valida
				Limpar();              
				desenho(4);
				desenho(10);
				System.out.println("\n\n(1) Bola de fogo | mana:0 | Dano:"+ATK
						 + "\nEscolha sua acao:");
						 X = ent.nextInt();		//escolhe o ataque
						 
						 switch (X) {		   
						 case 1:			
							 cHP_I = cHP_I-ATK;   //Hp do inimigo e subtraido pelo ataque do personagem
							 System.out.println("\nVoce acertou "+Nome_I+" com o fogo! | ATK: "+ATK+"\n");
							 if(cHP_I<0) {cHP_I=0;}      //nao deixa o HP do inimigo ser menor que 0
							 desenho(10);
							 break;
							 
						 default:                  // caso o jogador digite uma opcao invalida
							 System.out.println("Alternativa invalida!");
							 break;
						 }			
			}while(X!=1); 
		}
			
		
		if(Personagem==2) {     //se o jogador escolher o arqueiro
		
			cMana = cMana +1;   //Mana recebe mais 1
			if(cMana>Mana) {cMana= Mana;}    //Nao deicha a variavel controle ser meior que a Mana

			
			do {
					Limpar();
					desenho(4);
					desenho(10);
					System.out.println("\n\n(1) Disparo de flecha | mana:0 | Dano:"+ATK
							 + "\nEscolha sua acao:");
							 X = ent.nextInt();
							
							 switch (X) {		 
							 case 1:
								 cHP_I = cHP_I-ATK; 
								 System.out.println("\nVoce acertou "+Nome_I+" com o flecha! | ATK: "+ATK+"\n");
								 if(cHP_I<0) {cHP_I=0;}
								 desenho(10);
								 break;
								 
							 default:
								 System.out.println("Alternativa invalida!");
								 break;
							 }			}while(X!=1);
			
		}
			
			if(Personagem==3) {     //se o jogador escolher o espadachin
				
				cMana = cMana +1;   //Mana recebe mais 1
				if(cMana>Mana) {cMana= Mana;} //Nao deicha a variavel controle ser meior que a Mana

				
				do {
					
					Limpar();
					desenho(4);
					desenho(10);
					System.out.println("\n\n(1) Golpe com a espada | mana:0 | Dano:"+ATK
									 + "\nEscolha sua acao:");
							 		 X = ent.nextInt();
							 
							 switch (X) {		 
							 case 1:
								 cHP_I = cHP_I-ATK; 
								 System.out.println("\nVoce acertou "+Nome_I+" com o espada! | ATK: "+ATK+"\n");
								 if(cHP_I<0) {cHP_I=0;}
								 desenho(10);
								 break;
								 
							 default:
								 System.out.println("Alternativa invalida!");
								 break;
							 }
				}while(X!=1);
			
			}	
	}
	if(Nivel >=3 && Nivel <5) {    // entra se o nivel for maior que 3 e menor que 5
		if(Personagem==1) {
			
			cMana = cMana +2;
			if(cMana>Mana) {cMana= Mana;}

			
			do {                  // repete o laco enquanto o jogador nao escolher uma opcao valida
				Limpar();
				desenho(4);
				desenho(10);
				System.out.println("(1) Bola de fogo | mana:0 | Dano:"+ATK
						 + "\n(2) Cura / Mana: 5 / Dano: 0"
						 + "\nEscolha sua acao");
						 X = ent.nextInt();
						 
							switch (X) {     // escolhe o qual hablidade ira usar
							
							case 1: 
								cHP_I = cHP_I-ATK; 
								System.out.println("\nVoce acertou "+Nome_I+" com o fogo! | ATK: "+ATK+"\n");
								if(cHP_I<0) {cHP_I=0;}
								desenho(10);
								break;
					 
							case 2: 
								if(cMana>=5) {    // compara se o jogador tem mana suficiente para usar a habilidade
								if(cHP>=HP) {     // compara se o Hp ja esta cheio
									System.out.println("HP ja esta cheio escolha outra opcao!");
									X = 5;
									ent.nextLine();ent.nextLine();    
									break;
								}	
								cHP = cHP+10; cMana= cMana-5;     // cHP rece mais 10 e mana subtrai 5
								if(cHP>HP) {cHP= HP;}
								System.out.println("\nVoce usou cura! | HP + 10");
								desenho(10);
									}else {
										 System.out.println("Mana baixa: "+cMana);
										 X=5;
										 ent.nextLine();ent.nextLine();
									 }
								break;
					 
							default:
								System.out.println("Alternativa invalida!");
								break;
							}
			}while(X<1||X>2);
		}
			if(Personagem==2) {
				
				cMana = cMana +1;
				if(cMana>Mana) {cMana= Mana;}
	
				
				do {
					Limpar();
					desenho(4);
					desenho(10);
					System.out.println("(1) Disparo de flecha | mana:0 | Dano:"+ATK
							 + "\n(2) Cura / Mana: 5 / Dano: 0"
							 + "\nEscolha sua acao:");
							 X = ent.nextInt();
							 
								switch (X) {
								
								case 1: 
									cHP_I = cHP_I-ATK;
									System.out.println("\nVoce acertou "+Nome_I+" com a flecha! | ATK: "+ATK+"\n");
									if(cHP_I<0) {cHP_I=0;}
									desenho(10);
									break;
						 
								case 2: 
									if(cMana>=5) {
										if(cHP>=HP) {
											System.out.println("HP ja esta cheio escolha outra opcao!");
											X = 5;
											ent.nextLine();ent.nextLine();
											break;
										}	
										cHP = cHP+10; cMana= cMana-5;
										if(cHP>HP) {cHP= HP;}
										System.out.println("\nVoce usou cura! | HP + 10");
										desenho(10);	
									}else {
										 System.out.println("Mana baixa: "+cMana);
										 X=5;
										 ent.nextLine();ent.nextLine();
									 }
									break;
						 
								default:
									System.out.println("Alternativa invalida!");
									break;
								}
				}while(X<1||X>2);
			
			}
			
			if(Personagem==3) {
				cMana = cMana +1;
				if(cMana>Mana) {cMana= Mana;}
			
				
				do {
					Limpar();
					desenho(4);
					desenho(10);
					System.out.println("(1) Golpe com a espada | mana:0 | Dano:"+ATK
							 		 + "\n(2) Cura | Mana: 5 | Dano: 0"
							 		 + "\nEscolha sua acao:");
									X = ent.nextInt();
							 
									switch (X) {
									case 1: 
										cHP_I = cHP_I-ATK; 
										System.out.println("\nVoce acertou "+Nome_I+" com a espada! | ATK: "+ATK+"\n");
										if(cHP_I<0) {cHP_I=0;}
										desenho(10);
										break;
							 
									case 2: 
										if(cMana>=5) {
											if(cHP>=HP) {
												System.out.println("HP ja esta cheio escolha outra opcao!");
												X = 5;
												ent.nextLine();ent.nextLine();
												break;
											}	
											cHP = cHP+10; cMana= cMana-5;
											if(cHP>HP) {cHP= HP;}
											System.out.println("\nVoce usou cura! | HP + 10\n");
											if(cHP_I<0) {cHP_I=0;}
											desenho(10);	
										}else {
											 System.out.println("Mana baixa: "+cMana);
											 X=5;
											 ent.nextLine();ent.nextLine();
										 }
										break;
							 
									default:
										System.out.println("Alternativa invalida!");
										break;
									}
				}while(X<1||X>2);
			
			}	
}
	if(Nivel >=5) {
		if(Personagem==1) {
			cMana = cMana +2;
			if(cMana>Mana) {cMana= Mana;}
			
			
			do {
				Limpar();
				desenho(4);
				desenho(10);
				System.out.println("(1) Bola de fogo | mana:0 | Dano:"+ATK
						 + "\n(2) Cura | Mana: 5 | HP: +10"
						 + "\n(3) Furia | Mana: 5 | Dano: "+ (ATK+10)
						 + "\nEscolha sua acao:");
						 X = ent.nextInt();
						 
						 switch(X) {
						 
						 case 1: 					
							 cHP_I = cHP_I-ATK; 
							 System.out.println("\nVoce acertou "+Nome_I+" com o fogo! | ATK: "+ATK+"\n");
							 if(cHP_I<0) {cHP_I=0;}
							 desenho(10);
							 break;
						 
						 case 2:
							 if(cMana>=5) {
									if(cHP>=HP) {
										System.out.println("HP ja esta cheio escolha outra opcao!");
										X = 5;
										ent.nextLine();ent.nextLine();
										break;
									}	
									cHP = cHP+10; cMana= cMana-5;
									if(cHP>HP) {cHP= HP;}
								 System.out.println("\nVoce usou cura! | HP + 10\n");
								 desenho(10);
							 }else {
								 System.out.println("Mana baixa: "+cMana);
								 X=5;
								 ent.nextLine();ent.nextLine();
							 }
							 break;
						
						 case 3:    
							 if(cMana>=5) {
								cMana = cMana -5; 
								cHP_I = cHP_I - (ATK+10);        // Inimigo perde o ataque do jogador mais 10 de vida
								System.out.println("\nVoce usou furia! | ATK: "+(ATK+10)+"\n");
								if(cHP_I<0) {cHP_I=0;}								
								desenho(10);
							 }else {							 // se o jogar nao tiver mana o suficiente tera que escolher outra.
								 System.out.println("Mana baixa: "+cMana);
								 X=5;
								 ent.nextLine();ent.nextLine();
							 }
							 break; 
						 
						 default:
							 System.out.println("Alternativa invalida!");
							 break;
						 }
			}while(X<1||X>3);
		}
			if(Personagem==2) {
				cMana = cMana +1;
				if(cMana>Mana) {cMana= Mana;}
		
				do {
					Limpar();
					desenho(4);
					desenho(10);
					System.out.println("(1) Disparo de flecha | mana:0 | Dano:"+ATK
							 + "\n(2) Cura | Mana: 5 | HP: +10"
							 + "\n(3) Furia | Mana: 5 | Dano: "+ (ATK+10)
							 + "\nEscolha uma acao:");
							 X = ent.nextInt();
							 
							 switch(X) {
							 
							 case 1: 
								 cHP_I = cHP_I-ATK; 
								 System.out.println("\nVoce acertou "+Nome_I+" com a flecha! | ATK: "+ATK+"\n");
								 if(cHP_I<0) {cHP_I=0;}
								 desenho(10);
								 break;
							 
							 case 2:
								 if(cMana>=5) {
										if(cHP>=HP) {
											System.out.println("HP ja esta cheio escolha outra opcao!");
											X = 5;
											ent.nextLine();ent.nextLine();
											break;
										}	
										cHP = cHP+10; cMana= cMana-5;
										if(cHP>HP) {cHP= HP;}
									 System.out.println("\nVoce usou cura! | HP + 10\n");
									 desenho(10);
								 }else {
									 System.out.println("Mana baixa: "+cMana);
									 X=5;
									 ent.nextLine();ent.nextLine();
								 }
								 break;
							
							 case 3:
								 if(cMana>=5) {
									cMana = cMana -5; 
									cHP_I = cHP_I - (ATK+10);
									System.out.println("\nVoce usou furia! | ATK: "+(ATK+10)+"\n");
									if(cHP_I<0) {cHP_I=0;}
									desenho(10);
								 }else {
									 System.out.println("Mana baixa: "+cMana);
									 X=5;
									 ent.nextLine();ent.nextLine();
								 }
								 break; 
							 
							 default:
								 System.out.println("Alternativa invalida!");
								 break;
							 }
							 
				}while(X<1||X>3);
			
			}
			
			if(Personagem==3) {
				cMana = cMana +1;
				if(cMana>Mana) {cMana= Mana;}
				do {
					Limpar();
					desenho(4);
					desenho(10);
					System.out.println("(1) Golpe com a espada | mana:0 | Dano:"+ATK
							 + "\n(2) Cura | Mana: 5 | HP: +10"
							 + "\n(3) Furia | Mana: 5 | Dano: "+ (ATK+10)
							 + "\nEscolha sua acao:");
							 X = ent.nextInt();ent.nextLine();
							 
							 switch(X) {
							 
							 case 1: 
								 cHP_I = cHP_I-ATK; 
								 System.out.println("\nVoce acertou "+Nome_I+" com a espada! | ATK: "+ATK+"\n");
								 if(cHP_I<0) {cHP_I=0;}
								 desenho(10);
								 break;
							 
							 case 2:
								 if(cMana>=5) {
										if(cHP>=HP) {
											System.out.println("HP ja esta cheio escolha outra opcao!");
											X = 5;
											ent.nextLine();ent.nextLine();
											break;
										}	
										cHP = cHP+10; cMana= cMana-5;
										if(cHP>HP) {cHP= HP;}
									 System.out.println("\nVoce usou cura! | HP + 10\n");
									 desenho(10);
								 }else {
									 System.out.println("Mana baixa: "+cMana);
									 X=5;
									 ent.nextLine();ent.nextLine();
								 }
								 break;
							
							 case 3:
								 if(cMana>=5) {
									cMana = cMana -5; 
									cHP_I = cHP_I - (ATK+10);
									System.out.println("\nVoce usou furia! | ATK: "+(ATK+10)+"\n");
									if(cHP_I<0) {cHP_I=0;}
									desenho(10);
								 }else {
									 System.out.println("Mana baixa: "+cMana);
									 X=5;
									 ent.nextLine();ent.nextLine();
								 }
								 break; 
							 
							 default:
								 System.out.println("Alternativa invalida!");
								 break;
							 }
							 
				
				}while(X<1||X>3);
			
			}	
}


}

// Funcao de limpar a tela.
static void Limpar() {
	for (int i = 0; i < 50; i++) {System.out.println("");} // pula 50 linhas
}
}