package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzun extends zzui {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzun(zzbf zzbfVar, Object obj, Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzun zzp(zzak zzakVar) {
        return new zzun(new zzuo(zzakVar), zzbe.zza, zzc);
    }

    public static zzun zzq(zzbf zzbfVar, Object obj, Object obj2) {
        return new zzun(zzbfVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        this.zzb.zzb(i10, zzbeVar, j10);
        if (Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        this.zzb.zzd(i10, zzbdVar, z10);
        if (Objects.equals(zzbdVar.zzb, this.zze) && z10) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i10) {
        Object objZzf = this.zzb.zzf(i10);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final zzun zzr(zzbf zzbfVar) {
        return new zzun(zzbfVar, this.zzd, this.zze);
    }

    public final /* synthetic */ Object zzs() {
        return this.zze;
    }
}
