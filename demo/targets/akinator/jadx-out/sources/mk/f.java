package mk;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f implements WildcardType, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Type f74764b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f74765c;

    public f(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            g.a(typeArr[0]);
            this.f74765c = null;
            this.f74764b = g.canonicalize(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        g.a(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
        }
        this.f74765c = g.canonicalize(typeArr2[0]);
        this.f74764b = Object.class;
    }

    public boolean equals(Object obj) {
        return (obj instanceof WildcardType) && g.equals(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f74765c;
        return type != null ? new Type[]{type} : g.f74768a;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        return new Type[]{this.f74764b};
    }

    public int hashCode() {
        Type type = this.f74765c;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f74764b.hashCode() + 31);
    }

    public String toString() {
        Type type = this.f74765c;
        if (type != null) {
            return "? super " + g.typeToString(type);
        }
        Type type2 = this.f74764b;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + g.typeToString(type2);
    }
}
