package androidx.recyclerview.widget;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z1 extends Observable {
    public boolean hasObservers() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public void notifyChanged() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((RecyclerView.b) ((Observable) this).mObservers.get(size)).onChanged();
        }
    }

    public void notifyItemMoved(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((RecyclerView.b) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i10, i11, 1);
        }
    }

    public void notifyItemRangeChanged(int i10, int i11) {
        notifyItemRangeChanged(i10, i11, null);
    }

    public void notifyItemRangeInserted(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((RecyclerView.b) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i10, i11);
        }
    }

    public void notifyItemRangeRemoved(int i10, int i11) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((RecyclerView.b) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i10, i11);
        }
    }

    public void notifyStateRestorationPolicyChanged() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((RecyclerView.b) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
        }
    }

    public void notifyItemRangeChanged(int i10, int i11, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((RecyclerView.b) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i10, i11, obj);
        }
    }
}
