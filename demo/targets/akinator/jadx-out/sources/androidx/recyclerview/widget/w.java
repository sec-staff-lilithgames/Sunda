package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f7295c;

    public w(e0 e0Var, ArrayList arrayList) {
        this.f7295c = e0Var;
        this.f7294b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.f7294b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            e0 e0Var = this.f7295c;
            if (!zHasNext) {
                arrayList.clear();
                e0Var.f7106l.remove(arrayList);
                return;
            } else {
                RecyclerView.n nVar = (RecyclerView.n) it.next();
                View view = nVar.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                e0Var.f7109o.add(nVar);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(e0Var.getAddDuration()).setListener(new y(view, viewPropertyAnimatorAnimate, e0Var, nVar)).start();
            }
        }
    }
}
