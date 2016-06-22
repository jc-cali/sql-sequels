package org.jcapps.sequels;

/**
 * Created by JC on 6/22/16.
 */
public class Sequel {

    public int id;
    public String name;

    public Sequel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
