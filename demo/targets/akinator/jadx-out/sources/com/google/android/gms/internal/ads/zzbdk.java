package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbdk extends PushbackInputStream {
    final /* synthetic */ zzbdn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbdk(zzbdn zzbdnVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbdnVar);
        this.zza = zzbdnVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.zza.zzc.zzb();
        super.close();
    }
}
