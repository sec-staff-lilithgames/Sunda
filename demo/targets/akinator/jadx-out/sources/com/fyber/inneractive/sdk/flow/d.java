package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Handler f23545a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.interfaces.b f23546b;

    /* renamed from: c, reason: collision with root package name */
    public final b f23547c = new b(this);

    /* renamed from: d, reason: collision with root package name */
    public final c f23548d = new c(this);

    public d(com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f23546b = bVar;
    }

    public final void a() {
        IAlog.a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.a(this));
        if (this.f23545a != null) {
            IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(this));
            Handler handler = this.f23545a;
            if (handler != null) {
                handler.removeCallbacks(this.f23548d);
            }
            this.f23545a.getLooper().quitSafely();
            this.f23545a = null;
        }
    }
}
