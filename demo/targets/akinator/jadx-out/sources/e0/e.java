package e0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements i0.m, x1.m1, x1.l1 {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f53015b;

    /* renamed from: c, reason: collision with root package name */
    public final m2 f53016c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53017e;

    /* renamed from: f, reason: collision with root package name */
    public x1.d0 f53018f;

    /* renamed from: g, reason: collision with root package name */
    public x1.d0 f53019g;

    /* renamed from: h, reason: collision with root package name */
    public s2.v f53020h;

    /* renamed from: i, reason: collision with root package name */
    public final e1.v f53021i;

    public e(CoroutineScope scope, m2 orientation, t3 scrollableState, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.e0.checkNotNullParameter(scrollableState, "scrollableState");
        this.f53015b = scope;
        this.f53016c = orientation;
        this.f53017e = z10;
        this.f53021i = i0.n.bringIntoViewResponder(d0.e2.onFocusedBoundsChanged(this, new c(this)), this);
    }

    public static float c(float f10, float f11, float f12) {
        if ((f10 >= 0.0f && f11 <= f12) || (f10 < 0.0f && f11 > f12)) {
            return 0.0f;
        }
        float f13 = f11 - f12;
        return Math.abs(f10) < Math.abs(f13) ? f10 : f13;
    }

    public final i1.j a(i1.j jVar, long j10) {
        long jM6981toSizeozmzZPI = s2.w.m6981toSizeozmzZPI(j10);
        int iOrdinal = this.f53016c.ordinal();
        if (iOrdinal == 0) {
            return jVar.translate(0.0f, c(jVar.getTop(), jVar.getBottom(), i1.o.m4249getHeightimpl(jM6981toSizeozmzZPI)));
        }
        if (iOrdinal == 1) {
            return jVar.translate(c(jVar.getLeft(), jVar.getRight(), i1.o.m4252getWidthimpl(jM6981toSizeozmzZPI)), 0.0f);
        }
        throw new tu.t();
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public final Object b(i1.j jVar, i1.j jVar2, zu.d dVar) {
        float top;
        float top2;
        int iOrdinal = this.f53016c.ordinal();
        if (iOrdinal == 0) {
            top = jVar.getTop();
            top2 = jVar2.getTop();
        } else {
            if (iOrdinal != 1) {
                throw new tu.t();
            }
            top = jVar.getLeft();
            top2 = jVar2.getLeft();
        }
        float f10 = top - top2;
        if (this.f53017e) {
            f10 = -f10;
        }
        Object objAnimateScrollBy$default = c3.animateScrollBy$default(null, f10, null, dVar, 2, null);
        return objAnimateScrollBy$default == av.e.getCOROUTINE_SUSPENDED() ? objAnimateScrollBy$default : tu.x0.f87415a;
    }

    @Override // i0.m
    public Object bringChildIntoView(i1.j jVar, zu.d<? super tu.x0> dVar) {
        Object objB = b(jVar, calculateRectForParent(jVar), dVar);
        return objB == av.e.getCOROUTINE_SUSPENDED() ? objB : tu.x0.f87415a;
    }

    @Override // i0.m
    public i1.j calculateRectForParent(i1.j localRect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(localRect, "localRect");
        s2.v vVar = this.f53020h;
        if (vVar != null) {
            return a(localRect, vVar.m6976unboximpl());
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final e1.v getModifier() {
        return this.f53021i;
    }

    @Override // x1.l1
    public void onPlaced(x1.d0 coordinates) {
        kotlin.jvm.internal.e0.checkNotNullParameter(coordinates, "coordinates");
        this.f53019g = coordinates;
    }

    @Override // x1.m1
    /* renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo3761onRemeasuredozmzZPI(long j10) {
        i1.j jVarLocalBoundingBoxOf;
        x1.d0 d0Var = this.f53019g;
        s2.v vVar = this.f53020h;
        if (vVar != null && !s2.v.m6970equalsimpl0(vVar.m6976unboximpl(), j10) && d0Var != null && d0Var.isAttached()) {
            long jM6976unboximpl = vVar.m6976unboximpl();
            if (this.f53016c != m2.f53184c ? s2.v.m6971getHeightimpl(d0Var.mo7827getSizeYbymL2g()) < s2.v.m6971getHeightimpl(jM6976unboximpl) : s2.v.m6972getWidthimpl(d0Var.mo7827getSizeYbymL2g()) < s2.v.m6972getWidthimpl(jM6976unboximpl)) {
                x1.d0 d0Var2 = this.f53018f;
                if (d0Var2 != null && (jVarLocalBoundingBoxOf = d0Var.localBoundingBoxOf(d0Var2, false)) != null) {
                    i1.j jVarM4219Recttz77jQw = i1.k.m4219Recttz77jQw(i1.h.f59344b.m4173getZeroF1C5BW0(), s2.w.m6981toSizeozmzZPI(jM6976unboximpl));
                    i1.j jVarA = a(jVarLocalBoundingBoxOf, d0Var.mo7827getSizeYbymL2g());
                    boolean zOverlaps = jVarM4219Recttz77jQw.overlaps(jVarLocalBoundingBoxOf);
                    boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(jVarA, jVarLocalBoundingBoxOf);
                    if (zOverlaps && !zAreEqual) {
                        BuildersKt__Builders_commonKt.launch$default(this.f53015b, null, null, new d(this, jVarLocalBoundingBoxOf, jVarA, null), 3, null);
                    }
                }
            }
        }
        this.f53020h = s2.v.m6964boximpl(j10);
    }

    @Override // x1.m1, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
