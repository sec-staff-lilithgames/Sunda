package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONObject;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Fd {

    /* renamed from: a, reason: collision with root package name */
    private final F7 f34381a;

    /* renamed from: b, reason: collision with root package name */
    private final kv.a f34382b;

    /* renamed from: c, reason: collision with root package name */
    private final L7 f34383c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f34384d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34385a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
            Fd.this.a(error.getMessage());
        }

        public void onResult(Object obj) {
            Fd.this.c();
        }
    }

    public Fd() {
        this(null, null, null, null, 15, null);
    }

    private final boolean b(Context context) {
        return IronSourceUtils.c(context);
    }

    private final void d() {
        this.f34381a.a(new C5(D5.REGISTER_TRIGGER, (JSONObject) null));
    }

    public final void c(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        d();
        try {
            MeasurementManager measurementManagerA = C3276j0.a(context);
            if (measurementManagerA == null) {
                a("could not obtain measurement manager");
            } else {
                measurementManagerA.registerTrigger(a(context), this.f34384d, a());
            }
        } catch (Exception e10) {
            a(e10.getMessage());
            C3422r4.d().a(e10);
        }
    }

    public Fd(F7 eventManager, kv.a getTimeFunction, L7 serviceProvider, Executor executor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventManager, "eventManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(getTimeFunction, "getTimeFunction");
        kotlin.jvm.internal.e0.checkNotNullParameter(serviceProvider, "serviceProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        this.f34381a = eventManager;
        this.f34382b = getTimeFunction;
        this.f34383c = serviceProvider;
        this.f34384d = executor;
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C3360na.b().c();
        List<String> list = concurrentHashMapC != null ? concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f37596b) : null;
        String str = list != null ? (String) uu.y0.first((List) list) : null;
        return str == null ? "" : str;
    }

    private final Uri a(Context context) {
        B7 b7I = this.f34383c.i();
        String strA = IronSourceUtils.a(context);
        Uri uriBuild = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(Q6.U0, b7I.I(context)).appendQueryParameter(Q6.K0, b7I.y(context)).appendQueryParameter("auid", b7I.d(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(Q6.f35267i0, String.valueOf(C3276j0.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(((Number) this.f34382b.invoke()).longValue())).appendQueryParameter(VPCjETNfjxu.VvRCNa, b7I.c(context)).appendQueryParameter("deviceCarrier", b7I.u(context)).appendQueryParameter("connectionType", strA).appendQueryParameter(C3119a4.f35922b, String.valueOf(sv.k0.equals(strA, C3119a4.f35922b, true))).build();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Fd(F7 f72, kv.a aVar, L7 l72, Executor executor, int i10, kotlin.jvm.internal.u uVar) {
        f72 = (i10 & 1) != 0 ? Mb.f34856s.d().q() : f72;
        aVar = (i10 & 2) != 0 ? a.f34385a : aVar;
        l72 = (i10 & 4) != 0 ? Mb.f34856s.d() : l72;
        if ((i10 & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
        }
        this(f72, aVar, l72, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f34381a.a(new C5(D5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    private final OutcomeReceiver a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f34381a.a(new C5(D5.REGISTER_TRIGGER_FAIL, new JSONObject().put("reason", str)));
    }
}
