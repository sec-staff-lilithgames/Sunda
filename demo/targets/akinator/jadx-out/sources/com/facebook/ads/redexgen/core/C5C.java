package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.5C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5C {
    public Map<String, String> A00;
    public final Map<String, String> A01 = new HashMap();

    public final synchronized Map<String, String> A00() {
        if (this.A00 == null) {
            this.A00 = Collections.unmodifiableMap(new HashMap(this.A01));
        }
        return this.A00;
    }

    public final synchronized void A01(String str, String str2) {
        this.A00 = null;
        this.A01.put(str, str2);
    }
}
