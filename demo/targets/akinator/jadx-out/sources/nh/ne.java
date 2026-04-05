package nh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ne extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final we f76506b;

    public ne(we weVar) {
        this.f76506b = weVar;
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.f76506b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ne) {
            return this.f76506b.equals(((ne) obj).f76506b);
        }
        return false;
    }

    public int hashCode() {
        return this.f76506b.hashCode() ^ 957692532;
    }

    @Override // nh.we
    public <S> we nullsLast() {
        return this.f76506b.nullsLast();
    }

    @Override // nh.we
    public <S> we reverse() {
        return this.f76506b.reverse().nullsLast();
    }

    public String toString() {
        return this.f76506b + ".nullsFirst()";
    }

    @Override // nh.we
    public <S> we nullsFirst() {
        return this;
    }
}
