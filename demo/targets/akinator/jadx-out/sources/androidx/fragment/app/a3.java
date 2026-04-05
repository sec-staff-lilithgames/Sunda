package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a3 {

    /* renamed from: a, reason: collision with root package name */
    public z2 f6275a;

    /* renamed from: b, reason: collision with root package name */
    public int f6276b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f6277c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6278d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f6279e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public boolean f6280f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6281g = false;

    public a3(z2 z2Var, int i10, Fragment fragment, t3.g gVar) {
        this.f6275a = z2Var;
        this.f6276b = i10;
        this.f6277c = fragment;
        gVar.setOnCancelListener(new y2(this));
    }

    public final void a() {
        if (this.f6280f) {
            return;
        }
        this.f6280f = true;
        HashSet hashSet = this.f6279e;
        if (hashSet.isEmpty()) {
            complete();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((t3.g) it.next()).cancel();
        }
    }

    public final void b(z2 z2Var, int i10) {
        int iC = b3.h.c(i10);
        Fragment fragment = this.f6277c;
        z2 z2Var2 = z2.f6507b;
        if (iC == 0) {
            if (this.f6275a != z2Var2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f6275a + " -> " + z2Var + ". ");
                }
                this.f6275a = z2Var;
                return;
            }
            return;
        }
        if (iC == 1) {
            if (this.f6275a == z2Var2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + a.b.B(this.f6276b) + " to ADDING.");
                }
                this.f6275a = z2.f6508c;
                this.f6276b = 2;
                return;
            }
            return;
        }
        if (iC != 2) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f6275a + " -> REMOVED. mLifecycleImpact  = " + a.b.B(this.f6276b) + " to REMOVING.");
        }
        this.f6275a = z2Var2;
        this.f6276b = 3;
    }

    public abstract void c();

    public void complete() {
        if (this.f6281g) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
        }
        this.f6281g = true;
        Iterator it = this.f6278d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void completeSpecialEffect(t3.g gVar) {
        HashSet hashSet = this.f6279e;
        if (hashSet.remove(gVar) && hashSet.isEmpty()) {
            complete();
        }
    }

    public z2 getFinalState() {
        return this.f6275a;
    }

    public final Fragment getFragment() {
        return this.f6277c;
    }

    public final void markStartedSpecialEffect(t3.g gVar) {
        c();
        this.f6279e.add(gVar);
    }

    public String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f6275a + "} {mLifecycleImpact = " + a.b.B(this.f6276b) + "} {mFragment = " + this.f6277c + "}";
    }
}
