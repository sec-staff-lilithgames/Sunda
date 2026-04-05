package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeaq implements zzifh {
    private final zzifq zza;

    private zzeaq(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzeaq zzc(zzifq zzifqVar) {
        return new zzeaq(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcjv) this.zza).zza().getPackageName();
        zzifp.zzb(packageName);
        return packageName;
    }
}
