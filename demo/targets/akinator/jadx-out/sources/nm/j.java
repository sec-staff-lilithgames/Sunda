package nm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.Executable;
import io.bidmachine.Function;
import io.bidmachine.SimpleContextProvider;
import ir.q;
import ir.t;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import nh.n1;
import org.json.JSONObject;
import pr.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f77051b;

    /* renamed from: c, reason: collision with root package name */
    public static final rr.a f77052c;

    /* renamed from: f, reason: collision with root package name */
    public static String f77055f;

    /* renamed from: g, reason: collision with root package name */
    public static String f77056g;

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f77050a = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f77053d = "0123456789abcdef".toCharArray();

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f77054e = "0123456789ABCDEF".toCharArray();

    static {
        HandlerThread handlerThread = new HandlerThread("BackgroundHandlerThread");
        handlerThread.start();
        f77051b = new Handler(handlerThread.getLooper());
        f77052c = new rr.a(new n1(9));
    }

    public static boolean canAddWindowToActivity(Activity activity) {
        return (activity == null || activity.getWindow() == null || !activity.getWindow().isActive() || activity.getWindow().getDecorView().getWindowToken() == null) ? false : true;
    }

    public static boolean canUseCleartextTraffic() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static boolean canUseExternalFilesDir() {
        return isExternalMemoryAvailable();
    }

    public static void cancelBackgroundThreadTask(Runnable runnable) {
        f77051b.removeCallbacks(runnable);
    }

    public static void cancelUiThreadTask(Runnable runnable) {
        f77050a.removeCallbacks(runnable);
    }

    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String checkIfEmpty(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                a.w(e10);
            }
        }
    }

    public static Float convertToFloatOrDefault(Object obj, Float f10) {
        return obj == null ? f10 : obj instanceof Number ? Float.valueOf(((Number) obj).floatValue()) : parseFloatOrDefault(obj.toString(), f10);
    }

    public static Integer convertToIntOrDefault(Object obj, Integer num) {
        return obj == null ? num : obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : parseIntOrDefault(obj.toString(), num);
    }

    public static Handler createHandlerWithMyOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper);
    }

    public static Context findDialogContext(Context context) {
        return findDialogContext(context, null);
    }

    public static void flush(Flushable flushable) throws IOException {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception e10) {
                a.w(e10);
            }
        }
    }

    public static String generateFileName(String str) {
        return new BigInteger(getMD5(str.getBytes())).abs().toString(36);
    }

    public static String generateTag(String str, Object obj) {
        StringBuilder sbT = a.b.t(str, " @");
        sbT.append(Integer.toHexString(obj.hashCode()));
        return sbT.toString();
    }

    public static NetworkCapabilities getActiveNetworkCapabilities(Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null) {
            return null;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            return connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (Throwable th2) {
            a.w(th2);
            return null;
        }
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        try {
            ConnectivityManager connectivityManager = getConnectivityManager(context);
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th2) {
            a.w(th2);
            return null;
        }
    }

    public static String getAppName(Context context) {
        if (f77055f == null) {
            f77055f = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        }
        return f77055f;
    }

    public static String getAppVersion(Context context) {
        if (f77056g == null) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str != null) {
                    f77056g = str;
                }
            } catch (Exception e10) {
                a.w(e10);
            }
        }
        return f77056g;
    }

    public static Location getBestLocation(Context context, Location location, Location location2) {
        Location location3 = (Location) oneOf(location, location2);
        Location location4 = q.getLocation(context);
        return (location4 == null || (location3 != null && location4.getTime() < location3.getTime())) ? location3 : location4;
    }

    public static File getCacheDir(Context context, String str) {
        File externalFilesDir = getExternalFilesDir(context);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getPath() + "/" + str + "/");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static ConnectivityManager getConnectivityManager(Context context) {
        if (!isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            a.e(new n1(8));
            return null;
        }
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th2) {
            a.w(th2);
            return null;
        }
    }

    public static File getExternalFilesDir(Context context) {
        return context.getExternalFilesDir(null);
    }

    public static File getExternalFilesDirDirty(Context context) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return null;
            }
            return new File(externalStorageDirectory, "/Android/data/" + context.getPackageName() + "/files");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] getMD5(byte[] bArr) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            a.w(e10);
            return null;
        }
    }

    public static long getOrDefault(long j10, long j11, long j12) {
        return j10 == j11 ? j12 : j10;
    }

    public static float getScreenDensity(Context context) {
        return pr.d.getDisplayMetrics(context).density;
    }

    public static Point getScreenSize(Context context) {
        DisplayMetrics displayMetrics = pr.d.getDisplayMetrics(context);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int getUtcOffsetMinutes() {
        return (int) TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    }

    public static Rect getViewRectangle(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static void ifNotEmpty(String str, Executable<String> executable) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        executable.execute(str);
    }

    public static <T> void ifNotNull(T t10, Executable<T> executable) {
        if (t10 != null) {
            executable.execute(t10);
        }
    }

    @SafeVarargs
    public static Object invokeMethodByName(Object obj, String str, Pair<Class<?>, Object>... pairArr) throws Exception {
        return invokeMethodByName(obj, obj.getClass(), str, pairArr);
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isExternalMemoryAvailable() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isHttpUrl(String str) {
        return str.startsWith(DtbConstants.HTTP) || str.startsWith(DtbConstants.HTTPS);
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isPermissionGranted(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean isUiThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isUrlValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isViewTransparent(View view) {
        return view.getAlpha() == 0.0f;
    }

    public static boolean isYearValid(int i10) {
        return i10 >= 1900 && i10 <= ((Integer) f77052c.get()).intValue();
    }

    public static <T> String join(List<T> list) {
        return join(list, ", ");
    }

    public static void onBackgroundThread(Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = f77051b;
        if (looperMyLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void onUiThread(Runnable runnable) {
        if (isUiThread()) {
            runnable.run();
        } else {
            f77050a.post(runnable);
        }
    }

    public static <T> T oneOf(T t10, T t11) {
        return (T) oneOf(t10, t11, null);
    }

    public static Float parseFloatOrDefault(String str, Float f10) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (Throwable unused) {
            }
        }
        return f10;
    }

    public static Integer parseHorizontalPosition(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
        }
        return null;
    }

    public static int parseIntOrDefault(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static Integer parseVerticalPosition(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void putAll(Map<K, V> map, Map<K, V> map2) {
        if (map == null || map2 == 0) {
            return;
        }
        map.putAll(map2);
    }

    public static String readFile(File file) {
        try {
            return streamToString(new FileInputStream(file));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable, java.io.Flushable] */
    public static String retrieveAndSaveFrame(Context context, Uri uri, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        ?? r22 = 0;
        if (strExtractMetadata == null) {
            return null;
        }
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(strExtractMetadata), 2);
        try {
            if (frameAtTime != null) {
                try {
                    File file = new File(getCacheDir(context, str), generateFileName(uri.toString()));
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        String absolutePath = file.getAbsolutePath();
                        flush(fileOutputStream);
                        close(fileOutputStream);
                        return absolutePath;
                    } catch (Exception e10) {
                        e = e10;
                        a.w(e);
                        flush(fileOutputStream);
                        close(fileOutputStream);
                        return null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    flush(r22);
                    close(r22);
                    throw th;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r22 = context;
        }
    }

    public static void runCatching(o oVar) {
        try {
            oVar.run();
        } catch (Throwable unused) {
        }
    }

    public static Integer safeParseColor(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void simpleTrackUrl(String str, Executor executor) {
        if (TextUtils.isEmpty(str) || executor == null) {
            return;
        }
        try {
            executor.execute(new i(str, 0));
        } catch (Exception e10) {
            a.w(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void sort(CopyOnWriteArrayList<T> copyOnWriteArrayList, Comparator<? super T> comparator) {
        Object[] array = copyOnWriteArrayList.toArray();
        Arrays.sort(array, comparator);
        for (int i10 = 0; i10 < array.length; i10++) {
            copyOnWriteArrayList.set(i10, array[i10]);
        }
    }

    public static void startActivity(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Throwable th2) {
            a.w(th2);
        }
    }

    public static String streamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        String string = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
                string = byteArrayOutputStream.toString(C.UTF8_NAME);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
        }
        flush(byteArrayOutputStream);
        close(byteArrayOutputStream);
        close(inputStream);
        return string;
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            int i12 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
            char[] cArr2 = f77053d;
            cArr[i11] = cArr2[i12];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws Exception {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                map.put(next, objOpt.toString());
            }
        }
        return map;
    }

    public static String toSignatureHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b10 = bArr[i11];
            int i12 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
            char[] cArr2 = f77054e;
            cArr[i10] = cArr2[i12];
            int i13 = i10 + 2;
            cArr[i10 + 1] = cArr2[b10 & 15];
            if (i11 < bArr.length - 1) {
                i10 += 3;
                cArr[i13] = AbstractJsonLexerKt.COLON;
            } else {
                i10 = i13;
            }
        }
        return new String(cArr);
    }

    public static Context findDialogContext(Context context, View view) {
        Activity activity = new SimpleContextProvider(context).getActivity();
        if (activity != null) {
            return activity;
        }
        if (view == null) {
            return context;
        }
        View viewFindContentOrRootView = t.findContentOrRootView(view);
        return viewFindContentOrRootView != null ? viewFindContentOrRootView.getContext() : view.getContext();
    }

    public static float getOrDefault(float f10, float f11, float f12) {
        return f10 == f11 ? f12 : f10;
    }

    @SafeVarargs
    public static Object invokeMethodByName(Object obj, Class<?> cls, String str, Pair<Class<?>, Object>... pairArr) throws Exception {
        Class<?>[] clsArr;
        Object[] objArr;
        if (pairArr != null) {
            clsArr = new Class[pairArr.length];
            objArr = new Object[pairArr.length];
            for (int i10 = 0; i10 < pairArr.length; i10++) {
                clsArr[i10] = (Class) pairArr[i10].first;
                objArr[i10] = pairArr[i10].second;
            }
        } else {
            clsArr = null;
            objArr = null;
        }
        for (int i11 = 10; i11 > 0 && cls != null; i11--) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            } catch (NoSuchMethodException unused2) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static <T> String join(List<T> list, CharSequence charSequence) {
        return join(list, charSequence, new n1(7));
    }

    public static <T> T oneOf(T t10, T t11, T t12) {
        return t10 != null ? t10 : t11 != null ? t11 : t12;
    }

    public static <T> String join(List<T> list, CharSequence charSequence, Function<T, String> function) {
        String strApply;
        if (isEmpty(list)) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder(list.size());
            for (T t10 : list) {
                if (t10 != null && (strApply = function.apply(t10)) != null) {
                    if (sb2.length() > 0) {
                        sb2.append(charSequence);
                    }
                    sb2.append(strApply);
                }
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Integer parseIntOrDefault(String str, Integer num) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (Throwable unused) {
            }
        }
        return num;
    }

    public static void onBackgroundThread(Runnable runnable, long j10) {
        f77051b.postDelayed(runnable, j10);
    }

    public static void onUiThread(Runnable runnable, long j10) {
        f77050a.postDelayed(runnable, j10);
    }
}
