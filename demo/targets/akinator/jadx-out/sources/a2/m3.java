package a2;

import kotlinx.coroutines.channels.Channel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m3 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Channel f3727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(Channel channel) {
        super(1);
        this.f3727e = channel;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m52invoke(obj);
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m52invoke(Object it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        this.f3727e.mo5139trySendJP2dKIU(tu.x0.f87415a);
    }
}
