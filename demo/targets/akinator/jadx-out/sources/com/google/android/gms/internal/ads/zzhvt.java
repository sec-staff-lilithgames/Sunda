package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhvt extends zzhuz {
    private static final Logger zza = Logger.getLogger(zzhvt.class.getName());
    private static final boolean zzb = zzhzj.zza();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zzhvt() {
        throw null;
    }

    public static int zzA(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzB(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhzo.zzc(str);
        } catch (zzhzn unused) {
            length = str.getBytes(zzhxb.zza).length;
        }
        return zzA(length) + length;
    }

    public static int zzD(zzhxz zzhxzVar) {
        int iZzbr = zzhxzVar.zzbr();
        return zzA(iZzbr) + iZzbr;
    }

    public static int zzz(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public final void zzE() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzF(String str, zzhzn zzhznVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhznVar);
        byte[] bytes = str.getBytes(zzhxb.zza);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzhvr(e10);
        }
    }

    public abstract void zzJ(int i10, int i11) throws IOException;

    public abstract void zzK(int i10, int i11) throws IOException;

    public abstract void zzL(int i10, int i11) throws IOException;

    public abstract void zzM(int i10, int i11) throws IOException;

    public abstract void zzN(int i10, long j10) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzhuz
    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzi(int i10, boolean z10) throws IOException;

    public abstract void zzj(int i10, String str) throws IOException;

    public abstract void zzk(int i10, zzhvi zzhviVar) throws IOException;

    public abstract void zzl(zzhvi zzhviVar) throws IOException;

    public abstract void zzm(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzn(int i10, zzhxz zzhxzVar) throws IOException;

    public abstract void zzo(int i10, zzhvi zzhviVar) throws IOException;

    public abstract void zzp(zzhxz zzhxzVar) throws IOException;

    public abstract void zzq(byte b10) throws IOException;

    public abstract void zzr(int i10) throws IOException;

    public abstract void zzs(int i10) throws IOException;

    public abstract void zzt(int i10) throws IOException;

    public abstract void zzu(long j10) throws IOException;

    public abstract void zzv(long j10) throws IOException;

    public abstract void zzx(String str) throws IOException;

    public abstract void zzy() throws IOException;

    public /* synthetic */ zzhvt(byte[] bArr) {
    }
}
