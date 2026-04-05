package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeja extends zzbyf implements zzczy {
    private zzbyg zza;
    private zzczx zzb;
    private zzdhg zzc;

    @Override // com.google.android.gms.internal.ads.zzczy
    public final synchronized void zza(zzczx zzczxVar) {
        this.zzb = zzczxVar;
    }

    public final synchronized void zzc(zzbyg zzbygVar) {
        this.zza = zzbygVar;
    }

    public final synchronized void zzd(zzdhg zzdhgVar) {
        this.zzc = zzdhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdhg zzdhgVar = this.zzc;
        if (zzdhgVar != null) {
            final zzehn zzehnVar = ((zzema) zzdhgVar).zzc;
            final zzffu zzffuVar = ((zzema) zzdhgVar).zzb;
            final zzfgf zzfgfVar = ((zzema) zzdhgVar).zza;
            final zzema zzemaVar = (zzema) zzdhgVar;
            ((zzema) zzdhgVar).zzd.zzc().execute(new Runnable(zzemaVar, zzfgfVar, zzffuVar, zzehnVar) { // from class: com.google.android.gms.internal.ads.zzelz
                private final /* synthetic */ zzfgf zza;
                private final /* synthetic */ zzffu zzb;
                private final /* synthetic */ zzehn zzc;

                {
                    this.zza = zzfgfVar;
                    this.zzb = zzffuVar;
                    this.zzc = zzehnVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzemd.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzdhg zzdhgVar = this.zzc;
        if (zzdhgVar != null) {
            String str = ((zzema) zzdhgVar).zzc.zza;
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzczx zzczxVar = this.zzb;
        if (zzczxVar != null) {
            zzczxVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzemc) zzbygVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzemc) zzbygVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            zzbygVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzemc) zzbygVar).zzd.zzb(zzbyhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzemc) zzbygVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzczx zzczxVar = this.zzb;
        if (zzczxVar != null) {
            zzczxVar.zzb(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzemc) zzbygVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzemc) zzbygVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyg
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbyg zzbygVar = this.zza;
        if (zzbygVar != null) {
            ((zzemc) zzbygVar).zzd.zzb(null);
        }
    }
}
