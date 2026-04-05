package q7;

import a7.b;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import coil.memory.MemoryCache$Key;
import com.digidust.elokence.akinator.freemium.R;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Deferred;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import m7.c;
import sv.j0;
import sv.n0;
import uu.y0;
import xv.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f82544a;

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f82545b;

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f82546c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f82544a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f82545b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f82546c = new f0.a().build();
    }

    public static final void abortQuietly(d7.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final b.a addFirst(b.a aVar, tu.v vVar) {
        if (vVar != null) {
            aVar.getFetcherFactories$coil_base_release().add(0, vVar);
        }
        return aVar;
    }

    public static final f0.a addUnsafeNonAscii(f0.a aVar, String str) {
        int iIndexOf$default = n0.indexOf$default((CharSequence) str, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalArgumentException(a.b.k("Unexpected header: ", str).toString());
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String string = n0.trim(strSubstring).toString();
        String strSubstring2 = str.substring(iIndexOf$default + 1);
        e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        aVar.addUnsafeNonAscii(string, strSubstring2);
        return aVar;
    }

    public static final int calculateMemoryCacheSize(Context context, double d10) {
        int largeMemoryClass;
        try {
            Object systemService = m3.a.getSystemService(context, ActivityManager.class);
            e0.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        double d11 = 1024;
        return (int) (d10 * largeMemoryClass * d11 * d11);
    }

    public static final void closeQuietly(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double defaultMemoryCacheSizePercent(Context context) {
        try {
            Object systemService = m3.a.getSystemService(context, ActivityManager.class);
            e0.checkNotNull(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final j7.e get(j7.f fVar, MemoryCache$Key memoryCache$Key) {
        if (memoryCache$Key != null) {
            return fVar.get(memoryCache$Key);
        }
        return null;
    }

    public static final <T> T getCompletedOrNull(Deferred<? extends T> deferred) {
        try {
            return deferred.getCompleted();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Bitmap.Config getDEFAULT_BITMAP_CONFIG() {
        return f82545b;
    }

    public static final f0 getEMPTY_HEADERS() {
        return f82546c;
    }

    public static final String getEmoji(c7.f fVar) {
        int i10 = m.$EnumSwitchMapping$0[fVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return "🧠";
        }
        if (i10 == 3) {
            return "💾";
        }
        if (i10 == 4) {
            return "☁️ ";
        }
        throw new tu.t();
    }

    public static final a7.g getEventListener(g7.i iVar) {
        return iVar instanceof g7.l ? ((g7.l) iVar).getEventListener() : a7.g.f4100a;
    }

    public static final String getFirstPathSegment(Uri uri) {
        return (String) y0.firstOrNull((List) uri.getPathSegments());
    }

    public static final int getHeight(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int getIdentityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final String getMimeTypeFromUrl(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || n0.isBlank(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(n0.substringAfterLast(n0.substringAfterLast$default(n0.substringBeforeLast$default(n0.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final ColorSpace getNULL_COLOR_SPACE() {
        return null;
    }

    public static final int getNightMode(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final l7.x getRequestManager(View view) {
        l7.x xVar;
        Object tag = view.getTag(R.id.coil_request_manager);
        l7.x xVar2 = tag instanceof l7.x ? (l7.x) tag : null;
        if (xVar2 != null) {
            return xVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil_request_manager);
                xVar = tag2 instanceof l7.x ? (l7.x) tag2 : null;
                if (xVar == null) {
                    xVar = new l7.x(view);
                    view.addOnAttachStateChangeListener(xVar);
                    view.setTag(R.id.coil_request_manager, xVar);
                }
            } finally {
            }
        }
        return xVar;
    }

    public static final File getSafeCacheDir(Context context) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return cacheDir;
    }

    public static final m7.i getScale(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : m.$EnumSwitchMapping$1[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? m7.i.f74063c : m7.i.f74062b;
    }

    public static final Bitmap.Config[] getVALID_TRANSFORMATION_CONFIGS() {
        return f82544a;
    }

    public static final int getWidth(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final int heightPx(m7.j jVar, m7.i iVar, kv.a aVar) {
        return m7.b.isOriginal(jVar) ? ((Number) aVar.invoke()).intValue() : toPx(jVar.getHeight(), iVar);
    }

    public static final boolean isAssetUri(Uri uri) {
        return e0.areEqual(uri.getScheme(), C3191e4.h.f36473b) && e0.areEqual(getFirstPathSegment(uri), "android_asset");
    }

    public static final boolean isMainThread() {
        return e0.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean isMinOrMax(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean isPlaceholderCached(g7.i iVar) {
        return (iVar instanceof g7.l) && ((g7.l) iVar).isPlaceholderCached();
    }

    public static final boolean isVector(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof f6.w);
    }

    public static final f0 orEmpty(f0 f0Var) {
        return f0Var == null ? f82546c : f0Var;
    }

    public static final int toNonNegativeInt(String str, int i10) {
        Long longOrNull = j0.toLongOrNull(str);
        if (longOrNull == null) {
            return i10;
        }
        long jLongValue = longOrNull.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final int toPx(m7.c cVar, m7.i iVar) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f74052a;
        }
        int i10 = m.$EnumSwitchMapping$2[iVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new tu.t();
    }

    public static final Void unsupported() {
        throw new IllegalStateException("Unsupported");
    }

    public static final int widthPx(m7.j jVar, m7.i iVar, kv.a aVar) {
        return m7.b.isOriginal(jVar) ? ((Number) aVar.invoke()).intValue() : toPx(jVar.getWidth(), iVar);
    }

    public static final b.a addFirst(b.a aVar, c7.j jVar) {
        if (jVar != null) {
            aVar.getDecoderFactories$coil_base_release().add(0, jVar);
        }
        return aVar;
    }

    public static final l7.t orEmpty(l7.t tVar) {
        return tVar == null ? l7.t.f72654c : tVar;
    }

    public static final l7.p orEmpty(l7.p pVar) {
        return pVar == null ? l7.p.f72638c : pVar;
    }
}
