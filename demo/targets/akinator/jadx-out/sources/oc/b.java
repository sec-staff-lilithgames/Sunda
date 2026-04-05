package oc;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b extends c1 {
    public b() {
        super(AtomicBoolean.class);
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return new AtomicBoolean(false);
    }

    @Override // oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12146j;
    }

    @Override // jc.q
    public AtomicBoolean deserialize(ub.u uVar, jc.k kVar) throws IOException {
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == ub.z.VALUE_TRUE) {
            return new AtomicBoolean(true);
        }
        if (zVarCurrentToken == ub.z.VALUE_FALSE) {
            return new AtomicBoolean(false);
        }
        Boolean boolX = x(uVar, kVar, AtomicBoolean.class);
        if (boolX == null) {
            return null;
        }
        return new AtomicBoolean(boolX.booleanValue());
    }
}
