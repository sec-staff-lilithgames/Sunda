package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l2 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o2 f6408g;

    public l2(o2 o2Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f6408g = o2Var;
        this.f6402a = obj;
        this.f6403b = arrayList;
        this.f6404c = obj2;
        this.f6405d = arrayList2;
        this.f6406e = obj3;
        this.f6407f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        o2 o2Var = this.f6408g;
        Object obj = this.f6402a;
        if (obj != null) {
            o2Var.replaceTargets(obj, this.f6403b, null);
        }
        Object obj2 = this.f6404c;
        if (obj2 != null) {
            o2Var.replaceTargets(obj2, this.f6405d, null);
        }
        Object obj3 = this.f6406e;
        if (obj3 != null) {
            o2Var.replaceTargets(obj3, this.f6407f, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }
}
