package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzvp implements zzzj, zzuj {
    final /* synthetic */ zzvy zza;
    private final long zzb;
    private final Uri zzc;
    private final zzgy zzd;
    private final zzvn zze;
    private final zzadd zzf;
    private final zzdf zzg;
    private final zzaea zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzgf zzl;
    private zzaem zzm;
    private boolean zzn;

    public zzvp(zzvy zzvyVar, Uri uri, zzgb zzgbVar, zzvn zzvnVar, zzadd zzaddVar, zzdf zzdfVar) {
        Objects.requireNonNull(zzvyVar);
        this.zza = zzvyVar;
        this.zzc = uri;
        this.zzd = new zzgy(zzgbVar);
        this.zze = zzvnVar;
        this.zzf = zzaddVar;
        this.zzg = zzdfVar;
        this.zzh = new zzaea();
        this.zzj = true;
        this.zzb = zzul.zza();
        this.zzl = zzi(0L);
    }

    private final zzgf zzi(long j10) {
        zzge zzgeVar = new zzge();
        zzgeVar.zza(this.zzc);
        zzgeVar.zzc(j10);
        zzgeVar.zzd(6);
        zzgeVar.zzb(zzvy.zzb);
        return zzgeVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zza(zzeg zzegVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzegVar.zzd();
        zzaem zzaemVar = this.zzm;
        zzaemVar.getClass();
        zzaemVar.zzz(zzegVar, iZzd);
        zzaemVar.zzx(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzzj
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[LOOP:0: B:3:0x0002->B:126:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01df A[EDGE_INSN: B:128:0x01df->B:88:0x01df BREAK  A[LOOP:1: B:75:0x01a6->B:130:0x01a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:23:0x0060, B:24:0x0066, B:34:0x00a4, B:36:0x00af, B:38:0x00bb, B:40:0x00c5, B:42:0x00d1, B:44:0x00db, B:46:0x00e7, B:48:0x00f1, B:50:0x0103, B:52:0x010d, B:53:0x0113, B:61:0x014c, B:62:0x0153, B:64:0x0160, B:66:0x0169, B:68:0x0184, B:70:0x0197, B:71:0x019a, B:73:0x019e, B:56:0x011d, B:59:0x013d, B:28:0x0072, B:33:0x0096), top: B:113:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5 A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:23:0x0060, B:24:0x0066, B:34:0x00a4, B:36:0x00af, B:38:0x00bb, B:40:0x00c5, B:42:0x00d1, B:44:0x00db, B:46:0x00e7, B:48:0x00f1, B:50:0x0103, B:52:0x010d, B:53:0x0113, B:61:0x014c, B:62:0x0153, B:64:0x0160, B:66:0x0169, B:68:0x0184, B:70:0x0197, B:71:0x019a, B:73:0x019e, B:56:0x011d, B:59:0x013d, B:28:0x0072, B:33:0x0096), top: B:113:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:23:0x0060, B:24:0x0066, B:34:0x00a4, B:36:0x00af, B:38:0x00bb, B:40:0x00c5, B:42:0x00d1, B:44:0x00db, B:46:0x00e7, B:48:0x00f1, B:50:0x0103, B:52:0x010d, B:53:0x0113, B:61:0x014c, B:62:0x0153, B:64:0x0160, B:66:0x0169, B:68:0x0184, B:70:0x0197, B:71:0x019a, B:73:0x019e, B:56:0x011d, B:59:0x013d, B:28:0x0072, B:33:0x0096), top: B:113:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1 A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:23:0x0060, B:24:0x0066, B:34:0x00a4, B:36:0x00af, B:38:0x00bb, B:40:0x00c5, B:42:0x00d1, B:44:0x00db, B:46:0x00e7, B:48:0x00f1, B:50:0x0103, B:52:0x010d, B:53:0x0113, B:61:0x014c, B:62:0x0153, B:64:0x0160, B:66:0x0169, B:68:0x0184, B:70:0x0197, B:71:0x019a, B:73:0x019e, B:56:0x011d, B:59:0x013d, B:28:0x0072, B:33:0x0096), top: B:113:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #3 {all -> 0x0092, blocks: (B:23:0x0060, B:24:0x0066, B:34:0x00a4, B:36:0x00af, B:38:0x00bb, B:40:0x00c5, B:42:0x00d1, B:44:0x00db, B:46:0x00e7, B:48:0x00f1, B:50:0x0103, B:52:0x010d, B:53:0x0113, B:61:0x014c, B:62:0x0153, B:64:0x0160, B:66:0x0169, B:68:0x0184, B:70:0x0197, B:71:0x019a, B:73:0x019e, B:56:0x011d, B:59:0x013d, B:28:0x0072, B:33:0x0096), top: B:113:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:23:0x0060, B:24:0x0066, B:34:0x00a4, B:36:0x00af, B:38:0x00bb, B:40:0x00c5, B:42:0x00d1, B:44:0x00db, B:46:0x00e7, B:48:0x00f1, B:50:0x0103, B:52:0x010d, B:53:0x0113, B:61:0x014c, B:62:0x0153, B:64:0x0160, B:66:0x0169, B:68:0x0184, B:70:0x0197, B:71:0x019a, B:73:0x019e, B:56:0x011d, B:59:0x013d, B:28:0x0072, B:33:0x0096), top: B:113:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160 A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:23:0x0060, B:24:0x0066, B:34:0x00a4, B:36:0x00af, B:38:0x00bb, B:40:0x00c5, B:42:0x00d1, B:44:0x00db, B:46:0x00e7, B:48:0x00f1, B:50:0x0103, B:52:0x010d, B:53:0x0113, B:61:0x014c, B:62:0x0153, B:64:0x0160, B:66:0x0169, B:68:0x0184, B:70:0x0197, B:71:0x019a, B:73:0x019e, B:56:0x011d, B:59:0x013d, B:28:0x0072, B:33:0x0096), top: B:113:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197 A[Catch: all -> 0x0092, TryCatch #3 {all -> 0x0092, blocks: (B:23:0x0060, B:24:0x0066, B:34:0x00a4, B:36:0x00af, B:38:0x00bb, B:40:0x00c5, B:42:0x00d1, B:44:0x00db, B:46:0x00e7, B:48:0x00f1, B:50:0x0103, B:52:0x010d, B:53:0x0113, B:61:0x014c, B:62:0x0153, B:64:0x0160, B:66:0x0169, B:68:0x0184, B:70:0x0197, B:71:0x019a, B:73:0x019e, B:56:0x011d, B:59:0x013d, B:28:0x0072, B:33:0x0096), top: B:113:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #3 {all -> 0x0092, blocks: (B:23:0x0060, B:24:0x0066, B:34:0x00a4, B:36:0x00af, B:38:0x00bb, B:40:0x00c5, B:42:0x00d1, B:44:0x00db, B:46:0x00e7, B:48:0x00f1, B:50:0x0103, B:52:0x010d, B:53:0x0113, B:61:0x014c, B:62:0x0153, B:64:0x0160, B:66:0x0169, B:68:0x0184, B:70:0x0197, B:71:0x019a, B:73:0x019e, B:56:0x011d, B:59:0x013d, B:28:0x0072, B:33:0x0096), top: B:113:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fc  */
    @Override // com.google.android.gms.internal.ads.zzzj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvp.zzc():void");
    }

    public final /* synthetic */ void zzd(long j10, long j11) {
        this.zzh.zza = j10;
        this.zzk = j11;
        this.zzj = true;
        this.zzn = false;
    }

    public final /* synthetic */ long zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzgy zzf() {
        return this.zzd;
    }

    public final /* synthetic */ long zzg() {
        return this.zzk;
    }

    public final /* synthetic */ zzgf zzh() {
        return this.zzl;
    }
}
