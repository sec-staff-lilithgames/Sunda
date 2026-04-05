package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhvn {
    private static volatile int zza = 100;
    public static final /* synthetic */ int zzf = 0;
    int zzb;
    int zzc;
    final int zzd = zza;
    Object zze;

    private zzhvn() {
    }

    public static zzhvn zzF(InputStream inputStream, int i10) {
        if (inputStream != null) {
            return new zzhvl(inputStream, 4096, null);
        }
        byte[] bArr = zzhxb.zzb;
        int length = bArr.length;
        return zzG(bArr, 0, 0, false);
    }

    public static zzhvn zzG(byte[] bArr, int i10, int i11, boolean z10) {
        zzhvj zzhvjVar = new zzhvj(bArr, i10, i11, z10, null);
        try {
            zzhvjVar.zzz(i11);
            return zzhvjVar;
        } catch (zzhxd e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zzK(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzL(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static int zzM(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw new zzhxd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw new zzhxd("CodedInputStream encountered a malformed varint.");
    }

    public abstract void zzA(int i10);

    public abstract boolean zzB() throws IOException;

    public abstract int zzC();

    public final void zzH() throws zzhxd {
        if (this.zzb + this.zzc >= this.zzd) {
            throw new zzhxd("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzI() throws zzhxd {
        if (this.zzc == 0) {
            zzb(0);
        }
    }

    public final void zzJ() throws IOException {
        int iZza;
        do {
            iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzH();
            this.zzc++;
            this.zzc--;
        } while (zzc(iZza));
    }

    public abstract int zza() throws IOException;

    public abstract void zzb(int i10) throws zzhxd;

    public abstract boolean zzc(int i10) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzhvi zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract int zzz(int i10) throws zzhxd;

    public /* synthetic */ zzhvn(byte[] bArr) {
    }
}
