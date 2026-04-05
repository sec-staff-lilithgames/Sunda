package kb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.View;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {
    public static Bitmap createGrayscale(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap downloadBitmapFromUrl(String str) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Bitmap downloadPicture(String str, boolean z10) throws IOException {
        if (str != null) {
            if (str.startsWith("http")) {
                if (z10) {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.connect();
                        return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                    } catch (IOException unused) {
                    }
                }
                return null;
            }
            try {
                return BitmapFactory.decodeFile(str);
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static Bitmap screenShot(View view) {
        Bitmap bitmapCreateBitmap;
        if (view == null || (bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888)) == null) {
            return null;
        }
        view.draw(new Canvas(bitmapCreateBitmap));
        return view.getMeasuredHeight() > 1024 ? Bitmap.createScaledBitmap(bitmapCreateBitmap, (int) (view.getMeasuredWidth() * (1024.0d / view.getMeasuredHeight())), 1024, false) : bitmapCreateBitmap;
    }
}
