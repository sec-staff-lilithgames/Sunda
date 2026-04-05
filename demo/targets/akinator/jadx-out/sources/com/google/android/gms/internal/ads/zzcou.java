package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcou implements zzczj {
    private final zzfhl zza;

    public zzcou(zzfhl zzfhlVar) {
        this.zza = zzfhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zza(Context context) {
        try {
            this.zza.zzi();
        } catch (zzfgu e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzb(Context context) {
        try {
            zzfhl zzfhlVar = this.zza;
            zzfhlVar.zzj();
            if (context != null) {
                zzfhlVar.zzp(context);
            }
        } catch (zzfgu e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzc(Context context) {
        try {
            this.zza.zzf();
        } catch (zzfgu e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }
}
