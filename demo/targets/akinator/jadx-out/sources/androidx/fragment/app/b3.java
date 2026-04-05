package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f6284a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6285b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6286c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f6287d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6288e = false;

    public b3(ViewGroup viewGroup) {
        this.f6284a = viewGroup;
    }

    public static b3 f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return g(viewGroup, fragmentManager.C());
    }

    public static b3 g(ViewGroup viewGroup, c3 c3Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof b3) {
            return (b3) tag;
        }
        b3 b3VarCreateController = ((d1) c3Var).createController(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, b3VarCreateController);
        return b3VarCreateController;
    }

    public final void a(z2 z2Var, int i10, e2 e2Var) {
        synchronized (this.f6285b) {
            try {
                t3.g gVar = new t3.g();
                a3 a3VarD = d(e2Var.f6304c);
                if (a3VarD != null) {
                    a3VarD.b(z2Var, i10);
                    return;
                }
                x2 x2Var = new x2(z2Var, i10, e2Var, gVar);
                this.f6285b.add(x2Var);
                x2Var.f6278d.add(new v2(this, x2Var));
                x2Var.f6278d.add(new w2(this, x2Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (this.f6288e) {
            return;
        }
        if (!x3.z1.isAttachedToWindow(this.f6284a)) {
            e();
            this.f6287d = false;
            return;
        }
        synchronized (this.f6285b) {
            try {
                if (!this.f6285b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f6286c);
                    this.f6286c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a3 a3Var = (a3) it.next();
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + a3Var);
                        }
                        a3Var.a();
                        if (!a3Var.f6281g) {
                            this.f6286c.add(a3Var);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.f6285b);
                    this.f6285b.clear();
                    this.f6286c.addAll(arrayList2);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((a3) it2.next()).c();
                    }
                    b(arrayList2, this.f6287d);
                    this.f6287d = false;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final a3 d(Fragment fragment) {
        Iterator it = this.f6285b.iterator();
        while (it.hasNext()) {
            a3 a3Var = (a3) it.next();
            if (a3Var.getFragment().equals(fragment) && !a3Var.f6280f) {
                return a3Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = x3.z1.isAttachedToWindow(this.f6284a);
        synchronized (this.f6285b) {
            try {
                i();
                Iterator it = this.f6285b.iterator();
                while (it.hasNext()) {
                    ((a3) it.next()).c();
                }
                Iterator it2 = new ArrayList(this.f6286c).iterator();
                while (it2.hasNext()) {
                    a3 a3Var = (a3) it2.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f6284a + " is not attached to window. ";
                        }
                        sb2.append(str2);
                        sb2.append("Cancelling running operation ");
                        sb2.append(a3Var);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    a3Var.a();
                }
                Iterator it3 = new ArrayList(this.f6285b).iterator();
                while (it3.hasNext()) {
                    a3 a3Var2 = (a3) it3.next();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f6284a + " is not attached to window. ";
                        }
                        sb3.append(str);
                        sb3.append("Cancelling pending operation ");
                        sb3.append(a3Var2);
                        Log.v("FragmentManager", sb3.toString());
                    }
                    a3Var2.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ViewGroup getContainer() {
        return this.f6284a;
    }

    public final void h() {
        synchronized (this.f6285b) {
            try {
                i();
                this.f6288e = false;
                int size = this.f6285b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    a3 a3Var = (a3) this.f6285b.get(size);
                    z2 z2VarC = z2.c(a3Var.getFragment().mView);
                    z2 finalState = a3Var.getFinalState();
                    z2 z2Var = z2.f6508c;
                    if (finalState == z2Var && z2VarC != z2Var) {
                        this.f6288e = a3Var.getFragment().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        Iterator it = this.f6285b.iterator();
        while (it.hasNext()) {
            a3 a3Var = (a3) it.next();
            if (a3Var.f6276b == 2) {
                a3Var.b(z2.b(a3Var.getFragment().requireView().getVisibility()), 1);
            }
        }
    }
}
