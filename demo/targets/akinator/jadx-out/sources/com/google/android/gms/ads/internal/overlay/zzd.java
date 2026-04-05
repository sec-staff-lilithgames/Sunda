package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzd implements View.OnClickListener {
    final /* synthetic */ zzm zza;

    public zzd(zzm zzmVar) {
        Objects.requireNonNull(zzmVar);
        this.zza = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.zza;
        zzmVar.zzn = 2;
        zzmVar.zzb.finish();
    }
}
