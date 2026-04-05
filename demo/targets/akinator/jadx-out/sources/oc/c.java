package oc;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c extends c1 {
    public c() {
        super(AtomicInteger.class);
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return new AtomicInteger();
    }

    @Override // oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12144h;
    }

    @Override // jc.q
    public AtomicInteger deserialize(ub.u uVar, jc.k kVar) throws IOException {
        if (uVar.isExpectedNumberIntToken()) {
            return new AtomicInteger(uVar.getIntValue());
        }
        Integer numF = F(uVar, kVar, AtomicInteger.class);
        if (numF == null) {
            return null;
        }
        return new AtomicInteger(numF.intValue());
    }
}
