package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcie extends com.google.android.gms.ads.internal.client.zzec {
    private final zzcdr zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzeg zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbjq zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcie(zzcdr zzcdrVar, float f10, boolean z10, boolean z11) {
        this.zza = zzcdrVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcid
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzt(map2);
            }
        });
    }

    private final void zzx(final int i10, final int i11, final boolean z10, final boolean z11) {
        zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcic
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzu(i10, i11, z10, z11);
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        Object obj = this.zzb;
        boolean z10 = zzgaVar.zzb;
        boolean z11 = zzgaVar.zzc;
        synchronized (obj) {
            this.zzl = z10;
            this.zzm = z11;
        }
        boolean z12 = zzgaVar.zza;
        zzw("initialState", CollectionUtils.mapOf("muteStart", true != z12 ? "0" : "1", "customControlsRequested", true != z10 ? "0" : "1", "clickToExpandRequested", true != z11 ? "0" : "1"));
    }

    public final void zzd(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() {
        zzw("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() {
        zzw(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg(boolean z10) {
        zzw(true != z10 ? CampaignEx.JSON_NATIVE_VIDEO_UNMUTE : CampaignEx.JSON_NATIVE_VIDEO_MUTE, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzh() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzi() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzj() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzk() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl(com.google.android.gms.ads.internal.client.zzeg zzegVar) {
        synchronized (this.zzb) {
            this.zzf = zzegVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzm() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzn() {
        boolean z10;
        synchronized (this.zzb) {
            try {
                z10 = false;
                if (this.zzc && this.zzl) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final com.google.android.gms.ads.internal.client.zzeg zzo() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        synchronized (this.zzb) {
            zzegVar = this.zzf;
        }
        return zzegVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() {
        boolean z10;
        Object obj = this.zzb;
        boolean zZzn = zzn();
        synchronized (obj) {
            z10 = false;
            if (!zZzn) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzq() {
        zzw("stop", null);
    }

    public final void zzr() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzx(i10, 3, z10, z10);
    }

    public final void zzs(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            try {
                z11 = true;
                if (f11 == this.zzi && f12 == this.zzk) {
                    z11 = false;
                }
                this.zzi = f11;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznO)).booleanValue()) {
                    this.zzj = f10;
                }
                z12 = this.zzh;
                this.zzh = z10;
                i11 = this.zze;
                this.zze = i10;
                float f13 = this.zzk;
                this.zzk = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.zza.zzE().invalidate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            try {
                zzbjq zzbjqVar = this.zzn;
                if (zzbjqVar != null) {
                    zzbjqVar.zze();
                }
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzx(i11, i10, z12, z10);
    }

    public final /* synthetic */ void zzt(Map map) {
        this.zza.zze("pubVideoCmd", map);
    }

    public final /* synthetic */ void zzu(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        com.google.android.gms.ads.internal.client.zzeg zzegVar;
        com.google.android.gms.ads.internal.client.zzeg zzegVar2;
        com.google.android.gms.ads.internal.client.zzeg zzegVar3;
        synchronized (this.zzb) {
            try {
                boolean z14 = this.zzg;
                if (z14 || i11 != 1) {
                    i12 = i11;
                    z12 = false;
                } else {
                    i11 = 1;
                    i12 = 1;
                    z12 = true;
                }
                boolean z15 = i10 != i11;
                if (z15 && i12 == 1) {
                    z13 = true;
                    i12 = 1;
                } else {
                    z13 = false;
                }
                boolean z16 = z15 && i12 == 2;
                boolean z17 = z15 && i12 == 3;
                this.zzg = z14 || z12;
                if (z12) {
                    try {
                        com.google.android.gms.ads.internal.client.zzeg zzegVar4 = this.zzf;
                        if (zzegVar4 != null) {
                            zzegVar4.zze();
                        }
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                    }
                }
                if (z13 && (zzegVar3 = this.zzf) != null) {
                    zzegVar3.zzf();
                }
                if (z16 && (zzegVar2 = this.zzf) != null) {
                    zzegVar2.zzg();
                }
                if (z17) {
                    com.google.android.gms.ads.internal.client.zzeg zzegVar5 = this.zzf;
                    if (zzegVar5 != null) {
                        zzegVar5.zzh();
                    }
                    this.zza.zzz();
                }
                if (z10 != z11 && (zzegVar = this.zzf) != null) {
                    zzegVar.zzi(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzv(zzbjq zzbjqVar) {
        synchronized (this.zzb) {
            this.zzn = zzbjqVar;
        }
    }
}
