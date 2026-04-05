package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzgr extends zzgc {
    private static final Logger zzb = Logger.getLogger(zzgr.class.getName());
    private static final boolean zzc = zzjq.zzx();
    zzgs zza;

    private zzgr() {
        throw null;
    }

    public static int zzA(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i10, zzim zzimVar, zzix zzixVar) {
        int iZzz = zzz(i10 << 3);
        return ((zzfv) zzimVar).zze(zzixVar) + iZzz + iZzz;
    }

    public static int zzx(zzim zzimVar, zzix zzixVar) {
        int iZze = ((zzfv) zzimVar).zze(zzixVar);
        return zzz(iZze) + iZze;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzjt.zzc(str);
        } catch (zzjs unused) {
            length = str.getBytes(zzhp.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzjs zzjsVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzjsVar);
        byte[] bytes = str.getBytes(zzhp.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgp(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzd(int i10, boolean z10) throws IOException;

    public abstract void zze(int i10, zzgk zzgkVar) throws IOException;

    public abstract void zzf(int i10, int i11) throws IOException;

    public abstract void zzg(int i10) throws IOException;

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzi(long j10) throws IOException;

    public abstract void zzj(int i10, int i11) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzm(int i10, zzim zzimVar, zzix zzixVar) throws IOException;

    public abstract void zzn(int i10, zzim zzimVar) throws IOException;

    public abstract void zzo(int i10, zzgk zzgkVar) throws IOException;

    public abstract void zzp(int i10, String str) throws IOException;

    public abstract void zzr(int i10, int i11) throws IOException;

    public abstract void zzs(int i10, int i11) throws IOException;

    public abstract void zzt(int i10) throws IOException;

    public abstract void zzu(int i10, long j10) throws IOException;

    public abstract void zzv(long j10) throws IOException;

    public /* synthetic */ zzgr(zzgq zzgqVar) {
    }
}
