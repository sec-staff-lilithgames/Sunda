package g3;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public final float A;
    public final float B;
    public final int C;
    public final int D;

    /* renamed from: a, reason: collision with root package name */
    public final int f57162a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57163b;

    /* renamed from: c, reason: collision with root package name */
    public int f57164c;

    /* renamed from: d, reason: collision with root package name */
    public int f57165d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57166e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57167f;

    /* renamed from: g, reason: collision with root package name */
    public float f57168g;

    /* renamed from: h, reason: collision with root package name */
    public float f57169h;

    /* renamed from: i, reason: collision with root package name */
    public final int f57170i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f57171j;

    /* renamed from: k, reason: collision with root package name */
    public float f57172k;

    /* renamed from: l, reason: collision with root package name */
    public float f57173l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f57174m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f57175n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f57176o;

    /* renamed from: p, reason: collision with root package name */
    public float f57177p;

    /* renamed from: q, reason: collision with root package name */
    public float f57178q;

    /* renamed from: r, reason: collision with root package name */
    public final i0 f57179r;

    /* renamed from: s, reason: collision with root package name */
    public float f57180s;

    /* renamed from: t, reason: collision with root package name */
    public float f57181t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f57182u;

    /* renamed from: v, reason: collision with root package name */
    public final float f57183v;

    /* renamed from: w, reason: collision with root package name */
    public final int f57184w;

    /* renamed from: x, reason: collision with root package name */
    public final float f57185x;

    /* renamed from: y, reason: collision with root package name */
    public final float f57186y;

    /* renamed from: z, reason: collision with root package name */
    public final float f57187z;

    public p0(Context context, i0 i0Var, XmlResourceParser xmlResourceParser) {
        this.f57162a = 0;
        this.f57163b = 0;
        this.f57164c = 0;
        this.f57165d = -1;
        this.f57166e = -1;
        this.f57167f = -1;
        this.f57168g = 0.5f;
        this.f57169h = 0.5f;
        this.f57170i = -1;
        this.f57171j = false;
        this.f57172k = 0.0f;
        this.f57173l = 1.0f;
        this.f57174m = false;
        this.f57175n = new float[2];
        this.f57176o = new int[2];
        this.f57180s = 4.0f;
        this.f57181t = 1.2f;
        this.f57182u = true;
        this.f57183v = 1.0f;
        this.f57184w = 0;
        this.f57185x = 10.0f;
        this.f57186y = 10.0f;
        this.f57187z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f57179r = i0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.r.f5559r);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 16) {
                this.f57165d = typedArrayObtainStyledAttributes.getResourceId(index, this.f57165d);
            } else if (index == 17) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f57162a);
                this.f57162a = i11;
                float[] fArr = E[i11];
                this.f57169h = fArr[0];
                this.f57168g = fArr[1];
            } else if (index == 1) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f57163b);
                this.f57163b = i12;
                if (i12 < 6) {
                    float[] fArr2 = F[i12];
                    this.f57172k = fArr2[0];
                    this.f57173l = fArr2[1];
                } else {
                    this.f57173l = Float.NaN;
                    this.f57172k = Float.NaN;
                    this.f57171j = true;
                }
            } else if (index == 6) {
                this.f57180s = typedArrayObtainStyledAttributes.getFloat(index, this.f57180s);
            } else if (index == 5) {
                this.f57181t = typedArrayObtainStyledAttributes.getFloat(index, this.f57181t);
            } else if (index == 7) {
                this.f57182u = typedArrayObtainStyledAttributes.getBoolean(index, this.f57182u);
            } else if (index == 2) {
                this.f57183v = typedArrayObtainStyledAttributes.getFloat(index, this.f57183v);
            } else if (index == 3) {
                this.f57185x = typedArrayObtainStyledAttributes.getFloat(index, this.f57185x);
            } else if (index == 18) {
                this.f57166e = typedArrayObtainStyledAttributes.getResourceId(index, this.f57166e);
            } else if (index == 9) {
                this.f57164c = typedArrayObtainStyledAttributes.getInt(index, this.f57164c);
            } else if (index == 8) {
                this.f57184w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f57167f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f57170i = typedArrayObtainStyledAttributes.getResourceId(index, this.f57170i);
            } else if (index == 12) {
                this.f57186y = typedArrayObtainStyledAttributes.getFloat(index, this.f57186y);
            } else if (index == 13) {
                this.f57187z = typedArrayObtainStyledAttributes.getFloat(index, this.f57187z);
            } else if (index == 14) {
                this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
            } else if (index == 15) {
                this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
            } else if (index == 11) {
                this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
            } else if (index == 0) {
                this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f57167f;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f57166e;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public int getAnchorId() {
        return this.f57165d;
    }

    public int getAutoCompleteMode() {
        return this.D;
    }

    public int getFlags() {
        return this.f57184w;
    }

    public float getMaxVelocity() {
        return this.f57180s;
    }

    public int getSpringBoundary() {
        return this.C;
    }

    public float getSpringDamping() {
        return this.f57186y;
    }

    public float getSpringMass() {
        return this.f57187z;
    }

    public float getSpringStiffness() {
        return this.A;
    }

    public float getSpringStopThreshold() {
        return this.B;
    }

    public void setAnchorId(int i10) {
        this.f57165d = i10;
    }

    public void setMaxAcceleration(float f10) {
        this.f57181t = f10;
    }

    public void setMaxVelocity(float f10) {
        this.f57180s = f10;
    }

    public void setRTL(boolean z10) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z10) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f57162a];
        this.f57169h = fArr3[0];
        this.f57168g = fArr3[1];
        int i10 = this.f57163b;
        if (i10 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i10];
        this.f57172k = fArr4[0];
        this.f57173l = fArr4[1];
    }

    public void setTouchAnchorLocation(float f10, float f11) {
        this.f57169h = f10;
        this.f57168g = f11;
    }

    public void setTouchUpMode(int i10) {
        this.f57164c = i10;
    }

    public String toString() {
        if (Float.isNaN(this.f57172k)) {
            return "rotation";
        }
        return this.f57172k + " , " + this.f57173l;
    }

    public p0(i0 i0Var, m0 m0Var) {
        this.f57162a = 0;
        this.f57163b = 0;
        this.f57164c = 0;
        this.f57165d = -1;
        this.f57166e = -1;
        this.f57167f = -1;
        this.f57168g = 0.5f;
        this.f57169h = 0.5f;
        this.f57170i = -1;
        this.f57171j = false;
        this.f57172k = 0.0f;
        this.f57173l = 1.0f;
        this.f57174m = false;
        this.f57175n = new float[2];
        this.f57176o = new int[2];
        this.f57180s = 4.0f;
        this.f57181t = 1.2f;
        this.f57182u = true;
        this.f57183v = 1.0f;
        this.f57184w = 0;
        this.f57185x = 10.0f;
        this.f57186y = 10.0f;
        this.f57187z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f57179r = i0Var;
        this.f57165d = m0Var.getTouchAnchorId();
        int touchAnchorSide = m0Var.getTouchAnchorSide();
        this.f57162a = touchAnchorSide;
        if (touchAnchorSide != -1) {
            float[] fArr = E[touchAnchorSide];
            this.f57169h = fArr[0];
            this.f57168g = fArr[1];
        }
        int dragDirection = m0Var.getDragDirection();
        this.f57163b = dragDirection;
        if (dragDirection < 6) {
            float[] fArr2 = F[dragDirection];
            this.f57172k = fArr2[0];
            this.f57173l = fArr2[1];
        } else {
            this.f57173l = Float.NaN;
            this.f57172k = Float.NaN;
            this.f57171j = true;
        }
        this.f57180s = m0Var.getMaxVelocity();
        this.f57181t = m0Var.getMaxAcceleration();
        this.f57182u = m0Var.getMoveWhenScrollAtTop();
        this.f57183v = m0Var.getDragScale();
        this.f57185x = m0Var.getDragThreshold();
        this.f57166e = m0Var.getTouchRegionId();
        this.f57164c = m0Var.getOnTouchUp();
        this.f57184w = m0Var.getNestedScrollFlags();
        this.f57167f = m0Var.getLimitBoundsTo();
        this.f57170i = m0Var.getRotationCenterId();
        this.C = m0Var.getSpringBoundary();
        this.f57186y = m0Var.getSpringDamping();
        this.f57187z = m0Var.getSpringMass();
        this.A = m0Var.getSpringStiffness();
        this.B = m0Var.getSpringStopThreshold();
        this.D = m0Var.getAutoCompleteMode();
    }
}
