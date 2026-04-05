package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import b3.h;
import com.ironsource.C3191e4;
import j1.o2;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzjh {
    public static Object zzb(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(o2.o(h.b("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), C3191e4.i.f36531e));
    }

    public static void zza(Bundle bundle, Object obj) {
        boolean z10 = obj instanceof Double;
        String str = uQjDr.qWdKrEUdCw;
        if (z10) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else {
            bundle.putString(str, obj.toString());
        }
    }
}
