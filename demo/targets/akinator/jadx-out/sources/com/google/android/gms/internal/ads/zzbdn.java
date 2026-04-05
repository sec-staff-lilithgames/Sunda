package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.Objects;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbdn implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbdf zza;
    final /* synthetic */ zzcca zzb;
    final /* synthetic */ zzbdp zzc;

    public zzbdn(zzbdp zzbdpVar, zzbdf zzbdfVar, zzcca zzccaVar) {
        this.zza = zzbdfVar;
        this.zzb = zzccaVar;
        Objects.requireNonNull(zzbdpVar);
        this.zzc = zzbdpVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbdp zzbdpVar = this.zzc;
        synchronized (zzbdpVar.zzf()) {
            try {
                if (zzbdpVar.zzd()) {
                    return;
                }
                zzbdpVar.zze(true);
                final zzbde zzbdeVarZzc = zzbdpVar.zzc();
                if (zzbdeVarZzc == null) {
                    return;
                }
                zzgus zzgusVar = zzcbv.zza;
                final zzbdf zzbdfVar = this.zza;
                final zzcca zzccaVar = this.zzb;
                final n1 n1VarSubmit = zzgusVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() throws IOException {
                        zzcca zzccaVar2 = zzccaVar;
                        zzbde zzbdeVar = zzbdeVarZzc;
                        zzbdn zzbdnVar = this.zza;
                        try {
                            zzbdh zzbdhVarZzq = zzbdeVar.zzq();
                            boolean zZzp = zzbdeVar.zzp();
                            zzbdf zzbdfVar2 = zzbdfVar;
                            zzbdc zzbdcVarZzf = zZzp ? zzbdhVarZzq.zzf(zzbdfVar2) : zzbdhVarZzq.zze(zzbdfVar2);
                            if (!zzbdcVarZzf.zza()) {
                                zzccaVar2.zzd(new RuntimeException("No entry contents."));
                                zzbdnVar.zzc.zzb();
                                return;
                            }
                            zzbdk zzbdkVar = new zzbdk(zzbdnVar, zzbdcVarZzf.zzb(), 1);
                            int i10 = zzbdkVar.read();
                            if (i10 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbdkVar.unread(i10);
                            zzccaVar2.zzc(zzbdr.zza(zzbdkVar, zzbdcVarZzf.zzd(), zzbdcVarZzf.zzg(), zzbdcVarZzf.zzf(), zzbdcVarZzf.zze()));
                        } catch (RemoteException e10) {
                            e = e10;
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzccaVar2.zzd(e);
                            zzbdnVar.zzc.zzb();
                        } catch (IOException e11) {
                            e = e11;
                            int i112 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzccaVar2.zzd(e);
                            zzbdnVar.zzc.zzb();
                        }
                    }
                });
                zzccaVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzccaVar.isCancelled()) {
                            n1VarSubmit.cancel(true);
                        }
                    }
                }, zzcbv.zzg);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
