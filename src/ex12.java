import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class ex12 {

    public static void main(String[] args) {

        System.out.println(palavraAleatoria("carro"));
    }

    static String palavraAleatoria(String palavra) {
        Random random = new Random();
        List<Character> collect = palavra.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> newList = new ArrayList<>();
        while (collect.size() > 0) {
            Character character = collect.remove(random.nextInt(collect.size()));
            newList.add(character);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : newList) {
            sb.append(c);
        }
        return sb.toString();
    }
    }

