package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzsg implements zzsv {
    private final MediaCodec zza;
    private final zzsl zzb;
    private final zzsw zzc;
    private final zzsr zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zzsg(MediaCodec mediaCodec, HandlerThread handlerThread, zzsw zzswVar, zzsr zzsrVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = new zzsl(handlerThread);
        this.zzc = zzswVar;
        this.zzd = zzsrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zza(int i10, int i11, int i12, long j10, int i13) {
        this.zzc.zzb(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzb(int i10, int i11, zzhe zzheVar, long j10, int i12) {
        this.zzc.zzc(i10, 0, zzheVar, j10, i12);
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
        this.zzc.zzg();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzg();
        return this.zzb.zzd(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final MediaFormat zzg() {
        return this.zzb.zze();
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
        this.zzc.zze();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zzf();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzk() {
        zzsr zzsrVar;
        zzsr zzsrVar2;
        zzsr zzsrVar3;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzf();
                    this.zzb.zzb();
                }
                this.zzf = 2;
                if (this.zze) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30 && i10 < 33) {
                    this.zza.stop();
                }
                if (i10 >= 35 && (zzsrVar3 = this.zzd) != null) {
                    zzsrVar3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            } catch (Throwable th2) {
                if (!this.zze) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.zza.stop();
                    }
                    if (i11 >= 35 && (zzsrVar2 = this.zzd) != null) {
                        zzsrVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (Build.VERSION.SDK_INT >= 35 && (zzsrVar = this.zzd) != null) {
                zzsrVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final boolean zzl(zzsu zzsuVar) {
        this.zzb.zzg(zzsuVar);
        return true;
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
        this.zzc.zzd(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsv
    public final void zzp(int i10) {
        this.zza.setVideoScalingMode(i10);
    }

    public final /* synthetic */ void zzq(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        zzsr zzsrVar;
        zzsl zzslVar = this.zzb;
        MediaCodec mediaCodec = this.zza;
        zzslVar.zza(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        this.zzc.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzsrVar = this.zzd) != null) {
            zzsrVar.zzb(mediaCodec);
        }
        this.zzf = 1;
    }
}
