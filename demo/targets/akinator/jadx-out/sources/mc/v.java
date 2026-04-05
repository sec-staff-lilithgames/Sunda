package mc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface v {
    default Object getAbsentValue(jc.k kVar) throws jc.r {
        return getNullValue(kVar);
    }

    dd.a getNullAccessPattern();

    Object getNullValue(jc.k kVar) throws jc.r;
}
