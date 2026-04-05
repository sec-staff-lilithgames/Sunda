package qg;

import android.view.View;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class y extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NavigationMenuItemView f83239d;

    public y(NavigationMenuItemView navigationMenuItemView) {
        this.f83239d = navigationMenuItemView;
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        cVar.setCheckable(this.f83239d.f29294k);
    }
}
