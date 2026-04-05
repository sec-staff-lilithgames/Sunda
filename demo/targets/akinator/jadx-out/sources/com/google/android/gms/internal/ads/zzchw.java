package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzchw implements Runnable {
    final /* synthetic */ zzcib zza;

    public zzchw(zzcib zzcibVar) {
        Objects.requireNonNull(zzcibVar);
        this.zza = zzcibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
