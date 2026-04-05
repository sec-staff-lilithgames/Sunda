package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public static final g f51371e = new g(3);

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m3691invoke3p2s80s((x1.a1) obj, (x1.w0) obj2, ((s2.c) obj3).m6761unboximpl());
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final x1.y0 m3691invoke3p2s80s(x1.a1 layout, x1.w0 measurable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(j10);
        int iMo3419roundToPx0680j_4 = layout.mo3419roundToPx0680j_4(s2.i.m6817constructorimpl(f1.getMaxSupportedElevation() * 2));
        return x1.a1.layout$default(layout, q1VarMo7826measureBRTryo0.getWidth() + iMo3419roundToPx0680j_4, q1VarMo7826measureBRTryo0.getHeight() + iMo3419roundToPx0680j_4, null, new f(q1VarMo7826measureBRTryo0, iMo3419roundToPx0680j_4), 4, null);
    }
}
