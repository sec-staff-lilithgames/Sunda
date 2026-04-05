package q;

import androidx.appcompat.widget.ActionMenuPresenter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m implements p.z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuPresenter f82174b;

    public m(ActionMenuPresenter actionMenuPresenter) {
        this.f82174b = actionMenuPresenter;
    }

    @Override // p.z
    public void onCloseMenu(p.m mVar, boolean z10) {
        if (mVar instanceof p.i0) {
            mVar.getRootMenu().close(false);
        }
        p.z callback = this.f82174b.getCallback();
        if (callback != null) {
            callback.onCloseMenu(mVar, z10);
        }
    }

    @Override // p.z
    public boolean onOpenSubMenu(p.m mVar) {
        ActionMenuPresenter actionMenuPresenter = this.f82174b;
        if (mVar == actionMenuPresenter.f79972e) {
            return false;
        }
        actionMenuPresenter.E = ((p.i0) mVar).getItem().getItemId();
        p.z callback = actionMenuPresenter.getCallback();
        if (callback != null) {
            return callback.onOpenSubMenu(mVar);
        }
        return false;
    }
}
