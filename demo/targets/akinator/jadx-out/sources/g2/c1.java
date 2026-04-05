package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final c1 f56740e = new c1(2);

    @Override // kv.p
    public final Object invoke(a1.r Saver, r1 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(Saver, "$this$Saver");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        j1.m0 m0VarM4848boximpl = j1.m0.m4848boximpl(it.m4016getColor0d7_KjU());
        j1.l0 l0Var = j1.m0.f68918b;
        Object objSave = q1.save(m0VarM4848boximpl, q1.getSaver(l0Var), Saver);
        s2.z zVarM6984boximpl = s2.z.m6984boximpl(it.m4017getFontSizeXSAIIZE());
        s2.y yVar = s2.z.f85366b;
        return uu.p0.arrayListOf(objSave, q1.save(zVarM6984boximpl, q1.getSaver(yVar), Saver), q1.save(it.getFontWeight(), q1.getSaver(l2.c1.f72258c), Saver), q1.save(it.m4018getFontStyle4Lr2A7w()), q1.save(it.m4019getFontSynthesisZQGJjVo()), q1.save(-1), q1.save(it.getFontFeatureSettings()), q1.save(s2.z.m6984boximpl(it.m4020getLetterSpacingXSAIIZE()), q1.getSaver(yVar), Saver), q1.save(it.m4015getBaselineShift5SSeXJ0(), q1.getSaver(r2.b.f83677b), Saver), q1.save(it.getTextGeometricTransform(), q1.getSaver(r2.v.f83724c), Saver), q1.save(it.getLocaleList(), q1.getSaver(n2.e.f75556e), Saver), q1.save(j1.m0.m4848boximpl(it.m4014getBackground0d7_KjU()), q1.getSaver(l0Var), Saver), q1.save(it.getTextDecoration(), q1.getSaver(r2.n.f83709b), Saver), q1.save(it.getShadow(), q1.getSaver(j1.d2.f68857d), Saver));
    }
}
