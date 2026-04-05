package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.f f7206a;

    /* renamed from: b, reason: collision with root package name */
    public int f7207b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f7208c = new Rect();

    public o1(RecyclerView.f fVar) {
        this.f7206a = fVar;
    }

    public static o1 createHorizontalHelper(RecyclerView.f fVar) {
        return new m1(fVar);
    }

    public static o1 createOrientationHelper(RecyclerView.f fVar, int i10) {
        if (i10 == 0) {
            return createHorizontalHelper(fVar);
        }
        if (i10 == 1) {
            return createVerticalHelper(fVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static o1 createVerticalHelper(RecyclerView.f fVar) {
        return new n1(fVar);
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public RecyclerView.f getLayoutManager() {
        return this.f7206a;
    }

    public abstract int getMode();

    public abstract int getModeInOther();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public int getTotalSpaceChange() {
        if (Integer.MIN_VALUE == this.f7207b) {
            return 0;
        }
        return getTotalSpace() - this.f7207b;
    }

    public abstract int getTransformedEndWithDecoration(View view);

    public abstract int getTransformedStartWithDecoration(View view);

    public abstract void offsetChild(View view, int i10);

    public abstract void offsetChildren(int i10);

    public void onLayoutComplete() {
        this.f7207b = getTotalSpace();
    }
}
