package e8;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import t7.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Matrix f53971a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public static final m f53972b = new m(0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f53973c = new m(1);

    /* renamed from: d, reason: collision with root package name */
    public static final m f53974d = new m(2);

    /* renamed from: e, reason: collision with root package name */
    public static final m f53975e = new m(3);

    /* renamed from: f, reason: collision with root package name */
    public static final float f53976f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void applyTrimPathIfNeeded(Path path, v vVar) {
        if (vVar == null || vVar.isHidden()) {
            return;
        }
        applyTrimPathIfNeeded(path, ((u7.j) vVar.getStart()).getFloatValue() / 100.0f, ((u7.j) vVar.getEnd()).getFloatValue() / 100.0f, ((u7.j) vVar.getOffset()).getFloatValue() / 360.0f);
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static Path createPath(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        float f10 = pointF.x + pointF3.x;
        float f11 = pointF.y + pointF3.y;
        float f12 = pointF2.x;
        float f13 = f12 + pointF4.x;
        float f14 = pointF2.y;
        path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
        return path;
    }

    public static float dpScale() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float getAnimationScale(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float getScale(Matrix matrix) {
        float[] fArr = (float[]) f53975e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f53976f;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean hasZeroScaleAxis(Matrix matrix) {
        float[] fArr = (float[]) f53975e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int hashFor(float f10, float f11, float f12, float f13) {
        int i10 = f10 != 0.0f ? (int) (IronSourceError.ERROR_NON_EXISTENT_INSTANCE * f10) : 17;
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        return f13 != 0.0f ? (int) (i10 * 31 * f13) : i10;
    }

    public static boolean isAtLeastVersion(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 < i13) {
            return false;
        }
        if (i10 > i13) {
            return true;
        }
        if (i11 < i14) {
            return false;
        }
        return i11 > i14 || i12 >= i15;
    }

    public static boolean isNetworkException(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static int mixOpacities(int i10, int i11) {
        return (int) ((((i10 / 255.0f) * i11) / 255.0f) * 255.0f);
    }

    public static Bitmap renderPath(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        s7.a aVar = new s7.a();
        aVar.setAntiAlias(true);
        aVar.setColor(-16776961);
        canvas.drawPath(path, aVar);
        return bitmapCreateBitmap;
    }

    public static Bitmap resizeBitmapIfNeeded(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint) {
        saveLayerCompat(canvas, rectF, paint, 31);
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint, int i10) {
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("Utils#saveLayer");
        }
    }

    public static void applyTrimPathIfNeeded(Path path, float f10, float f11, float f12) {
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = (PathMeasure) f53972b.get();
        Path path2 = (Path) f53973c.get();
        Path path3 = (Path) f53974d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            if (r7.d.isTraceEnabled()) {
                r7.d.endSection("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float fMin = Math.min(f13, f14) + f15;
            float fMax = Math.max(f13, f14) + f15;
            if (fMin >= length && fMax >= length) {
                fMin = j.a(fMin, length);
                fMax = j.a(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = j.a(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = j.a(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                if (r7.d.isTraceEnabled()) {
                    r7.d.endSection("applyTrimPathIfNeeded");
                    return;
                }
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            if (r7.d.isTraceEnabled()) {
                r7.d.endSection("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("applyTrimPathIfNeeded");
        }
    }
}
