package jd;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f69501a;

    public e(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f69501a = str;
    }

    public static e of(String str) {
        return new e(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f69501a.equals(((e) obj).f69501a);
    }

    public String getName() {
        return this.f69501a;
    }

    public int hashCode() {
        return this.f69501a.hashCode() ^ 1000003;
    }

    public String toString() {
        return o2.o(new StringBuilder("Encoding{name=\""), this.f69501a, "\"}");
    }
}
