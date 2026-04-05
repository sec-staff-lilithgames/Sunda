package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzalr {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzeg zzc = new zzeg();
    private final StringBuilder zzd = new StringBuilder();

    public static void zzb(zzeg zzegVar) {
        while (true) {
            for (boolean z10 = true; zzegVar.zzd() > 0 && z10; z10 = false) {
                char c10 = (char) zzegVar.zzi()[zzegVar.zzg()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zzegVar.zzk(1);
                } else {
                    int iZzg = zzegVar.zzg();
                    int iZze = zzegVar.zze();
                    byte[] bArrZzi = zzegVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i10 = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i11 = iZzg + 2;
                            if (bArrZzi[i10] == 42) {
                                while (true) {
                                    int i12 = i11 + 1;
                                    if (i12 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i11]) == '*' && ((char) bArrZzi[i12]) == '/') {
                                        iZze = i11 + 2;
                                        i11 = iZze;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                zzegVar.zzk(iZze - zzegVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String zzc(zzeg zzegVar, StringBuilder sb2) {
        zzb(zzegVar);
        if (zzegVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzegVar, sb2);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzegVar.zzs();
        StringBuilder sb3 = new StringBuilder(String.valueOf(cZzs).length());
        sb3.append(cZzs);
        return sb3.toString();
    }

    private static String zzd(zzeg zzegVar, StringBuilder sb2) {
        boolean z10;
        char c10;
        sb2.setLength(0);
        int iZzg = zzegVar.zzg();
        int iZze = zzegVar.zze();
        loop0: while (true) {
            for (false; iZzg < iZze && !z10; true) {
                c10 = (char) zzegVar.zzi()[iZzg];
                z10 = (c10 < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_');
            }
            sb2.append(c10);
            iZzg++;
        }
        zzegVar.zzk(iZzg - zzegVar.zzg());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x02fd, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zza(com.google.android.gms.internal.ads.zzeg r18) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zza(com.google.android.gms.internal.ads.zzeg):java.util.List");
    }
}
