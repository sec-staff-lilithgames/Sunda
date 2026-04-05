package e6;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public Context f53877a;

    /* renamed from: b, reason: collision with root package name */
    public int f53878b = -1;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f53879c;

    /* renamed from: d, reason: collision with root package name */
    public final View f53880d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f53881e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f53882f;

    public w(ViewGroup viewGroup) {
        this.f53879c = viewGroup;
    }

    public static w getCurrentScene(ViewGroup viewGroup) {
        return (w) viewGroup.getTag(R.id.transition_current_scene);
    }

    public static w getSceneForLayout(ViewGroup viewGroup, int i10, Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(R.id.transition_scene_layoutid_cache);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(R.id.transition_scene_layoutid_cache, sparseArray);
        }
        w wVar = (w) sparseArray.get(i10);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w();
        wVar2.f53877a = context;
        wVar2.f53879c = viewGroup;
        wVar2.f53878b = i10;
        sparseArray.put(i10, wVar2);
        return wVar2;
    }

    public void enter() {
        ViewGroup viewGroup = this.f53879c;
        int i10 = this.f53878b;
        View view = this.f53880d;
        if (i10 > 0 || view != null) {
            getSceneRoot().removeAllViews();
            if (i10 > 0) {
                LayoutInflater.from(this.f53877a).inflate(i10, viewGroup);
            } else {
                viewGroup.addView(view);
            }
        }
        Runnable runnable = this.f53881e;
        if (runnable != null) {
            runnable.run();
        }
        viewGroup.setTag(R.id.transition_current_scene, this);
    }

    public void exit() {
        Runnable runnable;
        if (getCurrentScene(this.f53879c) != this || (runnable = this.f53882f) == null) {
            return;
        }
        runnable.run();
    }

    public ViewGroup getSceneRoot() {
        return this.f53879c;
    }

    public void setEnterAction(Runnable runnable) {
        this.f53881e = runnable;
    }

    public void setExitAction(Runnable runnable) {
        this.f53882f = runnable;
    }

    public w(ViewGroup viewGroup, View view) {
        this.f53879c = viewGroup;
        this.f53880d = view;
    }
}
