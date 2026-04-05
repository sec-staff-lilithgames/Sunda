package com.fyber.inneractive.sdk.nativead;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.player.cache.g;
import com.fyber.inneractive.sdk.player.cache.l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f24183a;

    public a(b bVar) {
        this.f24183a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        File fileA = b.a(this.f24183a);
        if (fileA != null) {
            try {
                IAlog.a("NativeCache opening the cache in directory - %s", fileA);
                this.f24183a.f24186b = g.a(fileA, 41943040L);
                g gVar = this.f24183a.f24186b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f24358a);
                this.f24183a.f24186b = g.a(fileA, 41943040L);
                g gVar2 = this.f24183a.f24186b;
                synchronized (gVar2) {
                    j10 = gVar2.f24365h;
                }
                IAlog.a("NativeCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j10));
                b bVar = this.f24183a;
                bVar.f24186b.f24369l = bVar;
                bVar.f24187c = true;
            } catch (Throwable th2) {
                z.a("Failed to open cache directory", th2.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th2, new Object[0]);
            }
        }
    }
}
