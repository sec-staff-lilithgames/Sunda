package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzads {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) throws NumberFormatException {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzep.zza;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.zza = i10;
            this.zzb = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzap zzapVar) {
        zzgpe zzgpeVarZze = zzapVar.zze(zzagk.class, zzadr.zza);
        int size = zzgpeVarZze.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zZzc = zzc(((zzagk) zzgpeVarZze.get(i10)).zzc);
            i10++;
            if (zZzc) {
                return true;
            }
        }
        zzgpe zzgpeVarZze2 = zzapVar.zze(zzags.class, zzadq.zza);
        int size2 = zzgpeVarZze2.size();
        int i11 = 0;
        while (i11 < size2) {
            boolean zZzc2 = zzc(((zzags) zzgpeVarZze2.get(i11)).zzc);
            i11++;
            if (zZzc2) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
