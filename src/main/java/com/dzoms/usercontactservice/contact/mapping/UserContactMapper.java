package com.dzoms.usercontactservice.contact.mapping;

import com.dzoms.usercontactservice.contact.domain.UserContactEntity;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import transfer.contract.domain.usercontact.UserContactTo;

/**
 * Маппер для {@link UserContactEntity}.
 */
@Mapper(componentModel = "spring")
@RequiredArgsConstructor
public abstract class UserContactMapper {

    /**
     * Маппинг из to в entity.
     *
     * @param to to-модель контакта
     * @return entity с представленными полями
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user1Id", ignore = true)
    @Mapping(target = "user2Id", ignore = true)
    public abstract UserContactEntity mapFromTo(UserContactTo to);

    /**
     * Маппинг из entity в to.
     *
     * @param entity entity контакта
     * @return to с представленными полями
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user1Id", ignore = true)
    @Mapping(target = "user2Id", ignore = true)
    public abstract UserContactTo mapFromEntity(UserContactEntity entity);
}
