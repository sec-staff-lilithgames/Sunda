package c2;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import i1.j;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final kv.a f11742a;

    /* renamed from: b, reason: collision with root package name */
    public j f11743b;

    /* renamed from: c, reason: collision with root package name */
    public kv.a f11744c;

    /* renamed from: d, reason: collision with root package name */
    public kv.a f11745d;

    /* renamed from: e, reason: collision with root package name */
    public kv.a f11746e;

    /* renamed from: f, reason: collision with root package name */
    public kv.a f11747f;

    public d() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final void a(Menu menu, c cVar, kv.a aVar) {
        if (aVar != null && menu.findItem(cVar.getId()) == null) {
            addMenuItem$ui_release(menu, cVar);
        } else {
            if (aVar != null || menu.findItem(cVar.getId()) == null) {
                return;
            }
            menu.removeItem(cVar.getId());
        }
    }

    public final void addMenuItem$ui_release(Menu menu, c item) {
        e0.checkNotNullParameter(menu, "menu");
        e0.checkNotNullParameter(item, "item");
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    public final kv.a getOnActionModeDestroy() {
        return this.f11742a;
    }

    public final kv.a getOnCopyRequested() {
        return this.f11744c;
    }

    public final kv.a getOnCutRequested() {
        return this.f11746e;
    }

    public final kv.a getOnPasteRequested() {
        return this.f11745d;
    }

    public final kv.a getOnSelectAllRequested() {
        return this.f11747f;
    }

    public final j getRect() {
        return this.f11743b;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        e0.checkNotNull(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == c.Copy.getId()) {
            kv.a aVar = this.f11744c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == c.Paste.getId()) {
            kv.a aVar2 = this.f11745d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == c.Cut.getId()) {
            kv.a aVar3 = this.f11746e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else {
            if (itemId != c.SelectAll.getId()) {
                return false;
            }
            kv.a aVar4 = this.f11747f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (this.f11744c != null) {
            addMenuItem$ui_release(menu, c.Copy);
        }
        if (this.f11745d != null) {
            addMenuItem$ui_release(menu, c.Paste);
        }
        if (this.f11746e != null) {
            addMenuItem$ui_release(menu, c.Cut);
        }
        if (this.f11747f == null) {
            return true;
        }
        addMenuItem$ui_release(menu, c.SelectAll);
        return true;
    }

    public final void onDestroyActionMode() {
        kv.a aVar = this.f11742a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnCopyRequested(kv.a aVar) {
        this.f11744c = aVar;
    }

    public final void setOnCutRequested(kv.a aVar) {
        this.f11746e = aVar;
    }

    public final void setOnPasteRequested(kv.a aVar) {
        this.f11745d = aVar;
    }

    public final void setOnSelectAllRequested(kv.a aVar) {
        this.f11747f = aVar;
    }

    public final void setRect(j jVar) {
        e0.checkNotNullParameter(jVar, "<set-?>");
        this.f11743b = jVar;
    }

    public final void updateMenuItems$ui_release(Menu menu) {
        e0.checkNotNullParameter(menu, "menu");
        a(menu, c.Copy, this.f11744c);
        a(menu, c.Paste, this.f11745d);
        a(menu, c.Cut, this.f11746e);
        a(menu, c.SelectAll, this.f11747f);
    }

    public d(kv.a aVar, j rect, kv.a aVar2, kv.a aVar3, kv.a aVar4, kv.a aVar5) {
        e0.checkNotNullParameter(rect, "rect");
        this.f11742a = aVar;
        this.f11743b = rect;
        this.f11744c = aVar2;
        this.f11745d = aVar3;
        this.f11746e = aVar4;
        this.f11747f = aVar5;
    }

    public /* synthetic */ d(kv.a aVar, j jVar, kv.a aVar2, kv.a aVar3, kv.a aVar4, kv.a aVar5, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? j.f59349e.getZero() : jVar, (i10 & 4) != 0 ? null : aVar2, (i10 & 8) != 0 ? null : aVar3, (i10 & 16) != 0 ? null : aVar4, (i10 & 32) != 0 ? null : aVar5);
    }
}
