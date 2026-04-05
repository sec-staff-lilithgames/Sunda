package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.n3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f6443a;

    public r0(t0 t0Var) {
        this.f6443a = t0Var;
    }

    public static r0 createController(t0 t0Var) {
        return new r0((t0) w3.i.checkNotNull(t0Var, "callbacks == null"));
    }

    public void attachHost(Fragment fragment) {
        t0 t0Var = this.f6443a;
        t0Var.f6464g.b(t0Var, t0Var, fragment);
    }

    public void dispatchActivityCreated() {
        t1 t1Var = this.f6443a.f6464g;
        t1Var.H = false;
        t1Var.I = false;
        t1Var.O.f6494g = false;
        t1Var.t(4);
    }

    @Deprecated
    public void dispatchConfigurationChanged(Configuration configuration) {
        this.f6443a.f6464g.h(true, configuration);
    }

    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        return this.f6443a.f6464g.i(menuItem);
    }

    public void dispatchCreate() {
        t1 t1Var = this.f6443a.f6464g;
        t1Var.H = false;
        t1Var.I = false;
        t1Var.O.f6494g = false;
        t1Var.t(1);
    }

    @Deprecated
    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        return this.f6443a.f6464g.j(menu, menuInflater);
    }

    public void dispatchDestroy() {
        this.f6443a.f6464g.k();
    }

    public void dispatchDestroyView() {
        this.f6443a.f6464g.t(1);
    }

    @Deprecated
    public void dispatchLowMemory() {
        this.f6443a.f6464g.l(true);
    }

    @Deprecated
    public void dispatchMultiWindowModeChanged(boolean z10) {
        this.f6443a.f6464g.m(z10, true);
    }

    @Deprecated
    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        return this.f6443a.f6464g.o(menuItem);
    }

    @Deprecated
    public void dispatchOptionsMenuClosed(Menu menu) {
        this.f6443a.f6464g.p(menu);
    }

    public void dispatchPause() {
        this.f6443a.f6464g.t(5);
    }

    @Deprecated
    public void dispatchPictureInPictureModeChanged(boolean z10) {
        this.f6443a.f6464g.r(z10, true);
    }

    @Deprecated
    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        return this.f6443a.f6464g.s(menu);
    }

    public void dispatchResume() {
        t1 t1Var = this.f6443a.f6464g;
        t1Var.H = false;
        t1Var.I = false;
        t1Var.O.f6494g = false;
        t1Var.t(7);
    }

    public void dispatchStart() {
        t1 t1Var = this.f6443a.f6464g;
        t1Var.H = false;
        t1Var.I = false;
        t1Var.O.f6494g = false;
        t1Var.t(5);
    }

    public void dispatchStop() {
        t1 t1Var = this.f6443a.f6464g;
        t1Var.I = true;
        t1Var.O.f6494g = true;
        t1Var.t(4);
    }

    public boolean execPendingActions() {
        return this.f6443a.f6464g.w(true);
    }

    public Fragment findFragmentByWho(String str) {
        return this.f6443a.f6464g.f6222c.c(str);
    }

    public List<Fragment> getActiveFragments(List<Fragment> list) {
        return this.f6443a.f6464g.f6222c.e();
    }

    public int getActiveFragmentsCount() {
        return this.f6443a.f6464g.f6222c.f6315b.size();
    }

    public FragmentManager getSupportFragmentManager() {
        return this.f6443a.f6464g;
    }

    @Deprecated
    public d5.b getSupportLoaderManager() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void noteStateNotSaved() {
        this.f6443a.f6464g.I();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f6443a.f6464g.f6225f.onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void restoreAllState(Parcelable parcelable, List<Fragment> list) {
        t1 t1Var = this.f6443a.f6464g;
        u1 u1Var = new u1(list, null, null);
        if (t1Var.f6241v instanceof n3) {
            t1Var.X(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
            throw null;
        }
        t1Var.O.f(u1Var);
        t1Var.P(parcelable);
    }

    @Deprecated
    public void restoreSaveState(Parcelable parcelable) {
        t0 t0Var = this.f6443a;
        if (!(t0Var instanceof n3)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        t1 t1Var = t0Var.f6464g;
        if (t1Var.f6241v instanceof v5.j) {
            t1Var.X(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            throw null;
        }
        t1Var.P(parcelable);
    }

    @Deprecated
    public z.t1 retainLoaderNonConfig() {
        return null;
    }

    @Deprecated
    public u1 retainNestedNonConfig() {
        t1 t1Var = this.f6443a.f6464g;
        if (!(t1Var.f6241v instanceof n3)) {
            return t1Var.O.d();
        }
        t1Var.X(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        throw null;
    }

    @Deprecated
    public List<Fragment> retainNonConfig() {
        Collection collection;
        t1 t1Var = this.f6443a.f6464g;
        if (t1Var.f6241v instanceof n3) {
            t1Var.X(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
            throw null;
        }
        u1 u1VarD = t1Var.O.d();
        if (u1VarD == null || (collection = u1VarD.f6469a) == null) {
            return null;
        }
        return new ArrayList(collection);
    }

    @Deprecated
    public Parcelable saveAllState() {
        t1 t1Var = this.f6443a.f6464g;
        if (t1Var.f6241v instanceof v5.j) {
            t1Var.X(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            throw null;
        }
        Bundle bundleQ = t1Var.Q();
        if (bundleQ.isEmpty()) {
            return null;
        }
        return bundleQ;
    }

    @Deprecated
    public void restoreAllState(Parcelable parcelable, u1 u1Var) {
        t1 t1Var = this.f6443a.f6464g;
        if (!(t1Var.f6241v instanceof n3)) {
            t1Var.O.f(u1Var);
            t1Var.P(parcelable);
        } else {
            t1Var.X(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
            throw null;
        }
    }

    @Deprecated
    public void dispatchReallyStop() {
    }

    @Deprecated
    public void doLoaderDestroy() {
    }

    @Deprecated
    public void doLoaderRetain() {
    }

    @Deprecated
    public void doLoaderStart() {
    }

    @Deprecated
    public void reportLoaderStart() {
    }

    @Deprecated
    public void doLoaderStop(boolean z10) {
    }

    @Deprecated
    public void restoreLoaderNonConfig(z.t1 t1Var) {
    }

    @Deprecated
    public void dumpLoaders(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
