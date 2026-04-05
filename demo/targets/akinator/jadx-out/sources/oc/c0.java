package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c0 extends s0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f78800f = new c0();

    public c0() {
        super(Object.class);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        if (!uVar.hasToken(ub.z.FIELD_NAME)) {
            uVar.skipChildren();
            return null;
        }
        while (true) {
            ub.z zVarNextToken = uVar.nextToken();
            if (zVarNextToken == null || zVarNextToken == ub.z.END_OBJECT) {
                return null;
            }
            uVar.skipChildren();
        }
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        int iCurrentTokenId = uVar.currentTokenId();
        if (iCurrentTokenId == 1 || iCurrentTokenId == 3 || iCurrentTokenId == 5) {
            return gVar.deserializeTypedFromAny(uVar, kVar);
        }
        return null;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return Boolean.FALSE;
    }
}
