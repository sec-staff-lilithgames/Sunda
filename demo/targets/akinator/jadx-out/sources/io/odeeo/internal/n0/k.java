package io.odeeo.internal.n0;

import io.odeeo.internal.a0.l0;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.n;
import io.odeeo.internal.b.q0;
import io.odeeo.internal.b.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public a f65053a;

    /* renamed from: b, reason: collision with root package name */
    public io.odeeo.internal.p0.d f65054b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onTrackSelectionsInvalidated();
    }

    public final io.odeeo.internal.p0.d a() {
        return (io.odeeo.internal.p0.d) io.odeeo.internal.q0.a.checkNotNull(this.f65054b);
    }

    public final void b() {
        a aVar = this.f65053a;
        if (aVar != null) {
            aVar.onTrackSelectionsInvalidated();
        }
    }

    public j getParameters() {
        return j.f65003y;
    }

    public final void init(a aVar, io.odeeo.internal.p0.d dVar) {
        this.f65053a = aVar;
        this.f65054b = dVar;
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(Object obj);

    public abstract l selectTracks(q0[] q0VarArr, l0 l0Var, t.a aVar, y0 y0Var) throws n;

    public void setParameters(j jVar) {
    }
}
