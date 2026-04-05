package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a implements q3.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f79950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f79951b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79952c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f79953d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f79954e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f79955f;

    /* renamed from: g, reason: collision with root package name */
    public char f79956g;

    /* renamed from: i, reason: collision with root package name */
    public char f79958i;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f79960k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f79961l;

    /* renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f79962m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f79963n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f79964o;

    /* renamed from: h, reason: collision with root package name */
    public int f79957h = 4096;

    /* renamed from: j, reason: collision with root package name */
    public int f79959j = 4096;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f79965p = null;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f79966q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f79967r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f79968s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f79969t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f79961l = context;
        this.f79950a = i11;
        this.f79951b = i10;
        this.f79952c = i13;
        this.f79953d = charSequence;
    }

    public final void a() {
        Drawable drawable = this.f79960k;
        if (drawable != null) {
            if (this.f79967r || this.f79968s) {
                Drawable drawableWrap = p3.a.wrap(drawable);
                this.f79960k = drawableWrap;
                Drawable drawableMutate = drawableWrap.mutate();
                this.f79960k = drawableMutate;
                if (this.f79967r) {
                    p3.a.setTintList(drawableMutate, this.f79965p);
                }
                if (this.f79968s) {
                    p3.a.setTintMode(this.f79960k, this.f79966q);
                }
            }
        }
    }

    @Override // q3.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // q3.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // q3.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // q3.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f79959j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f79958i;
    }

    @Override // q3.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f79963n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f79951b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f79960k;
    }

    @Override // q3.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f79965p;
    }

    @Override // q3.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f79966q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f79955f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f79950a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // q3.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f79957h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f79956g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f79952c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // q3.b
    public x3.e getSupportActionProvider() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f79953d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f79954e;
        return charSequence != null ? charSequence : this.f79953d;
    }

    @Override // q3.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f79964o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public boolean invoke() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f79962m;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f79955f;
        if (intent == null) {
            return false;
        }
        this.f79961l.startActivity(intent);
        return true;
    }

    @Override // q3.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f79969t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f79969t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f79969t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f79969t & 8) == 0;
    }

    @Override // q3.b
    public boolean requiresActionButton() {
        return true;
    }

    @Override // q3.b
    public boolean requiresOverflow() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f79958i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f79969t = (z10 ? 1 : 0) | (this.f79969t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f79969t = (z10 ? 2 : 0) | (this.f79969t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f79969t = (z10 ? 16 : 0) | (this.f79969t & (-17));
        return this;
    }

    public a setExclusiveCheckable(boolean z10) {
        this.f79969t = (z10 ? 4 : 0) | (this.f79969t & (-5));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f79960k = drawable;
        a();
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f79965p = colorStateList;
        this.f79967r = true;
        a();
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f79966q = mode;
        this.f79968s = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f79955f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f79956g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f79962m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f79956g = c10;
        this.f79958i = Character.toLowerCase(c11);
        return this;
    }

    @Override // q3.b
    public q3.b setSupportActionProvider(x3.e eVar) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f79953d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f79954e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f79969t = (this.f79969t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f79958i = Character.toLowerCase(c10);
        this.f79959j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setContentDescription(CharSequence charSequence) {
        this.f79963n = charSequence;
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f79956g = c10;
        this.f79957h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f79953d = this.f79961l.getResources().getString(i10);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setTooltipText(CharSequence charSequence) {
        this.f79964o = charSequence;
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f79960k = m3.a.getDrawable(this.f79961l, i10);
        a();
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f79956g = c10;
        this.f79957h = KeyEvent.normalizeMetaState(i10);
        this.f79958i = Character.toLowerCase(c11);
        this.f79959j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // q3.b, android.view.MenuItem
    public q3.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // q3.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
