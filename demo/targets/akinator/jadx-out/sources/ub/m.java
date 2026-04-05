package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m extends xb.d {
    @Deprecated
    public m(Throwable th2) {
        super(th2, (o) null);
    }

    @Deprecated
    public m(String str) {
        super(str, (o) null);
    }

    @Override // xb.d, ub.x, ub.h
    public o getProcessor() {
        return this.f91896c;
    }

    @Override // xb.d
    public m withGenerator(o oVar) {
        this.f91896c = oVar;
        return this;
    }

    @Deprecated
    public m(String str, Throwable th2) {
        super(str, th2, null);
    }

    public m(Throwable th2, o oVar) {
        super(th2, oVar);
    }

    public m(String str, o oVar) {
        super(str, oVar);
        this.f91896c = oVar;
    }

    public m(String str, Throwable th2, o oVar) {
        super(str, th2, oVar);
        this.f91896c = oVar;
    }
}
