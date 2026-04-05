package com.ironsource;

import com.ironsource.AbstractC3438s3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Kg<Smash extends AbstractC3438s3<?>> {

    /* renamed from: g, reason: collision with root package name */
    public static final a f34770g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f34771a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34772b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Smash> f34773c;

    /* renamed from: d, reason: collision with root package name */
    private final List<Smash> f34774d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Smash> f34775e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Smash> f34776f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.Kg$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0209a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34777a;

            static {
                int[] iArr = new int[Gg.values().length];
                try {
                    iArr[Gg.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Gg.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f34777a = iArr;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final <Smash extends AbstractC3438s3<?>> Kg<Smash> a(Gg loadingStrategy, int i10, boolean z10, List<? extends Smash> waterfall) {
            kotlin.jvm.internal.e0.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
            int i11 = C0209a.f34777a[loadingStrategy.ordinal()];
            if (i11 == 1) {
                return new N4(i10, z10, waterfall);
            }
            if (i11 != 2) {
                throw new tu.t();
            }
            return new C3540y3(i10, z10, waterfall, false, 8, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Kg(int i10, boolean z10, List<? extends Smash> waterfall) {
        kotlin.jvm.internal.e0.checkNotNullParameter(waterfall, "waterfall");
        this.f34771a = i10;
        this.f34772b = z10;
        this.f34773c = waterfall;
        this.f34774d = new ArrayList();
        this.f34775e = new ArrayList();
        this.f34776f = new ArrayList();
    }

    private final boolean b(Smash smash) {
        return b() < a(smash);
    }

    public final List<Smash> a() {
        return this.f34776f;
    }

    public final List<Smash> c() {
        return this.f34774d;
    }

    public abstract void c(Smash smash);

    public final int d() {
        return this.f34776f.size() + this.f34775e.size() + this.f34774d.size();
    }

    public boolean e() {
        return d() >= this.f34771a;
    }

    private final int a(Smash smash) {
        return smash.i().l();
    }

    public final void d(Smash smash) {
        kotlin.jvm.internal.e0.checkNotNullParameter(smash, "smash");
        if (smash.x()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - smash " + smash.k() + " is failed to load");
            return;
        }
        if (smash.y()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is already loaded");
            this.f34775e.add(smash);
            return;
        }
        if (smash.z()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " still loading");
            this.f34776f.add(smash);
            return;
        }
        if (smash.A().get()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " marked as loading candidate");
            this.f34776f.add(smash);
            return;
        }
        if (!this.f34772b || !b(smash)) {
            c(smash);
            return;
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is not better than already loaded smashes");
    }

    private final int b() {
        Integer num;
        List<Smash> list = this.f34773c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC3438s3) obj).y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(a((AbstractC3438s3) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(a((AbstractC3438s3) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
