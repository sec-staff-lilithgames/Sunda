package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import pw.k;
import pw.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class Utils {
    private static final int KEY_PADDING = 50;
    static final char KEY_SEPARATOR = '\n';
    private static final int MAX_DISK_CACHE_SIZE = 52428800;
    private static final int MIN_DISK_CACHE_SIZE = 5242880;
    static final String OWNER_DISPATCHER = "Dispatcher";
    static final String OWNER_HUNTER = "Hunter";
    static final String OWNER_MAIN = "Main";
    private static final String PICASSO_CACHE = "picasso-cache";
    static final String THREAD_IDLE_NAME = "Picasso-Idle";
    static final int THREAD_LEAK_CLEANING_MS = 1000;
    static final String THREAD_PREFIX = "Picasso-";
    static final String VERB_BATCHED = "batched";
    static final String VERB_CANCELED = "canceled";
    static final String VERB_CHANGED = "changed";
    static final String VERB_COMPLETED = "completed";
    static final String VERB_CREATED = "created";
    static final String VERB_DECODED = "decoded";
    static final String VERB_DELIVERED = "delivered";
    static final String VERB_ENQUEUED = "enqueued";
    static final String VERB_ERRORED = "errored";
    static final String VERB_EXECUTING = "executing";
    static final String VERB_IGNORED = "ignored";
    static final String VERB_JOINED = "joined";
    static final String VERB_PAUSED = "paused";
    static final String VERB_REMOVED = "removed";
    static final String VERB_REPLAYING = "replaying";
    static final String VERB_RESUMED = "resumed";
    static final String VERB_RETRYING = "retrying";
    static final String VERB_TRANSFORMED = "transformed";
    static final StringBuilder MAIN_THREAD_KEY_BUILDER = new StringBuilder();
    private static final l WEBP_FILE_HEADER_RIFF = l.encodeUtf8("RIFF");
    private static final l WEBP_FILE_HEADER_WEBP = l.encodeUtf8("WEBP");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class PicassoThread extends Thread {
        public PicassoThread(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class PicassoThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new PicassoThread(runnable);
        }
    }

    private Utils() {
    }

    public static long calculateDiskCacheSize(File file) {
        long blockCountLong;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            blockCountLong = 5242880;
        }
        return Math.max(Math.min(blockCountLong, 52428800L), 5242880L);
    }

    public static int calculateMemoryCacheSize(Context context) {
        ActivityManager activityManager = (ActivityManager) getService(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7);
    }

    public static void checkMain() {
        if (!isMain()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static void checkNotMain() {
        if (isMain()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    public static <T> T checkNotNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static File createDefaultCacheDir(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), PICASSO_CACHE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String createKey(Request request) {
        StringBuilder sb2 = MAIN_THREAD_KEY_BUILDER;
        String strCreateKey = createKey(request, sb2);
        sb2.setLength(0);
        return strCreateKey;
    }

    public static void flushStackLocalLeaks(Looper looper) {
        Handler handler = new Handler(looper) { // from class: com.squareup.picasso.Utils.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000L);
            }
        };
        handler.sendMessageDelayed(handler.obtainMessage(), 1000L);
    }

    public static int getBitmapBytes(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String getLogIdsForHunter(BitmapHunter bitmapHunter) {
        return getLogIdsForHunter(bitmapHunter, "");
    }

    public static int getResourceId(Resources resources, Request request) throws FileNotFoundException {
        Uri uri;
        int i10 = request.resourceId;
        if (i10 != 0 || (uri = request.uri) == null) {
            return i10;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + request.uri);
        }
        List<String> pathSegments = request.uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + request.uri);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + request.uri);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + request.uri);
    }

    public static Resources getResources(Context context, Request request) throws FileNotFoundException {
        Uri uri;
        if (request.resourceId != 0 || (uri = request.uri) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + request.uri);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + request.uri);
        }
    }

    public static <T> T getService(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static boolean hasPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean isAirplaneModeOn(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static boolean isMain() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean isWebPFile(k kVar) throws IOException {
        return kVar.rangeEquals(0L, WEBP_FILE_HEADER_RIFF) && kVar.rangeEquals(8L, WEBP_FILE_HEADER_WEBP);
    }

    public static void log(String str, String str2, String str3) {
        log(str, str2, str3, "");
    }

    public static String getLogIdsForHunter(BitmapHunter bitmapHunter, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        Action action = bitmapHunter.getAction();
        if (action != null) {
            sb2.append(action.request.logId());
        }
        List<Action> actions = bitmapHunter.getActions();
        if (actions != null) {
            int size = actions.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0 || action != null) {
                    sb2.append(", ");
                }
                sb2.append(actions.get(i10).request.logId());
            }
        }
        return sb2.toString();
    }

    public static void log(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    public static String createKey(Request request, StringBuilder sb2) {
        String str = request.stableKey;
        if (str != null) {
            sb2.ensureCapacity(str.length() + 50);
            sb2.append(request.stableKey);
        } else {
            Uri uri = request.uri;
            if (uri != null) {
                String string = uri.toString();
                sb2.ensureCapacity(string.length() + 50);
                sb2.append(string);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(request.resourceId);
            }
        }
        sb2.append(KEY_SEPARATOR);
        if (request.rotationDegrees != 0.0f) {
            sb2.append("rotation:");
            sb2.append(request.rotationDegrees);
            if (request.hasRotationPivot) {
                sb2.append('@');
                sb2.append(request.rotationPivotX);
                sb2.append('x');
                sb2.append(request.rotationPivotY);
            }
            sb2.append(KEY_SEPARATOR);
        }
        if (request.hasSize()) {
            sb2.append("resize:");
            sb2.append(request.targetWidth);
            sb2.append('x');
            sb2.append(request.targetHeight);
            sb2.append(KEY_SEPARATOR);
        }
        if (request.centerCrop) {
            sb2.append("centerCrop:");
            sb2.append(request.centerCropGravity);
            sb2.append(KEY_SEPARATOR);
        } else if (request.centerInside) {
            sb2.append("centerInside");
            sb2.append(KEY_SEPARATOR);
        }
        List<Transformation> list = request.transformations;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(request.transformations.get(i10).key());
                sb2.append(KEY_SEPARATOR);
            }
        }
        return sb2.toString();
    }
}
