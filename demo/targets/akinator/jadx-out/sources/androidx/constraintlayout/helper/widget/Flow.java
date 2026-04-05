package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.k;
import androidx.constraintlayout.widget.r;
import androidx.constraintlayout.widget.x;
import d3.g;
import d3.j;
import d3.m;
import d3.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class Flow extends x {

    /* renamed from: m, reason: collision with root package name */
    public j f5315m;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.x, androidx.constraintlayout.widget.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f5315m = new j();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f5543b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f5315m.setOrientation(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 1) {
                    this.f5315m.setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 18) {
                    this.f5315m.setPaddingStart(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 19) {
                    this.f5315m.setPaddingEnd(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 2) {
                    this.f5315m.setPaddingLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 3) {
                    this.f5315m.setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 4) {
                    this.f5315m.setPaddingRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 5) {
                    this.f5315m.setPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 54) {
                    this.f5315m.setWrapMode(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 44) {
                    this.f5315m.setHorizontalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 53) {
                    this.f5315m.setVerticalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 38) {
                    this.f5315m.setFirstHorizontalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 46) {
                    this.f5315m.setLastHorizontalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 40) {
                    this.f5315m.setFirstVerticalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 48) {
                    this.f5315m.setLastVerticalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 42) {
                    this.f5315m.setHorizontalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 37) {
                    this.f5315m.setFirstHorizontalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 45) {
                    this.f5315m.setLastHorizontalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 39) {
                    this.f5315m.setFirstVerticalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 47) {
                    this.f5315m.setLastVerticalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 51) {
                    this.f5315m.setVerticalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 41) {
                    this.f5315m.setHorizontalAlign(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 50) {
                    this.f5315m.setVerticalAlign(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == 43) {
                    this.f5315m.setHorizontalGap(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 52) {
                    this.f5315m.setVerticalGap(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == 49) {
                    this.f5315m.setMaxElementsWrap(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f5383f = this.f5315m;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.c
    public void loadParameters(k.a aVar, m mVar, ConstraintLayout.a aVar2, SparseArray<g> sparseArray) {
        super.loadParameters(aVar, mVar, aVar2, sparseArray);
        if (mVar instanceof j) {
            j jVar = (j) mVar;
            int i10 = aVar2.V;
            if (i10 != -1) {
                jVar.setOrientation(i10);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public final void onMeasure(int i10, int i11) {
        onMeasure(this.f5315m, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.c
    public void resolveRtl(g gVar, boolean z10) {
        this.f5315m.applyRtl(z10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f5315m.setFirstHorizontalBias(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f5315m.setFirstHorizontalStyle(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f5315m.setFirstVerticalBias(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f5315m.setFirstVerticalStyle(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f5315m.setHorizontalAlign(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f5315m.setHorizontalBias(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f5315m.setHorizontalGap(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f5315m.setHorizontalStyle(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f5315m.setLastHorizontalBias(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f5315m.setLastHorizontalStyle(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f5315m.setLastVerticalBias(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f5315m.setLastVerticalStyle(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f5315m.setMaxElementsWrap(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f5315m.setOrientation(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f5315m.setPadding(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f5315m.setPaddingBottom(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f5315m.setPaddingLeft(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f5315m.setPaddingRight(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f5315m.setPaddingTop(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f5315m.setVerticalAlign(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f5315m.setVerticalBias(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f5315m.setVerticalGap(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f5315m.setVerticalStyle(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f5315m.setWrapMode(i10);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.x
    public void onMeasure(p pVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (pVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            pVar.measure(mode, size, mode2, size2);
            setMeasuredDimension(pVar.getMeasuredWidth(), pVar.getMeasuredHeight());
        }
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
