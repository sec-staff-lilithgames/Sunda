package u2;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import z1.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f87764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0.f0 f87765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t1.e f87766g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.l f87767h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.h f87768i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f87769j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a2 f87770k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, p0.f0 f0Var, t1.e eVar, kv.l lVar, a1.h hVar, String str, a2 a2Var) {
        super(0);
        this.f87764e = context;
        this.f87765f = f0Var;
        this.f87766g = eVar;
        this.f87767h = lVar;
        this.f87768i = hVar;
        this.f87769j = str;
        this.f87770k = a2Var;
    }

    @Override // kv.a
    public final z1.b0 invoke() {
        View typedView$ui_release;
        g0 g0Var = new g0(this.f87764e, this.f87765f, this.f87766g);
        g0Var.setFactory(this.f87767h);
        a1.h hVar = this.f87768i;
        Object objConsumeRestored = hVar != null ? hVar.consumeRestored(this.f87769j) : null;
        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
        if (sparseArray != null && (typedView$ui_release = g0Var.getTypedView$ui_release()) != null) {
            typedView$ui_release.restoreHierarchyState(sparseArray);
        }
        this.f87770k.setValue(g0Var);
        return g0Var.getLayoutNode();
    }
}
