package com.bytedance.sdk.component.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class wqx<P, R> extends com.bytedance.sdk.component.jpo.jd<P, R> {

    /* renamed from: jd, reason: collision with root package name */
    private jpo f18782jd;
    private boolean jpo = true;
    private my wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
        wqx jpo();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(Object obj);

        void jpo(Throwable th2);
    }

    private boolean jj() {
        if (this.jpo) {
            return true;
        }
        xyk.jpo(new IllegalStateException("Jsb async call already finished: " + jpo() + ", hashcode: " + hashCode()));
        return false;
    }

    public void cm() {
        this.jpo = false;
        this.wqx = null;
    }

    @Override // com.bytedance.sdk.component.jpo.jd
    public /* bridge */ /* synthetic */ String jpo() {
        return super.jpo();
    }

    public abstract void jpo(P p10, my myVar) throws Exception;

    public void my() {
        cm();
    }

    public final void wqx() {
        jpo((Throwable) null);
    }

    public final void jpo(R r10) {
        if (jj()) {
            this.f18782jd.jpo(r10);
            cm();
        }
    }

    public final void jpo(Throwable th2) {
        if (jj()) {
            this.f18782jd.jpo(th2);
            cm();
        }
    }

    public void jpo(P p10, my myVar, jpo jpoVar) throws Exception {
        this.wqx = myVar;
        this.f18782jd = jpoVar;
        jpo(p10, myVar);
    }
}
