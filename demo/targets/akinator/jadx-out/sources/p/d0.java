package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d0 extends c implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final q3.a f79982c;

    public d0(Context context, q3.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f79982c = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(this.f79982c.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f79982c.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = a(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.f79982c.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public void clear() {
        t1 t1Var = this.f79980b;
        if (t1Var != null) {
            t1Var.clear();
        }
        this.f79982c.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f79982c.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return a(this.f79982c.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return a(this.f79982c.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f79982c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f79982c.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f79982c.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f79982c.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        if (this.f79980b != null) {
            int i11 = 0;
            while (i11 < this.f79980b.size()) {
                if (((q3.b) this.f79980b.keyAt(i11)).getGroupId() == i10) {
                    this.f79980b.removeAt(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f79982c.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        if (this.f79980b != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f79980b.size()) {
                    break;
                }
                if (((q3.b) this.f79980b.keyAt(i11)).getItemId() == i10) {
                    this.f79980b.removeAt(i11);
                    break;
                }
                i11++;
            }
        }
        this.f79982c.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f79982c.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f79982c.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f79982c.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f79982c.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f79982c.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(this.f79982c.add(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return this.f79982c.addSubMenu(i10);
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(this.f79982c.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f79982c.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(this.f79982c.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.f79982c.addSubMenu(i10, i11, i12, i13);
    }
}
