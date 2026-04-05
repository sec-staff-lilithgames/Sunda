package l2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 implements j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f72327c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f72328d;

    /* renamed from: a, reason: collision with root package name */
    public final o f72329a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f72330b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final CoroutineExceptionHandler getDropExceptionHandler() {
            return m0.f72328d;
        }

        public final w0 getFontMatcher() {
            return m0.f72327c;
        }
    }

    static {
        new a(null);
        f72327c = new w0();
        f72328d = new b(CoroutineExceptionHandler.Key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Object preload(x xVar, h1 h1Var, zu.d<? super tu.x0> dVar) {
        x xVar2 = xVar;
        if (xVar2 instanceof l0) {
            l0 l0Var = (l0) xVar2;
            List<w> fonts = l0Var.getFonts();
            List<w> fonts2 = l0Var.getFonts();
            ArrayList arrayList = new ArrayList(fonts2.size());
            int size = fonts2.size();
            for (int i10 = 0; i10 < size; i10++) {
                w wVar = fonts2.get(i10);
                if (v0.m5471equalsimpl0(wVar.mo5432getLoadingStrategyPKNRLFQ(), v0.f72378b.m5460getAsyncPKNRLFQ())) {
                    arrayList.add(wVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                w wVar2 = (w) arrayList.get(i11);
                arrayList2.add(tu.e0.to(wVar2.getWeight(), y0.m5482boximpl(wVar2.mo5433getStyle_LCdwA())));
            }
            HashSet hashSet = new HashSet(arrayList2.size());
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size3 = arrayList2.size();
            for (int i12 = 0; i12 < size3; i12++) {
                Object obj = arrayList2.get(i12);
                if (hashSet.add((tu.v) obj)) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                tu.v vVar = (tu.v) arrayList3.get(i13);
                c1 c1Var = (c1) vVar.component1();
                int iM5488unboximpl = ((y0) vVar.component2()).m5488unboximpl();
                List list = (List) t0.access$firstImmediatelyAvailable(f72327c.m5476matchFontRetOiIg(fonts, c1Var, iM5488unboximpl), new u1(xVar2, c1Var, iM5488unboximpl, a1.f72244b.m5489getAllGVVA2EU(), h1Var.getCacheKey(), null), this.f72329a, h1Var, n0.f72332e).component1();
                if (list != null) {
                    arrayList4.add(uu.y0.first(list));
                }
                i13++;
                xVar2 = xVar;
            }
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new r0(arrayList4, this, h1Var, null), dVar);
            if (objCoroutineScope == av.e.getCOROUTINE_SUSPENDED()) {
                return objCoroutineScope;
            }
        }
        return tu.x0.f87415a;
    }

    @Override // l2.j0
    public z1 resolve(u1 typefaceRequest, h1 platformFontLoader, kv.l onAsyncCompletion, kv.l createDefaultTypeface) {
        kotlin.jvm.internal.e0.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        kotlin.jvm.internal.e0.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        kotlin.jvm.internal.e0.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface");
        if (!(typefaceRequest.getFontFamily() instanceof l0)) {
            return null;
        }
        tu.v vVarAccess$firstImmediatelyAvailable = t0.access$firstImmediatelyAvailable(f72327c.m5476matchFontRetOiIg(((l0) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m5467getFontStyle_LCdwA()), typefaceRequest, this.f72329a, platformFontLoader, createDefaultTypeface);
        List list = (List) vVarAccess$firstImmediatelyAvailable.component1();
        Object objComponent2 = vVarAccess$firstImmediatelyAvailable.component2();
        if (list == null) {
            return new y1(objComponent2, false, 2, null);
        }
        m mVar = new m(list, objComponent2, typefaceRequest, this.f72329a, onAsyncCompletion, platformFontLoader);
        BuildersKt__Builders_commonKt.launch$default(this.f72330b, null, CoroutineStart.UNDISPATCHED, new s0(mVar, null), 1, null);
        return new x1(mVar);
    }

    public m0(o asyncTypefaceCache, zu.m injectedContext) {
        kotlin.jvm.internal.e0.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        kotlin.jvm.internal.e0.checkNotNullParameter(injectedContext, "injectedContext");
        this.f72329a = asyncTypefaceCache;
        this.f72330b = CoroutineScopeKt.CoroutineScope(f72328d.plus(injectedContext).plus(SupervisorKt.SupervisorJob((Job) injectedContext.get(Job.Key))));
    }

    public /* synthetic */ m0(o oVar, zu.m mVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new o() : oVar, (i10 & 2) != 0 ? zu.n.f98854b : mVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends zu.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(zu.m mVar, Throwable th2) {
        }
    }
}
