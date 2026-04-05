package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements q3.b {
    public View A;
    public x3.e B;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo E;

    /* renamed from: a, reason: collision with root package name */
    public final int f80086a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80087b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80088c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80089d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f80090e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f80091f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f80092g;

    /* renamed from: h, reason: collision with root package name */
    public char f80093h;

    /* renamed from: j, reason: collision with root package name */
    public char f80095j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f80097l;

    /* renamed from: n, reason: collision with root package name */
    public final m f80099n;

    /* renamed from: o, reason: collision with root package name */
    public i0 f80100o;

    /* renamed from: p, reason: collision with root package name */
    public Runnable f80101p;

    /* renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f80102q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f80103r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f80104s;

    /* renamed from: z, reason: collision with root package name */
    public int f80111z;

    /* renamed from: i, reason: collision with root package name */
    public int f80094i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f80096k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f80098m = 0;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f80105t = null;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f80106u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f80107v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f80108w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f80109x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f80110y = 16;
    public boolean D = false;

    public q(m mVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f80099n = mVar;
        this.f80086a = i11;
        this.f80087b = i10;
        this.f80088c = i12;
        this.f80089d = i13;
        this.f80090e = charSequence;
        this.f80111z = i14;
    }

    public static void a(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public void actionFormatChanged() {
        m mVar = this.f80099n;
        mVar.f80065k = true;
        mVar.onItemsChanged(true);
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f80109x && (this.f80107v || this.f80108w)) {
            drawable = p3.a.wrap(drawable).mutate();
            if (this.f80107v) {
                p3.a.setTintList(drawable, this.f80105t);
            }
            if (this.f80108w) {
                p3.a.setTintMode(drawable, this.f80106u);
            }
            this.f80109x = false;
        }
        return drawable;
    }

    @Override // q3.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f80111z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f80099n.collapseItemActionView(this);
        }
        return false;
    }

    @Override // q3.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!hasCollapsibleActionView()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f80099n.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // q3.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        x3.e eVar = this.B;
        if (eVar == null) {
            return null;
        }
        View viewOnCreateActionView = eVar.onCreateActionView(this);
        this.A = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // q3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f80096k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f80095j;
    }

    @Override // q3.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f80103r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f80087b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f80097l;
        if (drawable != null) {
            return b(drawable);
        }
        if (this.f80098m == 0) {
            return null;
        }
        Drawable drawable2 = l.a.getDrawable(this.f80099n.getContext(), this.f80098m);
        this.f80098m = 0;
        this.f80097l = drawable2;
        return b(drawable2);
    }

    @Override // q3.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f80105t;
    }

    @Override // q3.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f80106u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f80092g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f80086a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // q3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f80094i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f80093h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f80088c;
    }

    public int getOrdering() {
        return this.f80089d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f80100o;
    }

    @Override // q3.b
    public x3.e getSupportActionProvider() {
        return this.B;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f80090e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f80091f;
        return charSequence != null ? charSequence : this.f80090e;
    }

    @Override // q3.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f80104s;
    }

    public boolean hasCollapsibleActionView() {
        x3.e eVar;
        if ((this.f80111z & 8) != 0) {
            if (this.A == null && (eVar = this.B) != null) {
                this.A = eVar.onCreateActionView(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f80100o != null;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f80102q;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(this)) {
            m mVar = this.f80099n;
            if (!mVar.b(mVar, this)) {
                Runnable runnable = this.f80101p;
                if (runnable != null) {
                    runnable.run();
                    return true;
                }
                if (this.f80092g != null) {
                    try {
                        mVar.getContext().startActivity(this.f80092g);
                        return true;
                    } catch (ActivityNotFoundException e10) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                    }
                }
                x3.e eVar = this.B;
                if (eVar == null || !eVar.onPerformDefaultAction()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isActionButton() {
        return (this.f80110y & 32) == 32;
    }

    @Override // q3.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f80110y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f80110y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f80110y & 16) != 0;
    }

    public boolean isExclusiveCheckable() {
        return (this.f80110y & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        x3.e eVar = this.B;
        return (eVar == null || !eVar.overridesItemVisibility()) ? (this.f80110y & 8) == 0 : (this.f80110y & 8) == 0 && this.B.isVisible();
    }

    public boolean requestsActionButton() {
        return (this.f80111z & 1) == 1;
    }

    @Override // q3.b
    public boolean requiresActionButton() {
        return (this.f80111z & 2) == 2;
    }

    @Override // q3.b
    public boolean requiresOverflow() {
        return (requiresActionButton() || requestsActionButton()) ? false : true;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public void setActionViewExpanded(boolean z10) {
        this.D = z10;
        this.f80099n.onItemsChanged(false);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f80095j == c10) {
            return this;
        }
        this.f80095j = Character.toLowerCase(c10);
        this.f80099n.onItemsChanged(false);
        return this;
    }

    public MenuItem setCallback(Runnable runnable) {
        this.f80101p = runnable;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f80110y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f80110y = i11;
        if (i10 != i11) {
            this.f80099n.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        int i10 = this.f80110y;
        int i11 = i10 & 4;
        m mVar = this.f80099n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f80110y = i12;
            if (i10 != i12) {
                mVar.onItemsChanged(false);
            }
            return this;
        }
        int groupId = getGroupId();
        ArrayList arrayList = mVar.f80060f;
        int size = arrayList.size();
        mVar.stopDispatchingItemsChanged();
        for (int i13 = 0; i13 < size; i13++) {
            q qVar = (q) arrayList.get(i13);
            if (qVar.getGroupId() == groupId && qVar.isExclusiveCheckable() && qVar.isCheckable()) {
                boolean z11 = qVar == this;
                int i14 = qVar.f80110y;
                int i15 = (z11 ? 2 : 0) | (i14 & (-3));
                qVar.f80110y = i15;
                if (i14 != i15) {
                    qVar.f80099n.onItemsChanged(false);
                }
            }
        }
        mVar.startDispatchingItemsChanged();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f80110y |= 16;
        } else {
            this.f80110y &= -17;
        }
        this.f80099n.onItemsChanged(false);
        return this;
    }

    public void setExclusiveCheckable(boolean z10) {
        this.f80110y = (z10 ? 4 : 0) | (this.f80110y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f80098m = 0;
        this.f80097l = drawable;
        this.f80109x = true;
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f80105t = colorStateList;
        this.f80107v = true;
        this.f80109x = true;
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f80106u = mode;
        this.f80108w = true;
        this.f80109x = true;
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f80092g = intent;
        return this;
    }

    public void setIsActionButton(boolean z10) {
        if (z10) {
            this.f80110y |= 32;
        } else {
            this.f80110y &= -33;
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f80093h == c10) {
            return this;
        }
        this.f80093h = c10;
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f80102q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f80093h = c10;
        this.f80095j = Character.toLowerCase(c11);
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f80111z = i10;
        m mVar = this.f80099n;
        mVar.f80065k = true;
        mVar.onItemsChanged(true);
    }

    public void setSubMenu(i0 i0Var) {
        this.f80100o = i0Var;
        i0Var.setHeaderTitle(getTitle());
    }

    @Override // q3.b
    public q3.b setSupportActionProvider(x3.e eVar) {
        x3.e eVar2 = this.B;
        if (eVar2 != null) {
            eVar2.reset();
        }
        this.A = null;
        this.B = eVar;
        this.f80099n.onItemsChanged(true);
        x3.e eVar3 = this.B;
        if (eVar3 != null) {
            eVar3.setVisibilityListener(new p(this));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f80090e = charSequence;
        this.f80099n.onItemsChanged(false);
        i0 i0Var = this.f80100o;
        if (i0Var != null) {
            i0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f80091f = charSequence;
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        int i10 = this.f80110y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f80110y = i11;
        if (i10 != i11) {
            m mVar = this.f80099n;
            mVar.f80062h = true;
            mVar.onItemsChanged(true);
        }
        return this;
    }

    public boolean shouldShowIcon() {
        return this.f80099n.f80074t;
    }

    public boolean showsTextAsAction() {
        return (this.f80111z & 4) == 4;
    }

    public String toString() {
        CharSequence charSequence = this.f80090e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setContentDescription(CharSequence charSequence) {
        this.f80103r = charSequence;
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setTooltipText(CharSequence charSequence) {
        this.f80104s = charSequence;
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f80086a) > 0) {
            view.setId(i10);
        }
        m mVar = this.f80099n;
        mVar.f80065k = true;
        mVar.onItemsChanged(true);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f80095j == c10 && this.f80096k == i10) {
            return this;
        }
        this.f80095j = Character.toLowerCase(c10);
        this.f80096k = KeyEvent.normalizeMetaState(i10);
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f80093h == c10 && this.f80094i == i10) {
            return this;
        }
        this.f80093h = c10;
        this.f80094i = KeyEvent.normalizeMetaState(i10);
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f80093h = c10;
        this.f80094i = KeyEvent.normalizeMetaState(i10);
        this.f80095j = Character.toLowerCase(c11);
        this.f80096k = KeyEvent.normalizeMetaState(i11);
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f80097l = null;
        this.f80098m = i10;
        this.f80109x = true;
        this.f80099n.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f80099n.getContext().getString(i10));
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setActionView(int i10) {
        Context context = this.f80099n.getContext();
        setActionView(LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false));
        return this;
    }
}
