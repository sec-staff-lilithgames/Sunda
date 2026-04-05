package io.odeeo.internal.j;

import io.odeeo.internal.b.g0;
import io.odeeo.internal.g.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final x f64364a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends g0 {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public d(x xVar) {
        this.f64364a = xVar;
    }

    public abstract boolean a(io.odeeo.internal.q0.x xVar) throws g0;

    public abstract boolean a(io.odeeo.internal.q0.x xVar, long j10) throws g0;

    public final boolean consume(io.odeeo.internal.q0.x xVar, long j10) throws g0 {
        return a(xVar) && a(xVar, j10);
    }

    public abstract void seek();
}
