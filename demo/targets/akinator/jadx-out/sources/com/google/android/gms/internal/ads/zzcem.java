package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcem implements zziet {
    private final ByteBuffer zza;

    public zzcem(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final int zza(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final long zzb() throws IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final long zzc() throws IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final void zzd(long j10) throws IOException {
        this.zza.position((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.zziet
    public final ByteBuffer zze(long j10, long j11) throws IOException {
        ByteBuffer byteBuffer = this.zza;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j11);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
