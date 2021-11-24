package com.javacert.innerClasses.challenge;

import com.javacert.linkedList.challenge.Album;
import com.javacert.linkedList.challenge.Song;

import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<Album>();
    public static void main(String[] args){
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Hold on", 4.22);
        album.addSong("Lady love", 4.3);
        album.addSong("The gypsy", 5.6);
        album.addSong("High Ball Shooter", 3.21);
        album.addSong("Money", 6.23);
        album.addSong("Dreams", 5.11);
        album.addSong("Johnny Depp", 4.72);
        album.addSong("Plastic", 3.6);
        albums.add(album);

        Album albums2 = new Album("forLoops those about to rock", "AC/DC");
        albums2.addSong("forLoops those about to rock", 5.44);
        albums2.addSong("I put the finger on you", 3.4);
        albums2.addSong("C.O.D.", 2.59);
        albums2.addSong("Snowballed", 4.47);
        albums2.addSong("Breaking the rules", 3.23);
        albums2.addSong("Evil walks", 3.1);
        albums2.addSong("Lets go", 5.24);
        albums.add(albums2);

        List<Song> playList = new ArrayList<Song>();
        albums.get(0).addToPlaylist("Hold on", playList);
        albums.get(0).addToPlaylist("Lady love", playList);
        albums.get(0).addToPlaylist("Money Longer", playList); // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(7, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList); //There is no track 24

        play(playList);


    }
    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit= true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }
                        else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - delete current song.");
    }

    private static void printList(List<Song> playList){
        //Since we're not going backwards and forwards, we don't need a list iterator
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==================================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==================================");
    }



}

