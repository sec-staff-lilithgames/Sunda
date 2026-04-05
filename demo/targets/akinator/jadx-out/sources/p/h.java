package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import q.n2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends w implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public ViewTreeObserver A;
    public PopupWindow.OnDismissListener B;
    public boolean C;

    /* renamed from: c, reason: collision with root package name */
    public final Context f79991c;

    /* renamed from: e, reason: collision with root package name */
    public final int f79992e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79993f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79994g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f79995h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f79996i;

    /* renamed from: q, reason: collision with root package name */
    public View f80004q;

    /* renamed from: r, reason: collision with root package name */
    public View f80005r;

    /* renamed from: s, reason: collision with root package name */
    public int f80006s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f80007t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f80008u;

    /* renamed from: v, reason: collision with root package name */
    public int f80009v;

    /* renamed from: w, reason: collision with root package name */
    public int f80010w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f80012y;

    /* renamed from: z, reason: collision with root package name */
    public z f80013z;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f79997j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f79998k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final d f79999l = new d(this);

    /* renamed from: m, reason: collision with root package name */
    public final e f80000m = new e(this);

    /* renamed from: n, reason: collision with root package name */
    public final g f80001n = new g(this);

    /* renamed from: o, reason: collision with root package name */
    public int f80002o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f80003p = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f80011x = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final n2 f80014a;

        /* renamed from: b, reason: collision with root package name */
        public final m f80015b;

        /* renamed from: c, reason: collision with root package name */
        public final int f80016c;

        public a(n2 n2Var, m mVar, int i10) {
            this.f80014a = n2Var;
            this.f80015b = mVar;
            this.f80016c = i10;
        }

        public ListView getListView() {
            return this.f80014a.getListView();
        }
    }

    public h(Context context, View view, int i10, int i11, boolean z10) {
        this.f79991c = context;
        this.f80004q = view;
        this.f79993f = i10;
        this.f79994g = i11;
        this.f79995h = z10;
        this.f80006s = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f79992e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f79996i = new Handler();
    }

    @Override // p.w
    public void addMenu(m mVar) {
        mVar.addMenuPresenter(this, this.f79991c);
        if (isShowing()) {
            b(mVar);
        } else {
            this.f79997j.add(mVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(p.m r18) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h.b(p.m):void");
    }

    @Override // p.w, p.e0
    public void dismiss() {
        ArrayList arrayList = this.f79998k;
        int size = arrayList.size();
        if (size > 0) {
            a[] aVarArr = (a[]) arrayList.toArray(new a[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                a aVar = aVarArr[i10];
                if (aVar.f80014a.isShowing()) {
                    aVar.f80014a.dismiss();
                }
            }
        }
    }

    @Override // p.w, p.a0
    public boolean flagActionItems() {
        return false;
    }

    @Override // p.w, p.e0
    public ListView getListView() {
        ArrayList arrayList = this.f79998k;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((a) o2.e(1, arrayList)).getListView();
    }

    @Override // p.w, p.e0
    public boolean isShowing() {
        ArrayList arrayList = this.f79998k;
        return arrayList.size() > 0 && ((a) arrayList.get(0)).f80014a.isShowing();
    }

    @Override // p.w, p.a0
    public void onCloseMenu(m mVar, boolean z10) {
        ArrayList arrayList = this.f79998k;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (mVar == ((a) arrayList.get(i10)).f80015b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((a) arrayList.get(i11)).f80015b.close(false);
        }
        a aVar = (a) arrayList.remove(i10);
        m mVar2 = aVar.f80015b;
        n2 n2Var = aVar.f80014a;
        mVar2.removeMenuPresenter(this);
        if (this.C) {
            n2Var.setExitTransition(null);
            n2Var.setAnimationStyle(0);
        }
        n2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f80006s = ((a) arrayList.get(size2 - 1)).f80016c;
        } else {
            this.f80006s = this.f80004q.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((a) arrayList.get(0)).f80015b.close(false);
                return;
            }
            return;
        }
        dismiss();
        z zVar = this.f80013z;
        if (zVar != null) {
            zVar.onCloseMenu(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.A.removeGlobalOnLayoutListener(this.f79999l);
            }
            this.A = null;
        }
        this.f80005r.removeOnAttachStateChangeListener(this.f80000m);
        this.B.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        a aVar;
        ArrayList arrayList = this.f79998k;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                aVar = null;
                break;
            }
            aVar = (a) arrayList.get(i10);
            if (!aVar.f80014a.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (aVar != null) {
            aVar.f80015b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p.w, p.a0
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // p.w, p.a0
    public boolean onSubMenuSelected(i0 i0Var) {
        Iterator it = this.f79998k.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (i0Var == aVar.f80015b) {
                aVar.getListView().requestFocus();
                return true;
            }
        }
        if (!i0Var.hasVisibleItems()) {
            return false;
        }
        addMenu(i0Var);
        z zVar = this.f80013z;
        if (zVar != null) {
            zVar.onOpenSubMenu(i0Var);
        }
        return true;
    }

    @Override // p.w
    public void setAnchorView(View view) {
        if (this.f80004q != view) {
            this.f80004q = view;
            this.f80003p = x3.u.getAbsoluteGravity(this.f80002o, view.getLayoutDirection());
        }
    }

    @Override // p.w, p.a0
    public void setCallback(z zVar) {
        this.f80013z = zVar;
    }

    @Override // p.w
    public void setForceShowIcon(boolean z10) {
        this.f80011x = z10;
    }

    @Override // p.w
    public void setGravity(int i10) {
        if (this.f80002o != i10) {
            this.f80002o = i10;
            this.f80003p = x3.u.getAbsoluteGravity(i10, this.f80004q.getLayoutDirection());
        }
    }

    @Override // p.w
    public void setHorizontalOffset(int i10) {
        this.f80007t = true;
        this.f80009v = i10;
    }

    @Override // p.w
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // p.w
    public void setShowTitle(boolean z10) {
        this.f80012y = z10;
    }

    @Override // p.w
    public void setVerticalOffset(int i10) {
        this.f80008u = true;
        this.f80010w = i10;
    }

    @Override // p.w, p.e0
    public void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f79997j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b((m) it.next());
        }
        arrayList.clear();
        View view = this.f80004q;
        this.f80005r = view;
        if (view != null) {
            boolean z10 = this.A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f79999l);
            }
            this.f80005r.addOnAttachStateChangeListener(this.f80000m);
        }
    }

    @Override // p.w, p.a0
    public void updateMenuView(boolean z10) {
        Iterator it = this.f79998k.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((a) it.next()).getListView().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // p.w, p.a0
    public void onRestoreInstanceState(Parcelable parcelable) {
    }
}
