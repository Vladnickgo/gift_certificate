package com.epam.esm.service.dto;

import java.time.LocalDate;
import java.util.Objects;

public class GiftCertificateDto {
    private final Integer id;
    private final String name;
    private final Integer price;
    private final Integer duration;
    private final LocalDate createDate;
    private final LocalDate lastUpdateDate;

    private GiftCertificateDto(Builder builder) {
        id = builder.id;
        name = builder.name;
        price = builder.price;
        duration = builder.duration;
        createDate = builder.createDate;
        lastUpdateDate = builder.lastUpdateDate;
    }

    public static final class Builder {
        private Integer id;
        private String name;
        private Integer price;
        private Integer duration;
        private LocalDate createDate;
        private LocalDate lastUpdateDate;

        public Builder() {
        }

        public Builder id(Integer val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder price(Integer val) {
            price = val;
            return this;
        }

        public Builder duration(Integer val) {
            duration = val;
            return this;
        }

        public Builder createDate(LocalDate val) {
            createDate = val;
            return this;
        }

        public Builder lastUpdateDate(LocalDate val) {
            lastUpdateDate = val;
            return this;
        }

        public GiftCertificateDto build() {
            return new GiftCertificateDto(this);
        }
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getDuration() {
        return duration;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public LocalDate getLastUpdateDate() {
        return lastUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiftCertificateDto that = (GiftCertificateDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(duration, that.duration) && Objects.equals(createDate, that.createDate) && Objects.equals(lastUpdateDate, that.lastUpdateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, duration, createDate, lastUpdateDate);
    }

    @Override
    public String toString() {
        return "GiftCertificateDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", createDate=" + createDate +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
