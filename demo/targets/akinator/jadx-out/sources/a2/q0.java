package a2;

import a2.i0;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q0 {
    public static final void a(Region region, e2.c0 c0Var, LinkedHashMap linkedHashMap, e2.c0 c0Var2) {
        x1.f0 layoutInfo;
        boolean z10 = (c0Var2.getLayoutNode$ui_release().isPlaced() && c0Var2.getLayoutNode$ui_release().isAttached()) ? false : true;
        if (!region.isEmpty() || c0Var2.getId() == c0Var.getId()) {
            if (!z10 || c0Var2.isFake$ui_release()) {
                Rect androidRect = j1.w1.toAndroidRect(c0Var2.getTouchBoundsInRoot());
                Region region2 = new Region();
                region2.set(androidRect);
                int id2 = c0Var2.getId() == c0Var.getId() ? -1 : c0Var2.getId();
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(id2);
                    Rect bounds = region2.getBounds();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(bounds, "region.bounds");
                    linkedHashMap.put(numValueOf, new q4(c0Var2, bounds));
                    List<e2.c0> replacedChildren$ui_release = c0Var2.getReplacedChildren$ui_release();
                    for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                        a(region, c0Var, linkedHashMap, replacedChildren$ui_release.get(size));
                    }
                    region.op(androidRect, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (c0Var2.isFake$ui_release()) {
                    e2.c0 parent = c0Var2.getParent();
                    linkedHashMap.put(Integer.valueOf(id2), new q4(c0Var2, j1.w1.toAndroidRect((parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? new i1.j(0.0f, 0.0f, 10.0f, 10.0f) : parent.getBoundsInRoot())));
                } else if (id2 == -1) {
                    Integer numValueOf2 = Integer.valueOf(id2);
                    Rect bounds2 = region2.getBounds();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(bounds2, "region.bounds");
                    linkedHashMap.put(numValueOf2, new q4(c0Var2, bounds2));
                }
            }
        }
    }

    public static final boolean access$accessibilityEquals(e2.a aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof e2.a)) {
            return false;
        }
        e2.a aVar2 = (e2.a) obj;
        if (!kotlin.jvm.internal.e0.areEqual(aVar.getLabel(), aVar2.getLabel())) {
            return false;
        }
        if (aVar.getAction() != null || aVar2.getAction() == null) {
            return aVar.getAction() == null || aVar2.getAction() != null;
        }
        return false;
    }

    public static final boolean access$enabled(e2.c0 c0Var) {
        return e2.r.getOrNull(c0Var.getConfig(), e2.n0.f53555a.getDisabled()) == null;
    }

    public static final boolean access$excludeLineAndPageGranularities(e2.c0 c0Var) {
        e2.p pVarCollapsedSemanticsConfiguration;
        if (c0Var.getUnmergedConfig$ui_release().contains(e2.o.f53581a.getSetText()) && !kotlin.jvm.internal.e0.areEqual(e2.r.getOrNull(c0Var.getUnmergedConfig$ui_release(), e2.n0.f53555a.getFocused()), Boolean.TRUE)) {
            return true;
        }
        z1.b0 parent$ui_release = c0Var.getLayoutNode$ui_release().getParent$ui_release();
        while (true) {
            if (parent$ui_release == null) {
                parent$ui_release = null;
                break;
            }
            if (((Boolean) p0.f3752e.invoke((Object) parent$ui_release)).booleanValue()) {
                break;
            }
            parent$ui_release = parent$ui_release.getParent$ui_release();
        }
        if (parent$ui_release != null) {
            e2.s outerSemantics = e2.d0.getOuterSemantics(parent$ui_release);
            if (!((outerSemantics == null || (pVarCollapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) == null) ? false : kotlin.jvm.internal.e0.areEqual(e2.r.getOrNull(pVarCollapsedSemanticsConfiguration, e2.n0.f53555a.getFocused()), Boolean.TRUE))) {
                return true;
            }
        }
        return false;
    }

    public static final z1.b0 access$findClosestParentNode(z1.b0 b0Var, kv.l lVar) {
        for (z1.b0 parent$ui_release = b0Var.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (((Boolean) lVar.invoke(parent$ui_release)).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    public static final boolean access$isRtl(e2.c0 c0Var) {
        return c0Var.getLayoutInfo().getLayoutDirection() == s2.x.f85364c;
    }

    public static final boolean access$propertiesDeleted(e2.c0 c0Var, i0.d dVar) {
        Iterator<Map.Entry<e2.t0, Object>> it = dVar.getUnmergedConfig().iterator();
        while (it.hasNext()) {
            if (!c0Var.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final p4 findById(List<p4> list, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).getSemanticsNodeId() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    public static final Map<Integer, q4> getAllUncoveredSemanticsNodesToMap(e2.e0 e0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        e2.c0 unmergedRootSemanticsNode = e0Var.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            Region region = new Region();
            region.set(j1.w1.toAndroidRect(unmergedRootSemanticsNode.getBoundsInRoot()));
            a(region, unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode);
        }
        return linkedHashMap;
    }
}
