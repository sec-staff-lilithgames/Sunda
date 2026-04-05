package kotlinx.coroutines.channels;

import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71885c;

    public /* synthetic */ d(Object obj, int i10) {
        this.f71884b = i10;
        this.f71885c = obj;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f71884b) {
            case 0:
                return ChannelsKt__DeprecatedKt.consumes$lambda$24$ChannelsKt__DeprecatedKt((ReceiveChannel) this.f71885c, (Throwable) obj);
            case 1:
                return BroadcastKt.broadcast$lambda$1((ReceiveChannel) this.f71885c, (Throwable) obj);
            default:
                return ChannelsKt__DeprecatedKt.consumesAll$lambda$2$ChannelsKt__DeprecatedKt((ReceiveChannel[]) this.f71885c, (Throwable) obj);
        }
    }
}
