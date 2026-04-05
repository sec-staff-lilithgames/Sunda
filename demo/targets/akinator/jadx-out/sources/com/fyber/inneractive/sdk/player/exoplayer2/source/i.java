package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f25759a;

    public i(p pVar) {
        this.f25759a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f25759a;
        if (pVar.G || pVar.f25798s || pVar.f25796q == null || !pVar.f25797r) {
            return;
        }
        int size = pVar.f25794o.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f25794o.valueAt(i10)).e() == null) {
                return;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = pVar.f25790k;
        synchronized (eVar) {
            eVar.f26015a = false;
        }
        y[] yVarArr = new y[size];
        pVar.f25805z = new boolean[size];
        pVar.f25804y = new boolean[size];
        pVar.f25803x = pVar.f25796q.c();
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 >= size) {
                pVar.f25802w = new z(yVarArr);
                pVar.f25798s = true;
                t tVar = pVar.f25785f;
                long j10 = pVar.f25803x;
                tVar.a(new x(j10, j10, 0L, 0L, pVar.f25796q.a(), false), null);
                ((com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f25795p).f25604f.obtainMessage(8, pVar).sendToTarget();
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f25794o.valueAt(i11)).e();
            yVarArr[i11] = new y(oVarE);
            String str = oVarE.f25701f;
            if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) && !"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                z10 = false;
            }
            pVar.f25805z[i11] = z10;
            pVar.A = z10 | pVar.A;
            i11++;
        }
    }
}
