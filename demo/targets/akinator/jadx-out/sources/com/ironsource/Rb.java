package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Rb {

    /* renamed from: m, reason: collision with root package name */
    public static final a f35403m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private static final int f35404n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35405a;

    /* renamed from: b, reason: collision with root package name */
    private H1 f35406b;

    /* renamed from: c, reason: collision with root package name */
    private int f35407c;

    /* renamed from: d, reason: collision with root package name */
    private long f35408d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35409e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<C3163cc> f35410f;

    /* renamed from: g, reason: collision with root package name */
    private C3163cc f35411g;

    /* renamed from: h, reason: collision with root package name */
    private int f35412h;

    /* renamed from: i, reason: collision with root package name */
    private C3387p2 f35413i;

    /* renamed from: j, reason: collision with root package name */
    private long f35414j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35415k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f35416l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public Rb(int i10, long j10, boolean z10, H1 events, C3387p2 auctionSettings, int i11, long j11, boolean z11, boolean z12, boolean z13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(events, "events");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.f35405a = z13;
        this.f35410f = new ArrayList<>();
        this.f35407c = i10;
        this.f35408d = j10;
        this.f35409e = z10;
        this.f35406b = events;
        this.f35412h = i11;
        this.f35413i = auctionSettings;
        this.f35414j = j11;
        this.f35415k = z11;
        this.f35416l = z12;
    }

    public final void a(H1 h12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(h12, "<set-?>");
        this.f35406b = h12;
    }

    public final int b() {
        return this.f35407c;
    }

    public final long c() {
        return this.f35408d;
    }

    public final C3387p2 d() {
        return this.f35413i;
    }

    public final C3163cc e() {
        Iterator<C3163cc> it = this.f35410f.iterator();
        while (it.hasNext()) {
            C3163cc next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.f35411g;
    }

    public final int f() {
        return this.f35412h;
    }

    public final H1 g() {
        return this.f35406b;
    }

    public final long h() {
        return this.f35414j;
    }

    public final boolean i() {
        return this.f35415k;
    }

    public final boolean j() {
        return this.f35405a;
    }

    public final boolean k() {
        return this.f35416l;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f35407c + ", bidderExclusive=" + this.f35409e + "}";
    }

    public final void a(int i10) {
        this.f35407c = i10;
    }

    public final void b(int i10) {
        this.f35412h = i10;
    }

    public final void c(boolean z10) {
        this.f35416l = z10;
    }

    public final void a(long j10) {
        this.f35408d = j10;
    }

    public final void b(long j10) {
        this.f35414j = j10;
    }

    public final boolean a() {
        return this.f35409e;
    }

    public final void b(boolean z10) {
        this.f35415k = z10;
    }

    public final void a(boolean z10) {
        this.f35409e = z10;
    }

    public final void a(C3387p2 c3387p2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c3387p2, "<set-?>");
        this.f35413i = c3387p2;
    }

    public final void a(C3163cc c3163cc) {
        if (c3163cc != null) {
            this.f35410f.add(c3163cc);
            if (this.f35411g == null) {
                this.f35411g = c3163cc;
            } else if (c3163cc.b() == 0) {
                this.f35411g = c3163cc;
            }
        }
    }

    public final C3163cc a(String placementName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placementName, "placementName");
        Iterator<C3163cc> it = this.f35410f.iterator();
        while (it.hasNext()) {
            C3163cc next = it.next();
            if (kotlin.jvm.internal.e0.areEqual(next.c(), placementName)) {
                return next;
            }
        }
        return null;
    }
}
