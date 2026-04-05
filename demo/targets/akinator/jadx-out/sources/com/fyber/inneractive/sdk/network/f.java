package com.fyber.inneractive.sdk.network;

import android.app.Application;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements com.fyber.inneractive.sdk.util.e1 {

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.d1 f24216d;

    /* renamed from: e, reason: collision with root package name */
    public int f24217e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingQueue f24213a = new LinkedBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    public JSONArray f24214b = new JSONArray();

    /* renamed from: f, reason: collision with root package name */
    public boolean f24218f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24219g = false;

    /* renamed from: c, reason: collision with root package name */
    public final HandlerThread f24215c = new HandlerThread("EventCollectorHandlerThread", 0);

    public final void a(Application application) {
        if (!this.f24219g) {
            this.f24219g = true;
            this.f24215c.start();
            com.fyber.inneractive.sdk.util.d1 d1Var = new com.fyber.inneractive.sdk.util.d1(this.f24215c.getLooper(), this);
            this.f24216d = d1Var;
            this.f24218f = true;
            this.f24217e = 30;
            if (d1Var.hasMessages(12312329)) {
                this.f24216d.removeMessages(12312329);
            }
            long j10 = this.f24217e * 1000;
            com.fyber.inneractive.sdk.util.d1 d1Var2 = this.f24216d;
            if (d1Var2 != null) {
                d1Var2.post(new c(this, 12312329, j10));
            }
        }
        application.registerActivityLifecycleCallbacks(new d(this));
    }
}
