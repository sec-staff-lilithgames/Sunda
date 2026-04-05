package com.ironsource;

import android.app.Activity;
import com.ironsource.C3191e4;
import com.ironsource.G8;
import com.ironsource.Vb;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ub implements Vb {

    /* renamed from: a, reason: collision with root package name */
    private final String f35550a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ironsource.sdk.controller.e f35551b;

    /* renamed from: c, reason: collision with root package name */
    private final X8 f35552c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3116a1 f35553d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35554e;

    /* renamed from: f, reason: collision with root package name */
    private Vb.a f35555f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35556a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final String f35557b = "nativeAd.load";

        /* renamed from: c, reason: collision with root package name */
        public static final String f35558c = "nativeAd.loadReport";

        /* renamed from: d, reason: collision with root package name */
        public static final String f35559d = "nativeAd.register";

        /* renamed from: e, reason: collision with root package name */
        public static final String f35560e = "nativeAd.click";

        /* renamed from: f, reason: collision with root package name */
        public static final String f35561f = "nativeAd.privacyClick";

        /* renamed from: g, reason: collision with root package name */
        public static final String f35562g = "nativeAd.visibilityChanged";

        /* renamed from: h, reason: collision with root package name */
        public static final String f35563h = "nativeAd.destroy";

        private a() {
        }
    }

    public Ub(String id2, com.ironsource.sdk.controller.e controllerManager, X8 imageLoader, InterfaceC3116a1 adViewManagement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(controllerManager, "controllerManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(imageLoader, "imageLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.f35550a = id2;
        this.f35551b = controllerManager;
        this.f35552c = imageLoader;
        this.f35553d = adViewManagement;
        this.f35554e = "Ub";
        controllerManager.a(id2, d());
    }

    @Override // com.ironsource.Vb
    public void a(Vb.a aVar) {
        this.f35555f = aVar;
    }

    private final l.b d() {
        return new l.b() { // from class: com.ironsource.ph
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Ob ob2) {
                Ub.a(this.f38192a, ob2);
            }
        };
    }

    private final JSONObject e() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(f.b.f38561g, a.f35560e).put("sdkCallback", C3191e4.g.U);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.ironsource.Vb
    public void a(Activity activity, JSONObject loadParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadParams, "loadParams");
        this.f35551b.a(activity);
        this.f35551b.a(new f.c(this.f35550a, a.f35557b, loadParams), new oh(this, activity, 0));
    }

    @Override // com.ironsource.Vb
    public Vb.a b() {
        return this.f35555f;
    }

    @Override // com.ironsource.Vb
    public void c() {
        this.f35551b.a(new f.c(this.f35550a, a.f35561f, new JSONObject()), (l.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ub this$0, f.a it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this$0.b(it);
    }

    private final void b(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f35554e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.f35554e, "failed to handle show on native ad: " + strOptString);
            return;
        }
        Vb.a aVarB = b();
        if (aVarB != null) {
            aVarB.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ub this$0, Activity activity, f.a it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "$activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this$0.a(activity, it);
    }

    private final void a(Activity activity, f.a aVar) {
        if (aVar.d() == null) {
            Vb.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Vb.a aVarB2 = b();
            if (aVarB2 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(reason, "reason");
                aVarB2.a(reason);
                return;
            }
            return;
        }
        G8.b bVarA = new G8.a(this.f35552c, this.f35553d).a(activity, aVar.d());
        a(bVarA, bVarA.a().h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Ub(String str, com.ironsource.sdk.controller.e eVar, X8 x82, InterfaceC3116a1 interfaceC3116a1, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 4) != 0) {
            x82 = new W8(null, 1, 0 == true ? 1 : 0);
        }
        if ((i10 & 8) != 0) {
            interfaceC3116a1 = C3410q8.a();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(interfaceC3116a1, "getInstance()");
        }
        this(str, eVar, x82, interfaceC3116a1);
    }

    private final void a(G8.b bVar, G8 g8) {
        this.f35551b.a(new f.c(this.f35550a, a.b.k("nativeAd.loadReport.", this.f35550a), bVar.b()), new oh(this, g8, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ub this$0, G8 adData, f.a it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adData, "$adData");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this$0.a(adData, it);
    }

    private final void a(G8 g8, f.a aVar) {
        if (aVar.d() == null) {
            Vb.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Vb.a aVarB2 = b();
            if (aVarB2 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(reason, "reason");
                aVarB2.a(reason);
                return;
            }
            return;
        }
        Vb.a aVarB3 = b();
        if (aVarB3 != null) {
            aVarB3.a(g8);
        }
    }

    @Override // com.ironsource.Vb
    public void a() {
        this.f35551b.a(new f.c(this.f35550a, a.f35563h, new JSONObject()), (l.a) null);
    }

    @Override // com.ironsource.Vb
    public void a(J8 viewHolder) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.t()).put("adViewClickCommand", e());
        String str = this.f35550a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(params, "params");
        this.f35551b.a(new f.c(str, a.f35559d, params), (l.a) null);
    }

    @Override // com.ironsource.Vb
    public void a(rg viewVisibilityParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.f35551b.a(new f.c(this.f35550a, a.f35562g, viewVisibilityParams.g()), new qh(this, 1));
    }

    @Override // com.ironsource.Vb
    public void a(JSONObject clickParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(clickParams, "clickParams");
        this.f35551b.a(new f.c(this.f35550a, a.f35560e, clickParams), new qh(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ub this$0, f.a it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this$0.a(it);
    }

    private final void a(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f35554e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String strOptString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.f35554e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        Vb.a aVarB = b();
        if (aVarB != null) {
            aVarB.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ub this$0, Ob msg) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(msg, "msg");
        if (kotlin.jvm.internal.e0.areEqual(msg.e(), a.f35560e)) {
            this$0.a(msg);
        }
    }

    private final void a(Ob ob2) {
        if (ob2.f() == null) {
            Logger.i(this.f35554e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!ob2.f().optBoolean("success", false)) {
            String strOptString = ob2.f().optString("reason", "unexpected error");
            Logger.i(this.f35554e, "failed to handle click on native ad: " + strOptString);
            return;
        }
        Vb.a aVarB = b();
        if (aVarB != null) {
            aVarB.g();
        }
    }
}
