package com.bytedance.adsdk.ugeno.xyk;

import a.b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import j1.o2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends ViewGroup {

    /* renamed from: au, reason: collision with root package name */
    private Scroller f17970au;
    private cm cgn;

    /* renamed from: cm, reason: collision with root package name */
    int f17971cm;
    private int cql;

    /* renamed from: dm, reason: collision with root package name */
    private float f17972dm;

    /* renamed from: dn, reason: collision with root package name */
    private boolean f17973dn;

    /* renamed from: dt, reason: collision with root package name */
    private int f17974dt;
    private float duq;

    /* renamed from: ef, reason: collision with root package name */
    private float f17975ef;

    /* renamed from: et, reason: collision with root package name */
    private my f17976et;
    private EdgeEffect fy;
    private cm hks;
    private boolean hmu;
    private int hna;
    private EdgeEffect huv;

    /* renamed from: hx, reason: collision with root package name */
    private int f17977hx;

    /* renamed from: ic, reason: collision with root package name */
    private boolean f17978ic;

    /* renamed from: if, reason: not valid java name */
    private ClassLoader f44if;

    /* renamed from: ii, reason: collision with root package name */
    private int f17979ii;
    private List<cm> jkt;
    private int jpo;

    /* renamed from: jr, reason: collision with root package name */
    private int f17980jr;

    /* renamed from: ju, reason: collision with root package name */
    private Parcelable f17981ju;
    private int kln;
    private float nmd;

    /* renamed from: nq, reason: collision with root package name */
    private boolean f17982nq;
    private float nzb;
    private int opi;
    private ArrayList<View> ota;
    private boolean oya;
    private boolean pdm;

    /* renamed from: pe, reason: collision with root package name */
    private int f17983pe;
    private jj prr;

    /* renamed from: qk, reason: collision with root package name */
    private final ArrayList<jd> f17984qk;
    private final Runnable ree;
    private int roc;

    /* renamed from: rq, reason: collision with root package name */
    private float f17985rq;

    /* renamed from: rv, reason: collision with root package name */
    private boolean f17986rv;
    private List<Object> rxq;
    private int sbx;

    /* renamed from: se, reason: collision with root package name */
    private boolean f17987se;

    /* renamed from: sq, reason: collision with root package name */
    private Drawable f17988sq;
    private int sz;
    private int tic;

    /* renamed from: tu, reason: collision with root package name */
    private int f17989tu;

    /* renamed from: uu, reason: collision with root package name */
    private int f17990uu;

    /* renamed from: va, reason: collision with root package name */
    private VelocityTracker f17991va;
    private int voc;
    private int vrc;
    private boolean wcn;
    com.bytedance.adsdk.ugeno.xyk.jd wqx;
    private int xk;
    private final jd xyk;

    /* renamed from: ya, reason: collision with root package name */
    private boolean f17992ya;

    /* renamed from: yd, reason: collision with root package name */
    private int f17993yd;
    private final Rect zz;

    /* renamed from: jd, reason: collision with root package name */
    static final int[] f17968jd = {R.attr.layout_gravity};
    private static final Comparator<jd> my = new Comparator<jd>() { // from class: com.bytedance.adsdk.ugeno.xyk.wqx.1
        @Override // java.util.Comparator
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public int compare(jd jdVar, jd jdVar2) {
            return jdVar.f17995jd - jdVar2.f17995jd;
        }
    };

    /* renamed from: jj, reason: collision with root package name */
    private static final Interpolator f17969jj = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.xyk.wqx.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final xyk wad = new xyk();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface cm {
        /* renamed from: if */
        void mo390if(int i10);

        void jpo(int i10, float f10, int i11);

        void ju(int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd {

        /* renamed from: cm, reason: collision with root package name */
        float f17994cm;

        /* renamed from: jd, reason: collision with root package name */
        int f17995jd;
        Object jpo;
        float my;
        boolean wqx;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jj extends DataSetObserver {
        public jj() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            wqx.this.jd();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            wqx.this.jd();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface jpo {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface my {
        void jpo(View view, float f10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class qk extends com.bytedance.adsdk.ugeno.xyk.jpo {
        public static final Parcelable.Creator<qk> CREATOR = new Parcelable.ClassLoaderCreator<qk>() { // from class: com.bytedance.adsdk.ugeno.xyk.wqx.qk.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public qk createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new qk(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public qk createFromParcel(Parcel parcel) {
                return new qk(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public qk[] newArray(int i10) {
                return new qk[i10];
            }
        };

        /* renamed from: cm, reason: collision with root package name */
        ClassLoader f17996cm;

        /* renamed from: jd, reason: collision with root package name */
        int f17997jd;
        Parcelable wqx;

        public qk(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return b.f(this.f17997jd, "}", sb2);
        }

        @Override // com.bytedance.adsdk.ugeno.xyk.jpo, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f17997jd);
            parcel.writeParcelable(this.wqx, i10);
        }

        public qk(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f17997jd = parcel.readInt();
            this.wqx = parcel.readParcelable(classLoader);
            this.f17996cm = classLoader;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class xyk implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            C0068wqx c0068wqx = (C0068wqx) view.getLayoutParams();
            C0068wqx c0068wqx2 = (C0068wqx) view2.getLayoutParams();
            boolean z10 = c0068wqx.jpo;
            return z10 != c0068wqx2.jpo ? z10 ? 1 : -1 : c0068wqx.my - c0068wqx2.my;
        }
    }

    public wqx(Context context) {
        super(context);
        this.f17984qk = new ArrayList<>();
        this.xyk = new jd();
        this.zz = new Rect();
        this.f17993yd = -1;
        this.f17981ju = null;
        this.f44if = null;
        this.nmd = -3.4028235E38f;
        this.f17985rq = Float.MAX_VALUE;
        this.f17977hx = 1;
        this.tic = -1;
        this.f17992ya = true;
        this.wcn = false;
        this.ree = new Runnable() { // from class: com.bytedance.adsdk.ugeno.xyk.wqx.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                wqx.this.setScrollState(0);
                wqx.this.wqx();
            }
        };
        this.voc = 0;
        jpo();
    }

    private boolean cm(int i10) {
        if (this.f17984qk.size() == 0) {
            if (this.f17992ya) {
                return false;
            }
            this.f17973dn = false;
            jpo(0, 0.0f, 0);
            if (this.f17973dn) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        jd jdVarZz = zz();
        int clientWidth = getClientWidth();
        int i11 = this.hna;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = jdVarZz.f17995jd;
        float f11 = ((i10 / f10) - jdVarZz.my) / (jdVarZz.f17994cm + (i11 / f10));
        this.f17973dn = false;
        jpo(i13, f11, (int) (i12 * f11));
        if (this.f17973dn) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void jj() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((C0068wqx) getChildAt(i10).getLayoutParams()).jpo) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void my(int i10) {
        cm cmVar = this.cgn;
        if (cmVar != null) {
            cmVar.ju(i10);
        }
        List<cm> list = this.jkt;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                cm cmVar2 = this.jkt.get(i11);
                if (cmVar2 != null) {
                    cmVar2.ju(i10);
                }
            }
        }
        cm cmVar3 = this.hks;
        if (cmVar3 != null) {
            cmVar3.ju(i10);
        }
    }

    private void qk() {
        if (this.cql != 0) {
            ArrayList<View> arrayList = this.ota;
            if (arrayList == null) {
                this.ota = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.ota.add(getChildAt(i10));
            }
            Collections.sort(this.ota, wad);
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f17982nq != z10) {
            this.f17982nq = z10;
        }
    }

    private boolean xyk() {
        this.tic = -1;
        yd();
        this.fy.onRelease();
        this.huv.onRelease();
        return this.fy.isFinished() || this.huv.isFinished();
    }

    private void yd() {
        this.pdm = false;
        this.f17986rv = false;
        VelocityTracker velocityTracker = this.f17991va;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17991va = null;
        }
    }

    private jd zz() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.hna / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        jd jdVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f17984qk.size()) {
            jd jdVar2 = this.f17984qk.get(i11);
            if (!z10 && jdVar2.f17995jd != (i10 = i12 + 1)) {
                jdVar2 = this.xyk;
                jdVar2.my = f10 + f12 + f11;
                jdVar2.f17995jd = i10;
                jdVar2.f17994cm = this.wqx.jpo(i10);
                i11--;
            }
            jd jdVar3 = jdVar2;
            f10 = jdVar3.my;
            float f13 = jdVar3.f17994cm + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.f17984qk.size() - 1) {
                return jdVar3;
            }
            int i13 = jdVar3.f17995jd;
            float f14 = jdVar3.f17994cm;
            i11++;
            i12 = i13;
            f12 = f14;
            jdVar = jdVar3;
            z10 = false;
        }
        return jdVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        jd jdVarJpo;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (jdVarJpo = jpo(childAt)) != null && jdVarJpo.f17995jd == this.f17971cm) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        jd jdVarJpo;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (jdVarJpo = jpo(childAt)) != null && jdVarJpo.f17995jd == this.f17971cm) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0068wqx c0068wqx = (C0068wqx) layoutParams;
        boolean zWqx = c0068wqx.jpo | wqx(view);
        c0068wqx.jpo = zWqx;
        if (!this.hmu) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zWqx) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0068wqx.f17998cm = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.wqx == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.nmd)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f17985rq));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0068wqx) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.oya = true;
        if (this.f17970au.isFinished() || !this.f17970au.computeScrollOffset()) {
            jpo(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f17970au.getCurrX();
        int currY = this.f17970au.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!cm(currX)) {
                this.f17970au.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || jpo(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        jd jdVarJpo;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (jdVarJpo = jpo(childAt)) != null && jdVarJpo.f17995jd == this.f17971cm && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.xyk.jd jdVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (jdVar = this.wqx) != null && jdVar.jpo() > 1)) {
            if (!this.fy.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.nmd * width);
                this.fy.setSize(height, width);
                zDraw = this.fy.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.huv.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f17985rq + 1.0f)) * width2);
                this.huv.setSize(height2, width2);
                zDraw |= this.huv.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.fy.finish();
            this.huv.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17988sq;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0068wqx();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.xyk.jd getAdapter() {
        return this.wqx;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.cql == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0068wqx) this.ota.get(i11).getLayoutParams()).f18000jj;
    }

    public int getCurrentItem() {
        return this.f17971cm;
    }

    public int getOffscreenPageLimit() {
        return this.f17977hx;
    }

    public int getPageMargin() {
        return this.hna;
    }

    public void jd(cm cmVar) {
        List<cm> list = this.jkt;
        if (list != null) {
            list.remove(cmVar);
        }
    }

    public void jpo() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f17970au = new Scroller(context, f17969jj);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.kln = viewConfiguration.getScaledPagingTouchSlop();
        this.vrc = (int) (400.0f * f10);
        this.roc = viewConfiguration.getScaledMaximumFlingVelocity();
        this.fy = new EdgeEffect(context);
        this.huv = new EdgeEffect(context);
        this.f17983pe = (int) (25.0f * f10);
        this.xk = (int) (2.0f * f10);
        this.f17990uu = (int) (f10 * 16.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17992ya = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.ree);
        Scroller scroller = this.f17970au;
        if (scroller != null && !scroller.isFinished()) {
            this.f17970au.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        super.onDraw(canvas);
        if (this.hna <= 0 || this.f17988sq == null || this.f17984qk.size() <= 0 || this.wqx == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.hna / width;
        int i12 = 0;
        jd jdVar = this.f17984qk.get(0);
        float f12 = jdVar.my;
        int size = this.f17984qk.size();
        int i13 = jdVar.f17995jd;
        int i14 = this.f17984qk.get(size - 1).f17995jd;
        while (i13 < i14) {
            while (true) {
                i10 = jdVar.f17995jd;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                jdVar = this.f17984qk.get(i12);
            }
            if (i13 == i10) {
                float f13 = jdVar.my;
                float f14 = jdVar.f17994cm;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                float fJpo = this.wqx.jpo(i13);
                f10 = (f12 + fJpo) * width;
                f12 = fJpo + f11 + f12;
            }
            if (this.hna + f10 > scrollX) {
                i11 = scrollX;
                this.f17988sq.setBounds(Math.round(f10), this.opi, Math.round(this.hna + f10), this.f17980jr);
                this.f17988sq.draw(canvas);
            } else {
                i11 = scrollX;
            }
            if (f10 > i11 + r2) {
                return;
            }
            i13++;
            scrollX = i11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            xyk();
            return false;
        }
        if (action != 0) {
            if (this.pdm) {
                return true;
            }
            if (this.f17986rv) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.duq = x10;
            this.f17975ef = x10;
            float y10 = motionEvent.getY();
            this.f17972dm = y10;
            this.nzb = y10;
            this.tic = motionEvent.getPointerId(0);
            this.f17986rv = false;
            this.oya = true;
            this.f17970au.computeScrollOffset();
            if (this.voc != 2 || Math.abs(this.f17970au.getFinalX() - this.f17970au.getCurrX()) <= this.xk) {
                jpo(false);
                this.pdm = false;
            } else {
                this.f17970au.abortAnimation();
                this.f17987se = false;
                wqx();
                this.pdm = true;
                wqx(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.tic;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.f17975ef;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.f17972dm);
                if (f10 != 0.0f && !jpo(this.f17975ef, f10) && jpo(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.f17975ef = x11;
                    this.nzb = y11;
                    this.f17986rv = true;
                    return false;
                }
                int i11 = this.kln;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.pdm = true;
                    wqx(true);
                    setScrollState(1);
                    this.f17975ef = f10 > 0.0f ? this.duq + this.kln : this.duq - this.kln;
                    this.nzb = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.f17986rv = true;
                }
                if (this.pdm && jd(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            jpo(motionEvent);
        }
        if (this.f17991va == null) {
            this.f17991va = VelocityTracker.obtain();
        }
        this.f17991va.addMovement(motionEvent);
        return this.pdm;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.xyk.wqx.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        C0068wqx c0068wqx;
        C0068wqx c0068wqx2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.sz = Math.min(measuredWidth / 10, this.f17990uu);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0068wqx2 = (C0068wqx) childAt.getLayoutParams()) != null && c0068wqx2.jpo) {
                int i15 = c0068wqx2.f17999jd;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c0068wqx2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0068wqx2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f17989tu = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f17974dt = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.hmu = true;
        wqx();
        this.hmu = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0068wqx = (C0068wqx) childAt2.getLayoutParams()) == null || !c0068wqx.jpo)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0068wqx.wqx), 1073741824), this.f17974dt);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        jd jdVarJpo;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (jdVarJpo = jpo(childAt)) != null && jdVarJpo.f17995jd == this.f17971cm && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof qk)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qk qkVar = (qk) parcelable;
        super.onRestoreInstanceState(qkVar.jpo());
        if (this.wqx != null) {
            jpo(qkVar.f17997jd, false, true);
            return;
        }
        this.f17993yd = qkVar.f17997jd;
        this.f17981ju = qkVar.wqx;
        this.f44if = qkVar.f17996cm;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        qk qkVar = new qk(super.onSaveInstanceState());
        qkVar.f17997jd = this.f17971cm;
        com.bytedance.adsdk.ugeno.xyk.jd jdVar = this.wqx;
        if (jdVar != null) {
            qkVar.wqx = jdVar.jd();
        }
        return qkVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.hna;
            jpo(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.xyk.jd jdVar;
        int iFindPointerIndex;
        if (this.f17978ic) {
            return true;
        }
        boolean zXyk = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (jdVar = this.wqx) == null || jdVar.jpo() == 0) {
            return false;
        }
        if (this.f17991va == null) {
            this.f17991va = VelocityTracker.obtain();
        }
        this.f17991va.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f17970au.abortAnimation();
            this.f17987se = false;
            wqx();
            float x10 = motionEvent.getX();
            this.duq = x10;
            this.f17975ef = x10;
            float y10 = motionEvent.getY();
            this.f17972dm = y10;
            this.nzb = y10;
            this.tic = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.f17975ef = motionEvent.getX(actionIndex);
                            this.tic = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        jpo(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.tic);
                        if (iFindPointerIndex2 != -1) {
                            this.f17975ef = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.pdm) {
                    jpo(this.f17971cm, true, 0, false);
                    zXyk = xyk();
                }
            } else if (!this.pdm) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.tic);
                if (iFindPointerIndex3 == -1) {
                    zXyk = xyk();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.f17975ef);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.nzb);
                    if (fAbs > this.kln && fAbs > fAbs2) {
                        this.pdm = true;
                        wqx(true);
                        float f10 = this.duq;
                        this.f17975ef = x11 - f10 > 0.0f ? f10 + this.kln : f10 - this.kln;
                        this.nzb = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.pdm) {
                        zXyk = jd(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.pdm && (iFindPointerIndex = motionEvent.findPointerIndex(this.tic)) != -1) {
                zXyk = jd(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.pdm) {
            VelocityTracker velocityTracker = this.f17991va;
            velocityTracker.computeCurrentVelocity(1000, this.roc);
            int xVelocity = (int) velocityTracker.getXVelocity(this.tic);
            this.f17987se = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            jd jdVarZz = zz();
            float f11 = clientWidth;
            int i10 = jdVarZz.f17995jd;
            float f12 = ((scrollX / f11) - jdVarZz.my) / (jdVarZz.f17994cm + (this.hna / f11));
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.tic);
            if (iFindPointerIndex4 != -1) {
                jpo(jpo(i10, f12, xVelocity, (int) (motionEvent.getX(iFindPointerIndex4) - this.duq)), true, true, xVelocity);
                zXyk = xyk();
            }
        }
        if (zXyk) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.hmu) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.xyk.jd jdVar) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.xyk.jd jdVar2 = this.wqx;
        if (jdVar2 != null) {
            jdVar2.jpo((DataSetObserver) null);
            for (int i10 = 0; i10 < this.f17984qk.size(); i10++) {
                jd jdVar3 = this.f17984qk.get(i10);
                this.wqx.jpo((ViewGroup) this, jdVar3.f17995jd, jdVar3.jpo);
            }
            this.f17984qk.clear();
            jj();
            this.f17971cm = 0;
            scrollTo(0, 0);
        }
        this.wqx = jdVar;
        this.jpo = 0;
        if (jdVar != null) {
            if (this.prr == null) {
                this.prr = new jj();
            }
            this.wqx.jpo((DataSetObserver) this.prr);
            this.f17987se = false;
            boolean z10 = this.f17992ya;
            this.f17992ya = true;
            this.jpo = this.wqx.jpo();
            int i11 = this.f17993yd;
            if (i11 >= 0) {
                jpo(i11, false, true);
                this.f17993yd = -1;
                this.f17981ju = null;
                this.f44if = null;
            } else if (z10) {
                requestLayout();
            } else {
                wqx();
            }
        }
        List<Object> list = this.rxq;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.rxq.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.rxq.get(i12);
        }
    }

    public void setCurrentItem(int i10) throws Resources.NotFoundException {
        this.f17987se = false;
        jpo(i10, !this.f17992ya, false);
    }

    public void setOffscreenPageLimit(int i10) throws Resources.NotFoundException {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f17977hx) {
            this.f17977hx = i10;
            wqx();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(cm cmVar) {
        this.cgn = cmVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.hna;
        this.hna = i10;
        int width = getWidth();
        jpo(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f17988sq = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.voc == i10) {
            return;
        }
        this.voc = i10;
        if (this.f17976et != null) {
            jd(i10 != 0);
        }
        jj(i10);
    }

    public void setScroller(Scroller scroller) {
        this.f17970au = scroller;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f17988sq;
    }

    public void wqx() throws Resources.NotFoundException {
        jpo(this.f17971cm);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.xyk.wqx$wqx, reason: collision with other inner class name */
    public static class C0068wqx extends ViewGroup.LayoutParams {

        /* renamed from: cm, reason: collision with root package name */
        boolean f17998cm;

        /* renamed from: jd, reason: collision with root package name */
        public int f17999jd;

        /* renamed from: jj, reason: collision with root package name */
        int f18000jj;
        public boolean jpo;
        int my;
        float wqx;

        public C0068wqx() {
            super(-1, -1);
            this.wqx = 0.0f;
        }

        public C0068wqx(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.wqx = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wqx.f17968jd);
            this.f17999jd = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private static boolean wqx(View view) {
        return view.getClass().getAnnotation(jpo.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0068wqx(getContext(), attributeSet);
    }

    public void jd() throws Resources.NotFoundException {
        int iJpo = this.wqx.jpo();
        this.jpo = iJpo;
        boolean z10 = this.f17984qk.size() < (this.f17977hx * 2) + 1 && this.f17984qk.size() < iJpo;
        int iMax = this.f17971cm;
        int i10 = 0;
        while (i10 < this.f17984qk.size()) {
            jd jdVar = this.f17984qk.get(i10);
            int iJpo2 = this.wqx.jpo(jdVar.jpo);
            if (iJpo2 != -1) {
                if (iJpo2 == -2) {
                    this.f17984qk.remove(i10);
                    i10--;
                    this.wqx.jpo((ViewGroup) this, jdVar.f17995jd, jdVar.jpo);
                    int i11 = this.f17971cm;
                    if (i11 == jdVar.f17995jd) {
                        iMax = Math.max(0, Math.min(i11, iJpo - 1));
                    }
                } else {
                    int i12 = jdVar.f17995jd;
                    if (i12 != iJpo2) {
                        if (i12 == this.f17971cm) {
                            iMax = iJpo2;
                        }
                        jdVar.f17995jd = iJpo2;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        Collections.sort(this.f17984qk, my);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C0068wqx c0068wqx = (C0068wqx) getChildAt(i13).getLayoutParams();
                if (!c0068wqx.jpo) {
                    c0068wqx.wqx = 0.0f;
                }
            }
            jpo(iMax, false, true);
            requestLayout();
        }
    }

    private void wqx(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private void jj(int i10) {
        cm cmVar = this.cgn;
        if (cmVar != null) {
            cmVar.mo390if(i10);
        }
        List<cm> list = this.jkt;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                cm cmVar2 = this.jkt.get(i11);
                if (cmVar2 != null) {
                    cmVar2.mo390if(i10);
                }
            }
        }
        cm cmVar3 = this.hks;
        if (cmVar3 != null) {
            cmVar3.mo390if(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wqx(int r5) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lab
            if (r1 == r0) goto Lab
            if (r5 != r3) goto L90
            android.graphics.Rect r2 = r4.zz
            android.graphics.Rect r2 = r4.jpo(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.zz
            android.graphics.Rect r3 = r4.jpo(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8b
            if (r2 < r3) goto L8b
            boolean r0 = r4.cm()
            goto Lc2
        L8b:
            boolean r0 = r1.requestFocus()
            goto Lc2
        L90:
            if (r5 != r2) goto Lb7
            android.graphics.Rect r2 = r4.zz
            android.graphics.Rect r2 = r4.jpo(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.zz
            android.graphics.Rect r3 = r4.jpo(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La6
            if (r2 <= r3) goto Lb9
        La6:
            boolean r0 = r1.requestFocus()
            goto Lc2
        Lab:
            if (r5 == r3) goto Lbe
            r0 = 1
            if (r5 != r0) goto Lb1
            goto Lbe
        Lb1:
            if (r5 == r2) goto Lb9
            r0 = 2
            if (r5 != r0) goto Lb7
            goto Lb9
        Lb7:
            r0 = 0
            goto Lc2
        Lb9:
            boolean r0 = r4.my()
            goto Lc2
        Lbe:
            boolean r0 = r4.cm()
        Lc2:
            if (r0 == 0) goto Lcb
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Lcb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.xyk.wqx.wqx(int):boolean");
    }

    public boolean my() throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.xyk.jd jdVar = this.wqx;
        if (jdVar == null || this.f17971cm >= jdVar.jpo() - 1) {
            return false;
        }
        jpo(this.f17971cm + 1, true);
        return true;
    }

    public boolean cm() throws Resources.NotFoundException {
        int i10 = this.f17971cm;
        if (i10 <= 0) {
            return false;
        }
        jpo(i10 - 1, true);
        return true;
    }

    public void jpo(int i10, boolean z10) throws Resources.NotFoundException {
        this.f17987se = false;
        jpo(i10, z10, false);
    }

    public void jpo(int i10, boolean z10, boolean z11) throws Resources.NotFoundException {
        jpo(i10, z10, z11, 0);
    }

    public void jpo(int i10, boolean z10, boolean z11, int i11) throws Resources.NotFoundException {
        com.bytedance.adsdk.ugeno.xyk.jd jdVar = this.wqx;
        if (jdVar != null && jdVar.jpo() > 0) {
            if (!z11 && this.f17971cm == i10 && this.f17984qk.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.wqx.jpo()) {
                i10 = this.wqx.jpo() - 1;
            }
            int i12 = this.f17977hx;
            int i13 = this.f17971cm;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f17984qk.size(); i14++) {
                    this.f17984qk.get(i14).wqx = true;
                }
            }
            boolean z12 = this.f17971cm != i10;
            if (this.f17992ya) {
                this.f17971cm = i10;
                if (z12) {
                    my(i10);
                }
                requestLayout();
                return;
            }
            jpo(i10);
            jpo(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public jd jd(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return jpo(view);
            }
        }
    }

    public jd jd(int i10) {
        for (int i11 = 0; i11 < this.f17984qk.size(); i11++) {
            jd jdVar = this.f17984qk.get(i11);
            if (jdVar.f17995jd == i10) {
                return jdVar;
            }
        }
        return null;
    }

    private void jd(int i10, float f10, int i11) {
        cm cmVar = this.cgn;
        if (cmVar != null) {
            cmVar.jpo(i10, f10, i11);
        }
        List<cm> list = this.jkt;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                cm cmVar2 = this.jkt.get(i12);
                if (cmVar2 != null) {
                    cmVar2.jpo(i10, f10, i11);
                }
            }
        }
        cm cmVar3 = this.hks;
        if (cmVar3 != null) {
            cmVar3.jpo(i10, f10, i11);
        }
    }

    private void jpo(int i10, boolean z10, int i11, boolean z11) throws Resources.NotFoundException {
        int iMax;
        jd jdVarJd = jd(i10);
        if (jdVarJd != null) {
            iMax = (int) (Math.max(this.nmd, Math.min(jdVarJd.my, this.f17985rq)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z10) {
            jpo(iMax, 0, i11);
            if (z11) {
                my(i10);
                return;
            }
            return;
        }
        if (z11) {
            my(i10);
        }
        jpo(false);
        scrollTo(iMax, 0);
        cm(iMax);
    }

    private void jd(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.f17979ii : 0, null);
        }
    }

    private boolean jd(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f17975ef - f10;
        this.f17975ef = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.nmd * clientWidth;
        float f13 = this.f17985rq * clientWidth;
        boolean z12 = false;
        jd jdVar = this.f17984qk.get(0);
        jd jdVar2 = (jd) o2.e(1, this.f17984qk);
        if (jdVar.f17995jd != 0) {
            f12 = jdVar.my * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (jdVar2.f17995jd != this.wqx.jpo() - 1) {
            f13 = jdVar2.my * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.fy.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.huv.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f17975ef = (scrollX - i10) + this.f17975ef;
        scrollTo(i10, getScrollY());
        cm(i10);
        return z12;
    }

    public void jpo(cm cmVar) {
        if (this.jkt == null) {
            this.jkt = new ArrayList();
        }
        this.jkt.add(cmVar);
    }

    public void jpo(boolean z10, my myVar) throws Resources.NotFoundException {
        jpo(z10, myVar, 2);
    }

    public void jpo(boolean z10, my myVar, int i10) throws Resources.NotFoundException {
        boolean z11 = myVar != null;
        boolean z12 = z11 != (this.f17976et != null);
        this.f17976et = myVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.cql = z10 ? 2 : 1;
            this.f17979ii = i10;
        } else {
            this.cql = 0;
        }
        if (z12) {
            wqx();
        }
    }

    public float jpo(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public void jpo(int i10, int i11, int i12) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f17970au;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.oya ? this.f17970au.getCurrX() : this.f17970au.getStartX();
            this.f17970au.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            jpo(false);
            wqx();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fJpo = (jpo(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11) + f11;
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fJpo / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((this.wqx.jpo(this.f17971cm) * f10) + this.hna)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.oya = false;
        this.f17970au.startScroll(i13, scrollY, i14, i15, iMin);
        postInvalidateOnAnimation();
    }

    public jd jpo(int i10, int i11) {
        jd jdVar = new jd();
        jdVar.f17995jd = i10;
        jdVar.jpo = this.wqx.jpo((ViewGroup) this, i10);
        jdVar.f17994cm = this.wqx.jpo(i10);
        if (i11 >= 0 && i11 < this.f17984qk.size()) {
            this.f17984qk.add(i11, jdVar);
            return jdVar;
        }
        this.f17984qk.add(jdVar);
        return jdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6 A[PHI: r7 r10 r14
      0x00c6: PHI (r7v7 int) = (r7v6 int), (r7v5 int), (r7v10 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:63:0x00ea, B:60:0x00d4, B:52:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.xyk.wqx.jpo(int):void");
    }

    private void jpo(jd jdVar, int i10, jd jdVar2) {
        int i11;
        int i12;
        jd jdVar3;
        jd jdVar4;
        int iJpo = this.wqx.jpo();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.hna / clientWidth : 0.0f;
        if (jdVar2 != null) {
            int i13 = jdVar2.f17995jd;
            int i14 = jdVar.f17995jd;
            if (i13 < i14) {
                float fJpo = jdVar2.my + jdVar2.f17994cm + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= jdVar.f17995jd && i16 < this.f17984qk.size()) {
                    jd jdVar5 = this.f17984qk.get(i16);
                    while (true) {
                        jdVar4 = jdVar5;
                        if (i15 <= jdVar4.f17995jd || i16 >= this.f17984qk.size() - 1) {
                            break;
                        }
                        i16++;
                        jdVar5 = this.f17984qk.get(i16);
                    }
                    while (i15 < jdVar4.f17995jd) {
                        fJpo += this.wqx.jpo(i15) + f10;
                        i15++;
                    }
                    jdVar4.my = fJpo;
                    fJpo += jdVar4.f17994cm + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f17984qk.size() - 1;
                float fJpo2 = jdVar2.my;
                while (true) {
                    i13--;
                    if (i13 < jdVar.f17995jd || size < 0) {
                        break;
                    }
                    jd jdVar6 = this.f17984qk.get(size);
                    while (true) {
                        jdVar3 = jdVar6;
                        if (i13 >= jdVar3.f17995jd || size <= 0) {
                            break;
                        }
                        size--;
                        jdVar6 = this.f17984qk.get(size);
                    }
                    while (i13 > jdVar3.f17995jd) {
                        fJpo2 -= this.wqx.jpo(i13) + f10;
                        i13--;
                    }
                    fJpo2 -= jdVar3.f17994cm + f10;
                    jdVar3.my = fJpo2;
                }
            }
        }
        int size2 = this.f17984qk.size();
        float fJpo3 = jdVar.my;
        int i17 = jdVar.f17995jd;
        int i18 = i17 - 1;
        this.nmd = i17 == 0 ? fJpo3 : -3.4028235E38f;
        int i19 = iJpo - 1;
        this.f17985rq = i17 == i19 ? (jdVar.f17994cm + fJpo3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            jd jdVar7 = this.f17984qk.get(i20);
            while (true) {
                i12 = jdVar7.f17995jd;
                if (i18 <= i12) {
                    break;
                }
                fJpo3 -= this.wqx.jpo(i18) + f10;
                i18--;
            }
            fJpo3 -= jdVar7.f17994cm + f10;
            jdVar7.my = fJpo3;
            if (i12 == 0) {
                this.nmd = fJpo3;
            }
            i20--;
            i18--;
        }
        float fJpo4 = jdVar.my + jdVar.f17994cm + f10;
        int i21 = jdVar.f17995jd + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            jd jdVar8 = this.f17984qk.get(i22);
            while (true) {
                i11 = jdVar8.f17995jd;
                if (i21 >= i11) {
                    break;
                }
                fJpo4 += this.wqx.jpo(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f17985rq = (jdVar8.f17994cm + fJpo4) - 1.0f;
            }
            jdVar8.my = fJpo4;
            fJpo4 += jdVar8.f17994cm + f10;
            i22++;
            i21++;
        }
        this.wcn = false;
    }

    public jd jpo(View view) {
        for (int i10 = 0; i10 < this.f17984qk.size(); i10++) {
            jd jdVar = this.f17984qk.get(i10);
            if (this.wqx.jpo(view, jdVar.jpo)) {
                return jdVar;
            }
        }
        return null;
    }

    private void jpo(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f17984qk.isEmpty()) {
            if (!this.f17970au.isFinished()) {
                this.f17970au.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        jd jdVarJd = jd(this.f17971cm);
        int iMin = (int) ((jdVarJd != null ? Math.min(jdVarJd.my, this.f17985rq) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            jpo(false);
            scrollTo(iMin, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.sbx
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.xyk.wqx$wqx r9 = (com.bytedance.adsdk.ugeno.xyk.wqx.C0068wqx) r9
            boolean r10 = r9.jpo
            if (r10 == 0) goto L68
            int r9 = r9.f17999jd
            r9 = r9 & 7
            if (r9 == r2) goto L4f
            r10 = 3
            if (r9 == r10) goto L49
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5c
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L45:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5c
        L49:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L45
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.jd(r13, r14, r15)
            com.bytedance.adsdk.ugeno.xyk.wqx$my r13 = r12.f17976et
            if (r13 == 0) goto L9e
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9e
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.xyk.wqx$wqx r0 = (com.bytedance.adsdk.ugeno.xyk.wqx.C0068wqx) r0
            boolean r0 = r0.jpo
            if (r0 != 0) goto L9b
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.xyk.wqx$my r3 = r12.f17976et
            r3.jpo(r15, r0)
        L9b:
            int r1 = r1 + 1
            goto L7a
        L9e:
            r12.f17973dn = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.xyk.wqx.jpo(int, float, int):void");
    }

    private void jpo(boolean z10) {
        boolean z11 = this.voc == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f17970au.isFinished()) {
                this.f17970au.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f17970au.getCurrX();
                int currY = this.f17970au.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        cm(currX);
                    }
                }
            }
        }
        this.f17987se = false;
        for (int i10 = 0; i10 < this.f17984qk.size(); i10++) {
            jd jdVar = this.f17984qk.get(i10);
            if (jdVar.wqx) {
                jdVar.wqx = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.ree);
            } else {
                this.ree.run();
            }
        }
    }

    private boolean jpo(float f10, float f11) {
        if (f10 >= this.sz || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.sz)) && f11 < 0.0f;
        }
        return true;
    }

    private int jpo(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f17983pe || Math.abs(i11) <= this.vrc) {
            i10 += (int) (f10 + (i10 >= this.f17971cm ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f17984qk.size() > 0) {
            return Math.max(this.f17984qk.get(0).f17995jd, Math.min(i10, ((jd) o2.e(1, this.f17984qk)).f17995jd));
        }
        return i10;
    }

    private void jpo(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.tic) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f17975ef = motionEvent.getX(i10);
            this.tic = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f17991va;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean jpo(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && jpo(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public boolean jpo(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return cm();
            }
            return wqx(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return my();
            }
            return wqx(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return wqx(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return wqx(1);
        }
        return false;
    }

    private Rect jpo(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
