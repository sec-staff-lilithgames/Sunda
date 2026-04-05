package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p0.o2;
import x3.z1;
import z.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m extends RecyclerView.a implements o {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    f mFragmentEventDispatcher;
    final FragmentManager mFragmentManager;
    private j mFragmentMaxLifecycleEnforcer;
    final x mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final x mItemIdToViewHolder;
    final k0 mLifecycle;
    private final x mSavedStates;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f7379a = new k();

        public l onFragmentMaxLifecyclePreUpdated(Fragment fragment, j0 j0Var) {
            return f7379a;
        }

        public l onFragmentPreAdded(Fragment fragment) {
            return f7379a;
        }

        public l onFragmentPreRemoved(Fragment fragment) {
            return f7379a;
        }

        public l onFragmentPreSavedInstanceState(Fragment fragment) {
            return f7379a;
        }
    }

    public m(FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    public final Long a(int i10) {
        Long lValueOf = null;
        for (int i11 = 0; i11 < this.mItemIdToViewHolder.size(); i11++) {
            if (((Integer) this.mItemIdToViewHolder.valueAt(i11)).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.keyAt(i11));
            }
        }
        return lValueOf;
    }

    public void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final void b(long j10) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.mFragments.get(j10);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j10)) {
            this.mSavedStates.remove(j10);
        }
        if (!fragment.isAdded()) {
            this.mFragments.remove(j10);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (fragment.isAdded() && containsItem(j10)) {
            List<l> listDispatchPreSavedInstanceState = this.mFragmentEventDispatcher.dispatchPreSavedInstanceState(fragment);
            Fragment.SavedState savedStateSaveFragmentInstanceState = this.mFragmentManager.saveFragmentInstanceState(fragment);
            this.mFragmentEventDispatcher.dispatchPostEvents(listDispatchPreSavedInstanceState);
            this.mSavedStates.put(j10, savedStateSaveFragmentInstanceState);
        }
        List<l> listDispatchPreRemoved = this.mFragmentEventDispatcher.dispatchPreRemoved(fragment);
        try {
            this.mFragmentManager.beginTransaction().remove(fragment).commitNow();
            this.mFragments.remove(j10);
        } finally {
            this.mFragmentEventDispatcher.dispatchPostEvents(listDispatchPreRemoved);
        }
    }

    public boolean containsItem(long j10) {
        return j10 >= 0 && j10 < ((long) getItemCount());
    }

    public abstract Fragment createFragment(int i10);

    public void gcFragments() {
        Fragment fragment;
        View view;
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        z.g gVar = new z.g();
        for (int i10 = 0; i10 < this.mFragments.size(); i10++) {
            long jKeyAt = this.mFragments.keyAt(i10);
            if (!containsItem(jKeyAt)) {
                gVar.add(Long.valueOf(jKeyAt));
                this.mItemIdToViewHolder.remove(jKeyAt);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i11 = 0; i11 < this.mFragments.size(); i11++) {
                long jKeyAt2 = this.mFragments.keyAt(i11);
                if (!this.mItemIdToViewHolder.containsKey(jKeyAt2) && ((fragment = (Fragment) this.mFragments.get(jKeyAt2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    gVar.add(Long.valueOf(jKeyAt2));
                }
            }
        }
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            b(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        w3.i.checkArgument(this.mFragmentMaxLifecycleEnforcer == null);
        j jVar = new j(this);
        this.mFragmentMaxLifecycleEnforcer = jVar;
        jVar.f7376d = j.a(recyclerView);
        g gVar = new g(jVar);
        jVar.f7373a = gVar;
        jVar.f7376d.registerOnPageChangeCallback(gVar);
        h hVar = new h(jVar);
        jVar.f7374b = hVar;
        registerAdapterDataObserver(hVar);
        i iVar = new i(jVar);
        jVar.f7375c = iVar;
        this.mLifecycle.addObserver(iVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        j jVar = this.mFragmentMaxLifecycleEnforcer;
        jVar.getClass();
        j.a(recyclerView).unregisterOnPageChangeCallback(jVar.f7373a);
        m mVar = jVar.f7378f;
        mVar.unregisterAdapterDataObserver(jVar.f7374b);
        mVar.mLifecycle.removeObserver(jVar.f7375c);
        jVar.f7376d = null;
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final boolean onFailedToRecycleView(n nVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(n nVar) {
        Long lA = a(((FrameLayout) nVar.itemView).getId());
        if (lA != null) {
            b(lA.longValue());
            this.mItemIdToViewHolder.remove(lA.longValue());
        }
    }

    public void placeFragmentInViewHolder(n nVar) {
        Fragment fragment = (Fragment) this.mFragments.get(nVar.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) nVar.itemView;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            this.mFragmentManager.registerFragmentLifecycleCallbacks(new b(this, fragment, frameLayout), false);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                addViewToContainer(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            addViewToContainer(view, frameLayout);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.isDestroyed()) {
                return;
            }
            this.mLifecycle.addObserver(new androidx.viewpager2.adapter.a(this, nVar));
            return;
        }
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new b(this, fragment, frameLayout), false);
        List<l> listDispatchPreAdded = this.mFragmentEventDispatcher.dispatchPreAdded(fragment);
        try {
            fragment.setMenuVisibility(false);
            this.mFragmentManager.beginTransaction().add(fragment, InneractiveMediationDefs.GENDER_FEMALE + nVar.getItemId()).setMaxLifecycle(fragment, j0.f6617f).commitNow();
            this.mFragmentMaxLifecycleEnforcer.b(false);
        } finally {
            this.mFragmentEventDispatcher.dispatchPostEvents(listDispatchPreAdded);
        }
    }

    public void registerFragmentTransactionCallback(a aVar) {
        this.mFragmentEventDispatcher.registerCallback(aVar);
    }

    @Override // androidx.viewpager2.adapter.o
    public final void restoreState(Parcelable parcelable) throws NumberFormatException {
        if (!this.mSavedStates.isEmpty() || !this.mFragments.isEmpty()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (str.startsWith(KEY_PREFIX_FRAGMENT) && str.length() > 2) {
                this.mFragments.put(Long.parseLong(str.substring(2)), this.mFragmentManager.getFragment(bundle, str));
            } else {
                if (!str.startsWith(KEY_PREFIX_STATE) || str.length() <= 2) {
                    throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                }
                long j10 = Long.parseLong(str.substring(2));
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (containsItem(j10)) {
                    this.mSavedStates.put(j10, savedState);
                }
            }
        }
        if (this.mFragments.isEmpty()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        Handler handler = new Handler(Looper.getMainLooper());
        c cVar = new c(this);
        this.mLifecycle.addObserver(new d(handler, cVar));
        handler.postDelayed(cVar, GRACE_WINDOW_TIME_MS);
    }

    @Override // androidx.viewpager2.adapter.o
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mSavedStates.size() + this.mFragments.size());
        for (int i10 = 0; i10 < this.mFragments.size(); i10++) {
            long jKeyAt = this.mFragments.keyAt(i10);
            Fragment fragment = (Fragment) this.mFragments.get(jKeyAt);
            if (fragment != null && fragment.isAdded()) {
                this.mFragmentManager.putFragment(bundle, o2.m(jKeyAt, KEY_PREFIX_FRAGMENT), fragment);
            }
        }
        for (int i11 = 0; i11 < this.mSavedStates.size(); i11++) {
            long jKeyAt2 = this.mSavedStates.keyAt(i11);
            if (containsItem(jKeyAt2)) {
                bundle.putParcelable(o2.m(jKeyAt2, KEY_PREFIX_STATE), (Parcelable) this.mSavedStates.get(jKeyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.isStateSaved();
    }

    public void unregisterFragmentTransactionCallback(a aVar) {
        this.mFragmentEventDispatcher.unregisterCallback(aVar);
    }

    public m(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(n nVar, int i10) {
        long itemId = nVar.getItemId();
        int id2 = ((FrameLayout) nVar.itemView).getId();
        Long lA = a(id2);
        if (lA != null && lA.longValue() != itemId) {
            b(lA.longValue());
            this.mItemIdToViewHolder.remove(lA.longValue());
        }
        this.mItemIdToViewHolder.put(itemId, Integer.valueOf(id2));
        long itemId2 = getItemId(i10);
        if (!this.mFragments.containsKey(itemId2)) {
            Fragment fragmentCreateFragment = createFragment(i10);
            fragmentCreateFragment.setInitialSavedState((Fragment.SavedState) this.mSavedStates.get(itemId2));
            this.mFragments.put(itemId2, fragmentCreateFragment);
        }
        if (z1.isAttachedToWindow((FrameLayout) nVar.itemView)) {
            placeFragmentInViewHolder(nVar);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final n onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int i11 = n.f7380c;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(z1.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new n(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(n nVar) {
        placeFragmentInViewHolder(nVar);
        gcFragments();
    }

    public m(FragmentManager fragmentManager, k0 k0Var) {
        this.mFragments = new x();
        this.mSavedStates = new x();
        this.mItemIdToViewHolder = new x();
        f fVar = new f();
        fVar.f7369a = new CopyOnWriteArrayList();
        this.mFragmentEventDispatcher = fVar;
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = k0Var;
        super.setHasStableIds(true);
    }
}
