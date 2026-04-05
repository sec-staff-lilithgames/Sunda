package z1;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f97323a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.o f97324b;

    /* renamed from: c, reason: collision with root package name */
    public final d2 f97325c;

    public j() {
        this(false, 1, null);
    }

    public final void add(b0 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        if (!node.isAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f97323a) {
            tu.o oVar = this.f97324b;
            Integer num = (Integer) ((Map) oVar.getValue()).get(node);
            if (num == null) {
                ((Map) oVar.getValue()).put(node, Integer.valueOf(node.getDepth$ui_release()));
            } else {
                if (num.intValue() != node.getDepth$ui_release()) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
        this.f97325c.add(node);
    }

    public final boolean contains(b0 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        boolean zContains = this.f97325c.contains(node);
        if (!this.f97323a || zContains == ((Map) this.f97324b.getValue()).containsKey(node)) {
            return zContains;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean isEmpty() {
        return this.f97325c.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final b0 pop() {
        b0 node = (b0) this.f97325c.first();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(node, "node");
        remove(node);
        return node;
    }

    public final void popEach(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        while (!isEmpty()) {
            block.invoke(pop());
        }
    }

    public final boolean remove(b0 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        if (!node.isAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zRemove = this.f97325c.remove(node);
        if (this.f97323a) {
            Integer num = (Integer) ((Map) this.f97324b.getValue()).remove(node);
            if (zRemove) {
                int depth$ui_release = node.getDepth$ui_release();
                if (num == null || num.intValue() != depth$ui_release) {
                    throw new IllegalStateException("Check failed.");
                }
            } else if (num != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        return zRemove;
    }

    public String toString() {
        String string = this.f97325c.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "set.toString()");
        return string;
    }

    public j(boolean z10) {
        this.f97323a = z10;
        this.f97324b = tu.q.lazy(tu.s.f87405e, (kv.a) i.f97315e);
        this.f97325c = new d2(new h());
    }

    public /* synthetic */ j(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
