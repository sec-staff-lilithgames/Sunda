package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final m f80049b;

    /* renamed from: c, reason: collision with root package name */
    public int f80050c = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f80051e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f80052f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f80053g;

    /* renamed from: h, reason: collision with root package name */
    public final int f80054h;

    public j(m mVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f80052f = z10;
        this.f80053g = layoutInflater;
        this.f80049b = mVar;
        this.f80054h = i10;
        a();
    }

    public final void a() {
        m mVar = this.f80049b;
        q expandedItem = mVar.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<q> nonActionItems = mVar.getNonActionItems();
            int size = nonActionItems.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (nonActionItems.get(i10) == expandedItem) {
                    this.f80050c = i10;
                    return;
                }
            }
        }
        this.f80050c = -1;
    }

    public m getAdapterMenu() {
        return this.f80049b;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        boolean z10 = this.f80052f;
        m mVar = this.f80049b;
        return this.f80050c < 0 ? (z10 ? mVar.getNonActionItems() : mVar.getVisibleItems()).size() : r0.size() - 1;
    }

    public boolean getForceShowIcon() {
        return this.f80051e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f80053g.inflate(this.f80054h, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f80049b.isGroupDividerEnabled() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        b0 b0Var = (b0) view;
        if (this.f80051e) {
            listMenuItemView.setForceShowIcon(true);
        }
        b0Var.initialize(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean z10) {
        this.f80051e = z10;
    }

    @Override // android.widget.Adapter
    public q getItem(int i10) {
        boolean z10 = this.f80052f;
        m mVar = this.f80049b;
        ArrayList<q> nonActionItems = z10 ? mVar.getNonActionItems() : mVar.getVisibleItems();
        int i11 = this.f80050c;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return nonActionItems.get(i10);
    }
}
