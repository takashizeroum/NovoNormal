package com.example.novonormal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    /*listas de layouts e descrições dos mesmos

    int[] layouts = {R.layout.individual, R.layout.grupo, R.layout.casa, R.layout.trabalho, R.layout.publico, R.layout.particular};

     */




    String[] casa = {"Utilize produtos usuais para a limpeza doméstica, dando preferência para o uso da água sanitária (em uma solução de uma parte de água sanitária para 9 partes de água) para desinfetar superfícies (veja aqui como limpar)",
            "Utilize detergentes próprios para a higienização das louças e roupas. É importante separar roupas e roupas de cama de pessoas infectadas para que seja feita a higienização à parte. Caso não haja a possibilidade de fazer a lavagem dessas roupas imediatamente, a recomendação é que elas sejam armazenadas em sacos de lixo plástico até que seja possível lavar;",
            "Também é importante comprar antecipadamente e ter em suas residências medicamentos para dor e redução da febre (como paracetamol), controle da tosse (como xaropes e pastilhas), além de medicamentos de uso contínuo. Mas não compre de forma exagerada para que todos tenham acesso às formas de alívio dos sintomas."};

    String[] grupo = {"Mantenha distância mínima de 1 (um) metro entre pessoas em lugares públicos e de convívio social. Evite abraços, beijos e apertos de mãos. Adote um comportamento amigável sem contato físico, mas sempre com um sorriso no rosto. Não compartilhe objetos de uso pessoal como talheres, toalhas, pratos e copos.",
            "Recomenda-se a utilização de máscaras em todos os ambientes. As máscaras de tecido (caseiras/artesanais), não são Equipamentos de Proteção Individual (EPI), mas podem funcionar como uma barreira física, em especial contra a saída de gotículas potencialmente contaminadas.",
            "Ao tossir ou espirrar, cubra nariz e boca com lenço ou com a parte interna do cotovelo ou procure espirrar em direção ao solo caso as outras medidas não forem possiveis."};
    String[] individual = {"Adote medidas básicas de higiene, como lavar bem as mãos (dedos, unhas, punho, palma e dorso) com água e sabão e, de preferência, utilizar toalhas de papel para secá-las. Além do sabão, outro produto indicado para higienizar as mãos é o álcool gel, que também serve para limpar objetos como celulares e itens pessoais diversos.",
            "Use lenço descartável para sua higiene nasal. Deve-se cobrir o nariz e a boca com um lenço de papel quando espirrar ou tossir e jogá-lo no lixo;\n" +
                    "Caso não tenha lenço de papel disponível ao tossir e espirrar, use o braço dobrado (e não as mãos) para cobrir o nariz e a boca.\n" +
                    "Evite tocar olhos, nariz e boca sem que as mãos estejam limpas"};
    String[] trabalho = {"É preciso limpar as superfícies das mesas e estações de trabalho com desinfetante regularmente porque a contaminação de superfícies é uma das principais formas de disseminação do coronavírus e outras infecções.\n" +
            "Para a OMS, as empresas devem incentivar os funcionários a ficarem em casa, caso eles apresentem tosse ou febre leve (37.3º ou mais). Se eles tiverem que tomar medicamentos como paracetamol, ibuprofeno ou aspirina, que podem mascarar a infecção, também devem permanecer em casa. É uma medida importante para evitar a contaminação dos outros funcionários.",
            "Coloque dispensadores de álcool em gel ou desinfetante para as mãos no local de trabalho e certifique-se que eles estejam abastecidos. Além disso, coloque folhetos informativos com as instruções para a lavagem correta das mãos, principalmente nos banheiros. As empresas podem ainda realizar palestras com agentes de saúde e segurança ocupacional para seus funcionários sobre o coronavírus. A correta lavagem das mãos com água e sabão é uma medida importante para impedir a infecção pelo vírus."};
    String[] publico = {"Não levar as mãos ao rosto até que tenha a oportunidade de higienizá-las após sair do transporte público reduz o risco de contrair o novo coronavírus. Sempre que tossir ou espirrar, cubra a boca e o nariz com o antebraço, nunca com as mãos",
            "Utilizar álcool gel antes de subir e após descer do veículo, pois o vírus pode ser transmitido por objetos e superfícies\n" +
                    "Não leve as mãos ao rosto (olhos, boca e nariz) enquanto não tiver a oportunidade de higienizá-las, principalmente dentro do transporte. Utilize máscaras de tecido.Abra janelas, caso o transporte possua. Ambientes fechados são mais propícios à transmissão;\n" +
                    "Se possível, mantenha 1 metro de distância das outras pessoas.Limpe objetos pessoais que tocar durante o trajeto com álcool em gel (por exemplo, o celular)."};
    String[] particular = {"Utilizar álcool gel antes de subir e após descer do veículo, pois o vírus pode ser transmitido por objetos e superfícies.Utilize máscaras de tecido mesmo dentro do veículo.",
            "No transporte particular , as empresas reforçam a higienização diária dos veículos, porém se possivel deve ser verificado a situação higiênica do veículo, e caso for o  com maior frequência durante o dia, além de manter as janelas abertas sempre que possível.Em trasnporte contratados atavés de aplicativos , além da higienização reforçada, as empresas redobram a atenção quanto à disponibilidade de álcool em gel em locais de atendimento e durante o embarque, mas deve sempre levar consigo seu ácool em gel."};


    /*declaração de itens do menu

    CardView icTrabalho = findViewById(R.id.menCasa);
    CardView icIndividual = findViewById(R.id.menCasa);
    CardView icGrupo = findViewById(R.id.menCasa);
    CardView icParticular = findViewById(R.id.menCasa);
    CardView icPublico = findViewById(R.id.menCasa);
CardView icCasa = findViewById(R.id.menCasa);
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void irMenu(View view) {
        Intent voltarMenu = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(voltarMenu);
    }


    public class ListCont extends BaseAdapter {


        @Override
        public int getCount() {

            return casa.length;

        }


        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            TextView descricao;

            View visual = getLayoutInflater().inflate(R.layout.activity_recebe_layouts, null);

            descricao = visual.findViewById(R.id.recLista);

/*
        switch (icMen) {
            case "casa":
                descricao.setText(casa[i]);
                break;
            case "trabalho":
                descricao.setText(trabalho[i]);
                break;
            case "individual":
                descricao.setText(individual[i]);
                break;
            case "grupo":
                descricao.setText(grupo[i]);
                break;
            case "publico":
                descricao.setText(publico[i]);
                break;
            case "privado":
                descricao.setText(particular[i]);
                break;

        }
*/
            descricao.setText(casa[i]);


            return visual;
        }
    }


}

