package org.sofia;

import org.sofia.dto.FocusedElement;
import org.sofia.dto.FormatType;
import org.sofia.dto.SimpleCalender;

/**
 * Simple Calender
 *
 * @author Sofia Martinez
 */

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        SimpleCalender simpleCalender1 = new SimpleCalender();

        System.out.println(simpleCalender1);
        simpleCalender1.decreasedElement(FocusedElement.DAY);
        System.out.println(simpleCalender1);
        simpleCalender1.increasedElement(FocusedElement.YEAR);
        System.out.println(simpleCalender1);
        simpleCalender1.decreasedElement(FocusedElement.MONTH);
        simpleCalender1.changeFormatType(FormatType.DAY_MONTH_YEAR);
        System.out.println(simpleCalender1);
    }
}
