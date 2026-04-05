package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f26984a;

    public w(x xVar) {
        this.f26984a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26984a.f26992a.getClass();
        com.fyber.inneractive.sdk.util.r.f26804b.post(new v("Image failed to download."));
        this.f26984a.f26992a.a(com.fyber.inneractive.sdk.mraid.k.STORE_PICTURE, "Error downloading and saving image file.");
        IAlog.a("failed to download and save the image file.", new Object[0]);
    }
}
