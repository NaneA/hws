package week4.Enums;

public enum Months {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December;

    public static Months getByInd(int ind){
     //  List<Months> blah = Arrays.asList(Months.values());
//       return blah.get(ind);
        return  Months.values()[ind-1];
    }
}
