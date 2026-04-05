package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcj implements zzcg {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcd zze;
    private zzcd zzf;
    private zzcd zzg;
    private zzcd zzh;
    private boolean zzi;
    private zzci zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzcj() {
        zzcd zzcdVar = zzcd.zza;
        this.zze = zzcdVar;
        this.zzf = zzcdVar;
        this.zzg = zzcdVar;
        this.zzh = zzcdVar;
        ByteBuffer byteBuffer = zzcg.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zza(long j10) {
        long j11 = this.zzo;
        if (j11 < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (j10 / this.zzc);
        }
        long j12 = this.zzn;
        this.zzj.getClass();
        long jZza = j12 - r4.zza();
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        return i10 == i11 ? zzep.zzt(j10, j11, jZza, RoundingMode.DOWN) : zzep.zzt(j10, j11 * i11, jZza * i10, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcd zzb(zzcd zzcdVar) throws zzcf {
        if (zzcdVar.zzd != 2) {
            throw new zzcf("Unhandled input format:", zzcdVar);
        }
        int i10 = this.zzb;
        if (i10 == -1) {
            i10 = zzcdVar.zzb;
        }
        this.zze = zzcdVar;
        zzcd zzcdVar2 = new zzcd(i10, zzcdVar.zzc, 2);
        this.zzf = zzcdVar2;
        this.zzi = true;
        return zzcdVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzc() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzd(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzci zzciVar = this.zzj;
            zzciVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += iRemaining;
            zzciVar.zzb(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze() {
        zzci zzciVar = this.zzj;
        if (zzciVar != null) {
            zzciVar.zzd();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final ByteBuffer zzf() {
        int iZzf;
        zzci zzciVar = this.zzj;
        if (zzciVar != null && (iZzf = zzciVar.zzf()) > 0) {
            if (this.zzk.capacity() < iZzf) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZzf).order(ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzciVar.zzc(this.zzl);
            this.zzo += iZzf;
            this.zzk.limit(iZzf);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzcg.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final boolean zzg() {
        if (!this.zzp) {
            return false;
        }
        zzci zzciVar = this.zzj;
        return zzciVar == null || zzciVar.zzf() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzi(zzce zzceVar) {
        if (zzc()) {
            zzcd zzcdVar = this.zze;
            this.zzg = zzcdVar;
            zzcd zzcdVar2 = this.zzf;
            this.zzh = zzcdVar2;
            if (this.zzi) {
                this.zzj = new zzci(zzcdVar.zzb, zzcdVar.zzc, this.zzc, this.zzd, zzcdVar2.zzb);
            } else {
                zzci zzciVar = this.zzj;
                if (zzciVar != null) {
                    zzciVar.zze();
                }
            }
        }
        this.zzm = zzcg.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzj() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcd zzcdVar = zzcd.zza;
        this.zze = zzcdVar;
        this.zzf = zzcdVar;
        this.zzg = zzcdVar;
        this.zzh = zzcdVar;
        ByteBuffer byteBuffer = zzcg.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    public final void zzk(float f10) {
        zzgmd.zza(f10 > 0.0f);
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }

    public final void zzl(float f10) {
        zzgmd.zza(f10 > 0.0f);
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final long zzm(long j10) {
        long j11 = this.zzo;
        if (j11 < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.zzc * j10);
        }
        long j12 = this.zzn;
        this.zzj.getClass();
        long jZza = j12 - r2.zza();
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        return i10 == i11 ? zzep.zzt(j10, jZza, j11, RoundingMode.DOWN) : zzep.zzt(j10, jZza * i10, j11 * i11, RoundingMode.DOWN);
    }
}
