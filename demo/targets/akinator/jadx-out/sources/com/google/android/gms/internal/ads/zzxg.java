package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzxg implements Comparator {
    static final /* synthetic */ zzxg zza = new zzxg();

    private /* synthetic */ zzxg() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzxf) Collections.max((List) obj)).compareTo((zzxf) Collections.max((List) obj2));
    }
}
