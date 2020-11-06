package com.aktocor.realestateservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "location")
public class LocationEntity {
    @Id
    @Column(name = "id_location", nullable = false)
    private Long idLocation;

    @Basic
    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Basic
    @Column(name = "longitude", nullable = false)
    private Double longitude;

    public LocationEntity() {
    }

    public Long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Long idLocation) {
        this.idLocation = idLocation;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationEntity that = (LocationEntity) o;
        return Objects.equals(idLocation, that.idLocation) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLocation, latitude, longitude);
    }

    @Override
    public String toString() {
        return "LocationEntity{" +
                "idLocation=" + idLocation +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
