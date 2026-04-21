package workshop_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) {
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println("Consumer: "+ s);
			}
		};
		c.accept("Hello");

		Consumer<String> c2 = s -> {System.out.println("lmabda Consumer: "+ s);};
		c2.accept("Hello");
		
		BiConsumer<String, Integer> bc = new BiConsumer<String,Integer>(){

			@Override
			public void accept(String t, Integer u) {
				System.out.println("BiConsumer: "+ t +'\t'+ u);
			}
		};
		bc.accept("bye", 20);
		
		BiConsumer<String, Integer> lbc = (t,u)->System.out.println("Lambda BiConsumer: "+ t +'\t'+ u);
		lbc.accept("Hi", 45);
		
		DoubleSupplier s4= ()->3.4D;
		double d2 = s4.getAsDouble();
		System.out.println(d2);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("탁원준");
		list.add("탁원준1");
		list.add("탁원준1");
		list.add("탁원준");
		list.add("탁원준2");
		list.add("탁원준3");
//		Stream<String> stream = list.stream();
//		stream.forEach(System.out::println);
		list.stream().distinct().forEach(System.out::println);
		list.stream().forEach(c2);
		

	}
}

