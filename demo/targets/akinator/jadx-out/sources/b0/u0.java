package b0;

import c0.h3;
import c0.y3;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0.n2 f8514a = h3.TwoWayConverter(s0.f8499e, t0.f8510e);

    /* renamed from: b, reason: collision with root package name */
    public static final p0.j2 f8515b = o5.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    public static final c0.i1 f8516c = c0.o.spring$default(0.0f, 400.0f, null, 5, null);

    /* renamed from: d, reason: collision with root package name */
    public static final c0.i1 f8517d = c0.o.spring$default(0.0f, 400.0f, s2.q.m6921boximpl(y3.getVisibilityThreshold(s2.q.f85352b)), 1, null);

    /* renamed from: e, reason: collision with root package name */
    public static final c0.i1 f8518e = c0.o.spring$default(0.0f, 400.0f, s2.v.m6964boximpl(y3.getVisibilityThreshold(s2.v.f85360b)), 1, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.q {

        /* renamed from: e, reason: collision with root package name */
        public static final a f8519e = new a();

        public a() {
            super(3);
        }

        public final c0.i1 invoke(c0.a2 a2Var, p0.w wVar, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(a2Var, "$this$null");
            wVar.startReplaceableGroup(-895531546);
            c0.i1 i1VarSpring$default = c0.o.spring$default(0.0f, 0.0f, null, 7, null);
            wVar.endReplaceableGroup();
            return i1VarSpring$default;
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((c0.a2) obj, (p0.w) obj2, ((Number) obj3).intValue());
        }
    }

    public static final e1.d a(e1.b bVar) {
        e1.a aVar = e1.d.f53469a;
        return kotlin.jvm.internal.e0.areEqual(bVar, aVar.getStart()) ? aVar.getCenterStart() : kotlin.jvm.internal.e0.areEqual(bVar, aVar.getEnd()) ? aVar.getCenterEnd() : aVar.getCenter();
    }

    public static final e1.d b(e1.c cVar) {
        e1.a aVar = e1.d.f53469a;
        return kotlin.jvm.internal.e0.areEqual(cVar, aVar.getTop()) ? aVar.getTopCenter() : kotlin.jvm.internal.e0.areEqual(cVar, aVar.getBottom()) ? aVar.getBottomCenter() : aVar.getCenter();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final e1.v createModifier(c0.z1 r21, b0.t1 r22, b0.v1 r23, java.lang.String r24, p0.w r25, int r26) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.u0.createModifier(c0.z1, b0.t1, b0.v1, java.lang.String, p0.w, int):e1.v");
    }

    public static final t1 expandHorizontally(c0.j0 animationSpec, e1.b expandFrom, boolean z10, kv.l initialWidth) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(expandFrom, "expandFrom");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialWidth, "initialWidth");
        return expandIn(animationSpec, a(expandFrom), z10, new a1(initialWidth));
    }

    public static /* synthetic */ t1 expandHorizontally$default(c0.j0 j0Var, e1.b bVar, boolean z10, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.v.m6964boximpl(y3.getVisibilityThreshold(s2.v.f85360b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = e1.d.f53469a.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = z0.f8568e;
        }
        return expandHorizontally(j0Var, bVar, z10, lVar);
    }

    public static final t1 expandIn(c0.j0 animationSpec, e1.d expandFrom, boolean z10, kv.l initialSize) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(expandFrom, "expandFrom");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialSize, "initialSize");
        return new u1(new u2(null, null, new i0(expandFrom, initialSize, animationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ t1 expandIn$default(c0.j0 j0Var, e1.d dVar, boolean z10, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.v.m6964boximpl(y3.getVisibilityThreshold(s2.v.f85360b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            dVar = e1.d.f53469a.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = b1.f8333e;
        }
        return expandIn(j0Var, dVar, z10, lVar);
    }

    public static final t1 expandVertically(c0.j0 animationSpec, e1.c expandFrom, boolean z10, kv.l initialHeight) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(expandFrom, "expandFrom");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialHeight, "initialHeight");
        return expandIn(animationSpec, b(expandFrom), z10, new d1(initialHeight));
    }

    public static /* synthetic */ t1 expandVertically$default(c0.j0 j0Var, e1.c cVar, boolean z10, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.v.m6964boximpl(y3.getVisibilityThreshold(s2.v.f85360b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = e1.d.f53469a.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = c1.f8339e;
        }
        return expandVertically(j0Var, cVar, z10, lVar);
    }

    public static final t1 fadeIn(c0.j0 animationSpec, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return new u1(new u2(new d2(f10, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ t1 fadeIn$default(c0.j0 j0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return fadeIn(j0Var, f10);
    }

    public static final v1 fadeOut(c0.j0 animationSpec, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return new w1(new u2(new d2(f10, animationSpec), null, null, null, 14, null));
    }

    public static /* synthetic */ v1 fadeOut$default(c0.j0 j0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return fadeOut(j0Var, f10);
    }

    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final t1 m105scaleInL8ZKhE(c0.j0 animationSpec, float f10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return new u1(new u2(null, null, null, new i2(f10, j10, animationSpec, null), 7, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ t1 m106scaleInL8ZKhE$default(c0.j0 j0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = j1.u2.f69011b.m4991getCenterSzJe1aQ();
        }
        return m105scaleInL8ZKhE(j0Var, f10, j10);
    }

    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final v1 m107scaleOutL8ZKhE(c0.j0 animationSpec, float f10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return new w1(new u2(null, null, null, new i2(f10, j10, animationSpec, null), 7, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ v1 m108scaleOutL8ZKhE$default(c0.j0 j0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = j1.u2.f69011b.m4991getCenterSzJe1aQ();
        }
        return m107scaleOutL8ZKhE(j0Var, f10, j10);
    }

    public static final v1 shrinkHorizontally(c0.j0 animationSpec, e1.b shrinkTowards, boolean z10, kv.l targetWidth) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetWidth, "targetWidth");
        return shrinkOut(animationSpec, a(shrinkTowards), z10, new g1(targetWidth));
    }

    public static /* synthetic */ v1 shrinkHorizontally$default(c0.j0 j0Var, e1.b bVar, boolean z10, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.v.m6964boximpl(y3.getVisibilityThreshold(s2.v.f85360b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = e1.d.f53469a.getEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = f1.f8365e;
        }
        return shrinkHorizontally(j0Var, bVar, z10, lVar);
    }

    public static final v1 shrinkOut(c0.j0 animationSpec, e1.d shrinkTowards, boolean z10, kv.l targetSize) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetSize, "targetSize");
        return new w1(new u2(null, null, new i0(shrinkTowards, targetSize, animationSpec, z10), null, 11, null));
    }

    public static /* synthetic */ v1 shrinkOut$default(c0.j0 j0Var, e1.d dVar, boolean z10, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.v.m6964boximpl(y3.getVisibilityThreshold(s2.v.f85360b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            dVar = e1.d.f53469a.getBottomEnd();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = h1.f8379e;
        }
        return shrinkOut(j0Var, dVar, z10, lVar);
    }

    public static final v1 shrinkVertically(c0.j0 animationSpec, e1.c shrinkTowards, boolean z10, kv.l targetHeight) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetHeight, "targetHeight");
        return shrinkOut(animationSpec, b(shrinkTowards), z10, new j1(targetHeight));
    }

    public static /* synthetic */ v1 shrinkVertically$default(c0.j0 j0Var, e1.c cVar, boolean z10, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.v.m6964boximpl(y3.getVisibilityThreshold(s2.v.f85360b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = e1.d.f53469a.getBottom();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = i1.f8385e;
        }
        return shrinkVertically(j0Var, cVar, z10, lVar);
    }

    public static final t1 slideIn(c0.j0 animationSpec, kv.l initialOffset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialOffset, "initialOffset");
        return new u1(new u2(null, new m2(initialOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ t1 slideIn$default(c0.j0 j0Var, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.q.m6921boximpl(y3.getVisibilityThreshold(s2.q.f85352b)), 1, null);
        }
        return slideIn(j0Var, lVar);
    }

    public static final t1 slideInHorizontally(c0.j0 animationSpec, kv.l initialOffsetX) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialOffsetX, "initialOffsetX");
        return slideIn(animationSpec, new l1(initialOffsetX));
    }

    public static /* synthetic */ t1 slideInHorizontally$default(c0.j0 j0Var, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.q.m6921boximpl(y3.getVisibilityThreshold(s2.q.f85352b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = k1.f8407e;
        }
        return slideInHorizontally(j0Var, lVar);
    }

    public static final t1 slideInVertically(c0.j0 animationSpec, kv.l initialOffsetY) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialOffsetY, "initialOffsetY");
        return slideIn(animationSpec, new o1(initialOffsetY));
    }

    public static /* synthetic */ t1 slideInVertically$default(c0.j0 j0Var, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.q.m6921boximpl(y3.getVisibilityThreshold(s2.q.f85352b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = n1.f8440e;
        }
        return slideInVertically(j0Var, lVar);
    }

    public static final v1 slideOut(c0.j0 animationSpec, kv.l targetOffset) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetOffset, "targetOffset");
        return new w1(new u2(null, new m2(targetOffset, animationSpec), null, null, 13, null));
    }

    public static /* synthetic */ v1 slideOut$default(c0.j0 j0Var, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.q.m6921boximpl(y3.getVisibilityThreshold(s2.q.f85352b)), 1, null);
        }
        return slideOut(j0Var, lVar);
    }

    public static final v1 slideOutHorizontally(c0.j0 animationSpec, kv.l targetOffsetX) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetOffsetX, "targetOffsetX");
        return slideOut(animationSpec, new q1(targetOffsetX));
    }

    public static /* synthetic */ v1 slideOutHorizontally$default(c0.j0 j0Var, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.q.m6921boximpl(y3.getVisibilityThreshold(s2.q.f85352b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = p1.f8476e;
        }
        return slideOutHorizontally(j0Var, lVar);
    }

    public static final v1 slideOutVertically(c0.j0 animationSpec, kv.l targetOffsetY) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetOffsetY, "targetOffsetY");
        return slideOut(animationSpec, new s1(targetOffsetY));
    }

    public static /* synthetic */ v1 slideOutVertically$default(c0.j0 j0Var, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j0Var = c0.o.spring$default(0.0f, 400.0f, s2.q.m6921boximpl(y3.getVisibilityThreshold(s2.q.f85352b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = r1.f8497e;
        }
        return slideOutVertically(j0Var, lVar);
    }
}
