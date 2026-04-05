package q0;

import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class r0 {
    public static final Throwable access$attachComposeStackTrace(Throwable th2, p0 p0Var, v4 v4Var, p0.b bVar) {
        return p0Var == null ? th2 : d1.d.attachComposeStackTrace(th2, new com.moloco.sdk.internal.ilrd.j(bVar, 4, v4Var, p0Var));
    }

    public static final int access$positionToInsert(v4 v4Var, p0.b bVar, p0.d dVar) {
        int iAnchorIndex = v4Var.anchorIndex(bVar);
        if (v4Var.getCurrentGroup() >= iAnchorIndex) {
            p0.d0.composeImmediateRuntimeError("Check failed");
        }
        while (!v4Var.indexInParent(iAnchorIndex)) {
            v4Var.skipToGroupEnd();
            if (v4Var.isNode(v4Var.getParent())) {
                dVar.up();
            }
            v4Var.endGroup();
        }
        int currentGroup = v4Var.getCurrentGroup();
        int parent = v4Var.getParent();
        while (parent >= 0 && !v4Var.isNode(parent)) {
            parent = v4Var.parent(parent);
        }
        int iGroupSize = parent + 1;
        int iSkipGroup = 0;
        while (iGroupSize < currentGroup) {
            if (v4Var.indexInGroup(currentGroup, iGroupSize)) {
                if (v4Var.isNode(iGroupSize)) {
                    iSkipGroup = 0;
                }
                iGroupSize++;
            } else {
                iSkipGroup += v4Var.isNode(iGroupSize) ? 1 : v4Var.nodeCount(iGroupSize);
                iGroupSize += v4Var.groupSize(iGroupSize);
            }
        }
        while (v4Var.getCurrentGroup() < iAnchorIndex) {
            if (v4Var.indexInCurrentGroup(iAnchorIndex)) {
                if (v4Var.isNode()) {
                    dVar.down(v4Var.node(v4Var.getCurrentGroup()));
                    iSkipGroup = 0;
                }
                v4Var.startGroup();
            } else {
                iSkipGroup += v4Var.skipGroup();
            }
        }
        if (v4Var.getCurrentGroup() == iAnchorIndex) {
            return iSkipGroup;
        }
        p0.d0.composeImmediateRuntimeError("Check failed");
        return iSkipGroup;
    }

    public static final void access$positionToParentOf(v4 v4Var, p0.d dVar, int i10) {
        while (!v4Var.indexInParent(i10)) {
            v4Var.skipToGroupEnd();
            if (v4Var.isNode(v4Var.getParent())) {
                dVar.up();
            }
            v4Var.endGroup();
        }
    }

    public static final p0 access$withCurrentStackTrace(p0 p0Var, v4 v4Var) {
        return new q0(p0Var, v4Var);
    }
}
