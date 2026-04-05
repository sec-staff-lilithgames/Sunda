package a2;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1.b0 f3859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f3860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f3861f;

    public v(z1.b0 b0Var, t tVar, t tVar2) {
        this.f3859d = b0Var;
        this.f3860e = tVar;
        this.f3861f = tVar2;
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View host, y3.c info) {
        kotlin.jvm.internal.e0.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        e2.s outerSemantics = e2.d0.getOuterSemantics(this.f3859d);
        kotlin.jvm.internal.e0.checkNotNull(outerSemantics);
        e2.c0 parent = new e2.c0(outerSemantics, false).getParent();
        kotlin.jvm.internal.e0.checkNotNull(parent);
        int id2 = parent.getId();
        if (id2 == this.f3860e.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            id2 = -1;
        }
        info.setParent(this.f3861f, id2);
    }
}
