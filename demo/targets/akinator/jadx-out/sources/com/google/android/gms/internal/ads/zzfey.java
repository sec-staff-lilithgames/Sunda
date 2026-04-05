package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfey implements OnAdMetadataChangedListener, zzdac, zzcyr, zzcyo, zzcze, zzdbf, zzfdj, zzdgv {
    private final zzfhy zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfey zzi = null;

    public zzfey(zzfhy zzfhyVar) {
        this.zza = zzfhyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.onAdMetadataChanged();
        } else {
            zzfdb.zza(this.zzb, zzfex.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzd(final zzbxv zzbxvVar, final String str, final String str2) {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzd(zzbxvVar, str, str2);
            return;
        }
        zzfdb.zza(this.zzd, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfee
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzbxv zzbxvVar2 = zzbxvVar;
                ((zzbyr) obj).zzg(new zzbzf(zzbxvVar2.zzb(), zzbxvVar2.zzc()));
            }
        });
        zzfdb.zza(this.zzf, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfef
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzbxv zzbxvVar2 = zzbxvVar;
                ((zzbyw) obj).zze(new zzbzf(zzbxvVar2.zzb(), zzbxvVar2.zzc()), str, str2);
            }
        });
        zzfdb.zza(this.zze, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfeg
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbyb) obj).zzi(zzbxvVar);
            }
        });
        zzfdb.zza(this.zzg, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfeh
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbxw) obj).zze(zzbxvVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    public final void zzdN(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzdN(zzeVar);
            return;
        }
        final int i10 = zzeVar.zza;
        AtomicReference atomicReference = this.zzc;
        zzfdb.zza(atomicReference, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfel
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbyv) obj).zzg(zzeVar);
            }
        });
        zzfdb.zza(atomicReference, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfec
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbyv) obj).zzf(i10);
            }
        });
        zzfdb.zza(this.zze, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfed
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbyb) obj).zzk(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdO() {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzdO();
        } else {
            zzfdb.zza(this.zze, zzfet.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdx() {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzdx();
            return;
        }
        this.zza.zzb();
        zzfdb.zza(this.zzd, zzfen.zza);
        zzfdb.zza(this.zze, zzfes.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdy() {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzdy();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfdb.zza(atomicReference, zzfep.zza);
        zzfdb.zza(this.zze, zzfer.zza);
        zzfdb.zza(atomicReference, zzfem.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdz() {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzdz();
        } else {
            zzfdb.zza(this.zzd, zzfeo.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zze() {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zze();
        } else {
            zzfdb.zza(this.zze, zzfeu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzf() {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzf();
        } else {
            zzfdb.zza(this.zze, zzfev.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzg() {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzg();
        } else {
            zzfdb.zza(this.zzc, zzfeq.zza);
            zzfdb.zza(this.zze, zzfew.zza);
        }
    }

    public final void zzh(zzbyv zzbyvVar) {
        this.zzc.set(zzbyvVar);
    }

    public final void zzi(zzbyr zzbyrVar) {
        this.zzd.set(zzbyrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzj(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfdb.zza(atomicReference, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfei
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbyr) obj).zzi(zzeVar);
            }
        });
        zzfdb.zza(atomicReference, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfej
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbyr) obj).zzh(zzeVar.zza);
            }
        });
    }

    public final void zzk(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzh.set(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfey zzfeyVar = this.zzi;
        if (zzfeyVar != null) {
            zzfeyVar.zzm(zztVar);
        } else {
            zzfdb.zza(this.zzh, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfek
                @Override // com.google.android.gms.internal.ads.zzfda
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
                }
            });
        }
    }

    @Deprecated
    public final void zzn(zzbyb zzbybVar) {
        this.zze.set(zzbybVar);
    }

    public final void zzo(zzbyw zzbywVar) {
        this.zzf.set(zzbywVar);
    }

    @Deprecated
    public final void zzp(zzbxw zzbxwVar) {
        this.zzg.set(zzbxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdj
    public final void zzu(zzfdj zzfdjVar) {
        this.zzi = (zzfey) zzfdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdV() {
    }
}
