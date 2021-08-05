import java.util.*;

public class Demo {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = Arrays.asList("♥", "♠", "♣", "♦");
        List<String> numbes = Arrays.asList("2","A","K","Q","J","10","9","8","7","6","5","4","3");
      //组装排
        int index = 0;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        for (String numbe : numbes) {
            for (String color : colors) {
                poker.put(index,color+numbe);
                pokerIndex.add(index);
                index++;
            }
        }

        //洗牌
        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);
        //发牌
        ArrayList<Integer> dipan = new ArrayList<>();
        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        for (int i = 0;i< pokerIndex.size();i++) {
            Integer in = pokerIndex.get(i);
            if (i >= 51){
               dipan.add(in);
            }else if (i%3 == 0){
                play1.add(in);
            }else if (i%3 == 1){
                play2.add(in);
            }else if (i%3 == 2){
                play3.add(in);
            }
        }
        //排序
        Collections.sort(play1);
        Collections.sort(play2);
        Collections.sort(play3);
        Collections.sort(dipan);
        System.out.println(play1);
        look("张学友",play1,poker);
        look("周瑞华",play2,poker);
        look("周星驰",play3,poker);
        look("底牌",dipan,poker);

    }
    //看牌
    public static void look(String name,ArrayList<Integer> list,HashMap<Integer,String>poker){
        System.out.print(name+": ");
        for (Integer key: list) {
            System.out.print(poker.get(key)+" ");
        }
        System.out.println();
    }
}
