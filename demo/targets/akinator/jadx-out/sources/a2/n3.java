package a2;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final n3 f3734a = new n3();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f3735b = new AtomicBoolean(false);

    public final void ensureStarted() {
        if (f3735b.compareAndSet(false, true)) {
            Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(p1.f3753o.getMain()), null, null, new l3(channelChannel$default, null), 3, null);
            b1.m.f8651e.registerGlobalWriteObserver(new m3(channelChannel$default));
        }
    }
}
