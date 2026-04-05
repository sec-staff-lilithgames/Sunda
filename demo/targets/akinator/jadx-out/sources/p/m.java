package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m implements q3.a {
    public static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f80055a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f80056b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f80057c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f80058d;

    /* renamed from: e, reason: collision with root package name */
    public k f80059e;

    /* renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f80067m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f80068n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f80069o;

    /* renamed from: p, reason: collision with root package name */
    public View f80070p;

    /* renamed from: x, reason: collision with root package name */
    public q f80078x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f80080z;

    /* renamed from: l, reason: collision with root package name */
    public int f80066l = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f80071q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f80072r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f80073s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f80074t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f80075u = false;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f80076v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f80077w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f80079y = false;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f80060f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f80061g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f80062h = true;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f80063i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f80064j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f80065k = true;

    public m(Context context) {
        this.f80055a = context;
        this.f80056b = context.getResources();
        g(true);
    }

    public final q a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (A[i14] << 16) | (65535 & i12);
        q qVar = new q(this, i10, i11, i12, i15, charSequence, this.f80066l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f80067m;
        if (contextMenuInfo != null) {
            qVar.E = contextMenuInfo;
        }
        ArrayList arrayList = this.f80060f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((q) arrayList.get(size)).getOrdering() <= i15) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, qVar);
        onItemsChanged(true);
        return qVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f80055a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public void addMenuPresenter(a0 a0Var) {
        addMenuPresenter(a0Var, this.f80055a);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public boolean b(m mVar, q qVar) {
        k kVar = this.f80059e;
        return kVar != null && kVar.onMenuItemSelected(mVar, qVar);
    }

    public final q c(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f80076v;
        arrayList.clear();
        d(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            char alphabeticShortcut = zIsQwertyMode ? qVar.getAlphabeticShortcut() : qVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && alphabeticShortcut == '\b' && i10 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    public void changeMenuMode() {
        k kVar = this.f80059e;
        if (kVar != null) {
            kVar.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        q qVar = this.f80078x;
        if (qVar != null) {
            collapseItemActionView(qVar);
        }
        this.f80060f.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.f80071q = true;
        clear();
        clearHeader();
        this.f80077w.clear();
        this.f80071q = false;
        this.f80072r = false;
        this.f80073s = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.f80069o = null;
        this.f80068n = null;
        this.f80070p = null;
        onItemsChanged(false);
    }

    public final void close(boolean z10) {
        if (this.f80075u) {
            return;
        }
        this.f80075u = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f80077w;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                a0Var.onCloseMenu(this, z10);
            }
        }
        this.f80075u = false;
    }

    public boolean collapseItemActionView(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f80077w;
        boolean zCollapseItemActionView = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f80078x == qVar) {
            stopDispatchingItemsChanged();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zCollapseItemActionView = a0Var.collapseItemActionView(this, qVar);
                    if (zCollapseItemActionView) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.f80078x = null;
            }
        }
        return zCollapseItemActionView;
    }

    public final void d(List list, int i10, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f80060f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                q qVar = (q) arrayList.get(i11);
                if (qVar.hasSubMenu()) {
                    ((m) qVar.getSubMenu()).d(list, i10, keyEvent);
                }
                char alphabeticShortcut = zIsQwertyMode ? qVar.getAlphabeticShortcut() : qVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zIsQwertyMode ? qVar.getAlphabeticModifiers() : qVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zIsQwertyMode && alphabeticShortcut == '\b' && i10 == 67)) && qVar.isEnabled()) {
                        list.add(qVar);
                    }
                }
            }
        }
    }

    public final void e(int i10, boolean z10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f80060f;
            if (i10 >= arrayList.size()) {
                return;
            }
            arrayList.remove(i10);
            if (z10) {
                onItemsChanged(true);
            }
        }
    }

    public boolean expandItemActionView(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f80077w;
        boolean zExpandItemActionView = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zExpandItemActionView = a0Var.expandItemActionView(this, qVar);
                if (zExpandItemActionView) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.f80078x = qVar;
        }
        return zExpandItemActionView;
    }

    public final void f(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f80070p = view;
            this.f80068n = null;
            this.f80069o = null;
        } else {
            if (i10 > 0) {
                this.f80068n = this.f80056b.getText(i10);
            } else if (charSequence != null) {
                this.f80068n = charSequence;
            }
            if (i11 > 0) {
                this.f80069o = m3.a.getDrawable(getContext(), i11);
            } else if (drawable != null) {
                this.f80069o = drawable;
            }
            this.f80070p = null;
        }
        onItemsChanged(false);
    }

    public int findGroupIndex(int i10) {
        return findGroupIndex(i10, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) this.f80060f.get(i11);
            if (qVar.getItemId() == i10) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (menuItemFindItem = qVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((q) this.f80060f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    public void flagActionItems() {
        ArrayList<q> visibleItems = getVisibleItems();
        if (this.f80065k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f80077w;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zFlagActionItems = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zFlagActionItems |= a0Var.flagActionItems();
                }
            }
            ArrayList arrayList = this.f80063i;
            ArrayList arrayList2 = this.f80064j;
            if (zFlagActionItems) {
                arrayList.clear();
                arrayList2.clear();
                int size = visibleItems.size();
                for (int i10 = 0; i10 < size; i10++) {
                    q qVar = visibleItems.get(i10);
                    if (qVar.isActionButton()) {
                        arrayList.add(qVar);
                    } else {
                        arrayList2.add(qVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(getVisibleItems());
            }
            this.f80065k = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1a
            android.content.res.Resources r3 = r2.f80056b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1a
            android.content.Context r3 = r2.f80055a
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r3)
            boolean r3 = x3.a2.shouldShowMenuShortcutsWhenKeyboardPresent(r1, r3)
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r2.f80058d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m.g(boolean):void");
    }

    public ArrayList<q> getActionItems() {
        flagActionItems();
        return this.f80063i;
    }

    public String getActionViewStatesKey() {
        return "android:menu:actionviewstates";
    }

    public Context getContext() {
        return this.f80055a;
    }

    public q getExpandedItem() {
        return this.f80078x;
    }

    public Drawable getHeaderIcon() {
        return this.f80069o;
    }

    public CharSequence getHeaderTitle() {
        return this.f80068n;
    }

    public View getHeaderView() {
        return this.f80070p;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f80060f.get(i10);
    }

    public ArrayList<q> getNonActionItems() {
        flagActionItems();
        return this.f80064j;
    }

    public ArrayList<q> getVisibleItems() {
        boolean z10 = this.f80062h;
        ArrayList<q> arrayList = this.f80061g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f80060f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) arrayList2.get(i10);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f80062h = false;
        this.f80065k = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f80080z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((q) this.f80060f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.f80071q;
    }

    public boolean isGroupDividerEnabled() {
        return this.f80079y;
    }

    public boolean isQwertyMode() {
        return this.f80057c;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return c(i10, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.f80058d;
    }

    public void onItemsChanged(boolean z10) {
        if (this.f80071q) {
            this.f80072r = true;
            if (z10) {
                this.f80073s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f80062h = true;
            this.f80065k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f80077w;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                a0Var.updateMenuView(z10);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return performItemAction(findItem(i10), i11);
    }

    public boolean performItemAction(MenuItem menuItem, int i10) {
        return performItemAction(menuItem, null, i10);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        q qVarC = c(i10, keyEvent);
        boolean zPerformItemAction = qVarC != null ? performItemAction(qVarC, i11) : false;
        if ((i11 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iFindGroupIndex = findGroupIndex(i10);
        if (iFindGroupIndex >= 0) {
            ArrayList arrayList = this.f80060f;
            int size = arrayList.size() - iFindGroupIndex;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((q) arrayList.get(iFindGroupIndex)).getGroupId() != i10) {
                    break;
                }
                e(iFindGroupIndex, false);
                i11 = i12;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        e(findItemIndex(i10), true);
    }

    public void removeItemAt(int i10) {
        e(i10, true);
    }

    public void removeMenuPresenter(a0 a0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f80077w;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var2 = (a0) weakReference.get();
            if (a0Var2 == null || a0Var2 == a0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f80077w;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var = (a0) weakReference.get();
                if (a0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id2 = a0Var.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        a0Var.onRestoreInstanceState(parcelable);
                    }
                }
            }
        }
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f80077w;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a0 a0Var = (a0) weakReference.get();
            if (a0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id2 = a0Var.getId();
                if (id2 > 0 && (parcelableOnSaveInstanceState = a0Var.onSaveInstanceState()) != null) {
                    sparseArray.put(id2, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public void setCallback(k kVar) {
        this.f80059e = kVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f80067m = contextMenuInfo;
    }

    public m setDefaultShowAsAction(int i10) {
        this.f80066l = i10;
        return this;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f80060f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.getGroupId() == i10) {
                qVar.setExclusiveCheckable(z11);
                qVar.setCheckable(z10);
            }
        }
    }

    @Override // q3.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f80079y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f80060f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.getGroupId() == i10) {
                qVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        ArrayList arrayList = this.f80060f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.getGroupId() == i10) {
                int i12 = qVar.f80110y;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                qVar.f80110y = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            onItemsChanged(true);
        }
    }

    public void setOptionalIconsVisible(boolean z10) {
        this.f80074t = z10;
    }

    public void setOverrideVisibleItems(boolean z10) {
        this.f80080z = z10;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f80057c = z10;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z10) {
        if (this.f80058d == z10) {
            return;
        }
        g(z10);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f80060f.size();
    }

    public void startDispatchingItemsChanged() {
        this.f80071q = false;
        if (this.f80072r) {
            this.f80072r = false;
            onItemsChanged(this.f80073s);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.f80071q) {
            return;
        }
        this.f80071q = true;
        this.f80072r = false;
        this.f80073s = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f80056b.getString(i10));
    }

    public void addMenuPresenter(a0 a0Var, Context context) {
        this.f80077w.add(new WeakReference(a0Var));
        a0Var.initForMenu(context, this);
        this.f80065k = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f80056b.getString(i10));
    }

    public int findGroupIndex(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((q) this.f80060f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public boolean performItemAction(MenuItem menuItem, a0 a0Var, int i10) {
        q qVar = (q) menuItem;
        if (qVar == null || !qVar.isEnabled()) {
            return false;
        }
        boolean zInvoke = qVar.invoke();
        x3.e supportActionProvider = qVar.getSupportActionProvider();
        boolean z10 = supportActionProvider != null && supportActionProvider.hasSubMenu();
        if (qVar.hasCollapsibleActionView()) {
            boolean zExpandActionView = qVar.expandActionView() | zInvoke;
            if (zExpandActionView) {
                close(true);
            }
            return zExpandActionView;
        }
        if (!qVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                close(true);
            }
            return zInvoke;
        }
        if ((i10 & 4) == 0) {
            close(false);
        }
        if (!qVar.hasSubMenu()) {
            qVar.setSubMenu(new i0(getContext(), this, qVar));
        }
        i0 i0Var = (i0) qVar.getSubMenu();
        if (z10) {
            supportActionProvider.onPrepareSubMenu(i0Var);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f80077w;
        if (!copyOnWriteArrayList.isEmpty()) {
            zOnSubMenuSelected = a0Var != null ? a0Var.onSubMenuSelected(i0Var) : false;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                a0 a0Var2 = (a0) weakReference.get();
                if (a0Var2 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else if (!zOnSubMenuSelected) {
                    zOnSubMenuSelected = a0Var2.onSubMenuSelected(i0Var);
                }
            }
        }
        boolean z11 = zInvoke | zOnSubMenuSelected;
        if (!z11) {
            close(true);
        }
        return z11;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        q qVarA = a(i10, i11, i12, charSequence);
        i0 i0Var = new i0(this.f80055a, this, qVarA);
        qVarA.setSubMenu(i0Var);
        return i0Var;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f80056b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f80056b.getString(i13));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public m getRootMenu() {
        return this;
    }
}
