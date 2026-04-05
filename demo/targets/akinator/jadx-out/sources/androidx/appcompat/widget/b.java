package androidx.appcompat.widget;

import androidx.appcompat.widget.ActionMenuPresenter;
import p.e0;
import q.y1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends y1 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ActionMenuPresenter.c f5142l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuPresenter.c cVar, ActionMenuPresenter.c cVar2) {
        super(cVar2);
        this.f5142l = cVar;
    }

    @Override // q.y1
    public e0 getPopup() {
        ActionMenuPresenter.d dVar = ActionMenuPresenter.this.f4992z;
        if (dVar == null) {
            return null;
        }
        return dVar.getPopup();
    }

    @Override // q.y1
    public boolean onForwardingStarted() {
        ActionMenuPresenter.this.showOverflowMenu();
        return true;
    }

    @Override // q.y1
    public boolean onForwardingStopped() {
        ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
        if (actionMenuPresenter.B != null) {
            return false;
        }
        actionMenuPresenter.hideOverflowMenu();
        return true;
    }
}
