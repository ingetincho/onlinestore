package com.solvd.onlinestore.binary;

import java.sql.Date;

public class Customer extends AbstractEntity{
    private int idStore;
    private String name;
    private String lastname;
    private String email;
    private int idAddress;
    private boolean active;
    private Date createdate;
    private Date lastupdate;
    private int StoreIdStore;
    private int addressIdAddress;
    private int idZone;
    
    //Empty constructor
    public Customer() {
    }

    //Just Id - to delete for id 
    public Customer(long id) {
        super(id);
    }

    public Customer(String name, String lastname, String email, int idAddress, boolean active, Date createdate,
            Date lastupdate, int storeIdStore, int addressIdAddress, int idZone) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.idAddress = idAddress;
        this.active = active;
        this.createdate = createdate;
        this.lastupdate = lastupdate;
        StoreIdStore = storeIdStore;
        this.addressIdAddress = addressIdAddress;
        this.idZone = idZone;
    }

    //Just to modify the data 
    public Customer(long id, int idStore, String name, String lastname, String email, int idAddress, boolean active,
            Date createdate, Date lastupdate, int storeIdStore, int addressIdAddress, int idZone) {
        super(id);
        this.idStore = idStore;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.idAddress = idAddress;
        this.active = active;
        this.createdate = createdate;
        this.lastupdate = lastupdate;
        StoreIdStore = storeIdStore;
        this.addressIdAddress = addressIdAddress;
        this.idZone = idZone;
    }

    public int getIdStore() {
        return idStore;
    }

    public void setIdStore(int idStore) {
        this.idStore = idStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public int getStoreIdStore() {
        return StoreIdStore;
    }

    public void setStoreIdStore(int storeIdStore) {
        StoreIdStore = storeIdStore;
    }

    public int getAddressIdAddress() {
        return addressIdAddress;
    }

    public void setAddressIdAddress(int addressIdAddress) {
        this.addressIdAddress = addressIdAddress;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    @Override
    public String toString() {
        return "Customer [StoreIdStore=" + StoreIdStore + ", active=" + active + ", addressIdAddress="
                + addressIdAddress + ", createdate=" + createdate + ", email=" + email + ", idAddress=" + idAddress
                + ", idStore=" + idStore + ", idZone=" + idZone + ", lastname=" + lastname + ", lastupdate="
                + lastupdate + ", name=" + name + "]";
    }

    
    

    
    



}

