package g3;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f57277a;

    /* renamed from: c, reason: collision with root package name */
    public HashSet f57279c;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f57281e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f57278b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final String f57280d = "ViewTransitionController";

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f57282f = new ArrayList();

    public u0(i0 i0Var) {
        this.f57277a = i0Var;
    }

    public void add(s0 s0Var) {
        this.f57278b.add(s0Var);
        this.f57279c = null;
        if (s0Var.getStateTransition() == 4) {
            ConstraintLayout.getSharedValues().addListener(s0Var.getSharedValueID(), new t0(this, s0Var, s0Var.getSharedValueID(), true, s0Var.getSharedValue()));
        } else if (s0Var.getStateTransition() == 5) {
            ConstraintLayout.getSharedValues().addListener(s0Var.getSharedValueID(), new t0(this, s0Var, s0Var.getSharedValueID(), false, s0Var.getSharedValue()));
        }
    }
}
