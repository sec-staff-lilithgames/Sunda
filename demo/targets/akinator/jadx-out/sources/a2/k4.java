package a2;

import android.graphics.Matrix;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k4 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final k4 f3694e = new k4(2);

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((c3) obj, (Matrix) obj2);
        return tu.x0.f87415a;
    }

    public final void invoke(c3 rn2, Matrix matrix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rn2, "rn");
        kotlin.jvm.internal.e0.checkNotNullParameter(matrix, "matrix");
        rn2.getMatrix(matrix);
    }
}
