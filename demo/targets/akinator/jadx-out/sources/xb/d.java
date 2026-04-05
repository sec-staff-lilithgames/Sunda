package xb;

import ub.o;
import ub.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d extends x {

    /* renamed from: c, reason: collision with root package name */
    public transient o f91896c;

    public d(String str, Throwable th2, o oVar) {
        super(str, null, th2);
        this.f91896c = oVar;
    }

    public abstract d withGenerator(o oVar);

    @Override // ub.x, ub.h
    public o getProcessor() {
        return this.f91896c;
    }

    public d(String str, o oVar) {
        super(str, null, null);
        this.f91896c = oVar;
    }

    public d(Throwable th2, o oVar) {
        super(null, null, th2);
        this.f91896c = oVar;
    }
}
