package mls.property.structure.neighbourhoodfeatures;

/**
 * Implementation of interface, implements link features.
 * Also has separate phone number feature.
 */
public class School implements NeighbourhoodFeatures {
    private String link;
    private String phoneNumber;

    public School(){
        this.link = "";
        this.phoneNumber = "";
    }
    public School(String link, String phoneNumber){
        this.link = link;
        this.phoneNumber = phoneNumber;
    }
    public School(School other) {
        this.link = other.link;
        this.phoneNumber = other.phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLink(String link){
        this.link = link;
    }

    public String getLink(){
        return this.link;
    }

    public NeighbourhoodFeatures makeCopy(){
        return new School(this);
    }

    /**
     * compares attributes of other School classes
     * @param other
     * @return true if equal, false if not
     */
    @Override
    public boolean equals(Object other){
        if(other == null || other.getClass() != School.class){
            return false;
        }
        return (this.getLink().equals(((School) other).getLink()) &&
                this.getPhoneNumber().equals(((School) other).getPhoneNumber()));
    }
}
