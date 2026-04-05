package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final a f53522g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static h f53523h = h.f53529b;

    /* renamed from: b, reason: collision with root package name */
    public final z1.b0 f53524b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.b0 f53525c;

    /* renamed from: e, reason: collision with root package name */
    public final i1.j f53526e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.x f53527f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final h getComparisonStrategy$ui_release() {
            return g.f53523h;
        }

        public final void setComparisonStrategy$ui_release(h hVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(hVar, "<set-?>");
            g.f53523h = hVar;
        }
    }

    public g(z1.b0 subtreeRoot, z1.b0 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(subtreeRoot, "subtreeRoot");
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        this.f53524b = subtreeRoot;
        this.f53525c = node;
        this.f53527f = subtreeRoot.getLayoutDirection();
        z1.u0 innerLayoutNodeWrapper$ui_release = subtreeRoot.getInnerLayoutNodeWrapper$ui_release();
        z1.u0 u0VarFindWrapperToGetBounds = v0.findWrapperToGetBounds(node);
        i1.j jVarLocalBoundingBoxOf$default = null;
        if (innerLayoutNodeWrapper$ui_release.isAttached() && u0VarFindWrapperToGetBounds.isAttached()) {
            jVarLocalBoundingBoxOf$default = x1.d0.localBoundingBoxOf$default(innerLayoutNodeWrapper$ui_release, u0VarFindWrapperToGetBounds, false, 2, null);
        }
        this.f53526e = jVarLocalBoundingBoxOf$default;
    }

    public final z1.b0 getNode$ui_release() {
        return this.f53525c;
    }

    public final z1.b0 getSubtreeRoot$ui_release() {
        return this.f53524b;
    }

    @Override // java.lang.Comparable
    public int compareTo(g other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        i1.j jVar = this.f53526e;
        if (jVar == null) {
            return 1;
        }
        i1.j jVar2 = other.f53526e;
        z1.b0 b0Var = other.f53525c;
        if (jVar2 == null) {
            return -1;
        }
        if (f53523h == h.f53529b) {
            if (jVar.getBottom() - jVar2.getTop() <= 0.0f) {
                return -1;
            }
            if (jVar.getTop() - jVar2.getBottom() >= 0.0f) {
                return 1;
            }
        }
        if (this.f53527f == s2.x.f85363b) {
            float left = jVar.getLeft() - jVar2.getLeft();
            if (left != 0.0f) {
                return left < 0.0f ? -1 : 1;
            }
        } else {
            float right = jVar.getRight() - jVar2.getRight();
            if (right != 0.0f) {
                return right < 0.0f ? 1 : -1;
            }
        }
        float top = jVar.getTop() - jVar2.getTop();
        if (top != 0.0f) {
            return top < 0.0f ? -1 : 1;
        }
        float height = jVar.getHeight() - jVar2.getHeight();
        if (height != 0.0f) {
            return height < 0.0f ? 1 : -1;
        }
        float width = jVar.getWidth() - jVar2.getWidth();
        if (width != 0.0f) {
            return width < 0.0f ? 1 : -1;
        }
        z1.b0 b0Var2 = this.f53525c;
        i1.j jVarBoundsInRoot = x1.e0.boundsInRoot(v0.findWrapperToGetBounds(b0Var2));
        i1.j jVarBoundsInRoot2 = x1.e0.boundsInRoot(v0.findWrapperToGetBounds(b0Var));
        z1.b0 b0VarFindNodeByPredicateTraversal = v0.findNodeByPredicateTraversal(b0Var2, new i(jVarBoundsInRoot));
        z1.b0 b0VarFindNodeByPredicateTraversal2 = v0.findNodeByPredicateTraversal(b0Var, new j(jVarBoundsInRoot2));
        return (b0VarFindNodeByPredicateTraversal == null || b0VarFindNodeByPredicateTraversal2 == null) ? b0VarFindNodeByPredicateTraversal != null ? 1 : -1 : new g(this.f53524b, b0VarFindNodeByPredicateTraversal).compareTo(new g(other.f53524b, b0VarFindNodeByPredicateTraversal2));
    }
}
