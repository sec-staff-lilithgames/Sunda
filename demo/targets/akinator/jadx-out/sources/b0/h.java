package b0;

import com.apm.insight.b.El.rJqlArycrfkilN;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class h implements x1.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f8377a;

    public h(e0 scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f8377a = scope;
    }

    public final e0 getScope() {
        return this.f8377a;
    }

    @Override // x1.x0
    public int maxIntrinsicHeight(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) rv.f0.maxOrNull(rv.f0.map(uu.y0.asSequence(measurables), new c(i10)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // x1.x0
    public int maxIntrinsicWidth(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) rv.f0.maxOrNull(rv.f0.map(uu.y0.asSequence(measurables), new d(i10)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // x1.x0
    public int minIntrinsicHeight(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) rv.f0.maxOrNull(rv.f0.map(uu.y0.asSequence(measurables), new f(i10)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // x1.x0
    public int minIntrinsicWidth(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        Integer num = (Integer) rv.f0.maxOrNull(rv.f0.map(uu.y0.asSequence(measurables), new g(i10)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v22 */
    @Override // x1.x0
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public x1.y0 mo79measure3p2s80s(x1.a1 a1Var, List<? extends x1.w0> measurables, long j10) {
        Object obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(a1Var, rJqlArycrfkilN.qrgzUFDGRVbKPqJ);
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        List<? extends x1.w0> list = measurables;
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((x1.w0) it.next()).mo7826measureBRTryo0(j10));
        }
        x1.q1 q1Var = null;
        int i10 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((x1.q1) obj).getWidth();
            int lastIndex = uu.p0.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i11 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i11);
                    int width2 = ((x1.q1) obj2).getWidth();
                    if (width < width2) {
                        obj = obj2;
                        width = width2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        }
        x1.q1 q1Var2 = (x1.q1) obj;
        int width3 = q1Var2 != null ? q1Var2.getWidth() : 0;
        if (!arrayList.isEmpty()) {
            ?? r11 = arrayList.get(0);
            int height = ((x1.q1) r11).getHeight();
            int lastIndex2 = uu.p0.getLastIndex(arrayList);
            boolean z10 = r11;
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj3 = arrayList.get(i10);
                    int height2 = ((x1.q1) obj3).getHeight();
                    r11 = z10;
                    if (height < height2) {
                        r11 = obj3;
                        height = height2;
                    }
                    if (i10 == lastIndex2) {
                        break;
                    }
                    i10++;
                    z10 = r11;
                }
            }
            q1Var = r11;
        }
        x1.q1 q1Var3 = q1Var;
        int height3 = q1Var3 != null ? q1Var3.getHeight() : 0;
        this.f8377a.getTargetSize$animation_release().setValue(s2.v.m6964boximpl(s2.w.IntSize(width3, height3)));
        return x1.a1.layout$default(a1Var, width3, height3, null, new e(arrayList), 4, null);
    }
}
