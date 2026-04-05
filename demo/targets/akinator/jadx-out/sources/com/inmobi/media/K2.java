package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K2 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31936a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f31937b;

    /* renamed from: c, reason: collision with root package name */
    public Map f31938c;

    /* renamed from: d, reason: collision with root package name */
    public ThreadPoolExecutor f31939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(Looper looper) {
        super(looper);
        kotlin.jvm.internal.e0.checkNotNullParameter(looper, "looper");
        this.f31936a = new ArrayList();
        this.f31937b = new LinkedHashMap();
        this.f31938c = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02ad  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r25) {
        /*
            Method dump skipped, instructions count: 1486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.K2.handleMessage(android.os.Message):void");
    }
}
