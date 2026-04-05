package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a4;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a1 extends a4 implements a2 {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f50346b;

    public a1(HandlerThread handlerThread, a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f50346b = handlerThread;
    }

    public void a(a4.a aVar) {
        this.f50349a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f50346b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
