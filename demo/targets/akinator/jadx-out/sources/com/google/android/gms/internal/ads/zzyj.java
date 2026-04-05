package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzyj {
    public final zzbg zza;
    public final int[] zzb;

    public zzyj(zzbg zzbgVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzdt.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbgVar;
        this.zzb = iArr;
    }
}
