package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcfk extends zzcfe implements zzgz {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcdq zze;
    private boolean zzf;
    private final zzcfj zzg;
    private final zzcen zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcfk(zzcdr zzcdrVar, zzcdq zzcdqVar) {
        super(zzcdrVar);
        this.zze = zzcdqVar;
        this.zzg = new zzcfj();
        this.zzh = new zzcen();
        this.zzk = new Object();
        this.zzl = (String) zzgmb.zzd(zzcdrVar != null ? zzcdrVar.zzn() : null).zza("");
        this.zzm = zzcdrVar != null ? zzcdrVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzx() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round((iPosition / iZza) * iZza2);
        int iZzP = zzcdi.zzP();
        int iZzQ = zzcdi.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzP, iZzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzb(zzgb zzgbVar, zzgf zzgfVar, boolean z10) {
        if (zzgbVar instanceof zzgm) {
            this.zzg.zzb((zzgm) zzgbVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.zzcfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(java.lang.String r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfk.zze(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zza(zzgb zzgbVar, zzgf zzgfVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzd(zzgb zzgbVar, zzgf zzgfVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgz
    public final void zzc(zzgb zzgbVar, zzgf zzgfVar, boolean z10, int i10) {
    }
}
