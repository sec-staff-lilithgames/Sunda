package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.ironsource.Q6;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f26811a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public volatile String f26812b = null;

    /* renamed from: c, reason: collision with root package name */
    public Context f26813c = null;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f26814d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final p1 f26815e = new p1(this);

    public final String a() {
        if (!TextUtils.isEmpty(this.f26812b)) {
            return this.f26812b;
        }
        if (this.f26815e != null && this.f26811a.get()) {
            Handler handler = r.f26804b;
            handler.removeCallbacks(this.f26815e);
            handler.postDelayed(this.f26815e, 50L);
        }
        return System.getProperty("http.agent");
    }

    public final void b() {
        if (this.f26813c == null || !TextUtils.isEmpty(this.f26812b)) {
            return;
        }
        this.f26812b = this.f26813c.getSharedPreferences("fyber.ua", 0).getString(Q6.f35252d0, null);
        if (!TextUtils.isEmpty(this.f26812b)) {
            IAlog.a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.f26814d.compareAndSet(false, true);
        }
        r.f26803a.execute(new r1(this));
    }

    public final void c() {
        String defaultUserAgent;
        Context context = this.f26813c;
        if (context != null) {
            try {
                defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                this.f26811a.set(false);
                defaultUserAgent = null;
            }
            if (TextUtils.isEmpty(defaultUserAgent)) {
                return;
            }
            this.f26812b = defaultUserAgent;
            if (!TextUtils.isEmpty(this.f26812b)) {
                IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
                this.f26814d.compareAndSet(false, true);
            }
            r.f26803a.execute(new q1(this, defaultUserAgent));
        }
    }
}
