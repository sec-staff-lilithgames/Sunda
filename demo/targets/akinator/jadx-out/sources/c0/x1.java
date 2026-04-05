package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x1 {
    public static final Object a(g gVar, kv.l lVar, zu.d dVar) {
        return gVar.isInfinite() ? p0.withInfiniteAnimationFrameNanos(lVar, dVar) : p0.e2.withFrameNanos(new w1(lVar), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends c0.v> java.lang.Object animate(c0.p r23, c0.g r24, long r25, kv.l r27, zu.d<? super tu.x0> r28) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.x1.animate(c0.p, c0.g, long, kv.l, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object animate$default(float f10, float f11, float f12, n nVar, kv.p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            nVar = o.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f10, f11, f12, nVar, pVar, dVar);
    }

    public static final Object animateDecay(float f10, float f11, l0 l0Var, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objAnimate$default = animate$default(q.AnimationState$default(f10, f11, 0L, 0L, false, 28, null), k.DecayAnimation(l0Var, f10, f11), 0L, new t1(pVar), dVar, 2, null);
        return objAnimate$default == av.e.getCOROUTINE_SUSPENDED() ? objAnimate$default : tu.x0.f87415a;
    }

    public static /* synthetic */ Object animateDecay$default(p pVar, c0 c0Var, boolean z10, kv.l lVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar = u1.f11634e;
        }
        return animateDecay(pVar, c0Var, z10, lVar, (zu.d<? super tu.x0>) dVar);
    }

    public static final <T, V extends v> Object animateTo(p pVar, T t10, n nVar, boolean z10, kv.l lVar, zu.d<? super tu.x0> dVar) {
        Object objAnimate = animate(pVar, new y1(nVar, pVar.getTypeConverter(), pVar.getValue(), t10, pVar.getVelocityVector()), z10 ? pVar.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, dVar);
        return objAnimate == av.e.getCOROUTINE_SUSPENDED() ? objAnimate : tu.x0.f87415a;
    }

    public static /* synthetic */ Object animateTo$default(p pVar, Object obj, n nVar, boolean z10, kv.l lVar, zu.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            nVar = o.spring$default(0.0f, 0.0f, null, 7, null);
        }
        n nVar2 = nVar;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            lVar = v1.f11645e;
        }
        return animateTo(pVar, obj, nVar2, z11, lVar, dVar);
    }

    public static final void b(m mVar, long j10, float f10, g gVar, p pVar, kv.l lVar) {
        long durationNanos = f10 == 0.0f ? gVar.getDurationNanos() : (long) ((j10 - mVar.getStartTimeNanos()) / f10);
        mVar.setLastFrameTimeNanos$animation_core_release(j10);
        mVar.setValue$animation_core_release(gVar.getValueFromNanos(durationNanos));
        mVar.setVelocityVector$animation_core_release(gVar.getVelocityVectorFromNanos(durationNanos));
        if (gVar.isFinishedFromNanos(durationNanos)) {
            mVar.setFinishedTimeNanos$animation_core_release(mVar.getLastFrameTimeNanos());
            mVar.setRunning$animation_core_release(false);
        }
        updateState(mVar, pVar);
        lVar.invoke(mVar);
    }

    public static final float getDurationScale(zu.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        e1.y yVar = (e1.y) mVar.get(e1.x.f53497b);
        float scaleFactor = yVar != null ? yVar.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final <T, V extends v> void updateState(m mVar, p state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        state.setValue$animation_core_release(mVar.getValue());
        w.copyFrom(state.getVelocityVector(), mVar.getVelocityVector());
        state.setFinishedTimeNanos$animation_core_release(mVar.getFinishedTimeNanos());
        state.setLastFrameTimeNanos$animation_core_release(mVar.getLastFrameTimeNanos());
        state.setRunning$animation_core_release(mVar.isRunning());
    }

    public static /* synthetic */ Object animate$default(n2 n2Var, Object obj, Object obj2, Object obj3, n nVar, kv.p pVar, zu.d dVar, int i10, Object obj4) {
        if ((i10 & 8) != 0) {
            obj3 = null;
        }
        if ((i10 & 16) != 0) {
            nVar = o.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(n2Var, obj, obj2, obj3, nVar, pVar, dVar);
    }

    public static final <T, V extends v> Object animateDecay(p pVar, c0 c0Var, boolean z10, kv.l lVar, zu.d<? super tu.x0> dVar) {
        Object objAnimate = animate(pVar, new b0(c0Var, pVar.getTypeConverter(), pVar.getValue(), pVar.getVelocityVector()), z10 ? pVar.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, dVar);
        return objAnimate == av.e.getCOROUTINE_SUSPENDED() ? objAnimate : tu.x0.f87415a;
    }

    public static /* synthetic */ Object animate$default(p pVar, g gVar, long j10, kv.l lVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            lVar = o1.f11556e;
        }
        return animate(pVar, gVar, j11, lVar, dVar);
    }

    public static final Object animate(float f10, float f11, float f12, n nVar, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objAnimate = animate(h3.getVectorConverter(kotlin.jvm.internal.w.f71862a), bv.b.boxFloat(f10), bv.b.boxFloat(f11), bv.b.boxFloat(f12), nVar, pVar, dVar);
        return objAnimate == av.e.getCOROUTINE_SUSPENDED() ? objAnimate : tu.x0.f87415a;
    }

    public static final <T, V extends v> Object animate(n2 n2Var, T t10, T t11, T t12, n nVar, kv.p pVar, zu.d<? super tu.x0> dVar) {
        v vVarNewInstance;
        if (t12 == null || (vVarNewInstance = (v) n2Var.getConvertToVector().invoke(t12)) == null) {
            vVarNewInstance = w.newInstance((v) n2Var.getConvertToVector().invoke(t10));
        }
        v vVar = vVarNewInstance;
        Object objAnimate$default = animate$default(new p(n2Var, t10, vVar, 0L, 0L, false, 56, null), new y1(nVar, n2Var, t10, t11, vVar), 0L, new m1(pVar, n2Var), dVar, 2, null);
        return objAnimate$default == av.e.getCOROUTINE_SUSPENDED() ? objAnimate$default : tu.x0.f87415a;
    }
}
