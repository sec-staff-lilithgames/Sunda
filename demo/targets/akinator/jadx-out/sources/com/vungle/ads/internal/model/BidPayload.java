package com.vungle.ads.internal.model;

import android.util.Base64;
import gv.d;
import j1.o2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kv.l;
import tu.f;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class BidPayload {
    public static final Companion Companion = new Companion(null);

    /* renamed from: ad, reason: collision with root package name */
    private final AdPayload f50767ad;
    private final String adunit;
    private final List<String> impression;
    private final Json json;
    private final Integer version;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.model.BidPayload$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JsonBuilder) obj);
            return x0.f87415a;
        }

        public final void invoke(JsonBuilder Json) {
            e0.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<BidPayload> serializer() {
            return BidPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BidPayload() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidPayload copy$default(BidPayload bidPayload, Integer num, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = bidPayload.version;
        }
        if ((i10 & 2) != 0) {
            str = bidPayload.adunit;
        }
        if ((i10 & 4) != 0) {
            list = bidPayload.impression;
        }
        return bidPayload.copy(num, str, list);
    }

    private final String gzipDecode(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr2);
                    if (i10 == -1) {
                        d.closeFinally(gZIPInputStream, null);
                        d.closeFinally(byteArrayInputStream, null);
                        String string = byteArrayOutputStream.toString();
                        e0.checkNotNullExpressionValue(string, "result.toString()");
                        return string;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i10);
                }
            } finally {
            }
        } finally {
        }
    }

    public static final void write$Self(BidPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        String decodedAdsResponse;
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.version != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.version);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.adunit != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.adunit);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.impression != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, new ArrayListSerializer(StringSerializer.INSTANCE), self.impression);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3)) {
            AdPayload adPayload = self.f50767ad;
            AdPayload adPayload2 = null;
            if (self.adunit != null && (decodedAdsResponse = self.getDecodedAdsResponse()) != null) {
                Json json = self.json;
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(json.getSerializersModule(), c1.typeOf(AdPayload.class));
                e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                adPayload2 = (AdPayload) json.decodeFromString(kSerializerSerializer, decodedAdsResponse);
            }
            if (e0.areEqual(adPayload, adPayload2)) {
                return;
            }
        }
        output.encodeNullableSerializableElement(serialDesc, 3, AdPayload$$serializer.INSTANCE, self.f50767ad);
    }

    public final Integer component1() {
        return this.version;
    }

    public final String component2() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final BidPayload copy(Integer num, String str, List<String> list) {
        return new BidPayload(num, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BidPayload)) {
            return false;
        }
        BidPayload bidPayload = (BidPayload) obj;
        return e0.areEqual(this.version, bidPayload.version) && e0.areEqual(this.adunit, bidPayload.adunit) && e0.areEqual(this.impression, bidPayload.impression);
    }

    public final AdPayload getAdPayload() {
        return this.f50767ad;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final String getCreativeId() {
        AdPayload adPayload = this.f50767ad;
        if (adPayload != null) {
            return adPayload.getCreativeId();
        }
        return null;
    }

    public final String getDecodedAdsResponse() throws Throwable {
        byte[] bArrDecode = Base64.decode(this.adunit, 0);
        if (bArrDecode != null) {
            return gzipDecode(bArrDecode);
        }
        return null;
    }

    public final String getEventId() {
        AdPayload adPayload = this.f50767ad;
        if (adPayload != null) {
            return adPayload.eventId();
        }
        return null;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        AdPayload adPayload = this.f50767ad;
        if (adPayload != null) {
            return adPayload.placementId();
        }
        return null;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        Integer num = this.version;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.adunit;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.impression;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BidPayload(version=");
        sb2.append(this.version);
        sb2.append(", adunit=");
        sb2.append(this.adunit);
        sb2.append(", impression=");
        return o2.p(sb2, this.impression, ')');
    }

    @f
    public /* synthetic */ BidPayload(int i10, Integer num, String str, List list, AdPayload adPayload, SerializationConstructorMarker serializationConstructorMarker) {
        String decodedAdsResponse;
        AdPayload adPayload2 = null;
        if ((i10 & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i10 & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i10 & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        Json jsonJson$default = JsonKt.Json$default(null, AnonymousClass1.INSTANCE, 1, null);
        this.json = jsonJson$default;
        if ((i10 & 8) != 0) {
            this.f50767ad = adPayload;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(jsonJson$default.getSerializersModule(), c1.typeOf(AdPayload.class));
            e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload2 = (AdPayload) jsonJson$default.decodeFromString(kSerializerSerializer, decodedAdsResponse);
        }
        this.f50767ad = adPayload2;
    }

    public BidPayload(Integer num, String str, List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        AdPayload adPayload = null;
        Json jsonJson$default = JsonKt.Json$default(null, BidPayload$json$1.INSTANCE, 1, null);
        this.json = jsonJson$default;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(jsonJson$default.getSerializersModule(), c1.typeOf(AdPayload.class));
            e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            adPayload = (AdPayload) jsonJson$default.decodeFromString(kSerializerSerializer, decodedAdsResponse);
        }
        this.f50767ad = adPayload;
    }

    @Transient
    private static /* synthetic */ void getJson$annotations() {
    }

    public /* synthetic */ BidPayload(Integer num, String str, List list, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : list);
    }
}
