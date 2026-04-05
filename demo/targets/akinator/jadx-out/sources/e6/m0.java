package e6;

import android.os.Build;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f53842c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f53843d = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public static final ArrayList f53844e = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final z.f f53845a = new z.f();

    /* renamed from: b, reason: collision with root package name */
    public final z.f f53846b = new z.f();

    public static void a(w wVar, c0 c0Var) {
        ViewGroup sceneRoot = wVar.getSceneRoot();
        ArrayList arrayList = f53844e;
        if (arrayList.contains(sceneRoot)) {
            return;
        }
        w currentScene = w.getCurrentScene(sceneRoot);
        if (c0Var == null) {
            if (currentScene != null) {
                currentScene.exit();
            }
            wVar.enter();
            return;
        }
        arrayList.add(sceneRoot);
        c0 c0VarMo3832clone = c0Var.mo3832clone();
        if (currentScene != null && currentScene.f53878b > 0) {
            c0VarMo3832clone.p();
        }
        d(sceneRoot, c0VarMo3832clone);
        wVar.enter();
        c(sceneRoot, c0VarMo3832clone);
    }

    public static z.f b() {
        z.f fVar;
        ThreadLocal threadLocal = f53843d;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (z.f) weakReference.get()) != null) {
            return fVar;
        }
        z.f fVar2 = new z.f();
        threadLocal.set(new WeakReference(fVar2));
        return fVar2;
    }

    public static void beginDelayedTransition(ViewGroup viewGroup) {
        beginDelayedTransition(viewGroup, null);
    }

    public static void c(ViewGroup viewGroup, c0 c0Var) {
        if (c0Var == null || viewGroup == null) {
            return;
        }
        l0 l0Var = new l0();
        l0Var.f53834b = c0Var;
        l0Var.f53835c = viewGroup;
        viewGroup.addOnAttachStateChangeListener(l0Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(l0Var);
    }

    public static o0 controlDelayedTransition(ViewGroup viewGroup, c0 c0Var) {
        ArrayList arrayList = f53844e;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!c0Var.isSeekingSupported()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        c0 c0VarMo3832clone = c0Var.mo3832clone();
        s0 s0Var = new s0();
        s0Var.addTransition(c0VarMo3832clone);
        d(viewGroup, s0Var);
        viewGroup.setTag(R.id.transition_current_scene, null);
        c(viewGroup, s0Var);
        viewGroup.invalidate();
        f0 f0Var = new f0(s0Var);
        s0Var.L = f0Var;
        s0Var.addListener((g0) f0Var);
        return s0Var.L;
    }

    public static o0 createSeekController(w wVar, c0 c0Var) {
        ViewGroup sceneRoot = wVar.getSceneRoot();
        if (!c0Var.isSeekingSupported()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        ArrayList arrayList = f53844e;
        if (arrayList.contains(sceneRoot)) {
            return null;
        }
        w currentScene = w.getCurrentScene(sceneRoot);
        if (!sceneRoot.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            if (currentScene != null) {
                currentScene.exit();
            }
            wVar.enter();
            return null;
        }
        arrayList.add(sceneRoot);
        c0 c0VarMo3832clone = c0Var.mo3832clone();
        s0 s0Var = new s0();
        s0Var.addTransition(c0VarMo3832clone);
        if (currentScene != null && currentScene.f53878b > 0) {
            s0Var.p();
        }
        d(sceneRoot, s0Var);
        wVar.enter();
        c(sceneRoot, s0Var);
        f0 f0Var = new f0(s0Var);
        s0Var.L = f0Var;
        s0Var.addListener((g0) f0Var);
        return s0Var.L;
    }

    public static void d(ViewGroup viewGroup, c0 c0Var) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).pause(viewGroup);
            }
        }
        if (c0Var != null) {
            c0Var.d(viewGroup, true);
        }
        w currentScene = w.getCurrentScene(viewGroup);
        if (currentScene != null) {
            currentScene.exit();
        }
    }

    public static void endTransitions(ViewGroup viewGroup) {
        f53844e.remove(viewGroup);
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((c0) arrayList2.get(size)).h(viewGroup);
        }
    }

    public static void go(w wVar) {
        a(wVar, f53842c);
    }

    public void setTransition(w wVar, c0 c0Var) {
        this.f53845a.put(wVar, c0Var);
    }

    public void transitionTo(w wVar) {
        c0 c0Var;
        z.f fVar;
        w currentScene = w.getCurrentScene(wVar.getSceneRoot());
        if ((currentScene == null || (fVar = (z.f) this.f53846b.get(wVar)) == null || (c0Var = (c0) fVar.get(currentScene)) == null) && (c0Var = (c0) this.f53845a.get(wVar)) == null) {
            c0Var = f53842c;
        }
        a(wVar, c0Var);
    }

    public static void beginDelayedTransition(ViewGroup viewGroup, c0 c0Var) {
        ArrayList arrayList = f53844e;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (c0Var == null) {
            c0Var = f53842c;
        }
        c0 c0VarMo3832clone = c0Var.mo3832clone();
        d(viewGroup, c0VarMo3832clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        c(viewGroup, c0VarMo3832clone);
    }

    public static void go(w wVar, c0 c0Var) {
        a(wVar, c0Var);
    }

    public void setTransition(w wVar, w wVar2, c0 c0Var) {
        z.f fVar = this.f53846b;
        z.f fVar2 = (z.f) fVar.get(wVar2);
        if (fVar2 == null) {
            fVar2 = new z.f();
            fVar.put(wVar2, fVar2);
        }
        fVar2.put(wVar, c0Var);
    }
}
