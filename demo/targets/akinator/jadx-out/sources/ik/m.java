package ik;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes7.dex */
public final class m {
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f59703a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f59704b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f59705c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f59706d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f59707e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final KSerializer<m> serializer() {
            return l.f59702a;
        }
    }

    public /* synthetic */ m(int i10, Boolean bool, Double d10, Integer num, Integer num2, Long l9, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 31, l.f59702a.getDescriptor());
        }
        this.f59703a = bool;
        this.f59704b = d10;
        this.f59705c = num;
        this.f59706d = num2;
        this.f59707e = l9;
    }

    public static /* synthetic */ m copy$default(m mVar, Boolean bool, Double d10, Integer num, Integer num2, Long l9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = mVar.f59703a;
        }
        if ((i10 & 2) != 0) {
            d10 = mVar.f59704b;
        }
        if ((i10 & 4) != 0) {
            num = mVar.f59705c;
        }
        if ((i10 & 8) != 0) {
            num2 = mVar.f59706d;
        }
        if ((i10 & 16) != 0) {
            l9 = mVar.f59707e;
        }
        Long l10 = l9;
        Integer num3 = num;
        return mVar.copy(bool, d10, num3, num2, l10);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(m mVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, mVar.f59703a);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DoubleSerializer.INSTANCE, mVar.f59704b);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, intSerializer, mVar.f59705c);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, intSerializer, mVar.f59706d);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, mVar.f59707e);
    }

    public final Boolean component1() {
        return this.f59703a;
    }

    public final Double component2() {
        return this.f59704b;
    }

    public final Integer component3() {
        return this.f59705c;
    }

    public final Integer component4() {
        return this.f59706d;
    }

    public final Long component5() {
        return this.f59707e;
    }

    public final m copy(Boolean bool, Double d10, Integer num, Integer num2, Long l9) {
        return new m(bool, d10, num, num2, l9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return e0.areEqual(this.f59703a, mVar.f59703a) && e0.areEqual((Object) this.f59704b, (Object) mVar.f59704b) && e0.areEqual(this.f59705c, mVar.f59705c) && e0.areEqual(this.f59706d, mVar.f59706d) && e0.areEqual(this.f59707e, mVar.f59707e);
    }

    public final Integer getCacheDurationSeconds() {
        return this.f59706d;
    }

    public final Long getCacheUpdatedTimeSeconds() {
        return this.f59707e;
    }

    public final Double getSessionSamplingRate() {
        return this.f59704b;
    }

    public final Integer getSessionTimeoutSeconds() {
        return this.f59705c;
    }

    public final Boolean getSessionsEnabled() {
        return this.f59703a;
    }

    public int hashCode() {
        Boolean bool = this.f59703a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f59704b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f59705c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f59706d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l9 = this.f59707e;
        return iHashCode4 + (l9 != null ? l9.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f59703a + ", sessionSamplingRate=" + this.f59704b + ", sessionTimeoutSeconds=" + this.f59705c + ", cacheDurationSeconds=" + this.f59706d + ", cacheUpdatedTimeSeconds=" + this.f59707e + ')';
    }

    public m(Boolean bool, Double d10, Integer num, Integer num2, Long l9) {
        this.f59703a = bool;
        this.f59704b = d10;
        this.f59705c = num;
        this.f59706d = num2;
        this.f59707e = l9;
    }
}
