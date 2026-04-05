package g;

import a2.h2;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.o3;
import androidx.lifecycle.p3;
import kv.p;
import p0.f0;
import v5.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f56325a = new ViewGroup.LayoutParams(-2, -2);

    public static final void setContent(ComponentActivity componentActivity, f0 f0Var, p pVar) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        h2 h2Var = childAt instanceof h2 ? (h2) childAt : null;
        if (h2Var != null) {
            h2Var.setParentCompositionContext(f0Var);
            h2Var.setContent(pVar);
            return;
        }
        h2 h2Var2 = new h2(componentActivity, null, 0, 6, null);
        h2Var2.setParentCompositionContext(f0Var);
        h2Var2.setContent(pVar);
        View decorView = componentActivity.getWindow().getDecorView();
        if (o3.get(decorView) == null) {
            o3.set(decorView, componentActivity);
        }
        if (p3.get(decorView) == null) {
            p3.set(decorView, componentActivity);
        }
        if (n.get(decorView) == null) {
            n.set(decorView, componentActivity);
        }
        componentActivity.setContentView(h2Var2, f56325a);
    }

    public static /* synthetic */ void setContent$default(ComponentActivity componentActivity, f0 f0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f0Var = null;
        }
        setContent(componentActivity, f0Var, pVar);
    }
}
