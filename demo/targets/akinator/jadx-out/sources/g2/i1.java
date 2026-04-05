package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final i1 f56772e = new i1(2);

    @Override // kv.p
    public final Object invoke(a1.r Saver, r2.x it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(Saver, "$this$Saver");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        s2.z zVarM6984boximpl = s2.z.m6984boximpl(it.m6094getFirstLineXSAIIZE());
        s2.y yVar = s2.z.f85366b;
        return uu.p0.arrayListOf(q1.save(zVarM6984boximpl, q1.getSaver(yVar), Saver), q1.save(s2.z.m6984boximpl(it.m6095getRestLineXSAIIZE()), q1.getSaver(yVar), Saver));
    }
}
