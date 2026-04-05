package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.a0;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.j3;
import androidx.lifecycle.k0;
import androidx.lifecycle.l2;
import androidx.lifecycle.l3;
import androidx.lifecycle.m3;
import androidx.lifecycle.n3;
import androidx.lifecycle.o3;
import androidx.lifecycle.p3;
import androidx.lifecycle.t2;
import com.moloco.sdk.BKC.KerkSviMAy;
import f.d0;
import f.e;
import f.i0;
import f.k;
import f.l;
import f.l0;
import f.m0;
import f.v;
import f.w;
import i.d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k3.d1;
import k3.s0;
import k3.t0;
import k3.u0;
import k3.v0;
import k3.z;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import m3.f;
import m3.g;
import tu.o;
import tu.q;
import v5.h;
import v5.i;
import v5.j;
import v5.n;
import x3.c0;
import x3.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements h.a, n3, a0, j, i0, i.j, i.c, f, g, t0, s0, u0, v0, x3.a0, w {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final a Companion = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4643b = 0;
    private m3 _viewModelStore;
    private final i.g activityResultRegistry;
    private int contentLayoutId;
    private final h.b contextAwareHelper;
    private final o defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final o fullyDrawnReporter$delegate;
    private final c0 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final o onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<w3.b> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<w3.b> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<w3.b> onNewIntentListeners;
    private final CopyOnWriteArrayList<w3.b> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<w3.b> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final k reportFullyDrawnExecutor;
    private final i savedStateRegistryController;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f4644a;

        /* renamed from: b, reason: collision with root package name */
        public m3 f4645b;

        public final Object getCustom() {
            return this.f4644a;
        }

        public final m3 getViewModelStore() {
            return this.f4645b;
        }

        public final void setCustom(Object obj) {
            this.f4644a = obj;
        }

        public final void setViewModelStore(m3 m3Var) {
            this.f4645b = m3Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public final class c implements k, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final long f4646b = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c, reason: collision with root package name */
        public Runnable f4647c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4648e;

        public c() {
        }

        @Override // f.k
        public void activityDestroyed() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            e0.checkNotNullParameter(runnable, "runnable");
            this.f4647c = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            e0.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            if (!this.f4648e) {
                decorView.postOnAnimation(new com.unity3d.services.banners.view.a(this, 13));
            } else if (e0.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public final Runnable getCurrentRunnable() {
            return this.f4647c;
        }

        public final long getEndWatchTimeMillis() {
            return this.f4646b;
        }

        public final boolean getOnDrawScheduled() {
            return this.f4648e;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f4647c;
            ComponentActivity componentActivity = ComponentActivity.this;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f4646b) {
                    this.f4648e = false;
                    componentActivity.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f4647c = null;
            if (componentActivity.getFullyDrawnReporter().isFullyDrawnReported()) {
                this.f4648e = false;
                componentActivity.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public final void setCurrentRunnable(Runnable runnable) {
            this.f4647c = runnable;
        }

        public final void setOnDrawScheduled(boolean z10) {
            this.f4648e = z10;
        }

        @Override // f.k
        public void viewCreated(View view) {
            e0.checkNotNullParameter(view, "view");
            if (this.f4648e) {
                return;
            }
            this.f4648e = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new h.b();
        this.menuHostHelper = new c0(new e(this, 0));
        i iVarCreate = i.f89043c.create(this);
        this.savedStateRegistryController = iVarCreate;
        this.reportFullyDrawnExecutor = new c();
        this.fullyDrawnReporter$delegate = q.lazy(new f.f(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new l(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i10 = 0;
        getLifecycle().addObserver(new androidx.lifecycle.v0(this) { // from class: f.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f55225c;

            {
                this.f55225c = this;
            }

            @Override // androidx.lifecycle.v0
            public final void onStateChanged(b1 b1Var, androidx.lifecycle.i0 event) {
                Window window;
                View viewPeekDecorView;
                int i11 = i10;
                ComponentActivity componentActivity = this.f55225c;
                switch (i11) {
                    case 0:
                        int i12 = ComponentActivity.f4643b;
                        kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<unused var>");
                        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                        if (event == androidx.lifecycle.i0.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.c(componentActivity, b1Var, event);
                        break;
                }
            }
        });
        final int i11 = 1;
        getLifecycle().addObserver(new androidx.lifecycle.v0(this) { // from class: f.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f55225c;

            {
                this.f55225c = this;
            }

            @Override // androidx.lifecycle.v0
            public final void onStateChanged(b1 b1Var, androidx.lifecycle.i0 event) {
                Window window;
                View viewPeekDecorView;
                int i112 = i11;
                ComponentActivity componentActivity = this.f55225c;
                switch (i112) {
                    case 0:
                        int i12 = ComponentActivity.f4643b;
                        kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<unused var>");
                        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                        if (event == androidx.lifecycle.i0.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.c(componentActivity, b1Var, event);
                        break;
                }
            }
        });
        getLifecycle().addObserver(new f.i(this));
        iVarCreate.performAttach();
        t2.enableSavedStateHandles(this);
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new a5.a(this, 1));
        addOnContextAvailableListener(new h.c() { // from class: f.h
            @Override // h.c
            public final void onContextAvailable(Context context) {
                ComponentActivity.e(this.f55227a, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = q.lazy(new f.f(this, 2));
        this.onBackPressedDispatcher$delegate = q.lazy(new f.f(this, 3));
    }

    public static Bundle a(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    public static final void access$ensureViewModelStore(ComponentActivity componentActivity) {
        if (componentActivity._viewModelStore == null) {
            b bVar = (b) componentActivity.getLastNonConfigurationInstance();
            if (bVar != null) {
                componentActivity._viewModelStore = bVar.getViewModelStore();
            }
            if (componentActivity._viewModelStore == null) {
                componentActivity._viewModelStore = new m3();
            }
        }
    }

    public static void b(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!e0.areEqual(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!e0.areEqual(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    public static void c(ComponentActivity componentActivity, b1 b1Var, androidx.lifecycle.i0 event) {
        e0.checkNotNullParameter(b1Var, "<unused var>");
        e0.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.i0.ON_DESTROY) {
            componentActivity.contextAwareHelper.clearAvailableContext();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().clear();
            }
            componentActivity.reportFullyDrawnExecutor.activityDestroyed();
        }
    }

    public static v d(ComponentActivity componentActivity) {
        return new v(componentActivity.reportFullyDrawnExecutor, new f.f(componentActivity, 0));
    }

    public static void e(ComponentActivity componentActivity, Context it) {
        e0.checkNotNullParameter(it, "it");
        Bundle bundleConsumeRestoredStateForKey = componentActivity.getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (bundleConsumeRestoredStateForKey != null) {
            componentActivity.activityResultRegistry.onRestoreInstanceState(bundleConsumeRestoredStateForKey);
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        e0.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        kVar.viewCreated(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // x3.a0
    public void addMenuProvider(g0 provider) {
        e0.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.addMenuProvider(provider);
    }

    @Override // m3.f
    public final void addOnConfigurationChangedListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    @Override // h.a
    public final void addOnContextAvailableListener(h.c listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.addOnContextAvailableListener(listener);
    }

    @Override // k3.s0
    public final void addOnMultiWindowModeChangedListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // k3.t0
    public final void addOnNewIntentListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // k3.u0
    public final void addOnPictureInPictureModeChangedListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // m3.g
    public final void addOnTrimMemoryListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // k3.v0
    public final void addOnUserLeaveHintListener(Runnable listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // i.j
    public final i.g getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.a0
    public b5.a getDefaultViewModelCreationExtras() {
        b5.e eVar = new b5.e(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        if (getApplication() != null) {
            eVar.set(j3.a.f6628f, getApplication());
        }
        eVar.set(t2.f6710a, this);
        eVar.set(t2.f6711b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            eVar.set(t2.f6712c, extras);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.a0
    public l3 getDefaultViewModelProviderFactory() {
        return (l3) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @Override // f.w
    public v getFullyDrawnReporter() {
        return (v) this.fullyDrawnReporter$delegate.getValue();
    }

    @tu.f
    public Object getLastCustomNonConfigurationInstance() {
        b bVar = (b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.b1, v5.j, f.i0
    public k0 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // f.i0
    public final d0 getOnBackPressedDispatcher() {
        return (d0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // v5.j
    public final h getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.n3
    public m3 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this._viewModelStore = bVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new m3();
            }
        }
        m3 m3Var = this._viewModelStore;
        e0.checkNotNull(m3Var);
        return m3Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        e0.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        o3.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        e0.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        p3.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        e0.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        n.set(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        e0.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        m0.set(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        e0.checkNotNullExpressionValue(decorView5, "getDecorView(...)");
        l0.set(decorView5, this);
    }

    @Override // x3.a0
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @tu.f
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.dispatchResult(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @tu.f
    public void onBackPressed() {
        getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        e0.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<w3.b> it = this.onConfigurationChangedListeners.iterator();
        e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.performRestore(bundle);
        this.contextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        l2.f6659c.injectIfNeededIn(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        e0.checkNotNullParameter(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.menuHostHelper.onCreateMenu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        e0.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.onMenuItemSelected(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @tu.f
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<w3.b> it = this.onMultiWindowModeChangedListeners.iterator();
        e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new z(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        e0.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<w3.b> it = this.onNewIntentListeners.iterator();
        e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        e0.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @tu.f
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<w3.b> it = this.onPictureInPictureModeChangedListeners.iterator();
        e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new d1(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        e0.checkNotNullParameter(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.menuHostHelper.onPrepareMenu(menu);
        return true;
    }

    @Override // android.app.Activity
    @tu.f
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        e0.checkNotNullParameter(permissions, "permissions");
        e0.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.dispatchResult(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @tu.f
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        m3 viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            viewModelStore = bVar.getViewModelStore();
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.setCustom(objOnRetainCustomNonConfigurationInstance);
        bVar2.setViewModelStore(viewModelStore);
        return bVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        e0.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.d1) {
            k0 lifecycle = getLifecycle();
            e0.checkNotNull(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.d1) lifecycle).setCurrentState(j0.f6616e);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.performSave(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<w3.b> it = this.onTrimMemoryListeners.iterator();
        e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Override // h.a
    public Context peekAvailableContext() {
        return this.contextAwareHelper.peekAvailableContext();
    }

    @Override // i.c
    public final <I, O> d registerForActivityResult(j.a contract, i.g registry, i.b callback) {
        e0.checkNotNullParameter(contract, "contract");
        e0.checkNotNullParameter(registry, "registry");
        e0.checkNotNullParameter(callback, "callback");
        return registry.register("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // x3.a0
    public void removeMenuProvider(g0 provider) {
        e0.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.removeMenuProvider(provider);
    }

    @Override // m3.f
    public final void removeOnConfigurationChangedListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // h.a
    public final void removeOnContextAvailableListener(h.c listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.removeOnContextAvailableListener(listener);
    }

    @Override // k3.s0
    public final void removeOnMultiWindowModeChangedListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // k3.t0
    public final void removeOnNewIntentListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // k3.u0
    public final void removeOnPictureInPictureModeChangedListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // m3.g
    public final void removeOnTrimMemoryListener(w3.b listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // k3.v0
    public final void removeOnUserLeaveHintListener(Runnable listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (d6.a.isEnabled()) {
                d6.a.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().fullyDrawnReported();
            d6.a.endSection();
        } catch (Throwable th2) {
            d6.a.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        e0.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        kVar.viewCreated(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @tu.f
    public void startActivityForResult(Intent intent, int i10) {
        e0.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @tu.f
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        e0.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // x3.a0
    public void addMenuProvider(g0 provider, b1 owner) {
        e0.checkNotNullParameter(provider, "provider");
        e0.checkNotNullParameter(owner, "owner");
        this.menuHostHelper.addMenuProvider(provider, owner);
    }

    @Override // android.app.Activity
    @tu.f
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        e0.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @tu.f
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        e0.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    @Override // x3.a0
    public void addMenuProvider(g0 provider, b1 owner, j0 state) {
        e0.checkNotNullParameter(provider, "provider");
        e0.checkNotNullParameter(owner, "owner");
        e0.checkNotNullParameter(state, "state");
        this.menuHostHelper.addMenuProvider(provider, owner, state);
    }

    @Override // i.c
    public final <I, O> d registerForActivityResult(j.a contract, i.b callback) {
        e0.checkNotNullParameter(contract, "contract");
        e0.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        e0.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<w3.b> it = this.onMultiWindowModeChangedListeners.iterator();
            e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new z(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration newConfig) {
        e0.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<w3.b> it = this.onPictureInPictureModeChangedListeners.iterator();
            e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new d1(z10, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        e0.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        kVar.viewCreated(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        k kVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        e0.checkNotNullExpressionValue(decorView, KerkSviMAy.ufeX);
        kVar.viewCreated(decorView);
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i10) {
        this();
        this.contentLayoutId = i10;
    }
}
