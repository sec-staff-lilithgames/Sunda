package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class Barrier extends c {

    /* renamed from: k, reason: collision with root package name */
    public int f5316k;

    /* renamed from: l, reason: collision with root package name */
    public int f5317l;

    /* renamed from: m, reason: collision with root package name */
    public d3.a f5318m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.f5318m.getAllowsGoneWidget();
    }

    public boolean getAllowsGoneWidget() {
        return this.f5318m.getAllowsGoneWidget();
    }

    public int getMargin() {
        return this.f5318m.getMargin();
    }

    public int getType() {
        return this.f5316k;
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f5318m = new d3.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f5543b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f5318m.setAllowsGoneWidget(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == 27) {
                    this.f5318m.setMargin(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f5383f = this.f5318m;
        validateParams();
    }

    public final void i(d3.g gVar, int i10, boolean z10) {
        this.f5317l = i10;
        if (z10) {
            int i11 = this.f5316k;
            if (i11 == 5) {
                this.f5317l = 1;
            } else if (i11 == 6) {
                this.f5317l = 0;
            }
        } else {
            int i12 = this.f5316k;
            if (i12 == 5) {
                this.f5317l = 0;
            } else if (i12 == 6) {
                this.f5317l = 1;
            }
        }
        if (gVar instanceof d3.a) {
            ((d3.a) gVar).setBarrierType(this.f5317l);
        }
    }

    @Override // androidx.constraintlayout.widget.c
    public void loadParameters(k.a aVar, d3.m mVar, ConstraintLayout.a aVar2, SparseArray<d3.g> sparseArray) {
        super.loadParameters(aVar, mVar, aVar2, sparseArray);
        if (mVar instanceof d3.a) {
            d3.a aVar3 = (d3.a) mVar;
            boolean zIsRtl = ((d3.h) mVar.getParent()).isRtl();
            k.b bVar = aVar.f5440e;
            k.b bVar2 = aVar.f5440e;
            i(aVar3, bVar.f5458g0, zIsRtl);
            aVar3.setAllowsGoneWidget(bVar2.f5474o0);
            aVar3.setMargin(bVar2.f5460h0);
        }
    }

    @Override // androidx.constraintlayout.widget.c
    public void resolveRtl(d3.g gVar, boolean z10) {
        i(gVar, this.f5316k, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f5318m.setAllowsGoneWidget(z10);
    }

    public void setDpMargin(int i10) {
        this.f5318m.setMargin((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f5318m.setMargin(i10);
    }

    public void setType(int i10) {
        this.f5316k = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }
}
