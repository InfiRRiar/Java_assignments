package ru.mirea.lab4;

public enum Season {
    WINTER(-13),
    SPRING(12),
    SUMMER(22)
            {
                @Override
                public String getDescription()
                {
                    return "Тёплое время года";
                }
            },
    FALL(14);

    private final int avg_temperature;
    private Season(int avg_temperature)
    {
        this.avg_temperature = avg_temperature;
    }

    public int getAvg_temperature() {
        return avg_temperature;
    }

    public String getDescription()
    {
        return "Холодное время года";
    }
}
