package o9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q3 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap[] f78458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s3 f78459c;

    public q3(s3 s3Var, Bitmap[] bitmapArr) {
        this.f78459c = s3Var;
        this.f78458b = bitmapArr;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Bitmap[] bitmapArr = this.f78458b;
        s3 s3Var = this.f78459c;
        try {
            float measuredWidth = s3Var.f78521i.getMeasuredWidth();
            float measuredHeight = s3Var.f78521i.getMeasuredHeight();
            float width = bitmapArr[0].getWidth();
            float height = bitmapArr[0].getHeight();
            float f10 = measuredWidth / width;
            float f11 = measuredHeight / height;
            if (f10 >= f11) {
                f10 = f11;
            }
            float f12 = width * f10;
            float f13 = f10 * height;
            int i10 = (int) f12;
            int i11 = (int) f13;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmapArr[0], new Rect(0, 0, (int) width, (int) height), new Rect((int) (0.032f * f12), (int) (0.056f * f13), i10 - ((int) (f12 * 0.037333332f)), i11 - ((int) (f13 * 0.04f))), (Paint) null);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(s3Var.getResources(), R.drawable.ak_perso_frame);
            canvas.drawBitmap(bitmapDecodeResource, new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight()), new Rect(0, 0, i10, i11), (Paint) null);
            s3Var.f78521i.setImageBitmap(bitmapCreateBitmap);
            s3Var.f78521i.setVisibility(0);
        } catch (Exception unused) {
            s3Var.f78521i.setBackgroundColor(0);
        }
        s3Var.f78521i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
