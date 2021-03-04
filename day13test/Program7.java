package day13test;

public class Program7 {

}
interface Hungry<E>
{
	void munch(E x); 
} 
interface Carnivore<E extends Animal> extends Hungry<E> {} 
interface Herbivore<E extends Animal> extends Hungry<E> {} 
abstract class Plant {} 
class Grass extends Plant {} 
abstract class Animal {} 
class Sheep extends Animal implements Herbivore<Sheep> { 
public void munch(Sheep x) {} 
}
class Wolf extends Animal implements Herbivore<Sheep> { 
public void munch(Sheep x) {} 
}

/*----------
Change the Herbivore interface to interface Herbivore<E extends Animal> extends Hungry<E> {} 
*/