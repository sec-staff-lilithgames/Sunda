package androidx.viewpager2.adapter;

import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h2;
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public g f7373a;

    /* renamed from: b, reason: collision with root package name */
    public h f7374b;

    /* renamed from: c, reason: collision with root package name */
    public i f7375c;

    /* renamed from: d, reason: collision with root package name */
    public ViewPager2 f7376d;

    /* renamed from: e, reason: collision with root package name */
    public long f7377e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f7378f;

    public j(m mVar) {
        this.f7378f = mVar;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public final void b(boolean z10) {
        int currentItem;
        Fragment fragment;
        m mVar = this.f7378f;
        if (mVar.shouldDelayFragmentTransactions() || this.f7376d.getScrollState() != 0 || mVar.mFragments.isEmpty() || mVar.getItemCount() == 0 || (currentItem = this.f7376d.getCurrentItem()) >= mVar.getItemCount()) {
            return;
        }
        long itemId = mVar.getItemId(currentItem);
        if ((itemId != this.f7377e || z10) && (fragment = (Fragment) mVar.mFragments.get(itemId)) != null && fragment.isAdded()) {
            this.f7377e = itemId;
            h2 h2VarBeginTransaction = mVar.mFragmentManager.beginTransaction();
            ArrayList arrayList = new ArrayList();
            Fragment fragment2 = null;
            for (int i10 = 0; i10 < mVar.mFragments.size(); i10++) {
                long jKeyAt = mVar.mFragments.keyAt(i10);
                Fragment fragment3 = (Fragment) mVar.mFragments.valueAt(i10);
                if (fragment3.isAdded()) {
                    if (jKeyAt != this.f7377e) {
                        j0 j0Var = j0.f6617f;
                        h2VarBeginTransaction.setMaxLifecycle(fragment3, j0Var);
                        arrayList.add(mVar.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(fragment3, j0Var));
                    } else {
                        fragment2 = fragment3;
                    }
                    fragment3.setMenuVisibility(jKeyAt == this.f7377e);
                }
            }
            if (fragment2 != null) {
                j0 j0Var2 = j0.f6618g;
                h2VarBeginTransaction.setMaxLifecycle(fragment2, j0Var2);
                arrayList.add(mVar.mFragmentEventDispatcher.dispatchMaxLifecyclePreUpdated(fragment2, j0Var2));
            }
            if (h2VarBeginTransaction.isEmpty()) {
                return;
            }
            h2VarBeginTransaction.commitNow();
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mVar.mFragmentEventDispatcher.dispatchPostEvents((List) it.next());
            }
        }
    }
}
