package ua.napadovskiu;

/**
 *
 */
public class ManWithWeight {

    /**
     *
     */
    private String name;


    /**
     *
     */
    private int weight;


    /**
     *
     * @param name
     * @param weight
     */
    public ManWithWeight(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int getWeight() {
        return weight;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        final int var = 17;
        int result = var;
        result = prime * result + getName().hashCode();
        result = prime * result + getWeight();
        return result;


    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ManWithWeight manWithWeight = (ManWithWeight) obj;

        if (!getName().equals(manWithWeight.getName())) {
            return false;
        }
        return getWeight() == (manWithWeight.getWeight());

    }

}
