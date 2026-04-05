package x1;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q1 implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public int f91402b;

    /* renamed from: c, reason: collision with root package name */
    public int f91403c;

    /* renamed from: e, reason: collision with root package name */
    public long f91404e = s2.w.IntSize(0, 0);

    /* renamed from: f, reason: collision with root package name */
    public long f91405f = s1.f91435b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0808a f91406a = new C0808a(null);

        /* renamed from: b, reason: collision with root package name */
        public static s2.x f91407b = s2.x.f85363b;

        /* renamed from: c, reason: collision with root package name */
        public static int f91408c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: x1.q1$a$a, reason: collision with other inner class name */
        public static final class C0808a extends a {
            public C0808a(kotlin.jvm.internal.u uVar) {
            }

            public static final s2.x access$getParentLayoutDirection(C0808a c0808a) {
                c0808a.getClass();
                return a.f91407b;
            }

            public static final int access$getParentWidth(C0808a c0808a) {
                c0808a.getClass();
                return a.f91408c;
            }

            @Override // x1.q1.a
            public final s2.x a() {
                return a.f91407b;
            }

            @Override // x1.q1.a
            public final int b() {
                return a.f91408c;
            }

            public final void executeWithRtlMirroringValues(int i10, s2.x parentLayoutDirection, kv.l block) {
                kotlin.jvm.internal.e0.checkNotNullParameter(parentLayoutDirection, "parentLayoutDirection");
                kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
                C0808a c0808a = a.f91406a;
                int iAccess$getParentWidth = access$getParentWidth(c0808a);
                s2.x xVarAccess$getParentLayoutDirection = access$getParentLayoutDirection(c0808a);
                a.f91408c = i10;
                a.f91407b = parentLayoutDirection;
                block.invoke(this);
                a.f91408c = iAccess$getParentWidth;
                a.f91407b = xVarAccess$getParentLayoutDirection;
            }
        }

        public static /* synthetic */ void place$default(a aVar, q1 q1Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.place(q1Var, i10, i11, f10);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m7839place70tqf50$default(a aVar, q1 q1Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.m7843place70tqf50(q1Var, j10, f10);
        }

        public static /* synthetic */ void placeRelative$default(a aVar, q1 q1Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.placeRelative(q1Var, i10, i11, f10);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m7840placeRelative70tqf50$default(a aVar, q1 q1Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.m7846placeRelative70tqf50(q1Var, j10, f10);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(a aVar, q1 q1Var, int i10, int i11, float f10, kv.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = s1.f91434a;
            }
            aVar.placeRelativeWithLayer(q1Var, i10, i11, f11, lVar);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m7841placeRelativeWithLayeraW9wM$default(a aVar, q1 q1Var, long j10, float f10, kv.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = s1.f91434a;
            }
            aVar.m7847placeRelativeWithLayeraW9wM(q1Var, j10, f11, lVar);
        }

        public static /* synthetic */ void placeWithLayer$default(a aVar, q1 q1Var, int i10, int i11, float f10, kv.l lVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                lVar = s1.f91434a;
            }
            aVar.placeWithLayer(q1Var, i10, i11, f11, lVar);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m7842placeWithLayeraW9wM$default(a aVar, q1 q1Var, long j10, float f10, kv.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                lVar = s1.f91434a;
            }
            aVar.m7848placeWithLayeraW9wM(q1Var, j10, f11, lVar);
        }

        public abstract s2.x a();

        public abstract int b();

        public final void place(q1 q1Var, int i10, int i11, float f10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(q1Var, "<this>");
            long jIntOffset = s2.r.IntOffset(i10, i11);
            long jB = q1Var.b();
            q1Var.c(f10, o2.d(s2.q.m6931getYimpl(jIntOffset), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(jIntOffset), jB), null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m7843place70tqf50(q1 place, long j10, float f10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(place, "$this$place");
            long jB = place.b();
            place.c(f10, o2.d(s2.q.m6931getYimpl(j10), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(j10), jB), null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m7844placeApparentToRealOffsetaW9wM$ui_release(q1 placeApparentToRealOffset, long j10, float f10, kv.l lVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(placeApparentToRealOffset, "$this$placeApparentToRealOffset");
            long jB = placeApparentToRealOffset.b();
            placeApparentToRealOffset.c(f10, o2.d(s2.q.m6931getYimpl(j10), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(j10), jB), lVar);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m7845placeAutoMirroredaW9wM$ui_release(q1 placeAutoMirrored, long j10, float f10, kv.l lVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(placeAutoMirrored, "$this$placeAutoMirrored");
            if (a() == s2.x.f85363b || b() == 0) {
                long jB = placeAutoMirrored.b();
                placeAutoMirrored.c(f10, o2.d(s2.q.m6931getYimpl(j10), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(j10), jB), lVar);
                return;
            }
            long jIntOffset = s2.r.IntOffset((b() - s2.v.m6972getWidthimpl(placeAutoMirrored.f91404e)) - s2.q.m6930getXimpl(j10), s2.q.m6931getYimpl(j10));
            long jB2 = placeAutoMirrored.b();
            placeAutoMirrored.c(f10, o2.d(s2.q.m6931getYimpl(jIntOffset), s2.q.m6930getXimpl(jB2) + s2.q.m6930getXimpl(jIntOffset), jB2), lVar);
        }

        public final void placeRelative(q1 q1Var, int i10, int i11, float f10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(q1Var, "<this>");
            long jIntOffset = s2.r.IntOffset(i10, i11);
            if (a() == s2.x.f85363b || b() == 0) {
                long jB = q1Var.b();
                q1Var.c(f10, o2.d(s2.q.m6931getYimpl(jIntOffset), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(jIntOffset), jB), null);
                return;
            }
            long jIntOffset2 = s2.r.IntOffset((b() - s2.v.m6972getWidthimpl(q1Var.f91404e)) - s2.q.m6930getXimpl(jIntOffset), s2.q.m6931getYimpl(jIntOffset));
            long jB2 = q1Var.b();
            q1Var.c(f10, o2.d(s2.q.m6931getYimpl(jIntOffset2), s2.q.m6930getXimpl(jB2) + s2.q.m6930getXimpl(jIntOffset2), jB2), null);
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m7846placeRelative70tqf50(q1 placeRelative, long j10, float f10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(placeRelative, "$this$placeRelative");
            if (a() == s2.x.f85363b || b() == 0) {
                long jB = placeRelative.b();
                placeRelative.c(f10, o2.d(s2.q.m6931getYimpl(j10), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(j10), jB), null);
                return;
            }
            long jIntOffset = s2.r.IntOffset((b() - s2.v.m6972getWidthimpl(placeRelative.f91404e)) - s2.q.m6930getXimpl(j10), s2.q.m6931getYimpl(j10));
            long jB2 = placeRelative.b();
            placeRelative.c(f10, o2.d(s2.q.m6931getYimpl(jIntOffset), s2.q.m6930getXimpl(jB2) + s2.q.m6930getXimpl(jIntOffset), jB2), null);
        }

        public final void placeRelativeWithLayer(q1 q1Var, int i10, int i11, float f10, kv.l layerBlock) {
            kotlin.jvm.internal.e0.checkNotNullParameter(q1Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(layerBlock, "layerBlock");
            long jIntOffset = s2.r.IntOffset(i10, i11);
            if (a() == s2.x.f85363b || b() == 0) {
                long jB = q1Var.b();
                q1Var.c(f10, o2.d(s2.q.m6931getYimpl(jIntOffset), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(jIntOffset), jB), layerBlock);
                return;
            }
            long jIntOffset2 = s2.r.IntOffset((b() - s2.v.m6972getWidthimpl(q1Var.f91404e)) - s2.q.m6930getXimpl(jIntOffset), s2.q.m6931getYimpl(jIntOffset));
            long jB2 = q1Var.b();
            q1Var.c(f10, o2.d(s2.q.m6931getYimpl(jIntOffset2), s2.q.m6930getXimpl(jB2) + s2.q.m6930getXimpl(jIntOffset2), jB2), layerBlock);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m7847placeRelativeWithLayeraW9wM(q1 placeRelativeWithLayer, long j10, float f10, kv.l layerBlock) {
            kotlin.jvm.internal.e0.checkNotNullParameter(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
            kotlin.jvm.internal.e0.checkNotNullParameter(layerBlock, "layerBlock");
            if (a() == s2.x.f85363b || b() == 0) {
                long jB = placeRelativeWithLayer.b();
                placeRelativeWithLayer.c(f10, o2.d(s2.q.m6931getYimpl(j10), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(j10), jB), layerBlock);
                return;
            }
            long jIntOffset = s2.r.IntOffset((b() - s2.v.m6972getWidthimpl(placeRelativeWithLayer.f91404e)) - s2.q.m6930getXimpl(j10), s2.q.m6931getYimpl(j10));
            long jB2 = placeRelativeWithLayer.b();
            placeRelativeWithLayer.c(f10, o2.d(s2.q.m6931getYimpl(jIntOffset), s2.q.m6930getXimpl(jB2) + s2.q.m6930getXimpl(jIntOffset), jB2), layerBlock);
        }

        public final void placeWithLayer(q1 q1Var, int i10, int i11, float f10, kv.l layerBlock) {
            kotlin.jvm.internal.e0.checkNotNullParameter(q1Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(layerBlock, "layerBlock");
            long jIntOffset = s2.r.IntOffset(i10, i11);
            long jB = q1Var.b();
            q1Var.c(f10, o2.d(s2.q.m6931getYimpl(jIntOffset), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(jIntOffset), jB), layerBlock);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m7848placeWithLayeraW9wM(q1 placeWithLayer, long j10, float f10, kv.l layerBlock) {
            kotlin.jvm.internal.e0.checkNotNullParameter(placeWithLayer, "$this$placeWithLayer");
            kotlin.jvm.internal.e0.checkNotNullParameter(layerBlock, "layerBlock");
            long jB = placeWithLayer.b();
            placeWithLayer.c(f10, o2.d(s2.q.m6931getYimpl(j10), s2.q.m6930getXimpl(jB) + s2.q.m6930getXimpl(j10), jB), layerBlock);
        }
    }

    public final long b() {
        return s2.r.IntOffset((this.f91402b - s2.v.m6972getWidthimpl(this.f91404e)) / 2, (this.f91403c - s2.v.m6971getHeightimpl(this.f91404e)) / 2);
    }

    public abstract void c(float f10, long j10, kv.l lVar);

    public final void d() {
        this.f91402b = qv.v.coerceIn(s2.v.m6972getWidthimpl(this.f91404e), s2.c.m6757getMinWidthimpl(this.f91405f), s2.c.m6755getMaxWidthimpl(this.f91405f));
        this.f91403c = qv.v.coerceIn(s2.v.m6971getHeightimpl(this.f91404e), s2.c.m6756getMinHeightimpl(this.f91405f), s2.c.m6754getMaxHeightimpl(this.f91405f));
    }

    public final void e(long j10) {
        if (s2.v.m6970equalsimpl0(this.f91404e, j10)) {
            return;
        }
        this.f91404e = j10;
        d();
    }

    @Override // x1.b1
    public abstract /* synthetic */ int get(x1.a aVar);

    public final int getHeight() {
        return this.f91403c;
    }

    @Override // x1.b1
    public int getMeasuredHeight() {
        return s2.v.m6971getHeightimpl(this.f91404e);
    }

    @Override // x1.b1
    public int getMeasuredWidth() {
        return s2.v.m6972getWidthimpl(this.f91404e);
    }

    @Override // x1.b1
    public /* bridge */ /* synthetic */ Object getParentData() {
        return super.getParentData();
    }

    public final int getWidth() {
        return this.f91402b;
    }
}
