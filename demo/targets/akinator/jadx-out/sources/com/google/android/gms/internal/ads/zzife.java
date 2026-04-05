package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzife {
    public static List zza(int i10) {
        return i10 == 0 ? Collections.EMPTY_LIST : new ArrayList(i10);
    }

    public static HashSet zzb(int i10) {
        return new HashSet(zzd(i10));
    }

    public static LinkedHashMap zzc(int i10) {
        return new LinkedHashMap(zzd(i10));
    }

    private static int zzd(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
