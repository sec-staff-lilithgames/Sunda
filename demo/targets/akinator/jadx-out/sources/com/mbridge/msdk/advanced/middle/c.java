package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c {
    private static String G = "NativeAdvancedProvider";
    private boolean A;
    private boolean B;
    private boolean C;

    /* renamed from: a, reason: collision with root package name */
    private String f39547a;

    /* renamed from: b, reason: collision with root package name */
    private String f39548b;

    /* renamed from: c, reason: collision with root package name */
    private MBridgeIds f39549c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.b f39550d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.c f39551e;

    /* renamed from: f, reason: collision with root package name */
    private b f39552f;

    /* renamed from: g, reason: collision with root package name */
    private NativeAdvancedAdListener f39553g;

    /* renamed from: h, reason: collision with root package name */
    private d f39554h;

    /* renamed from: i, reason: collision with root package name */
    private MBNativeAdvancedView f39555i;

    /* renamed from: j, reason: collision with root package name */
    private MBNativeAdvancedWebview f39556j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.advanced.view.a f39557k;

    /* renamed from: l, reason: collision with root package name */
    private l f39558l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f39559m;

    /* renamed from: n, reason: collision with root package name */
    private j f39560n;

    /* renamed from: x, reason: collision with root package name */
    private JSONObject f39570x;

    /* renamed from: z, reason: collision with root package name */
    private MBOutNativeAdvancedViewGroup f39572z;

    /* renamed from: o, reason: collision with root package name */
    private int f39561o = -1;

    /* renamed from: p, reason: collision with root package name */
    private boolean f39562p = false;

    /* renamed from: q, reason: collision with root package name */
    private int f39563q = 0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f39564r = false;

    /* renamed from: s, reason: collision with root package name */
    private int f39565s = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f39566t = false;

    /* renamed from: u, reason: collision with root package name */
    private int f39567u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f39568v = 0;

    /* renamed from: w, reason: collision with root package name */
    private Object f39569w = new Object();

    /* renamed from: y, reason: collision with root package name */
    private boolean f39571y = false;
    private boolean D = true;
    public boolean E = false;
    private ViewTreeObserver.OnScrollChangedListener F = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ViewTreeObserver.OnScrollChangedListener {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        public class RunnableC0254a implements Runnable {
            public RunnableC0254a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.D = true;
            }
        }

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.D) {
                c.this.D = false;
                if (c.this.f39572z != null) {
                    c.this.f39572z.postDelayed(new RunnableC0254a(), 1000L);
                }
                try {
                    c.this.i();
                } catch (Exception e10) {
                    p0.b(c.G, e10.getMessage());
                }
            }
        }
    }

    public c(String str, String str2, Activity activity) {
        this.f39548b = TextUtils.isEmpty(str) ? "" : str;
        this.f39547a = str2;
        this.f39549c = new MBridgeIds(str, str2);
        a(activity);
    }

    private void e(int i10) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39556j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f39556j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a((WebView) this.f39556j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            p0.a(G, th2.getMessage());
        }
    }

    private void j() throws JSONException {
        a(this.f39561o);
        c(this.f39563q);
        g(this.f39565s);
        a(this.f39570x);
        e(l0.s(com.mbridge.msdk.foundation.controller.c.m().d()));
    }

    public MBOutNativeAdvancedViewGroup d() {
        return this.f39572z;
    }

    public int f() {
        return this.f39561o;
    }

    public boolean g() {
        return this.f39559m;
    }

    public void h(int i10) throws JSONException {
        this.f39566t = true;
        g(i10);
    }

    public void i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.C) {
                        return;
                    } else {
                        this.C = true;
                    }
                }
            } else if (this.B) {
                return;
            } else {
                this.B = true;
            }
        } else if (this.A) {
            return;
        } else {
            this.A = true;
        }
        try {
            i();
        } catch (Exception e10) {
            p0.b(G, e10.getMessage());
        }
    }

    private void g(int i10) throws JSONException {
        if (this.f39566t) {
            this.f39565s = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39556j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f39556j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i10));
        }
    }

    public void b(JSONObject jSONObject) throws JSONException {
        this.f39571y = true;
        a(jSONObject);
    }

    public void c(String str) throws Throwable {
        b bVar = new b(this, this.f39549c);
        this.f39552f = bVar;
        bVar.a(this.f39553g);
        this.f39552f.a(str);
        a(str, 2);
    }

    public void d(String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f39553g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f39549c, "bid  token is null or empty");
        }
    }

    public void f(int i10) {
        if (i10 == 1) {
            this.A = false;
        } else if (i10 == 2) {
            this.B = false;
        } else if (i10 == 3) {
            this.C = false;
        }
        h();
    }

    private void h() {
        com.mbridge.msdk.advanced.manager.c cVar = this.f39551e;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void a(boolean z10) {
        this.f39559m = z10;
    }

    public boolean b(String str) {
        return (this.f39572z == null || com.mbridge.msdk.advanced.manager.d.a(this.f39555i, this.f39548b, this.f39547a, str, this.f39561o, false, true) == null) ? false : true;
    }

    private void a(JSONObject jSONObject) throws JSONException {
        if (this.f39571y) {
            this.f39570x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39556j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f39556j, "setStyleList", "", jSONObject);
        }
    }

    public void b(int i10) throws JSONException {
        this.f39562p = true;
        a(i10);
    }

    private void c(int i10) throws JSONException {
        if (this.f39564r) {
            this.f39563q = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39556j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f39556j, "setVolume", CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
        }
    }

    public void d(int i10) throws JSONException {
        this.f39564r = true;
        c(i10);
    }

    public void b(int i10, int i11) {
        a(i10, i11);
    }

    public String e() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f39551e;
            if (cVar != null) {
                return cVar.c();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f39550d;
        if (bVar != null) {
            return bVar.d();
        }
        return "";
    }

    public void b(CampaignEx campaignEx) throws JSONException {
        if (campaignEx != null) {
            if (this.f39558l == null) {
                this.f39558l = h.b().c(com.mbridge.msdk.foundation.controller.c.m().b(), this.f39547a);
            }
            this.f39554h = new d(this, this.f39553g, campaignEx);
            p0.a(G, "show start");
            if (this.f39567u != 0 && this.f39568v != 0) {
                a(campaignEx, false);
                return;
            }
            d dVar = this.f39554h;
            if (dVar != null) {
                dVar.a(this.f39549c, "width or height is 0  or width or height is too small");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() throws JSONException {
        if (this.A && this.B && this.C) {
            CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f39555i, this.f39548b, this.f39547a, "", this.f39561o, true, true);
            com.mbridge.msdk.advanced.manager.c cVar = this.f39551e;
            if (cVar != null) {
                cVar.f();
            }
            b(campaignExA);
        }
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f39553g = nativeAdvancedAdListener;
    }

    private void a(int i10) throws JSONException {
        if (this.f39562p) {
            this.f39561o = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39556j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i11 = this.f39561o;
            if (i11 == 1) {
                this.f39551e.a(true);
                com.mbridge.msdk.advanced.signal.a.a(this.f39556j, "showCloseButton", "", null);
            } else if (i11 == 0) {
                this.f39551e.a(false);
                com.mbridge.msdk.advanced.signal.a.a(this.f39556j, "hideCloseButton", "", null);
            }
        }
    }

    public String c() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f39551e;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f39550d;
        if (bVar != null) {
            return bVar.c();
        }
        return "";
    }

    public void b() {
        if (this.f39553g != null) {
            this.f39553g = null;
        }
        if (this.f39552f != null) {
            this.f39552f = null;
        }
        if (this.f39554h != null) {
            this.f39554h = null;
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f39550d;
        if (bVar != null) {
            bVar.a((MBNativeAdvancedView) null);
            this.f39550d.e();
        }
        com.mbridge.msdk.advanced.manager.c cVar = this.f39551e;
        if (cVar != null) {
            cVar.g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f39555i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        com.mbridge.msdk.advanced.common.c.b(this.f39548b + this.f39547a + e());
        com.mbridge.msdk.advanced.view.a aVar = this.f39557k;
        if (aVar != null) {
            aVar.b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f39572z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.F);
            this.f39572z.removeAllViews();
            this.f39572z = null;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10) throws JSONException {
        j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f39572z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z10) {
            if (this.f39558l == null) {
                this.f39558l = h.b().c(com.mbridge.msdk.foundation.controller.c.m().b(), this.f39547a);
            }
            this.f39554h = new d(this, this.f39553g, campaignEx);
        }
        if (this.f39551e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39548b, this.f39547a);
            this.f39551e = cVar;
            cVar.a(this);
        }
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        if (com.mbridge.msdk.advanced.manager.d.a(this.f39555i, campaignEx, this.f39548b, this.f39547a)) {
            this.f39551e.a(this.f39554h);
            p0.b(G, "start show process");
            this.f39551e.a(campaignEx, this.f39555i, true);
        }
    }

    private void a(String str, int i10) throws Throwable {
        boolean zB;
        this.D = true;
        synchronized (this.f39569w) {
            try {
                if (this.f39559m) {
                    if (this.f39552f != null) {
                        this.f39552f.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f39559m = true;
                    }
                    return;
                }
                this.f39559m = true;
                if (this.f39567u != 0 && this.f39568v != 0) {
                    if (this.f39555i == null) {
                        if (this.f39552f != null) {
                            this.f39552f.a(new com.mbridge.msdk.foundation.error.b(880030), i10);
                            return;
                        }
                        return;
                    }
                    try {
                        zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.m().d());
                    } catch (Exception e10) {
                        p0.b(G, e10.getMessage());
                        zB = false;
                    }
                    if (!zB) {
                        if (this.f39552f != null) {
                            this.f39552f.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                            return;
                        }
                        return;
                    }
                    this.f39555i.clearResStateAndRemoveClose();
                    l lVarA = h.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f39547a);
                    this.f39558l = lVarA;
                    if (lVarA == null) {
                        this.f39558l = l.k(this.f39547a);
                    }
                    if (this.f39550d == null) {
                        this.f39550d = new com.mbridge.msdk.advanced.manager.b(this.f39548b, this.f39547a, 0L);
                    }
                    b bVar = this.f39552f;
                    if (bVar != null) {
                        bVar.a(str);
                        this.f39550d.a(this.f39552f);
                    }
                    this.f39555i.resetLoadState();
                    this.f39550d.a(this.f39555i);
                    this.f39550d.a(this.f39558l);
                    this.f39550d.a(this.f39567u, this.f39568v);
                    this.f39550d.a(this.f39561o);
                    this.f39550d.b(str, i10);
                    return;
                }
                if (this.f39552f != null) {
                    this.f39552f.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.content.Context] */
    private void a(Activity activity) {
        com.mbridge.msdk.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.f39551e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.m().d(), this.f39548b, this.f39547a);
            this.f39551e = cVar;
            cVar.a(this);
        }
        if (this.f39556j == null) {
            try {
                this.f39556j = new MBNativeAdvancedWebview(com.mbridge.msdk.foundation.controller.c.m().d());
            } catch (Exception e10) {
                p0.b(G, e10.getMessage());
            }
            if (this.f39557k == null) {
                try {
                    this.f39557k = new com.mbridge.msdk.advanced.view.a(this.f39547a, this.f39551e.b(), this);
                } catch (Exception e11) {
                    p0.b(G, e11.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f39556j;
            if (mBNativeAdvancedWebview != null && (aVar = this.f39557k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f39555i == null) {
            ?? D = com.mbridge.msdk.foundation.controller.c.m().d();
            if (activity == null) {
                activity = D;
            }
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(activity);
            this.f39555i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f39556j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f39556j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f39555i.addView(this.f39556j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f39572z == null) {
            this.f39572z = new MBOutNativeAdvancedViewGroup(com.mbridge.msdk.foundation.controller.c.m().d());
            if (this.f39567u != 0 && this.f39568v != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f39567u, this.f39568v);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f39572z.setLayoutParams(layoutParams);
            this.f39572z.setProvider(this);
            this.f39572z.addView(this.f39555i);
            this.f39572z.getViewTreeObserver().addOnScrollChangedListener(this.F);
        }
        if (this.f39560n == null) {
            this.f39560n = new j();
        }
        this.f39560n.a(com.mbridge.msdk.foundation.controller.c.m().d(), com.mbridge.msdk.foundation.controller.c.m().b(), com.mbridge.msdk.foundation.controller.c.m().c(), this.f39547a);
    }

    public String a(String str) {
        com.mbridge.msdk.advanced.manager.b bVar = this.f39550d;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    private void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f39568v = i10;
        this.f39567u = i11;
        this.f39572z.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }
}
