package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.C3377o9;
import com.ironsource.Me;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3514wb {

    /* renamed from: a, reason: collision with root package name */
    private final C3411q9 f39180a = new C3411q9(null, 1, 0 == true ? 1 : 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.wb$a */
    public static final class a extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f39181b;

        public a(Runnable runnable) {
            this.f39181b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            this.f39181b.run();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.wb$b */
    public static final class b extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kv.a f39182b;

        public b(kv.a aVar) {
            this.f39182b = aVar;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            this.f39182b.invoke();
        }
    }

    public final void a(AbstractRunnableC3273ie safeRunnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final void b(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        a(this, new ki(this, runnable, 0), 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3514wb this$0, Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "$runnable");
        this$0.f39180a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C3514wb this$0, final Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.li
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                C3514wb.a(this.f37177b, runnable, j10);
            }
        });
    }

    public final void c(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        a(this, new ki(this, runnable, 1), 0L, 2, (Object) null);
    }

    public final void d(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        this.f39180a.b(runnable);
    }

    public final void e(Runnable callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3514wb this$0, Runnable runnable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "$runnable");
        this$0.b(runnable);
    }

    public final void b(AbstractRunnableC3273ie safeRunnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f39180a.a(safeRunnable);
    }

    public static /* synthetic */ void a(C3514wb c3514wb, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3514wb.a(runnable, j10);
    }

    public final void b(String adUnitId, int i10, String str) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C3518wf.a(D5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public final void a(Runnable runnable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j10);
    }

    public final void a(Runnable callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        this.f39180a.a(callback);
    }

    public final void a(AbstractRunnableC3273ie safeRunnable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f39180a.a(safeRunnable, j10);
    }

    public static /* synthetic */ void a(C3514wb c3514wb, AbstractRunnableC3273ie abstractRunnableC3273ie, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3514wb.a(abstractRunnableC3273ie, j10);
    }

    public static /* synthetic */ void a(C3514wb c3514wb, kv.a aVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3514wb.a(aVar, j10);
    }

    public final void a(kv.a action, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        a((AbstractRunnableC3273ie) new b(action), j10);
    }

    public final Handler a() {
        return this.f39180a.a();
    }

    public final void a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        C3377o9.a aVar = C3377o9.f38041a;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    public final IronSource.a[] a(LevelPlay.AdFormat... adFormats) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    public final IronSource.a a(LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(AdapterBaseInterface networkAdapter, IronSource.a adFormat, String providerName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkAdapter, "networkAdapter");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(providerName, "providerName");
        return C3518wf.a(networkAdapter, adFormat, providerName);
    }

    public final void a(long j10, Me.a responseOrigin, long j11) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(responseOrigin, "responseOrigin");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
        String strB = responseOrigin.b();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strB, "responseOrigin.value");
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, a(strB, j11));
        C3518wf.a(D5.SDK_INIT_SUCCESS, jSONObject);
    }

    private final String a(String str, long j10) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j10;
    }

    public final void a(C3364ne error, long j10) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, error.c());
        jSONObject.put("reason", error.d());
        jSONObject.put("isMultipleAdUnits", 1);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
        C3518wf.a(D5.SDK_INIT_FAILED, jSONObject);
    }

    public final void a(String placementName, LevelPlay.AdFormat adFormat, int i10, String str) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(C3144bb.f36069f, adFormat.getValue());
        jSONObject.put("adf", C3518wf.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        C3518wf.a(D5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(String adUnitId, int i10, String str) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        C3518wf.a(D5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }
}
