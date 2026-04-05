package p;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.digidust.elokence.akinator.freemium.R;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, z {

    /* renamed from: b, reason: collision with root package name */
    public final m f80081b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.m f80082c;

    /* renamed from: e, reason: collision with root package name */
    public i f80083e;

    /* renamed from: f, reason: collision with root package name */
    public z f80084f;

    public n(m mVar) {
        this.f80081b = mVar;
    }

    public void dismiss() {
        androidx.appcompat.app.m mVar = this.f80082c;
        if (mVar != null) {
            mVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f80081b.performItemAction((q) this.f80083e.getAdapter().getItem(i10), 0);
    }

    @Override // p.z
    public void onCloseMenu(m mVar, boolean z10) {
        if (z10 || mVar == this.f80081b) {
            dismiss();
        }
        z zVar = this.f80084f;
        if (zVar != null) {
            zVar.onCloseMenu(mVar, z10);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f80083e.onCloseMenu(this.f80081b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        m mVar = this.f80081b;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f80082c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f80082c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                mVar.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return mVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // p.z
    public boolean onOpenSubMenu(m mVar) {
        z zVar = this.f80084f;
        if (zVar != null) {
            return zVar.onOpenSubMenu(mVar);
        }
        return false;
    }

    public void setPresenterCallback(z zVar) {
        this.f80084f = zVar;
    }

    public void show(IBinder iBinder) {
        m mVar = this.f80081b;
        androidx.appcompat.app.l lVar = new androidx.appcompat.app.l(mVar.getContext());
        i iVar = new i(lVar.getContext(), R.layout.abc_list_menu_item_layout);
        this.f80083e = iVar;
        iVar.setCallback(this);
        mVar.addMenuPresenter(this.f80083e);
        lVar.setAdapter(this.f80083e.getAdapter(), this);
        View headerView = mVar.getHeaderView();
        if (headerView != null) {
            lVar.setCustomTitle(headerView);
        } else {
            lVar.setIcon(mVar.getHeaderIcon()).setTitle(mVar.getHeaderTitle());
        }
        lVar.setOnKeyListener(this);
        androidx.appcompat.app.m mVarCreate = lVar.create();
        this.f80082c = mVarCreate;
        mVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f80082c.getWindow().getAttributes();
        attributes.type = IronSourceError.AUCTION_ERROR_DECRYPTION;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f80082c.show();
    }
}
