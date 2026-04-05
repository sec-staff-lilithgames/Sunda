package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcej extends zzccx implements TextureView.SurfaceTextureListener, zzcdh {
    private final zzcdr zzc;
    private final zzcds zzd;
    private final zzcdq zze;
    private final zzdvi zzf;
    private zzccw zzg;
    private Surface zzh;
    private zzcdi zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcdp zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcej(Context context, zzcds zzcdsVar, zzcdr zzcdrVar, boolean z10, boolean z11, zzcdq zzcdqVar, zzdvi zzdviVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcdrVar;
        this.zzd = zzcdsVar;
        this.zzo = z10;
        this.zze = zzcdqVar;
        zzcdsVar.zza(this);
        this.zzf = zzdviVar;
    }

    private final boolean zzT() {
        zzcdi zzcdiVar = this.zzi;
        return (zzcdiVar == null || !zzcdiVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z10, Integer num) {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null && !z10) {
            zzcdiVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z10) {
            if (!zzT()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcdiVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzcfe zzcfeVarZzr = this.zzc.zzr(this.zzj);
            if (zzcfeVarZzr instanceof zzcfn) {
                zzcdi zzcdiVarZza = ((zzcfn) zzcfeVarZzr).zza();
                this.zzi = zzcdiVarZza;
                zzcdiVarZza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcfeVarZzr instanceof zzcfk)) {
                    String strValueOf = String.valueOf(this.zzj);
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                zzcfk zzcfkVar = (zzcfk) zzcfeVarZzr;
                String strZzF = zzF();
                ByteBuffer byteBufferZzu = zzcfkVar.zzu();
                boolean zZzt = zzcfkVar.zzt();
                String strZzs = zzcfkVar.zzs();
                if (strZzs == null) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzcdi zzcdiVarZzE = zzE(num);
                    this.zzi = zzcdiVarZzE;
                    zzcdiVarZzE.zzr(new Uri[]{Uri.parse(strZzs)}, strZzF, byteBufferZzu, zZzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i14 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i14 >= strArr.length) {
                    break;
                }
                uriArr[i14] = Uri.parse(strArr[i14]);
                i14++;
            }
            this.zzi.zzq(uriArr, strZzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int iZzC = this.zzi.zzC();
            this.zzm = iZzC;
            if (iZzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcdi zzcdiVar = this.zzi;
            if (zzcdiVar != null) {
                zzcdiVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z10) {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcdiVar.zzu(surface, z10);
        } catch (IOException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        com.google.android.gms.internal.play_billing.a.B(sb2, str, "/", canonicalName, ":");
        sb2.append(message);
        return sb2.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.zzt != f10) {
            this.zzt = f10;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            zzcdiVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            zzcdiVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzt;
        if (f10 != 0.0f && this.zzn == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcdp zzcdpVar = this.zzn;
        if (zzcdpVar != null) {
            zzcdpVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws InterruptedException {
        zzdvi zzdviVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzon)).booleanValue() && (zzdviVar = this.zzf) != null) {
                zzdvh zzdvhVarZza = zzdviVar.zza();
                zzdvhVarZza.zzc("action", "svp_aepv");
                zzdvhVarZza.zzd();
            }
            zzcdp zzcdpVar = new zzcdp(getContext());
            this.zzn = zzcdpVar;
            zzcdpVar.zzb(surfaceTexture, i10, i11);
            zzcdp zzcdpVar2 = this.zzn;
            zzcdpVar2.start();
            SurfaceTexture surfaceTextureZze = zzcdpVar2.zze();
            if (surfaceTextureZze != null) {
                surfaceTexture = surfaceTextureZze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i10, i11);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzced
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcdp zzcdpVar = this.zzn;
        if (zzcdpVar != null) {
            zzcdpVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        zzcdp zzcdpVar = this.zzn;
        if (zzcdpVar != null) {
            zzcdpVar.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcee
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzN(i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 46);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzP(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzA(int i10) {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            zzcdiVar.zzy(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzB(int i10) {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            zzcdiVar.zzz(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzC(int i10) {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            zzcdiVar.zzA(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        });
    }

    public final zzcdi zzE(Integer num) {
        zzcdq zzcdqVar = this.zze;
        zzcdr zzcdrVar = this.zzc;
        zzcgg zzcggVar = new zzcgg(zzcdrVar.getContext(), zzcdqVar, zzcdrVar, num);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzcggVar;
    }

    public final String zzF() {
        zzcdr zzcdrVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzcdrVar.getContext(), zzcdrVar.zzs().afmaVersion);
    }

    public final /* synthetic */ void zzG() {
        float fZzc = this.zzb.zzc();
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcdiVar.zzv(fZzc, false);
        } catch (IOException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
        }
    }

    public final /* synthetic */ void zzH() {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zzb();
        }
    }

    public final /* synthetic */ void zzI() {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zze();
        }
    }

    public final /* synthetic */ void zzJ(String str) {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzK() {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zzc();
        }
    }

    public final /* synthetic */ void zzL() {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zzd();
        }
    }

    public final /* synthetic */ void zzM() {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zza();
        }
    }

    public final /* synthetic */ void zzN(int i10, int i11) {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zzj(i10, i11);
        }
    }

    public final /* synthetic */ void zzO() {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zzh();
        }
    }

    public final /* synthetic */ void zzP(int i10) {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.onWindowVisibilityChanged(i10);
        }
    }

    public final /* synthetic */ void zzQ(boolean z10, long j10) {
        this.zzc.zzu(z10, j10);
    }

    public final /* synthetic */ void zzR(String str) {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzS() {
        zzccw zzccwVar = this.zzg;
        if (zzccwVar != null) {
            zzccwVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzb(zzccw zzccwVar) {
        this.zzg = zzccwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzc(String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcds zzcdsVar = this.zzd;
        zzcdsVar.zzf();
        this.zzb.zze();
        zzcdsVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcec
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzi(int i10) {
        if (zzU()) {
            this.zzi.zzx(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzj(float f10, float f11) {
        zzcdp zzcdpVar = this.zzn;
        if (zzcdpVar != null) {
            zzcdpVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final long zzm() {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            return zzcdiVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final long zzn() {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            return zzcdiVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final long zzo() {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            return zzcdiVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzp() {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            return zzcdiVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzccx, com.google.android.gms.internal.ads.zzcdu
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcei
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzr(final boolean z10, final long j10) {
        if (this.zzc != null) {
            zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzQ(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzs(int i10) {
        if (this.zzm != i10) {
            this.zzm = i10;
            if (i10 == 3) {
                zzY();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzt(int i10, int i11) {
        this.zzr = i10;
        this.zzs = i11;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzu(String str, Exception exc) {
        final String strZzZ = zzZ(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strZzZ);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcea
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(strZzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdh
    public final void zzv(String str, Exception exc) {
        final String strZzZ = zzZ("onLoadException", exc);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strZzZ);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzR(strZzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final Integer zzw() {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            return zzcdiVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzx(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z10 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z10 = true;
        }
        this.zzj = str;
        zzV(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzy(int i10) {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            zzcdiVar.zzF(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzz(int i10) {
        zzcdi zzcdiVar = this.zzi;
        if (zzcdiVar != null) {
            zzcdiVar.zzG(i10);
        }
    }
}
