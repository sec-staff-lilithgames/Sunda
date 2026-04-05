package com.mbridge.msdk.mbnative.service;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.mbnative.controller.d;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private NativeController f41789a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f41790b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.listener.a f41791c;

    /* renamed from: d, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f41792d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbnative.service.a$a, reason: collision with other inner class name */
    public class RunnableC0294a implements Runnable {
        public RunnableC0294a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f();
        }
    }

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f41791c.onAdLoadError("current request is loading");
        this.f41791c.b();
    }

    public static void preload(Map<String, Object> map, int i10) {
        p0.c("NativeProvider", "native provider preload");
        new d().a(map, i10);
    }

    public void b(View view, Campaign campaign) {
        p0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f41789a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view);
    }

    public String c() {
        NativeController nativeController = this.f41789a;
        return nativeController != null ? nativeController.g() : "";
    }

    public void d() throws JSONException {
        a(0, "");
    }

    public void e() throws JSONException {
        a(1, "");
    }

    public void a(com.mbridge.msdk.mbnative.listener.a aVar) {
        this.f41791c = aVar;
    }

    public void g() {
        try {
            this.f41789a.i();
        } catch (Exception unused) {
            p0.b(GalEuEfxjome.adEnRkM, "release failed");
        }
    }

    public a(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f41791c = aVar;
        this.f41792d = nativeTrackingListener;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f41792d = nativeTrackingListener;
    }

    public void a(Context context, Resources resources, Map<String, Object> map) {
        this.f41789a = new NativeController(this.f41791c, this.f41792d, map, context);
    }

    public void b(View view, List<View> list, Campaign campaign) {
        p0.c("NativeProvider", "native provider unregisterView");
        NativeController nativeController = this.f41789a;
        if (nativeController == null) {
            return;
        }
        nativeController.b(campaign, view, list);
    }

    public void a(String str) throws JSONException {
        a(0, str);
    }

    public void a() {
        try {
            this.f41789a.d();
        } catch (Exception unused) {
            p0.b("NativeProvider", "clear cache failed");
        }
    }

    public String b() {
        NativeController nativeController = this.f41789a;
        if (nativeController != null) {
            return nativeController.e();
        }
        return "";
    }

    public void a(View view, List<View> list, Campaign campaign) {
        NativeController nativeController = this.f41789a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view, list);
    }

    public void a(View view, Campaign campaign) {
        p0.c("NativeProvider", "native provider registerView");
        NativeController nativeController = this.f41789a;
        if (nativeController == null) {
            return;
        }
        nativeController.a(campaign, view);
    }

    private void a(int i10, String str) throws JSONException {
        if (this.f41789a != null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f41791c;
            if (aVar != null && aVar.a()) {
                if (u0.h()) {
                    f();
                    return;
                } else {
                    this.f41790b.post(new RunnableC0294a());
                    return;
                }
            }
            com.mbridge.msdk.mbnative.listener.a aVar2 = this.f41791c;
            if (aVar2 != null) {
                aVar2.b();
            }
            this.f41789a.a(i10, str);
        }
    }
}
