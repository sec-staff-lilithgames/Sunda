package oq;

import br.g0;
import br.x1;
import br.z1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g {
    public static final z1 a(g0 g0Var) {
        x1 rightSideBindParams;
        e0.checkNotNullParameter(g0Var, "<this>");
        if (g0Var.getLeftSideBindParams() != null) {
            x1 leftSideBindParams = g0Var.getLeftSideBindParams();
            if (leftSideBindParams != null) {
                return leftSideBindParams.getTargetSideType();
            }
            return null;
        }
        if (g0Var.getRightSideBindParams() == null || (rightSideBindParams = g0Var.getRightSideBindParams()) == null) {
            return null;
        }
        return rightSideBindParams.getTargetSideType();
    }

    public static final z1 b(g0 g0Var) {
        x1 bottomSideBindParams;
        e0.checkNotNullParameter(g0Var, "<this>");
        if (g0Var.getTopSideBindParams() != null) {
            x1 topSideBindParams = g0Var.getTopSideBindParams();
            if (topSideBindParams != null) {
                return topSideBindParams.getTargetSideType();
            }
            return null;
        }
        if (g0Var.getBottomSideBindParams() == null || (bottomSideBindParams = g0Var.getBottomSideBindParams()) == null) {
            return null;
        }
        return bottomSideBindParams.getTargetSideType();
    }
}
