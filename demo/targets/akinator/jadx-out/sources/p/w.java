package p;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w implements e0, a0, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Rect f80122b;

    public static int a(ListAdapter listAdapter, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public abstract void addMenu(m mVar);

    @Override // p.a0
    public boolean collapseItemActionView(m mVar, q qVar) {
        return false;
    }

    @Override // p.e0
    public abstract /* synthetic */ void dismiss();

    @Override // p.a0
    public boolean expandItemActionView(m mVar, q qVar) {
        return false;
    }

    public abstract /* synthetic */ boolean flagActionItems();

    public Rect getEpicenterBounds() {
        return this.f80122b;
    }

    @Override // p.a0
    public int getId() {
        return 0;
    }

    @Override // p.e0
    public abstract /* synthetic */ ListView getListView();

    @Override // p.a0
    public c0 getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // p.e0
    public abstract /* synthetic */ boolean isShowing();

    public abstract /* synthetic */ void onCloseMenu(m mVar, boolean z10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (j) listAdapter).f80049b.performItemAction((MenuItem) listAdapter.getItem(i10), this, !(this instanceof h) ? 0 : 4);
    }

    public abstract /* synthetic */ void onRestoreInstanceState(Parcelable parcelable);

    public abstract /* synthetic */ Parcelable onSaveInstanceState();

    public abstract /* synthetic */ boolean onSubMenuSelected(i0 i0Var);

    public abstract void setAnchorView(View view);

    public abstract /* synthetic */ void setCallback(z zVar);

    public void setEpicenterBounds(Rect rect) {
        this.f80122b = rect;
    }

    public abstract void setForceShowIcon(boolean z10);

    public abstract void setGravity(int i10);

    public abstract void setHorizontalOffset(int i10);

    public abstract void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener);

    public abstract void setShowTitle(boolean z10);

    public abstract void setVerticalOffset(int i10);

    @Override // p.e0
    public abstract /* synthetic */ void show();

    public abstract /* synthetic */ void updateMenuView(boolean z10);

    @Override // p.a0
    public void initForMenu(Context context, m mVar) {
    }
}
