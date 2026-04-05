package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public String f24005b;

    /* renamed from: c, reason: collision with root package name */
    public String f24006c;

    /* renamed from: d, reason: collision with root package name */
    public String f24007d;

    /* renamed from: e, reason: collision with root package name */
    public Partner f24008e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f24004a = false;

    /* renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.measurement.tracker.f f24009f = new com.fyber.inneractive.sdk.measurement.tracker.f();

    /* renamed from: g, reason: collision with root package name */
    public final a f24010g = new a(this);

    /* renamed from: h, reason: collision with root package name */
    public final b f24011h = new b(this);

    /* renamed from: i, reason: collision with root package name */
    public final c f24012i = new c(this);

    public static void a(e eVar, Context context) {
        eVar.getClass();
        a(context, a.b.l("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/", Omid.getVersion(), ".js"), "omid-latest.js", eVar.f24010g);
        a(context, a.b.l("https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/omid-session-client-", Omid.getVersion(), ".js"), "omid-session-client-latest.js", eVar.f24011h);
        a(context, "https://cdn2.inner-active.mobi/client/ia-js-tags/omsdk/dt-omsdk-mraid-video-tracker.js", "dt-omsdk-mraid-video-tracker.js", eVar.f24012i);
    }

    public static void a(Context context, String str, String str2, f0 f0Var) {
        IAlog.d("%s- Loading URL: %s", IAlog.a(e.class), str);
        IAConfigManager.O.f23224s.a(new v0(f0Var, context, new com.fyber.inneractive.sdk.cache.f(str, str2)));
    }
}
