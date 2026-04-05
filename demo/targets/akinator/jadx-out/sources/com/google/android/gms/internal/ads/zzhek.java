package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhek {
    private HashMap zza = new HashMap();

    public final zzhel zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhel zzhelVar = new zzhel(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhelVar;
    }
}
