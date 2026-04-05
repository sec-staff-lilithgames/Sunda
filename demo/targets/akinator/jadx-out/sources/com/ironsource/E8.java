package com.ironsource;

import android.app.Activity;
import com.ironsource.C3191e4;
import com.ironsource.C3219fe;
import com.ironsource.C3460t8;
import com.ironsource.I8;
import com.ironsource.J8;
import com.ironsource.Vb;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class E8 implements I8 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f34259j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f34260a;

    /* renamed from: b, reason: collision with root package name */
    private final Vb f34261b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3511w8 f34262c;

    /* renamed from: d, reason: collision with root package name */
    private G8 f34263d;

    /* renamed from: e, reason: collision with root package name */
    private String f34264e;

    /* renamed from: f, reason: collision with root package name */
    private String f34265f;

    /* renamed from: g, reason: collision with root package name */
    private Long f34266g;

    /* renamed from: h, reason: collision with root package name */
    private I8.a f34267h;

    /* renamed from: i, reason: collision with root package name */
    private J8 f34268i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final E8 a() {
            String strC = w0.i.c("randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new E8(strC, new Ub(strC, controllerManager, null, null, 12, null), new C3528x8());
        }

        private a() {
        }
    }

    public E8(String id2, Vb controller, InterfaceC3511w8 eventTracker) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(controller, "controller");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventTracker, "eventTracker");
        this.f34260a = id2;
        this.f34261b = controller;
        this.f34262c = eventTracker;
        controller.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3494v8 d() {
        C3494v8 c3494v8A = new C3494v8().a(G5.f34450x, this.f34265f).a(G5.f34448v, this.f34264e).a(G5.f34449w, C3460t8.e.NativeAd.toString()).a(G5.I, Long.valueOf(j()));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3494v8A, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return c3494v8A;
    }

    public static final E8 e() {
        return f34259j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l9 = this.f34266g;
        if (l9 == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l9.longValue();
    }

    public final String h() {
        return this.f34264e;
    }

    public final String i() {
        return this.f34265f;
    }

    @Override // com.ironsource.I8
    public I8.a b() {
        return this.f34267h;
    }

    @Override // com.ironsource.I8
    public G8 c() {
        return this.f34263d;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Vb.a {
        public b() {
        }

        @Override // com.ironsource.Vb.a
        public void a(G8 adData) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adData, "adData");
            E8.this.f34263d = adData;
            InterfaceC3511w8 interfaceC3511w8 = E8.this.f34262c;
            C3219fe.a loadAdSuccess = C3219fe.f36709l;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> mapA = E8.this.d().a();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapA, "baseEventParams().data");
            interfaceC3511w8.a(loadAdSuccess, mapA);
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.Vb.a
        public void g() {
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Vb.a
        public void a(String reason) {
            kotlin.jvm.internal.e0.checkNotNullParameter(reason, "reason");
            C3494v8 c3494v8A = E8.this.d().a(G5.A, reason);
            InterfaceC3511w8 interfaceC3511w8 = E8.this.f34262c;
            C3219fe.a loadAdFailed = C3219fe.f36704g;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> mapA = c3494v8A.a();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapA, "eventParams.data");
            interfaceC3511w8.a(loadAdFailed, mapA);
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.Vb.a
        public void a() {
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.I8
    public void a(I8.a aVar) {
        this.f34267h = aVar;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements J8.a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34271a;

            static {
                int[] iArr = new int[J8.b.values().length];
                try {
                    iArr[J8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f34271a = iArr;
            }
        }

        public c() {
        }

        @Override // com.ironsource.J8.a
        public void a(J8.b viewName) throws JSONException {
            kotlin.jvm.internal.e0.checkNotNullParameter(viewName, "viewName");
            if (a.f34271a[viewName.ordinal()] == 1) {
                E8.this.f34261b.c();
                return;
            }
            JSONObject clickParams = new JSONObject().put("viewName", viewName.b());
            Vb vb2 = E8.this.f34261b;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(clickParams, "clickParams");
            vb2.a(clickParams);
        }

        @Override // com.ironsource.J8.a
        public void a(rg viewVisibilityParams) {
            kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            E8.this.f34261b.a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.I8
    public void a(Activity activity, JSONObject loadParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadParams, "loadParams");
        this.f34266g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.f34264e = loadParams.optString("demandSourceName");
        this.f34265f = loadParams.optString("inAppBidding");
        InterfaceC3511w8 interfaceC3511w8 = this.f34262c;
        C3219fe.a loadAd = C3219fe.f36703f;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> mapA = d().a();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        interfaceC3511w8.a(loadAd, mapA);
        JSONObject jSONObject = new JSONObject(loadParams.toString());
        jSONObject.put(C3191e4.h.f36520y0, String.valueOf(this.f34266g));
        this.f34261b.a(activity, jSONObject);
    }

    public /* synthetic */ E8(String str, Vb vb2, InterfaceC3511w8 interfaceC3511w8, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? w0.i.c("randomUUID().toString()") : str, vb2, interfaceC3511w8);
    }

    @Override // com.ironsource.I8
    public void a(J8 viewHolder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapA = d().a();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapA, "baseEventParams().data");
        linkedHashMap.putAll(mapA);
        String string = viewHolder.t().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(G5.f34451y, string);
        InterfaceC3511w8 interfaceC3511w8 = this.f34262c;
        C3219fe.a registerAd = C3219fe.f36711n;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(registerAd, "registerAd");
        interfaceC3511w8.a(registerAd, linkedHashMap);
        this.f34268i = viewHolder;
        viewHolder.a(g());
        this.f34261b.a(viewHolder);
    }

    @Override // com.ironsource.I8
    public void a() {
        J8 j82 = this.f34268i;
        if (j82 != null) {
            j82.a((J8.a) null);
        }
        this.f34261b.a();
    }
}
