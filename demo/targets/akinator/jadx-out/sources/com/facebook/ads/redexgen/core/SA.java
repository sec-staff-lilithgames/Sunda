package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: assets/audience_network.dex */
public class SA implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ SF A01;

    public SA(SF sf2, SB sb2) {
        this.A01 = sf2;
        new Handler(Looper.getMainLooper()).post(new C1962dk(this, sf2, sb2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(SB sb2) throws SecurityException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1996eJ c1996eJA06 = C1996eJ.A06(this.A01.A04.A02());
        Uri uriA00 = WQ.A00(sb2.A08);
        long jA0S = sb2.A00;
        if (jA0S == -1) {
            jA0S = U7.A0S(this.A01.A04);
        }
        c1996eJA06.A0I(uriA00, new C1961dj(this, sb2, jA0S, jCurrentTimeMillis), jA0S);
    }
}
