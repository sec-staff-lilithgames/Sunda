package androidx.appcompat.widget;

import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuPresenter;
import p.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends ActionMenuItemView.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActionMenuPresenter f5141a;

    public a(ActionMenuPresenter actionMenuPresenter) {
        this.f5141a = actionMenuPresenter;
    }

    @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
    public e0 getPopup() {
        ActionMenuPresenter.a aVar = this.f5141a.A;
        if (aVar != null) {
            return aVar.getPopup();
        }
        return null;
    }
}
