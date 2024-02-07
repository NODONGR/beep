package com.itwill.beep.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAccount is a Querydsl query type for Account
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAccount extends EntityPathBase<Account> {

    private static final long serialVersionUID = -471133889L;

    public static final QAccount account = new QAccount("account");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<UserRole, EnumPath<UserRole>> roles = this.<UserRole, EnumPath<UserRole>>createSet("roles", UserRole.class, EnumPath.class, PathInits.DIRECT2);

    public final StringPath streamingKey = createString("streamingKey");

    public final StringPath user_password = createString("user_password");

    public final StringPath username = createString("username");

    public final StringPath userNickname = createString("userNickname");

    public QAccount(String variable) {
        super(Account.class, forVariable(variable));
    }

    public QAccount(Path<? extends Account> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccount(PathMetadata metadata) {
        super(Account.class, metadata);
    }

}

