package com.ironsource;

import android.util.Log;
import com.ironsource.InterfaceC3334m4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.o4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3372o4 implements InterfaceC3527x7 {

    /* renamed from: a, reason: collision with root package name */
    private final C3316l4 f38026a;

    /* renamed from: b, reason: collision with root package name */
    private final kv.l f38027b;

    /* renamed from: c, reason: collision with root package name */
    private final C7 f38028c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3456t4 f38029d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38030e;

    /* renamed from: f, reason: collision with root package name */
    private C8 f38031f;

    /* renamed from: g, reason: collision with root package name */
    private long f38032g;

    /* renamed from: h, reason: collision with root package name */
    private final C3200ed f38033h;

    /* renamed from: i, reason: collision with root package name */
    private String f38034i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.o4$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements kv.l {
        public a(Object obj) {
            super(1, obj, C3372o4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C3372o4) this.receiver).b(obj);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((tu.z) obj).m7139unboximpl());
            return tu.x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.o4$b */
    public /* synthetic */ class b extends kotlin.jvm.internal.a0 implements kv.l {
        public b(Object obj) {
            super(1, obj, C3372o4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) throws JSONException {
            ((C3372o4) this.receiver).a(obj);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            a(((tu.z) obj).m7139unboximpl());
            return tu.x0.f87415a;
        }
    }

    public C3372o4(C3316l4 config, kv.l onFinish, C7 downloadManager, InterfaceC3456t4 currentTimeProvider) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(onFinish, "onFinish");
        kotlin.jvm.internal.e0.checkNotNullParameter(downloadManager, "downloadManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f38026a = config;
        this.f38027b = onFinish;
        this.f38028c = downloadManager;
        this.f38029d = currentTimeProvider;
        this.f38030e = "o4";
        this.f38031f = new C8(config.d(), "mobileController_0.html");
        this.f38032g = currentTimeProvider.a();
        this.f38033h = new C3200ed(config.a());
        this.f38034i = "";
    }

    @Override // com.ironsource.InterfaceC3527x7
    public C8 c() {
        return this.f38031f;
    }

    public final kv.l d() {
        return this.f38027b;
    }

    public final InterfaceC3456t4 a() {
        return this.f38029d;
    }

    @Override // com.ironsource.InterfaceC3527x7
    public void b() {
        this.f38032g = this.f38029d.a();
        new C3150c(new C3168d(this.f38033h), j1.o2.l(this.f38026a.d(), "/temp"), this.f38028c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC3527x7
    public boolean a(C8 file) {
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        String name = file.getName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(name, "file.name");
        return new sv.x("mobileController(_\\d+)?\\.html").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) throws JSONException {
        if (tu.z.m7136isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !kotlin.jvm.internal.e0.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.f38034i = string;
            C3354n4 c3354n4A = a(string);
            if (c3354n4A.j()) {
                C8 c8K = c3354n4A.k();
                this.f38031f = c8K;
                this.f38027b.invoke(c8K);
                return;
            }
            c3354n4A.m();
            return;
        }
        a("0").m();
    }

    private final C3354n4 a(String str) {
        return new C3354n4(new C3366ng(this.f38033h, str), e3.g.k(this.f38026a.d(), "/mobileController_", str, ".html"), this.f38028c, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        if (tu.z.m7137isSuccessimpl(obj)) {
            C8 c82 = (C8) (tu.z.m7136isFailureimpl(obj) ? null : obj);
            if (!kotlin.jvm.internal.e0.areEqual(c82 != null ? c82.getAbsolutePath() : null, this.f38031f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f38031f);
                    kotlin.jvm.internal.e0.checkNotNull(c82);
                    gv.s.copyTo$default(c82, this.f38031f, true, 0, 4, null);
                } catch (Exception e10) {
                    C3422r4.d().a(e10);
                    Log.e(this.f38030e, "Unable to copy downloaded mobileController.html to cache folder: " + e10.getMessage());
                }
                kotlin.jvm.internal.e0.checkNotNull(c82);
                this.f38031f = c82;
            }
            new InterfaceC3334m4.b(this.f38026a.b(), this.f38032g, this.f38029d).a();
        } else {
            new InterfaceC3334m4.a(this.f38026a.b()).a();
        }
        kv.l lVar = this.f38027b;
        if (tu.z.m7136isFailureimpl(obj)) {
            obj = null;
        }
        lVar.invoke(obj);
    }
}
