package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f7277c;

    public u(e0 e0Var, ArrayList arrayList) {
        this.f7277c = e0Var;
        this.f7276b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.f7276b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            e0 e0Var = this.f7277c;
            if (!zHasNext) {
                arrayList.clear();
                e0Var.f7107m.remove(arrayList);
                return;
            }
            d0 d0Var = (d0) it.next();
            RecyclerView.n nVar = d0Var.f7091a;
            int i10 = d0Var.f7092b;
            int i11 = d0Var.f7093c;
            int i12 = d0Var.f7094d;
            int i13 = d0Var.f7095e;
            View view = nVar.itemView;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (i14 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i15 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            e0Var.f7110p.add(nVar);
            viewPropertyAnimatorAnimate.setDuration(e0Var.getMoveDuration()).setListener(new z(e0Var, nVar, i14, view, i15, viewPropertyAnimatorAnimate)).start();
        }
    }
}
