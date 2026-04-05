package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v2 {
    public static final <T> Object readData(s2 s2Var, zu.d<? super T> dVar) {
        return s2Var.readScope(new t2(3, null), dVar);
    }

    public static final <T> Object writeData(s2 s2Var, T t10, zu.d<? super tu.x0> dVar) {
        Object objWriteScope = s2Var.writeScope(new u2(t10, null), dVar);
        return objWriteScope == av.e.getCOROUTINE_SUSPENDED() ? objWriteScope : tu.x0.f87415a;
    }
}
