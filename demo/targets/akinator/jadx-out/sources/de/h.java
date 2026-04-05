package de;

import android.os.Handler;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h implements s {

    /* renamed from: b, reason: collision with root package name */
    public final p f52128b;

    /* renamed from: c, reason: collision with root package name */
    public n f52129c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.drm.b f52131f;

    public h(com.google.android.exoplayer2.drm.b bVar, p pVar) {
        this.f52131f = bVar;
        this.f52128b = pVar;
    }

    public void acquire(z0 z0Var) {
        ((Handler) com.google.android.exoplayer2.util.a.checkNotNull(this.f52131f.f27428u)).post(new com.ironsource.environment.thread.a(20, this, z0Var));
    }

    @Override // de.s
    public void release() {
        n1.postOrRun((Handler) com.google.android.exoplayer2.util.a.checkNotNull(this.f52131f.f27428u), new com.unity3d.services.banners.view.a(this, 5));
    }
}
