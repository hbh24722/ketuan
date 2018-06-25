package com.skqtec.entity;

import javax.persistence.*;

@Entity
@Table(name = "SENDADDRESS", schema = "ketuanDB", catalog = "")
@IdClass(SendaddressEntityPK.class)
public class SendaddressEntity {
    private int id;
    private String country;
    private String province;
    private String city;
    private String districts;
    private String street;
    private String addressDetail;
    private String sendName;
    private String sendPhone;
    private int userId;
    private String zip;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "districts")
    public String getDistricts() {
        return districts;
    }

    public void setDistricts(String districts) {
        this.districts = districts;
    }

    @Basic
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "address_detail")
    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    @Basic
    @Column(name = "send_name")
    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    @Basic
    @Column(name = "send_phone")
    public String getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(String sendPhone) {
        this.sendPhone = sendPhone;
    }

    @Id
    @Column(name = "USER_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "zip")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SendaddressEntity that = (SendaddressEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (districts != null ? !districts.equals(that.districts) : that.districts != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (addressDetail != null ? !addressDetail.equals(that.addressDetail) : that.addressDetail != null)
            return false;
        if (sendName != null ? !sendName.equals(that.sendName) : that.sendName != null) return false;
        if (sendPhone != null ? !sendPhone.equals(that.sendPhone) : that.sendPhone != null) return false;
        if (zip != null ? !zip.equals(that.zip) : that.zip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (districts != null ? districts.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (addressDetail != null ? addressDetail.hashCode() : 0);
        result = 31 * result + (sendName != null ? sendName.hashCode() : 0);
        result = 31 * result + (sendPhone != null ? sendPhone.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        return result;
    }
}
