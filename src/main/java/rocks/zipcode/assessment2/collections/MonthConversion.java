package rocks.zipcode.assessment2.collections;

import java.util.Set;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    TreeMap<Integer, String> months;

    public MonthConversion(TreeMap<Integer, String> months) {
        this.months = months;
    }

    public MonthConversion() {
        months = new TreeMap<>();
    }

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        months.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        try {
            return months.get(monthNumber);
        }
        catch (Exception e) {
            throw new NullPointerException();
        }
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Set<Integer> keys = months.keySet();
        Integer result = null;
        for (Integer key : keys){
            if(monthName.equals(months.get(key))){
                result = key;
                break;
            }
        }
        return result;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        Boolean result = false;
        Set<Integer> keys = months.keySet();
        for (Integer key : keys){
            if(monthNumber.equals(key)){
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        Boolean result = false;
        Set<Integer> keys = months.keySet();
        for (Integer key : keys){
            if(monthName.equals(months.get(key))){
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return months.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        months.put(monthNumber,monthName);
    }
}
