package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.web.v0;
import com.ironsource.G5;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public Context f23193a;

    /* renamed from: b, reason: collision with root package name */
    public String f23194b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23195c;

    /* renamed from: d, reason: collision with root package name */
    public o f23196d;

    /* renamed from: h, reason: collision with root package name */
    public h1 f23200h;

    /* renamed from: j, reason: collision with root package name */
    public v0 f23202j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23203k;

    /* renamed from: l, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f23204l;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f23197e = false;

    /* renamed from: g, reason: collision with root package name */
    public long f23199g = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f23201i = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f23198f = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23205m = IAConfigManager.O.f23226u.f23394b.a(false, "should_decode_url");

    public r(boolean z10) {
        this.f23195c = true;
        this.f23195c = z10;
    }

    public final void a(Context context, String str, o oVar, v0 v0Var, boolean z10, com.fyber.inneractive.sdk.ignite.m mVar, String str2) {
        Uri uri;
        this.f23193a = context;
        this.f23194b = str;
        this.f23196d = oVar;
        this.f23203k = z10;
        this.f23199g = System.currentTimeMillis();
        this.f23202j = v0Var;
        this.f23204l = mVar;
        b bVarA = a(this.f23194b);
        IAlog.d("%s EVENT_CLICK %s %s", "VAST_EVENT", bVarA, str);
        if (bVarA == null) {
            String str3 = this.f23194b;
            try {
                try {
                    uri = this.f23205m ? !h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, G5.N)) : Uri.parse(str3) : h0.c(str3) ? Uri.parse(URLDecoder.decode(str3, G5.N)) : Uri.parse(str3);
                } catch (Exception unused) {
                    IAlog.a("%sgetDecodedUri: Failed parsing Uri!", "SuperClickHandler");
                    uri = null;
                }
                if (a(uri)) {
                    IAlog.a("%sfollowRedirects: Fetching uri: %s", IAlog.a(this), uri.toString());
                    String string = uri.toString();
                    h1 h1Var = new h1(new m(this, string, str2), string);
                    this.f23200h = h1Var;
                    IAConfigManager.O.f23224s.a(h1Var);
                }
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    return;
                }
                IAlog.b("%sfailed followRedirects %s", IAlog.a(this), e10);
                this.f23198f.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                a(new b(str3, q.FAILED, "followRedirects", e10));
            }
        }
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            IAlog.a("%s followRedirects: Got a url which is not valid: null", IAlog.a(this));
            this.f23198f.add(new j(null, false, null, "Invalid url"));
            a(a(uri.toString(), "followRedirects", "Invalid url"));
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME))) {
            return true;
        }
        IAlog.a("%scould not follow redirects for scheme: %s", IAlog.a(this), uri.getScheme());
        IAlog.a("%sfull url: %s", IAlog.a(this), uri.toString());
        this.f23198f.add(new j(uri.toString(), false, null, "Invalid scheme: " + uri.getScheme()));
        a(a(uri.toString(), "followRedirects", "Invalid scheme: " + uri.getScheme()));
        return false;
    }

    public final b a(String str) {
        Uri uri;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri == null) {
            this.f23198f.add(new j(str, false, null, "illegal uri"));
            return a(a(str, null, "illegal uri"));
        }
        if (this.f23201i.isEmpty()) {
            this.f23198f.add(new j(str, false, null, "no click handlers found"));
            return a(a(str, null, "no click handlers found"));
        }
        Iterator it = this.f23201i.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.a(uri, this)) {
                Context context = this.f23193a;
                b bVarA = context != null ? aVar.a(context, uri, this.f23198f) : null;
                if (bVarA != null) {
                    return a(bVarA);
                }
            }
        }
        return null;
    }

    public static void a(r rVar, String str, String str2, String str3, Exception exc) {
        if (rVar.f23195c) {
            Intent intent = new Intent(rVar.f23193a, (Class<?>) InneractiveInternalBrowserActivity.class);
            if (!TextUtils.isEmpty(str)) {
                InneractiveInternalBrowserActivity.setHtmlExtra(str);
            }
            intent.putExtra("extra_url", str2);
            intent.putExtra("spotId", str3);
            if (!(rVar.f23193a instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                Context context = rVar.f23193a;
                if (context != null) {
                    context.startActivity(intent);
                }
                ArrayList arrayList = rVar.f23198f;
                boolean z10 = exc == null;
                q qVar = q.OPENED_IN_INTERNAL_BROWSER;
                arrayList.add(new j(str2, z10, qVar, v.a(exc)));
                rVar.a(new b(str2, qVar, "followRedirects", null));
                return;
            } catch (ActivityNotFoundException unused) {
                rVar.f23198f.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not registered"));
                rVar.a(a(str2, "followRedirects", "internal browser not registered"));
                return;
            }
        }
        rVar.f23198f.add(new j(str2, false, q.OPENED_IN_INTERNAL_BROWSER, "internal browser not usable"));
        rVar.a(a(str2, "followRedirects", "internal browser not usable"));
    }

    public static b a(String str, String str2, String str3) {
        return new b(str, q.FAILED, str2, new p(str3));
    }

    public final b a(b bVar) {
        ArrayList arrayList = this.f23198f;
        bVar.f23165f.clear();
        bVar.f23165f.addAll(arrayList);
        bVar.f23164e = System.currentTimeMillis() - this.f23199g;
        IAlog.a("%s reporting result: %s", IAlog.a(this), bVar);
        com.fyber.inneractive.sdk.util.r.f26804b.post(new n(this, bVar));
        return bVar;
    }
}
