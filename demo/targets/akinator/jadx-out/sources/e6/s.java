package e6;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s extends q2 {
    public static boolean d(c0 c0Var) {
        return (q2.c(c0Var.getTargetIds()) && q2.c(c0Var.getTargetNames()) && q2.c(c0Var.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.q2
    public void addTarget(Object obj, View view) {
        if (obj != null) {
            ((c0) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.q2
    public void addTargets(Object obj, ArrayList<View> arrayList) {
        c0 c0Var = (c0) obj;
        if (c0Var == null) {
            return;
        }
        int i10 = 0;
        if (c0Var instanceof s0) {
            s0 s0Var = (s0) c0Var;
            int transitionCount = s0Var.getTransitionCount();
            while (i10 < transitionCount) {
                addTargets(s0Var.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (d(c0Var) || !q2.c(c0Var.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            c0Var.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    public void animateToEnd(Object obj) {
        ((f0) ((o0) obj)).animateToEnd();
    }

    public void animateToStart(Object obj, Runnable runnable) {
        ((f0) ((o0) obj)).animateToStart(runnable);
    }

    @Override // androidx.fragment.app.q2
    public void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        m0.beginDelayedTransition(viewGroup, (c0) obj);
    }

    @Override // androidx.fragment.app.q2
    public boolean canHandle(Object obj) {
        return obj instanceof c0;
    }

    @Override // androidx.fragment.app.q2
    public Object cloneTransition(Object obj) {
        if (obj != null) {
            return ((c0) obj).mo3832clone();
        }
        return null;
    }

    public Object controlDelayedTransition(ViewGroup viewGroup, Object obj) {
        return m0.controlDelayedTransition(viewGroup, (c0) obj);
    }

    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.fragment.app.q2
    public Object mergeTransitionsInSequence(Object obj, Object obj2, Object obj3) {
        c0 ordering = (c0) obj;
        c0 c0Var = (c0) obj2;
        c0 c0Var2 = (c0) obj3;
        if (ordering != null && c0Var != null) {
            ordering = new s0().addTransition(ordering).addTransition(c0Var).setOrdering(1);
        } else if (ordering == null) {
            ordering = c0Var != null ? c0Var : null;
        }
        if (c0Var2 == null) {
            return ordering;
        }
        s0 s0Var = new s0();
        if (ordering != null) {
            s0Var.addTransition(ordering);
        }
        s0Var.addTransition(c0Var2);
        return s0Var;
    }

    @Override // androidx.fragment.app.q2
    public Object mergeTransitionsTogether(Object obj, Object obj2, Object obj3) {
        s0 s0Var = new s0();
        if (obj != null) {
            s0Var.addTransition((c0) obj);
        }
        if (obj2 != null) {
            s0Var.addTransition((c0) obj2);
        }
        if (obj3 != null) {
            s0Var.addTransition((c0) obj3);
        }
        return s0Var;
    }

    @Override // androidx.fragment.app.q2
    public void removeTarget(Object obj, View view) {
        if (obj != null) {
            ((c0) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.q2
    public void replaceTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        c0 c0Var = (c0) obj;
        int i10 = 0;
        if (c0Var instanceof s0) {
            s0 s0Var = (s0) c0Var;
            int transitionCount = s0Var.getTransitionCount();
            while (i10 < transitionCount) {
                replaceTargets(s0Var.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (d(c0Var)) {
            return;
        }
        List<View> targets = c0Var.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                c0Var.addTarget(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                c0Var.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.q2
    public void scheduleHideFragmentView(Object obj, View view, ArrayList<View> arrayList) {
        ((c0) obj).addListener(new o(view, arrayList));
    }

    @Override // androidx.fragment.app.q2
    public void scheduleRemoveTargets(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((c0) obj).addListener(new p(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void setCurrentPlayTime(Object obj, float f10) {
        f0 f0Var = (f0) ((o0) obj);
        if (f0Var.isReady()) {
            long durationMillis = (long) (f10 * f0Var.getDurationMillis());
            if (durationMillis == 0) {
                durationMillis = 1;
            }
            if (durationMillis == f0Var.getDurationMillis()) {
                durationMillis = f0Var.getDurationMillis() - 1;
            }
            f0Var.setCurrentPlayTimeMillis(durationMillis);
        }
    }

    @Override // androidx.fragment.app.q2
    public void setEpicenter(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            q2.b(rect, view);
            ((c0) obj).setEpicenterCallback(new n(rect));
        }
    }

    @Override // androidx.fragment.app.q2
    public void setListenerForTransitionEnd(Fragment fragment, Object obj, t3.g gVar, Runnable runnable) {
        setListenerForTransitionEnd(fragment, obj, gVar, null, runnable);
    }

    @Override // androidx.fragment.app.q2
    public void setSharedElementTargets(Object obj, View view, ArrayList<View> arrayList) {
        s0 s0Var = (s0) obj;
        List<View> targets = s0Var.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q2.a(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        addTargets(s0Var, arrayList);
    }

    @Override // androidx.fragment.app.q2
    public void swapSharedElementTargets(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        s0 s0Var = (s0) obj;
        if (s0Var != null) {
            s0Var.getTargets().clear();
            s0Var.getTargets().addAll(arrayList2);
            replaceTargets(s0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.q2
    public Object wrapTransitionInSet(Object obj) {
        if (obj == null) {
            return null;
        }
        s0 s0Var = new s0();
        s0Var.addTransition((c0) obj);
        return s0Var;
    }

    public boolean isSeekingSupported(Object obj) {
        boolean zIsSeekingSupported = ((c0) obj).isSeekingSupported();
        if (!zIsSeekingSupported) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zIsSeekingSupported;
    }

    public void setListenerForTransitionEnd(Fragment fragment, Object obj, t3.g gVar, Runnable runnable, Runnable runnable2) {
        c0 c0Var = (c0) obj;
        gVar.setOnCancelListener(new ao.q0(runnable, 8, c0Var, runnable2));
        c0Var.addListener(new q(runnable2));
    }

    @Override // androidx.fragment.app.q2
    public void setEpicenter(Object obj, Rect rect) {
        if (obj != null) {
            ((c0) obj).setEpicenterCallback(new r(rect));
        }
    }
}
