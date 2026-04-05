package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e implements jh.f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29603a;

    /* renamed from: b, reason: collision with root package name */
    public final ih.f f29604b;

    /* renamed from: c, reason: collision with root package name */
    public final g f29605c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f29606d;

    public e(Context context, Executor executor, g gVar, ih.f fVar, ih.t tVar) {
        this.f29603a = context;
        this.f29604b = fVar;
        this.f29605c = gVar;
        this.f29606d = executor;
    }

    @Override // jh.f
    public final void zzd(List list, jh.d dVar) {
        if (!ih.a.zze()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f29606d.execute(new d(this, list, dVar));
    }
}
