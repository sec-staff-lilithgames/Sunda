package kotlinx.serialization.internal;

import kotlinx.serialization.DeserializationStrategy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class c implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaggedDecoder f71922c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DeserializationStrategy f71923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f71924f;

    public /* synthetic */ c(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj, int i10) {
        this.f71921b = i10;
        this.f71922c = taggedDecoder;
        this.f71923e = deserializationStrategy;
        this.f71924f = obj;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f71921b) {
            case 0:
                return this.f71922c.decodeSerializableValue(this.f71923e, this.f71924f);
            default:
                return TaggedDecoder.decodeNullableSerializableElement$lambda$3(this.f71922c, this.f71923e, this.f71924f);
        }
    }
}
