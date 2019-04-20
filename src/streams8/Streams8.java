/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams8;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author tommib
 *
 */
public class Streams8 {

    /**
     * @param args the command line arguments
     *
     *  * Kertaa: 1. Lambda
     * ->https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm 2.
     * Method reference ->
     * https://www.tutorialspoint.com/java8/java8_method_references.htm 3.
     * Optional -> https://stackify.com/optional-java/
     *
     * Viimeisenä: 4. Stream -> https://stackify.com/streams-guide-java-8/
     *
     */
    public static void main(String[] args) {
        // LAMBDA (parametrit) -> koodi;
        System.out.println("-> Lambda & functional interface tavaraa:");
        MatemaattisetOperaatiot kertoLasku = (a, b) -> a * b;
        MatemaattisetOperaatiot jakoLasku = (a, b) -> a / b;
        MatemaattisetOperaatiot plusLasku = (a, b) -> a + b;
        MatemaattisetOperaatiot miinusLasku = (a, b) -> a - b;
        System.out.println(kertoLasku.laske(3, 3));
        System.out.println(jakoLasku.laske(3, 3));
        System.out.println(plusLasku.laske(3, 3));
        System.out.println(miinusLasku.laske(3, 3));

        System.out.println("\n");
        System.out.println("-> Stream tavaraa");

        // Täytetään Array
        Lentokone[] lentokoneet = {
            new Lentokone(),
            new Lentokone(),
            new Lentokone()};
        // Täytetään ArrayList
        ArrayList<Lentokone> lentokoneet2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lentokoneet2.add(new Lentokone());
        }

        // Tehdään virta Arraysta.
        Stream.of(lentokoneet).forEach(s -> s.setIstumaPaikkoja(33));
        Stream.of(lentokoneet).forEach(s -> System.out.println(s));
        // Tehdään virta tietyistä Arrayn olioista.
        System.out.println(Stream.of(lentokoneet[0], lentokoneet[2]).count());

        // Tehdään virta ArrayListista
        System.out.println(lentokoneet2.stream().count());
        // Tehdään virta tietyistä ArrayListin objekteista
        System.out.println(Stream.of(lentokoneet2.get(0), lentokoneet2.get(2), lentokoneet2.get(5), lentokoneet[0]).count());

        Stream.Builder<Lentokone> lentokoneStreamBuilderi = Stream.builder();
        lentokoneStreamBuilderi.accept(lentokoneet[0]);
        lentokoneStreamBuilderi.accept(lentokoneet[2]);
        lentokoneStreamBuilderi.accept(lentokoneet2.get(4));
        lentokoneStreamBuilderi.accept(lentokoneet2.get(7));
        Stream<Lentokone> lentokoneStream = lentokoneStreamBuilderi.build();
        System.out.println("Stream.Builder: " + lentokoneStream.count());
        
    }   

}
