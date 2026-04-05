package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zztw implements zzvn {
    private final zzadg zza;
    private zzada zzb;
    private zzadb zzc;

    public zztw(zzadg zzadgVar) {
        this.zza = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zza(zzj zzjVar, Uri uri, Map map, long j10, long j11, zzadd zzaddVar) throws IOException {
        zzacr zzacrVar = new zzacr(zzjVar, j10, j11);
        this.zzc = zzacrVar;
        if (this.zzb != null) {
            return;
        }
        zzada[] zzadaVarArrZzb = this.zza.zzb(uri, map);
        int length = zzadaVarArrZzb.length;
        zzgpb zzgpbVarZzv = zzgpe.zzv(length);
        if (length == 1) {
            this.zzb = zzadaVarArrZzb[0];
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                zzada zzadaVar = zzadaVarArrZzb[i10];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzacrVar.zzn() == j10) {
                    }
                } catch (Throwable th2) {
                    zzgmd.zzh(this.zzb != null || zzacrVar.zzn() == j10);
                    zzacrVar.zzl();
                    throw th2;
                }
                if (zzadaVar.zza(zzacrVar)) {
                    this.zzb = zzadaVar;
                    zzgmd.zzh(true);
                    zzacrVar.zzl();
                    break;
                } else {
                    zzgpbVarZzv.zzh(zzadaVar.zzb());
                    boolean z10 = this.zzb != null || zzacrVar.zzn() == j10;
                    zzgmd.zzh(z10);
                    zzacrVar.zzl();
                    i10++;
                }
            }
            if (this.zzb == null) {
                String strZzd = zzglx.zzd(zzgqe.zzc(zzgpe.zzr(zzadaVarArrZzb), zztv.zza), ", ");
                throw new zzww(a.b.o(new StringBuilder(strZzd.length() + 58), "None of the available extractors (", strZzd, ") could read the stream."), uri, zzgpbVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzaddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzb() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzc() {
        zzada zzadaVar = this.zzb;
        if (zzadaVar != null && (zzadaVar instanceof zzahs)) {
            ((zzahs) zzadaVar).zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final long zzd() {
        zzadb zzadbVar = this.zzc;
        if (zzadbVar != null) {
            return zzadbVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zze(long j10, long j11) {
        zzada zzadaVar = this.zzb;
        zzadaVar.getClass();
        zzadaVar.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final int zzf(zzaea zzaeaVar) throws IOException {
        zzadb zzadbVar;
        zzada zzadaVar = this.zzb;
        if (zzadaVar == null || (zzadbVar = this.zzc) == null) {
            throw null;
        }
        return zzadaVar.zzd(zzadbVar, zzaeaVar);
    }
}
