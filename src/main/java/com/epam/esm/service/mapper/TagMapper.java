package com.epam.esm.service.mapper;

import com.epam.esm.repository.entity.Tag;
import com.epam.esm.service.dto.TagDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface TagMapper {
    Tag dtoToEntity(TagDto tagDto);
    TagDto entityToDto(Tag tag);
}
