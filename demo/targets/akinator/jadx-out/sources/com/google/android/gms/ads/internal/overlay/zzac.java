package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbbo;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzdgv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzac extends zzbvh implements zzbbo {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private final boolean zzf;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;
    private boolean zzg = false;
    private boolean zzh = false;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzac(android.app.Activity r3, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zzc = r0
            r2.zzd = r0
            r2.zze = r0
            r2.zzg = r0
            r2.zzh = r0
            r2.zza = r4
            r2.zzb = r3
            com.google.android.gms.internal.ads.zzbel r3 = com.google.android.gms.internal.ads.zzbeu.zzfp
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r1.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L48
            com.google.android.gms.internal.ads.zzbel r3 = com.google.android.gms.internal.ads.zzbeu.zzfq
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r1.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L48
            com.google.android.gms.internal.ads.zzbel r3 = com.google.android.gms.internal.ads.zzbeu.zzfu
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r1.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L79
        L48:
            com.google.android.gms.ads.internal.overlay.zzc r3 = r4.zza
            if (r3 == 0) goto L79
            boolean r3 = r3.zzj
            if (r3 == 0) goto L79
            java.lang.String r3 = android.os.Build.MANUFACTURER
            com.google.android.gms.internal.ads.zzbel r4 = com.google.android.gms.internal.ads.zzbeu.zzfs
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r1.zzd(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L79
            java.lang.String r3 = android.os.Build.MODEL
            com.google.android.gms.internal.ads.zzbel r4 = com.google.android.gms.internal.ads.zzbeu.zzft
            com.google.android.gms.internal.ads.zzbes r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r1.zzd(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L79
            r0 = 1
        L79:
            r2.zzf = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzac.<init>(android.app.Activity, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel):void");
    }

    private final synchronized void zzc() {
        try {
            if (!this.zzd) {
                zzr zzrVar = this.zza.zzc;
                if (zzrVar != null) {
                    zzrVar.zzdY(4);
                }
                this.zzd = true;
                if (this.zzf) {
                    if (((Boolean) zzbd.zzc().zzd(zzbeu.zzfu)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzg().zzc(this);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbo
    public final void zza(boolean z10) {
        if (!z10) {
            this.zzh = true;
        } else if (this.zzh) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Foregrounded: finishing activity from LauncherOverlay");
            this.zzb.finish();
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zzg) {
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzf() throws RemoteException {
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zzg() throws RemoteException {
        return ((Boolean) zzbd.zzc().zzd(zzbeu.zzfq)).booleanValue() && this.zzf && this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh(Bundle bundle) {
        zzr zzrVar;
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzjR)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z10 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z10) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdgv zzdgvVar = adOverlayInfoParcel.zzu;
            if (zzdgvVar != null) {
                zzdgvVar.zzdz();
            }
            Activity activity = this.zzb;
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                zzrVar.zzh();
            }
        }
        if (this.zzf) {
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzfu)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
            }
        }
        Activity activity2 = this.zzb;
        zzc zzcVar = adOverlayInfoParcel.zza;
        zzad zzadVar = adOverlayInfoParcel.zzi;
        com.google.android.gms.ads.internal.zzt.zza();
        if (zza.zzb(activity2, zzcVar, zzadVar, zzcVar.zzi, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk() throws RemoteException {
        if (this.zzc) {
            com.google.android.gms.ads.internal.util.zze.zza("LauncherOverlay finishing activity");
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        this.zzg = true;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdC();
        }
        if (this.zzf) {
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzfp)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzab
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, ((Integer) zzbd.zzc().zzd(zzbeu.zzfr)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzl() throws RemoteException {
        this.zzg = false;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdB();
        }
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzo(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzp() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzq() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzs() throws RemoteException {
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zze() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzH(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzm(int i10, int i11, Intent intent) throws RemoteException {
    }
}
