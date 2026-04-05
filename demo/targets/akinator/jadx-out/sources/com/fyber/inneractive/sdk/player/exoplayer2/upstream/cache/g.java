package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f25886a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25887b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25888c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25889d;

    /* renamed from: e, reason: collision with root package name */
    public final File f25890e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25891f;

    public g(String str, long j10, long j11, long j12, File file) {
        this.f25886a = str;
        this.f25887b = j10;
        this.f25888c = j11;
        this.f25889d = file != null;
        this.f25890e = file;
        this.f25891f = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (!this.f25886a.equals(gVar.f25886a)) {
            return this.f25886a.compareTo(gVar.f25886a);
        }
        long j10 = this.f25887b - gVar.f25887b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }
}
