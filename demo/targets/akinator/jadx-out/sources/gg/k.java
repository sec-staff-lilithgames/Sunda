package gg;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class k implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f57683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f57684c;

    public k(ChipGroup chipGroup) {
        this.f57684c = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f57684c;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            chipGroup.f29127j.addCheckable((Chip) view2);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f57683b;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f57684c;
        if (view == chipGroup && (view2 instanceof Chip)) {
            chipGroup.f29127j.removeCheckable((Chip) view2);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f57683b;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
