package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.ironsource.C3191e4;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaes {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzaep zzb(zzeg zzegVar, boolean z10, boolean z11) throws zzat {
        if (z10) {
            zzd(3, zzegVar, false);
        }
        String strZzK = zzegVar.zzK((int) zzegVar.zzA(), StandardCharsets.UTF_8);
        int length = strZzK.length();
        long jZzA = zzegVar.zzA();
        String[] strArr = new String[(int) jZzA];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jZzA; i10++) {
            String strZzK2 = zzegVar.zzK((int) zzegVar.zzA(), StandardCharsets.UTF_8);
            strArr[i10] = strZzK2;
            length2 = length2 + 4 + strZzK2.length();
        }
        if (z11 && (zzegVar.zzs() & 1) == 0) {
            throw zzat.zzb("framing bit expected to be set", null);
        }
        return new zzaep(strZzK, strArr, length2 + 1);
    }

    public static zzap zzc(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = zzep.zza;
            String[] strArrSplit = str.split(C3191e4.i.f36525b, 2);
            if (strArrSplit.length != 2) {
                zzdt.zzc("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagd.zzb(new zzeg(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    zzdt.zzd("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzahb(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }

    public static boolean zzd(int i10, zzeg zzegVar, boolean z10) throws zzat {
        if (zzegVar.zzd() < 7) {
            if (z10) {
                return false;
            }
            int iZzd = zzegVar.zzd();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 18);
            sb2.append("too short header: ");
            sb2.append(iZzd);
            throw zzat.zzb(sb2.toString(), null);
        }
        if (zzegVar.zzs() != i10) {
            if (z10) {
                return false;
            }
            throw zzat.zzb("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (zzegVar.zzs() == 118 && zzegVar.zzs() == 111 && zzegVar.zzs() == 114 && zzegVar.zzs() == 98 && zzegVar.zzs() == 105 && zzegVar.zzs() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw zzat.zzb("expected characters 'vorbis'", null);
    }
}
