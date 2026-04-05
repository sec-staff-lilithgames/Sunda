package kotlinx.serialization;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class e implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f71913c;

    public /* synthetic */ e(List list, int i10) {
        this.f71912b = i10;
        this.f71913c = list;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f71912b) {
            case 0:
                return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(this.f71913c);
            default:
                return SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(this.f71913c);
        }
    }
}
