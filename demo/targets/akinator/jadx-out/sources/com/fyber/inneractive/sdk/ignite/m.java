package com.fyber.inneractive.sdk.ignite;

import ao.kwoC.zAQQWzBxnS;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum m {
    TRUE_SINGLE_TAP("tst"),
    SINGLE_TAP(zAQQWzBxnS.cZROwJRPvcg),
    NONE("none");

    private static final Map<String, m> CONSTANTS = new HashMap();
    private final String value;

    m(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }

    static {
        for (m mVar : values()) {
            CONSTANTS.put(mVar.value, mVar);
        }
    }

    public static m a(String str) {
        return CONSTANTS.get(str);
    }
}
