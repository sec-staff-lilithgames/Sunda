package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzeji implements zzdjl {
    private final zzffu zza;
    private final zzbti zzb;
    private final AdFormat zzc;
    private zzczg zzd = null;

    public zzeji(zzffu zzffuVar, zzbti zzbtiVar, AdFormat adFormat) {
        this.zza = zzffuVar;
        this.zzb = zzbtiVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdjl
    public final void zza(boolean z10, Context context, zzczb zzczbVar) throws zzdjk {
        boolean zZzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdjk("Adapter failed to show.");
                }
                zZzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zZzk) {
                zzczg zzczgVar = this.zzd;
                if (zzczgVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbN)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzczgVar.zza();
                return;
            }
            throw new zzdjk("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdjk(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjl
    public final zzffu zzb() {
        return this.zza;
    }

    public final void zzc(zzczg zzczgVar) {
        this.zzd = zzczgVar;
    }
}
