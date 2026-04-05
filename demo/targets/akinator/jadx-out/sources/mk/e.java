package mk;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e implements ParameterizedType, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Type f74761b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f74762c;

    /* renamed from: e, reason: collision with root package name */
    public final Type[] f74763e;

    public e(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && g.requiresOwnerType(cls)) {
            throw new IllegalArgumentException(a.b.i(cls, "Must specify owner type for "));
        }
        this.f74761b = type == null ? null : g.canonicalize(type);
        this.f74762c = g.canonicalize(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f74763e = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f74763e[i10]);
            g.a(this.f74763e[i10]);
            Type[] typeArr3 = this.f74763e;
            typeArr3[i10] = g.canonicalize(typeArr3[i10]);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && g.equals(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return (Type[]) this.f74763e.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f74761b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f74762c;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f74763e) ^ this.f74762c.hashCode();
        Type type = this.f74761b;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public String toString() {
        Type[] typeArr = this.f74763e;
        int length = typeArr.length;
        Type type = this.f74762c;
        if (length == 0) {
            return g.typeToString(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(g.typeToString(type));
        sb2.append("<");
        sb2.append(g.typeToString(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(", ");
            sb2.append(g.typeToString(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
