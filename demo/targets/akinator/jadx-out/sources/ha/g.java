package ha;

import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final d f58717a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f58718b;

    /* renamed from: c, reason: collision with root package name */
    public float f58719c;

    /* renamed from: d, reason: collision with root package name */
    public LinearGradient f58720d;

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f58721e;

    /* renamed from: f, reason: collision with root package name */
    public int f58722f;

    /* renamed from: g, reason: collision with root package name */
    public int f58723g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f58724h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f58725i;

    /* renamed from: j, reason: collision with root package name */
    public f f58726j;

    public g(d dVar, TextPaint textPaint, AttributeSet attributeSet) {
        this.f58717a = dVar;
        this.f58718b = textPaint;
        this.f58723g = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = dVar.getContext().obtainStyledAttributes(attributeSet, la.a.f72709a, 0, 0);
            try {
                if (typedArrayObtainStyledAttributes != null) {
                    try {
                        this.f58723g = typedArrayObtainStyledAttributes.getColor(0, -1);
                    } catch (Exception e10) {
                        Timber.tag("ShimmerTextView").e(e10, "Error while creating the view:", new Object[0]);
                    }
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f58721e = new Matrix();
    }

    public final void a() {
        float f10 = -this.f58717a.getWidth();
        int i10 = this.f58722f;
        LinearGradient linearGradient = new LinearGradient(f10, 0.0f, 0.0f, 0.0f, new int[]{i10, this.f58723g, i10}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.f58720d = linearGradient;
        this.f58718b.setShader(linearGradient);
    }

    public final void b(int i10) {
        this.f58722f = i10;
        if (this.f58725i) {
            a();
        }
    }
}
