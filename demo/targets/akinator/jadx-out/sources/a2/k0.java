package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f3690e = new k0(1);

    @Override // kv.l
    public final Boolean invoke(z1.b0 parent) {
        e2.p pVarCollapsedSemanticsConfiguration;
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        e2.s outerSemantics = e2.d0.getOuterSemantics(parent);
        boolean z10 = false;
        if (outerSemantics != null && (pVarCollapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) != null && pVarCollapsedSemanticsConfiguration.isMergingSemanticsOfDescendants()) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
