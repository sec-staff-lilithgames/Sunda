package h1;

import a2.t3;
import a2.w3;
import h1.o0;
import z1.s1;
import z1.y1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y1.f f58571a = y1.c.modifierLocalOf(j0.f58569e);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f58572e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lVar) {
            super(1);
            this.f58572e = lVar;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return tu.x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "focusProperties").set("scope", this.f58572e);
        }
    }

    public static final void clear(h0 h0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(h0Var, "<this>");
        h0Var.setCanFocus(true);
        o0.a aVar = o0.f58586b;
        h0Var.setNext(aVar.getDefault());
        h0Var.setPrevious(aVar.getDefault());
        h0Var.setUp(aVar.getDefault());
        h0Var.setDown(aVar.getDefault());
        h0Var.setLeft(aVar.getDefault());
        h0Var.setRight(aVar.getDefault());
        h0Var.setStart(aVar.getDefault());
        h0Var.setEnd(aVar.getDefault());
    }

    public static final e1.v focusProperties(e1.v vVar, kv.l scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        return vVar.then(new m0(scope, t3.isDebugInspectorInfoEnabled() ? new a(scope) : t3.getNoInspectorInfo()));
    }

    public static final y1.f getModifierLocalFocusProperties() {
        return f58571a;
    }

    public static final void refreshFocusProperties(s sVar) {
        y1 snapshotObserver;
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        z1.u0 layoutNodeWrapper = sVar.getLayoutNodeWrapper();
        if (layoutNodeWrapper == null) {
            return;
        }
        clear(sVar.getFocusProperties());
        s1 owner$ui_release = layoutNodeWrapper.getLayoutNode$ui_release().getOwner$ui_release();
        if (owner$ui_release != null && (snapshotObserver = owner$ui_release.getSnapshotObserver()) != null) {
            snapshotObserver.observeReads$ui_release(sVar, s.f58593s.getRefreshFocusProperties(), new l0(sVar));
        }
        setUpdatedProperties(sVar, sVar.getFocusProperties());
    }

    public static final void setUpdatedProperties(s sVar, h0 properties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(properties, "properties");
        if (properties.getCanFocus()) {
            x0.activateNode(sVar);
        } else {
            x0.deactivateNode(sVar);
        }
    }
}
