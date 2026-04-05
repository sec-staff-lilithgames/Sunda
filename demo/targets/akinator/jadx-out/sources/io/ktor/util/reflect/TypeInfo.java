package io.ktor.util.reflect;

import java.lang.reflect.Type;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TypeInfo {
    private final KType kotlinType;
    private final Type reifiedType;
    private final KClass<?> type;

    public TypeInfo(KClass<?> type, Type reifiedType, KType kType) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(reifiedType, "reifiedType");
        this.type = type;
        this.reifiedType = reifiedType;
        this.kotlinType = kType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypeInfo copy$default(TypeInfo typeInfo, KClass kClass, Type type, KType kType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kClass = typeInfo.type;
        }
        if ((i10 & 2) != 0) {
            type = typeInfo.reifiedType;
        }
        if ((i10 & 4) != 0) {
            kType = typeInfo.kotlinType;
        }
        return typeInfo.copy(kClass, type, kType);
    }

    public final KClass<?> component1() {
        return this.type;
    }

    public final Type component2() {
        return this.reifiedType;
    }

    public final KType component3() {
        return this.kotlinType;
    }

    public final TypeInfo copy(KClass<?> type, Type reifiedType, KType kType) {
        e0.checkNotNullParameter(type, "type");
        e0.checkNotNullParameter(reifiedType, "reifiedType");
        return new TypeInfo(type, reifiedType, kType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeInfo)) {
            return false;
        }
        TypeInfo typeInfo = (TypeInfo) obj;
        return e0.areEqual(this.type, typeInfo.type) && e0.areEqual(this.reifiedType, typeInfo.reifiedType) && e0.areEqual(this.kotlinType, typeInfo.kotlinType);
    }

    public final KType getKotlinType() {
        return this.kotlinType;
    }

    public final Type getReifiedType() {
        return this.reifiedType;
    }

    public final KClass<?> getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.reifiedType.hashCode() + (this.type.hashCode() * 31)) * 31;
        KType kType = this.kotlinType;
        return iHashCode + (kType == null ? 0 : kType.hashCode());
    }

    public String toString() {
        return "TypeInfo(type=" + this.type + ", reifiedType=" + this.reifiedType + ", kotlinType=" + this.kotlinType + ')';
    }

    public /* synthetic */ TypeInfo(KClass kClass, Type type, KType kType, int i10, u uVar) {
        this(kClass, type, (i10 & 4) != 0 ? null : kType);
    }
}
