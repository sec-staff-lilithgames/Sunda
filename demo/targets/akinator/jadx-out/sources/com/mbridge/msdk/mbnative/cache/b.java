package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class b<K, V> {
    public long a() {
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        return gVarF.Z() * 1000;
    }

    public abstract V a(K k10, int i10);

    public abstract void a(K k10, V v10);

    public abstract void a(K k10, V v10, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public V b(K k10, int i10) {
        return null;
    }

    public long b() {
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        return gVarF.a0() * 1000;
    }
}
