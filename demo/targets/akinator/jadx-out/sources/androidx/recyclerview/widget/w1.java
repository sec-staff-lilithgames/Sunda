package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7302a;

    public w1(RecyclerView recyclerView) {
        this.f7302a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.o
    public void addView(View view, int i10) {
        RecyclerView recyclerView = this.f7302a;
        recyclerView.addView(view, i10);
        recyclerView.dispatchChildAttached(view);
    }

    @Override // androidx.recyclerview.widget.o
    public void attachViewToParent(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        RecyclerView.n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        RecyclerView recyclerView = this.f7302a;
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(a.b.h(recyclerView, sb2));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(i10);
            throw new IllegalArgumentException(a.b.h(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, i10, layoutParams);
    }

    @Override // androidx.recyclerview.widget.o
    public void detachViewFromParent(int i10) {
        View childAt = getChildAt(i10);
        RecyclerView recyclerView = this.f7302a;
        if (childAt != null) {
            RecyclerView.n childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(childViewHolderInt);
                    throw new IllegalArgumentException(a.b.h(recyclerView, sb2));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(NotificationCompat.FLAG_LOCAL_ONLY);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(i10);
            throw new IllegalArgumentException(a.b.h(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(i10);
    }

    @Override // androidx.recyclerview.widget.o
    public View getChildAt(int i10) {
        return this.f7302a.getChildAt(i10);
    }

    @Override // androidx.recyclerview.widget.o
    public int getChildCount() {
        return this.f7302a.getChildCount();
    }

    @Override // androidx.recyclerview.widget.o
    public RecyclerView.n getChildViewHolder(View view) {
        return RecyclerView.getChildViewHolderInt(view);
    }

    @Override // androidx.recyclerview.widget.o
    public int indexOfChild(View view) {
        return this.f7302a.indexOfChild(view);
    }

    @Override // androidx.recyclerview.widget.o
    public void onEnteredHiddenState(View view) {
        RecyclerView.n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(this.f7302a);
        }
    }

    @Override // androidx.recyclerview.widget.o
    public void onLeftHiddenState(View view) {
        RecyclerView.n childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onLeftHiddenState(this.f7302a);
        }
    }

    @Override // androidx.recyclerview.widget.o
    public void removeAllViews() {
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            RecyclerView recyclerView = this.f7302a;
            if (i10 >= childCount) {
                recyclerView.removeAllViews();
                return;
            }
            View childAt = getChildAt(i10);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
            i10++;
        }
    }

    @Override // androidx.recyclerview.widget.o
    public void removeViewAt(int i10) {
        RecyclerView recyclerView = this.f7302a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
