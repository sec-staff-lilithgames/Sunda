package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzahj {
    public byte[] zzO;
    public zzaen zzU;
    public boolean zzW;
    public zzaem zzY;
    public zzv zzZ;
    public boolean zza;
    public int zzaa;
    private int zzab;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzael zzj;
    public byte[] zzk;
    public zzq zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public boolean zzy = false;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = -1;
    public int zzC = 1000;
    public int zzD = 200;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public float zzN = -1.0f;
    public int zzP = 1;
    public int zzQ = -1;
    public int zzR = 8000;
    public long zzS = 0;
    public long zzT = 0;
    public boolean zzV = false;
    public boolean zzX = true;
    private String zzac = "eng";

    private static Pair zzf(zzeg zzegVar) throws zzat {
        try {
            zzegVar.zzk(16);
            long jZzA = zzegVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair(MimeTypes.VIDEO_H263, null);
            }
            if (jZzA != 826496599) {
                zzdt.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            }
            int iZzg = zzegVar.zzg() + 20;
            byte[] bArrZzi = zzegVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i10 = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i10] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i10;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i10;
        int i11;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i12 = 0;
            int i13 = 1;
            while (true) {
                int i14 = bArr[i13];
                i13++;
                i10 = i14 & 255;
                if (i10 != 255) {
                    break;
                }
                i12 += 255;
            }
            int i15 = i12 + i10;
            int i16 = 0;
            while (true) {
                int i17 = bArr[i13];
                i13++;
                i11 = i17 & 255;
                if (i11 != 255) {
                    break;
                }
                i16 += 255;
            }
            int i18 = i16 + i11;
            if (bArr[i13] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i13, bArr2, 0, i15);
            int i19 = i13 + i15;
            if (bArr[i19] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i20 = i19 + i18;
            if (bArr[i20] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i20;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i20, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzeg zzegVar) throws zzat {
        try {
            int iZzu = zzegVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzegVar.zzh(24);
                if (zzegVar.zzD() == zzahk.zzf.getMostSignificantBits()) {
                    if (zzegVar.zzD() == zzahk.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzadd r19, int r20) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahj.zza(com.google.android.gms.internal.ads.zzadd, int):void");
    }

    public final /* synthetic */ void zzb() {
        this.zzY.getClass();
    }

    public final /* synthetic */ int zzc() {
        return this.zzab;
    }

    public final /* synthetic */ void zzd(int i10) {
        this.zzab = i10;
    }

    public final /* synthetic */ void zze(String str) {
        this.zzac = str;
    }
}
