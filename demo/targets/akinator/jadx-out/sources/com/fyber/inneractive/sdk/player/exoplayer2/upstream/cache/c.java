package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l f25854a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25855b = 10485760;

    /* renamed from: c, reason: collision with root package name */
    public final int f25856c = CacheDataSink.DEFAULT_BUFFER_SIZE;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f25857d;

    /* renamed from: e, reason: collision with root package name */
    public File f25858e;

    /* renamed from: f, reason: collision with root package name */
    public OutputStream f25859f;

    /* renamed from: g, reason: collision with root package name */
    public FileOutputStream f25860g;

    /* renamed from: h, reason: collision with root package name */
    public long f25861h;

    /* renamed from: i, reason: collision with root package name */
    public long f25862i;

    /* renamed from: j, reason: collision with root package name */
    public p f25863j;

    public c(l lVar) {
        this.f25854a = lVar;
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.f25859f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f25860g.getFD().sync();
            z.a(this.f25859f);
            this.f25859f = null;
            File file = this.f25858e;
            this.f25858e = null;
            l lVar = this.f25854a;
            synchronized (lVar) {
                m mVarA = m.a(file, lVar.f25910d);
                if (mVarA == null) {
                    throw new IllegalStateException();
                }
                if (!lVar.f25909c.containsKey(mVarA.f25886a)) {
                    throw new IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long jA = lVar.a(mVarA.f25886a);
                    if (jA != -1 && mVarA.f25887b + mVarA.f25888c > jA) {
                        throw new IllegalStateException();
                    }
                    lVar.a(mVarA);
                    lVar.f25910d.b();
                    lVar.notifyAll();
                }
            }
        } catch (Throwable th2) {
            z.a(this.f25859f);
            this.f25859f = null;
            File file2 = this.f25858e;
            this.f25858e = null;
            file2.delete();
            throw th2;
        }
    }

    public final void b() {
        File file;
        long j10 = this.f25857d.f25947d;
        long jMin = j10 == -1 ? this.f25855b : Math.min(j10 - this.f25862i, this.f25855b);
        l lVar = this.f25854a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.f25857d;
        String str = kVar.f25948e;
        long j11 = kVar.f25945b + this.f25862i;
        synchronized (lVar) {
            try {
                if (!lVar.f25909c.containsKey(str)) {
                    throw new IllegalStateException();
                }
                if (!lVar.f25907a.exists()) {
                    lVar.a();
                    lVar.f25907a.mkdirs();
                }
                lVar.f25908b.a(lVar, jMin);
                File file2 = lVar.f25907a;
                i iVar = lVar.f25910d;
                h hVarA = (h) iVar.f25896a.get(str);
                if (hVarA == null) {
                    hVarA = iVar.a(str, -1L);
                }
                int i10 = hVarA.f25892a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Pattern pattern = m.f25913g;
                file = new File(file2, i10 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f25858e = file;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f25858e);
        this.f25860g = fileOutputStream;
        if (this.f25856c > 0) {
            p pVar = this.f25863j;
            if (pVar == null) {
                this.f25863j = new p(this.f25860g, this.f25856c);
            } else {
                pVar.a(fileOutputStream);
            }
            this.f25859f = this.f25863j;
        } else {
            this.f25859f = fileOutputStream;
        }
        this.f25861h = 0L;
    }
}
