package es;

import java.util.List;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface i0 {
    static List<i0> forConfig(b0 b0Var, wr.m mVar) {
        x4 x4VarBuilder = b5.builder();
        if (b0Var.f55021e != null) {
            x4VarBuilder.add((Object) new j0(b0Var, mVar));
        }
        if (b0Var.f55022f != null) {
            x4VarBuilder.add((Object) new v(b0Var, mVar));
        }
        return x4VarBuilder.build();
    }

    void ejectOutliers(s sVar, long j10);
}
