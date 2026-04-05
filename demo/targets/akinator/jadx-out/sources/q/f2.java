package q;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f2 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f82087a;

    public f2(j2 j2Var) {
        this.f82087a = j2Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        j2 j2Var = this.f82087a;
        if (j2Var.isShowing()) {
            j2Var.show();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f82087a.dismiss();
    }
}
