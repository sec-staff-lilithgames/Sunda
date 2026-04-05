package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdhr extends zzdem {
    private boolean zzb;

    public zzdhr(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdhq.zza);
    }

    public final void zzb() {
        zzs(zzdhm.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdhn.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        try {
            if (!this.zzb) {
                zzs(zzdhp.zza);
                this.zzb = true;
            }
            zzs(zzdho.zza);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
