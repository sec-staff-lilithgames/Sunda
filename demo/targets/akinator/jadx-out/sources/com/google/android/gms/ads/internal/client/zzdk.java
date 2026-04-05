package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdk implements MuteThisAdReason {
    private final String zza;
    private final zzdj zzb;

    public zzdk(zzdj zzdjVar) {
        String strZze;
        this.zzb = zzdjVar;
        try {
            strZze = zzdjVar.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            strZze = null;
        }
        this.zza = strZze;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzdj zza() {
        return this.zzb;
    }
}
