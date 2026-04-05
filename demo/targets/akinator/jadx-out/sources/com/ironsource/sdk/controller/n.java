package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3422r4;
import com.ironsource.C3460t8;
import com.ironsource.InterfaceC3507w4;
import com.ironsource.InterfaceC3524x4;
import com.ironsource.InterfaceC3541y4;
import com.ironsource.V7;
import com.ironsource.Y4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class n implements l {

    /* renamed from: a, reason: collision with root package name */
    private final V7 f38600a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38601b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.a f38602a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.c f38603b;

        public a(l.a aVar, f.c cVar) {
            this.f38602a = aVar;
            this.f38603b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                if (this.f38602a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", false);
                jSONObject.put("reason", n.this.f38601b);
                this.f38602a.a(new f.a(this.f38603b.f(), jSONObject));
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3541y4 f38605a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y4 f38606b;

        public b(InterfaceC3541y4 interfaceC3541y4, Y4 y42) {
            this.f38605a = interfaceC3541y4;
            this.f38606b = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38605a.a(C3460t8.e.RewardedVideo, this.f38606b.h(), n.this.f38601b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3541y4 f38608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f38609b;

        public c(InterfaceC3541y4 interfaceC3541y4, JSONObject jSONObject) {
            this.f38608a = interfaceC3541y4;
            this.f38609b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38608a.b(this.f38609b.optString("demandSourceName"), n.this.f38601b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38611a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y4 f38612b;

        public d(InterfaceC3524x4 interfaceC3524x4, Y4 y42) {
            this.f38611a = interfaceC3524x4;
            this.f38612b = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38611a.a(C3460t8.e.Interstitial, this.f38612b.h(), n.this.f38601b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38614a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f38615b;

        public e(InterfaceC3524x4 interfaceC3524x4, String str) {
            this.f38614a = interfaceC3524x4;
            this.f38615b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38614a.a(this.f38615b, n.this.f38601b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38617a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y4 f38618b;

        public f(InterfaceC3524x4 interfaceC3524x4, Y4 y42) {
            this.f38617a = interfaceC3524x4;
            this.f38618b = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38617a.a(this.f38618b.h(), n.this.f38601b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f38621b;

        public g(InterfaceC3524x4 interfaceC3524x4, JSONObject jSONObject) {
            this.f38620a = interfaceC3524x4;
            this.f38621b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38620a.d(this.f38621b.optString("demandSourceName"), n.this.f38601b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3524x4 f38623a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y4 f38624b;

        public h(InterfaceC3524x4 interfaceC3524x4, Y4 y42) {
            this.f38623a = interfaceC3524x4;
            this.f38624b = y42;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38623a.d(this.f38624b.h(), n.this.f38601b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3507w4 f38626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f38627b;

        public i(InterfaceC3507w4 interfaceC3507w4, Map map) {
            this.f38626a = interfaceC3507w4;
            this.f38627b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38626a.c((String) this.f38627b.get("demandSourceName"), n.this.f38601b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3507w4 f38629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f38630b;

        public j(InterfaceC3507w4 interfaceC3507w4, JSONObject jSONObject) {
            this.f38629a = interfaceC3507w4;
            this.f38630b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38629a.c(this.f38630b.optString("demandSourceName"), n.this.f38601b);
        }
    }

    public n(String str, V7 v72) {
        this.f38600a = v72;
        this.f38601b = str;
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    public C3460t8.c h() {
        return C3460t8.c.Native;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Activity activity) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(Y4 y42, Map<String, String> map, InterfaceC3524x4 interfaceC3524x4) {
        if (interfaceC3524x4 != null) {
            a(new f(interfaceC3524x4, y42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC3541y4 interfaceC3541y4) {
        if (interfaceC3541y4 != null) {
            a(new b(interfaceC3541y4, y42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3541y4 interfaceC3541y4) {
        if (interfaceC3541y4 != null) {
            a(new c(interfaceC3541y4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC3524x4 interfaceC3524x4) {
        if (interfaceC3524x4 != null) {
            a(new d(interfaceC3524x4, y42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, InterfaceC3524x4 interfaceC3524x4) {
        if (interfaceC3524x4 != null) {
            a(new e(interfaceC3524x4, str));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3524x4 interfaceC3524x4) {
        if (interfaceC3524x4 != null) {
            a(new g(interfaceC3524x4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC3524x4 interfaceC3524x4) {
        if (interfaceC3524x4 != null) {
            a(new h(interfaceC3524x4, y42));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(String str, String str2, Y4 y42, InterfaceC3507w4 interfaceC3507w4) {
        if (interfaceC3507w4 != null) {
            interfaceC3507w4.a(C3460t8.e.Banner, y42.h(), this.f38601b);
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(Y4 y42, Map<String, String> map, InterfaceC3507w4 interfaceC3507w4) {
        if (interfaceC3507w4 != null) {
            a(new i(interfaceC3507w4, map));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(JSONObject jSONObject, InterfaceC3507w4 interfaceC3507w4) {
        if (interfaceC3507w4 != null) {
            a(new j(interfaceC3507w4, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(f.c cVar, l.a aVar) {
        a(new a(aVar, cVar));
    }

    public void a(Runnable runnable) {
        V7 v72 = this.f38600a;
        if (v72 != null) {
            v72.c(runnable);
        }
    }
}
