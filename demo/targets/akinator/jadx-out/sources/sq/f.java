package sq;

import br.u;
import ir.q;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u algorithmParams) {
        super(algorithmParams);
        e0.checkNotNullParameter(algorithmParams, "algorithmParams");
    }

    public static float c(int i10, int i11) {
        float fRedToRatio = q.redToRatio(i10) - q.redToRatio(i11);
        float fGreenToRatio = q.greenToRatio(i10) - q.greenToRatio(i11);
        float fBlueToRatio = q.blueToRatio(i10) - q.blueToRatio(i11);
        return (float) Math.sqrt((fBlueToRatio * fBlueToRatio) + (fGreenToRatio * fGreenToRatio) + (fRedToRatio * fRedToRatio));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd A[SYNTHETIC] */
    @Override // sq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean a(android.graphics.Bitmap r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sq.f.a(android.graphics.Bitmap):java.lang.Boolean");
    }
}
