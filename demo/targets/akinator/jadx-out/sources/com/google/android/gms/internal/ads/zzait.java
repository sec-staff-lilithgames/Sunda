package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzait {
    public static void zza(int i10, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(C.TIME_UNSET, new zzao[0]);
        }
        if (zzapVar != null) {
            zzgpe zzgpeVarZzd = zzapVar.zzd(zzes.class);
            int size = zzgpeVarZzd.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzes zzesVar = (zzes) zzgpeVarZzd.get(i11);
                if (!zzesVar.zza.equals("com.android.capture.fps") || i10 == 2) {
                    zzapVar2 = zzapVar2.zzg(zzesVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzk(zzapVar2);
        }
    }

    public static void zzb(int i10, zzads zzadsVar, zzt zztVar) {
        if (i10 == 1 && zzadsVar.zzb()) {
            zztVar.zzH(zzadsVar.zza);
            zztVar.zzI(zzadsVar.zzb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0281 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x0030, B:11:0x003b, B:15:0x004a, B:18:0x0056, B:21:0x0063, B:24:0x0070, B:27:0x007d, B:30:0x008b, B:32:0x0097, B:40:0x00b2, B:41:0x00d0, B:42:0x00e2, B:45:0x00ee, B:48:0x00fb, B:51:0x0108, B:54:0x0115, B:57:0x0122, B:60:0x012f, B:63:0x013c, B:66:0x0149, B:69:0x0156, B:72:0x0163, B:76:0x0174, B:78:0x017a, B:80:0x018e, B:81:0x0195, B:83:0x019c, B:88:0x01a7, B:93:0x01b3, B:137:0x0281, B:94:0x01c8, B:96:0x01cf, B:98:0x01db, B:99:0x01ef, B:112:0x0219, B:115:0x0226, B:118:0x0233, B:121:0x0240, B:124:0x024c, B:127:0x0258, B:130:0x0262, B:133:0x026e, B:136:0x027a, B:138:0x029e, B:139:0x02a5), top: B:144:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzao zzc(com.google.android.gms.internal.ads.zzeg r15) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzait.zzc(com.google.android.gms.internal.ads.zzeg):com.google.android.gms.internal.ads.zzao");
    }

    private static zzagv zzd(int i10, String str, zzeg zzegVar) {
        int iZzB = zzegVar.zzB();
        if (zzegVar.zzB() == 1684108385) {
            zzegVar.zzk(8);
            return new zzagv(str, null, zzgpe.zzj(zzegVar.zzL(iZzB - 16)));
        }
        zzdt.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzew.zze(i10)));
        return null;
    }

    private static zzagq zze(int i10, String str, zzeg zzegVar, boolean z10, boolean z11) {
        int iZzf = zzf(zzegVar);
        if (z11) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z10 ? new zzagv(str, null, zzgpe.zzj(Integer.toString(iZzf))) : new zzagk(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iZzf));
        }
        zzdt.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzew.zze(i10)));
        return null;
    }

    private static int zzf(zzeg zzegVar) {
        int iZzB = zzegVar.zzB();
        if (zzegVar.zzB() == 1684108385) {
            zzegVar.zzk(8);
            int i10 = iZzB - 16;
            if (i10 == 1) {
                return zzegVar.zzs();
            }
            if (i10 == 2) {
                return zzegVar.zzt();
            }
            if (i10 == 3) {
                return zzegVar.zzx();
            }
            if (i10 == 4 && (zzegVar.zzn() & 128) == 0) {
                return zzegVar.zzH();
            }
        }
        zzdt.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzagv zzg(int i10, String str, zzeg zzegVar) {
        int iZzB = zzegVar.zzB();
        if (zzegVar.zzB() == 1684108385 && iZzB >= 22) {
            zzegVar.zzk(10);
            int iZzt = zzegVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt).length());
                sb2.append(iZzt);
                String string = sb2.toString();
                int iZzt2 = zzegVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iZzt2);
                    string = sb3.toString();
                }
                return new zzagv(str, null, zzgpe.zzj(string));
            }
        }
        zzdt.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzew.zze(i10)));
        return null;
    }
}
