package j9;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f69201a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f69202b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f69203c;

    public static Handler a() {
        if (f69203c == null) {
            synchronized (s.class) {
                try {
                    if (f69203c == null) {
                        f69203c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f69203c;
    }

    public static void assertBackgroundThread() {
        if (!isOnBackgroundThread()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void assertMainThread() {
        if (!isOnMainThread()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean bothBaseRequestOptionsNullEquivalentOrEquals(f9.a aVar, f9.a aVar2) {
        return aVar == null ? aVar2 == null : aVar.isEquivalentTo(aVar2);
    }

    public static boolean bothModelsNullEquivalentOrEquals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean bothNullOrEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static <T> Queue<T> createQueue(int i10) {
        return new ArrayDeque(i10);
    }

    public static int getBitmapByteSize(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + C3191e4.i.f36529d + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int getBytesPerPixel(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = r.f69200a[config.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                return i10 != 4 ? 4 : 8;
            }
        }
        return i11;
    }

    @Deprecated
    public static int getSize(Bitmap bitmap) {
        return getBitmapByteSize(bitmap);
    }

    public static <T> List<T> getSnapshot(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static int hashCode(int i10) {
        return hashCode(i10, 17);
    }

    public static boolean isOnBackgroundThread() {
        return !isOnMainThread();
    }

    public static boolean isOnMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isValidDimension(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean isValidDimensions(int i10, int i11) {
        return isValidDimension(i10) && isValidDimension(i11);
    }

    public static void postOnUiThread(Runnable runnable) {
        a().post(runnable);
    }

    public static void removeCallbacksOnUiThread(Runnable runnable) {
        a().removeCallbacks(runnable);
    }

    public static String sha256BytesToHex(byte[] bArr) {
        String str;
        char[] cArr = f69202b;
        synchronized (cArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i12 = i10 * 2;
                char[] cArr2 = f69201a;
                cArr[i12] = cArr2[i11 >>> 4];
                cArr[i12 + 1] = cArr2[b10 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    public static int hashCode(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int hashCode(float f10) {
        return hashCode(f10, 17);
    }

    public static int hashCode(float f10, int i10) {
        return hashCode(Float.floatToIntBits(f10), i10);
    }

    public static int hashCode(Object obj, int i10) {
        return hashCode(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int hashCode(boolean z10, int i10) {
        return hashCode(z10 ? 1 : 0, i10);
    }

    public static int hashCode(boolean z10) {
        return hashCode(z10, 17);
    }

    public static int getBitmapByteSize(int i10, int i11, Bitmap.Config config) {
        return getBytesPerPixel(config) * i10 * i11;
    }
}
