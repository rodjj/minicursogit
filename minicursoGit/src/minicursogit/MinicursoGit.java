package minicursogit;

import java.util.ArrayList;
import java.util.Scanner;

public class MinicursoGit {

    public static void main(String[] args) {
        ArrayList <Faculdade> listaDeFaculdade = new ArrayList();
        int opc = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        while(opc != 4)
        {
            System.out.println("------- Menu -------");
            System.out.println(" 1 - Inserir faculdade");
            System.out.println(" 2 - Mostrar faculdade");
            System.out.println(" 3 - Remover faculdade");
            System.out.println(" 4 - Sair");
            System.out.println(" -------------------- ");
            opc = entrada.nextInt();
            
            switch(opc)
            {
                case 1:
                    Faculdade faculdade = new Faculdade();
                    System.out.println("------- Inserir Faculdade -------");
                    System.out.println("Registro...: ");
                    faculdade.registro = entrada.next();
                    System.out.println("Nome.......: ");
                    faculdade.registro = entrada.next();
                    System.out.println("Quantidade de sala...: ");
                    faculdade.numeroSala = entrada.nextInt();
                    System.out.println("Quantidade de professor...: ");
                    faculdade.numeroProfessor = entrada.nextInt();
                    listaDeFaculdade.add(faculdade);
                    break;
                case 2:
                    if(!listaDeFaculdade.isEmpty())
                    {
                        for(int i=0; i<listaDeFaculdade.size();i++)
                        {
                            Faculdade mostrar = listaDeFaculdade.get(i);
                            System.out.println("["+i+"]-----------------");
                            System.out.println("Registro.........: " +mostrar.registro);
                            System.out.println("Nome.............: " +mostrar.nome);
                            System.out.println("Numero de sala...: " +mostrar.numeroSala);
                            System.out.println("Numero de prof...: " +mostrar.numeroProfessor);
                        }
                    }
                    break;
                case 3:
                    if(!listaDeFaculdade.isEmpty())
                    {
                        String buscaRegistro;
                        int posBuscada = -1;
                        System.out.println("Qaul faculdade deseja buscar, informe seu registro..:");
                        buscaRegistro = entrada.next();
                        for(int i =0; i< listaDeFaculdade.size();i++)
                        {
                            if(buscaRegistro.equals(listaDeFaculdade.get(i).registro))
                            {
                                posBuscada = i;
                            }
                        }
                        if(posBuscada != -1)
                            {
                                listaDeFaculdade.remove(posBuscada);
                            }
                    }
                    break;
            }
           
        }
    }
    
}
