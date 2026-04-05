package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.core.app.NotificationCompat;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kv.p;
import org.json.JSONObject;
import tu.a0;
import tu.x0;
import uu.b2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f48421a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f48422b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f48423c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48424i;

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48424i;
            x0 x0Var = x0.f87415a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return x0Var;
            }
            a0.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = c.this.f48422b;
            this.f48424i = 1;
            return mutableSharedFlow.emit(x0Var, this) == coroutine_suspended ? coroutine_suspended : x0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "CloseHandler";
    }

    public final MutableSharedFlow<x0> c() {
        return this.f48423c;
    }

    public c(CoroutineScope scope) {
        e0.checkNotNullParameter(scope, "scope");
        this.f48421a = scope;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f48422b = mutableSharedFlowMutableSharedFlow$default;
        this.f48423c = mutableSharedFlowMutableSharedFlow$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set<String> a() {
        return b2.setOf("close");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) {
        e0.checkNotNullParameter(event, "event");
        if (!e0.areEqual(event.getString(NotificationCompat.CATEGORY_EVENT), y0.first(a()))) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not supported: " + event.getString(NotificationCompat.CATEGORY_EVENT), false, 4, null);
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f48421a, null, null, new a(null), 3, null);
    }

    public /* synthetic */ c(CoroutineScope coroutineScope, int i10, u uVar) {
        this((i10 & 1) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope);
    }
}
