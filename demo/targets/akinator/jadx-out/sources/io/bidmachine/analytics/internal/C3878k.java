package io.bidmachine.analytics.internal;

import android.content.Context;
import i2.hQ.aTNDubNmpwAqdU;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.AbstractC3872e;
import io.bidmachine.analytics.internal.AbstractC3874g;
import io.bidmachine.analytics.internal.AbstractC3876i;
import io.bidmachine.analytics.internal.InterfaceC3875h;
import io.bidmachine.analytics.internal.h0;
import io.bidmachine.analytics.internal.q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tu.x0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3878k {

    /* renamed from: a, reason: collision with root package name */
    public static final C3878k f60087a = new C3878k();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f60088b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static Map f60089c = p1.emptyMap();

    /* renamed from: d, reason: collision with root package name */
    private static final C3879l f60090d = new C3879l();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.k$b */
    public static final class b implements InterfaceC3875h {

        /* renamed from: a, reason: collision with root package name */
        private final String f60093a;

        public b(String str) {
            this.f60093a = str;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC3875h
        public void a(List list) {
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC3875h.a aVar = (InterfaceC3875h.a) it.next();
                String str = this.f60093a;
                String strA = aVar.a();
                if (strA == null) {
                    strA = "";
                }
                arrayList.add(new h0(null, str, 0L, strA, new h0.a(aVar.c().getTag(), aVar.c().getPath()), aVar.b(), false, 69, null));
            }
            C3880m.f60098a.a(this.f60093a, arrayList);
        }
    }

    private C3878k() {
    }

    public final void b(Context context) {
        if (f60088b.compareAndSet(false, true) && !s0.a(context)) {
            f60089c = a(context);
        }
    }

    public final C3879l a() {
        return f60090d;
    }

    private final void b(Context context, String str, Set set) {
        Object objM7131constructorimpl;
        Context applicationContext = context.getApplicationContext();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC3877j abstractC3877j = (AbstractC3877j) f60089c.get((String) it.next());
            if (abstractC3877j != null) {
                try {
                    int i10 = tu.z.f87419c;
                    abstractC3877j.c(applicationContext);
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0.f87415a);
                } catch (Throwable th2) {
                    int i11 = tu.z.f87419c;
                    objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
                }
                Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
                if (thM7134exceptionOrNullimpl != null) {
                    f60087a.a(abstractC3877j, str, thM7134exceptionOrNullimpl);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map a(Context context) {
        Object objM7131constructorimpl;
        Object objM7131constructorimpl2;
        Object objM7131constructorimpl3;
        Object objM7131constructorimpl4;
        Object objM7131constructorimpl5;
        Object objM7131constructorimpl6;
        x0 x0Var = x0.f87415a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            int i10 = tu.z.f87419c;
            O o10 = new O();
            o10.a(context);
            linkedHashMap.put(o10.a(), o10);
            objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        if (thM7134exceptionOrNullimpl != null) {
            f60087a.a(aTNDubNmpwAqdU.JdoUBSzzFVeBnil, "", thM7134exceptionOrNullimpl);
        }
        try {
            A a10 = new A();
            a10.a(context);
            linkedHashMap.put(a10.a(), a10);
            objM7131constructorimpl2 = tu.z.m7131constructorimpl(x0Var);
        } catch (Throwable th3) {
            int i12 = tu.z.f87419c;
            objM7131constructorimpl2 = tu.z.m7131constructorimpl(tu.a0.createFailure(th3));
        }
        Throwable thM7134exceptionOrNullimpl2 = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl2);
        if (thM7134exceptionOrNullimpl2 != null) {
            f60087a.a("isimp", "", thM7134exceptionOrNullimpl2);
        }
        try {
            C3892z c3892z = new C3892z(context.getFilesDir().getParentFile());
            c3892z.a(context);
            linkedHashMap.put(c3892z.a(), c3892z);
            objM7131constructorimpl3 = tu.z.m7131constructorimpl(x0Var);
        } catch (Throwable th4) {
            int i13 = tu.z.f87419c;
            objM7131constructorimpl3 = tu.z.m7131constructorimpl(tu.a0.createFailure(th4));
        }
        Throwable thM7134exceptionOrNullimpl3 = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl3);
        if (thM7134exceptionOrNullimpl3 != null) {
            f60087a.a("aints", thM7134exceptionOrNullimpl3);
        }
        try {
            C3888v c3888v = new C3888v();
            c3888v.a(context);
            linkedHashMap.put(c3888v.a(), c3888v);
            objM7131constructorimpl4 = tu.z.m7131constructorimpl(x0Var);
        } catch (Throwable th5) {
            int i14 = tu.z.f87419c;
            objM7131constructorimpl4 = tu.z.m7131constructorimpl(tu.a0.createFailure(th5));
        }
        Throwable thM7134exceptionOrNullimpl4 = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl4);
        if (thM7134exceptionOrNullimpl4 != null) {
            f60087a.a("aexs", thM7134exceptionOrNullimpl4);
        }
        int i15 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            H h10 = new H(f60090d.a(), null, i15, 0 == true ? 1 : 0);
            h10.a(context);
            linkedHashMap.put(h10.a(), h10);
            objM7131constructorimpl5 = tu.z.m7131constructorimpl(x0Var);
        } catch (Throwable th6) {
            int i16 = tu.z.f87419c;
            objM7131constructorimpl5 = tu.z.m7131constructorimpl(tu.a0.createFailure(th6));
        }
        Throwable thM7134exceptionOrNullimpl5 = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl5);
        if (thM7134exceptionOrNullimpl5 != null) {
            f60087a.a("alog", thM7134exceptionOrNullimpl5);
        }
        try {
            d0 d0Var = new d0(f60090d.b(), objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0);
            d0Var.a(context);
            linkedHashMap.put(d0Var.a(), d0Var);
            objM7131constructorimpl6 = tu.z.m7131constructorimpl(x0Var);
        } catch (Throwable th7) {
            int i17 = tu.z.f87419c;
            objM7131constructorimpl6 = tu.z.m7131constructorimpl(tu.a0.createFailure(th7));
        }
        Throwable thM7134exceptionOrNullimpl6 = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl6);
        if (thM7134exceptionOrNullimpl6 != null) {
            f60087a.a("apur", thM7134exceptionOrNullimpl6);
        }
        return linkedHashMap;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.k$a */
    public static final class a implements InterfaceC3873f {

        /* renamed from: a, reason: collision with root package name */
        private final String f60091a;

        /* renamed from: b, reason: collision with root package name */
        private final String f60092b;

        public a(String str, String str2) {
            this.f60091a = str;
            this.f60092b = str2;
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC3873f
        public void a(Map map) {
            C3880m.f60098a.a(new Q(null, this.f60091a, this.f60092b, 0L, map, null, 41, null));
        }

        @Override // io.bidmachine.analytics.internal.InterfaceC3873f
        public void a(q0 q0Var) {
            C3880m.f60098a.a(new Q(null, this.f60091a, this.f60092b, 0L, null, q0Var, 25, null));
        }
    }

    public final void a(Context context, AnalyticsConfig analyticsConfig) {
        a(context, analyticsConfig.getSessionId(), f60089c.keySet());
        HashSet hashSet = new HashSet();
        a(analyticsConfig.getSessionId(), analyticsConfig.getMonitorConfigList(), hashSet);
        a(analyticsConfig.getReaderConfigList(), hashSet);
        b(context, analyticsConfig.getSessionId(), hashSet);
    }

    public final Map a(AbstractC3872e.a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : f60089c.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC3877j abstractC3877j = (AbstractC3877j) entry.getValue();
            if (abstractC3877j instanceof AbstractC3872e) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                AbstractC3872e abstractC3872e = (AbstractC3872e) abstractC3877j;
                AbstractC3872e.b bVarB = abstractC3872e.b();
                if (bVarB != null) {
                    linkedHashMap2.put("imd", Integer.valueOf(bVarB.a()));
                    linkedHashMap2.put("wp", Float.valueOf(bVarB.b()));
                    linkedHashMap2.put("agency", bVarB.c());
                }
                AbstractC3872e.b bVarA = abstractC3872e.a(aVar);
                if (bVarA != null) {
                    linkedHashMap2.put("imimd", Integer.valueOf(bVarA.a()));
                    linkedHashMap2.put("imwp", Float.valueOf(bVarA.b()));
                    linkedHashMap2.put("imagency", bVarA.c());
                }
                linkedHashMap.put(str, linkedHashMap2);
            }
        }
        return linkedHashMap;
    }

    private final void a(String str, List list, Set set) {
        Object objM7131constructorimpl;
        x0 x0Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String name = ((MonitorConfig) it.next()).getName();
            try {
                int i10 = tu.z.f87419c;
                AbstractC3877j abstractC3877j = (AbstractC3877j) f60089c.get(name);
                if (abstractC3877j != null) {
                    if (abstractC3877j instanceof AbstractC3874g) {
                        ((AbstractC3874g) abstractC3877j).a(new AbstractC3874g.a(new a(name, str)));
                    }
                    x0Var = x0.f87415a;
                } else {
                    x0Var = null;
                }
                objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            if (tu.z.m7137isSuccessimpl(objM7131constructorimpl)) {
                set.add(name);
            }
            Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
            if (thM7134exceptionOrNullimpl != null) {
                f60087a.a(name, str, thM7134exceptionOrNullimpl);
            }
        }
    }

    private final void a(List list, Set set) {
        Object objM7131constructorimpl;
        x0 x0Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReaderConfig readerConfig = (ReaderConfig) it.next();
            String name = readerConfig.getName();
            try {
                int i10 = tu.z.f87419c;
                AbstractC3877j abstractC3877j = (AbstractC3877j) f60089c.get(name);
                if (abstractC3877j != null) {
                    if (abstractC3877j instanceof AbstractC3876i) {
                        ((AbstractC3876i) abstractC3877j).a((Object) new AbstractC3876i.a(readerConfig.getInterval(), readerConfig.getRules(), new b(name)));
                    }
                    x0Var = x0.f87415a;
                } else {
                    x0Var = null;
                }
                objM7131constructorimpl = tu.z.m7131constructorimpl(x0Var);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            if (tu.z.m7137isSuccessimpl(objM7131constructorimpl)) {
                set.add(name);
            }
            Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
            if (thM7134exceptionOrNullimpl != null) {
                f60087a.a(name, thM7134exceptionOrNullimpl);
            }
        }
    }

    private final void a(Context context, String str, Set set) {
        Object objM7131constructorimpl;
        Context applicationContext = context.getApplicationContext();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC3877j abstractC3877j = (AbstractC3877j) f60089c.get((String) it.next());
            if (abstractC3877j != null) {
                try {
                    int i10 = tu.z.f87419c;
                    abstractC3877j.b(applicationContext);
                    objM7131constructorimpl = tu.z.m7131constructorimpl(x0.f87415a);
                } catch (Throwable th2) {
                    int i11 = tu.z.f87419c;
                    objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
                }
                Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
                if (thM7134exceptionOrNullimpl != null) {
                    f60087a.a(abstractC3877j, str, thM7134exceptionOrNullimpl);
                }
            }
        }
    }

    private final void a(AbstractC3877j abstractC3877j, String str, Throwable th2) {
        if (abstractC3877j instanceof AbstractC3874g) {
            a(abstractC3877j.a(), str, th2);
        } else if (abstractC3877j instanceof AbstractC3876i) {
            a(abstractC3877j.a(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, String str2, Throwable th2) {
        C3880m.f60098a.a(new Q(null, str, str2, 0L, null, new q0(str, q0.a.MONITOR_INVALID, s0.a(th2)), 25, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, Throwable th2) {
        C3880m.f60098a.a(new h0(null, str, 0L, "", new h0.a("", ""), new q0(str, q0.a.READER_INVALID, s0.a(th2)), false, 69, null));
    }
}
