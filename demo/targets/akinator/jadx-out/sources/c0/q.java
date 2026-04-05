package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    public static final p AnimationState(float f10, float f11, long j10, long j11, boolean z10) {
        return new p(h3.getVectorConverter(kotlin.jvm.internal.w.f71862a), Float.valueOf(f10), w.AnimationVector(f11), j10, j11, z10);
    }

    public static /* synthetic */ p AnimationState$default(float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 8) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return AnimationState(f10, f11, j10, j11, z10);
    }

    public static final <T, V extends v> p copy(p pVar, T t10, V v10, long j10, long j11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pVar, "<this>");
        return new p(pVar.getTypeConverter(), t10, v10, j10, j11, z10);
    }

    public static /* synthetic */ p copy$default(p pVar, Object obj, v vVar, long j10, long j11, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = pVar.getValue();
        }
        if ((i10 & 2) != 0) {
            vVar = w.copy(pVar.getVelocityVector());
        }
        if ((i10 & 4) != 0) {
            j10 = pVar.getLastFrameTimeNanos();
        }
        if ((i10 & 8) != 0) {
            j11 = pVar.getFinishedTimeNanos();
        }
        if ((i10 & 16) != 0) {
            z10 = pVar.isRunning();
        }
        boolean z11 = z10;
        long j12 = j11;
        return copy(pVar, obj, vVar, j10, j12, z11);
    }

    public static final <T, V extends v> V createZeroVectorFrom(n2 n2Var, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(n2Var, "<this>");
        return (V) w.newInstance((v) n2Var.getConvertToVector().invoke(t10));
    }

    public static final boolean isFinished(p pVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pVar, "<this>");
        return pVar.getFinishedTimeNanos() != Long.MIN_VALUE;
    }

    public static /* synthetic */ p AnimationState$default(n2 n2Var, Object obj, Object obj2, long j10, long j11, boolean z10, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            j10 = Long.MIN_VALUE;
        }
        if ((i10 & 16) != 0) {
            j11 = Long.MIN_VALUE;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return AnimationState(n2Var, obj, obj2, j10, j11, z10);
    }

    public static final p copy(p pVar, float f10, float f11, long j10, long j11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pVar, "<this>");
        return new p(pVar.getTypeConverter(), Float.valueOf(f10), w.AnimationVector(f11), j10, j11, z10);
    }

    public static final <T, V extends v> p AnimationState(n2 typeConverter, T t10, T t11, long j10, long j11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        return new p(typeConverter, t10, (v) typeConverter.getConvertToVector().invoke(t11), j10, j11, z10);
    }

    public static /* synthetic */ p copy$default(p pVar, float f10, float f11, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) pVar.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((r) pVar.getVelocityVector()).getValue();
        }
        if ((i10 & 4) != 0) {
            j10 = pVar.getLastFrameTimeNanos();
        }
        if ((i10 & 8) != 0) {
            j11 = pVar.getFinishedTimeNanos();
        }
        if ((i10 & 16) != 0) {
            z10 = pVar.isRunning();
        }
        boolean z11 = z10;
        long j12 = j11;
        return copy(pVar, f10, f11, j10, j12, z11);
    }
}
