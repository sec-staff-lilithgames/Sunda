package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public long f23132a;

    /* renamed from: b, reason: collision with root package name */
    public String f23133b;

    /* renamed from: c, reason: collision with root package name */
    public String f23134c;

    /* renamed from: d, reason: collision with root package name */
    public String f23135d;

    /* renamed from: e, reason: collision with root package name */
    public String f23136e;

    public final void a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f23132a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            if (iAConfigManager.f23226u.f23394b.a(false, "use_js_inline")) {
                Application application = o.f26796a;
                if (application == null) {
                    IAlog.f("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f23132a = System.currentTimeMillis();
                v0 v0Var = new v0(new g(this), application, new f("https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js", "dt-mraid-video-controller.js"));
                IAlog.d("%s- Loading URL: %s", IAlog.a(this), "https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js");
                iAConfigManager.f23224s.a(v0Var);
                iAConfigManager.f23224s.a(new v0(new h(this), application, new f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css")));
                iAConfigManager.f23224s.a(new v0(new i(this), application, new f("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js")));
                s sVar = iAConfigManager.f23226u;
                if (sVar == null || !sVar.f23394b.a(false, "dt_plbl")) {
                    return;
                }
                iAConfigManager.f23224s.a(new v0(new j(this), application, new f("https://cdn2.inner-active.mobi/client/ia-js-tags/playable_detect.js", "playable_detect.js")));
            }
        }
    }
}
