package c7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f11847a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final Paint f11848b = new Paint(3);

    public final l getExifData(String str, pw.k kVar, n nVar) {
        if (!q.supports(nVar, str)) {
            return l.f11840c;
        }
        v4.c cVar = new v4.c(new m(kVar.peek().inputStream()));
        return new l(cVar.isFlipped(), cVar.getRotationDegrees());
    }

    public final Bitmap reverseTransformations(Bitmap bitmap, l lVar) {
        Bitmap bitmapCreateBitmap;
        if (!lVar.isFlipped() && !q.isRotated(lVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (lVar.isFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (q.isRotated(lVar)) {
            matrix.postRotate(lVar.getRotationDegrees(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        if (q.isSwapped(lVar)) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), q7.a.getSafeConfig(bitmap));
            e0.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), q7.a.getSafeConfig(bitmap));
            e0.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        }
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f11848b);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
