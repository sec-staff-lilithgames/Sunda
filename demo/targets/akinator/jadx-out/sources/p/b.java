package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final Context f79970b;

    /* renamed from: c, reason: collision with root package name */
    public Context f79971c;

    /* renamed from: e, reason: collision with root package name */
    public m f79972e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f79973f;

    /* renamed from: g, reason: collision with root package name */
    public z f79974g;

    /* renamed from: h, reason: collision with root package name */
    public final int f79975h;

    /* renamed from: i, reason: collision with root package name */
    public final int f79976i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f79977j;

    /* renamed from: k, reason: collision with root package name */
    public int f79978k;

    public b(Context context, int i10, int i11) {
        this.f79970b = context;
        this.f79973f = LayoutInflater.from(context);
        this.f79975h = i10;
        this.f79976i = i11;
    }

    public abstract void bindItemView(q qVar, b0 b0Var);

    @Override // p.a0
    public boolean collapseItemActionView(m mVar, q qVar) {
        return false;
    }

    public b0 createItemView(ViewGroup viewGroup) {
        return (b0) this.f79973f.inflate(this.f79976i, viewGroup, false);
    }

    @Override // p.a0
    public boolean expandItemActionView(m mVar, q qVar) {
        return false;
    }

    public boolean filterLeftoverView(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    @Override // p.a0
    public boolean flagActionItems() {
        return false;
    }

    public z getCallback() {
        return this.f79974g;
    }

    @Override // p.a0
    public int getId() {
        return this.f79978k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getItemView(q qVar, View view, ViewGroup viewGroup) {
        b0 b0VarCreateItemView = view instanceof b0 ? (b0) view : createItemView(viewGroup);
        bindItemView(qVar, b0VarCreateItemView);
        return (View) b0VarCreateItemView;
    }

    @Override // p.a0
    public c0 getMenuView(ViewGroup viewGroup) {
        if (this.f79977j == null) {
            c0 c0Var = (c0) this.f79973f.inflate(this.f79975h, viewGroup, false);
            this.f79977j = c0Var;
            c0Var.initialize(this.f79972e);
            updateMenuView(true);
        }
        return this.f79977j;
    }

    @Override // p.a0
    public void initForMenu(Context context, m mVar) {
        this.f79971c = context;
        LayoutInflater.from(context);
        this.f79972e = mVar;
    }

    @Override // p.a0
    public void onCloseMenu(m mVar, boolean z10) {
        z zVar = this.f79974g;
        if (zVar != null) {
            zVar.onCloseMenu(mVar, z10);
        }
    }

    @Override // p.a0
    public abstract /* synthetic */ void onRestoreInstanceState(Parcelable parcelable);

    @Override // p.a0
    public abstract /* synthetic */ Parcelable onSaveInstanceState();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [p.m] */
    @Override // p.a0
    public boolean onSubMenuSelected(i0 i0Var) {
        z zVar = this.f79974g;
        i0 i0Var2 = i0Var;
        if (zVar == null) {
            return false;
        }
        if (i0Var == null) {
            i0Var2 = this.f79972e;
        }
        return zVar.onOpenSubMenu(i0Var2);
    }

    @Override // p.a0
    public void setCallback(z zVar) {
        this.f79974g = zVar;
    }

    public void setId(int i10) {
        this.f79978k = i10;
    }

    public boolean shouldIncludeItem(int i10, q qVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.a0
    public void updateMenuView(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) this.f79977j;
        if (viewGroup == null) {
            return;
        }
        m mVar = this.f79972e;
        int i10 = 0;
        if (mVar != null) {
            mVar.flagActionItems();
            ArrayList<q> visibleItems = this.f79972e.getVisibleItems();
            int size = visibleItems.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                q qVar = visibleItems.get(i12);
                if (shouldIncludeItem(i11, qVar)) {
                    View childAt = viewGroup.getChildAt(i11);
                    q itemData = childAt instanceof b0 ? ((b0) childAt).getItemData() : null;
                    View itemView = getItemView(qVar, childAt, viewGroup);
                    if (qVar != itemData) {
                        itemView.setPressed(false);
                        itemView.jumpDrawablesToCurrentState();
                    }
                    if (itemView != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(itemView);
                        }
                        ((ViewGroup) this.f79977j).addView(itemView, i11);
                    }
                    i11++;
                }
            }
            i10 = i11;
        }
        while (i10 < viewGroup.getChildCount()) {
            if (!filterLeftoverView(viewGroup, i10)) {
                i10++;
            }
        }
    }
}
