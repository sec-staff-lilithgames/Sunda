package u2;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import z1.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2 f87706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(a2 a2Var) {
        super(0);
        this.f87706e = a2Var;
    }

    @Override // kv.a
    public final SparseArray<Parcelable> invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        Object value = this.f87706e.getValue();
        kotlin.jvm.internal.e0.checkNotNull(value);
        View typedView$ui_release = ((g0) value).getTypedView$ui_release();
        if (typedView$ui_release != null) {
            typedView$ui_release.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}
