package com.ironsource;

import com.ironsource.AbstractC3438s3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ig<Smash extends AbstractC3438s3<?>> {

    /* renamed from: a, reason: collision with root package name */
    private final U f34681a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return xu.d.compareValues(Integer.valueOf(((AbstractC3438s3) t10).i().l()), Integer.valueOf(((AbstractC3438s3) t11).i().l()));
        }
    }

    public Ig(U managerData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(managerData, "managerData");
        this.f34681a = managerData;
    }

    public final boolean a(AbstractC3438s3<?> smash, List<? extends Smash> waterfall) {
        Object next;
        kotlin.jvm.internal.e0.checkNotNullParameter(smash, "smash");
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AbstractC3438s3) next).x()) {
                break;
            }
        }
        return kotlin.jvm.internal.e0.areEqual(next, smash);
    }

    public final List<Smash> b(List<? extends Smash> waterfall) {
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
        return uu.y0.sortedWith(waterfall, new a());
    }

    public final Smash c(List<? extends Smash> waterfall) {
        Object next;
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC3438s3) next).B()) {
                break;
            }
        }
        return (Smash) next;
    }

    public final Jg<Smash> d(List<? extends Smash> waterfall) {
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.f34681a.b().name() + " waterfall size: " + waterfall.size());
        Kg<Smash> kgA = Kg.f34770g.a(this.f34681a.c() ? Gg.BIDDER_SENSITIVE : Gg.DEFAULT, this.f34681a.i(), this.f34681a.m(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            kgA.d(it.next());
            if (kgA.e()) {
                return new Jg<>(kgA);
            }
        }
        return new Jg<>(kgA);
    }

    public final boolean a(List<? extends Smash> waterfall) {
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((AbstractC3438s3) it.next()).y() && (i10 = i10 + 1) < 0) {
                    uu.p0.throwCountOverflow();
                }
            }
        }
        return i10 >= this.f34681a.i();
    }
}
