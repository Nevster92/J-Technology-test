import java.util.ArrayList;

public class SecoundTask {

    public void resolveList(int[] array, int n){
        ArrayList<Integer> duplicated = new ArrayList<Integer>();
        ArrayList<Integer> firstPresence = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {

            // vizsgáljuk hogy már volt e duplikálva
            boolean isDuplicated = false;
            for (int j = 0; j < duplicated.size(); j++) {
                // ha megtaláljuk a duplikáltak között akkor azt jelezzük és kilépünk
                if(array[i] == duplicated.get(j)){
                    isDuplicated = true;
                    break;
                }

            }

            // ha nem volt duplicative akkor megnézzük hogy volt e már legalább 1-szer
            if(!isDuplicated){
                boolean isFirstPresence = true;
                for (int k = 0; k < firstPresence.size(); k++) {
                    // ha volt már legalább 1-szer akkor jelezzük és kilépünk
                    if(array[i] == firstPresence.get(k)){
                       isFirstPresence = false;
                        break;
                    }
                }
                // ha most látjuk elöször, rögzítjük
                if(isFirstPresence){
                    firstPresence.add(array[i]);
                }else{ // ha most látjuk másodszor, rögzítjük és kiírjuk
                    duplicated.add(array[i]);
                    System.out.println(array[i]);
                }
            }
            // hogy spóroljunk a memóriával, ha már láttuk az összes számot duplikálva, kilépünk.
            if(duplicated.size() == n){
                break;
            }
            }



    }

}
