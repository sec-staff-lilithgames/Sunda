package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public /* synthetic */ class JsonElementMarker$origin$1 extends a0 implements p {
    public JsonElementMarker$origin$1(Object obj) {
        super(2, obj, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
    }

    public final Boolean invoke(SerialDescriptor p02, int i10) {
        e0.checkNotNullParameter(p02, "p0");
        return Boolean.valueOf(((JsonElementMarker) this.receiver).readIfAbsent(p02, i10));
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((SerialDescriptor) obj, ((Number) obj2).intValue());
    }
}
