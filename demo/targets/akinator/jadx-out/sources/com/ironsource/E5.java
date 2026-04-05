package com.ironsource;

import com.ironsource.D0;
import com.ironsource.mediationsdk.IronSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class E5 implements C0 {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f34249a;

    /* renamed from: b, reason: collision with root package name */
    private final D0 f34250b;

    /* renamed from: c, reason: collision with root package name */
    private final List<C0> f34251c;

    /* renamed from: d, reason: collision with root package name */
    private final C3142b9 f34252d;

    /* renamed from: e, reason: collision with root package name */
    private final Ab f34253e;

    /* renamed from: f, reason: collision with root package name */
    private final Yf f34254f;

    /* renamed from: g, reason: collision with root package name */
    private final R1 f34255g;

    /* renamed from: h, reason: collision with root package name */
    private final M f34256h;

    /* renamed from: i, reason: collision with root package name */
    private final C3185dg f34257i;

    /* renamed from: j, reason: collision with root package name */
    private final Vc f34258j;

    public E5(IronSource.a adFormat, D0.b level, List<? extends C0> eventsInterfaces, AbstractC3472u3 abstractC3472u3) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(level, "level");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.f34249a = adFormat;
        D0 d02 = new D0(adFormat, level, this, abstractC3472u3);
        this.f34250b = d02;
        this.f34251c = uu.y0.toMutableList((Collection) eventsInterfaces);
        C3142b9 c3142b9 = d02.f33936e;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3142b9, "wrapper.init");
        this.f34252d = c3142b9;
        Ab ab2 = d02.f33937f;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(ab2, "wrapper.load");
        this.f34253e = ab2;
        Yf yf2 = d02.f33938g;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(yf2, "wrapper.token");
        this.f34254f = yf2;
        R1 r12 = d02.f33939h;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, "wrapper.auction");
        this.f34255g = r12;
        M m9 = d02.f33940i;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(m9, "wrapper.adInteraction");
        this.f34256h = m9;
        C3185dg c3185dg = d02.f33941j;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(c3185dg, "wrapper.troubleshoot");
        this.f34257i = c3185dg;
        Vc vc2 = d02.f33942k;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(vc2, "wrapper.operational");
        this.f34258j = vc2;
    }

    public final M a() {
        return this.f34256h;
    }

    public final R1 b() {
        return this.f34255g;
    }

    public final List<C0> c() {
        return this.f34251c;
    }

    public final C3142b9 d() {
        return this.f34252d;
    }

    public final Ab e() {
        return this.f34253e;
    }

    public final Vc f() {
        return this.f34258j;
    }

    public final Yf g() {
        return this.f34254f;
    }

    public final C3185dg h() {
        return this.f34257i;
    }

    @Override // com.ironsource.C0
    public Map<String, Object> a(A0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        HashMap map = new HashMap();
        Iterator<C0> it = this.f34251c.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapA = it.next().a(event);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapA, "it.getEventsAdditionalDataMap(event)");
            map.putAll(mapA);
        }
        return map;
    }

    public final void a(C0 eventInterface) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventInterface, "eventInterface");
        this.f34251c.add(eventInterface);
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f34253e.a(true);
        } else {
            if (z10) {
                throw new tu.t();
            }
            if (this.f34249a == IronSource.a.BANNER) {
                this.f34253e.a();
            } else {
                this.f34253e.a(false);
            }
        }
    }

    public /* synthetic */ E5(IronSource.a aVar, D0.b bVar, List list, AbstractC3472u3 abstractC3472u3, int i10, kotlin.jvm.internal.u uVar) {
        this(aVar, bVar, (i10 & 4) != 0 ? uu.p0.emptyList() : list, (i10 & 8) != 0 ? null : abstractC3472u3);
    }
}
