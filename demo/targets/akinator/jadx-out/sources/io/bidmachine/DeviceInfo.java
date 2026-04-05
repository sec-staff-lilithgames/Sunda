package io.bidmachine;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class DeviceInfo {
    private static final String OS_NAME = "android";
    private static volatile DeviceInfo instance;
    private final k2 cache;
    private final y1 cpu;
    private final z1 gpu;
    private String hwv;
    private Boolean isRooted;
    public final boolean isTablet;
    public final String manufacturer;
    public final String model;
    public final String osName;
    public final String osVersion;
    public final String phoneCarrier;
    public final String phoneMCCMNC;
    public final float screenDensity;
    public final int screenDpi;
    private Long totalDiskSpaceInMB;
    private final x1 audio = new x1();
    private final a2 ram = new a2();

    private DeviceInfo(Context context) {
        k2 k2Var = new k2();
        this.cache = k2Var;
        this.cpu = new y1(k2Var);
        this.gpu = new z1(k2Var);
        this.osName = "android";
        this.osVersion = String.valueOf(Build.VERSION.SDK_INT);
        this.manufacturer = ir.b.getManufacturer();
        this.model = ir.b.getModel();
        this.screenDpi = pr.d.getScreenDpi(context);
        this.screenDensity = ir.b.getScreenDensity(context);
        this.isTablet = ir.b.isTablet(context);
        this.phoneMCCMNC = ir.b.getPhoneMCCMNC(context);
        this.phoneCarrier = ir.b.getPhoneOperatorName(context);
    }

    private String getKernelVersionThroughProcVersion() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
            try {
                String line = randomAccessFile.readLine();
                nm.j.close(randomAccessFile);
                return line;
            } catch (Exception unused) {
                nm.j.close(randomAccessFile);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                nm.j.close(randomAccessFile);
                throw th2;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th4) {
            randomAccessFile = null;
            th2 = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getKernelVersionThroughUName() throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3e
            java.lang.String r2 = "uname -a"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3e
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L4d
            nm.j.close(r3)
            nm.j.close(r2)
            r1.destroy()
            return r0
        L27:
            r0 = move-exception
            goto L41
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
            goto L41
        L2e:
            r3 = r0
            goto L4d
        L30:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L41
        L35:
            r2 = r0
        L36:
            r3 = r2
            goto L4d
        L38:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
            goto L41
        L3e:
            r1 = r0
            r2 = r1
            goto L36
        L41:
            nm.j.close(r3)
            nm.j.close(r2)
            if (r1 == 0) goto L4c
            r1.destroy()
        L4c:
            throw r0
        L4d:
            nm.j.close(r3)
            nm.j.close(r2)
            if (r1 == 0) goto L58
            r1.destroy()
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.DeviceInfo.getKernelVersionThroughUName():java.lang.String");
    }

    public static DeviceInfo obtain(Context context) {
        DeviceInfo deviceInfo;
        DeviceInfo deviceInfo2 = instance;
        if (deviceInfo2 != null) {
            return deviceInfo2;
        }
        synchronized (DeviceInfo.class) {
            try {
                deviceInfo = instance;
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo(context);
                    instance = deviceInfo;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceInfo;
    }

    public x1 getAudio() {
        return this.audio;
    }

    public Long getAvailableDiskSpaceInMB() {
        try {
            if (!nm.j.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576);
        } catch (Exception unused) {
            return null;
        }
    }

    public y1 getCpu() {
        return this.cpu;
    }

    public z1 getGpu() {
        return this.gpu;
    }

    public String getHWV() {
        String str = this.hwv;
        if (str != null) {
            return str;
        }
        String kernelVersionThroughProcVersion = getKernelVersionThroughProcVersion();
        if (!TextUtils.isEmpty(kernelVersionThroughProcVersion)) {
            this.hwv = kernelVersionThroughProcVersion;
            return kernelVersionThroughProcVersion;
        }
        String kernelVersionThroughUName = getKernelVersionThroughUName();
        this.hwv = kernelVersionThroughUName;
        return kernelVersionThroughUName;
    }

    public a2 getRam() {
        return this.ram;
    }

    public Long getTotalDiskSpaceInMB() {
        Long l9 = this.totalDiskSpaceInMB;
        if (l9 != null) {
            return l9;
        }
        try {
            if (!nm.j.isExternalMemoryAvailable()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            Long lValueOf = Long.valueOf((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1048576);
            this.totalDiskSpaceInMB = lValueOf;
            return lValueOf;
        } catch (Exception unused) {
            return null;
        }
    }

    public void updateHwInfo(Context context) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        EGLContext eGLContextEglCreateContext;
        EGLDisplay eGLDisplay;
        EGLDisplay eGLDisplayEglGetDisplay;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLConfig eGLConfig;
        RandomAccessFile randomAccessFile3;
        RandomAccessFile randomAccessFile4;
        Long lValueOf;
        Long lValueOf2;
        y1 y1Var = this.cpu;
        k2 k2Var = y1Var.f62048a;
        if (TextUtils.isEmpty(y1Var.f62049b)) {
            y1Var.f62049b = k2.a(context, "cpu_name");
        }
        if (TextUtils.isEmpty(y1Var.f62050c)) {
            y1Var.f62050c = k2.a(context, "cpu_vendor");
        }
        if (TextUtils.isEmpty(y1Var.f62049b) || TextUtils.isEmpty(y1Var.f62050c)) {
            try {
                randomAccessFile2 = new RandomAccessFile("/proc/cpuinfo", "r");
                while (true) {
                    try {
                        String line = randomAccessFile2.readLine();
                        if (line != null) {
                            if (line.startsWith("model name:") || line.startsWith("Hardware:")) {
                                Matcher matcher = Pattern.compile(":\\s*(.*)").matcher(line);
                                y1Var.f62049b = matcher.find() ? matcher.group(1) : null;
                            } else if (line.startsWith("vendor_id:")) {
                                Matcher matcher2 = Pattern.compile(":\\s*(.*)").matcher(line);
                                y1Var.f62050c = matcher2.find() ? matcher2.group(1) : null;
                            }
                            if (y1Var.f62049b != null && y1Var.f62050c != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = randomAccessFile2;
                        nm.j.close(randomAccessFile);
                        throw th;
                    }
                }
            } catch (Exception unused2) {
                randomAccessFile2 = null;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
            }
            nm.j.close(randomAccessFile2);
            if (TextUtils.isEmpty(y1Var.f62049b)) {
                y1Var.f62049b = Build.BOARD;
            }
            if (TextUtils.isEmpty(y1Var.f62050c)) {
                y1Var.f62050c = Build.HARDWARE;
            }
            k2.b(context, "cpu_name", y1Var.f62049b);
            k2.b(context, "cpu_vendor", y1Var.f62050c);
        }
        z1 z1Var = this.gpu;
        k2 k2Var2 = z1Var.f62070a;
        if (TextUtils.isEmpty(z1Var.f62071b)) {
            z1Var.f62071b = k2.a(context, "gpu_name");
        }
        if (TextUtils.isEmpty(z1Var.f62072c)) {
            z1Var.f62072c = k2.a(context, "gpu_vendor");
        }
        if (TextUtils.isEmpty(z1Var.f62071b) || TextUtils.isEmpty(z1Var.f62072c)) {
            try {
                eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                int[] iArr = new int[2];
                EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
                try {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
                    eGLConfig = iArr2[0] == 0 ? null : eGLConfigArr[0];
                } catch (Exception unused3) {
                    eGLContextEglCreateContext = null;
                } catch (Throwable th4) {
                    th = th4;
                    eGLDisplay = eGLDisplayEglGetDisplay;
                    eGLContextEglCreateContext = null;
                    eGLSurfaceEglCreatePbufferSurface = null;
                    z1.a(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                    throw th;
                }
            } catch (Exception unused4) {
                eGLContextEglCreateContext = null;
                eGLDisplayEglGetDisplay = null;
            } catch (Throwable th5) {
                th = th5;
                eGLContextEglCreateContext = null;
                eGLDisplay = null;
            }
            if (eGLConfig != null) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
                try {
                    eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    try {
                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                        z1Var.f62071b = GLES20.glGetString(7937);
                        z1Var.f62072c = GLES20.glGetString(7936);
                    } catch (Exception unused5) {
                    } catch (Throwable th6) {
                        th = th6;
                        eGLDisplay = eGLDisplayEglGetDisplay;
                        z1.a(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                        throw th;
                    }
                } catch (Exception unused6) {
                    eGLContextEglCreateContext = null;
                } catch (Throwable th7) {
                    th = th7;
                    eGLDisplay = eGLDisplayEglGetDisplay;
                    eGLContextEglCreateContext = null;
                }
                z1.a(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                k2.b(context, "gpu_name", z1Var.f62071b);
                k2.b(context, "gpu_vendor", z1Var.f62072c);
            } else {
                eGLContextEglCreateContext = null;
                eGLSurfaceEglCreatePbufferSurface = null;
                z1.a(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                k2.b(context, "gpu_name", z1Var.f62071b);
                k2.b(context, "gpu_vendor", z1Var.f62072c);
            }
        }
        a2 a2Var = this.ram;
        a2Var.getClass();
        try {
            RandomAccessFile randomAccessFile5 = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
            while (true) {
                try {
                    String line2 = randomAccessFile5.readLine();
                    if (line2 != null) {
                        if (line2.startsWith("MemTotal:")) {
                            Matcher matcher3 = Pattern.compile("(\\d+)").matcher(line2);
                            String strGroup = matcher3.find() ? matcher3.group(1) : null;
                            if (strGroup != null) {
                                try {
                                    lValueOf2 = Long.valueOf(Long.parseLong(strGroup) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
                                } catch (NumberFormatException unused7) {
                                }
                                a2Var.f59837a = lValueOf2;
                            } else {
                                lValueOf2 = null;
                                a2Var.f59837a = lValueOf2;
                            }
                        } else if (line2.startsWith("MemAvailable:")) {
                            Matcher matcher4 = Pattern.compile("(\\d+)").matcher(line2);
                            String strGroup2 = matcher4.find() ? matcher4.group(1) : null;
                            if (strGroup2 != null) {
                                try {
                                    lValueOf = Long.valueOf(Long.parseLong(strGroup2) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
                                } catch (NumberFormatException unused8) {
                                }
                                a2Var.f59838b = lValueOf;
                            } else {
                                lValueOf = null;
                                a2Var.f59838b = lValueOf;
                            }
                        }
                        if (a2Var.f59837a != null && a2Var.f59838b != null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Exception unused9) {
                    randomAccessFile4 = randomAccessFile5;
                    nm.j.close(randomAccessFile4);
                    return;
                } catch (Throwable th8) {
                    th = th8;
                    randomAccessFile3 = randomAccessFile5;
                    nm.j.close(randomAccessFile3);
                    throw th;
                }
            }
            nm.j.close(randomAccessFile5);
        } catch (Exception unused10) {
            randomAccessFile4 = null;
        } catch (Throwable th9) {
            th = th9;
            randomAccessFile3 = null;
        }
    }

    public boolean isDeviceRooted() {
        Boolean bool = this.isRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = true;
        try {
            String[] strArr = {"/sbin/su", gjnZrsdA.ZlqJSBJaKf, "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10]).exists()) {
                    this.isRooted = Boolean.TRUE;
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() == null) {
                z10 = false;
            }
            this.isRooted = Boolean.valueOf(z10);
            processExec.destroy();
            return z10;
        } catch (Exception unused2) {
            if (processExec != null) {
                processExec.destroy();
            }
            this.isRooted = Boolean.FALSE;
            return false;
        } catch (Throwable th2) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th2;
        }
    }
}
