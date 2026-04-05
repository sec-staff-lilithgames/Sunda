package io.odeeo.internal.r0;

import android.view.Surface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g extends io.odeeo.internal.r.i {

    /* renamed from: c, reason: collision with root package name */
    public final int f66169c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f66170d;

    public g(Throwable th2, io.odeeo.internal.r.j jVar, Surface surface) {
        super(th2, jVar);
        this.f66169c = System.identityHashCode(surface);
        this.f66170d = surface == null || surface.isValid();
    }
}
