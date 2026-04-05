package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzhh extends zzhc {
    public zzv zza;
    public final zzhe zzb = new zzhe();
    public ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    public ByteBuffer zzf;
    private final int zzg;

    static {
        zzal.zzb("media3.decoder");
    }

    public zzhh(int i10, int i11) {
        this.zzg = i10;
    }

    private final ByteBuffer zzm(int i10) {
        int i11 = this.zzg;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.zzc;
        throw new zzhg(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public void zza() {
        super.zza();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzd = false;
    }

    @EnsuresNonNull({"data"})
    public final void zzj(int i10) {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzm(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer byteBufferZzm = zzm(i11);
        byteBufferZzm.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferZzm.put(byteBuffer);
        }
        this.zzc = byteBufferZzm;
    }

    public final boolean zzk() {
        return zzi(1073741824);
    }

    public final void zzl() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
