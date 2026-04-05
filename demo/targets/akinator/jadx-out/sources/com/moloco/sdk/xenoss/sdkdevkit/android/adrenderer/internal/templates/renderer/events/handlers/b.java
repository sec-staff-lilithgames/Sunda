package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.core.app.NotificationCompat;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.c0;
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
import org.json.JSONException;
import org.json.JSONObject;
import tu.a0;
import tu.x0;
import uu.b2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f48414a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f48415b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f48416c;

    /* renamed from: d, reason: collision with root package name */
    public final MutableSharedFlow f48417d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48418i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48420k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48420k = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new a(this.f48420k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48418i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                b bVar = b.this;
                c0 c0Var = bVar.f48414a;
                String str = this.f48420k;
                e0.checkNotNull(str);
                MutableSharedFlow<x0> mutableSharedFlow = bVar.f48416c;
                this.f48418i = 1;
                if (c0Var.a(str, mutableSharedFlow, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    public b(c0 clickthroughService, CoroutineScope scope) {
        e0.checkNotNullParameter(clickthroughService, "clickthroughService");
        e0.checkNotNullParameter(scope, "scope");
        this.f48414a = clickthroughService;
        this.f48415b = scope;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f48416c = mutableSharedFlowMutableSharedFlow$default;
        this.f48417d = mutableSharedFlowMutableSharedFlow$default;
    }

    public final MutableSharedFlow<x0> c() {
        return this.f48417d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set<String> a() {
        return b2.setOf("clickthrough");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "ClickthroughEventHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException {
        e0.checkNotNullParameter(event, "event");
        if (!e0.areEqual(event.getString(NotificationCompat.CATEGORY_EVENT), y0.first(a()))) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), "Event not supported: " + event.getString(NotificationCompat.CATEGORY_EVENT), false, 4, null);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), a.b.k("Ad clicked on ", event.getString("contentType")), false, 4, null);
        BuildersKt__Builders_commonKt.launch$default(this.f48415b, null, null, new a(event.getString("url"), null), 3, null);
    }

    public /* synthetic */ b(c0 c0Var, CoroutineScope coroutineScope, int i10, u uVar) {
        this(c0Var, (i10 & 2) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope);
    }
}
