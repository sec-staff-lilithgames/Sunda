package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import q.n2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends w implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {

    /* renamed from: c, reason: collision with root package name */
    public final Context f80017c;

    /* renamed from: e, reason: collision with root package name */
    public final m f80018e;

    /* renamed from: f, reason: collision with root package name */
    public final j f80019f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f80020g;

    /* renamed from: h, reason: collision with root package name */
    public final int f80021h;

    /* renamed from: i, reason: collision with root package name */
    public final int f80022i;

    /* renamed from: j, reason: collision with root package name */
    public final int f80023j;

    /* renamed from: k, reason: collision with root package name */
    public final n2 f80024k;

    /* renamed from: n, reason: collision with root package name */
    public PopupWindow.OnDismissListener f80027n;

    /* renamed from: o, reason: collision with root package name */
    public View f80028o;

    /* renamed from: p, reason: collision with root package name */
    public View f80029p;

    /* renamed from: q, reason: collision with root package name */
    public z f80030q;

    /* renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f80031r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f80032s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f80033t;

    /* renamed from: u, reason: collision with root package name */
    public int f80034u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f80036w;

    /* renamed from: l, reason: collision with root package name */
    public final f0 f80025l = new f0(this);

    /* renamed from: m, reason: collision with root package name */
    public final g0 f80026m = new g0(this);

    /* renamed from: v, reason: collision with root package name */
    public int f80035v = 0;

    public h0(Context context, m mVar, View view, int i10, int i11, boolean z10) {
        this.f80017c = context;
        this.f80018e = mVar;
        this.f80020g = z10;
        this.f80019f = new j(mVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f80022i = i10;
        this.f80023j = i11;
        Resources resources = context.getResources();
        this.f80021h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f80028o = view;
        this.f80024k = new n2(context, null, i10, i11);
        mVar.addMenuPresenter(this, context);
    }

    @Override // p.w, p.e0
    public void dismiss() {
        if (isShowing()) {
            this.f80024k.dismiss();
        }
    }

    @Override // p.w, p.a0
    public boolean flagActionItems() {
        return false;
    }

    @Override // p.w, p.e0
    public ListView getListView() {
        return this.f80024k.getListView();
    }

    @Override // p.w, p.e0
    public boolean isShowing() {
        return !this.f80032s && this.f80024k.isShowing();
    }

    @Override // p.w, p.a0
    public void onCloseMenu(m mVar, boolean z10) {
        if (mVar != this.f80018e) {
            return;
        }
        dismiss();
        z zVar = this.f80030q;
        if (zVar != null) {
            zVar.onCloseMenu(mVar, z10);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f80032s = true;
        this.f80018e.close();
        ViewTreeObserver viewTreeObserver = this.f80031r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f80031r = this.f80029p.getViewTreeObserver();
            }
            this.f80031r.removeGlobalOnLayoutListener(this.f80025l);
            this.f80031r = null;
        }
        this.f80029p.removeOnAttachStateChangeListener(this.f80026m);
        PopupWindow.OnDismissListener onDismissListener = this.f80027n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        boolean z10;
        if (i0Var.hasVisibleItems()) {
            y yVar = new y(this.f80017c, i0Var, this.f80029p, this.f80020g, this.f80022i, this.f80023j);
            yVar.setPresenterCallback(this.f80030q);
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = i0Var.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            yVar.setForceShowIcon(z10);
            yVar.setOnDismissListener(this.f80027n);
            this.f80027n = null;
            this.f80018e.close(false);
            n2 n2Var = this.f80024k;
            int horizontalOffset = n2Var.getHorizontalOffset();
            int verticalOffset = n2Var.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.f80035v, this.f80028o.getLayoutDirection()) & 7) == 5) {
                horizontalOffset += this.f80028o.getWidth();
            }
            if (yVar.tryShow(horizontalOffset, verticalOffset)) {
                z zVar = this.f80030q;
                if (zVar != null) {
                    zVar.onOpenSubMenu(i0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p.w
    public void setAnchorView(View view) {
        this.f80028o = view;
    }

    @Override // p.w, p.a0
    public void setCallback(z zVar) {
        this.f80030q = zVar;
    }

    @Override // p.w
    public void setForceShowIcon(boolean z10) {
        this.f80019f.setForceShowIcon(z10);
    }

    @Override // p.w
    public void setGravity(int i10) {
        this.f80035v = i10;
    }

    @Override // p.w
    public void setHorizontalOffset(int i10) {
        this.f80024k.setHorizontalOffset(i10);
    }

    @Override // p.w
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f80027n = onDismissListener;
    }

    @Override // p.w
    public void setShowTitle(boolean z10) {
        this.f80036w = z10;
    }

    @Override // p.w
    public void setVerticalOffset(int i10) {
        this.f80024k.setVerticalOffset(i10);
    }

    @Override // p.w, p.e0
    public void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (this.f80032s || (view = this.f80028o) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f80029p = view;
        n2 n2Var = this.f80024k;
        n2Var.setOnDismissListener(this);
        n2Var.setOnItemClickListener(this);
        n2Var.setModal(true);
        View view2 = this.f80029p;
        boolean z10 = this.f80031r == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f80031r = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f80025l);
        }
        view2.addOnAttachStateChangeListener(this.f80026m);
        n2Var.setAnchorView(view2);
        n2Var.setDropDownGravity(this.f80035v);
        boolean z11 = this.f80033t;
        Context context = this.f80017c;
        j jVar = this.f80019f;
        if (!z11) {
            this.f80034u = w.a(jVar, context, this.f80021h);
            this.f80033t = true;
        }
        n2Var.setContentWidth(this.f80034u);
        n2Var.setInputMethodMode(2);
        n2Var.setEpicenterBounds(getEpicenterBounds());
        n2Var.show();
        ListView listView = n2Var.getListView();
        listView.setOnKeyListener(this);
        if (this.f80036w) {
            m mVar = this.f80018e;
            if (mVar.getHeaderTitle() != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.getHeaderTitle());
                }
                frameLayout.setEnabled(false);
                listView.addHeaderView(frameLayout, null, false);
            }
        }
        n2Var.setAdapter(jVar);
        n2Var.show();
    }

    @Override // p.w, p.a0
    public void updateMenuView(boolean z10) {
        this.f80033t = false;
        j jVar = this.f80019f;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // p.w
    public void addMenu(m mVar) {
    }

    @Override // p.w, p.a0
    public void onRestoreInstanceState(Parcelable parcelable) {
    }
}
