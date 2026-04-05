package b0;

import c0.h3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 extends h2 {

    /* renamed from: b, reason: collision with root package name */
    public final c0.n f8397b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f8398c;

    /* renamed from: e, reason: collision with root package name */
    public kv.p f8399e;

    /* renamed from: f, reason: collision with root package name */
    public a f8400f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c0.e f8401a;

        /* renamed from: b, reason: collision with root package name */
        public long f8402b;

        public a(c0.e eVar, long j10, kotlin.jvm.internal.u uVar) {
            this.f8401a = eVar;
            this.f8402b = j10;
        }

        /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ a m88copyO0kMr_c$default(a aVar, c0.e eVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                eVar = aVar.f8401a;
            }
            if ((i10 & 2) != 0) {
                j10 = aVar.f8402b;
            }
            return aVar.m90copyO0kMr_c(eVar, j10);
        }

        public final c0.e component1() {
            return this.f8401a;
        }

        /* renamed from: component2-YbymL2g, reason: not valid java name */
        public final long m89component2YbymL2g() {
            return this.f8402b;
        }

        /* renamed from: copy-O0kMr_c, reason: not valid java name */
        public final a m90copyO0kMr_c(c0.e anim, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(anim, "anim");
            return new a(anim, j10, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual(this.f8401a, aVar.f8401a) && s2.v.m6970equalsimpl0(this.f8402b, aVar.f8402b);
        }

        public final c0.e getAnim() {
            return this.f8401a;
        }

        /* renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m91getStartSizeYbymL2g() {
            return this.f8402b;
        }

        public int hashCode() {
            return s2.v.m6973hashCodeimpl(this.f8402b) + (this.f8401a.hashCode() * 31);
        }

        /* renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m92setStartSizeozmzZPI(long j10) {
            this.f8402b = j10;
        }

        public String toString() {
            return "AnimData(anim=" + this.f8401a + ", startSize=" + ((Object) s2.v.m6975toStringimpl(this.f8402b)) + ')';
        }
    }

    public j2(c0.n animSpec, CoroutineScope scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animSpec, "animSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f8397b = animSpec;
        this.f8398c = scope;
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    /* renamed from: animateTo-mzRDjE0, reason: not valid java name */
    public final long m87animateTomzRDjE0(long j10) {
        j2 j2Var;
        a aVar = this.f8400f;
        if (aVar == null) {
            j2Var = this;
            aVar = new a(new c0.e(s2.v.m6964boximpl(j10), h3.getVectorConverter(s2.v.f85360b), s2.v.m6964boximpl(s2.w.IntSize(1, 1))), j10, null);
        } else if (s2.v.m6970equalsimpl0(j10, ((s2.v) aVar.getAnim().getTargetValue()).m6976unboximpl())) {
            j2Var = this;
        } else {
            aVar.m92setStartSizeozmzZPI(((s2.v) aVar.getAnim().getValue()).m6976unboximpl());
            k2 k2Var = new k2(aVar, j10, this, null);
            j2Var = this;
            BuildersKt__Builders_commonKt.launch$default(j2Var.f8398c, null, null, k2Var, 3, null);
        }
        j2Var.f8400f = aVar;
        return ((s2.v) aVar.getAnim().getValue()).m6976unboximpl();
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final a getAnimData() {
        return this.f8400f;
    }

    public final c0.n getAnimSpec() {
        return this.f8397b;
    }

    public final kv.p getListener() {
        return this.f8399e;
    }

    public final CoroutineScope getScope() {
        return this.f8398c;
    }

    @Override // b0.h2, x1.o0
    /* renamed from: measure-3p2s80s */
    public x1.y0 mo74measure3p2s80s(x1.a1 measure, x1.w0 measurable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(j10);
        long jM87animateTomzRDjE0 = m87animateTomzRDjE0(s2.w.IntSize(q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight()));
        return x1.a1.layout$default(measure, s2.v.m6972getWidthimpl(jM87animateTomzRDjE0), s2.v.m6971getHeightimpl(jM87animateTomzRDjE0), null, new l2(q1VarMo7826measureBRTryo0), 4, null);
    }

    public final void setAnimData(a aVar) {
        this.f8400f = aVar;
    }

    public final void setListener(kv.p pVar) {
        this.f8399e = pVar;
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
