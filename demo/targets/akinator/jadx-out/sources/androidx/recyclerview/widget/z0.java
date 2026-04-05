package androidx.recyclerview.widget;

import android.view.View;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public o1 f7332a;

    /* renamed from: b, reason: collision with root package name */
    public int f7333b;

    /* renamed from: c, reason: collision with root package name */
    public int f7334c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7335d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7336e;

    public z0() {
        b();
    }

    public final void a() {
        this.f7334c = this.f7335d ? this.f7332a.getEndAfterPadding() : this.f7332a.getStartAfterPadding();
    }

    public void assignFromView(View view, int i10) {
        if (this.f7335d) {
            this.f7334c = this.f7332a.getTotalSpaceChange() + this.f7332a.getDecoratedEnd(view);
        } else {
            this.f7334c = this.f7332a.getDecoratedStart(view);
        }
        this.f7333b = i10;
    }

    public void assignFromViewAndKeepVisibleRect(View view, int i10) {
        int totalSpaceChange = this.f7332a.getTotalSpaceChange();
        if (totalSpaceChange >= 0) {
            assignFromView(view, i10);
            return;
        }
        this.f7333b = i10;
        if (!this.f7335d) {
            int decoratedStart = this.f7332a.getDecoratedStart(view);
            int startAfterPadding = decoratedStart - this.f7332a.getStartAfterPadding();
            this.f7334c = decoratedStart;
            if (startAfterPadding > 0) {
                int endAfterPadding = (this.f7332a.getEndAfterPadding() - Math.min(0, (this.f7332a.getEndAfterPadding() - totalSpaceChange) - this.f7332a.getDecoratedEnd(view))) - (this.f7332a.getDecoratedMeasurement(view) + decoratedStart);
                if (endAfterPadding < 0) {
                    this.f7334c -= Math.min(startAfterPadding, -endAfterPadding);
                    return;
                }
                return;
            }
            return;
        }
        int endAfterPadding2 = (this.f7332a.getEndAfterPadding() - totalSpaceChange) - this.f7332a.getDecoratedEnd(view);
        this.f7334c = this.f7332a.getEndAfterPadding() - endAfterPadding2;
        if (endAfterPadding2 > 0) {
            int decoratedMeasurement = this.f7334c - this.f7332a.getDecoratedMeasurement(view);
            int startAfterPadding2 = this.f7332a.getStartAfterPadding();
            int iMin = decoratedMeasurement - (Math.min(this.f7332a.getDecoratedStart(view) - startAfterPadding2, 0) + startAfterPadding2);
            if (iMin < 0) {
                this.f7334c = Math.min(endAfterPadding2, -iMin) + this.f7334c;
            }
        }
    }

    public final void b() {
        this.f7333b = -1;
        this.f7334c = Integer.MIN_VALUE;
        this.f7335d = false;
        this.f7336e = false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
        sb2.append(this.f7333b);
        sb2.append(", mCoordinate=");
        sb2.append(this.f7334c);
        sb2.append(", mLayoutFromEnd=");
        sb2.append(this.f7335d);
        sb2.append(", mValid=");
        return a.b.p(sb2, this.f7336e, AbstractJsonLexerKt.END_OBJ);
    }
}
