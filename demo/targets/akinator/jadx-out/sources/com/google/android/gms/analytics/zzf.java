package com.google.android.gms.analytics;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzf implements Comparator {
    public zzf(zzg zzgVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzj) obj).getClass().getCanonicalName().compareTo(((zzj) obj2).getClass().getCanonicalName());
    }
}
