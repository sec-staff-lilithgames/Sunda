package xv;

import java.util.concurrent.TimeUnit;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: n, reason: collision with root package name */
    public static final b f93646n;

    /* renamed from: o, reason: collision with root package name */
    public static final h f93647o;

    /* renamed from: p, reason: collision with root package name */
    public static final h f93648p;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93649a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93650b;

    /* renamed from: c, reason: collision with root package name */
    public final int f93651c;

    /* renamed from: d, reason: collision with root package name */
    public final int f93652d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93653e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f93654f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f93655g;

    /* renamed from: h, reason: collision with root package name */
    public final int f93656h;

    /* renamed from: i, reason: collision with root package name */
    public final int f93657i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f93658j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f93659k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f93660l;

    /* renamed from: m, reason: collision with root package name */
    public String f93661m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f93662a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f93663b;

        /* renamed from: c, reason: collision with root package name */
        public int f93664c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f93665d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f93666e = -1;

        /* renamed from: f, reason: collision with root package name */
        public boolean f93667f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f93668g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f93669h;

        public final h build() {
            return yv.d.commonBuild(this);
        }

        public final boolean getImmutable$okhttp() {
            return this.f93669h;
        }

        public final int getMaxAgeSeconds$okhttp() {
            return this.f93664c;
        }

        public final int getMaxStaleSeconds$okhttp() {
            return this.f93665d;
        }

        public final int getMinFreshSeconds$okhttp() {
            return this.f93666e;
        }

        public final boolean getNoCache$okhttp() {
            return this.f93662a;
        }

        public final boolean getNoStore$okhttp() {
            return this.f93663b;
        }

        public final boolean getNoTransform$okhttp() {
            return this.f93668g;
        }

        public final boolean getOnlyIfCached$okhttp() {
            return this.f93667f;
        }

        public final a immutable() {
            return yv.d.commonImmutable(this);
        }

        public final a maxAge(int i10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            if (i10 < 0) {
                throw new IllegalArgumentException(a.b.e(i10, "maxAge < 0: ").toString());
            }
            this.f93664c = yv.d.commonClampToInt(timeUnit.toSeconds(i10));
            return this;
        }

        /* renamed from: maxAge-LRDsOJo, reason: not valid java name */
        public final a m7927maxAgeLRDsOJo(long j10) {
            long jM7198getInWholeSecondsimpl = tv.f.m7198getInWholeSecondsimpl(j10);
            if (jM7198getInWholeSecondsimpl < 0) {
                throw new IllegalArgumentException(o2.m(jM7198getInWholeSecondsimpl, "maxAge < 0: ").toString());
            }
            this.f93664c = yv.d.commonClampToInt(jM7198getInWholeSecondsimpl);
            return this;
        }

        public final a maxStale(int i10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            if (i10 < 0) {
                throw new IllegalArgumentException(a.b.e(i10, "maxStale < 0: ").toString());
            }
            this.f93665d = yv.d.commonClampToInt(timeUnit.toSeconds(i10));
            return this;
        }

        /* renamed from: maxStale-LRDsOJo, reason: not valid java name */
        public final a m7928maxStaleLRDsOJo(long j10) {
            long jM7198getInWholeSecondsimpl = tv.f.m7198getInWholeSecondsimpl(j10);
            if (jM7198getInWholeSecondsimpl < 0) {
                throw new IllegalArgumentException(o2.m(jM7198getInWholeSecondsimpl, "maxStale < 0: ").toString());
            }
            this.f93665d = yv.d.commonClampToInt(jM7198getInWholeSecondsimpl);
            return this;
        }

        public final a minFresh(int i10, TimeUnit timeUnit) {
            kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
            if (i10 < 0) {
                throw new IllegalArgumentException(a.b.e(i10, "minFresh < 0: ").toString());
            }
            this.f93666e = yv.d.commonClampToInt(timeUnit.toSeconds(i10));
            return this;
        }

        /* renamed from: minFresh-LRDsOJo, reason: not valid java name */
        public final a m7929minFreshLRDsOJo(long j10) {
            long jM7198getInWholeSecondsimpl = tv.f.m7198getInWholeSecondsimpl(j10);
            if (jM7198getInWholeSecondsimpl < 0) {
                throw new IllegalArgumentException(o2.m(jM7198getInWholeSecondsimpl, "minFresh < 0: ").toString());
            }
            this.f93666e = yv.d.commonClampToInt(jM7198getInWholeSecondsimpl);
            return this;
        }

        public final a noCache() {
            return yv.d.commonNoCache(this);
        }

        public final a noStore() {
            return yv.d.commonNoStore(this);
        }

        public final a noTransform() {
            return yv.d.commonNoTransform(this);
        }

        public final a onlyIfCached() {
            return yv.d.commonOnlyIfCached(this);
        }

        public final void setImmutable$okhttp(boolean z10) {
            this.f93669h = z10;
        }

        public final void setMaxAgeSeconds$okhttp(int i10) {
            this.f93664c = i10;
        }

        public final void setMaxStaleSeconds$okhttp(int i10) {
            this.f93665d = i10;
        }

        public final void setMinFreshSeconds$okhttp(int i10) {
            this.f93666e = i10;
        }

        public final void setNoCache$okhttp(boolean z10) {
            this.f93662a = z10;
        }

        public final void setNoStore$okhttp(boolean z10) {
            this.f93663b = z10;
        }

        public final void setNoTransform$okhttp(boolean z10) {
            this.f93668g = z10;
        }

        public final void setOnlyIfCached$okhttp(boolean z10) {
            this.f93667f = z10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final h parse(f0 headers) {
            kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
            return yv.d.commonParse(this, headers);
        }
    }

    static {
        b bVar = new b(null);
        f93646n = bVar;
        f93647o = yv.d.commonForceNetwork(bVar);
        f93648p = yv.d.commonForceCache(bVar);
    }

    public h(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f93649a = z10;
        this.f93650b = z11;
        this.f93651c = i10;
        this.f93652d = i11;
        this.f93653e = z12;
        this.f93654f = z13;
        this.f93655g = z14;
        this.f93656h = i12;
        this.f93657i = i13;
        this.f93658j = z15;
        this.f93659k = z16;
        this.f93660l = z17;
        this.f93661m = str;
    }

    public static final h parse(f0 f0Var) {
        return f93646n.parse(f0Var);
    }

    @tu.f
    /* renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m7917deprecated_immutable() {
        return this.f93660l;
    }

    @tu.f
    /* renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m7918deprecated_maxAgeSeconds() {
        return this.f93651c;
    }

    @tu.f
    /* renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m7919deprecated_maxStaleSeconds() {
        return this.f93656h;
    }

    @tu.f
    /* renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m7920deprecated_minFreshSeconds() {
        return this.f93657i;
    }

    @tu.f
    /* renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m7921deprecated_mustRevalidate() {
        return this.f93655g;
    }

    @tu.f
    /* renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m7922deprecated_noCache() {
        return this.f93649a;
    }

    @tu.f
    /* renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m7923deprecated_noStore() {
        return this.f93650b;
    }

    @tu.f
    /* renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m7924deprecated_noTransform() {
        return this.f93659k;
    }

    @tu.f
    /* renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m7925deprecated_onlyIfCached() {
        return this.f93658j;
    }

    @tu.f
    /* renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m7926deprecated_sMaxAgeSeconds() {
        return this.f93652d;
    }

    public final String getHeaderValue$okhttp() {
        return this.f93661m;
    }

    public final boolean immutable() {
        return this.f93660l;
    }

    public final boolean isPrivate() {
        return this.f93653e;
    }

    public final boolean isPublic() {
        return this.f93654f;
    }

    public final int maxAgeSeconds() {
        return this.f93651c;
    }

    public final int maxStaleSeconds() {
        return this.f93656h;
    }

    public final int minFreshSeconds() {
        return this.f93657i;
    }

    public final boolean mustRevalidate() {
        return this.f93655g;
    }

    public final boolean noCache() {
        return this.f93649a;
    }

    public final boolean noStore() {
        return this.f93650b;
    }

    public final boolean noTransform() {
        return this.f93659k;
    }

    public final boolean onlyIfCached() {
        return this.f93658j;
    }

    public final int sMaxAgeSeconds() {
        return this.f93652d;
    }

    public final void setHeaderValue$okhttp(String str) {
        this.f93661m = str;
    }

    public String toString() {
        return yv.d.commonToString(this);
    }
}
