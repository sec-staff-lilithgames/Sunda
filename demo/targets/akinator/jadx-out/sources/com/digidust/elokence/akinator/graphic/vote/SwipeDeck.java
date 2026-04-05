package com.digidust.elokence.akinator.graphic.vote;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.FrameLayout;
import ja.a;
import ja.b;
import ja.c;
import ja.d;
import ja.e;
import ja.i;
import java.util.ArrayList;
import java.util.Iterator;
import o9.ba;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class SwipeDeck extends FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public static int f21797t;

    /* renamed from: b, reason: collision with root package name */
    public final float f21798b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21799c;

    /* renamed from: e, reason: collision with root package name */
    public final float f21800e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21801f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21802g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21803h;

    /* renamed from: i, reason: collision with root package name */
    public final int f21804i;

    /* renamed from: j, reason: collision with root package name */
    public final int f21805j;

    /* renamed from: k, reason: collision with root package name */
    public e f21806k;

    /* renamed from: l, reason: collision with root package name */
    public Adapter f21807l;

    /* renamed from: m, reason: collision with root package name */
    public a f21808m;

    /* renamed from: n, reason: collision with root package name */
    public int f21809n;

    /* renamed from: o, reason: collision with root package name */
    public i f21810o;

    /* renamed from: p, reason: collision with root package name */
    public int f21811p;

    /* renamed from: q, reason: collision with root package name */
    public int f21812q;

    /* renamed from: r, reason: collision with root package name */
    public int f21813r;

    /* renamed from: s, reason: collision with root package name */
    public final int f21814s;

    public SwipeDeck(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21802g = true;
        this.f21809n = 0;
        this.f21814s = 160;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, la.a.f72710b, 0, 0);
        try {
            f21797t = typedArrayObtainStyledAttributes.getInt(1, 3);
            this.f21798b = typedArrayObtainStyledAttributes.getFloat(5, 15.0f);
            this.f21799c = typedArrayObtainStyledAttributes.getDimension(0, 15.0f);
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(4, true);
            this.f21800e = typedArrayObtainStyledAttributes.getFloat(2, 0.33f);
            typedArrayObtainStyledAttributes.recycle();
            this.f21805j = getPaddingBottom();
            this.f21801f = getPaddingLeft();
            this.f21803h = getPaddingRight();
            this.f21804i = getPaddingTop();
            setClipToPadding(false);
            setClipChildren(false);
            setWillNotDraw(false);
            if (z10) {
                z1.setTranslationZ(this, Float.MAX_VALUE);
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a() {
        int i10 = this.f21809n;
        int count = this.f21807l.getCount();
        int i11 = this.f21801f;
        int i12 = this.f21804i;
        if (i10 < count) {
            View view = this.f21807l.getView(this.f21809n, null, this);
            if (this.f21802g) {
                view.setLayerType(2, null);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            view.setY(i12);
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                arrayList.add(getChildAt(i13));
            }
            removeAllViews();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                addViewInLayout(view2, -1, layoutParams, true);
                view2.measure((getWidth() - (this.f21803h + i11)) | 1073741824, (getHeight() - (this.f21805j + i12)) | 1073741824);
                int i14 = this.f21811p;
                if (i14 != 0) {
                    view.findViewById(i14).setAlpha(0.0f);
                }
                int i15 = this.f21812q;
                if (i15 != 0) {
                    view.findViewById(i15).setAlpha(0.0f);
                }
                int i16 = this.f21813r;
                if (i16 != 0) {
                    view.findViewById(i16).setAlpha(0.0f);
                }
            }
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                getChildAt(i17).setTranslationZ(i17 * 10);
            }
            this.f21809n++;
        }
        View childAt = getChildAt(getChildCount() - ((getChildCount() - f21797t) + 1));
        if (childAt != null) {
            b bVar = new b(this);
            i iVar = new i();
            iVar.f69210b = 15.0f;
            iVar.f69211c = 0.33f;
            iVar.f69225r = true;
            iVar.f69219l = childAt;
            iVar.f69212e = i11;
            iVar.f69213f = i12;
            iVar.f69220m = bVar;
            iVar.f69217j = (ViewGroup) childAt.getParent();
            iVar.f69210b = this.f21798b;
            iVar.f69211c = this.f21800e;
            iVar.f69218k = ((ViewGroup) childAt.getParent()).getPaddingLeft();
            this.f21810o = iVar;
            int i18 = this.f21812q;
            View viewFindViewById = i18 != 0 ? childAt.findViewById(i18) : null;
            int i19 = this.f21811p;
            View viewFindViewById2 = i19 != 0 ? childAt.findViewById(i19) : null;
            int i20 = this.f21813r;
            View viewFindViewById3 = i20 != 0 ? childAt.findViewById(i20) : null;
            i iVar2 = this.f21810o;
            iVar2.f69223p = viewFindViewById2;
            iVar2.f69222o = viewFindViewById;
            iVar2.f69224q = viewFindViewById3;
            childAt.setOnTouchListener(iVar2);
        }
    }

    public final void b(int i10) {
        View childAt = getChildAt(i10);
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int width = (getWidth() - measuredWidth) / 2;
        int i11 = this.f21804i;
        childAt.layout(width, i11, measuredWidth + width, measuredHeight + i11);
        float childCount = getChildCount() - 1;
        float f10 = this.f21799c;
        childAt.animate().setDuration(160L).y(i11 + ((int) ((childCount * f10) - (i10 * f10))));
    }

    public final void c() {
        View childAt = getChildAt(getChildCount() - ((getChildCount() - f21797t) + 1));
        if (childAt != null) {
            childAt.setOnTouchListener(null);
            this.f21810o = null;
            new d(this, 0).execute(childAt);
        }
    }

    public View getSelectedView() {
        throw new UnsupportedOperationException("Not supported");
    }

    public int getTopCardItemPos() {
        return this.f21809n - getChildCount();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Adapter adapter = this.f21807l;
        if (adapter == null || adapter.getCount() == 0) {
            this.f21809n = 0;
            removeAllViewsInLayout();
            return;
        }
        for (int childCount = getChildCount(); childCount < f21797t; childCount++) {
            a();
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            b(i14);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    public void setAdapter(Adapter adapter) {
        Adapter adapter2 = this.f21807l;
        if (adapter2 != null) {
            adapter2.unregisterDataSetObserver(this.f21808m);
        }
        this.f21807l = adapter;
        this.f21809n = 0;
        a aVar = new a(this);
        this.f21808m = aVar;
        adapter.registerDataSetObserver(aVar);
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setBottomImage(int i10) {
        this.f21813r = i10;
    }

    public void setEventCallback(e eVar) {
        this.f21806k = eVar;
    }

    public void setHardwareAccelerationEnabled(Boolean bool) {
        this.f21802g = bool.booleanValue();
    }

    public void setLeftImage(int i10) {
        this.f21811p = i10;
    }

    public void setRightImage(int i10) {
        this.f21812q = i10;
    }

    public void setSelection(int i10) {
        if (i10 < this.f21807l.getCount()) {
            this.f21809n = i10;
            removeAllViews();
            requestLayout();
        }
    }

    public void swipeTopCardBottom(int i10) {
        if (getChildCount() <= 0 || getChildCount() >= f21797t + 1) {
            return;
        }
        this.f21810o.f69219l.animate().setDuration(i10).alpha(0.0f);
        int childCount = this.f21809n - getChildCount();
        c();
        e eVar = this.f21806k;
        if (eVar != null) {
            ((ba) eVar).cardSwipedBottom(childCount);
        }
        a();
    }

    public void swipeTopCardLeft(int i10) {
        if (getChildCount() <= 0 || getChildCount() >= f21797t + 1) {
            return;
        }
        this.f21810o.a(i10);
        int childCount = this.f21809n - getChildCount();
        c();
        e eVar = this.f21806k;
        if (eVar != null) {
            ((ba) eVar).cardSwipedLeft(childCount);
        }
        a();
    }

    public void swipeTopCardRight(int i10) {
        if (getChildCount() <= 0 || getChildCount() >= f21797t + 1) {
            return;
        }
        this.f21810o.b(i10);
        int childCount = this.f21809n - getChildCount();
        c();
        e eVar = this.f21806k;
        if (eVar != null) {
            ((ba) eVar).cardSwipedRight(childCount);
        }
        a();
    }

    public void setPositionCallback(c cVar) {
    }
}
