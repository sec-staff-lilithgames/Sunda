package xf;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f91974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f91975e;

    public f(ActionMenuItemView actionMenuItemView, a aVar) {
        this.f91974d = actionMenuItemView;
        this.f91975e = aVar;
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        CharSequence contentDescription = this.f91975e.getContentDescription();
        if (contentDescription == null) {
            contentDescription = this.f91974d.getContentDescription();
        }
        cVar.setContentDescription(contentDescription);
    }
}
