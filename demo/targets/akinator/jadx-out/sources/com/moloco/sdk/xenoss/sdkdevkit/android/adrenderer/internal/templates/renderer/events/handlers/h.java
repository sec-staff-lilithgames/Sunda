package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.core.app.NotificationCompat;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kv.p;
import org.json.JSONException;
import org.json.JSONObject;
import tu.a0;
import tu.x0;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f48451a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f48452b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f48453c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48454i;

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
            return h.this.new a(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48454i;
            h hVar = h.this;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, hVar.b(), "Content loaded event emitting", null, false, 12, null);
                MutableSharedFlow mutableSharedFlow = hVar.f48452b;
                Boolean boolBoxBoolean = bv.b.boxBoolean(true);
                this.f48454i = 1;
                if (mutableSharedFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, hVar.b(), "Content loaded event emitted", null, false, 12, null);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48456i;

        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return h.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48456i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = h.this.f48452b;
                Boolean boolBoxBoolean = bv.b.boxBoolean(false);
                this.f48456i = 1;
                if (mutableSharedFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

    public /* synthetic */ h(CoroutineScope coroutineScope, int i10, u uVar) {
        this((i10 & 1) != 0 ? com.google.android.gms.internal.play_billing.a.o() : coroutineScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "RequiredContentEventHandler";
    }

    public final SharedFlow<Boolean> c() {
        return this.f48453c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set<String> a() {
        return c2.setOf((Object[]) new String[]{"requiredContentLoaded", "requiredContentError"});
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException {
        e0.checkNotNullParameter(event, "event");
        String string = event.getString(NotificationCompat.CATEGORY_EVENT);
        if (e0.areEqual(string, "requiredContentLoaded")) {
            BuildersKt__Builders_commonKt.launch$default(this.f48451a, null, null, new a(null), 3, null);
        } else if (e0.areEqual(string, "requiredContentError")) {
            BuildersKt__Builders_commonKt.launch$default(this.f48451a, null, null, new b(null), 3, null);
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), a.b.k("Event not handled: ", string), false, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public h(CoroutineScope scope) {
        e0.checkNotNullParameter(scope, "scope");
        this.f48451a = scope;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f48452b = mutableSharedFlowMutableSharedFlow$default;
        this.f48453c = mutableSharedFlowMutableSharedFlow$default;
    }
}
