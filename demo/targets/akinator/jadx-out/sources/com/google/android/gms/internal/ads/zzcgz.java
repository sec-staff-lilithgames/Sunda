package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcgz implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbzt zza;
    final /* synthetic */ zzchj zzb;

    public zzcgz(zzchj zzchjVar, zzbzt zzbztVar) {
        this.zza = zzbztVar;
        Objects.requireNonNull(zzchjVar);
        this.zzb = zzchjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzX(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
