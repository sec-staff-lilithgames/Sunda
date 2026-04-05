package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import p.b0;
import p.c0;
import p.i0;
import p.y;
import q.y3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ActionMenuPresenter extends p.b implements x3.c {
    public a A;
    public b B;
    public androidx.appcompat.widget.a C;
    public final q.m D;
    public int E;

    /* renamed from: l, reason: collision with root package name */
    public c f4978l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4979m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4980n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4981o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4982p;

    /* renamed from: q, reason: collision with root package name */
    public int f4983q;

    /* renamed from: r, reason: collision with root package name */
    public int f4984r;

    /* renamed from: s, reason: collision with root package name */
    public int f4985s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4986t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4987u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4988v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4989w;

    /* renamed from: x, reason: collision with root package name */
    public int f4990x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseBooleanArray f4991y;

    /* renamed from: z, reason: collision with root package name */
    public d f4992z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new androidx.appcompat.widget.c();

        /* renamed from: b, reason: collision with root package name */
        public int f4993b;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4993b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends y {
        public a(Context context, i0 i0Var, View view) {
            super(context, i0Var, view, false, R.attr.actionOverflowMenuStyle);
            if (!((p.q) i0Var.getItem()).isActionButton()) {
                View view2 = ActionMenuPresenter.this.f4978l;
                setAnchorView(view2 == null ? (View) ActionMenuPresenter.this.f79977j : view2);
            }
            setPresenterCallback(ActionMenuPresenter.this.D);
        }

        @Override // p.y
        public final void a() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.A = null;
            actionMenuPresenter.E = 0;
            super.a();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final d f4995b;

        public b(d dVar) {
            this.f4995b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            p.m mVar = actionMenuPresenter.f79972e;
            if (mVar != null) {
                mVar.changeMenuMode();
            }
            View view = (View) actionMenuPresenter.f79977j;
            if (view != null && view.getWindowToken() != null) {
                d dVar = this.f4995b;
                if (dVar.tryShow()) {
                    actionMenuPresenter.f4992z = dVar;
                }
            }
            actionMenuPresenter.B = null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends AppCompatImageView implements q.n {
        public c(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            y3.setTooltipText(this, getContentDescription());
            setOnTouchListener(new androidx.appcompat.widget.b(this, this));
        }

        @Override // q.n
        public boolean needsDividerAfter() {
            return false;
        }

        @Override // q.n
        public boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.showOverflowMenu();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                p3.a.setHotspotBounds(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends y {
        public d(Context context, p.m mVar, View view, boolean z10) {
            super(context, mVar, view, z10, R.attr.actionOverflowMenuStyle);
            setGravity(8388613);
            setPresenterCallback(ActionMenuPresenter.this.D);
        }

        @Override // p.y
        public final void a() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            p.m mVar = actionMenuPresenter.f79972e;
            if (mVar != null) {
                mVar.close();
            }
            actionMenuPresenter.f4992z = null;
            super.a();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f4991y = new SparseBooleanArray();
        this.D = new q.m(this);
    }

    @Override // p.b
    public void bindItemView(p.q qVar, b0 b0Var) {
        b0Var.initialize(qVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) b0Var;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f79977j);
        if (this.C == null) {
            this.C = new androidx.appcompat.widget.a(this);
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    @Override // p.b
    public boolean filterLeftoverView(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f4978l) {
            return false;
        }
        viewGroup.removeViewAt(i10);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // p.b, p.a0
    public boolean flagActionItems() {
        ArrayList<p.q> visibleItems;
        int size;
        int iC;
        int i10;
        boolean z10;
        int i11;
        ActionMenuPresenter actionMenuPresenter = this;
        p.m mVar = actionMenuPresenter.f79972e;
        View view = null;
        ?? r32 = 0;
        if (mVar != null) {
            visibleItems = mVar.getVisibleItems();
            size = visibleItems.size();
        } else {
            visibleItems = null;
            size = 0;
        }
        int i12 = actionMenuPresenter.f4985s;
        int i13 = actionMenuPresenter.f4984r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f79977j;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            p.q qVar = visibleItems.get(i16);
            if (qVar.requiresActionButton()) {
                i14++;
            } else if (qVar.requestsActionButton()) {
                i15++;
            } else {
                z11 = true;
            }
            if (actionMenuPresenter.f4989w && qVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (actionMenuPresenter.f4981o && (z11 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f4991y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f4987u) {
            int i18 = actionMenuPresenter.f4990x;
            iC = i13 / i18;
            i10 = ((i13 % i18) / iC) + i18;
        } else {
            iC = 0;
            i10 = 0;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < size) {
            p.q qVar2 = visibleItems.get(i19);
            if (qVar2.requiresActionButton()) {
                View itemView = actionMenuPresenter.getItemView(qVar2, view, viewGroup);
                if (actionMenuPresenter.f4987u) {
                    iC -= ActionMenuView.c(itemView, i10, iC, iMakeMeasureSpec, r32);
                } else {
                    itemView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = itemView.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = qVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                qVar2.setIsActionButton(true);
                z10 = r32;
                i11 = size;
            } else if (qVar2.requestsActionButton()) {
                int groupId2 = qVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i17 > 0 || z12) && i13 > 0 && (!actionMenuPresenter.f4987u || iC > 0);
                boolean z14 = z13;
                i11 = size;
                if (z13) {
                    View itemView2 = actionMenuPresenter.getItemView(qVar2, null, viewGroup);
                    if (actionMenuPresenter.f4987u) {
                        int iC2 = ActionMenuView.c(itemView2, i10, iC, iMakeMeasureSpec, 0);
                        iC -= iC2;
                        if (iC2 == 0) {
                            z14 = false;
                        }
                    } else {
                        itemView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z13 = z15 & (!actionMenuPresenter.f4987u ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        p.q qVar3 = visibleItems.get(i21);
                        if (qVar3.getGroupId() == groupId2) {
                            if (qVar3.isActionButton()) {
                                i17++;
                            }
                            qVar3.setIsActionButton(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                qVar2.setIsActionButton(z13);
                z10 = false;
            } else {
                z10 = r32;
                i11 = size;
                qVar2.setIsActionButton(z10);
            }
            i19++;
            r32 = z10;
            size = i11;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // p.b
    public View getItemView(p.q qVar, View view, ViewGroup viewGroup) {
        View actionView = qVar.getActionView();
        if (actionView == null || qVar.hasCollapsibleActionView()) {
            actionView = super.getItemView(qVar, view, viewGroup);
        }
        actionView.setVisibility(qVar.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.a)) {
            actionView.setLayoutParams(ActionMenuView.a(layoutParams));
        }
        return actionView;
    }

    @Override // p.b, p.a0
    public c0 getMenuView(ViewGroup viewGroup) {
        c0 c0Var = this.f79977j;
        c0 menuView = super.getMenuView(viewGroup);
        if (c0Var != menuView) {
            ((ActionMenuView) menuView).setPresenter(this);
        }
        return menuView;
    }

    public Drawable getOverflowIcon() {
        c cVar = this.f4978l;
        if (cVar != null) {
            return cVar.getDrawable();
        }
        if (this.f4980n) {
            return this.f4979m;
        }
        return null;
    }

    public boolean hideOverflowMenu() {
        Object obj;
        b bVar = this.B;
        if (bVar != null && (obj = this.f79977j) != null) {
            ((View) obj).removeCallbacks(bVar);
            this.B = null;
            return true;
        }
        d dVar = this.f4992z;
        if (dVar == null) {
            return false;
        }
        dVar.dismiss();
        return true;
    }

    public boolean hideSubMenus() {
        a aVar = this.A;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    @Override // p.b, p.a0
    public void initForMenu(Context context, p.m mVar) {
        super.initForMenu(context, mVar);
        Resources resources = context.getResources();
        o.a aVar = o.a.get(context);
        if (!this.f4982p) {
            this.f4981o = aVar.showsOverflowMenuButton();
        }
        if (!this.f4988v) {
            this.f4983q = aVar.getEmbeddedMenuWidthLimit();
        }
        if (!this.f4986t) {
            this.f4985s = aVar.getMaxActionButtons();
        }
        int measuredWidth = this.f4983q;
        if (this.f4981o) {
            if (this.f4978l == null) {
                c cVar = new c(this.f79970b);
                this.f4978l = cVar;
                if (this.f4980n) {
                    cVar.setImageDrawable(this.f4979m);
                    this.f4979m = null;
                    this.f4980n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4978l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f4978l.getMeasuredWidth();
        } else {
            this.f4978l = null;
        }
        this.f4984r = measuredWidth;
        this.f4990x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean isOverflowMenuShowPending() {
        return this.B != null || isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowing() {
        d dVar = this.f4992z;
        return dVar != null && dVar.isShowing();
    }

    public boolean isOverflowReserved() {
        return this.f4981o;
    }

    @Override // p.b, p.a0
    public void onCloseMenu(p.m mVar, boolean z10) {
        dismissPopupMenus();
        super.onCloseMenu(mVar, z10);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f4986t) {
            this.f4985s = o.a.get(this.f79971c).getMaxActionButtons();
        }
        p.m mVar = this.f79972e;
        if (mVar != null) {
            mVar.onItemsChanged(true);
        }
    }

    @Override // p.b, p.a0
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f4993b) > 0 && (menuItemFindItem = this.f79972e.findItem(i10)) != null) {
            onSubMenuSelected((i0) menuItemFindItem.getSubMenu());
        }
    }

    @Override // p.b, p.a0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f4993b = this.E;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.b, p.a0
    public boolean onSubMenuSelected(i0 i0Var) {
        boolean z10 = false;
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        i0 i0Var2 = i0Var;
        while (i0Var2.getParentMenu() != this.f79972e) {
            i0Var2 = (i0) i0Var2.getParentMenu();
        }
        MenuItem item = i0Var2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f79977j;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof b0) && ((b0) childAt).getItemData() == item) {
                    view = childAt;
                    break;
                }
                i10++;
            }
        }
        if (view == null) {
            return false;
        }
        this.E = i0Var.getItem().getItemId();
        int size = i0Var.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            MenuItem item2 = i0Var.getItem(i11);
            if (item2.isVisible() && item2.getIcon() != null) {
                z10 = true;
                break;
            }
            i11++;
        }
        a aVar = new a(this.f79971c, i0Var, view);
        this.A = aVar;
        aVar.setForceShowIcon(z10);
        this.A.show();
        super.onSubMenuSelected(i0Var);
        return true;
    }

    @Override // x3.c
    public void onSubUiVisibilityChanged(boolean z10) {
        if (z10) {
            super.onSubMenuSelected(null);
            return;
        }
        p.m mVar = this.f79972e;
        if (mVar != null) {
            mVar.close(false);
        }
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f4989w = z10;
    }

    public void setItemLimit(int i10) {
        this.f4985s = i10;
        this.f4986t = true;
    }

    public void setMenuView(ActionMenuView actionMenuView) {
        this.f79977j = actionMenuView;
        actionMenuView.initialize(this.f79972e);
    }

    public void setOverflowIcon(Drawable drawable) {
        c cVar = this.f4978l;
        if (cVar != null) {
            cVar.setImageDrawable(drawable);
        } else {
            this.f4980n = true;
            this.f4979m = drawable;
        }
    }

    public void setReserveOverflow(boolean z10) {
        this.f4981o = z10;
        this.f4982p = true;
    }

    public void setWidthLimit(int i10, boolean z10) {
        this.f4983q = i10;
        this.f4987u = z10;
        this.f4988v = true;
    }

    @Override // p.b
    public boolean shouldIncludeItem(int i10, p.q qVar) {
        return qVar.isActionButton();
    }

    public boolean showOverflowMenu() {
        p.m mVar;
        if (!this.f4981o || isOverflowMenuShowing() || (mVar = this.f79972e) == null || this.f79977j == null || this.B != null || mVar.getNonActionItems().isEmpty()) {
            return false;
        }
        b bVar = new b(new d(this.f79971c, this.f79972e, this.f4978l, true));
        this.B = bVar;
        ((View) this.f79977j).post(bVar);
        return true;
    }

    @Override // p.b, p.a0
    public void updateMenuView(boolean z10) {
        super.updateMenuView(z10);
        ((View) this.f79977j).requestLayout();
        p.m mVar = this.f79972e;
        boolean z11 = false;
        if (mVar != null) {
            ArrayList<p.q> actionItems = mVar.getActionItems();
            int size = actionItems.size();
            for (int i10 = 0; i10 < size; i10++) {
                x3.e supportActionProvider = actionItems.get(i10).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        p.m mVar2 = this.f79972e;
        ArrayList<p.q> nonActionItems = mVar2 != null ? mVar2.getNonActionItems() : null;
        if (this.f4981o && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z11 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f4978l == null) {
                this.f4978l = new c(this.f79970b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f4978l.getParent();
            if (viewGroup != this.f79977j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f4978l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f79977j;
                actionMenuView.addView(this.f4978l, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else {
            c cVar = this.f4978l;
            if (cVar != null) {
                Object parent = cVar.getParent();
                Object obj = this.f79977j;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f4978l);
                }
            }
        }
        ((ActionMenuView) this.f79977j).setOverflowReserved(this.f4981o);
    }
}
