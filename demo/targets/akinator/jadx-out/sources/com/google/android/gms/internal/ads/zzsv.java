package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzsv {
    void zza(int i10, int i11, int i12, long j10, int i13);

    void zzb(int i10, int i11, zzhe zzheVar, long j10, int i12);

    void zzc(int i10, boolean z10);

    void zzd(int i10, long j10);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    ByteBuffer zzh(int i10);

    ByteBuffer zzi(int i10);

    void zzj();

    void zzk();

    default boolean zzl(zzsu zzsuVar) {
        return false;
    }

    void zzm(Surface surface);

    void zzn();

    void zzo(Bundle bundle);

    void zzp(int i10);
}
