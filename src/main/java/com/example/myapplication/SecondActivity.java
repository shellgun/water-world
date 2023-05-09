package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;


public class SecondActivity extends AppCompatActivity {

    List<animal> animalList =new ArrayList<animal>();


    private ImageButton rakButton;
    private ImageButton meduseButton;
    private ImageButton starButton;
    private ImageButton kitButton;
    private View.OnClickListener Listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         setInitialData();
        RecyclerView recyclerView=findViewById(R.id.list_animal);
        animalAdapter adapter = new animalAdapter(this,animalList);

        recyclerView.setAdapter(adapter);

    }

    public void setInitialData() {
        animal.add(new animal("Членистоногие ", R.drawable.rak, "Членистоно́гие или артропо́ды (лат. Arthropoda, от др.-греч. ἄρθρον — «сустав» и πούς, род. п. ποδός — «нога»), — тип первичноротых животных, включающий насекомых, ракообразных, паукообразных, мечехвостов и многоножек. По количеству видов и распространённости может считаться самой процветающей группой живых организмов."));
        animal.add(new animal("Медузы", R.drawable.meduse, "Меду́за, или медузоидное поколе́ние (греч. μέδουσα), — фаза жизненного цикла стрекающих из подтипа Medusozoa: гидроидных (Hydrozoa), сцифоидных (Scyphozoa) и кубомедуз (Cubozoa). Тело медуз в значительной части состоит из обводнённой соединительной ткани — мезоглеи — и по форме напоминает колокол или зонтик[1]. Такое строение обеспечивает способность к реактивному движению путём сокращения мышц стенки колокола[1]. "));
         animal.add((new animal("Иглокожие",R.drawable.star,"Иглоко́жие (лат. Echinodermata) — тип исключительно морских донных животных, большей частью свободноживущих, реже сидячих, встречающихся на любых глубинах Мирового океана. Насчитывается около 7000 современных видов (в России — 400)[1]. ")));
         animal.add(new animal("Хордовые",R.drawable.kit,"Хо́рдовые (лат. Chordata) — тип вторичноротых животных, для которых характерно наличие энтодермального осевого скелета в виде хорды, которая у высших форм заменяется позвоночником. По степени развития нервной системы тип хордовых занимает высшее место среди всех животных. В мире известно более 60 000 видов хордовых."));

    }

}







