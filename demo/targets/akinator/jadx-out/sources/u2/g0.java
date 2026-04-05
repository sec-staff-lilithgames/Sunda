package u2;

import a2.o5;
import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends o implements o5 {

    /* renamed from: v, reason: collision with root package name */
    public View f87727v;

    /* renamed from: w, reason: collision with root package name */
    public kv.l f87728w;

    /* renamed from: x, reason: collision with root package name */
    public kv.l f87729x;

    public /* synthetic */ g0(Context context, p0.f0 f0Var, t1.e eVar, int i10, kotlin.jvm.internal.u uVar) {
        this(context, (i10 & 2) != 0 ? null : f0Var, (i10 & 4) != 0 ? new t1.e() : eVar);
    }

    public final kv.l getFactory() {
        return this.f87728w;
    }

    @Override // a2.o5
    public /* bridge */ /* synthetic */ a2.b getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final View getTypedView$ui_release() {
        return this.f87727v;
    }

    public final kv.l getUpdateBlock() {
        return this.f87729x;
    }

    public final void setFactory(kv.l lVar) {
        this.f87728w = lVar;
        if (lVar != null) {
            Context context = getContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
            View view = (View) lVar.invoke(context);
            this.f87727v = view;
            setView$ui_release(view);
        }
    }

    public final void setTypedView$ui_release(View view) {
        this.f87727v = view;
    }

    public final void setUpdateBlock(kv.l value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f87729x = value;
        setUpdate(new f0(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, p0.f0 f0Var, t1.e dispatcher) {
        super(context, f0Var, dispatcher);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        this.f87729x = q.getNoOpUpdate();
    }

    @Override // a2.o5
    public View getViewRoot() {
        return this;
    }
}
