package com.fyber.inneractive.sdk.config;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23328a = new HashMap();

    public final boolean a() {
        try {
            if (this.f23328a.containsKey("dsos")) {
                return Boolean.parseBoolean((String) this.f23328a.get("dsos"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
