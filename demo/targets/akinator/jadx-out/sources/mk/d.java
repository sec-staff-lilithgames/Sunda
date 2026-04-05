package mk;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d implements GenericArrayType, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Type f74760b;

    public d(Type type) {
        Objects.requireNonNull(type);
        this.f74760b = g.canonicalize(type);
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && g.equals(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f74760b;
    }

    public int hashCode() {
        return this.f74760b.hashCode();
    }

    public String toString() {
        return g.typeToString(this.f74760b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
