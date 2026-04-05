package g0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public static final e1 f56400e = new e1(3);

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((List<? extends x1.y>) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(List<? extends x1.y> measurables, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return Integer.valueOf(q2.access$intrinsicSize(measurables, c1.f56374e, d1.f56381e, i10, i11, b2.f56364b, b2.f56365c));
    }
}
