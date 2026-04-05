package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.ironsource.C3191e4;
import com.ironsource.C3460t8;
import com.ironsource.InterfaceC3453t1;
import com.ironsource.sdk.utils.Logger;
import java.util.concurrent.Executors;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.r1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3419r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f38247a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final String f38248b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.r1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f38249a;

        /* renamed from: b, reason: collision with root package name */
        private final C3460t8.e f38250b;

        /* renamed from: c, reason: collision with root package name */
        private final String f38251c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f38252d;

        public a(String name, C3460t8.e productType, String demandSourceName, JSONObject params) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(productType, "productType");
            kotlin.jvm.internal.e0.checkNotNullParameter(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
            this.f38249a = name;
            this.f38250b = productType;
            this.f38251c = demandSourceName;
            this.f38252d = params;
        }

        public final String a() {
            return this.f38249a;
        }

        public final C3460t8.e b() {
            return this.f38250b;
        }

        public final String c() {
            return this.f38251c;
        }

        public final JSONObject d() {
            return this.f38252d;
        }

        public final String e() {
            return this.f38251c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f38249a, aVar.f38249a) && this.f38250b == aVar.f38250b && kotlin.jvm.internal.e0.areEqual(this.f38251c, aVar.f38251c) && kotlin.jvm.internal.e0.areEqual(this.f38252d.toString(), aVar.f38252d.toString());
        }

        public final String f() {
            return this.f38249a;
        }

        public final JSONObject g() {
            return this.f38252d;
        }

        public final C3460t8.e h() {
            return this.f38250b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final JSONObject i() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject(this.f38252d.toString()).put(C3191e4.h.f36495m, this.f38250b).put("demandSourceName", this.f38251c);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectPut, "JSONObject(params.toStri…eName\", demandSourceName)");
            return jSONObjectPut;
        }

        public String toString() {
            return "CallbackResult(name=" + this.f38249a + ", productType=" + this.f38250b + ", demandSourceName=" + this.f38251c + ", params=" + this.f38252d + ")";
        }

        public final a a(String name, C3460t8.e productType, String demandSourceName, JSONObject params) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(productType, "productType");
            kotlin.jvm.internal.e0.checkNotNullParameter(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
            return new a(name, productType, demandSourceName, params);
        }

        public static /* synthetic */ a a(a aVar, String str, C3460t8.e eVar, String str2, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f38249a;
            }
            if ((i10 & 2) != 0) {
                eVar = aVar.f38250b;
            }
            if ((i10 & 4) != 0) {
                str2 = aVar.f38251c;
            }
            if ((i10 & 8) != 0) {
                jSONObject = aVar.f38252d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.r1$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ironsource.r1$c */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f38253a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f38255c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f38256d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ MotionEvent f38257e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f38255c = measurementManager;
            this.f38256d = uri;
            this.f38257e = motionEvent;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            return C3419r1.this.new c(this.f38255c, this.f38256d, this.f38257e, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f38253a;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                C3419r1 c3419r1 = C3419r1.this;
                MeasurementManager measurementManager = this.f38255c;
                Uri uri = this.f38256d;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri, "uri");
                MotionEvent motionEvent = this.f38257e;
                this.f38253a = 1;
                if (c3419r1.a(measurementManager, uri, motionEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return tu.x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ironsource.r1$d */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f38258a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeasurementManager f38260c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f38261d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MeasurementManager measurementManager, Uri uri, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f38260c = measurementManager;
            this.f38261d = uri;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
            return C3419r1.this.new d(this.f38260c, this.f38261d, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f38258a;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                C3419r1 c3419r1 = C3419r1.this;
                MeasurementManager measurementManager = this.f38260c;
                Uri uri = this.f38261d;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri, "uri");
                this.f38258a = 1;
                if (c3419r1.a(measurementManager, uri, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return tu.x0.f87415a;
        }
    }

    static {
        String name = b.class.getName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(name, "this::class.java.name");
        f38248b = name;
    }

    public final a a(Context context, InterfaceC3453t1 message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        if (message instanceof InterfaceC3453t1.a) {
            return a(context, (InterfaceC3453t1.a) message);
        }
        throw new tu.t();
    }

    private final a a(Context context, InterfaceC3453t1.a aVar) {
        MeasurementManager measurementManagerA = C3276j0.a(context);
        if (measurementManagerA == null) {
            Logger.i(f38248b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof InterfaceC3453t1.a.b) {
                return a(aVar, measurementManagerA);
            }
            if (aVar instanceof InterfaceC3453t1.a.C0246a) {
                return a((InterfaceC3453t1.a.C0246a) aVar, measurementManagerA);
            }
            throw new tu.t();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return a(aVar, a.b.k("failed to handle attribution, message: ", e10.getMessage()));
        }
    }

    private final a a(InterfaceC3453t1.a aVar, MeasurementManager measurementManager) throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new d(measurementManager, Uri.parse(aVar.b()), null), 1, null);
        return a(aVar);
    }

    private final a a(InterfaceC3453t1.a.C0246a c0246a, MeasurementManager measurementManager) throws InterruptedException {
        Uri uri = Uri.parse(c0246a.b());
        long jUptimeMillis = SystemClock.uptimeMillis();
        BuildersKt__BuildersKt.runBlocking$default(null, new c(measurementManager, uri, MotionEvent.obtain(jUptimeMillis, jUptimeMillis, c0246a.n(), c0246a.o().c(), c0246a.o().d(), c0246a.p()), null), 1, null);
        return a(c0246a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(MeasurementManager measurementManager, Uri uri, MotionEvent motionEvent, zu.d<? super tu.x0> dVar) throws Throwable {
        zu.o oVar = new zu.o(av.b.intercepted(dVar));
        measurementManager.registerSource(uri, motionEvent, Executors.newSingleThreadExecutor(), C3436s1.a(oVar));
        Object orThrow = oVar.getOrThrow();
        if (orThrow == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return orThrow == av.e.getCOROUTINE_SUSPENDED() ? orThrow : tu.x0.f87415a;
    }

    private final a a(InterfaceC3453t1.a aVar) throws JSONException {
        JSONObject params = new JSONObject().put("params", new JSONObject().put("type", aVar instanceof InterfaceC3453t1.a.C0246a ? "click" : "impression"));
        String strA = aVar.a();
        C3460t8.e eVarD = aVar.d();
        String strE = aVar.e();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(params, "params");
        return new a(strA, eVarD, strE, params);
    }

    private final a a(InterfaceC3453t1 interfaceC3453t1, String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("reason", str).put("type", interfaceC3453t1 instanceof InterfaceC3453t1.a.C0246a ? "click" : "impression");
        String strC = interfaceC3453t1.c();
        C3460t8.e eVarD = interfaceC3453t1.d();
        String strE = interfaceC3453t1.e();
        JSONObject jSONObjectPut2 = new JSONObject().put("params", jSONObjectPut);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectPut2, "JSONObject().put(\"params\", payload)");
        return new a(strC, eVarD, strE, jSONObjectPut2);
    }
}
