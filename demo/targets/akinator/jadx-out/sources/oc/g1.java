package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g1 extends c1 {

    /* renamed from: f, reason: collision with root package name */
    public static final g1 f78863f = new g1();

    public g1() {
        super(String.class);
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return "";
    }

    @Override // jc.q
    public boolean isCachable() {
        return true;
    }

    @Override // oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12148l;
    }

    @Override // jc.q
    public String deserialize(ub.u uVar, jc.k kVar) throws IOException {
        return uVar.hasToken(ub.z.VALUE_STRING) ? uVar.getText() : uVar.hasToken(ub.z.START_ARRAY) ? (String) n(uVar, kVar) : K(uVar, kVar, this);
    }

    @Override // oc.c1, oc.s0, jc.q
    public String deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return deserialize(uVar, kVar);
    }
}
