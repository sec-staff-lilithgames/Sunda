package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f26937b;

    public o0(v0 v0Var, String str) {
        this.f26937b = v0Var;
        this.f26936a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.a("injecting JS: %s", this.f26936a);
        try {
            String str = this.f26936a;
            if (str != null) {
                com.fyber.inneractive.sdk.util.q0.a(this.f26937b.f26958a, str);
            }
        } catch (Exception unused) {
            IAlog.a("Failed to inject JS", new Object[0]);
        }
    }
}
