package fu;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class o0 extends mt.m0 implements pt.c {

    /* renamed from: h, reason: collision with root package name */
    public static final n0 f56064h = new n0();

    /* renamed from: i, reason: collision with root package name */
    public static final pt.c f56065i = pt.d.disposed();

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f56066e;

    /* renamed from: f, reason: collision with root package name */
    public final nu.a f56067f;

    /* renamed from: g, reason: collision with root package name */
    public final pt.c f56068g;

    public o0(st.o oVar, mt.m0 m0Var) {
        this.f56066e = m0Var;
        nu.a serialized = nu.d.create().toSerialized();
        this.f56067f = serialized;
        try {
            this.f56068g = ((mt.c) oVar.apply(serialized)).subscribe();
        } catch (Throwable th2) {
            throw iu.m.wrapOrThrow(th2);
        }
    }

    @Override // mt.m0
    public m0.a createWorker() {
        m0.a aVarCreateWorker = this.f56066e.createWorker();
        nu.a serialized = nu.d.create().toSerialized();
        mt.l map = serialized.map(new h0(aVarCreateWorker));
        l0 l0Var = new l0(serialized, aVarCreateWorker);
        this.f56067f.onNext(map);
        return l0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f56068g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f56068g.isDisposed();
    }
}
