package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaaa {
    final /* synthetic */ zzaab zza;
    private zzv zzb;

    public /* synthetic */ zzaaa(zzaab zzaabVar, byte[] bArr) {
        Objects.requireNonNull(zzaabVar);
        this.zza = zzaabVar;
    }

    public final void zza(final zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzt(zzbvVar.zzb);
        zztVar.zzu(zzbvVar.zzc);
        zztVar.zzm("video/raw");
        this.zzb = zztVar.zzM();
        this.zza.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j10, long j11, boolean z10) {
        if (z10) {
            zzaab zzaabVar = this.zza;
            if (zzaabVar.zzA() != null) {
                zzaabVar.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zza.zzB().zzb();
                    }
                });
            }
        }
        zzv zzvVarZzM = this.zzb;
        if (zzvVarZzM == null) {
            zzvVarZzM = new zzt().zzM();
        }
        zzv zzvVar = zzvVarZzM;
        zzaab zzaabVar2 = this.zza;
        zzaabVar2.zzD().zzcS(j11, j10, zzvVar, null);
        ((zzabv) zzaabVar2.zzz().remove()).zza(j10);
    }
}
