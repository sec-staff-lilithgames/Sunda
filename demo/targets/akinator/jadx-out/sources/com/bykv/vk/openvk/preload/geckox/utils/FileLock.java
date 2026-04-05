package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import b0.e2;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class FileLock {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f17216a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f17217b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17218c;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int i10) {
        this.f17218c = str;
        this.f17217b = i10;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e10) {
            StringBuilder sbO = e3.g.o("lock failed, file:", str, ", pid:");
            sbO.append(Process.myPid());
            sbO.append(" caused by:");
            sbO.append(e10.getMessage());
            throw new RuntimeException(sbO.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e10) {
            throw new RuntimeException(e2.l(e10, e3.g.o("try lock failed, file:", str, " caused by:")));
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            new FileLock(str, iD).b();
            return null;
        } catch (Exception e10) {
            throw new RuntimeException(e2.l(e10, e3.g.o("try lock failed, file:", str, " caused by:")));
        }
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f17216a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i10) throws Exception;

    private static native void nLockFileSegment(int i10, int i11) throws Exception;

    private static native void nRelease(int i10) throws Exception;

    private static native boolean nTryLock(int i10) throws Exception;

    private static native void nUnlockFile(int i10) throws Exception;

    public static FileLock a(String str, int i10) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i10);
            return new FileLock(str, iD);
        } catch (Exception e10) {
            throw new RuntimeException(e2.l(e10, e3.g.o("lock segment failed, file:", str, " caused by:")));
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f17216a;
        synchronized (map) {
            numRemove = map.remove(this.f17218c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e10) {
            throw new RuntimeException("release lock failed, file:" + this.f17218c + " caused by:" + e10.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f17217b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f17218c);
        }
    }
}
