package rq;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public static final c f84964e = new c(0);

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final or.a invoke() {
        HandlerThread handlerThread = new HandlerThread("BrokenCreativeDetectorTaskManager");
        handlerThread.start();
        return new or.a(new Handler(handlerThread.getLooper()));
    }
}
