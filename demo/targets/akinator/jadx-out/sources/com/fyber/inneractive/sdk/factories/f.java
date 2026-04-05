package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23523a = new HashMap();

    public final void a(com.fyber.inneractive.sdk.response.a aVar, e eVar) {
        if (this.f23523a.containsKey(aVar)) {
            IAlog.f("Handler already exists for ad type %s! : %s", aVar, this.f23523a.get(aVar));
        } else {
            this.f23523a.put(aVar, eVar);
        }
    }
}
