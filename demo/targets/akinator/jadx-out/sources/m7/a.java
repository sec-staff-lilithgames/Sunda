package m7;

import m7.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static final c.a Dimension(int i10) {
        return new c.a(i10);
    }

    public static final int pxOrElse(c cVar, kv.a aVar) {
        return cVar instanceof c.a ? ((c.a) cVar).f74052a : ((Number) aVar.invoke()).intValue();
    }
}
