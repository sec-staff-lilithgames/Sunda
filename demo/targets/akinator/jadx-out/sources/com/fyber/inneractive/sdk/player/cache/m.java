package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f24381a;

    public m(n nVar) {
        this.f24381a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        File fileA = n.a(this.f24381a.f24383a, "fyb.vamp.vid.cache");
        if (fileA != null) {
            try {
                IAlog.a("VideoCache opening the cache in directory - %s", fileA);
                this.f24381a.f24384b = g.a(fileA, 52428800L);
                g gVar = this.f24381a.f24384b;
                gVar.getClass();
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f24358a);
                this.f24381a.f24384b = g.a(fileA, 52428800L);
                g gVar2 = this.f24381a.f24384b;
                synchronized (gVar2) {
                    j10 = gVar2.f24365h;
                }
                IAlog.a("VideoCache opened the cache in directory - %s current size is %d", fileA, Long.valueOf(j10));
                n nVar = this.f24381a;
                nVar.f24384b.f24369l = nVar;
                nVar.f24385c = true;
            } catch (Throwable th2) {
                z.a("Failed to open cache directory", th2.getMessage(), null, null);
                IAlog.a("Failed to open cache directory", th2, new Object[0]);
            }
        }
    }
}
