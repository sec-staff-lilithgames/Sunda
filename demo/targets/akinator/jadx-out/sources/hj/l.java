package hj;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class l implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ij.c f58969a;

    public l(ij.c cVar) {
        this.f58969a = cVar;
    }

    @Override // hj.e0
    public boolean canDismiss(Object obj) {
        return true;
    }

    @Override // hj.e0
    public void onDismiss(View view, Object obj) {
        ij.c cVar = this.f58969a;
        if (cVar.getDismissListener() != null) {
            cVar.getDismissListener().onClick(view);
        }
    }
}
