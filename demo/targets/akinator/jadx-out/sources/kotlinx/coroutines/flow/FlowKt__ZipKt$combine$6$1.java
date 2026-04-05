package kotlinx.coroutines.flow;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__ZipKt$combine$6$1 implements kv.a {
    final /* synthetic */ Flow<T>[] $flowArray;

    public FlowKt__ZipKt$combine$6$1(Flow<T>[] flowArr) {
        this.$flowArray = flowArr;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T[], java.lang.Object[]] */
    @Override // kv.a
    public final T[] invoke() {
        int length = this.$flowArray.length;
        e0.reifiedOperationMarker(0, "T?");
        return new Object[length];
    }
}
