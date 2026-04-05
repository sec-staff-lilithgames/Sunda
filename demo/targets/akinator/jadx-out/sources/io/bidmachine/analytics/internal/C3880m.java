package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.X;
import io.bidmachine.analytics.internal.g0;
import io.bidmachine.analytics.internal.h0;
import io.bidmachine.analytics.internal.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import tu.x0;
import uu.o1;
import uu.p1;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3880m {

    /* renamed from: a, reason: collision with root package name */
    public static final C3880m f60098a = new C3880m();

    /* renamed from: b, reason: collision with root package name */
    private static final p0 f60099b;

    /* renamed from: c, reason: collision with root package name */
    private static final CoroutineScope f60100c;

    /* renamed from: d, reason: collision with root package name */
    private static C3870c f60101d;

    /* renamed from: e, reason: collision with root package name */
    private static V f60102e;

    /* renamed from: f, reason: collision with root package name */
    private static l0 f60103f;

    /* renamed from: g, reason: collision with root package name */
    private static Map f60104g;

    /* renamed from: h, reason: collision with root package name */
    private static Map f60105h;

    /* renamed from: i, reason: collision with root package name */
    private static final List f60106i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.m$a */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f60107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ V f60108b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f60109c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f60110d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V v10, String str, List list, zu.d dVar) {
            super(2, dVar);
            this.f60108b = v10;
            this.f60109c = str;
            this.f60110d = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return new a(this.f60108b, this.f60109c, this.f60110d, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f60107a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            this.f60108b.a(this.f60109c, this.f60110d);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.m$b */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f60111a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f60112b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f60113c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f60114d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0 l0Var, List list, List list2, zu.d dVar) {
            super(2, dVar);
            this.f60112b = l0Var;
            this.f60113c = list;
            this.f60114d = list2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return new b(this.f60112b, this.f60113c, this.f60114d, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            if (this.f60111a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            this.f60112b.a(this.f60113c, this.f60114d);
            return x0.f87415a;
        }
    }

    static {
        p0 p0VarA = p0.f60239g.a();
        f60099b = p0VarA;
        f60100c = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(p0VarA.b()));
        f60104g = p1.emptyMap();
        f60105h = p1.emptyMap();
        f60106i = Collections.synchronizedList(new ArrayList());
    }

    private C3880m() {
    }

    private final synchronized l0 b(C3870c c3870c) {
        l0 l0Var;
        l0 l0Var2 = f60103f;
        l0Var = l0Var2;
        if (l0Var2 == null) {
            m0 m0Var = new m0(c3870c);
            m0Var.b();
            f60103f = m0Var;
            l0Var = m0Var;
        }
        return l0Var;
    }

    public final void a(Context context, AnalyticsConfig analyticsConfig) {
        synchronized (this) {
            try {
                C3880m c3880m = f60098a;
                C3870c c3870cA = c3880m.a(context);
                V vA = c3880m.a(c3870cA);
                l0 l0VarB = c3880m.b(c3870cA);
                c3880m.a(f60104g);
                f60104g = c3880m.a(analyticsConfig, vA);
                f60105h = c3880m.a(context, analyticsConfig, l0VarB);
                c3880m.a(analyticsConfig.getSessionId());
                String sessionId = analyticsConfig.getSessionId();
                List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
                ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(monitorConfigList, 10));
                Iterator<T> it = monitorConfigList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MonitorConfig) it.next()).getName());
                }
                c3880m.a(vA, sessionId, arrayList);
                C3880m c3880m2 = f60098a;
                List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
                ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(readerConfigList, 10));
                Iterator<T> it2 = readerConfigList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ReaderConfig) it2.next()).getName());
                }
                List<ReaderConfig> readerConfigList2 = analyticsConfig.getReaderConfigList();
                ArrayList arrayList3 = new ArrayList(uu.q0.collectionSizeOrDefault(readerConfigList2, 10));
                Iterator<T> it3 = readerConfigList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((ReaderConfig) it3.next()).getRules());
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    List<ReaderConfig.Rule> list = (List) it4.next();
                    ArrayList arrayList5 = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
                    for (ReaderConfig.Rule rule : list) {
                        arrayList5.add(new h0.a(rule.getTag(), rule.getPath()));
                    }
                    v0.addAll(arrayList4, arrayList5);
                }
                c3880m2.a(l0VarB, arrayList2, arrayList4);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void a(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((X) it.next()).a();
        }
    }

    private final V a(C3870c c3870c) {
        V v10 = f60102e;
        if (v10 != null) {
            return v10;
        }
        W w10 = new W(c3870c);
        w10.b();
        f60102e = w10;
        return w10;
    }

    private final synchronized C3870c a(Context context) {
        C3870c c3870c;
        c3870c = f60101d;
        if (c3870c == null) {
            c3870c = new C3870c(context);
            f60101d = c3870c;
        }
        return c3870c;
    }

    private final Map a(AnalyticsConfig analyticsConfig, V v10) {
        List<MonitorConfig> monitorConfigList = analyticsConfig.getMonitorConfigList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : monitorConfigList) {
            if (((MonitorConfig) obj).isReportEnabled()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new X(p0.f60239g.a(), new X.b((MonitorConfig) it.next(), analyticsConfig.getSessionId(), analyticsConfig.getExtras()), v10));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(uu.q0.collectionSizeOrDefault(arrayList2, 10)), 16));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((X) next).b(), next);
        }
        return linkedHashMap;
    }

    private final Map a(Context context, AnalyticsConfig analyticsConfig, l0 l0Var) {
        g0.a c3887u;
        n0 n0Var;
        List<ReaderConfig> readerConfigList = analyticsConfig.getReaderConfigList();
        ArrayList arrayList = new ArrayList();
        for (ReaderConfig readerConfig : readerConfigList) {
            String name = readerConfig.getName();
            int iHashCode = name.hashCode();
            if (iHashCode == 2990623) {
                if (name.equals("aexs")) {
                    c3887u = new C3887u();
                    n0Var = new n0(p0.f60239g.a(), new n0.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), c3887u), l0Var);
                }
                n0Var = null;
            } else if (iHashCode == 2997059) {
                if (name.equals("alog")) {
                    c3887u = new E(C3878k.f60087a.a().a());
                    n0Var = new n0(p0.f60239g.a(), new n0.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), c3887u), l0Var);
                }
                n0Var = null;
            } else if (iHashCode != 3001100) {
                if (iHashCode == 92819013 && name.equals("aints")) {
                    c3887u = new C3891y(context.getFilesDir().getParentFile());
                    n0Var = new n0(p0.f60239g.a(), new n0.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), c3887u), l0Var);
                }
                n0Var = null;
            } else {
                if (name.equals("apur")) {
                    c3887u = new c0(C3878k.f60087a.a().b());
                    n0Var = new n0(p0.f60239g.a(), new n0.a(readerConfig, analyticsConfig.getSessionId(), analyticsConfig.getExtras(), c3887u), l0Var);
                }
                n0Var = null;
            }
            if (n0Var != null) {
                arrayList.add(n0Var);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(uu.q0.collectionSizeOrDefault(arrayList, 10)), 16));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((n0) next).a(), next);
        }
        return linkedHashMap;
    }

    private final void a(String str) {
        List list = f60106i;
        List list2 = y0.toList(list);
        list.clear();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str2 = str;
            f60098a.a(Q.a((Q) it.next(), null, null, str2, 0L, null, null, 59, null));
            str = str2;
        }
    }

    private final void a(V v10, String str, List list) {
        BuildersKt__Builders_commonKt.launch$default(f60100c, f60099b.c(), null, new a(v10, str, list, null), 2, null);
    }

    private final void a(l0 l0Var, List list, List list2) {
        BuildersKt__Builders_commonKt.launch$default(f60100c, f60099b.c(), null, new b(l0Var, list, list2, null), 2, null);
    }

    public final void a(Q q10) {
        if (kotlin.jvm.internal.e0.areEqual(q10.e(), "")) {
            f60106i.add(q10);
            return;
        }
        X x10 = (X) f60104g.get(q10.d());
        if (x10 != null) {
            x10.b(q10);
        }
    }

    public final void a(h0 h0Var) {
        a(h0Var.d(), uu.o0.listOf(h0Var));
    }

    public final void a(String str, List list) {
        n0 n0Var = (n0) f60105h.get(str);
        if (n0Var != null) {
            n0Var.b(str, list);
        }
    }
}
