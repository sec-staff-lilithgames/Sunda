package vf;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class f extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f89248a;

    public f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f89248a = new Matrix();
    }

    @Override // android.util.Property
    public Matrix get(ImageView imageView) {
        Matrix imageMatrix = imageView.getImageMatrix();
        Matrix matrix = this.f89248a;
        matrix.set(imageMatrix);
        return matrix;
    }

    @Override // android.util.Property
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
