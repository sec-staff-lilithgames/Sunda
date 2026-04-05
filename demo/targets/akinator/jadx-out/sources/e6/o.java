package e6;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f53859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f53860b;

    public o(View view, ArrayList arrayList) {
        this.f53859a = view;
        this.f53860b = arrayList;
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    @Override // e6.g0
    public void onTransitionEnd(c0 c0Var) {
        c0Var.removeListener(this);
        this.f53859a.setVisibility(8);
        ArrayList arrayList = this.f53860b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // e6.g0
    public void onTransitionStart(c0 c0Var) {
        c0Var.removeListener(this);
        c0Var.addListener(this);
    }

    @Override // e6.g0
    public void onTransitionCancel(c0 c0Var) {
    }

    @Override // e6.g0
    public void onTransitionPause(c0 c0Var) {
    }

    @Override // e6.g0
    public void onTransitionResume(c0 c0Var) {
    }
}
