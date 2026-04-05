package kotlinx.serialization.internal;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KSerializer f71917c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ KSerializer f71918e;

    public /* synthetic */ a(KSerializer kSerializer, KSerializer kSerializer2, int i10) {
        this.f71916b = i10;
        this.f71917c = kSerializer;
        this.f71918e = kSerializer2;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f71916b) {
            case 0:
                return MapEntrySerializer.descriptor$lambda$0(this.f71917c, this.f71918e, (ClassSerialDescriptorBuilder) obj);
            default:
                return PairSerializer.descriptor$lambda$0(this.f71917c, this.f71918e, (ClassSerialDescriptorBuilder) obj);
        }
    }
}
