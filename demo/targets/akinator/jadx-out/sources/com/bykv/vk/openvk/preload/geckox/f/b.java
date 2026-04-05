package com.bykv.vk.openvk.preload.geckox.f;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import j1.o2;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f17153a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f17154b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private String f17155c;

    public b(Context context, String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        if (file == null) {
            this.f17155c = new File(context.getFilesDir(), o2.o(new StringBuilder("gecko_offline_res_x"), File.separator, str)).getAbsolutePath();
        } else {
            this.f17155c = new File(file, str).getAbsolutePath();
        }
    }

    private a d(String str) {
        a aVar;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.f17153a) {
            try {
                aVar = this.f17153a.get(strSubstring);
                if (aVar == null) {
                    aVar = new a(this.f17155c, strSubstring);
                    this.f17153a.put(strSubstring, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public final String a() {
        return this.f17155c;
    }

    public final int b(String str) throws Exception {
        if (this.f17154b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).c(str);
    }

    public final boolean c(String str) throws Exception {
        if (this.f17154b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).b(str);
    }

    public final InputStream a(String str) throws Exception {
        if (this.f17154b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).a(str);
    }

    public final Map<String, Long> b() {
        HashMap map = new HashMap();
        synchronized (this.f17153a) {
            try {
                Collection<a> collectionValues = this.f17153a.values();
                if (collectionValues == null) {
                    return map;
                }
                for (a aVar : collectionValues) {
                    map.put(aVar.b(), aVar.a());
                }
                return map;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() throws Exception {
        if (this.f17154b.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", "release version res loader");
        synchronized (this.f17153a) {
            try {
                Iterator<a> it = this.f17153a.values().iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                this.f17153a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
