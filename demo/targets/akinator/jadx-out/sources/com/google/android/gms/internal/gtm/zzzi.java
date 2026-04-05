package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzzi extends zzyp {
    private static final Logger zza = Logger.getLogger(zzzi.class.getName());
    private static final boolean zzb = zzaet.zzx();
    public static final /* synthetic */ int zzf = 0;
    zzzj zze;

    private zzzi() {
        throw null;
    }

    public static int zzA(zzadl zzadlVar, zzadx zzadxVar) {
        int iZzQ = ((zzyh) zzadlVar).zzQ(zzadxVar);
        return zzC(iZzQ) + iZzQ;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzaew.zzc(str);
        } catch (zzaev unused) {
            length = str.getBytes(zzaco.zza).length;
        }
        return zzC(length) + length;
    }

    public static int zzC(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzD(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzy(int i10, zzadl zzadlVar, zzadx zzadxVar) {
        int iZzC = zzC(i10 << 3);
        return ((zzyh) zzadlVar).zzQ(zzadxVar) + iZzC + iZzC;
    }

    public static int zzz(zzadl zzadlVar) {
        int iZzY = zzadlVar.zzY();
        return zzC(iZzY) + iZzY;
    }

    public final void zzE(String str, zzaev zzaevVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaevVar);
        byte[] bytes = str.getBytes(zzaco.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzzf(e10);
        }
    }

    public abstract void zzI() throws IOException;

    public abstract void zzJ(byte b10) throws IOException;

    public abstract void zzK(int i10, boolean z10) throws IOException;

    public abstract void zzL(int i10, zzyx zzyxVar) throws IOException;

    @Override // com.google.android.gms.internal.gtm.zzyp
    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i10, int i11) throws IOException;

    public abstract void zzi(int i10) throws IOException;

    public abstract void zzj(int i10, long j10) throws IOException;

    public abstract void zzk(long j10) throws IOException;

    public abstract void zzl(int i10, int i11) throws IOException;

    public abstract void zzm(int i10) throws IOException;

    public abstract void zzn(int i10, zzadl zzadlVar, zzadx zzadxVar) throws IOException;

    public abstract void zzo(int i10, zzadl zzadlVar) throws IOException;

    public abstract void zzp(int i10, zzyx zzyxVar) throws IOException;

    public abstract void zzq(int i10, String str) throws IOException;

    public abstract void zzs(int i10, int i11) throws IOException;

    public abstract void zzt(int i10, int i11) throws IOException;

    public abstract void zzu(int i10) throws IOException;

    public abstract void zzv(int i10, long j10) throws IOException;

    public abstract void zzw(long j10) throws IOException;

    public /* synthetic */ zzzi(zzzh zzzhVar) {
    }
}
