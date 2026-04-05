package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zztr implements zzsv {
    private final MediaCodec zza;
    private final zzsr zzb;

    public /* synthetic */ zztr(MediaCodec mediaCodec, zzsr zzsrVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzsrVar;
        if (Build.VERSION.SDK_INT < 35 || zzsrVar == null) {
            return;
        }
        zzsrVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zza(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.zza.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzb(int i10, int i11, zzhe zzheVar, long j10, int i12) throws MediaCodec.CryptoException {
        this.zza.queueSecureInputBuffer(i10, 0, zzheVar.zzb(), j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzc(int i10, boolean z10) {
        this.zza.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzd(int i10, long j10) {
        this.zza.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final ByteBuffer zzh(int i10) {
        return this.zza.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final ByteBuffer zzi(int i10) {
        return this.zza.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzj() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzk() {
        zzsr zzsrVar;
        zzsr zzsrVar2;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && i10 < 33) {
                this.zza.stop();
            }
            if (i10 >= 35 && (zzsrVar2 = this.zzb) != null) {
                zzsrVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (zzsrVar = this.zzb) != null) {
                zzsrVar.zzc(this.zza);
            }
            this.zza.release();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzm(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzn() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzo(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzp(int i10) {
        this.zza.setVideoScalingMode(i10);
    }
}
