package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.m3;
import androidx.lifecycle.n3;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements k3.b, k3.d {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.d1 mFragmentLifecycleRegistry;
    final r0 mFragments;
    boolean mResumed;
    boolean mStopped;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends t0 implements m3.f, m3.g, k3.s0, k3.u0, n3, f.i0, i.j, v5.j, y1, x3.a0 {
        public a() {
            super(FragmentActivity.this, FragmentActivity.this, new Handler(), 0);
        }

        @Override // x3.a0
        public void addMenuProvider(x3.g0 g0Var) {
            FragmentActivity.this.addMenuProvider(g0Var);
        }

        @Override // m3.f
        public void addOnConfigurationChangedListener(w3.b bVar) {
            FragmentActivity.this.addOnConfigurationChangedListener(bVar);
        }

        @Override // k3.s0
        public void addOnMultiWindowModeChangedListener(w3.b bVar) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(bVar);
        }

        @Override // k3.u0
        public void addOnPictureInPictureModeChangedListener(w3.b bVar) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(bVar);
        }

        @Override // m3.g
        public void addOnTrimMemoryListener(w3.b bVar) {
            FragmentActivity.this.addOnTrimMemoryListener(bVar);
        }

        @Override // i.j
        public i.g getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // f.i0
        public androidx.lifecycle.k0 getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // f.i0
        public f.d0 getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // v5.j
        public v5.h getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.n3
        public m3 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // x3.a0
        public void invalidateMenu() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.y1
        public void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.t0
        public void onDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.t0, androidx.fragment.app.p0
        public View onFindViewById(int i10) {
            return FragmentActivity.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.t0
        public LayoutInflater onGetLayoutInflater() {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        }

        @Override // androidx.fragment.app.t0
        public int onGetWindowAnimations() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.t0, androidx.fragment.app.p0
        public boolean onHasView() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.t0
        public boolean onHasWindowAnimations() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.t0
        public boolean onShouldSaveFragmentState(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.t0
        public boolean onShouldShowRequestPermissionRationale(String str) {
            return k3.f.shouldShowRequestPermissionRationale(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.t0
        public void onSupportInvalidateOptionsMenu() {
            invalidateMenu();
        }

        @Override // x3.a0
        public void removeMenuProvider(x3.g0 g0Var) {
            FragmentActivity.this.removeMenuProvider(g0Var);
        }

        @Override // m3.f
        public void removeOnConfigurationChangedListener(w3.b bVar) {
            FragmentActivity.this.removeOnConfigurationChangedListener(bVar);
        }

        @Override // k3.s0
        public void removeOnMultiWindowModeChangedListener(w3.b bVar) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(bVar);
        }

        @Override // k3.u0
        public void removeOnPictureInPictureModeChangedListener(w3.b bVar) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(bVar);
        }

        @Override // m3.g
        public void removeOnTrimMemoryListener(w3.b bVar) {
            FragmentActivity.this.removeOnTrimMemoryListener(bVar);
        }

        @Override // x3.a0
        public void addMenuProvider(x3.g0 g0Var, androidx.lifecycle.b1 b1Var) {
            FragmentActivity.this.addMenuProvider(g0Var, b1Var);
        }

        @Override // androidx.fragment.app.t0
        public FragmentActivity onGetHost() {
            return FragmentActivity.this;
        }

        @Override // x3.a0
        public void addMenuProvider(x3.g0 g0Var, androidx.lifecycle.b1 b1Var, androidx.lifecycle.j0 j0Var) {
            FragmentActivity.this.addMenuProvider(g0Var, b1Var, j0Var);
        }
    }

    public FragmentActivity() {
        this.mFragments = r0.createController(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.d1(this);
        this.mStopped = true;
        f();
    }

    public static boolean g(FragmentManager fragmentManager) {
        androidx.lifecycle.j0 j0Var = androidx.lifecycle.j0.f6616e;
        boolean zG = false;
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zG |= g(fragment.getChildFragmentManager());
                }
                r2 r2Var = fragment.mViewLifecycleOwner;
                if (r2Var != null && r2Var.getLifecycle().getCurrentState().isAtLeast(androidx.lifecycle.j0.f6617f)) {
                    fragment.mViewLifecycleOwner.f6449f.setCurrentState(j0Var);
                    zG = true;
                }
                if (fragment.mLifecycleRegistry.getCurrentState().isAtLeast(androidx.lifecycle.j0.f6617f)) {
                    fragment.mLifecycleRegistry.setCurrentState(j0Var);
                    zG = true;
                }
            }
        }
        return zG;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                d5.b.getInstance(this).dump(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void f() {
        getSavedStateRegistry().registerSavedStateProvider("android:support:lifecycle", new k0(this, 0));
        final int i10 = 0;
        addOnConfigurationChangedListener(new w3.b(this) { // from class: androidx.fragment.app.l0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f6401b;

            {
                this.f6401b = this;
            }

            @Override // w3.b
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f6401b.mFragments.noteStateNotSaved();
                        break;
                    default:
                        this.f6401b.mFragments.noteStateNotSaved();
                        break;
                }
            }
        });
        final int i11 = 1;
        addOnNewIntentListener(new w3.b(this) { // from class: androidx.fragment.app.l0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FragmentActivity f6401b;

            {
                this.f6401b = this;
            }

            @Override // w3.b
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f6401b.mFragments.noteStateNotSaved();
                        break;
                    default:
                        this.f6401b.mFragments.noteStateNotSaved();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new h.c() { // from class: androidx.fragment.app.m0
            @Override // h.c
            public final void onContextAvailable(Context context) {
                this.f6411a.mFragments.attachHost(null);
            }
        });
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    @Deprecated
    public d5.b getSupportLoaderManager() {
        return d5.b.getInstance(this);
    }

    public void markFragmentsCreated() {
        FragmentManager supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            androidx.lifecycle.j0 j0Var = androidx.lifecycle.j0.f6614b;
        } while (g(supportFragmentManager));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.noteStateNotSaved();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.dispatchContextItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.noteStateNotSaved();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.noteStateNotSaved();
        super.onResume();
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.noteStateNotSaved();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_START);
        this.mFragments.dispatchStart();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_STOP);
    }

    public void setEnterSharedElementCallback(k3.i1 i1Var) {
        k3.f.setEnterSharedElementCallback(this, i1Var);
    }

    public void setExitSharedElementCallback(k3.i1 i1Var) {
        k3.f.setExitSharedElementCallback(this, i1Var);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            k3.f.startIntentSenderForResult(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        k3.f.finishAfterTransition(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        k3.f.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        k3.f.startPostponedEnterTransition(this);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            k3.f.startActivityForResult(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i10) {
        super(i10);
        this.mFragments = r0.createController(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.d1(this);
        this.mStopped = true;
        f();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // k3.d
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
