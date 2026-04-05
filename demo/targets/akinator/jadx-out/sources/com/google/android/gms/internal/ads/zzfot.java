package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfot {
    private boolean zza;

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb(Context context) {
        zzfqs.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfqa.zza().zzb(context);
        zzfpr.zza().zzd(context);
        zzfqn.zza(context);
        zzfqo.zza(context);
        zzfqr.zza(context);
        zzfpx.zza().zzc(context);
        zzfpq.zza().zzc(context);
        zzfqc.zza().zzb(context);
    }
}
