package com.fyber.inneractive.sdk.nativead;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.cache.f;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final b f24184f = new b();

    /* renamed from: a, reason: collision with root package name */
    public Context f24185a;

    /* renamed from: b, reason: collision with root package name */
    public g f24186b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24187c = false;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f24188d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final a f24189e = new a(this);

    public static File a(b bVar) {
        String externalStorageState;
        File externalCacheDir;
        String externalStorageState2 = "";
        Context context = bVar.f24185a;
        if (context != null && !TextUtils.isEmpty("assets")) {
            if (o.f26796a != null && o.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                try {
                    externalStorageState = Environment.getExternalStorageState();
                } catch (Throwable unused) {
                    externalStorageState = "";
                }
                if ("mounted".equals(externalStorageState)) {
                    try {
                        externalStorageState2 = Environment.getExternalStorageState();
                    } catch (Throwable unused2) {
                    }
                    if (("mounted".equals(externalStorageState2) || "mounted_ro".equals(externalStorageState2)) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.getFreeSpace() > 41943040) {
                        return new File(context.getExternalCacheDir(), "assets");
                    }
                }
            }
            File cacheDir = context.getCacheDir();
            if (cacheDir != null && cacheDir.getFreeSpace() > 41943040) {
                return new File(context.getCacheDir(), "assets");
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.cache.f
    public final boolean a(String str) {
        Iterator it = this.f24188d.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        boolean z10;
        g gVar = this.f24186b;
        if (gVar != null) {
            synchronized (gVar) {
                z10 = gVar.f24366i == null;
            }
            if (!z10) {
                try {
                    this.f24186b.close();
                    this.f24187c = false;
                    return;
                } catch (Throwable th2) {
                    IAlog.f("%s: destroy: Error closing cache: %s", "NativeCache", th2);
                    return;
                }
            }
        }
        IAlog.c("%s: destroy: cache already closed or not exists", "NativeCache");
    }
}
