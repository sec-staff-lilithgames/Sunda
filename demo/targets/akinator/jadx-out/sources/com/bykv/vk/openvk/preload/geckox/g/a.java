package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f17156a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private FileLock f17157b;

    /* renamed from: c, reason: collision with root package name */
    private String f17158c;

    private a(String str, FileLock fileLock) {
        this.f17158c = str;
        this.f17157b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f17156a;
        synchronized (map) {
            try {
                Lock reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                if (!reentrantLock.tryLock()) {
                    return null;
                }
                try {
                    FileLock fileLockC = FileLock.c(str);
                    if (fileLockC == null) {
                        reentrantLock.unlock();
                        return null;
                    }
                    return new a(str, fileLockC);
                } catch (Exception e10) {
                    reentrantLock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e10));
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f17156a;
        synchronized (map) {
            try {
                try {
                    this.f17157b.a();
                    this.f17157b.b();
                    map.get(this.f17158c).unlock();
                } catch (Throwable th2) {
                    f17156a.get(this.f17158c).unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
