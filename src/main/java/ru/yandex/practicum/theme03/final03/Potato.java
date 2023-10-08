package ru.yandex.practicum.theme03.final03;

import java.util.Objects;

public class Potato implements Comparable<Potato> {

    public final int id;

    /**
     * Масса
     */
    public final int weight;

    /**
     * Длина
     */
    public final int length;

    /**
     * Ширина
     */
    public final int girth;

    public Potato(int id, int weight, int length, int girth) {
        this.id = id;
        this.weight = weight;
        this.length = length;
        this.girth = girth;
    }

    @Override
    public int compareTo(Potato o) {
        // Сравните картофелины по альфа характеристике
        /*double thisAlfa = this.weight * 0.5 + this.length * 0.65 + this.girth * 0.8;
        double oAlfa = o.weight * 0.5 + o.length * 0.65 + o.girth * 0.8;*/

        return Integer.compare(calculateAlpha(this), calculateAlpha(o));
    }

    private int calculateAlpha(Potato o) {
        return (int) (o.weight * 0.5 + o.length * 0.65 + o.girth * 0.80);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Potato potato = (Potato) o;
        return id == potato.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Potato{" +
                "id=" + id +
                ", weight=" + weight +
                ", length=" + length +
                ", girth=" + girth +
                '}';
    }
}
