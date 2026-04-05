package x1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface x0 {
    default int maxIntrinsicHeight(z zVar, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new t(measurables.get(i11), a0.f91329c, b0.f91333c));
        }
        return mo79measure3p2s80s(new c0(zVar, zVar.getLayoutDirection()), arrayList, s2.d.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(z zVar, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new t(measurables.get(i11), a0.f91329c, b0.f91332b));
        }
        return mo79measure3p2s80s(new c0(zVar, zVar.getLayoutDirection()), arrayList, s2.d.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }

    /* renamed from: measure-3p2s80s */
    y0 mo79measure3p2s80s(a1 a1Var, List<? extends w0> list, long j10);

    default int minIntrinsicHeight(z zVar, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new t(measurables.get(i11), a0.f91328b, b0.f91333c));
        }
        return mo79measure3p2s80s(new c0(zVar, zVar.getLayoutDirection()), arrayList, s2.d.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(z zVar, List<? extends y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new t(measurables.get(i11), a0.f91328b, b0.f91332b));
        }
        return mo79measure3p2s80s(new c0(zVar, zVar.getLayoutDirection()), arrayList, s2.d.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }
}
