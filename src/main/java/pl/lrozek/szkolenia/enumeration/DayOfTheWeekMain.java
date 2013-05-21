package pl.lrozek.szkolenia.enumeration;

import static pl.lrozek.szkolenia.enumeration.DayOfTheWeek.FRIDAY;
import static pl.lrozek.szkolenia.enumeration.DayOfTheWeek.MONDAY;
import static pl.lrozek.szkolenia.enumeration.DayOfTheWeek.SATURDAY;

import java.util.Set;
import java.util.TreeSet;

public class DayOfTheWeekMain {

    public static void main( String[] args ) {
        iterateOverAllPosibleValues();
        comparable();
    }

    private static void comparable() {
        Set<DayOfTheWeek> dayOfTheWeeks = new TreeSet<>();
        dayOfTheWeeks.add( FRIDAY );
        dayOfTheWeeks.add( MONDAY );
        dayOfTheWeeks.add( SATURDAY );
        for ( DayOfTheWeek dayOfTheWeek : dayOfTheWeeks ) {
            System.out.println( dayOfTheWeek.display() );
        }
    }

    private static void iterateOverAllPosibleValues() {
        for ( DayOfTheWeek dayOfTheWeek : DayOfTheWeek.values() ) {
            System.out.println( dayOfTheWeek.ordinal() + ": " + dayOfTheWeek.name() );
        }
    }

}
