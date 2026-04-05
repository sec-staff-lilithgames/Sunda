package com.fyber.inneractive.sdk.privacysandbox;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26333a;

    public a(String str) {
        this.f26333a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.c("Registered source %s", this.f26333a);
    }
}
