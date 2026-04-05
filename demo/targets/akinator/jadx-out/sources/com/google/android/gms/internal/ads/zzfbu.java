package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfbu implements zzcyr, zzdan, zzfdj, com.google.android.gms.ads.internal.overlay.zzr, zzdbf, zzcze, zzdgv {
    private final zzfhy zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfbu zzh = null;

    public zzfbu(zzfhy zzfhyVar) {
        this.zza = zzfhyVar;
    }

    public static zzfbu zzn(zzfbu zzfbuVar) {
        zzfbu zzfbuVar2 = new zzfbu(zzfbuVar.zza);
        zzfbuVar2.zzh = zzfbuVar;
        return zzfbuVar2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzdA();
        } else {
            zzfdb.zza(this.zzf, zzfbh.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    public final void zzdN(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzdN(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzfdb.zza(atomicReference, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfbk
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbcq) obj).zzd(zzeVar);
            }
        });
        zzfdb.zza(atomicReference, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // com.google.android.gms.internal.ads.zzfda
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbcq) obj).zzc(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX() {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzdX();
        } else {
            zzfdb.zza(this.zzf, zzfbg.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdY(final int i10) {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzdY(i10);
        } else {
            zzfdb.zza(this.zzf, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfbm
                @Override // com.google.android.gms.internal.ads.zzfda
                public final /* synthetic */ void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdY(i10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdz() {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzdz();
        } else {
            zzfdb.zza(this.zzd, zzfbs.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzh();
            return;
        }
        zzfdb.zza(this.zzf, zzfbi.zza);
        AtomicReference atomicReference = this.zzd;
        zzfdb.zza(atomicReference, zzfbq.zza);
        zzfdb.zza(atomicReference, zzfbr.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzj(zzeVar);
        } else {
            zzfdb.zza(this.zzd, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfbn
                @Override // com.google.android.gms.internal.ads.zzfda
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbcu) obj).zze(zzeVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzl() {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzl();
        } else {
            zzfdb.zza(this.zze, zzfbf.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzm(zztVar);
        } else {
            zzfdb.zza(this.zzg, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfbo
                @Override // com.google.android.gms.internal.ads.zzfda
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(zztVar);
                }
            });
        }
    }

    public final void zzo(zzbcq zzbcqVar) {
        this.zzb.set(zzbcqVar);
    }

    public final void zzp(zzbcu zzbcuVar) {
        this.zzd.set(zzbcuVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzg.set(zzdtVar);
    }

    public final void zzs(final zzbcn zzbcnVar) {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzs(zzbcnVar);
        } else {
            zzfdb.zza(this.zzb, new zzfda() { // from class: com.google.android.gms.internal.ads.zzfbj
                @Override // com.google.android.gms.internal.ads.zzfda
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbcq) obj).zzb(zzbcnVar);
                }
            });
        }
    }

    public final void zzt() {
        zzfbu zzfbuVar = this.zzh;
        if (zzfbuVar != null) {
            zzfbuVar.zzt();
            return;
        }
        this.zza.zzb();
        zzfdb.zza(this.zzc, zzfbp.zza);
        zzfdb.zza(this.zzd, zzfbt.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfdj
    public final void zzu(zzfdj zzfdjVar) {
        this.zzh = (zzfbu) zzfdjVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }
}
