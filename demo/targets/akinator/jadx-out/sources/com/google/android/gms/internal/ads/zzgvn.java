package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgvn implements zzgwf {
    private final InputStream zza;

    private zzgvn(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzgwf zza(byte[] bArr) {
        return new zzgvn(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    public final zzhlg zzb() throws IOException {
        try {
            return zzhlg.zzg(this.zza, zzhvy.zza());
        } finally {
            this.zza.close();
        }
    }
}
