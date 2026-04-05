package k4;

import java.io.File;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f70278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f70279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(ProducerScope producerScope, File file) {
        super(1);
        this.f70278e = file;
        this.f70279f = producerScope;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(String str) {
        if (kotlin.jvm.internal.e0.areEqual(str, this.f70278e.getName())) {
            ChannelsKt.trySendBlocking(this.f70279f, tu.x0.f87415a);
        }
    }
}
