package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class F {

    /* renamed from: c, reason: collision with root package name */
    public static final a f34330c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3486v0 f34331a;

    /* renamed from: b, reason: collision with root package name */
    private final Cg f34332b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.F$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0208a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34333a;

            static {
                int[] iArr = new int[Gg.values().length];
                try {
                    iArr[Gg.BIDDER_SENSITIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Gg.DEFAULT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f34333a = iArr;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final F a(AbstractC3486v0 adUnitData, Cg waterfallInstances) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
            kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            int i10 = C0208a.f34333a[(adUnitData.d() ? Gg.BIDDER_SENSITIVE : Gg.DEFAULT).ordinal()];
            if (i10 == 1) {
                return new C3523x3(adUnitData, waterfallInstances);
            }
            if (i10 == 2) {
                return adUnitData.q() ? new C3383of(adUnitData, waterfallInstances) : new K4(adUnitData, waterfallInstances);
            }
            throw new tu.t();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<AbstractC3553z> f34334a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<AbstractC3553z> f34335b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<AbstractC3553z> f34336c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private boolean f34337d;

        public final List<AbstractC3553z> a() {
            return this.f34334a;
        }

        public final List<AbstractC3553z> b() {
            return this.f34335b;
        }

        public final List<AbstractC3553z> c() {
            return this.f34336c;
        }

        public final boolean d() {
            return this.f34337d;
        }

        public final boolean e() {
            return g() == 0;
        }

        public final boolean f() {
            return this.f34334a.isEmpty() && this.f34336c.isEmpty();
        }

        public final int g() {
            return this.f34336c.size() + this.f34335b.size() + this.f34334a.size();
        }

        public final void a(boolean z10) {
            this.f34337d = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC3553z f34338a;

        /* renamed from: b, reason: collision with root package name */
        private final List<AbstractC3553z> f34339b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC3553z abstractC3553z, List<? extends AbstractC3553z> orderedInstances) {
            kotlin.jvm.internal.e0.checkNotNullParameter(orderedInstances, "orderedInstances");
            this.f34338a = abstractC3553z;
            this.f34339b = orderedInstances;
        }

        public final AbstractC3553z a() {
            return this.f34338a;
        }

        public final List<AbstractC3553z> b() {
            return this.f34339b;
        }

        public final AbstractC3553z c() {
            return this.f34338a;
        }

        public final List<AbstractC3553z> d() {
            return this.f34339b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f34338a, cVar.f34338a) && kotlin.jvm.internal.e0.areEqual(this.f34339b, cVar.f34339b);
        }

        public int hashCode() {
            AbstractC3553z abstractC3553z = this.f34338a;
            return this.f34339b.hashCode() + ((abstractC3553z == null ? 0 : abstractC3553z.hashCode()) * 31);
        }

        public final c a(AbstractC3553z abstractC3553z, List<? extends AbstractC3553z> orderedInstances) {
            kotlin.jvm.internal.e0.checkNotNullParameter(orderedInstances, "orderedInstances");
            return new c(abstractC3553z, orderedInstances);
        }

        public String toString() {
            return RnJusJ.txp + this.f34338a + ", orderedInstances=" + this.f34339b + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, AbstractC3553z abstractC3553z, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                abstractC3553z = cVar.f34338a;
            }
            if ((i10 & 2) != 0) {
                list = cVar.f34339b;
            }
            return cVar.a(abstractC3553z, list);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return xu.d.compareValues(Integer.valueOf(((AbstractC3553z) t10).h().l()), Integer.valueOf(((AbstractC3553z) t11).h().l()));
        }
    }

    public F(AbstractC3486v0 adUnitData, Cg waterfallInstances) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f34331a = adUnitData;
        this.f34332b = waterfallInstances;
    }

    private final List<AbstractC3553z> b() {
        return uu.y0.sortedWith(this.f34332b.b(), new d());
    }

    public abstract void a(AbstractC3553z abstractC3553z, b bVar);

    public boolean a(AbstractC3553z instance, Cg waterfallInstances) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return false;
    }

    public final c c() {
        Object next;
        List<AbstractC3553z> listB = b();
        Iterator<T> it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC3553z) next).w()) {
                break;
            }
        }
        return new c((AbstractC3553z) next, listB);
    }

    public final b d() {
        IronLog.INTERNAL.verbose(this.f34331a.b().a().name() + " waterfall size: " + this.f34332b.b().size());
        b bVar = new b();
        Iterator<AbstractC3553z> it = this.f34332b.b().iterator();
        while (it.hasNext() && !b(it.next(), bVar)) {
        }
        return bVar;
    }

    public final boolean a(AbstractC3553z instance) {
        Object next;
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        Iterator<T> it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AbstractC3553z) next).v()) {
                break;
            }
        }
        return kotlin.jvm.internal.e0.areEqual(next, instance);
    }

    private final boolean b(AbstractC3553z abstractC3553z, b bVar) {
        if (abstractC3553z.v()) {
            IronLog.INTERNAL.verbose(abstractC3553z.d().name() + " - Instance " + abstractC3553z.q() + " is failed to load");
        } else if (abstractC3553z.w()) {
            IronLog.INTERNAL.verbose(abstractC3553z.d().name() + " - Instance " + abstractC3553z.q() + " is already loaded");
            bVar.b().add(abstractC3553z);
        } else if (abstractC3553z.x()) {
            IronLog.INTERNAL.verbose(abstractC3553z.d().name() + " - Instance " + abstractC3553z.q() + " still loading");
            bVar.c().add(abstractC3553z);
        } else if (a(abstractC3553z, this.f34332b)) {
            IronLog.INTERNAL.verbose(abstractC3553z.d().name() + " - Instance " + abstractC3553z.q() + " is not better than already loaded instances");
        } else {
            a(abstractC3553z, bVar);
        }
        return a(bVar);
    }

    public final boolean a() {
        int i10;
        List<AbstractC3553z> listB = this.f34332b.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = listB.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((AbstractC3553z) it.next()).w() && (i10 = i10 + 1) < 0) {
                    uu.p0.throwCountOverflow();
                }
            }
        }
        return i10 >= this.f34331a.k();
    }

    public boolean a(b loadSelection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(loadSelection, "loadSelection");
        return loadSelection.g() >= this.f34331a.k();
    }
}
