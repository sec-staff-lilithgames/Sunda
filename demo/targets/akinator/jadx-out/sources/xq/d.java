package xq;

import dq.q;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements CoroutineScope, b {

    /* renamed from: b, reason: collision with root package name */
    public final c f92202b;

    /* renamed from: c, reason: collision with root package name */
    public final m f92203c;

    public d(c adState, q coroutineDispatchers) {
        e0.checkNotNullParameter(adState, "adState");
        e0.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f92202b = adState;
        this.f92203c = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatchers.e());
        if (adState.h()) {
            CoroutineScopeKt.cancel$default(this, null, 1, null);
        } else {
            adState.a(this);
        }
    }

    @Override // xq.b
    public void a(c source, a event) {
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(event, "event");
        if (event == a.f92200n && e0.areEqual(this.f92202b, source)) {
            CoroutineScopeKt.cancel$default(this, null, 1, null);
            source.b(this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return this.f92203c;
    }
}
