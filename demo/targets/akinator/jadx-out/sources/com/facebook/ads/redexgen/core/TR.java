package com.facebook.ads.redexgen.core;

import java.util.concurrent.Callable;

/* loaded from: assets/audience_network.dex */
public class TR implements Callable<Boolean> {
    public final /* synthetic */ W4 A00;
    public final /* synthetic */ String A01;

    public TR(W4 w42, String str) {
        this.A00 = w42;
        this.A01 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        this.A00.A05();
        synchronized (TT.A04) {
            TT.A04.put(this.A01, 2);
        }
        return true;
    }
}
