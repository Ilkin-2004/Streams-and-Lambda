package stream;

import lambda.MyConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {
        List<String >words =Arrays.asList("ilkin","samir","asjkj");
        List<List<String>> ls= Arrays.asList(
       Arrays.asList ("ILkin","Kenan","Arif"),
       Arrays.asList ("ILkin","Kenan","Arif"),
       Arrays.asList  ("ILkin","Kenan","Arif"));

//        MyConsumer Co=new MyConsumer();
//        for(String s:words){
//            Co.accept(s);
//            }
  //    arxada üsdəki edilir
        words.forEach((s) ->System.out.println(s));
        words.forEach((s) ->{
            System.out.println("arxada anonim comsumer yaradaraaq isliyir");
          System.out.println(s);
          System.out.println("words listindeki melumatlari s-e ataraq cap edilir");
                });

        words.forEach(System.out::println);

       find(words,"Kenan").ifPresent(System.out::println);
      // ve ya
           words.stream()
               .filter((word)->word
               .equalsIgnoreCase("ilkin"))
               .findFirst().ifPresent((s)->System.out.println(s));
           //sozleri boyukle yazmaq
           List<String >upperwords=words.stream().map(String::toUpperCase).collect(Collectors.toList());
      List<List<Integer>> l=  ls.stream().map(list->list.stream().map(String::length))
              .map(stream->stream.collect(Collectors.toList()))
              .collect(Collectors.toList());
      System.out.println("mapdan isdifade"+l);
List<Integer> ll=ls.stream().flatMap(list->list.stream().map(String::length)).collect(Collectors.toList());
        System.out.println("flapmapdan isdifade"+ll);

    }

public static Optional<String> find(List<String> words, String s){
for(String word :words){
   if(word.equalsIgnoreCase(s)) return Optional.of(word);
}
return Optional.empty();
//ve ya      words.stream().filter((word)->word.equalsIgnoreCase("ilkin")).findFirst()
}
}