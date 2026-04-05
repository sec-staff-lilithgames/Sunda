package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e0 extends t2 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f7101s;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f7102h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7103i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7104j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f7105k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7106l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f7107m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f7108n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f7109o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f7110p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f7111q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f7112r = new ArrayList();

    public static void b(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.n) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.t2
    public boolean animateAdd(RecyclerView.n nVar) {
        f(nVar);
        nVar.itemView.setAlpha(0.0f);
        this.f7103i.add(nVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.t2
    public boolean animateChange(RecyclerView.n nVar, RecyclerView.n nVar2, int i10, int i11, int i12, int i13) {
        if (nVar == nVar2) {
            return animateMove(nVar, i10, i11, i12, i13);
        }
        float translationX = nVar.itemView.getTranslationX();
        float translationY = nVar.itemView.getTranslationY();
        float alpha = nVar.itemView.getAlpha();
        f(nVar);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        nVar.itemView.setTranslationX(translationX);
        nVar.itemView.setTranslationY(translationY);
        nVar.itemView.setAlpha(alpha);
        if (nVar2 != null) {
            f(nVar2);
            nVar2.itemView.setTranslationX(-i14);
            nVar2.itemView.setTranslationY(-i15);
            nVar2.itemView.setAlpha(0.0f);
        }
        c0 c0Var = new c0();
        c0Var.f7077a = nVar;
        c0Var.f7078b = nVar2;
        c0Var.f7079c = i10;
        c0Var.f7080d = i11;
        c0Var.f7081e = i12;
        c0Var.f7082f = i13;
        this.f7105k.add(c0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.t2
    public boolean animateMove(RecyclerView.n nVar, int i10, int i11, int i12, int i13) {
        View view = nVar.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) nVar.itemView.getTranslationY());
        f(nVar);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            dispatchMoveFinished(nVar);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        d0 d0Var = new d0();
        d0Var.f7091a = nVar;
        d0Var.f7092b = translationX;
        d0Var.f7093c = translationY;
        d0Var.f7094d = i12;
        d0Var.f7095e = i13;
        this.f7104j.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.t2
    public boolean animateRemove(RecyclerView.n nVar) {
        f(nVar);
        this.f7102h.add(nVar);
        return true;
    }

    public final void c() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public boolean canReuseUpdatedViewHolder(RecyclerView.n nVar, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(nVar, list);
    }

    public final void d(ArrayList arrayList, RecyclerView.n nVar) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) arrayList.get(size);
            if (e(c0Var, nVar) && c0Var.f7077a == null && c0Var.f7078b == null) {
                arrayList.remove(c0Var);
            }
        }
    }

    public final boolean e(c0 c0Var, RecyclerView.n nVar) {
        boolean z10 = false;
        if (c0Var.f7078b == nVar) {
            c0Var.f7078b = null;
        } else {
            if (c0Var.f7077a != nVar) {
                return false;
            }
            c0Var.f7077a = null;
            z10 = true;
        }
        nVar.itemView.setAlpha(1.0f);
        nVar.itemView.setTranslationX(0.0f);
        nVar.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(nVar, z10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void endAnimation(RecyclerView.n nVar) {
        View view = nVar.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f7104j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((d0) arrayList.get(size)).f7091a == nVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(nVar);
                arrayList.remove(size);
            }
        }
        d(this.f7105k, nVar);
        if (this.f7102h.remove(nVar)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(nVar);
        }
        if (this.f7103i.remove(nVar)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(nVar);
        }
        ArrayList arrayList2 = this.f7108n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            d(arrayList3, nVar);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f7107m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((d0) arrayList5.get(size4)).f7091a == nVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(nVar);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f7106l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(nVar)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(nVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f7111q.remove(nVar);
        this.f7109o.remove(nVar);
        this.f7112r.remove(nVar);
        this.f7110p.remove(nVar);
        c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void endAnimations() {
        ArrayList arrayList = this.f7104j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            d0 d0Var = (d0) arrayList.get(size);
            View view = d0Var.f7091a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(d0Var.f7091a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f7102h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished((RecyclerView.n) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f7103i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.n nVar = (RecyclerView.n) arrayList3.get(size3);
            nVar.itemView.setAlpha(1.0f);
            dispatchAddFinished(nVar);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f7105k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            c0 c0Var = (c0) arrayList4.get(size4);
            RecyclerView.n nVar2 = c0Var.f7077a;
            if (nVar2 != null) {
                e(c0Var, nVar2);
            }
            RecyclerView.n nVar3 = c0Var.f7078b;
            if (nVar3 != null) {
                e(c0Var, nVar3);
            }
        }
        arrayList4.clear();
        if (isRunning()) {
            ArrayList arrayList5 = this.f7107m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    d0 d0Var2 = (d0) arrayList6.get(size6);
                    View view2 = d0Var2.f7091a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(d0Var2.f7091a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f7106l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.n nVar4 = (RecyclerView.n) arrayList8.get(size8);
                    nVar4.itemView.setAlpha(1.0f);
                    dispatchAddFinished(nVar4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f7108n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    c0 c0Var2 = (c0) arrayList10.get(size10);
                    RecyclerView.n nVar5 = c0Var2.f7077a;
                    if (nVar5 != null) {
                        e(c0Var2, nVar5);
                    }
                    RecyclerView.n nVar6 = c0Var2.f7078b;
                    if (nVar6 != null) {
                        e(c0Var2, nVar6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            b(this.f7111q);
            b(this.f7110p);
            b(this.f7109o);
            b(this.f7112r);
            dispatchAnimationsFinished();
        }
    }

    public final void f(RecyclerView.n nVar) {
        if (f7101s == null) {
            f7101s = new ValueAnimator().getInterpolator();
        }
        nVar.itemView.animate().setInterpolator(f7101s);
        endAnimation(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public boolean isRunning() {
        return (this.f7103i.isEmpty() && this.f7105k.isEmpty() && this.f7104j.isEmpty() && this.f7102h.isEmpty() && this.f7110p.isEmpty() && this.f7111q.isEmpty() && this.f7109o.isEmpty() && this.f7112r.isEmpty() && this.f7107m.isEmpty() && this.f7106l.isEmpty() && this.f7108n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void runPendingAnimations() {
        ArrayList arrayList = this.f7102h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f7104j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f7105k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f7103i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerView.n nVar = (RecyclerView.n) it.next();
            View view = nVar.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f7111q.add(nVar);
            viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new x(view, viewPropertyAnimatorAnimate, this, nVar)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.f7107m.add(arrayList5);
            arrayList2.clear();
            u uVar = new u(this, arrayList5);
            if (zIsEmpty) {
                uVar.run();
            } else {
                x3.z1.postOnAnimationDelayed(((d0) arrayList5.get(0)).f7091a.itemView, uVar, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.f7108n.add(arrayList6);
            arrayList3.clear();
            v vVar = new v(this, arrayList6);
            if (zIsEmpty) {
                vVar.run();
            } else {
                x3.z1.postOnAnimationDelayed(((c0) arrayList6.get(0)).f7077a.itemView, vVar, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.f7106l.add(arrayList7);
        arrayList4.clear();
        w wVar = new w(this, arrayList7);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            wVar.run();
        } else {
            x3.z1.postOnAnimationDelayed(((RecyclerView.n) arrayList7.get(0)).itemView, wVar, Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()) + (!zIsEmpty ? getRemoveDuration() : 0L));
        }
    }
}
