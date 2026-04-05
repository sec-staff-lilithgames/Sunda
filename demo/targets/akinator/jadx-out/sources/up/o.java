package up;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class o {
    public static <T extends o> T resolveParams(T t10, T t11) {
        if (t10 == null) {
            return t11;
        }
        if (t11 != null) {
            t10.merge(t11);
        }
        return t10;
    }

    public abstract void merge(o oVar);
}
