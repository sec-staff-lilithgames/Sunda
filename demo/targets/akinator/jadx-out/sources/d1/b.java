package d1;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.z0;
import p0.d0;
import p0.f0;
import p0.r4;
import p0.s4;
import p0.v4;
import p0.z;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    public static final Integer a(r4 r4Var, f0 f0Var, int i10, int i11) {
        Integer numA;
        while (true) {
            if (i10 >= i11) {
                return null;
            }
            int iGroupSize = r4Var.groupSize(i10) + i10;
            if (r4Var.hasMark(i10) && r4Var.groupKey(i10) == 206 && e0.areEqual(r4Var.groupObjectKey(i10), d0.getReference())) {
                Object objGroupGet = r4Var.groupGet(i10, 0);
                z.a aVar = objGroupGet instanceof z.a ? (z.a) objGroupGet : null;
                if (aVar != null && e0.areEqual(aVar.getRef(), f0Var)) {
                    return Integer.valueOf(i10);
                }
            }
            if (r4Var.containsMark(i10) && (numA = a(r4Var, f0Var, i10 + 1, iGroupSize)) != null) {
                return Integer.valueOf(numA.intValue());
            }
            i10 = iGroupSize;
        }
    }

    public static final List<c> buildTrace(v4 v4Var, Object obj, int i10, Integer num) {
        if (v4Var.getClosed() || v4Var.getSize$runtime() == 0) {
            return p0.emptyList();
        }
        z zVar = new z(v4Var);
        int iIntValue = num != null ? num.intValue() : v4Var.getParent() < 0 ? v4Var.parent(i10) : v4Var.getParent();
        if (obj == null) {
            obj = Integer.valueOf(v4Var.groupSlotIndex(i10));
        }
        while (i10 >= 0) {
            zVar.processEdge(v4Var.sourceInformationOf$runtime(i10), obj);
            obj = v4Var.anchor(i10);
            if (iIntValue >= 0) {
                int i11 = iIntValue;
                iIntValue = v4Var.parent(iIntValue);
                i10 = i11;
            } else {
                i10 = iIntValue;
            }
        }
        return zVar.trace();
    }

    public static /* synthetic */ List buildTrace$default(v4 v4Var, Object obj, int i10, Integer num, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        if ((i11 & 2) != 0) {
            i10 = v4Var.getCurrentGroup();
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        return buildTrace(v4Var, obj, i10, num);
    }

    public static final r findLocation(s4 s4Var, kv.l lVar) {
        r4 r4VarOpenReader = s4Var.openReader();
        try {
            z0 z0Var = new z0();
            while (z0Var.f71866b < s4Var.getGroupsSize()) {
                if (r4VarOpenReader.isNode(z0Var.f71866b) && ((Boolean) lVar.invoke(r4VarOpenReader.node(z0Var.f71866b))).booleanValue()) {
                    return new r(z0Var.f71866b, null);
                }
                int iSlotSize = r4VarOpenReader.slotSize(z0Var.f71866b);
                for (int i10 = 0; i10 < iSlotSize; i10++) {
                    if (((Boolean) lVar.invoke(r4VarOpenReader.groupGet(z0Var.f71866b, i10))).booleanValue()) {
                        return new r(z0Var.f71866b, Integer.valueOf(i10));
                    }
                }
                z0Var.f71866b++;
            }
            return null;
        } finally {
            r4VarOpenReader.close();
        }
    }

    public static final Integer findSubcompositionContextGroup(s4 s4Var, f0 f0Var) {
        r4 r4VarOpenReader = s4Var.openReader();
        try {
            return a(r4VarOpenReader, f0Var, 0, r4VarOpenReader.getSize());
        } finally {
            r4VarOpenReader.close();
        }
    }

    public static final List<c> traceForGroup(r4 r4Var, int i10, Object obj) {
        v vVar = new v(r4Var);
        int iParent = r4Var.parent(i10);
        p0.b bVarAnchor = r4Var.anchor(i10);
        while (i10 >= 0) {
            vVar.processEdge(r4Var.getTable$runtime().sourceInformationOf(i10), obj);
            if (iParent >= 0) {
                p0.b bVar = bVarAnchor;
                bVarAnchor = r4Var.anchor(iParent);
                i10 = iParent;
                iParent = r4Var.parent(iParent);
                obj = bVar;
            } else {
                i10 = iParent;
                obj = bVarAnchor;
            }
        }
        return vVar.trace();
    }

    public static final List<c> buildTrace(r4 r4Var) {
        if (!r4Var.getClosed() && r4Var.getSize() != 0) {
            v vVar = new v(r4Var);
            int parent = r4Var.getParent();
            Object objValueOf = Integer.valueOf(r4Var.getSlot());
            while (parent >= 0) {
                vVar.processEdge(r4Var.getTable$runtime().sourceInformationOf(parent), objValueOf);
                objValueOf = r4Var.anchor(parent);
                parent = r4Var.parent(parent);
            }
            return vVar.trace();
        }
        return p0.emptyList();
    }
}
