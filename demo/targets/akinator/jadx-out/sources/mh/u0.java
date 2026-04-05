package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u0 {
    public static u0 identity() {
        return r0.f74679e;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract int b(Object obj);

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean equivalent(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }

    public final q1 equivalentTo(Object obj) {
        return new s0(this, obj);
    }

    public final int hash(Object obj) {
        if (obj == null) {
            return 0;
        }
        return b(obj);
    }

    public final <F> u0 onResultOf(v0 v0Var) {
        return new w0(v0Var, this);
    }

    public final <S> u0 pairwise() {
        return new l1(this);
    }

    public final <S> t0 wrap(S s10) {
        return new t0(this, s10);
    }

    public static u0 equals() {
        return r0.f74678c;
    }
}
