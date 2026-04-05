package kotlin.reflect;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class GenericArrayTypeImpl implements GenericArrayType, TypeImpl {
    private final Type elementType;

    public GenericArrayTypeImpl(Type elementType) {
        e0.checkNotNullParameter(elementType, "elementType");
        this.elementType = elementType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && e0.areEqual(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.elementType;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    public String getTypeName() {
        return TypesJVMKt.typeToString(this.elementType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
