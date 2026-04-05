package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfyx implements zzfyr {
    private final int zza;
    private final byte[] zzb;

    public zzfyx(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfyr
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
