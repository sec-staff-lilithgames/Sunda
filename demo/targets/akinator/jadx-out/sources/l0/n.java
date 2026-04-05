package l0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements x1.x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n f72129a = new n();

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(x1.z zVar, List list, int i10) {
        return super.maxIntrinsicHeight(zVar, list, i10);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(x1.z zVar, List list, int i10) {
        return super.maxIntrinsicWidth(zVar, list, i10);
    }

    @Override // x1.x0
    /* renamed from: measure-3p2s80s */
    public final x1.y0 mo79measure3p2s80s(x1.a1 Layout, List<? extends x1.w0> children, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(Layout, "$this$Layout");
        kotlin.jvm.internal.e0.checkNotNullParameter(children, "children");
        ArrayList arrayList = new ArrayList(children.size());
        int size = children.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(children.get(i10).mo7826measureBRTryo0(j10));
        }
        return x1.a1.layout$default(Layout, s2.c.m6755getMaxWidthimpl(j10), s2.c.m6754getMaxHeightimpl(j10), null, new m(arrayList), 4, null);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(x1.z zVar, List list, int i10) {
        return super.minIntrinsicHeight(zVar, list, i10);
    }

    @Override // x1.x0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(x1.z zVar, List list, int i10) {
        return super.minIntrinsicWidth(zVar, list, i10);
    }
}
