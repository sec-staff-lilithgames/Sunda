package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhxe extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    public zzhxe(Iterable iterable) {
        this.zza = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzc++;
        }
        this.zzd = -1;
        if (zza()) {
            return;
        }
        this.zzb = zzhxb.zzc;
        this.zzd = 0;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final boolean zza() {
        ByteBuffer byteBuffer;
        do {
            this.zzd++;
            if (!this.zza.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.zza.next();
            this.zzb = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.zze = this.zzb.position();
        if (this.zzb.hasArray()) {
            this.zzf = true;
            this.zzg = this.zzb.array();
            this.zzh = this.zzb.arrayOffset();
        } else {
            this.zzf = false;
            this.zzi = zzhzj.zzs(this.zzb);
            this.zzg = null;
        }
        return true;
    }

    private final void zzb(int i10) {
        int i11 = this.zze + i10;
        this.zze = i11;
        if (i11 == this.zzb.limit()) {
            zza();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            int i10 = this.zzg[this.zze + this.zzh] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            zzb(1);
            return i10;
        }
        int iZzr = zzhzj.zzr(this.zze + this.zzi) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        zzb(1);
        return iZzr;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int iLimit = this.zzb.limit();
        int i12 = this.zze;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i12 + this.zzh, bArr, i10, i11);
            zzb(i11);
            return i11;
        }
        int iPosition = this.zzb.position();
        this.zzb.position(this.zze);
        this.zzb.get(bArr, i10, i11);
        this.zzb.position(iPosition);
        zzb(i11);
        return i11;
    }
}
