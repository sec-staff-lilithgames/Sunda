package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f25851a;

    /* renamed from: b, reason: collision with root package name */
    public y f25852b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f25853c;

    public b0(String str) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a;
        this.f25851a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.player.exoplayer2.util.y(str));
    }

    public final boolean a() {
        return this.f25852b != null;
    }

    public final void b() throws IOException {
        IOException iOException = this.f25853c;
        if (iOException != null) {
            throw iOException;
        }
        y yVar = this.f25852b;
        if (yVar != null) {
            int i10 = yVar.f26001c;
            IOException iOException2 = yVar.f26003e;
            if (iOException2 != null && yVar.f26004f > i10) {
                throw iOException2;
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.k kVar) {
        y yVar = this.f25852b;
        if (yVar != null) {
            yVar.a(true);
        }
        if (kVar != null) {
            this.f25851a.execute(kVar);
        }
        this.f25851a.shutdown();
    }
}
