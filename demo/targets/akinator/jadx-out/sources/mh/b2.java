package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum b2 extends d2 {
    public b2() {
        super("IS_NULL", 2);
    }

    @Override // mh.d2, mh.q1
    public boolean apply(Object obj) {
        return obj == null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Predicates.isNull()";
    }
}
