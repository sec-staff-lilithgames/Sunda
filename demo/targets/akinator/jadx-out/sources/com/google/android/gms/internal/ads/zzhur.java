package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhuq;
import com.google.android.gms.internal.ads.zzhur;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzhur<MessageType extends zzhur<MessageType, BuilderType>, BuilderType extends zzhuq<MessageType, BuilderType>> implements zzhxz {
    protected int zzq = 0;

    public static void zzaV(zzhvi zzhviVar) throws IllegalArgumentException {
        if (!zzhviVar.zzm()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzhuq.zzaT(iterable, list);
    }

    @Override // com.google.android.gms.internal.ads.zzhxz
    public zzhvi zzaM() {
        try {
            int iZzbr = zzbr();
            zzhvi zzhviVar = zzhvi.zzb;
            byte[] bArr = new byte[iZzbr];
            int i10 = zzhvt.zzf;
            zzhvq zzhvqVar = new zzhvq(bArr, 0, iZzbr);
            zzdc(zzhvqVar);
            return zzhve.zza(zzhvqVar, bArr);
        } catch (IOException e10) {
            throw new RuntimeException(zzdZ("ByteString"), e10);
        }
    }

    public byte[] zzaN() {
        try {
            int iZzbr = zzbr();
            byte[] bArr = new byte[iZzbr];
            int i10 = zzhvt.zzf;
            zzhvq zzhvqVar = new zzhvq(bArr, 0, iZzbr);
            zzdc(zzhvqVar);
            zzhvqVar.zzE();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(zzdZ("byte array"), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhxz
    public void zzaO(OutputStream outputStream) throws IOException {
        zzhvs zzhvsVar = new zzhvs(outputStream, zzhvt.zzz(zzbr()));
        zzdc(zzhvsVar);
        zzhvsVar.zzy();
    }

    public void zzaP(OutputStream outputStream) throws IOException {
        int iZzbr = zzbr();
        zzhvs zzhvsVar = new zzhvs(outputStream, zzhvt.zzz(zzhvt.zzA(iZzbr) + iZzbr));
        zzhvsVar.zzs(iZzbr);
        zzdc(zzhvsVar);
        zzhvsVar.zzy();
    }

    public int zzaQ() {
        throw new UnsupportedOperationException();
    }

    public void zzaR(int i10) {
        throw new UnsupportedOperationException();
    }

    public zzhye zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public int zzaT(zzhyr zzhyrVar) {
        return zzaQ();
    }

    public zzhzb zzaU() {
        return new zzhzb(this);
    }

    private String zzdZ(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        com.google.android.gms.internal.play_billing.a.B(sb2, "Serializing ", name, SFPXhf.dmEtZpnGatA, str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }
}
