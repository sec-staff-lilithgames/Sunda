package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum c2 extends d2 {
    public c2() {
        super("NOT_NULL", 3);
    }

    @Override // mh.d2, mh.q1
    public boolean apply(Object obj) {
        return obj != null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Predicates.notNull()";
    }
}
