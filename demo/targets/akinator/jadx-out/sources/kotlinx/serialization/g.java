package kotlinx.serialization;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f71915c;

    public /* synthetic */ g(Object obj, int i10) {
        this.f71914b = i10;
        this.f71915c = obj;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f71914b) {
            case 0:
                return SerializersKt__SerializersKt.serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt((ArrayList) this.f71915c);
            default:
                return PolymorphicSerializer.descriptor_delegate$lambda$1((PolymorphicSerializer) this.f71915c);
        }
    }
}
