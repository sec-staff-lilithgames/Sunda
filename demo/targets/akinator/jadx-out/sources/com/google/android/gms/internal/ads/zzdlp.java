package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdlp extends com.google.android.gms.ads.internal.client.zzec {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.client.zzed zzb;
    private final zzbry zzc;

    public zzdlp(com.google.android.gms.ads.internal.client.zzed zzedVar, zzbry zzbryVar) {
        this.zzb = zzedVar;
        this.zzc = zzbryVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzj() throws RemoteException {
        zzbry zzbryVar = this.zzc;
        if (zzbryVar != null) {
            return zzbryVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzk() throws RemoteException {
        zzbry zzbryVar = this.zzc;
        if (zzbryVar != null) {
            return zzbryVar.zzB();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl(com.google.android.gms.ads.internal.client.zzeg zzegVar) throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzed zzedVar = this.zzb;
                if (zzedVar != null) {
                    zzedVar.zzl(zzegVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final com.google.android.gms.ads.internal.client.zzeg zzo() throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzed zzedVar = this.zzb;
                if (zzedVar == null) {
                    return null;
                }
                return zzedVar.zzo();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
