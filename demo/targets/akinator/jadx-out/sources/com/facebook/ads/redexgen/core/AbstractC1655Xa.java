package com.facebook.ads.redexgen.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.redexgen.X.Xa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1655Xa {
    public static final int A00 = Runtime.getRuntime().availableProcessors();
    public static final ExecutorService A01 = Executors.newFixedThreadPool(A00);
    public static volatile boolean A02 = true;
}
