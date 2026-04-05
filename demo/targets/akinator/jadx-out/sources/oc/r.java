package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class r extends t {
    public r() {
        super(StringBuffer.class);
    }

    @Override // oc.t
    public final Object V(String str, jc.k kVar) {
        return new StringBuffer(str);
    }

    @Override // oc.t, jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        String valueAsString = uVar.getValueAsString();
        return valueAsString != null ? new StringBuffer(valueAsString) : super.deserialize(uVar, kVar);
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) {
        return new StringBuffer();
    }

    @Override // oc.t, oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12148l;
    }
}
