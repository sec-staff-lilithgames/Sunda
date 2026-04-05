package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzrp extends zzch {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzep.zzb;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzcg
    public final long zza(long j10) {
        return Math.max(0L, j10 - zzep.zzr(this.zze + this.zzd, this.zzb.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zzd(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.zzg);
        this.zzj += iMin / this.zzb.zze;
        this.zzg -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.zzg <= 0) {
            int i11 = i10 - iMin;
            int length = (this.zzi + i11) - this.zzh.length;
            ByteBuffer byteBufferZzk = zzk(length);
            int i12 = this.zzi;
            String str = zzep.zza;
            int iMax = Math.max(0, Math.min(length, i12));
            byteBufferZzk.put(this.zzh, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i11));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferZzk.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i13 = i11 - iMax2;
            int i14 = this.zzi - iMax;
            this.zzi = i14;
            byte[] bArr = this.zzh;
            System.arraycopy(bArr, iMax, bArr, 0, i14);
            byteBuffer.get(this.zzh, this.zzi, i13);
            this.zzi += i13;
            byteBufferZzk.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch, com.google.android.gms.internal.ads.zzcg
    public final ByteBuffer zzf() {
        int i10;
        if (super.zzg() && (i10 = this.zzi) > 0) {
            zzk(i10).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzch, com.google.android.gms.internal.ads.zzcg
    public final boolean zzg() {
        return super.zzg() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzcd zzm(zzcd zzcdVar) throws zzcf {
        if (!zzep.zzA(zzcdVar.zzd)) {
            throw new zzcf("Unhandled input format:", zzcdVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzcd.zza : zzcdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzn() {
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += r0 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzo() {
        if (this.zzf) {
            this.zzf = false;
            int i10 = this.zze;
            int i11 = this.zzb.zze;
            this.zzh = new byte[i10 * i11];
            this.zzg = this.zzd * i11;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzp() {
        this.zzh = zzep.zzb;
    }

    public final void zzq(int i10, int i11) {
        this.zzd = i10;
        this.zze = i11;
    }

    public final void zzr() {
        this.zzj = 0L;
    }

    public final long zzs() {
        return this.zzj;
    }
}
