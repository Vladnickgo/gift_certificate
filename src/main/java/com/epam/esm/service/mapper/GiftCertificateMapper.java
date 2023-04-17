package com.epam.esm.service.mapper;

import com.epam.esm.repository.entity.GiftCertificate;
import com.epam.esm.service.dto.GiftCertificateDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GiftCertificateMapper {
    GiftCertificate dtoToEntity(GiftCertificateDto giftCertificateDto);
    GiftCertificateDto entityToDto(GiftCertificate giftCertificate);
}
