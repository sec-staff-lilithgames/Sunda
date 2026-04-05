package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.iab.omid.library.fyber.Omid;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f23232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23233b;

    public a0(IAConfigManager iAConfigManager, Context context) {
        this.f23232a = iAConfigManager;
        this.f23233b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = Omid.f30608a;
            com.fyber.inneractive.sdk.util.r.f26804b.post(new z(this));
        } catch (Throwable unused) {
        }
    }
}
