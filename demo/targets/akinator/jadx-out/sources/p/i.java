package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i implements a0, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f80037b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f80038c;

    /* renamed from: e, reason: collision with root package name */
    public m f80039e;

    /* renamed from: f, reason: collision with root package name */
    public ExpandedMenuView f80040f;

    /* renamed from: g, reason: collision with root package name */
    public int f80041g;

    /* renamed from: h, reason: collision with root package name */
    public final int f80042h;

    /* renamed from: i, reason: collision with root package name */
    public final int f80043i;

    /* renamed from: j, reason: collision with root package name */
    public z f80044j;

    /* renamed from: k, reason: collision with root package name */
    public a f80045k;

    /* renamed from: l, reason: collision with root package name */
    public int f80046l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public int f80047b = -1;

        public a() {
            a();
        }

        public final void a() {
            i iVar = i.this;
            q expandedItem = iVar.f80039e.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<q> nonActionItems = iVar.f80039e.getNonActionItems();
                int size = nonActionItems.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (nonActionItems.get(i10) == expandedItem) {
                        this.f80047b = i10;
                        return;
                    }
                }
            }
            this.f80047b = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            i iVar = i.this;
            int size = iVar.f80039e.getNonActionItems().size() - iVar.f80041g;
            return this.f80047b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                i iVar = i.this;
                view = iVar.f80038c.inflate(iVar.f80043i, viewGroup, false);
            }
            ((b0) view).initialize(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public q getItem(int i10) {
            i iVar = i.this;
            ArrayList<q> nonActionItems = iVar.f80039e.getNonActionItems();
            int i11 = i10 + iVar.f80041g;
            int i12 = this.f80047b;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return nonActionItems.get(i11);
        }
    }

    public i(Context context, int i10) {
        this(i10, 0);
        this.f80037b = context;
        this.f80038c = LayoutInflater.from(context);
    }

    @Override // p.a0
    public boolean collapseItemActionView(m mVar, q qVar) {
        return false;
    }

    @Override // p.a0
    public boolean expandItemActionView(m mVar, q qVar) {
        return false;
    }

    @Override // p.a0
    public boolean flagActionItems() {
        return false;
    }

    public ListAdapter getAdapter() {
        if (this.f80045k == null) {
            this.f80045k = new a();
        }
        return this.f80045k;
    }

    @Override // p.a0
    public int getId() {
        return this.f80046l;
    }

    @Override // p.a0
    public c0 getMenuView(ViewGroup viewGroup) {
        if (this.f80040f == null) {
            this.f80040f = (ExpandedMenuView) this.f80038c.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f80045k == null) {
                this.f80045k = new a();
            }
            this.f80040f.setAdapter((ListAdapter) this.f80045k);
            this.f80040f.setOnItemClickListener(this);
        }
        return this.f80040f;
    }

    @Override // p.a0
    public void initForMenu(Context context, m mVar) {
        int i10 = this.f80042h;
        if (i10 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            this.f80037b = contextThemeWrapper;
            this.f80038c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f80037b != null) {
            this.f80037b = context;
            if (this.f80038c == null) {
                this.f80038c = LayoutInflater.from(context);
            }
        }
        this.f80039e = mVar;
        a aVar = this.f80045k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // p.a0
    public void onCloseMenu(m mVar, boolean z10) {
        z zVar = this.f80044j;
        if (zVar != null) {
            zVar.onCloseMenu(mVar, z10);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f80039e.performItemAction(this.f80045k.getItem(i10), this, 0);
    }

    @Override // p.a0
    public void onRestoreInstanceState(Parcelable parcelable) {
        restoreHierarchyState((Bundle) parcelable);
    }

    @Override // p.a0
    public Parcelable onSaveInstanceState() {
        if (this.f80040f == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        saveHierarchyState(bundle);
        return bundle;
    }

    @Override // p.a0
    public boolean onSubMenuSelected(i0 i0Var) {
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        new n(i0Var).show(null);
        z zVar = this.f80044j;
        if (zVar == null) {
            return true;
        }
        zVar.onOpenSubMenu(i0Var);
        return true;
    }

    public void restoreHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f80040f.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void saveHierarchyState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f80040f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // p.a0
    public void setCallback(z zVar) {
        this.f80044j = zVar;
    }

    public void setId(int i10) {
        this.f80046l = i10;
    }

    public void setItemIndexOffset(int i10) {
        this.f80041g = i10;
        if (this.f80040f != null) {
            updateMenuView(false);
        }
    }

    @Override // p.a0
    public void updateMenuView(boolean z10) {
        a aVar = this.f80045k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public i(int i10, int i11) {
        this.f80043i = i10;
        this.f80042h = i11;
    }
}
