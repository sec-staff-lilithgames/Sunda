package g0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q2 {
    public static final kv.q access$MaxIntrinsicHeightMeasureBlock(b2 b2Var) {
        return b2Var == b2.f56364b ? a2.f56338a.getHorizontalMaxHeight() : a2.f56338a.getVerticalMaxHeight();
    }

    public static final kv.q access$MaxIntrinsicWidthMeasureBlock(b2 b2Var) {
        return b2Var == b2.f56364b ? a2.f56338a.getHorizontalMaxWidth() : a2.f56338a.getVerticalMaxWidth();
    }

    public static final kv.q access$MinIntrinsicHeightMeasureBlock(b2 b2Var) {
        return b2Var == b2.f56364b ? a2.f56338a.getHorizontalMinHeight() : a2.f56338a.getVerticalMinHeight();
    }

    public static final kv.q access$MinIntrinsicWidthMeasureBlock(b2 b2Var) {
        return b2Var == b2.f56364b ? a2.f56338a.getHorizontalMinWidth() : a2.f56338a.getVerticalMinWidth();
    }

    public static final l0 access$getCrossAxisAlignment(r2 r2Var) {
        if (r2Var != null) {
            return r2Var.getCrossAxisAlignment();
        }
        return null;
    }

    public static final r2 access$getData(x1.y yVar) {
        Object parentData = yVar.getParentData();
        if (parentData instanceof r2) {
            return (r2) parentData;
        }
        return null;
    }

    public static final boolean access$getFill(r2 r2Var) {
        if (r2Var != null) {
            return r2Var.getFill();
        }
        return true;
    }

    public static final float access$getWeight(r2 r2Var) {
        if (r2Var != null) {
            return r2Var.getWeight();
        }
        return 0.0f;
    }

    public static final int access$intrinsicSize(List list, kv.p pVar, kv.p pVar2, int i10, int i11, b2 b2Var, b2 b2Var2) {
        int i12 = 0;
        if (b2Var == b2Var2) {
            int size = list.size();
            float f10 = 0.0f;
            int iMax = 0;
            int i13 = 0;
            while (i12 < size) {
                x1.y yVar = (x1.y) list.get(i12);
                Object parentData = yVar.getParentData();
                r2 r2Var = parentData instanceof r2 ? (r2) parentData : null;
                float weight = r2Var != null ? r2Var.getWeight() : 0.0f;
                int iIntValue = ((Number) pVar.invoke(yVar, Integer.valueOf(i10))).intValue();
                if (weight == 0.0f) {
                    i13 += iIntValue;
                } else if (weight > 0.0f) {
                    f10 += weight;
                    iMax = Math.max(iMax, mv.d.roundToInt(iIntValue / weight));
                }
                i12++;
            }
            return ((list.size() - 1) * i11) + mv.d.roundToInt(iMax * f10) + i13;
        }
        int iMin = Math.min((list.size() - 1) * i11, i10);
        int size2 = list.size();
        float f11 = 0.0f;
        int iMax2 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            x1.y yVar2 = (x1.y) list.get(i14);
            Object parentData2 = yVar2.getParentData();
            r2 r2Var2 = parentData2 instanceof r2 ? (r2) parentData2 : null;
            float weight2 = r2Var2 != null ? r2Var2.getWeight() : 0.0f;
            if (weight2 == 0.0f) {
                int iMin2 = Math.min(((Number) pVar2.invoke(yVar2, Integer.MAX_VALUE)).intValue(), i10 - iMin);
                iMin += iMin2;
                iMax2 = Math.max(iMax2, ((Number) pVar.invoke(yVar2, Integer.valueOf(iMin2))).intValue());
            } else if (weight2 > 0.0f) {
                f11 += weight2;
            }
        }
        int iRoundToInt = f11 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mv.d.roundToInt(Math.max(i10 - iMin, 0) / f11);
        int size3 = list.size();
        while (i12 < size3) {
            x1.y yVar3 = (x1.y) list.get(i12);
            Object parentData3 = yVar3.getParentData();
            r2 r2Var3 = parentData3 instanceof r2 ? (r2) parentData3 : null;
            float weight3 = r2Var3 != null ? r2Var3.getWeight() : 0.0f;
            if (weight3 > 0.0f) {
                iMax2 = Math.max(iMax2, ((Number) pVar.invoke(yVar3, Integer.valueOf(iRoundToInt != Integer.MAX_VALUE ? mv.d.roundToInt(iRoundToInt * weight3) : Integer.MAX_VALUE))).intValue());
            }
            i12++;
        }
        return iMax2;
    }

    public static final boolean access$isRelative(r2 r2Var) {
        l0 crossAxisAlignment = r2Var != null ? r2Var.getCrossAxisAlignment() : null;
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    public static final int access$rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(x1.q1 q1Var, b2 b2Var) {
        return b2Var == b2.f56364b ? q1Var.getHeight() : q1Var.getWidth();
    }

    public static final int access$rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(x1.q1 q1Var, b2 b2Var) {
        return b2Var == b2.f56364b ? q1Var.getWidth() : q1Var.getHeight();
    }

    /* renamed from: rowColumnMeasurePolicy-TDGSqEk, reason: not valid java name */
    public static final x1.x0 m3926rowColumnMeasurePolicyTDGSqEk(b2 orientation, kv.s arrangement, float f10, i3 crossAxisSize, l0 crossAxisAlignment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        kotlin.jvm.internal.e0.checkNotNullParameter(arrangement, "arrangement");
        kotlin.jvm.internal.e0.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        kotlin.jvm.internal.e0.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new p2(orientation, arrangement, f10, crossAxisSize, crossAxisAlignment);
    }
}
