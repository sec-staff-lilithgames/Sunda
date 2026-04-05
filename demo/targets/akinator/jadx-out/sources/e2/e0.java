package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final z1.b0 f53517a;

    public e0(z1.b0 rootNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rootNode, "rootNode");
        this.f53517a = rootNode;
    }

    public final c0 getRootSemanticsNode() {
        s outerSemantics = d0.getOuterSemantics(this.f53517a);
        kotlin.jvm.internal.e0.checkNotNull(outerSemantics);
        return new c0(outerSemantics, true);
    }

    public final c0 getUnmergedRootSemanticsNode() {
        s outerSemantics = d0.getOuterSemantics(this.f53517a);
        kotlin.jvm.internal.e0.checkNotNull(outerSemantics);
        return new c0(outerSemantics, false);
    }
}
