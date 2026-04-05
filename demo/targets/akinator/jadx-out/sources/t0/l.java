package t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l {
    public static final int indexSegment(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final <E> s0.j persistentVectorOf() {
        return j.f86242e.getEMPTY();
    }

    public static final Object[] presizedBufferWith(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int rootSize(int i10) {
        return (i10 - 1) & (-32);
    }
}
