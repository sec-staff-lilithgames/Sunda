package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25997a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map f25998b;

    public final synchronized Map a() {
        try {
            if (this.f25998b == null) {
                this.f25998b = Collections.unmodifiableMap(new HashMap(this.f25997a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f25998b;
    }
}
