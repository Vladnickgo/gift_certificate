package com.epam.esm.service;

import com.epam.esm.service.dto.GiftCertificateDto;

import java.util.List;

public interface GiftCertificateService {
    GiftCertificateDto findById(String id);

    GiftCertificateDto save(GiftCertificateDto giftCertificateDto);

    List<GiftCertificateDto> findAll();

    GiftCertificateDto update(String id, GiftCertificateDto giftCertificateDto);

    void deleteById(String id);
}
