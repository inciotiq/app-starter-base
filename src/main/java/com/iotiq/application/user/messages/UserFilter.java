package com.iotiq.application.user.messages;


import com.iotiq.application.user.domain.AccountInfo_;
import com.iotiq.application.user.domain.Person_;
import com.iotiq.application.user.domain.User;
import com.iotiq.commons.PageableRequest;
import com.iotiq.commons.SearchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import static com.iotiq.commons.util.NullHandlerUtil.setIfNotNull;


@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserFilter extends PageableRequest implements SearchRequest<User> {
    String name;

    @Override
    public Specification<User> buildSpecification() {
        return fieldNameIsLike(name, Person_.FIRST_NAME)
                .or(fieldNameIsLike(name, Person_.LAST_NAME))
                .or(fieldNameIsLike(name, AccountInfo_.USERNAME));
    }

    private Specification<User> fieldNameIsLike(String name, String fieldName) {
        return (root, query, cb) ->
                setIfNotNull(getName(), () -> cb.like(cb.lower(root.get(fieldName)), "%" + name.toLowerCase() + "%"));
    }


}
