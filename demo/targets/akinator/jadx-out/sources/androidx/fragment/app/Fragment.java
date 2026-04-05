package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.j3;
import androidx.lifecycle.l3;
import androidx.lifecycle.m3;
import androidx.lifecycle.n3;
import androidx.lifecycle.o3;
import androidx.lifecycle.p3;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.b1, n3, androidx.lifecycle.a0, v5.j, i.c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    h0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    l3 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    t0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.d1 mLifecycleRegistry;
    androidx.lifecycle.j0 mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<i0> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final i0 mSavedStateAttachListener;
    v5.i mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    r2 mViewLifecycleOwner;
    androidx.lifecycle.t1 mViewLifecycleOwnerLiveData;
    String mWho;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str, Exception exc) {
            super(str, exc);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new t1();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new y(this);
        this.mMaxState = androidx.lifecycle.j0.f6618g;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.t1();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new z(this);
        initLifecycle();
    }

    private h0 ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            h0 h0Var = new h0();
            h0Var.f6346i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            h0Var.f6347j = obj;
            h0Var.f6348k = null;
            h0Var.f6349l = obj;
            h0Var.f6350m = null;
            h0Var.f6351n = obj;
            h0Var.f6354q = null;
            h0Var.f6355r = null;
            h0Var.f6356s = 1.0f;
            h0Var.f6357t = null;
            this.mAnimationInfo = h0Var;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        androidx.lifecycle.j0 j0Var = this.mMaxState;
        return (j0Var == androidx.lifecycle.j0.f6615c || this.mParentFragment == null) ? j0Var.ordinal() : Math.min(j0Var.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.d1(this);
        this.mSavedStateRegistryController = v5.i.create(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> i.d prepareCallInternal(j.a aVar, t.a aVar2, i.b bVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(a.b.j("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new g0(this, aVar2, atomicReference, aVar, bVar));
        return new x(atomicReference, aVar);
    }

    private void registerOnPreAttachListener(i0 i0Var) {
        if (this.mState >= 0) {
            i0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(i0Var);
        }
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var != null) {
            h0Var.f6358u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        b3 b3VarG = b3.g(viewGroup, fragmentManager.C());
        b3VarG.h();
        if (z10) {
            this.mHost.getHandler().post(new b0(b3VarG));
        } else {
            b3VarG.c();
        }
    }

    public p0 createFragmentContainer() {
        return new c0(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            d5.b.getInstance(this).dump(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.dump(j1.o2.l(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f6222c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final FragmentActivity getActivity() {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return null;
        }
        return (FragmentActivity) t0Var.f6460b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null || (bool = h0Var.f6353p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null || (bool = h0Var.f6352o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        h0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(a.b.j("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return null;
        }
        return t0Var.f6461c;
    }

    @Override // androidx.lifecycle.a0
    public l3 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.x2(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f6339b;
    }

    public Object getEnterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f6346i;
    }

    public k3.i1 getEnterTransitionCallback() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f6354q;
    }

    public int getExitAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f6340c;
    }

    public Object getExitTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f6348k;
    }

    public k3.i1 getExitTransitionCallback() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f6355r;
    }

    public View getFocusedView() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f6357t;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return null;
        }
        return t0Var.onGetHost();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.b1, v5.j, f.i0
    public androidx.lifecycle.k0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public d5.b getLoaderManager() {
        return d5.b.getInstance(this);
    }

    public int getNextTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f6343f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(a.b.j("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return false;
        }
        return h0Var.f6338a;
    }

    public int getPopEnterAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f6341d;
    }

    public int getPopExitAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f6342e;
    }

    public float getPostOnViewCreatedAlpha() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 1.0f;
        }
        return h0Var.f6356s;
    }

    public Object getReenterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f6349l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        x4.e.onGetRetainInstanceUsage(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f6347j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // v5.j
    public final v5.h getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    public Object getSharedElementEnterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f6350m;
    }

    public Object getSharedElementReturnTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f6351n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        h0 h0Var = this.mAnimationInfo;
        return (h0Var == null || (arrayList = h0Var.f6344g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        h0 h0Var = this.mAnimationInfo;
        return (h0Var == null || (arrayList = h0Var.f6345h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        x4.e.onGetTargetFragmentRequestCodeUsage(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.b1 getViewLifecycleOwner() {
        r2 r2Var = this.mViewLifecycleOwner;
        if (r2Var != null) {
            return r2Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public androidx.lifecycle.l1 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.n3
    public m3 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int minimumMaxLifecycleState = getMinimumMaxLifecycleState();
        androidx.lifecycle.j0 j0Var = androidx.lifecycle.j0.f6614b;
        if (minimumMaxLifecycleState == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.O.f6490c;
        m3 m3Var = (m3) map.get(this.mWho);
        if (m3Var != null) {
            return m3Var;
        }
        m3 m3Var2 = new m3();
        map.put(this.mWho, m3Var2);
        return m3Var2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new t1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return false;
        }
        return h0Var.f6358u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.isStateSaved();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.I();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        t0 t0Var = this.mHost;
        Activity activity = t0Var == null ? null : t0Var.f6460b;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f6240u >= 1) {
            return;
        }
        fragmentManager.H = false;
        fragmentManager.I = false;
        fragmentManager.O.f6494g = false;
        fragmentManager.t(1);
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        t0 t0Var = this.mHost;
        Activity activity = t0Var == null ? null : t0Var.f6460b;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.I();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.H = false;
        fragmentManager.I = false;
        fragmentManager.O.f6494g = false;
        fragmentManager.t(4);
    }

    public void performAttach() {
        Iterator<i0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f6461c);
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onAttach()"));
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        Iterator it2 = fragmentManager.f6234o.iterator();
        while (it2.hasNext()) {
            ((y1) it2.next()).onAttachFragment(fragmentManager, this);
        }
        FragmentManager fragmentManager2 = this.mChildFragmentManager;
        fragmentManager2.H = false;
        fragmentManager2.I = false;
        fragmentManager2.O.f6494g = false;
        fragmentManager2.t(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.I();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new d0(this));
        this.mSavedStateRegistryController.performRestore(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return this.mChildFragmentManager.j(menu, menuInflater) | z10;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.I();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new r2(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f6449f != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.b();
            o3.set(this.mView, this.mViewLifecycleOwner);
            p3.set(this.mView, this.mViewLifecycleOwner);
            v5.n.set(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(androidx.lifecycle.j0.f6616e)) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.i0.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        d5.b.getInstance(this).markForRedelivery();
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.isDestroyed()) {
            return;
        }
        this.mChildFragmentManager.k();
        this.mChildFragmentManager = new t1();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.o(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.p(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.i0.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return this.mChildFragmentManager.s(menu) | z10;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zG = FragmentManager.G(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zG) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zG);
            onPrimaryNavigationFragmentChanged(zG);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.Y();
            fragmentManager.q(fragmentManager.f6244y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.I();
        this.mChildFragmentManager.w(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.d1 d1Var = this.mLifecycleRegistry;
        androidx.lifecycle.i0 i0Var = androidx.lifecycle.i0.ON_RESUME;
        d1Var.handleLifecycleEvent(i0Var);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(i0Var);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.H = false;
        fragmentManager.I = false;
        fragmentManager.O.f6494g = false;
        fragmentManager.t(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.performSave(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.Q());
    }

    public void performStart() {
        this.mChildFragmentManager.I();
        this.mChildFragmentManager.w(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.d1 d1Var = this.mLifecycleRegistry;
        androidx.lifecycle.i0 i0Var = androidx.lifecycle.i0.ON_START;
        d1Var.handleLifecycleEvent(i0Var);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(i0Var);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.H = false;
        fragmentManager.I = false;
        fragmentManager.O.f6494g = false;
        fragmentManager.t(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.I = true;
        fragmentManager.O.f6494g = true;
        fragmentManager.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.i0.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.t(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f6358u = true;
    }

    @Override // i.c
    public final <I, O> i.d registerForActivityResult(j.a aVar, i.b bVar) {
        return prepareCallInternal(aVar, new e0(this), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost == null) {
            throw new IllegalStateException(a.b.j("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E == null) {
            parentFragmentManager.f6241v.onRequestPermissionsFromFragment(this, strArr, i10);
            return;
        }
        parentFragmentManager.F.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i10));
        parentFragmentManager.E.launch(strArr);
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(a.b.j("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(a.b.j("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a.b.j("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a.b.j("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(a.b.j("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.b.j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.P(parcelable);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.H = false;
        fragmentManager.I = false;
        fragmentManager.O.f6494g = false;
        fragmentManager.t(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            r2 r2Var = this.mViewLifecycleOwner;
            r2Var.f6450g.performRestore(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new d3(a.b.j("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.i0.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f6353p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f6352o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f6339b = i10;
        ensureAnimationInfo().f6340c = i11;
        ensureAnimationInfo().f6341d = i12;
        ensureAnimationInfo().f6342e = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(k3.i1 i1Var) {
        ensureAnimationInfo().f6354q = i1Var;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f6346i = obj;
    }

    public void setExitSharedElementCallback(k3.i1 i1Var) {
        ensureAnimationInfo().f6355r = i1Var;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f6348k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f6357t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.onSupportInvalidateOptionsMenu();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f6214b) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f6343f = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f6338a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f6356s = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f6349l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        x4.e.onSetRetainInstanceUsage(this);
        this.mRetainInstance = z10;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            fragmentManager.O.a(this);
        } else {
            fragmentManager.O.e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f6347j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f6350m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        h0 h0Var = this.mAnimationInfo;
        h0Var.f6344g = arrayList;
        h0Var.f6345h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f6351n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i10) {
        if (fragment != null) {
            x4.e.onSetTargetFragmentUsage(this, fragment, i10);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(a.b.j("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        x4.e.onSetUserVisibleHint(this, z10);
        boolean z11 = false;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            e2 e2VarF = fragmentManager.f(this);
            Fragment fragment = e2VarF.f6304c;
            if (fragment.mDeferStart) {
                if (fragmentManager.f6221b) {
                    fragmentManager.K = true;
                } else {
                    fragment.mDeferStart = false;
                    e2VarF.j();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        t0 t0Var = this.mHost;
        if (t0Var != null) {
            return t0Var.onShouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(a.b.j("Fragment ", this, " not attached to Activity"));
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D == null) {
            parentFragmentManager.f6241v.onStartIntentSenderFromFragment(this, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest intentSenderRequestBuild = new IntentSenderRequest.a(intentSender).setFillInIntent(intent).setFlags(i12, i11).build();
        parentFragmentManager.F.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i10));
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.D.launch(intentSenderRequestBuild);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f6358u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f6358u = false;
        } else if (Looper.myLooper() != this.mHost.getHandler().getLooper()) {
            this.mHost.getHandler().postAtFrontOfQueue(new a0(this));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new j0();

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f6214b;

        public SavedState(Bundle bundle) {
            this.f6214b = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f6214b);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f6214b = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    private Fragment getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            x4.e.onGetTargetFragmentUsage(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.f6222c.b(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = s0.loadFragmentClass(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragmentNewInstance;
            }
            bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
            fragmentNewInstance.setArguments(bundle);
            return fragmentNewInstance;
        } catch (IllegalAccessException e10) {
            throw new a(a.b.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new a(a.b.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new a(a.b.l("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new a(a.b.l("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        ensureAnimationInfo().f6358u = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handler = fragmentManager != null ? fragmentManager.getHost().getHandler() : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    @Override // i.c
    public final <I, O> i.d registerForActivityResult(j.a aVar, i.g gVar, i.b bVar) {
        return prepareCallInternal(aVar, new f0(gVar), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            throw new IllegalStateException(a.b.j("Fragment ", this, " not attached to Activity"));
        }
        t0Var.onStartActivityFromFragment(this, intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(a.b.j("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.C == null) {
            parentFragmentManager.f6241v.onStartActivityFromFragment(this, intent, i10, bundle);
            return;
        }
        parentFragmentManager.F.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i10));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        parentFragmentManager.C.launch(intent);
    }

    @Override // androidx.lifecycle.a0
    public b5.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + duhsDlGWdBkekB.PArxWp);
        }
        b5.e eVar = new b5.e();
        if (application != null) {
            eVar.set(j3.a.f6628f, application);
        }
        eVar.set(androidx.lifecycle.t2.f6710a, this);
        eVar.set(androidx.lifecycle.t2.f6711b, this);
        if (getArguments() != null) {
            eVar.set(androidx.lifecycle.t2.f6712c, getArguments());
        }
        return eVar;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        t0 t0Var = this.mHost;
        if (t0Var != null) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = t0Var.onGetLayoutInflater();
            x3.y.setFactory2(layoutInflaterOnGetLayoutInflater, this.mChildFragmentManager.f6225f);
            return layoutInflaterOnGetLayoutInflater;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private void restoreViewState() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }
}
