package e2;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d0 {
    public static final void a(z1.b0 b0Var, ArrayList arrayList) {
        r0.c zSortedChildren = b0Var.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            Object[] content = zSortedChildren.getContent();
            int i10 = 0;
            do {
                z1.b0 b0Var2 = (z1.b0) content[i10];
                s outerSemantics = getOuterSemantics(b0Var2);
                if (outerSemantics != null) {
                    arrayList.add(outerSemantics);
                } else {
                    a(b0Var2, arrayList);
                }
                i10++;
            } while (i10 < size);
        }
    }

    public static final int access$contentDescriptionFakeNodeId(c0 c0Var) {
        return c0Var.getId() + 2000000000;
    }

    public static final z1.b0 access$findClosestParentNode(z1.b0 b0Var, kv.l lVar) {
        for (z1.b0 parent$ui_release = b0Var.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (((Boolean) lVar.invoke(parent$ui_release)).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    public static final m access$getRole(c0 c0Var) {
        return (m) r.getOrNull(c0Var.getUnmergedConfig$ui_release(), n0.f53555a.getRole());
    }

    public static final int access$roleFakeNodeId(c0 c0Var) {
        return c0Var.getId() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
    }

    public static final s getOuterMergingSemantics(z1.b0 b0Var) {
        s sVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(b0Var, "<this>");
        z1.u0 outerLayoutNodeWrapper$ui_release = b0Var.getOuterLayoutNodeWrapper$ui_release();
        while (outerLayoutNodeWrapper$ui_release != null && !z1.r.m8080has0OSVbXo(outerLayoutNodeWrapper$ui_release.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w())) {
            outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release();
        }
        if (outerLayoutNodeWrapper$ui_release != null && (sVar = (s) z1.r.m8082head0OSVbXo(outerLayoutNodeWrapper$ui_release.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w())) != null) {
            z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
            while (layoutNodeWrapper != null) {
                while (sVar != null) {
                    if (((t) sVar.getModifier()).getSemanticsConfiguration().isMergingSemanticsOfDescendants()) {
                        return sVar;
                    }
                    sVar = (s) sVar.getNext();
                }
                layoutNodeWrapper = layoutNodeWrapper.getWrapped$ui_release();
                sVar = layoutNodeWrapper != null ? (s) z1.r.m8082head0OSVbXo(layoutNodeWrapper.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w()) : null;
            }
        }
        return null;
    }

    public static final s getOuterSemantics(z1.b0 b0Var) {
        s sVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(b0Var, "<this>");
        z1.u0 outerLayoutNodeWrapper$ui_release = b0Var.getOuterLayoutNodeWrapper$ui_release();
        while (outerLayoutNodeWrapper$ui_release != null && !z1.r.m8080has0OSVbXo(outerLayoutNodeWrapper$ui_release.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w())) {
            outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release();
        }
        if (outerLayoutNodeWrapper$ui_release != null && (sVar = (s) z1.r.m8082head0OSVbXo(outerLayoutNodeWrapper$ui_release.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w())) != null) {
            z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
            while (layoutNodeWrapper != null) {
                if (sVar != null) {
                    return sVar;
                }
                layoutNodeWrapper = layoutNodeWrapper.getWrapped$ui_release();
                sVar = layoutNodeWrapper != null ? (s) z1.r.m8082head0OSVbXo(layoutNodeWrapper.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w()) : null;
            }
        }
        return null;
    }

    public static final s nearestSemantics(z1.u0 u0Var, kv.l predicate) {
        s sVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(u0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        while (u0Var != null && !z1.r.m8080has0OSVbXo(u0Var.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w())) {
            u0Var = u0Var.getWrapped$ui_release();
        }
        if (u0Var != null && (sVar = (s) z1.r.m8082head0OSVbXo(u0Var.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w())) != null) {
            z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
            while (layoutNodeWrapper != null) {
                while (sVar != null) {
                    if (((Boolean) predicate.invoke(sVar)).booleanValue()) {
                        return sVar;
                    }
                    sVar = (s) sVar.getNext();
                }
                layoutNodeWrapper = layoutNodeWrapper.getWrapped$ui_release();
                sVar = layoutNodeWrapper != null ? (s) z1.r.m8082head0OSVbXo(layoutNodeWrapper.m8092getEntitiesCHwCgZE(), z1.r.f97382b.m8060getSemanticsEntityTypeEEbPh1w()) : null;
            }
        }
        return null;
    }
}
