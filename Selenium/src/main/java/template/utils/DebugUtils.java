package template.utils;

import org.apache.commons.collections4.SetUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DebugUtils {

    public void showDifferentRecordFromSKAndCRM(Set<List<String>> sk, Set<List<String>> crm){
        Set<List<String>> actualDiff = SetUtils.disjunction(crm, sk);
        actualDiff.forEach(System.out::println);
        System.out.println("\n");
    }

    public List<List<String>> showDifferentRecordsFromSK(Set<List<String>> sk, Set<List<String>> crm) {
        List<List<String>> getDifference = sk.stream()
                .filter(a -> !crm.contains(a)).collect(Collectors.toList());
        System.out.print("Rekordy które różnią się:" + "\n");
        getDifference.forEach(System.out::println); // drukuje każdy wiersz kolekcji w osobnej linii
        System.out.println("ilość rekordów SK: " + getDifference.size()+"\n");
        return  getDifference;
    }

    public List<List<String>> showDifferentRecordsFromCRM(Set<List<String>> sk, Set<List<String>> crm) {
        List<List<String>> getDifference = crm.stream()
                .filter(a -> ! sk.contains(a)).collect(Collectors.toList());
        System.out.print("Rekordy które różnią się w CRM:" + "\n");
        getDifference.forEach(System.out::println);
        System.out.println("ilość rekordów CRM: " + getDifference.size()+"\n");
        return getDifference;
    }

    public void showDifferentCellFromCRM(Set<List<String>> sk, Set<List<String>> crm) { // zwraca niepasujące rekordy
        List<String> set1 = showDifferentRecordsFromSK(sk, crm).stream()
                .flatMap(List ::stream).map(aObject -> (aObject.equals("") ? "brak danych" : aObject)).collect(Collectors.toList());
        List<String> set2 = showDifferentRecordsFromCRM(sk, crm).stream()
                .flatMap(List ::stream).map(aObject -> (aObject.equals("") ? "brak danych" : aObject)).collect(Collectors.toList());  // w przypadku kiedy komórki zawierają puste wartości
        List<String> difference = new ArrayList<>(set2);
        set1.forEach(difference::remove);
        System.out.println("Wartości które występują w CRM nie występują w:"+"\n");
        difference.forEach(System.out::println);
        System.out.println();
    }

    public void showDifferentCellFromSK(Set<List<String>> sk, Set<List<String>> crm) {
        List<String> set1 = crm.stream()
                .flatMap(List ::stream).map(aObject -> (aObject.equals("") ? "brak danych" : aObject)).collect(Collectors.toList());
        List<String> set2 = sk.stream()
                .flatMap(List :: stream).map(aObject -> (aObject.equals("") ? "brak danych" : aObject)).collect(Collectors.toList());
        List<String> difference = new ArrayList<>(set2);
        set1.forEach(difference::remove);
        System.out.println("Wartości które występują w  nie występują w CRM:"+"\n");
        difference.forEach(System.out::println);
        System.out.println();

    }

    public void sortedOutput(Set<List<String>> sk, Set<List<String>> crm) {
        showDifferentCellFromSK(sk, crm);
        showDifferentCellFromCRM(sk, crm);
        System.out.println("Ilość wierszy w SK: " + sk.size());
        System.out.println("Ilość wierszy w CRM: " + crm.size());
        assert false;
    }

}
