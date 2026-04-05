package nh;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class me extends we implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final me f76479e = new me();

    /* renamed from: b, reason: collision with root package name */
    public transient we f76480b;

    /* renamed from: c, reason: collision with root package name */
    public transient we f76481c;

    @Override // nh.we
    public <S extends Comparable<?>> we nullsFirst() {
        we weVar = this.f76480b;
        if (weVar != null) {
            return weVar;
        }
        we weVarNullsFirst = super.nullsFirst();
        this.f76480b = weVarNullsFirst;
        return weVarNullsFirst;
    }

    @Override // nh.we
    public <S extends Comparable<?>> we nullsLast() {
        we weVar = this.f76481c;
        if (weVar != null) {
            return weVar;
        }
        we weVarNullsLast = super.nullsLast();
        this.f76481c = weVarNullsLast;
        return weVarNullsLast;
    }

    @Override // nh.we
    public <S extends Comparable<?>> we reverse() {
        return qf.f76588b;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        mh.p1.checkNotNull(comparable);
        mh.p1.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }
}
