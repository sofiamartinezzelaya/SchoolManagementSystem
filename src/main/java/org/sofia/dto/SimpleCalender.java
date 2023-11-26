package org.sofia.dto;

/**
 * Simple Calender
 *
 * @author Sofia Martinez
 */
public class SimpleCalender {
    private int year;
    private int month;
    private int day;
    FormatType formatType;
    FocusedElement focusedElement;

    public SimpleCalender() {
        year = 2023;
        month = 1;
        day = 1;
        formatType = FormatType.YEAR_MONTH_DAY;
        focusedElement = FocusedElement.YEAR;
    }

    /**
     * returns the number of days depending on the month
     * @return an int of the number of days
     */
    public int calcNumOfDay() {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> (year % 4 == 0) ? 29 : 28;
        };
    }

    /**
     * increases the focused element being called
     * @param focusedElement is the enum of YEAR, MONTH or DAY
     */
    public void increasedElement(FocusedElement focusedElement) {
        switch (focusedElement) {
            case YEAR -> year++;
            case MONTH -> month = (month == 12) ? 1 : month + 1;
            case DAY -> day = (day == this.calcNumOfDay()) ? 1 : day + 1;
        }
    }

    /**
     * decreases the focused element being called
     * @param focusedElement is the enum of YEAR, MONTH or DAY
     */
    public void decreasedElement(FocusedElement focusedElement) {
        switch (focusedElement) {
            case YEAR -> year--;
            case MONTH -> month = (month == 1) ? 12 : month - 1;
            case DAY -> day = (day == 1) ? this.calcNumOfDay() : day - 1;
        };
    }

    /**
     * takes the focused element and changes it to a different focused element from the enum Focused Element
     * @param focusedElement enum of YEAR, MONTH, or DAY
     * @return a different focused element
     */
    public FocusedElement changeFocusedElement(FocusedElement focusedElement) {
        return switch (focusedElement) {
            case YEAR -> FocusedElement.MONTH;
            case MONTH -> FocusedElement.DAY;
            case DAY -> FocusedElement.YEAR;
        };
    }

    /**
     * takes a formot type and changes it to a different format type from the enum FormatType
     * @param formatType enum of YEAR_MONTH_DAY, MONTH_DAY_YEAR, or DAY_MONTH_YEAR
     * @return a different format type
     */
    public FormatType changeFormatType(FormatType formatType) {
        return switch (formatType) {
            case YEAR_MONTH_DAY -> FormatType.MONTH_DAY_YEAR;
            case MONTH_DAY_YEAR -> FormatType.DAY_MONTH_YEAR;
            case DAY_MONTH_YEAR -> FormatType.YEAR_MONTH_DAY;
        };
    }

    @Override
    public String toString() {
        if(formatType == FormatType.YEAR_MONTH_DAY) {
            return String.format(year + "/" + month + "/" + day);
        }
        else if (formatType == FormatType.MONTH_DAY_YEAR) {
            return String.format(month + "/" + day + "/" + year);
        }
        else {
            return String.format(day + "/" + year + "/" + month);
        }
    }
}
