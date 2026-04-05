package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final e0 Canvas(y0 image) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        return d.ActualCanvas(image);
    }

    public static final void rotate(e0 e0Var, float f10, float f11, float f12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        if (f10 == 0.0f) {
            return;
        }
        e0Var.translate(f11, f12);
        e0Var.rotate(f10);
        e0Var.translate(-f11, -f12);
    }

    public static final void rotateRad(e0 e0Var, float f10, float f11, float f12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        rotate(e0Var, p0.degrees(f10), f11, f12);
    }

    public static /* synthetic */ void rotateRad$default(e0 e0Var, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        rotateRad(e0Var, f10, f11, f12);
    }

    public static final void scale(e0 e0Var, float f10, float f11, float f12, float f13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        if (f10 == 1.0f && f11 == 1.0f) {
            return;
        }
        e0Var.translate(f12, f13);
        e0Var.scale(f10, f11);
        e0Var.translate(-f12, -f13);
    }

    public static /* synthetic */ void scale$default(e0 e0Var, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        scale(e0Var, f10, f11, f12, f13);
    }

    public static final void withSave(e0 e0Var, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        try {
            e0Var.save();
            block.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            e0Var.restore();
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public static final void withSaveLayer(e0 e0Var, i1.j bounds, i1 paint, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(bounds, "bounds");
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "paint");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        try {
            e0Var.saveLayer(bounds, paint);
            block.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            e0Var.restore();
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }
}
