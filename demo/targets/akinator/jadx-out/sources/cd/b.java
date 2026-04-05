package cd;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public String f12131b;

    /* renamed from: c, reason: collision with root package name */
    public Class f12132c;

    /* renamed from: e, reason: collision with root package name */
    public int f12133e;

    public b() {
        this.f12132c = null;
        this.f12131b = null;
        this.f12133e = 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == b.class && ((b) obj).f12132c == this.f12132c;
    }

    public int hashCode() {
        return this.f12133e;
    }

    public void reset(Class<?> cls) {
        this.f12132c = cls;
        String name = cls.getName();
        this.f12131b = name;
        this.f12133e = name.hashCode();
    }

    public String toString() {
        return this.f12131b;
    }

    @Override // java.lang.Comparable
    public int compareTo(b bVar) {
        return this.f12131b.compareTo(bVar.f12131b);
    }

    public b(Class<?> cls) {
        this.f12132c = cls;
        String name = cls.getName();
        this.f12131b = name;
        this.f12133e = name.hashCode();
    }
}
