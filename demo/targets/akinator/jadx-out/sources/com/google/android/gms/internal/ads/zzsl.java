package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import z.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzsl extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzsu zzo;
    private final Object zza = new Object();
    private final j zzd = new j();
    private final j zze = new j();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzsl(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    private final void zzi() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final boolean zzj() {
        return this.zzl > 0 || this.zzm;
    }

    private final void zzk(MediaFormat mediaFormat) {
        this.zze.addLast(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzl() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.zza) {
            try {
                this.zzd.addLast(i10);
                zzsu zzsuVar = this.zzo;
                if (zzsuVar != null) {
                    zzte zzteVar = ((zztc) zzsuVar).zza;
                    if (zzteVar.zzbe() != null) {
                        zzteVar.zzbe().zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzk(mediaFormat);
                    this.zzi = null;
                }
                this.zze.addLast(i10);
                this.zzf.add(bufferInfo);
                zzsu zzsuVar = this.zzo;
                if (zzsuVar != null) {
                    zzte zzteVar = ((zztc) zzsuVar).zza;
                    if (zzteVar.zzbe() != null) {
                        zzteVar.zzbe().zza();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzk(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzgmd.zzh(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzi();
        }
    }

    public final int zzc() {
        synchronized (this.zza) {
            try {
                zzl();
                int iPopFirst = -1;
                if (zzj()) {
                    return -1;
                }
                j jVar = this.zzd;
                if (!jVar.isEmpty()) {
                    iPopFirst = jVar.popFirst();
                }
                return iPopFirst;
            } finally {
            }
        }
    }

    public final int zzd(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzl();
                if (zzj()) {
                    return -1;
                }
                j jVar = this.zze;
                if (jVar.isEmpty()) {
                    return -1;
                }
                int iPopFirst = jVar.popFirst();
                if (iPopFirst >= 0) {
                    if (this.zzh == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iPopFirst == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    iPopFirst = -2;
                }
                return iPopFirst;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final MediaFormat zze() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public final void zzf() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzep.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    public final void zzg(zzsu zzsuVar) {
        synchronized (this.zza) {
            this.zzo = zzsuVar;
        }
    }

    public final /* synthetic */ void zzh() {
        Object obj = this.zza;
        synchronized (obj) {
            try {
                if (this.zzm) {
                    return;
                }
                long j10 = this.zzl - 1;
                this.zzl = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 >= 0) {
                    zzi();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.zzn = illegalStateException;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
