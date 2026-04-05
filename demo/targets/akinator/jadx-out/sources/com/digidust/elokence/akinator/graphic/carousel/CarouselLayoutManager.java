package com.digidust.elokence.akinator.graphic.carousel;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import dh.p;
import ea.b;
import ea.c;
import ea.d;
import ea.e;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.f implements o2 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f21757a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f21758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21759c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21760d;

    /* renamed from: i, reason: collision with root package name */
    public int f21765i;

    /* renamed from: j, reason: collision with root package name */
    public CarouselSavedState f21766j;

    /* renamed from: f, reason: collision with root package name */
    public final p f21762f = new p();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f21763g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f21764h = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f21761e = -1;

    public CarouselLayoutManager(int i10, boolean z10) {
        this.f21759c = i10;
        this.f21760d = z10;
    }

    public static float h(float f10, int i10) {
        while (0.0f > f10) {
            f10 += i10;
        }
        while (Math.round(f10) >= i10) {
            f10 -= i10;
        }
        return f10;
    }

    public void addOnItemSelectionListener(d dVar) {
        this.f21763g.add(dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean canScrollHorizontally() {
        return getChildCount() != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.o2
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        return new PointF((int) (-Math.signum(g(i10))), 0.0f);
    }

    public final int d(int i10, RecyclerView.l lVar) {
        if (i10 >= lVar.getItemCount()) {
            i10 = lVar.getItemCount() - 1;
        }
        return this.f21757a.intValue() * i10;
    }

    public final void e(RecyclerView.j jVar, RecyclerView.l lVar) {
        int i10;
        float f10 = f();
        int itemCount = lVar.getItemCount();
        this.f21765i = itemCount;
        float fH = h(f10, itemCount);
        int iRound = Math.round(fH);
        boolean z10 = this.f21760d;
        p pVar = this.f21762f;
        if (!z10 || 1 >= (i10 = this.f21765i)) {
            int iMax = Math.max((iRound - pVar.f52250a) - 1, 0);
            int iMin = Math.min(pVar.f52250a + iRound + 1, this.f21765i - 1);
            int i11 = iMin - iMax;
            int i12 = i11 + 1;
            pVar.a(i12);
            for (int i13 = iMax; i13 <= iMin; i13++) {
                if (i13 == iRound) {
                    ((c[]) pVar.f52252c)[i11].f53996a = i13;
                } else if (i13 < iRound) {
                    ((c[]) pVar.f52252c)[i13 - iMax].f53996a = i13;
                } else {
                    ((c[]) pVar.f52252c)[(i12 - (i13 - iRound)) - 1].f53996a = i13;
                }
            }
        } else {
            int iMin2 = Math.min((pVar.f52250a * 2) + 3, i10);
            pVar.a(iMin2);
            if (this.f21759c == 1) {
                for (int i14 = 1; i14 < iMin2; i14++) {
                    ((c[]) pVar.f52252c)[i14 - 1].f53996a = Math.round((fH - i14) + iMin2) % this.f21765i;
                }
            }
            ((c[]) pVar.f52252c)[iMin2 - 1].f53996a = iRound;
        }
        detachAndScrapAttachedViews(jVar);
        int widthNoPadding = getWidthNoPadding();
        int heightNoPadding = getHeightNoPadding();
        if (getMaxVisibleItems() > 0) {
            int maxVisibleItems = (widthNoPadding / getMaxVisibleItems()) * 2;
            int maxVisibleItems2 = (widthNoPadding - maxVisibleItems) / (getMaxVisibleItems() - 1);
            int length = ((c[]) pVar.f52252c).length;
            for (int i15 = 0; i15 < length; i15++) {
                c cVar = ((c[]) pVar.f52252c)[i15];
                if (i15 == 0) {
                    View viewForPosition = jVar.getViewForPosition(cVar.f53996a);
                    addView(viewForPosition);
                    measureChildWithMargins(viewForPosition, 0, 0);
                    viewForPosition.layout(0, 0, maxVisibleItems, heightNoPadding);
                } else {
                    View viewForPosition2 = jVar.getViewForPosition(cVar.f53996a);
                    addView(viewForPosition2);
                    measureChildWithMargins(viewForPosition2, 0, 0);
                    viewForPosition2.layout(j1.o2.b(i15, 1, maxVisibleItems2, maxVisibleItems), 0, (i15 * maxVisibleItems2) + maxVisibleItems, heightNoPadding);
                }
            }
        }
        jVar.clear();
        int iRound2 = Math.round(h(f10, lVar.getItemCount()));
        if (this.f21764h != iRound2) {
            this.f21764h = iRound2;
            new Handler(Looper.getMainLooper()).post(new b(this, iRound2));
        }
    }

    public final float f() {
        Integer num = this.f21757a;
        if ((this.f21765i - 1) * (num == null ? 0 : num.intValue()) == 0) {
            return 0.0f;
        }
        return (this.f21762f.f52251b * 1.0f) / (this.f21757a != null ? r2.intValue() : 0);
    }

    public final float g(int i10) {
        float fH = h(f(), this.f21765i);
        if (!this.f21760d) {
            return fH - i10;
        }
        float f10 = fH - i10;
        float fAbs = Math.abs(f10) - this.f21765i;
        return Math.abs(f10) > Math.abs(fAbs) ? Math.signum(f10) * fAbs : f10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public RecyclerView.g generateDefaultLayoutParams() {
        return new RecyclerView.g(-2, -2);
    }

    public int getCenterItemPosition() {
        return this.f21764h;
    }

    public int getHeightNoPadding() {
        return (getHeight() - getPaddingEnd()) - getPaddingStart();
    }

    public int getMaxVisibleItems() {
        return this.f21762f.f52250a;
    }

    public int getOrientation() {
        return 0;
    }

    public int getWidthNoPadding() {
        return (getWidth() - getPaddingStart()) - getPaddingEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onAdapterChanged(RecyclerView.a aVar, RecyclerView.a aVar2) {
        super.onAdapterChanged(aVar, aVar2);
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onLayoutChildren(RecyclerView.j jVar, RecyclerView.l lVar) {
        int i10;
        if (lVar.getItemCount() == 0) {
            removeAndRecycleAllViews(jVar);
            Iterator it = this.f21763g.iterator();
            if (it.hasNext()) {
                throw a.b.c(it);
            }
            return;
        }
        if (this.f21757a == null) {
            View viewForPosition = jVar.getViewForPosition(0);
            addView(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            this.f21757a = Integer.valueOf(getDecoratedMeasuredWidth(viewForPosition));
            this.f21758b = Integer.valueOf(getDecoratedMeasuredHeight(viewForPosition));
            removeAndRecycleView(viewForPosition, jVar);
            if (-1 == this.f21761e && this.f21766j == null) {
                this.f21761e = this.f21764h;
            }
        }
        if (-1 != this.f21761e) {
            int itemCount = lVar.getItemCount();
            this.f21761e = itemCount == 0 ? -1 : Math.max(0, Math.min(itemCount - 1, this.f21761e));
        }
        int i11 = this.f21761e;
        p pVar = this.f21762f;
        if (-1 != i11) {
            pVar.f52251b = d(i11, lVar);
            this.f21761e = -1;
            this.f21766j = null;
        } else {
            CarouselSavedState carouselSavedState = this.f21766j;
            if (carouselSavedState != null) {
                pVar.f52251b = d(carouselSavedState.f21768c, lVar);
                this.f21766j = null;
            } else if (lVar.didStructureChange() && -1 != (i10 = this.f21764h)) {
                pVar.f52251b = d(i10, lVar);
            }
        }
        e(jVar, lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onMeasure(RecyclerView.j jVar, RecyclerView.l lVar, int i10, int i11) {
        this.f21758b = null;
        this.f21757a = null;
        super.onMeasure(jVar, lVar, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CarouselSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CarouselSavedState carouselSavedState = (CarouselSavedState) parcelable;
        this.f21766j = carouselSavedState;
        super.onRestoreInstanceState(carouselSavedState.f21767b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public Parcelable onSaveInstanceState() {
        CarouselSavedState carouselSavedState = this.f21766j;
        if (carouselSavedState != null) {
            return new CarouselSavedState(carouselSavedState);
        }
        CarouselSavedState carouselSavedState2 = new CarouselSavedState(super.onSaveInstanceState());
        carouselSavedState2.f21768c = this.f21764h;
        return carouselSavedState2;
    }

    public void removeOnItemSelectionListener(d dVar) {
        this.f21763g.remove(dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int scrollHorizontallyBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        int i11;
        if (this.f21757a == null || this.f21758b == null || getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        boolean z10 = this.f21760d;
        p pVar = this.f21762f;
        if (z10) {
            pVar.f52251b += i10;
            Integer num = this.f21757a;
            int iIntValue = (num != null ? num.intValue() : 0) * this.f21765i;
            while (true) {
                int i12 = pVar.f52251b;
                if (i12 >= 0) {
                    break;
                }
                pVar.f52251b = i12 + iIntValue;
            }
            while (true) {
                i11 = pVar.f52251b;
                if (i11 <= iIntValue) {
                    break;
                }
                pVar.f52251b = i11 - iIntValue;
            }
            pVar.f52251b = i11 - i10;
        } else {
            Integer num2 = this.f21757a;
            int iIntValue2 = (this.f21765i - 1) * (num2 != null ? num2.intValue() : 0);
            int i13 = pVar.f52251b;
            int i14 = i13 + i10;
            if (i14 < 0) {
                i10 = -i13;
            } else if (i14 > iIntValue2) {
                i10 = iIntValue2 - i13;
            }
        }
        if (i10 != 0) {
            pVar.f52251b += i10;
            e(jVar, lVar);
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void scrollToPosition(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "position can't be less then 0. position is : "));
        }
        this.f21761e = i10;
        requestLayout();
    }

    public void setMaxVisibleItems(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxVisibleItems can't be less then 1");
        }
        this.f21762f.f52250a = i10;
        requestLayout();
    }

    public void setPostLayoutListener(e eVar) {
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.l lVar, int i10) {
        ea.a aVar = new ea.a(this, recyclerView.getContext());
        try {
            aVar.setTargetPosition(i10 % this.f21765i);
        } catch (ArithmeticException unused) {
            aVar.setTargetPosition(0);
        }
        startSmoothScroll(aVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class CarouselSavedState implements Parcelable {
        public static final Parcelable.Creator<CarouselSavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final Parcelable f21767b;

        /* renamed from: c, reason: collision with root package name */
        public int f21768c;

        public CarouselSavedState(Parcelable parcelable) {
            this.f21767b = parcelable;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f21767b, i10);
            parcel.writeInt(this.f21768c);
        }

        public CarouselSavedState(Parcel parcel) {
            this.f21767b = parcel.readParcelable(Parcelable.class.getClassLoader());
            this.f21768c = parcel.readInt();
        }

        public CarouselSavedState(CarouselSavedState carouselSavedState) {
            this.f21767b = carouselSavedState.f21767b;
            this.f21768c = carouselSavedState.f21768c;
        }
    }
}
