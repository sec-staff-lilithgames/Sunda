package androidx.appcompat.app;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import o.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends o.n {

    /* renamed from: c, reason: collision with root package name */
    public d0 f4770c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4771e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4772f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4773g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t0 f4774h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(t0 t0Var, Window.Callback callback) {
        super(callback);
        this.f4774h = t0Var;
    }

    public boolean bypassDispatchKeyEvent(Window.Callback callback, KeyEvent keyEvent) {
        try {
            this.f4772f = true;
            return callback.dispatchKeyEvent(keyEvent);
        } finally {
            this.f4772f = false;
        }
    }

    public void bypassOnContentChanged(Window.Callback callback) {
        try {
            this.f4771e = true;
            callback.onContentChanged();
        } finally {
            this.f4771e = false;
        }
    }

    public void bypassOnPanelClosed(Window.Callback callback, int i10, Menu menu) {
        try {
            this.f4773g = true;
            callback.onPanelClosed(i10, menu);
        } finally {
            this.f4773g = false;
        }
    }

    @Override // o.n, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4772f ? getWrapped().dispatchKeyEvent(keyEvent) : this.f4774h.m(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.n, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            t0 t0Var = this.f4774h;
            a supportActionBar = t0Var.getSupportActionBar();
            if (supportActionBar == null || !supportActionBar.onKeyShortcut(keyCode, keyEvent)) {
                r0 r0Var = t0Var.P;
                if (r0Var == null || !t0Var.w(r0Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (t0Var.P == null) {
                        r0 r0VarR = t0Var.r(0);
                        t0Var.x(r0VarR, keyEvent);
                        boolean zW = t0Var.w(r0VarR, keyEvent.getKeyCode(), keyEvent);
                        r0VarR.f4834k = false;
                        if (zW) {
                        }
                    }
                    return false;
                }
                r0 r0Var2 = t0Var.P;
                if (r0Var2 != null) {
                    r0Var2.f4835l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // o.n, android.view.Window.Callback
    public void onContentChanged() {
        if (this.f4771e) {
            getWrapped().onContentChanged();
        }
    }

    @Override // o.n, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof p.m)) {
            return super.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // o.n, android.view.Window.Callback
    public View onCreatePanelView(int i10) {
        View viewOnCreatePanelView;
        d0 d0Var = this.f4770c;
        return (d0Var == null || (viewOnCreatePanelView = ((e1) d0Var).onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
    }

    @Override // o.n, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onMenuOpened(i10, menu);
        t0 t0Var = this.f4774h;
        if (i10 == 108) {
            a supportActionBar = t0Var.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(true);
            }
        } else {
            t0Var.getClass();
        }
        return true;
    }

    @Override // o.n, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f4773g) {
            getWrapped().onPanelClosed(i10, menu);
            return;
        }
        super.onPanelClosed(i10, menu);
        t0 t0Var = this.f4774h;
        if (i10 == 108) {
            a supportActionBar = t0Var.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            r0 r0VarR = t0Var.r(i10);
            if (r0VarR.f4836m) {
                t0Var.k(r0VarR, false);
            }
        }
    }

    @Override // o.n, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        p.m mVar = menu instanceof p.m ? (p.m) menu : null;
        if (i10 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.setOverrideVisibleItems(true);
        }
        d0 d0Var = this.f4770c;
        boolean zOnPreparePanel = d0Var != null && ((e1) d0Var).onPreparePanel(i10);
        if (!zOnPreparePanel) {
            zOnPreparePanel = super.onPreparePanel(i10, view, menu);
        }
        if (mVar != null) {
            mVar.setOverrideVisibleItems(false);
        }
        return zOnPreparePanel;
    }

    @Override // o.n, android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        p.m mVar = this.f4774h.r(0).f4831h;
        if (mVar != null) {
            super.onProvideKeyboardShortcuts(list, mVar, i10);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i10);
        }
    }

    @Override // o.n, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // o.n, android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t0 t0Var = this.f4774h;
        if (!t0Var.isHandleNativeActionModesEnabled() || i10 != 0) {
            return super.onWindowStartingActionMode(callback, i10);
        }
        g.a aVar = new g.a(t0Var.f4859m, callback);
        o.c cVarStartSupportActionMode = t0Var.startSupportActionMode(aVar);
        if (cVarStartSupportActionMode != null) {
            return aVar.getActionModeWrapper(cVarStartSupportActionMode);
        }
        return null;
    }
}
