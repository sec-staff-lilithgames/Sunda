package tq;

import br.j0;
import br.n0;
import dq.q;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f87339a;

    /* renamed from: b, reason: collision with root package name */
    public final f f87340b;

    /* renamed from: c, reason: collision with root package name */
    public final f f87341c;

    /* renamed from: d, reason: collision with root package name */
    public final e f87342d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f87343e;

    /* renamed from: f, reason: collision with root package name */
    public final q f87344f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f87345g;

    public d(String sourceName, f stateGroupEventInterceptor, f animationEventInterceptor, e callbackProcessor, CoroutineScope coroutineScope, q coroutineDispatchers, Map<n0, ? extends List<j0>> map) {
        e0.checkNotNullParameter(sourceName, "sourceName");
        e0.checkNotNullParameter(stateGroupEventInterceptor, "stateGroupEventInterceptor");
        e0.checkNotNullParameter(animationEventInterceptor, "animationEventInterceptor");
        e0.checkNotNullParameter(callbackProcessor, "callbackProcessor");
        e0.checkNotNullParameter(coroutineScope, "coroutineScope");
        e0.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f87339a = sourceName;
        this.f87340b = stateGroupEventInterceptor;
        this.f87341c = animationEventInterceptor;
        this.f87342d = callbackProcessor;
        this.f87343e = coroutineScope;
        this.f87344f = coroutineDispatchers;
        this.f87345g = map == null ? new EnumMap<>(n0.class) : map;
    }

    @Override // tq.b
    public String e() {
        return this.f87339a;
    }

    @Override // tq.b
    public void f() {
        a(n0.OnPause, new Object[0]);
    }

    @Override // tq.b
    public void g() {
        a(n0.OnMidpoint, new Object[0]);
    }

    @Override // tq.b
    public void h() {
        a(n0.OnScheduled, new Object[0]);
    }

    @Override // tq.b
    public void i() {
        a(n0.OnFirstQuartile, new Object[0]);
    }

    @Override // tq.b
    public void j() {
        a(n0.OnStart, new Object[0]);
    }

    @Override // tq.b
    public void k() {
        a(n0.OnImpression, new Object[0]);
    }

    @Override // tq.b
    public void onClose() {
        a(n0.OnClose, new Object[0]);
    }

    @Override // tq.b
    public void onUseCustomClose(boolean z10) {
        a(n0.OnUseCustomClose, Boolean.valueOf(z10));
    }

    @Override // tq.b
    public void a(int i10) {
        a(n0.OnClick, Integer.valueOf(i10));
    }

    @Override // tq.b
    public void b(Integer num) {
        a(n0.OnMute, num);
    }

    @Override // tq.b
    public void c() {
        a(n0.OnThirdQuartile, new Object[0]);
    }

    @Override // tq.b
    public void d() {
        a(n0.OnSkip, new Object[0]);
    }

    @Override // tq.b
    public void a(Integer num) {
        a(n0.OnUnMute, num);
    }

    @Override // tq.b
    public void b() {
        a(n0.OnResume, new Object[0]);
    }

    @Override // tq.b
    public void a() {
        a(n0.OnComplete, new Object[0]);
    }

    @Override // tq.b
    public void a(long j10, long j11) {
        a(n0.OnProgress, Long.valueOf(j10), Long.valueOf(j11));
    }

    @Override // tq.b
    public void a(String url) {
        e0.checkNotNullParameter(url, "url");
        a(n0.OnNavigate, url);
    }

    public final void a(n0 eventType, Object... params) {
        e0.checkNotNullParameter(eventType, "eventType");
        e0.checkNotNullParameter(params, "params");
        BuildersKt__Builders_commonKt.launch$default(this.f87343e, this.f87344f.b(), null, new c(this, params, eventType, null), 2, null);
    }
}
