package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzekt implements zzguf {
    final /* synthetic */ long zza;
    final /* synthetic */ zzffx zzb;
    final /* synthetic */ zzffu zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfnc zze;
    final /* synthetic */ zzfgf zzf;
    final /* synthetic */ zzekv zzg;

    public zzekt(zzekv zzekvVar, long j10, zzffx zzffxVar, zzffu zzffuVar, String str, zzfnc zzfncVar, zzfgf zzfgfVar) {
        this.zza = j10;
        this.zzb = zzffxVar;
        this.zzc = zzffuVar;
        this.zzd = str;
        this.zze = zzfncVar;
        this.zzf = zzfgfVar;
        Objects.requireNonNull(zzekvVar);
        this.zzg = zzekvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzguf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekt.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zzb(Object obj) {
        long j10;
        zzekv zzekvVar = this.zzg;
        long jElapsedRealtime = zzekvVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzekvVar) {
            try {
                if (zzekvVar.zzn()) {
                    j10 = jElapsedRealtime;
                    zzekvVar.zzk().zza(this.zzb, this.zzc, 0, null, j10);
                } else {
                    j10 = jElapsedRealtime;
                }
                if (zzekvVar.zzp()) {
                    return;
                }
                zzffu zzffuVar = this.zzc;
                if (zzekvVar.zzi(zzffuVar)) {
                    ((zzeku) zzekvVar.zzm().get(zzffuVar)).zzd = j10;
                } else {
                    long j11 = j10;
                    j10 = j11;
                    zzekvVar.zzm().put(zzffuVar, new zzeku(this.zzd, zzffuVar.zzaf, 0, j11, null));
                }
                zzekvVar.zzo().zzd(zzffuVar, j10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
