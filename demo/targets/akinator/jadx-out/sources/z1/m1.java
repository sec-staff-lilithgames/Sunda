package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final r0.c f97355a = new r0.c(new b0[16], 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public static void a(b0 b0Var) {
        b0Var.dispatchOnPositionedCallbacks$ui_release();
        int i10 = 0;
        b0Var.setNeedsOnPositionedDispatch$ui_release(false);
        r0.c cVar = b0Var.get_children$ui_release();
        int size = cVar.getSize();
        if (size > 0) {
            Object[] content = cVar.getContent();
            do {
                a((b0) content[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    public final void dispatch() {
        l1 l1Var = l1.f97340b;
        r0.c cVar = this.f97355a;
        cVar.sortWith(l1Var);
        int size = cVar.getSize();
        if (size > 0) {
            int i10 = size - 1;
            Object[] content = cVar.getContent();
            do {
                b0 b0Var = (b0) content[i10];
                if (b0Var.getNeedsOnPositionedDispatch$ui_release()) {
                    a(b0Var);
                }
                i10--;
            } while (i10 >= 0);
        }
        cVar.clear();
    }

    public final void onNodePositioned(b0 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        this.f97355a.add(node);
        node.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(b0 rootNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rootNode, "rootNode");
        r0.c cVar = this.f97355a;
        cVar.clear();
        cVar.add(rootNode);
        rootNode.setNeedsOnPositionedDispatch$ui_release(true);
    }
}
