package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaaw implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzabx zze;
    private final zzdc zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzabb zzi;
    private zzel zzj = new zzel(10);
    private zzv zzk;
    private zzdm zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    public /* synthetic */ zzaaw(zzaao zzaaoVar, byte[] bArr) {
        this.zza = zzaaoVar.zze();
        zzbs zzbsVarZzg = zzaaoVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzgpe.zzi();
        this.zzd = zzaaoVar.zzh();
        zzdc zzdcVarZzi = zzaaoVar.zzi();
        this.zzf = zzdcVarZzi;
        this.zzh = zzaaoVar.zzj() != C.TIME_UNSET ? -zzaaoVar.zzj() : -9223372036854775807L;
        zzabb zzabbVarZzk = zzaaoVar.zzk();
        this.zzi = zzabbVarZzk;
        this.zze = new zzaab(zzaaoVar.zzf(), zzabbVarZzk, zzdcVarZzi);
        new zzaan(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzM();
        this.zzp = C.TIME_UNSET;
        this.zzq = C.TIME_UNSET;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final /* synthetic */ void zzA(long j10) {
        this.zzq = j10;
    }

    public final void zza(int i10) {
        this.zzr = 1;
    }

    public final zzabx zzb(int i10) {
        SparseArray sparseArray = this.zzc;
        if (zzep.zza(sparseArray, 0)) {
            return (zzabx) sparseArray.get(0);
        }
        zzaaq zzaaqVar = new zzaaq(this, this.zza, 0);
        this.zzg.add(zzaaqVar);
        sparseArray.put(0, zzaaqVar);
        return zzaaqVar;
    }

    public final void zzc(Surface surface, zzeh zzehVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzeh) this.zzm.second).equals(zzehVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzehVar);
        zzehVar.zza();
        zzehVar.zzb();
    }

    public final void zzd() {
        zzeh zzehVar = zzeh.zza;
        zzehVar.zza();
        zzehVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdm zzdmVar = this.zzl;
        if (zzdmVar != null) {
            zzdmVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: zzdj -> 0x0033, TRY_LEAVE, TryCatch #0 {zzdj -> 0x0033, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0025, B:18:0x0036, B:20:0x003c, B:23:0x0043, B:28:0x0067), top: B:38:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ boolean zzi(com.google.android.gms.internal.ads.zzv r12, int r13) throws com.google.android.gms.internal.ads.zzabw {
        /*
            r11 = this;
            java.lang.String r13 = "Color transfer "
            int r0 = r11.zzo
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.gms.internal.ads.zzgmd.zzh(r0)
            com.google.android.gms.internal.ads.zzi r0 = r12.zzE
            com.google.android.gms.internal.ads.zzi r0 = zzC(r0)
            int r1 = r0.zzd     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            r2 = 7
            if (r1 != r2) goto L36
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            r3 = 34
            if (r1 >= r3) goto L23
            boolean r1 = com.google.android.gms.internal.ads.zzdk.zzd()     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            if (r1 != 0) goto L25
        L23:
            r1 = r2
            goto L36
        L25:
            com.google.android.gms.internal.ads.zzh r13 = r0.zzd()     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            r0 = 6
            r13.zzc(r0)     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            com.google.android.gms.internal.ads.zzi r0 = r13.zzg()     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
        L31:
            r3 = r0
            goto L6a
        L33:
            r0 = move-exception
            r13 = r0
            goto L98
        L36:
            boolean r2 = com.google.android.gms.internal.ads.zzdk.zzc(r1)     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            if (r2 != 0) goto L60
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            r3 = 29
            if (r2 >= r3) goto L43
            goto L60
        L43:
            java.lang.String r0 = "PlaybackVidGraphWrapper"
            java.lang.String r2 = com.google.android.gms.internal.ads.zzep.zza     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            java.util.Locale r2 = java.util.Locale.US     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            r2.<init>(r13)     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            r2.append(r1)     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            java.lang.String r13 = " is not supported. Falling back to OpenGl tone mapping."
            r2.append(r13)     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            java.lang.String r13 = r2.toString()     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            com.google.android.gms.internal.ads.zzdt.zzc(r0, r13)     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            com.google.android.gms.internal.ads.zzi r0 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            goto L31
        L60:
            r13 = 2
            if (r1 == r13) goto L67
            r13 = 10
            if (r1 != r13) goto L31
        L67:
            com.google.android.gms.internal.ads.zzi r0 = com.google.android.gms.internal.ads.zzi.zza     // Catch: com.google.android.gms.internal.ads.zzdj -> L33
            goto L31
        L6a:
            com.google.android.gms.internal.ads.zzdc r13 = r11.zzf
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r10 = 0
            com.google.android.gms.internal.ads.zzdm r13 = r13.zzd(r0, r10)
            r11.zzl = r13
            com.google.android.gms.internal.ads.zzbs r1 = r11.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            android.content.Context r2 = r11.zza     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            com.google.android.gms.internal.ads.zzl r4 = com.google.android.gms.internal.ads.zzl.zzb     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            java.util.Objects.requireNonNull(r13)     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            com.google.android.gms.internal.ads.zzaap r6 = new com.google.android.gms.internal.ads.zzaap     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            r6.<init>()     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            r7 = 0
            r9 = 0
            r5 = r11
            r1.zza(r2, r3, r4, r5, r6, r7, r9)     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
            throw r10     // Catch: com.google.android.gms.internal.ads.zzbo -> L90
        L90:
            r0 = move-exception
            r13 = r0
            com.google.android.gms.internal.ads.zzabw r0 = new com.google.android.gms.internal.ads.zzabw
            r0.<init>(r13, r12)
            throw r0
        L98:
            com.google.android.gms.internal.ads.zzabw r0 = new com.google.android.gms.internal.ads.zzabw
            r0.<init>(r13, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaw.zzi(com.google.android.gms.internal.ads.zzv, int):boolean");
    }

    public final /* synthetic */ boolean zzj(boolean z10) {
        return this.zze.zzh(false);
    }

    public final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    public final /* synthetic */ void zzl(long j10, long j11) throws zzabw {
        this.zze.zzv(j10, j11);
    }

    public final /* synthetic */ void zzm(boolean z10) {
        if (this.zzo == 1) {
            this.zzn++;
            zzabx zzabxVar = this.zze;
            zzabxVar.zzg(z10);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzaav zzaavVar = (zzaav) this.zzj.zzd();
                zzaavVar.getClass();
                zzabxVar.zzs(1, this.zzk, zzaavVar.zza, zzaavVar.zzb, zzgpe.zzi());
            }
            this.zzp = C.TIME_UNSET;
            this.zzq = C.TIME_UNSET;
            zzdm zzdmVar = this.zzl;
            zzdmVar.getClass();
            zzdmVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaar
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final /* synthetic */ void zzn(boolean z10) {
        this.zze.zzw(z10);
    }

    public final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    public final /* synthetic */ void zzp(zzaax zzaaxVar) {
        this.zze.zzl(zzaaxVar);
    }

    public final /* synthetic */ void zzq(float f10) {
        this.zzi.zzc(f10);
        this.zze.zzm(f10);
    }

    public final /* synthetic */ void zzr(int i10) {
        this.zze.zzr(i10);
    }

    public final /* synthetic */ boolean zzs() {
        int i10 = this.zzr;
        return i10 != -1 && i10 == 0;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    public final /* synthetic */ long zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzabb zzv() {
        return this.zzi;
    }

    public final /* synthetic */ zzel zzw() {
        return this.zzj;
    }

    public final /* synthetic */ void zzx(zzel zzelVar) {
        this.zzj = zzelVar;
    }

    public final /* synthetic */ long zzy() {
        return this.zzp;
    }

    public final /* synthetic */ long zzz() {
        return this.zzq;
    }
}
