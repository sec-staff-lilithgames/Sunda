package com.google.android.gms.internal.ads;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzewx implements zzeya {
    private final String zza;
    private final int zzb;

    public zzewx(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return zzgui.zza(new zzewy(this.zza, this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 31;
    }
}
