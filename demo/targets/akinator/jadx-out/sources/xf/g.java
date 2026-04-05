package xf;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f91976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(View.AccessibilityDelegate accessibilityDelegate, ActionMenuItemView actionMenuItemView) {
        super(accessibilityDelegate);
        this.f91976d = actionMenuItemView;
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        cVar.setContentDescription(this.f91976d.getContentDescription());
    }
}
