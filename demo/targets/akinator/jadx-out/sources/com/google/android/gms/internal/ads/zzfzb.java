package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfzb implements zzfzg {
    private final byte[] zza;

    public zzfzb(byte[] bArr) {
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzgsd.zza(inputStream);
        } catch (IOException e10) {
            throw new zzfzc("Cannot read bytes.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
