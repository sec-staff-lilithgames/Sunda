package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbdx {
    final /* synthetic */ zzbdy zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbdx(zzbdy zzbdyVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbdyVar);
        this.zza = zzbdyVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbdy zzbdyVar = this.zza;
            if (zzbdyVar.zzb) {
                zzbdyVar.zza.zzh(this.zzb);
                zzbdyVar.zza.zzi(0);
                zzbdyVar.zza.zzj(this.zzc);
                zzbdyVar.zza.zzg(null);
                zzbdyVar.zza.zzf();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e10);
        }
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final zzbdx zzb(int i10) {
        this.zzc = i10;
        return this;
    }
}
