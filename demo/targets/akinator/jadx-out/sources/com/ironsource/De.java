package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.Me;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class De {

    /* renamed from: a, reason: collision with root package name */
    private final V9 f34201a = new V9();

    /* renamed from: b, reason: collision with root package name */
    private final C3411q9 f34202b = new C3411q9(IronSourceThreadManager.INSTANCE.getInitHandler());

    /* renamed from: c, reason: collision with root package name */
    private final B7 f34203c = Mb.f34856s.d().i();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends AbstractRunnableC3273ie {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f34204b;

        public a(Runnable runnable) {
            this.f34204b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3273ie
        public void a() {
            this.f34204b.run();
        }
    }

    public final void a(AbstractRunnableC3273ie safeRunnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (Object) null);
    }

    public final B7 b() {
        return this.f34203c;
    }

    public final V9 c() {
        return this.f34201a;
    }

    public final void d(Runnable callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    public final void e(Runnable callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    public final void f() {
        com.ironsource.mediationsdk.r.m().S();
    }

    public final void g() {
        Mb.f34856s.d().q().a(new C5(D5.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.b(false)));
    }

    public static /* synthetic */ void a(De de2, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        de2.a(runnable, j10);
    }

    public final void b(AbstractRunnableC3273ie safeRunnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f34202b.a(safeRunnable);
    }

    public final void c(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        this.f34202b.b(runnable);
    }

    public final C3161ca d() {
        return com.ironsource.mediationsdk.r.m().s();
    }

    public final void a(Runnable runnable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j10);
    }

    public final void b(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final boolean c(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return IronSourceUtils.g(context);
    }

    public final void a(Runnable callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        this.f34202b.a(callback);
    }

    public final String b(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        String strM = this.f34203c.M(context);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strM, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strM;
    }

    public final boolean e() {
        return IronSourceUtils.g();
    }

    public final void a(AbstractRunnableC3273ie safeRunnable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f34202b.a(safeRunnable, j10);
    }

    public static /* synthetic */ void a(De de2, AbstractRunnableC3273ie abstractRunnableC3273ie, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        de2.a(abstractRunnableC3273ie, j10);
    }

    public final void a(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        N6.a().a(key, value);
    }

    public final void a(long j10, Me.a responseOrigin) {
        kotlin.jvm.internal.e0.checkNotNullParameter(responseOrigin, "responseOrigin");
        com.ironsource.mediationsdk.r.m().a(j10, responseOrigin);
    }

    public final String a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        String strB = com.ironsource.mediationsdk.r.m().b(context);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strB, "getInstance().getAdvertiserId(context)");
        return strB;
    }

    public final Me a(Context context, String appKey) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(appKey, "appKey");
        return com.ironsource.mediationsdk.r.m().a(context, appKey);
    }

    public final void a(D1 reporterSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(reporterSettings, "reporterSettings");
        C3422r4.d().a(reporterSettings.b(), reporterSettings.d(), reporterSettings.c(), reporterSettings.e(), IronSourceUtils.d(), reporterSettings.a(), reporterSettings.g());
    }

    public final void a(Be initStatus) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initStatus, "initStatus");
        Ce.f33927a.a(initStatus);
    }

    public final void a() {
        Dd.c().a();
    }
}
