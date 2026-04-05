package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfql implements Runnable {
    final /* synthetic */ zzfqm zza;
    private final WebView zzb;

    public zzfql(zzfqm zzfqmVar) {
        Objects.requireNonNull(zzfqmVar);
        this.zza = zzfqmVar;
        this.zzb = zzfqmVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
