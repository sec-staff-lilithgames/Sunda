package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.n3;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f6302a;

    /* renamed from: b, reason: collision with root package name */
    public final f2 f6303b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f6304c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6305d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f6306e = -1;

    public e2(x0 x0Var, f2 f2Var, Fragment fragment) {
        this.f6302a = x0Var;
        this.f6303b = f2Var;
        this.f6304c = fragment;
    }

    public final void a() {
        View view;
        View view2;
        ArrayList arrayList = this.f6303b.f6314a;
        Fragment fragment = this.f6304c;
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment);
            int i10 = iIndexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(iIndexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i10);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f6304c;
        if (zIsLoggingEnabled) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        e2 e2Var = null;
        f2 f2Var = this.f6303b;
        if (fragment2 != null) {
            e2 e2Var2 = (e2) f2Var.f6315b.get(fragment2.mWho);
            if (e2Var2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            e2Var = e2Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (e2Var = (e2) f2Var.f6315b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(j1.o2.o(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (e2Var != null) {
            e2Var.j();
        }
        fragment.mHost = fragment.mFragmentManager.getHost();
        fragment.mParentFragment = fragment.mFragmentManager.f6243x;
        x0 x0Var = this.f6302a;
        x0Var.g(fragment, false);
        fragment.performAttach();
        x0Var.b(fragment, false);
    }

    public final int c() {
        a3 a3Var;
        Fragment fragment = this.f6304c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f6306e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f6306e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f6306e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            b3 b3VarF = b3.f(viewGroup, fragment.getParentFragmentManager());
            b3VarF.getClass();
            a3 a3VarD = b3VarF.d(fragment);
            i = a3VarD != null ? a3VarD.f6276b : 0;
            Iterator it = b3VarF.f6286c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    a3Var = null;
                    break;
                }
                a3Var = (a3) it.next();
                if (a3Var.getFragment().equals(fragment) && !a3Var.f6280f) {
                    break;
                }
            }
            if (a3Var != null && (i == 0 || i == 1)) {
                i = a3Var.f6276b;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void d() {
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f6304c;
        if (zIsLoggingEnabled) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            fragment.mState = 1;
            return;
        }
        Bundle bundle = fragment.mSavedFragmentState;
        x0 x0Var = this.f6302a;
        x0Var.h(fragment, bundle, false);
        fragment.performCreate(fragment.mSavedFragmentState);
        x0Var.c(fragment, fragment.mSavedFragmentState, false);
    }

    public final void e() throws Resources.NotFoundException {
        String resourceName;
        Fragment fragment = this.f6304c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            int i10 = fragment.mContainerId;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException(a.b.j("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f6242w.onFindViewById(i10);
                if (viewGroup == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    x4.e.onWrongFragmentContainer(fragment, viewGroup);
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment.mSavedFragmentState);
        View view = fragment.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (x3.z1.isAttachedToWindow(fragment.mView)) {
                x3.z1.requestApplyInsets(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new d2(view2));
            }
            fragment.performViewCreated();
            this.f6302a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void f() {
        Fragment fragmentB;
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f6304c;
        if (zIsLoggingEnabled) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        f2 f2Var = this.f6303b;
        if (z10 && !fragment.mBeingSaved) {
            f2Var.i(fragment.mWho, null);
        }
        if (!z10) {
            x1 x1Var = f2Var.f6317d;
            if (!(!x1Var.f6488a.containsKey(fragment.mWho) ? true : x1Var.f6491d ? x1Var.f6492e : !x1Var.f6493f)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = f2Var.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        t0 t0Var = fragment.mHost;
        if (t0Var instanceof n3) {
            zIsChangingConfigurations = f2Var.f6317d.f6492e;
        } else {
            Context context = t0Var.f6461c;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z10 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            f2Var.f6317d.b(fragment);
        }
        fragment.performDestroy();
        this.f6302a.d(fragment, false);
        Iterator it = f2Var.d().iterator();
        while (it.hasNext()) {
            e2 e2Var = (e2) it.next();
            if (e2Var != null) {
                Fragment fragment2 = e2Var.f6304c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = f2Var.b(str2);
        }
        f2Var.h(this);
    }

    public final void g() {
        View view;
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f6304c;
        if (zIsLoggingEnabled) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f6302a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public final void h() {
        boolean zIsLoggingEnabled = FragmentManager.isLoggingEnabled(3);
        Fragment fragment = this.f6304c;
        if (zIsLoggingEnabled) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f6302a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            x1 x1Var = this.f6303b.f6317d;
            if (!(x1Var.f6488a.containsKey(fragment.mWho) ? x1Var.f6491d ? x1Var.f6492e : true ^ x1Var.f6493f : true)) {
                return;
            }
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void i() {
        Fragment fragment = this.f6304c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f6302a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                fragment.mState = 2;
            }
        }
    }

    public final void j() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f6305d;
        Fragment fragment = this.f6304c;
        if (z10) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f6305d = true;
            boolean z11 = false;
            while (true) {
                int iC = c();
                int i10 = fragment.mState;
                f2 f2Var = this.f6303b;
                if (iC == i10) {
                    if (!z11 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        f2Var.f6317d.b(fragment);
                        f2Var.h(this);
                        if (FragmentManager.isLoggingEnabled(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            b3 b3VarF = b3.f(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                b3VarF.getClass();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                b3VarF.a(z2.f6509e, 1, this);
                            } else {
                                b3VarF.getClass();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                b3VarF.a(z2.f6508c, 1, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.E(fragment)) {
                            fragmentManager.G = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.n();
                    }
                    this.f6305d = false;
                    return;
                }
                x0 x0Var = this.f6302a;
                if (iC <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((FragmentState) f2Var.f6316c.get(fragment.mWho)) == null) {
                                    n();
                                }
                            }
                            f();
                            break;
                        case 1:
                            g();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                n();
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                o();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                b3 b3VarF2 = b3.f(viewGroup2, fragment.getParentFragmentManager());
                                b3VarF2.getClass();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                b3VarF2.a(z2.f6507b, 3, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            x0Var.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            x0Var.f(fragment, false);
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                            }
                            fragment.performActivityCreated(fragment.mSavedFragmentState);
                            x0Var.a(fragment, fragment.mSavedFragmentState, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                b3 b3VarF3 = b3.f(viewGroup3, fragment.getParentFragmentManager());
                                z2 z2VarB = z2.b(fragment.mView.getVisibility());
                                b3VarF3.getClass();
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                b3VarF3.a(z2VarB, 2, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            x0Var.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            l();
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th2) {
            this.f6305d = false;
            throw th2;
        }
    }

    public final void k(ClassLoader classLoader) {
        Fragment fragment = this.f6304c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("android:view_registry_state");
        fragment.mTargetWho = fragment.mSavedFragmentState.getString("android:target_state");
        if (fragment.mTargetWho != null) {
            fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = fragment.mSavedUserVisibleHint;
        if (bool != null) {
            fragment.mUserVisibleHint = bool.booleanValue();
            fragment.mSavedUserVisibleHint = null;
        } else {
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.Fragment r2 = r6.f6304c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            if (r0 == 0) goto L78
            android.view.View r3 = r2.mView
            if (r0 != r3) goto L27
            goto L31
        L27:
            android.view.ViewParent r3 = r0.getParent()
        L2b:
            if (r3 == 0) goto L78
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L73
        L31:
            boolean r3 = r0.requestFocus()
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
            if (r4 == 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            if (r3 == 0) goto L50
            java.lang.String r0 = "succeeded"
            goto L52
        L50:
            java.lang.String r0 = "failed"
        L52:
            r4.append(r0)
            java.lang.String r0 = " on Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r4.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r1, r0)
            goto L78
        L73:
            android.view.ViewParent r3 = r3.getParent()
            goto L2b
        L78:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            androidx.fragment.app.x0 r1 = r6.f6302a
            r3 = 0
            r1.i(r2, r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e2.l():void");
    }

    public final Bundle m() {
        Bundle bundle = new Bundle();
        Fragment fragment = this.f6304c;
        fragment.performSaveInstanceState(bundle);
        this.f6302a.j(fragment, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (fragment.mView != null) {
            o();
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (fragment.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", fragment.mSavedViewRegistryState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public final void n() {
        Fragment fragment = this.f6304c;
        FragmentState fragmentState = new FragmentState(fragment);
        if (fragment.mState <= -1 || fragmentState.f6268o != null) {
            fragmentState.f6268o = fragment.mSavedFragmentState;
        } else {
            Bundle bundleM = m();
            fragmentState.f6268o = bundleM;
            if (fragment.mTargetWho != null) {
                if (bundleM == null) {
                    fragmentState.f6268o = new Bundle();
                }
                fragmentState.f6268o.putString("android:target_state", fragment.mTargetWho);
                int i10 = fragment.mTargetRequestCode;
                if (i10 != 0) {
                    fragmentState.f6268o.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f6303b.i(fragment.mWho, fragmentState);
    }

    public final void o() {
        Fragment fragment = this.f6304c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f6450g.performSave(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public e2(x0 x0Var, f2 f2Var, ClassLoader classLoader, s0 s0Var, FragmentState fragmentState) {
        this.f6302a = x0Var;
        this.f6303b = f2Var;
        Fragment fragmentA = fragmentState.a(s0Var, classLoader);
        this.f6304c = fragmentA;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public e2(x0 x0Var, f2 f2Var, Fragment fragment, FragmentState fragmentState) {
        this.f6302a = x0Var;
        this.f6303b = f2Var;
        this.f6304c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f6268o;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
