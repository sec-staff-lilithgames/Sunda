package com.google.android.gms.internal.gtm;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzvv implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzwb zzwbVarZza = zzwb.zza(obj);
        zzwb zzwbVarZza2 = zzwb.zza(obj2);
        if (zzwbVarZza != zzwbVarZza2) {
            return zzwbVarZza.compareTo(zzwbVarZza2);
        }
        int iOrdinal = zzwbVarZza.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
