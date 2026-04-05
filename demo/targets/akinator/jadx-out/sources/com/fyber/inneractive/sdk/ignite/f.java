package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23974a;

    public f(String str) {
        this.f23974a = str;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        IAlog.a("Hit Request: Hitting URL finished: %s", this.f23974a);
        if (exc == null) {
            IAlog.a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
    }
}
