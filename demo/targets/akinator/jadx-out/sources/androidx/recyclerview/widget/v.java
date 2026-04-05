package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f7286c;

    public v(e0 e0Var, ArrayList arrayList) {
        this.f7286c = e0Var;
        this.f7285b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = this.f7285b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            e0 e0Var = this.f7286c;
            if (!zHasNext) {
                arrayList.clear();
                e0Var.f7108n.remove(arrayList);
                return;
            }
            c0 c0Var = (c0) it.next();
            ArrayList arrayList2 = e0Var.f7112r;
            RecyclerView.n nVar = c0Var.f7077a;
            View view = nVar == null ? null : nVar.itemView;
            RecyclerView.n nVar2 = c0Var.f7078b;
            View view2 = nVar2 != null ? nVar2.itemView : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(e0Var.getChangeDuration());
                arrayList2.add(c0Var.f7077a);
                duration.translationX(c0Var.f7081e - c0Var.f7079c);
                duration.translationY(c0Var.f7082f - c0Var.f7080d);
                duration.alpha(0.0f).setListener(new a0(e0Var, c0Var, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(c0Var.f7078b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(e0Var.getChangeDuration()).alpha(1.0f).setListener(new b0(e0Var, c0Var, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
