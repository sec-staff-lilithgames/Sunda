package io.bidmachine.media3.common.util;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f60728a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f60729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f60730c;

    public j0(k0 k0Var, i0 i0Var, Executor executor) {
        this.f60730c = k0Var;
        this.f60728a = new WeakReference(i0Var);
        this.f60729b = executor;
    }

    public void callOnNetworkTypeChanged() {
        this.f60729b.execute(new com.unity3d.services.banners.view.a(this, 23));
    }

    public boolean canBeRemoved() {
        return this.f60728a.get() == null;
    }
}
