package com.eduardoweb.musicasdesafio.principal;
import com.eduardoweb.musicasdesafio.modelos.Musica;
import com.eduardoweb.musicasdesafio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        //músicas
        Musica musica1 = new Musica();
        musica1.setTitulo("Infinita Highway");

        Musica musica2 = new Musica();
        musica2.setTitulo("O mundo dá voltas");

        Musica musica3 = new Musica();
        musica3.setTitulo("Talvez");

        Musica musica4 = new Musica();
        musica4.setTitulo("Otherside");

        Musica artista1 = new Musica();
        artista1.setArtista("CPM22");

        Musica artista2 = new Musica();
        artista2.setArtista("Red Hot Chilli Peppers");

        String titulo_musica2 = musica2.getTitulo();
        String descricao_artista1 = artista1.getArtista();

        String titulo_musica4 = musica4.getTitulo();
        String descricao_artista2 = artista2.getArtista();

        System.out.println(titulo_musica2+" - "+descricao_artista1);

        System.out.println(titulo_musica4+" - "+descricao_artista2);

        musica2.curte();
        musica2.curte();
        musica2.curte();
        int curtidas = musica2.getQuantCurtidas();
        System.out.println(titulo_musica4+" ganhou "+curtidas+" curtidas");

        musica1.curte();
        musica1.curte();
        curtidas = musica1.getQuantCurtidas();
        System.out.println(titulo_musica2+" ganhou "+curtidas+" curtidas");

        //podcasts
        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Aprenda inglês");
        String titulo_podcast1 = podcast1.getTitulo();

        System.out.println("\nPodcast: "+titulo_podcast1);
    }
}
