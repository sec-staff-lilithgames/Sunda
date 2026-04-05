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
import org.json.JSONException;
import org.json.JSONObject;
import tu.a0;
import tu.x0;
import uu.b2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f48438a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f48439b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f48440c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final C0439a f48441c;

        /* renamed from: e, reason: collision with root package name */
        public static final a f48442e = new a("VIDEO", 0, "videoContainer");

        /* renamed from: f, reason: collision with root package name */
        public static final a f48443f = new a("MRAID", 1, "mraidContainer");

        /* renamed from: g, reason: collision with root package name */
        public static final a f48444g = new a("STATIC", 2, "staticContainer");

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ a[] f48445h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ cv.a f48446i;

        /* renamed from: b, reason: collision with root package name */
        public final String f48447b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g$a$a, reason: collision with other inner class name */
        public static final class C0439a {
            public /* synthetic */ C0439a(u uVar) {
                this();
            }

            public final a a(String value) {
                e0.checkNotNullParameter(value, "value");
                for (a aVar : a.values()) {
                    if (e0.areEqual(aVar.c(), value)) {
                        return aVar;
                    }
                }
                return null;
            }

            public C0439a() {
            }
        }

        static {
            a[] aVarArrA = a();
            f48445h = aVarArrA;
            f48446i = cv.b.enumEntries(aVarArrA);
            f48441c = new C0439a(null);
        }

        public a(String str, int i10, String str2) {
            this.f48447b = str2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f48442e, f48443f, f48444g};
        }

        public static cv.a b() {
            return f48446i;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f48445h.clone();
        }

        public final String c() {
            return this.f48447b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48448i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ a f48450k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f48450k = aVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return g.this.new b(this.f48450k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48448i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = g.this.f48439b;
                this.f48448i = 1;
                if (mutableSharedFlow.emit(this.f48450k, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "PlayListItemDisplayingEventHandler";
    }

    public final MutableSharedFlow<a> c() {
        return this.f48440c;
    }

    public g(CoroutineScope scope) {
        e0.checkNotNullParameter(scope, "scope");
        this.f48438a = scope;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f48439b = mutableSharedFlowMutableSharedFlow$default;
        this.f48440c = mutableSharedFlowMutableSharedFlow$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set<String> a() {
        return b2.setOf("playlistItemDisplaying");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException {
        e0.checkNotNullParameter(event, "event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, b(), event + " displaying.", false, 4, null);
        if (!e0.areEqual(event.getString(NotificationCompat.CATEGORY_EVENT), y0.first(a()))) {
            MolocoLogger.debug$default(molocoLogger, b(), "Event not supported: " + event.getString(NotificationCompat.CATEGORY_EVENT), false, 4, null);
            return;
        }
        String string = event.getString("creativeType");
        a.C0439a c0439a = a.f48441c;
        e0.checkNotNull(string);
        a aVarA = c0439a.a(string);
        MolocoLogger.debug$default(molocoLogger, b(), aVarA + " displaying.", false, 4, null);
        if (aVarA != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f48438a, null, null, new b(aVarA, null), 3, null);
        }
    }

    public /* synthetic */ g(CoroutineScope coroutineScope, int i10, u uVar) {
        this((i10 & 1) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()) : coroutineScope);
    }
}
