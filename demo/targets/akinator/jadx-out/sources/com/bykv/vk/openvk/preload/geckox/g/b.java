package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f17159a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static ReentrantLock f17160b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private String f17161c;

    /* renamed from: d, reason: collision with root package name */
    private FileLock f17162d;

    private b(String str, FileLock fileLock) {
        this.f17161c = str;
        this.f17162d = fileLock;
    }

    public static b a(String str) throws Exception {
        f17160b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f17159a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e10) {
            f17160b.unlock();
            throw e10;
        }
    }

    public final void a() {
        try {
            this.f17162d.a();
            this.f17162d.b();
            Lock lock = f17159a.get(this.f17161c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f17160b.unlock();
        }
    }
}
