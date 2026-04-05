package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.b1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2693b1 extends Animation {

    /* renamed from: b, reason: collision with root package name */
    public final float f32670b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32671c;

    /* renamed from: e, reason: collision with root package name */
    public Camera f32673e;

    /* renamed from: a, reason: collision with root package name */
    public final float f32669a = 90.0f;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32672d = true;

    public C2693b1(float f10, float f11) {
        this.f32670b = f10;
        this.f32671c = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "t");
        float fA = j1.o2.a(this.f32669a, 0.0f, f10, 0.0f);
        float f11 = this.f32670b;
        float f12 = this.f32671c;
        Camera camera = this.f32673e;
        Matrix matrix = t10.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.f32672d) {
                camera.translate(0.0f, 0.0f, f10 * 0.0f);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f10) * 0.0f);
            }
            camera.rotateY(fA);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f11, -f12);
        matrix.postTranslate(f11, f12);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.f32673e = new Camera();
    }
}
