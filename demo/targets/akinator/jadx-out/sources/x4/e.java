package x4;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Set;
import kotlin.jvm.internal.e0;
import on.z;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f91742a = d.f91739c;

    public static d a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                e0.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    d strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    e0.checkNotNull(strictModePolicy);
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f91742a;
    }

    public static void b(d dVar, o oVar) throws Throwable {
        Fragment fragment = oVar.getFragment();
        String name = fragment.getClass().getName();
        if (dVar.getFlags$fragment_release().contains(b.f91730b)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), oVar);
        }
        dVar.getListener$fragment_release();
        if (dVar.getFlags$fragment_release().contains(b.f91731c)) {
            z zVar = new z(22, name, oVar);
            if (!fragment.isAdded()) {
                zVar.run();
                throw null;
            }
            Handler handler = fragment.getParentFragmentManager().getHost().getHandler();
            e0.checkNotNullExpressionValue(handler, "fragment.parentFragmentManager.host.handler");
            if (e0.areEqual(handler.getLooper(), Looper.myLooper())) {
                zVar.run();
                throw null;
            }
            handler.post(zVar);
        }
    }

    public static void c(o oVar) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(oVar.getFragment().getClass().getName()), oVar);
        }
    }

    public static boolean d(d dVar, Class cls, Class cls2) {
        Set<Class<? extends o>> set = dVar.getMAllowedViolations$fragment_release().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (e0.areEqual(cls2.getSuperclass(), o.class) || !y0.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    public static final void onFragmentReuse(Fragment fragment, String previousFragmentId) {
        e0.checkNotNullParameter(fragment, "fragment");
        e0.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        a aVar = new a(fragment, previousFragmentId);
        c(aVar);
        d dVarA = a(fragment);
        if (dVarA.getFlags$fragment_release().contains(b.f91732e) && d(dVarA, fragment.getClass(), a.class)) {
            b(dVarA, aVar);
        }
    }

    public static final void onFragmentTagUsage(Fragment fragment, ViewGroup viewGroup) {
        e0.checkNotNullParameter(fragment, "fragment");
        f fVar = new f(fragment, viewGroup);
        c(fVar);
        d dVarA = a(fragment);
        if (dVarA.getFlags$fragment_release().contains(b.f91733f) && d(dVarA, fragment.getClass(), f.class)) {
            b(dVarA, fVar);
        }
    }

    public static final void onGetRetainInstanceUsage(Fragment fragment) {
        e0.checkNotNullParameter(fragment, "fragment");
        g gVar = new g(fragment);
        c(gVar);
        d dVarA = a(fragment);
        if (dVarA.getFlags$fragment_release().contains(b.f91734g) && d(dVarA, fragment.getClass(), g.class)) {
            b(dVarA, gVar);
        }
    }

    public static final void onGetTargetFragmentRequestCodeUsage(Fragment fragment) {
        e0.checkNotNullParameter(fragment, "fragment");
        h hVar = new h(fragment);
        c(hVar);
        d dVarA = a(fragment);
        if (dVarA.getFlags$fragment_release().contains(b.f91736i) && d(dVarA, fragment.getClass(), h.class)) {
            b(dVarA, hVar);
        }
    }

    public static final void onGetTargetFragmentUsage(Fragment fragment) {
        e0.checkNotNullParameter(fragment, "fragment");
        i iVar = new i(fragment);
        c(iVar);
        d dVarA = a(fragment);
        if (dVarA.getFlags$fragment_release().contains(b.f91736i) && d(dVarA, fragment.getClass(), i.class)) {
            b(dVarA, iVar);
        }
    }

    public static final void onSetRetainInstanceUsage(Fragment fragment) {
        e0.checkNotNullParameter(fragment, "fragment");
        k kVar = new k(fragment);
        c(kVar);
        d dVarA = a(fragment);
        if (dVarA.getFlags$fragment_release().contains(b.f91734g) && d(dVarA, fragment.getClass(), k.class)) {
            b(dVarA, kVar);
        }
    }

    public static final void onSetTargetFragmentUsage(Fragment violatingFragment, Fragment targetFragment, int i10) {
        e0.checkNotNullParameter(violatingFragment, "violatingFragment");
        e0.checkNotNullParameter(targetFragment, "targetFragment");
        l lVar = new l(violatingFragment, targetFragment, i10);
        c(lVar);
        d dVarA = a(violatingFragment);
        if (dVarA.getFlags$fragment_release().contains(b.f91736i) && d(dVarA, violatingFragment.getClass(), l.class)) {
            b(dVarA, lVar);
        }
    }

    public static final void onSetUserVisibleHint(Fragment fragment, boolean z10) {
        e0.checkNotNullParameter(fragment, "fragment");
        m mVar = new m(fragment, z10);
        c(mVar);
        d dVarA = a(fragment);
        if (dVarA.getFlags$fragment_release().contains(b.f91735h) && d(dVarA, fragment.getClass(), m.class)) {
            b(dVarA, mVar);
        }
    }

    public static final void onWrongFragmentContainer(Fragment fragment, ViewGroup container) {
        e0.checkNotNullParameter(fragment, "fragment");
        e0.checkNotNullParameter(container, "container");
        p pVar = new p(fragment, container);
        c(pVar);
        d dVarA = a(fragment);
        if (dVarA.getFlags$fragment_release().contains(b.f91737j) && d(dVarA, fragment.getClass(), p.class)) {
            b(dVarA, pVar);
        }
    }
}
