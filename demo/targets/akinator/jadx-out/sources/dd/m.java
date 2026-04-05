package dd;

import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface m {
    Object convert(Object obj);

    default Object convert(jc.k kVar, Object obj) {
        return ((nc.o) this).convert(obj);
    }

    jc.o getInputType(cd.s sVar);

    jc.o getOutputType(cd.s sVar);

    default Object convert(u0 u0Var, Object obj) {
        return ((nc.o) this).convert(obj);
    }
}
