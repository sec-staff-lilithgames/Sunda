package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f53500e = new a0(1);

    @Override // kv.l
    public final Boolean invoke(z1.b0 it) {
        p pVarCollapsedSemanticsConfiguration;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        s outerSemantics = d0.getOuterSemantics(it);
        boolean z10 = false;
        if (outerSemantics != null && (pVarCollapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) != null && pVarCollapsedSemanticsConfiguration.isMergingSemanticsOfDescendants()) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
