package com.fyber.inneractive.sdk.web;

import android.widget.Toast;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26957a;

    public v(String str) {
        this.f26957a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(com.fyber.inneractive.sdk.util.o.f26796a, this.f26957a, 0).show();
    }
}
