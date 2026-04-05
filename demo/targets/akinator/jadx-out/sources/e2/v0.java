package e2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v0 {
    public static final z1.b0 findNodeByPredicateTraversal(z1.b0 b0Var, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        if (((Boolean) predicate.invoke(b0Var)).booleanValue()) {
            return b0Var;
        }
        List<z1.b0> children$ui_release = b0Var.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            z1.b0 b0VarFindNodeByPredicateTraversal = findNodeByPredicateTraversal(children$ui_release.get(i10), predicate);
            if (b0VarFindNodeByPredicateTraversal != null) {
                return b0VarFindNodeByPredicateTraversal;
            }
        }
        return null;
    }

    public static final List<s> findOneLayerOfSemanticsWrappersSortedByBounds(z1.b0 b0Var, List<s> list) {
        List mutableList;
        kotlin.jvm.internal.e0.checkNotNullParameter(b0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "list");
        if (b0Var.isAttached()) {
            ArrayList arrayList = new ArrayList();
            List<z1.b0> children$ui_release = b0Var.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                z1.b0 b0Var2 = children$ui_release.get(i10);
                if (b0Var2.isAttached()) {
                    arrayList.add(new g(b0Var, b0Var2));
                }
            }
            try {
                g.f53522g.setComparisonStrategy$ui_release(h.f53529b);
                mutableList = y0.toMutableList((Collection) arrayList);
                uu.u0.sort(mutableList);
            } catch (IllegalArgumentException unused) {
                g.f53522g.setComparisonStrategy$ui_release(h.f53530c);
                mutableList = y0.toMutableList((Collection) arrayList);
                uu.u0.sort(mutableList);
            }
            ArrayList arrayList2 = new ArrayList(mutableList.size());
            int size2 = mutableList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(((g) mutableList.get(i11)).getNode$ui_release());
            }
            int size3 = arrayList2.size();
            for (int i12 = 0; i12 < size3; i12++) {
                z1.b0 b0Var3 = (z1.b0) arrayList2.get(i12);
                s outerSemantics = d0.getOuterSemantics(b0Var3);
                if (outerSemantics != null) {
                    list.add(outerSemantics);
                } else {
                    findOneLayerOfSemanticsWrappersSortedByBounds(b0Var3, list);
                }
            }
        }
        return list;
    }

    public static /* synthetic */ List findOneLayerOfSemanticsWrappersSortedByBounds$default(z1.b0 b0Var, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return findOneLayerOfSemanticsWrappersSortedByBounds(b0Var, list);
    }

    public static final z1.u0 findWrapperToGetBounds(z1.b0 b0Var) {
        z1.u0 layoutNodeWrapper;
        kotlin.jvm.internal.e0.checkNotNullParameter(b0Var, "<this>");
        s outerMergingSemantics = d0.getOuterMergingSemantics(b0Var);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = d0.getOuterSemantics(b0Var);
        }
        return (outerMergingSemantics == null || (layoutNodeWrapper = outerMergingSemantics.getLayoutNodeWrapper()) == null) ? b0Var.getInnerLayoutNodeWrapper$ui_release() : layoutNodeWrapper;
    }
}
