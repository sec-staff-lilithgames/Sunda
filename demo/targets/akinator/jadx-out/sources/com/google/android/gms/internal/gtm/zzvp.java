package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzvp extends zzvd {
    public static final /* synthetic */ int zza = 0;
    private static final Set zzb;
    private static final zzuw zzc;
    private static final zzvm zzd;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzuf.zza, zzuk.zza, zzul.zza)));
        zzb = setUnmodifiableSet;
        zzc = zzuz.zza(setUnmodifiableSet).zza();
        zzd = new zzvm();
    }

    public /* synthetic */ zzvp(String str, String str2, boolean z10, int i10, Level level, Set set, zzuw zzuwVar, zzvo zzvoVar) {
        super(str2);
        if (str2.length() > 23) {
            int i11 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i11 = length;
                    break;
                }
            }
            str2 = str2.substring(i11 + 1);
        }
        String strConcat = "".concat(String.valueOf(str2));
        strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static zzvm zzc() {
        return zzd;
    }
}
