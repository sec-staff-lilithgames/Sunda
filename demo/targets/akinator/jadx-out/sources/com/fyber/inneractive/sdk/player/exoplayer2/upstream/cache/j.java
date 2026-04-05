package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final TreeSet f25903a = new TreeSet(this);

    /* renamed from: b, reason: collision with root package name */
    public long f25904b;

    public final void a(l lVar, long j10) {
        while (this.f25904b + j10 > 10485760) {
            try {
                g gVar = (g) this.f25903a.first();
                synchronized (lVar) {
                    lVar.a(gVar, true);
                }
            } catch (a unused) {
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        long j10 = gVar.f25891f;
        long j11 = gVar2.f25891f;
        if (j10 - j11 != 0) {
            return j10 < j11 ? -1 : 1;
        }
        if (!gVar.f25886a.equals(gVar2.f25886a)) {
            return gVar.f25886a.compareTo(gVar2.f25886a);
        }
        long j12 = gVar.f25887b - gVar2.f25887b;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }
}
