package x8;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f91819e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f91820f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f91821g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile g0 f91822h;

    /* renamed from: b, reason: collision with root package name */
    public int f91824b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f91825c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f91826d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f91823a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f91819e = i10 < 29;
        f91820f = i10 >= 28;
        f91821g = new File("/proc/self/fd");
    }

    public static g0 getInstance() {
        if (f91822h == null) {
            synchronized (g0.class) {
                try {
                    if (f91822h == null) {
                        f91822h = new g0();
                    }
                } finally {
                }
            }
        }
        return f91822h;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f91823a;
    }

    public void blockHardwareBitmaps() {
        j9.s.assertMainThread();
        this.f91826d.set(false);
    }

    public boolean isHardwareConfigAllowed(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        if (z10) {
            if (f91820f) {
                if (!f91819e || this.f91826d.get()) {
                    if (z11) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i10 >= 0 && i11 >= 0) {
                        synchronized (this) {
                            try {
                                int i12 = this.f91824b + 1;
                                this.f91824b = i12;
                                if (i12 >= 50) {
                                    this.f91824b = 0;
                                    int length = f91821g.list().length;
                                    long jA = a();
                                    boolean z13 = ((long) length) < jA;
                                    this.f91825c = z13;
                                    if (!z13 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jA);
                                    }
                                }
                                z12 = this.f91825c;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (z12) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }

    public void unblockHardwareBitmaps() {
        j9.s.assertMainThread();
        this.f91826d.set(true);
    }
}
