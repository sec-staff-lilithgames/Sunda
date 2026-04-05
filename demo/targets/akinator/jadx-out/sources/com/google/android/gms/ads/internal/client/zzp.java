package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzp implements Comparator {
    static final /* synthetic */ zzp zza = new zzp();

    private /* synthetic */ zzp() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = RequestConfiguration.zza;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
