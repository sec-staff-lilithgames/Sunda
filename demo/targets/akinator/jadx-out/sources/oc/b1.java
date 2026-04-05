package oc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b1 extends s0 implements mc.w {

    /* renamed from: f, reason: collision with root package name */
    public jc.q f78799f;

    public abstract Object convert(jc.t tVar, jc.k kVar) throws IOException;

    public Object convert(jc.t tVar, jc.k kVar, Object obj) throws IOException {
        kVar.handleBadMerge(this);
        return convert(tVar, kVar);
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        return convert((jc.t) this.f78799f.deserialize(uVar, kVar), kVar);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return convert((jc.t) this.f78799f.deserializeWithType(uVar, kVar, gVar), kVar);
    }

    @Override // mc.w
    public void resolve(jc.k kVar) throws jc.r {
        this.f78799f = kVar.findRootValueDeserializer(kVar.constructType(jc.t.class));
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        return convert((jc.t) this.f78799f.deserialize(uVar, kVar), kVar, obj);
    }
}
