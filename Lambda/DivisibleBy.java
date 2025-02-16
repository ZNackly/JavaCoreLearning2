package Lambda;

// @FunctionalInterface
// public interface Interface3 {

//     boolean Method(int x);

// }
@FunctionalInterface
interface DivisibleBy {
    boolean isDivisible(int number);
}