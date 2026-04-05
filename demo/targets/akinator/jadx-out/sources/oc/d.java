package oc;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d extends c1 {
    public d() {
        super(AtomicLong.class);
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return new AtomicLong();
    }

    @Override // oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12144h;
    }

    @Override // jc.q
    public AtomicLong deserialize(ub.u uVar, jc.k kVar) throws IOException {
        if (uVar.isExpectedNumberIntToken()) {
            return new AtomicLong(uVar.getLongValue());
        }
        if (G(uVar, kVar, AtomicLong.class) == null) {
            return null;
        }
        return new AtomicLong(r3.intValue());
    }
}
