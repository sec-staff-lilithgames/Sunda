package io.odeeo.internal.w1;

import android.view.View;
import android.widget.PopupWindow;
import io.odeeo.internal.v1.s;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import sv.n0;
import tu.a0;
import tu.t;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final PopupWindow f67427a;

    /* renamed from: b, reason: collision with root package name */
    public final io.odeeo.internal.w1.c f67428b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f67429c;

    /* renamed from: d, reason: collision with root package name */
    public final MutableStateFlow<a> f67430d;

    /* renamed from: e, reason: collision with root package name */
    public final Flow<a> f67431e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {

        /* renamed from: c, reason: collision with root package name */
        public static final C0686a f67432c = new C0686a(null);

        /* renamed from: a, reason: collision with root package name */
        public final float f67433a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f67434b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.w1.j$a$a, reason: collision with other inner class name */
        public static final class C0686a {
            public C0686a() {
            }

            public final a getCoverageStatus(float f10) {
                u uVar = null;
                boolean z10 = false;
                return f10 > 50.0f ? new b(f10, z10, 2, uVar) : new c(z10, 1, uVar);
            }

            public /* synthetic */ C0686a(u uVar) {
                this();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends a {

            /* renamed from: d, reason: collision with root package name */
            public final float f67435d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f67436e;

            public b() {
                this(0.0f, false, 3, null);
            }

            public static /* synthetic */ b copy$default(b bVar, float f10, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = bVar.f67435d;
                }
                if ((i10 & 2) != 0) {
                    z10 = bVar.f67436e;
                }
                return bVar.copy(f10, z10);
            }

            public final float component1() {
                return this.f67435d;
            }

            public final boolean component2() {
                return this.f67436e;
            }

            public final b copy(float f10, boolean z10) {
                return new b(f10, z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return e0.areEqual((Object) Float.valueOf(this.f67435d), (Object) Float.valueOf(bVar.f67435d)) && this.f67436e == bVar.f67436e;
            }

            public final float getPercentage() {
                return this.f67435d;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int iHashCode = Float.hashCode(this.f67435d) * 31;
                boolean z10 = this.f67436e;
                int i10 = z10;
                if (z10 != 0) {
                    i10 = 1;
                }
                return iHashCode + i10;
            }

            public final boolean isForcedValue() {
                return this.f67436e;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Covered(percentage=");
                sb2.append(this.f67435d);
                sb2.append(", isForcedValue=");
                return a.b.p(sb2, this.f67436e, ')');
            }

            public /* synthetic */ b(float f10, boolean z10, int i10, u uVar) {
                this((i10 & 1) != 0 ? 100.0f : f10, (i10 & 2) != 0 ? false : z10);
            }

            public b(float f10, boolean z10) {
                super(f10, z10, null);
                this.f67435d = f10;
                this.f67436e = z10;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c extends a {

            /* renamed from: d, reason: collision with root package name */
            public final boolean f67437d;

            public c() {
                this(false, 1, null);
            }

            public static /* synthetic */ c copy$default(c cVar, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = cVar.f67437d;
                }
                return cVar.copy(z10);
            }

            public final boolean component1() {
                return this.f67437d;
            }

            public final c copy(boolean z10) {
                return new c(z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f67437d == ((c) obj).f67437d;
            }

            public int hashCode() {
                boolean z10 = this.f67437d;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public final boolean isForcedValue() {
                return this.f67437d;
            }

            public String toString() {
                return a.b.p(new StringBuilder("Uncovered(isForcedValue="), this.f67437d, ')');
            }

            public /* synthetic */ c(boolean z10, int i10, u uVar) {
                this((i10 & 1) != 0 ? false : z10);
            }

            public c(boolean z10) {
                super(0.0f, z10, null);
                this.f67437d = z10;
            }
        }

        public /* synthetic */ a(float f10, boolean z10, u uVar) {
            this(f10, z10);
        }

        public final float getCoveragePercentage() {
            return this.f67433a;
        }

        public final boolean isForced() {
            return this.f67434b;
        }

        public a(float f10, boolean z10) {
            this.f67433a = f10;
            this.f67434b = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.view.RootViewChecker$observeAdViewCoverageStatus$1", f = "RootViewChecker.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f67438a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f67440a;

            public a(j jVar) {
                this.f67440a = jVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return emit((String[]) obj, (zu.d<? super x0>) dVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(String[] strArr, zu.d<? super x0> dVar) {
                Float fBoxFloat;
                View rootView;
                Object[] objArr;
                boolean z10 = false;
                int i10 = 1;
                Object[] objArr2 = strArr.length == 0;
                x0 x0Var = x0.f87415a;
                if (objArr2 == false) {
                    ArrayList arrayList = new ArrayList();
                    int length = strArr.length;
                    int i11 = 0;
                    while (true) {
                        fBoxFloat = null;
                        objArr = 0;
                        if (i11 >= length) {
                            break;
                        }
                        String str = strArr[i11];
                        if (!n0.contains$default((CharSequence) str, (CharSequence) "PopupWindow", false, 2, (Object) null)) {
                            arrayList.add(str);
                        }
                        i11++;
                    }
                    if (arrayList.size() == 1) {
                        this.f67440a.get_coverageStatusStateFlow$odeeoSdk_release().setValue(new a.c(z10, i10, objArr == true ? 1 : 0));
                        return x0Var;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        try {
                            rootView = p.f67473a.getRootView(str2);
                        } catch (Exception e10) {
                            io.odeeo.internal.b2.a.e(e0.stringPlus("Failed to get root view for ", str2), e10);
                            rootView = null;
                        }
                        if (rootView != null) {
                            arrayList2.add(rootView);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (s.f67289a.isLikelyDialogOrInterstitial((View) next)) {
                            arrayList3.add(next);
                        }
                    }
                    io.odeeo.sdk.l webView$odeeoSdk_release = this.f67440a.getBaseAdView().getWebView$odeeoSdk_release();
                    Iterator it3 = arrayList3.iterator();
                    if (it3.hasNext()) {
                        float coveragePercentage = s.f67289a.getCoveragePercentage(webView$odeeoSdk_release, (View) it3.next());
                        while (it3.hasNext()) {
                            coveragePercentage = Math.max(coveragePercentage, s.f67289a.getCoveragePercentage(webView$odeeoSdk_release, (View) it3.next()));
                        }
                        fBoxFloat = bv.b.boxFloat(coveragePercentage);
                    }
                    this.f67440a.get_coverageStatusStateFlow$odeeoSdk_release().setValue(a.f67432c.getCoverageStatus(fBoxFloat == null ? 0.0f : fBoxFloat.floatValue()));
                }
                return x0Var;
            }
        }

        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return j.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f67438a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Flow<String[]> flowRootViewNamesFlow = j.this.rootViewNamesFlow();
                a aVar = new a(j.this);
                this.f67438a = 1;
                if (flowRootViewNamesFlow.collect(aVar, this) == coroutine_suspended) {
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

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.odeeo.sdk.view.RootViewChecker$rootViewNamesFlow$1", f = "RootViewChecker.kt", i = {0, 1}, l = {31, 35}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        public int f67441a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67442b;

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = j.this.new c(dVar);
            cVar.f67442b = obj;
            return cVar;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0068 -> B:15:0x0030). Please report as a decompilation issue!!! */
        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f67441a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.f67442b;
            } else {
                if (i10 == 1) {
                    flowCollector = (FlowCollector) this.f67442b;
                    try {
                        a0.throwOnFailure(obj);
                    } catch (Exception e10) {
                        io.odeeo.internal.b2.a.e("Failed to fetch root view names", e10);
                    }
                    this.f67442b = flowCollector;
                    this.f67441a = 2;
                    if (DelayKt.delay(1250L, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flowCollector = (FlowCollector) this.f67442b;
                a0.throwOnFailure(obj);
            }
            if (j.this.f67429c || !j.this.getCurrentAddPopupWindow().isShowing()) {
                return x0.f87415a;
            }
            String[] rootViewNames = p.f67473a.getRootViewNames();
            this.f67442b = flowCollector;
            this.f67441a = 1;
            if (flowCollector.emit(rootViewNames, this) != coroutine_suspended) {
                this.f67442b = flowCollector;
                this.f67441a = 2;
                if (DelayKt.delay(1250L, this) != coroutine_suspended) {
                    if (j.this.f67429c) {
                    }
                    return x0.f87415a;
                }
            }
            return coroutine_suspended;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super String[]> flowCollector, zu.d<? super x0> dVar) {
            return ((c) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public j(PopupWindow currentAddPopupWindow, io.odeeo.internal.w1.c baseAdView) {
        e0.checkNotNullParameter(currentAddPopupWindow, "currentAddPopupWindow");
        e0.checkNotNullParameter(baseAdView, "baseAdView");
        this.f67427a = currentAddPopupWindow;
        this.f67428b = baseAdView;
        this.f67429c = true;
        MutableStateFlow<a> MutableStateFlow = StateFlowKt.MutableStateFlow(new a.c(false, 1, null));
        this.f67430d = MutableStateFlow;
        this.f67431e = MutableStateFlow;
    }

    public final void forceCoverageCheck() {
        a aVarCopy;
        io.odeeo.internal.b2.a.d("Forcing coverage check", new Object[0]);
        a value = this.f67430d.getValue();
        MutableStateFlow<a> mutableStateFlow = this.f67430d;
        if (value instanceof a.b) {
            aVarCopy = a.b.copy$default((a.b) value, 0.0f, true, 1, null);
        } else {
            if (!(value instanceof a.c)) {
                throw new t();
            }
            aVarCopy = ((a.c) value).copy(true);
        }
        mutableStateFlow.setValue(aVarCopy);
    }

    public final io.odeeo.internal.w1.c getBaseAdView() {
        return this.f67428b;
    }

    public final Flow<a> getCoverageStatusStateFlow() {
        return this.f67431e;
    }

    public final PopupWindow getCurrentAddPopupWindow() {
        return this.f67427a;
    }

    public final MutableStateFlow<a> get_coverageStatusStateFlow$odeeoSdk_release() {
        return this.f67430d;
    }

    public final boolean isCurrentlyCovered() {
        return this.f67430d.getValue() instanceof a.b;
    }

    public final void observeAdViewCoverageStatus() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new b(null), 3, null);
    }

    public final Flow<String[]> rootViewNamesFlow() {
        return FlowKt.flowOn(FlowKt.flow(new c(null)), Dispatchers.getDefault());
    }

    public final void stopListeningForNewRootViews() {
        this.f67429c = false;
    }
}
