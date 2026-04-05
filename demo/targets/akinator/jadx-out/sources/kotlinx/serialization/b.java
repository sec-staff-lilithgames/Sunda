package kotlinx.serialization;

import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SealedClassSerializer f71909c;

    public /* synthetic */ b(SealedClassSerializer sealedClassSerializer, int i10) {
        this.f71908b = i10;
        this.f71909c = sealedClassSerializer;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f71908b) {
            case 0:
                return SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2(this.f71909c, (ClassSerialDescriptorBuilder) obj);
            default:
                return SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2$lambda$1(this.f71909c, (ClassSerialDescriptorBuilder) obj);
        }
    }
}
