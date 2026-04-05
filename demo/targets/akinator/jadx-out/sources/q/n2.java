package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n2 extends j2 implements k2 {
    public static final Method L;
    public k2 K;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends s1 {

        /* renamed from: o, reason: collision with root package name */
        public final int f82183o;

        /* renamed from: p, reason: collision with root package name */
        public final int f82184p;

        /* renamed from: q, reason: collision with root package name */
        public k2 f82185q;

        /* renamed from: r, reason: collision with root package name */
        public p.q f82186r;

        public a(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f82183o = 21;
                this.f82184p = 22;
            } else {
                this.f82183o = 22;
                this.f82184p = 21;
            }
        }

        public void clearSelection() {
            setSelection(-1);
        }

        @Override // q.s1, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // q.s1, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // q.s1, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // q.s1, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // q.s1
        public /* bridge */ /* synthetic */ int lookForSelectablePosition(int i10, boolean z10) {
            return super.lookForSelectablePosition(i10, z10);
        }

        @Override // q.s1
        public /* bridge */ /* synthetic */ int measureHeightOfChildrenCompat(int i10, int i11, int i12, int i13, int i14) {
            return super.measureHeightOfChildrenCompat(i10, i11, i12, i13, i14);
        }

        @Override // q.s1
        public /* bridge */ /* synthetic */ boolean onForwardedEvent(MotionEvent motionEvent, int i10) {
            return super.onForwardedEvent(motionEvent, i10);
        }

        @Override // q.s1, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            p.j jVar;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f82185q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    jVar = (p.j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (p.j) adapter;
                    headersCount = 0;
                }
                p.q item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= jVar.getCount()) ? null : jVar.getItem(i10);
                p.q qVar = this.f82186r;
                if (qVar != item) {
                    p.m adapterMenu = jVar.getAdapterMenu();
                    if (qVar != null) {
                        this.f82185q.onItemHoverExit(adapterMenu, qVar);
                    }
                    this.f82186r = item;
                    if (item != null) {
                        this.f82185q.onItemHoverEnter(adapterMenu, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f82183o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f82184p) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (p.j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (p.j) adapter).getAdapterMenu().close(false);
            return true;
        }

        @Override // q.s1, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(k2 k2Var) {
            this.f82185q = k2Var;
        }

        @Override // q.s1, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                L = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public n2(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // q.j2
    public final s1 a(Context context, boolean z10) {
        a aVar = new a(context, z10);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // q.k2
    public void onItemHoverEnter(p.m mVar, MenuItem menuItem) {
        k2 k2Var = this.K;
        if (k2Var != null) {
            k2Var.onItemHoverEnter(mVar, menuItem);
        }
    }

    @Override // q.k2
    public void onItemHoverExit(p.m mVar, MenuItem menuItem) {
        k2 k2Var = this.K;
        if (k2Var != null) {
            k2Var.onItemHoverExit(mVar, menuItem);
        }
    }

    public void setEnterTransition(Object obj) {
        l2.a(this.H, (Transition) obj);
    }

    public void setExitTransition(Object obj) {
        l2.b(this.H, (Transition) obj);
    }

    public void setHoverListener(k2 k2Var) {
        this.K = k2Var;
    }

    public void setTouchModal(boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        c0 c0Var = this.H;
        if (i10 > 28) {
            m2.a(c0Var, z10);
            return;
        }
        Method method = L;
        if (method != null) {
            try {
                method.invoke(c0Var, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
