package enumy;

public enum SampleEnum {
    PN(1), WT(2), ŚR(3), CZW (4);

private int dayOfWeek;
SampleEnum ( int dayOfWeek){
    this.dayOfWeek= dayOfWeek;
}

public int getDayOfWeek(){
    return dayOfWeek;
}
}
