package kotlinx.serialization;

import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KSerializer f71907c;

    public /* synthetic */ a(KSerializer kSerializer, int i10) {
        this.f71906b = i10;
        this.f71907c = kSerializer;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f71906b) {
            case 0:
                return ContextualSerializer.descriptor$lambda$0((ContextualSerializer) this.f71907c, (ClassSerialDescriptorBuilder) obj);
            default:
                return PolymorphicSerializer.descriptor_delegate$lambda$1$lambda$0((PolymorphicSerializer) this.f71907c, (ClassSerialDescriptorBuilder) obj);
        }
    }
}
