package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p.a0;
import p.c0;
import p.i0;
import p.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public p.m f5171b;

    /* renamed from: c, reason: collision with root package name */
    public p.q f5172c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Toolbar f5173e;

    public q(Toolbar toolbar) {
        this.f5173e = toolbar;
    }

    @Override // p.a0
    public boolean collapseItemActionView(p.m mVar, p.q qVar) {
        Toolbar toolbar = this.f5173e;
        KeyEvent.Callback callback = toolbar.f5118k;
        if (callback instanceof o.d) {
            ((o.d) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f5118k);
        toolbar.removeView(toolbar.f5117j);
        toolbar.f5118k = null;
        ArrayList arrayList = toolbar.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f5172c = null;
        toolbar.requestLayout();
        qVar.setActionViewExpanded(false);
        toolbar.s();
        return true;
    }

    @Override // p.a0
    public boolean expandItemActionView(p.m mVar, p.q qVar) {
        Toolbar toolbar = this.f5173e;
        toolbar.c();
        ViewParent parent = toolbar.f5117j.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f5117j);
            }
            toolbar.addView(toolbar.f5117j);
        }
        View actionView = qVar.getActionView();
        toolbar.f5118k = actionView;
        this.f5172c = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f5118k);
            }
            Toolbar.a aVarH = Toolbar.h();
            aVarH.f4717a = (toolbar.f5123p & 112) | 8388611;
            aVarH.f5136b = 2;
            toolbar.f5118k.setLayoutParams(aVarH);
            toolbar.addView(toolbar.f5118k);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Toolbar.a) childAt.getLayoutParams()).f5136b != 2 && childAt != toolbar.f5110b) {
                toolbar.removeViewAt(childCount);
                toolbar.G.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.setActionViewExpanded(true);
        KeyEvent.Callback callback = toolbar.f5118k;
        if (callback instanceof o.d) {
            ((o.d) callback).onActionViewExpanded();
        }
        toolbar.s();
        return true;
    }

    @Override // p.a0
    public boolean flagActionItems() {
        return false;
    }

    @Override // p.a0
    public int getId() {
        return 0;
    }

    @Override // p.a0
    public c0 getMenuView(ViewGroup viewGroup) {
        return null;
    }

    @Override // p.a0
    public void initForMenu(Context context, p.m mVar) {
        p.q qVar;
        p.m mVar2 = this.f5171b;
        if (mVar2 != null && (qVar = this.f5172c) != null) {
            mVar2.collapseItemActionView(qVar);
        }
        this.f5171b = mVar;
    }

    @Override // p.a0
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // p.a0
    public boolean onSubMenuSelected(i0 i0Var) {
        return false;
    }

    @Override // p.a0
    public void updateMenuView(boolean z10) {
        if (this.f5172c != null) {
            p.m mVar = this.f5171b;
            if (mVar != null) {
                int size = mVar.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f5171b.getItem(i10) == this.f5172c) {
                        return;
                    }
                }
            }
            collapseItemActionView(this.f5171b, this.f5172c);
        }
    }

    @Override // p.a0
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // p.a0
    public void setCallback(z zVar) {
    }

    @Override // p.a0
    public void onCloseMenu(p.m mVar, boolean z10) {
    }
}
