import com.epam.esm.repository.GiftCertificateRepository;
import com.epam.esm.repository.entity.GiftCertificate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        ZonedDateTime now1 = ZonedDateTime.now(ZoneId.of("UTC+5"));
        System.out.println(now1);
        ZonedDateTime of = ZonedDateTime.of(2000, 10, 10, 12, 12, 12, 0, ZoneId.of("America/Argentina/Buenos_Aires"));
        GiftCertificate build = GiftCertificate.builder()
                .id(1)
                .price(123)
                .createDate(of)
                .build();

        System.out.println(build.getCreateDate());

        GiftCertificateRepository giftCertificateRepository = new GiftCertificateRepository();
    }
}
