package z1;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f97346a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f97347b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f97348c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f97349d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f97350e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f97351f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f97352g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f97353h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f97354i;

    public m0(b0 layoutNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        this.f97346a = layoutNode;
        this.f97347b = true;
        this.f97354i = new HashMap();
    }

    public static final void a(m0 m0Var, x1.a aVar, int i10, u0 u0Var) {
        HashMap map;
        float f10 = i10;
        long jOffset = i1.i.Offset(f10, f10);
        while (true) {
            jOffset = u0Var.m8096toParentPositionMKHz9U(jOffset);
            u0Var = u0Var.getWrappedBy$ui_release();
            kotlin.jvm.internal.e0.checkNotNull(u0Var);
            b0 b0Var = m0Var.f97346a;
            map = m0Var.f97354i;
            if (kotlin.jvm.internal.e0.areEqual(u0Var, b0Var.getInnerLayoutNodeWrapper$ui_release())) {
                break;
            } else if (u0Var.getMeasureResult().getAlignmentLines().containsKey(aVar)) {
                float f11 = u0Var.get(aVar);
                jOffset = i1.i.Offset(f11, f11);
            }
        }
        int iRoundToInt = aVar instanceof x1.x ? mv.d.roundToInt(i1.h.m4186getYimpl(jOffset)) : mv.d.roundToInt(i1.h.m4185getXimpl(jOffset));
        if (map.containsKey(aVar)) {
            iRoundToInt = x1.d.merge(aVar, ((Number) uu.p1.getValue(map, aVar)).intValue(), iRoundToInt);
        }
        map.put(aVar, Integer.valueOf(iRoundToInt));
    }

    public final boolean getDirty$ui_release() {
        return this.f97347b;
    }

    public final Map<x1.a, Integer> getLastCalculation() {
        return this.f97354i;
    }

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.f97350e;
    }

    public final boolean getQueried$ui_release() {
        return this.f97348c || this.f97350e || this.f97351f || this.f97352g;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner$ui_release();
        return this.f97353h != null;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.f97352g;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.f97351f;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.f97349d;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.f97348c;
    }

    public final void recalculate() {
        HashMap map = this.f97354i;
        map.clear();
        b0 b0Var = this.f97346a;
        r0.c cVar = b0Var.get_children$ui_release();
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            int i10 = 0;
            do {
                b0 b0Var2 = (b0) content[i10];
                if (b0Var2.isPlaced()) {
                    if (b0Var2.getAlignmentLines$ui_release().f97347b) {
                        b0Var2.layoutChildren$ui_release();
                    }
                    for (Map.Entry entry : b0Var2.getAlignmentLines$ui_release().f97354i.entrySet()) {
                        a(this, (x1.a) entry.getKey(), ((Number) entry.getValue()).intValue(), b0Var2.getInnerLayoutNodeWrapper$ui_release());
                    }
                    u0 wrappedBy$ui_release = b0Var2.getInnerLayoutNodeWrapper$ui_release().getWrappedBy$ui_release();
                    kotlin.jvm.internal.e0.checkNotNull(wrappedBy$ui_release);
                    while (!kotlin.jvm.internal.e0.areEqual(wrappedBy$ui_release, b0Var.getInnerLayoutNodeWrapper$ui_release())) {
                        for (x1.a aVar : wrappedBy$ui_release.getMeasureResult().getAlignmentLines().keySet()) {
                            a(this, aVar, wrappedBy$ui_release.get(aVar), wrappedBy$ui_release);
                        }
                        wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release();
                        kotlin.jvm.internal.e0.checkNotNull(wrappedBy$ui_release);
                    }
                }
                i10++;
            } while (i10 < size);
        }
        map.putAll(b0Var.getInnerLayoutNodeWrapper$ui_release().getMeasureResult().getAlignmentLines());
        this.f97347b = false;
    }

    public final void recalculateQueryOwner$ui_release() {
        m0 alignmentLines$ui_release;
        m0 alignmentLines$ui_release2;
        boolean queried$ui_release = getQueried$ui_release();
        b0 b0Var = this.f97346a;
        if (!queried$ui_release) {
            b0 parent$ui_release = b0Var.getParent$ui_release();
            if (parent$ui_release == null) {
                return;
            }
            b0Var = parent$ui_release.getAlignmentLines$ui_release().f97353h;
            if (b0Var == null || !b0Var.getAlignmentLines$ui_release().getQueried$ui_release()) {
                b0 b0Var2 = this.f97353h;
                if (b0Var2 == null || b0Var2.getAlignmentLines$ui_release().getQueried$ui_release()) {
                    return;
                }
                b0 parent$ui_release2 = b0Var2.getParent$ui_release();
                if (parent$ui_release2 != null && (alignmentLines$ui_release2 = parent$ui_release2.getAlignmentLines$ui_release()) != null) {
                    alignmentLines$ui_release2.recalculateQueryOwner$ui_release();
                }
                b0 parent$ui_release3 = b0Var2.getParent$ui_release();
                b0Var = (parent$ui_release3 == null || (alignmentLines$ui_release = parent$ui_release3.getAlignmentLines$ui_release()) == null) ? null : alignmentLines$ui_release.f97353h;
            }
        }
        this.f97353h = b0Var;
    }

    public final void reset$ui_release() {
        this.f97347b = true;
        this.f97348c = false;
        this.f97350e = false;
        this.f97349d = false;
        this.f97351f = false;
        this.f97352g = false;
        this.f97353h = null;
    }

    public final void setDirty$ui_release(boolean z10) {
        this.f97347b = z10;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z10) {
        this.f97350e = z10;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z10) {
        this.f97352g = z10;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z10) {
        this.f97351f = z10;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z10) {
        this.f97349d = z10;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z10) {
        this.f97348c = z10;
    }
}
