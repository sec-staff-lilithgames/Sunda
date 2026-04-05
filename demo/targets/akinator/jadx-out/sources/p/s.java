package p;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends FrameLayout implements o.d {

    /* renamed from: b, reason: collision with root package name */
    public final CollapsibleActionView f80115b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(View view) {
        super(view.getContext());
        this.f80115b = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // o.d
    public void onActionViewCollapsed() {
        this.f80115b.onActionViewCollapsed();
    }

    @Override // o.d
    public void onActionViewExpanded() {
        this.f80115b.onActionViewExpanded();
    }
}
