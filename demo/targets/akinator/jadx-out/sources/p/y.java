package p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class y implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f80124a;

    /* renamed from: b, reason: collision with root package name */
    public final m f80125b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f80126c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80127d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80128e;

    /* renamed from: f, reason: collision with root package name */
    public View f80129f;

    /* renamed from: g, reason: collision with root package name */
    public int f80130g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f80131h;

    /* renamed from: i, reason: collision with root package name */
    public z f80132i;

    /* renamed from: j, reason: collision with root package name */
    public w f80133j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f80134k;

    /* renamed from: l, reason: collision with root package name */
    public final x f80135l;

    public y(Context context, m mVar) {
        this(context, mVar, null, false, R.attr.popupMenuStyle, 0);
    }

    public void a() {
        this.f80133j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f80134k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void b(int i10, int i11, boolean z10, boolean z11) {
        w popup = getPopup();
        popup.setShowTitle(z11);
        if (z10) {
            if ((x3.u.getAbsoluteGravity(this.f80130g, this.f80129f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f80129f.getWidth();
            }
            popup.setHorizontalOffset(i10);
            popup.setVerticalOffset(i11);
            int i12 = (int) ((this.f80124a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.setEpicenterBounds(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        popup.show();
    }

    @Override // p.o
    public void dismiss() {
        if (isShowing()) {
            this.f80133j.dismiss();
        }
    }

    public int getGravity() {
        return this.f80130g;
    }

    public ListView getListView() {
        return getPopup().getListView();
    }

    public w getPopup() {
        w h0Var;
        if (this.f80133j == null) {
            Context context = this.f80124a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                h0Var = new h(this.f80124a, this.f80129f, this.f80127d, this.f80128e, this.f80126c);
            } else {
                h0Var = new h0(this.f80124a, this.f80125b, this.f80129f, this.f80127d, this.f80128e, this.f80126c);
            }
            h0Var.addMenu(this.f80125b);
            h0Var.setOnDismissListener(this.f80135l);
            h0Var.setAnchorView(this.f80129f);
            h0Var.setCallback(this.f80132i);
            h0Var.setForceShowIcon(this.f80131h);
            h0Var.setGravity(this.f80130g);
            this.f80133j = h0Var;
        }
        return this.f80133j;
    }

    public boolean isShowing() {
        w wVar = this.f80133j;
        return wVar != null && wVar.isShowing();
    }

    public void setAnchorView(View view) {
        this.f80129f = view;
    }

    public void setForceShowIcon(boolean z10) {
        this.f80131h = z10;
        w wVar = this.f80133j;
        if (wVar != null) {
            wVar.setForceShowIcon(z10);
        }
    }

    public void setGravity(int i10) {
        this.f80130g = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f80134k = onDismissListener;
    }

    @Override // p.o
    public void setPresenterCallback(z zVar) {
        this.f80132i = zVar;
        w wVar = this.f80133j;
        if (wVar != null) {
            wVar.setCallback(zVar);
        }
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.f80129f == null) {
            return false;
        }
        b(0, 0, false, false);
        return true;
    }

    public y(Context context, m mVar, View view) {
        this(context, mVar, view, false, R.attr.popupMenuStyle, 0);
    }

    public y(Context context, m mVar, View view, boolean z10, int i10) {
        this(context, mVar, view, z10, i10, 0);
    }

    public void show(int i10, int i11) {
        if (!tryShow(i10, i11)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public y(Context context, m mVar, View view, boolean z10, int i10, int i11) {
        this.f80130g = 8388611;
        this.f80135l = new x(this);
        this.f80124a = context;
        this.f80125b = mVar;
        this.f80129f = view;
        this.f80126c = z10;
        this.f80127d = i10;
        this.f80128e = i11;
    }

    public boolean tryShow(int i10, int i11) {
        if (isShowing()) {
            return true;
        }
        if (this.f80129f == null) {
            return false;
        }
        b(i10, i11, true, true);
        return true;
    }
}
