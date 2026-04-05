package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfaj implements zzifh {
    private final zzfaf zza;

    private zzfaj(zzfaf zzfafVar) {
        this.zza = zzfafVar;
    }

    public static zzfaj zzc(zzfaf zzfafVar) {
        return new zzfaj(zzfafVar);
    }

    public static boolean zzd(zzfaf zzfafVar) {
        return zzfafVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzg());
    }
}
