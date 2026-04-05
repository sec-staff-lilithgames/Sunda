package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.util.o;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a f23145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.c f23146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f23147c;

    public d(e eVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        this.f23147c = eVar;
        this.f23145a = aVar;
        this.f23146b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f23147c.f23150c) {
            try {
                com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.f23145a;
                if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                    g gVar = (g) this.f23147c.f23148a.f23158a.get(this.f23146b);
                    if (gVar != null) {
                        int i10 = f.f23153a[aVar.ordinal()];
                        if (i10 == 1) {
                            gVar.f23155b++;
                        } else if (i10 == 2) {
                            gVar.f23156c++;
                        } else if (i10 == 3) {
                            gVar.f23154a++;
                        }
                    }
                } else {
                    this.f23147c.f23148a = new i();
                }
                try {
                    o.a(o.f26796a, e.a(this.f23147c).toString().getBytes(C.UTF8_NAME));
                } catch (UnsupportedEncodingException unused) {
                }
                this.f23147c.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
