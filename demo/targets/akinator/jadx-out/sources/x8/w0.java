package x8;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f91875a = new Paint(6);

    /* renamed from: b, reason: collision with root package name */
    public static final Paint f91876b = new Paint(7);

    /* renamed from: c, reason: collision with root package name */
    public static final Paint f91877c;

    /* renamed from: d, reason: collision with root package name */
    public static final Lock f91878d;

    static {
        f91878d = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new v0();
        Paint paint = new Paint(7);
        f91877c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f91878d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f91875a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(q8.d dVar, Bitmap bitmap) {
        Bitmap.Config configC = c(bitmap);
        if (configC.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmap2 = dVar.get(bitmap.getWidth(), bitmap.getHeight(), configC);
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmap2;
    }

    public static Bitmap.Config c(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config = Bitmap.Config.RGBA_F16;
            if (config.equals(bitmap.getConfig())) {
                return config;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Bitmap centerCrop(q8.d dVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float fC;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float fC2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            fC2 = e3.g.c(bitmap.getWidth(), width, i10, 0.5f);
            fC = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            fC = e3.g.c(bitmap.getHeight(), width, i11, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (fC2 + 0.5f), (int) (fC + 0.5f));
        Bitmap bitmap2 = dVar.get(i10, i11, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        setAlpha(bitmap, bitmap2);
        a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    public static Bitmap centerInside(q8.d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return fitCenter(dVar, bitmap, i10, i11);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap circleCrop(q8.d dVar, Bitmap bitmap, int i10, int i11) {
        int iMin = Math.min(i10, i11);
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f10 / width, f10 / height);
        float f12 = width * fMax;
        float f13 = fMax * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap bitmapB = b(dVar, bitmap);
        Bitmap bitmap2 = dVar.get(iMin, iMin, c(bitmap));
        bitmap2.setHasAlpha(true);
        Lock lock = f91878d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawCircle(f11, f11, f11, f91876b);
            canvas.drawBitmap(bitmapB, (Rect) null, rectF, f91877c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapB.equals(bitmap)) {
                dVar.put(bitmapB);
            }
            return bitmap2;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public static Bitmap d(q8.d dVar, Bitmap bitmap, u0 u0Var) {
        Bitmap.Config configC = c(bitmap);
        Bitmap bitmapB = b(dVar, bitmap);
        Bitmap bitmap2 = dVar.get(bitmapB.getWidth(), bitmapB.getHeight(), configC);
        bitmap2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapB, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Lock lock = f91878d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            u0Var.drawRoundedCorners(canvas, paint, rectF);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapB.equals(bitmap)) {
                dVar.put(bitmapB);
            }
            return bitmap2;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public static Bitmap fitCenter(q8.d dVar, Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
            float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmap2 = dVar.get((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                setAlpha(bitmap, bitmap2);
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i10 + "x" + i11);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + bitmap2.getWidth() + "x" + bitmap2.getHeight());
                    StringBuilder sb2 = new StringBuilder("minPct:   ");
                    sb2.append(fMin);
                    Log.v("TransformationUtils", sb2.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                a(bitmap, bitmap2, matrix);
                return bitmap2;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static Lock getBitmapDrawableLock() {
        return f91878d;
    }

    public static int getExifOrientationDegrees(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static boolean isExifOrientationRequired(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap rotateImage(Bitmap bitmap, int i10) {
        Bitmap bitmap2;
        Matrix matrix;
        if (i10 == 0) {
            return bitmap;
        }
        try {
            matrix = new Matrix();
            matrix.setRotate(i10);
            bitmap2 = bitmap;
        } catch (Exception e10) {
            e = e10;
            bitmap2 = bitmap;
        }
        try {
            return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e11) {
            e = e11;
            Exception exc = e;
            if (!Log.isLoggable("TransformationUtils", 6)) {
                return bitmap2;
            }
            Log.e("TransformationUtils", "Exception when trying to orient image", exc);
            return bitmap2;
        }
    }

    public static Bitmap rotateImageExif(q8.d dVar, Bitmap bitmap, int i10) {
        if (!isExifOrientationRequired(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmap2 = dVar.get(Math.round(rectF.width()), Math.round(rectF.height()), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmap2.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmap2, matrix);
        return bitmap2;
    }

    @Deprecated
    public static Bitmap roundedCorners(q8.d dVar, Bitmap bitmap, int i10, int i11, int i12) {
        return roundedCorners(dVar, bitmap, i12);
    }

    public static void setAlpha(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap roundedCorners(q8.d dVar, Bitmap bitmap, int i10) {
        j9.q.checkArgument(i10 > 0, "roundingRadius must be greater than 0.");
        return d(dVar, bitmap, new s0(i10));
    }

    public static Bitmap roundedCorners(q8.d dVar, Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return d(dVar, bitmap, new t0(f10, f11, f12, f13));
    }
}
