package kotlinx.coroutines.flow;

import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71889b;

    public /* synthetic */ c(int i10) {
        this.f71889b = i10;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f71889b) {
            case 0:
                return FlowKt__DistinctKt.defaultKeySelector$lambda$0$FlowKt__DistinctKt(obj);
            default:
                return Boolean.valueOf(FlowKt__MigrationKt.onErrorReturn$lambda$0$FlowKt__MigrationKt((Throwable) obj));
        }
    }
}
