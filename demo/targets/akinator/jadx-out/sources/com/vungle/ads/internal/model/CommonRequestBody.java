package com.vungle.ads.internal.model;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import e3.g;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p0.o2;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class CommonRequestBody {
    public static final Companion Companion = new Companion(null);
    private final AppNode app;
    private final DeviceNode device;
    private RequestExt ext;
    private RequestParam request;
    private final User user;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class CCPA {
        public static final Companion Companion = new Companion(null);
        private final String status;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<CCPA> serializer() {
                return CommonRequestBody$CCPA$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @f
        public /* synthetic */ CCPA(int i10, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i10 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 1, CommonRequestBody$CCPA$$serializer.INSTANCE.getDescriptor());
            }
            this.status = str;
        }

        public static /* synthetic */ CCPA copy$default(CCPA ccpa, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = ccpa.status;
            }
            return ccpa.copy(str);
        }

        public static final void write$Self(CCPA self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeStringElement(serialDesc, 0, self.status);
        }

        public final String component1() {
            return this.status;
        }

        public final CCPA copy(String status) {
            e0.checkNotNullParameter(status, "status");
            return new CCPA(status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CCPA) && e0.areEqual(this.status, ((CCPA) obj).status);
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return o2.q(new StringBuilder("CCPA(status="), this.status, ')');
        }

        public CCPA(String status) {
            e0.checkNotNullParameter(status, "status");
            this.status = status;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class COPPA {
        public static final Companion Companion = new Companion(null);
        private final Boolean isCoppa;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<COPPA> serializer() {
                return CommonRequestBody$COPPA$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @f
        public /* synthetic */ COPPA(int i10, @SerialName("is_coppa") Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i10 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 1, CommonRequestBody$COPPA$$serializer.INSTANCE.getDescriptor());
            }
            this.isCoppa = bool;
        }

        public static /* synthetic */ COPPA copy$default(COPPA coppa, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = coppa.isCoppa;
            }
            return coppa.copy(bool);
        }

        public static final void write$Self(COPPA self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.isCoppa);
        }

        public final Boolean component1() {
            return this.isCoppa;
        }

        public final COPPA copy(Boolean bool) {
            return new COPPA(bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof COPPA) && e0.areEqual(this.isCoppa, ((COPPA) obj).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final Boolean isCoppa() {
            return this.isCoppa;
        }

        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        public COPPA(Boolean bool) {
            this.isCoppa = bool;
        }

        @SerialName("is_coppa")
        public static /* synthetic */ void isCoppa$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<CommonRequestBody> serializer() {
            return CommonRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class GDPR {
        public static final Companion Companion = new Companion(null);
        private final String consentMessageVersion;
        private final String consentSource;
        private final String consentStatus;
        private final long consentTimestamp;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<GDPR> serializer() {
                return CommonRequestBody$GDPR$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @f
        public /* synthetic */ GDPR(int i10, @SerialName("consent_status") String str, @SerialName("consent_source") String str2, @SerialName("consent_timestamp") long j10, @SerialName("consent_message_version") String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i10 & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 15, CommonRequestBody$GDPR$$serializer.INSTANCE.getDescriptor());
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j10;
            this.consentMessageVersion = str3;
        }

        public static /* synthetic */ GDPR copy$default(GDPR gdpr, String str, String str2, long j10, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gdpr.consentStatus;
            }
            if ((i10 & 2) != 0) {
                str2 = gdpr.consentSource;
            }
            if ((i10 & 4) != 0) {
                j10 = gdpr.consentTimestamp;
            }
            if ((i10 & 8) != 0) {
                str3 = gdpr.consentMessageVersion;
            }
            String str4 = str3;
            return gdpr.copy(str, str2, j10, str4);
        }

        public static final void write$Self(GDPR self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeStringElement(serialDesc, 0, self.consentStatus);
            output.encodeStringElement(serialDesc, 1, self.consentSource);
            output.encodeLongElement(serialDesc, 2, self.consentTimestamp);
            output.encodeStringElement(serialDesc, 3, self.consentMessageVersion);
        }

        public final String component1() {
            return this.consentStatus;
        }

        public final String component2() {
            return this.consentSource;
        }

        public final long component3() {
            return this.consentTimestamp;
        }

        public final String component4() {
            return this.consentMessageVersion;
        }

        public final GDPR copy(String consentStatus, String consentSource, long j10, String consentMessageVersion) {
            e0.checkNotNullParameter(consentStatus, "consentStatus");
            e0.checkNotNullParameter(consentSource, "consentSource");
            e0.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            return new GDPR(consentStatus, consentSource, j10, consentMessageVersion);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GDPR)) {
                return false;
            }
            GDPR gdpr = (GDPR) obj;
            return e0.areEqual(this.consentStatus, gdpr.consentStatus) && e0.areEqual(this.consentSource, gdpr.consentSource) && this.consentTimestamp == gdpr.consentTimestamp && e0.areEqual(this.consentMessageVersion, gdpr.consentMessageVersion);
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentSource() {
            return this.consentSource;
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        public int hashCode() {
            return this.consentMessageVersion.hashCode() + o2.d(o2.e(this.consentStatus.hashCode() * 31, 31, this.consentSource), 31, this.consentTimestamp);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("GDPR(consentStatus=");
            sb2.append(this.consentStatus);
            sb2.append(", consentSource=");
            sb2.append(this.consentSource);
            sb2.append(", consentTimestamp=");
            sb2.append(this.consentTimestamp);
            sb2.append(", consentMessageVersion=");
            return o2.q(sb2, this.consentMessageVersion, ')');
        }

        public GDPR(String consentStatus, String consentSource, long j10, String consentMessageVersion) {
            e0.checkNotNullParameter(consentStatus, "consentStatus");
            e0.checkNotNullParameter(consentSource, "consentSource");
            e0.checkNotNullParameter(consentMessageVersion, "consentMessageVersion");
            this.consentStatus = consentStatus;
            this.consentSource = consentSource;
            this.consentTimestamp = j10;
            this.consentMessageVersion = consentMessageVersion;
        }

        @SerialName("consent_message_version")
        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        @SerialName("consent_source")
        public static /* synthetic */ void getConsentSource$annotations() {
        }

        @SerialName("consent_status")
        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        @SerialName("consent_timestamp")
        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class IAB {
        public static final Companion Companion = new Companion(null);
        private final String tcf;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<IAB> serializer() {
                return CommonRequestBody$IAB$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @f
        public /* synthetic */ IAB(int i10, @SerialName("tcf") String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i10 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 1, CommonRequestBody$IAB$$serializer.INSTANCE.getDescriptor());
            }
            this.tcf = str;
        }

        public static /* synthetic */ IAB copy$default(IAB iab, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = iab.tcf;
            }
            return iab.copy(str);
        }

        public static final void write$Self(IAB self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeStringElement(serialDesc, 0, self.tcf);
        }

        public final String component1() {
            return this.tcf;
        }

        public final IAB copy(String tcf) {
            e0.checkNotNullParameter(tcf, "tcf");
            return new IAB(tcf);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IAB) && e0.areEqual(this.tcf, ((IAB) obj).tcf);
        }

        public final String getTcf() {
            return this.tcf;
        }

        public int hashCode() {
            return this.tcf.hashCode();
        }

        public String toString() {
            return o2.q(new StringBuilder("IAB(tcf="), this.tcf, ')');
        }

        public IAB(String tcf) {
            e0.checkNotNullParameter(tcf, "tcf");
            this.tcf = tcf;
        }

        @SerialName("tcf")
        public static /* synthetic */ void getTcf$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class RequestExt {
        public static final Companion Companion = new Companion(null);
        private final String configExtension;
        private final Long configLastValidatedTimestamp;
        private String signals;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<RequestExt> serializer() {
                return CommonRequestBody$RequestExt$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public RequestExt() {
            this((String) null, (String) null, (Long) null, 7, (u) null);
        }

        public static /* synthetic */ RequestExt copy$default(RequestExt requestExt, String str, String str2, Long l9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = requestExt.configExtension;
            }
            if ((i10 & 2) != 0) {
                str2 = requestExt.signals;
            }
            if ((i10 & 4) != 0) {
                l9 = requestExt.configLastValidatedTimestamp;
            }
            return requestExt.copy(str, str2, l9);
        }

        public static final void write$Self(RequestExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.configExtension != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.configExtension);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.signals != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.signals);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.configLastValidatedTimestamp == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.configLastValidatedTimestamp);
        }

        public final String component1() {
            return this.configExtension;
        }

        public final String component2() {
            return this.signals;
        }

        public final Long component3() {
            return this.configLastValidatedTimestamp;
        }

        public final RequestExt copy(String str, String str2, Long l9) {
            return new RequestExt(str, str2, l9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestExt)) {
                return false;
            }
            RequestExt requestExt = (RequestExt) obj;
            return e0.areEqual(this.configExtension, requestExt.configExtension) && e0.areEqual(this.signals, requestExt.signals) && e0.areEqual(this.configLastValidatedTimestamp, requestExt.configLastValidatedTimestamp);
        }

        public final String getConfigExtension() {
            return this.configExtension;
        }

        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        public final String getSignals() {
            return this.signals;
        }

        public int hashCode() {
            String str = this.configExtension;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.signals;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l9 = this.configLastValidatedTimestamp;
            return iHashCode2 + (l9 != null ? l9.hashCode() : 0);
        }

        public final void setSignals(String str) {
            this.signals = str;
        }

        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
        }

        @f
        public /* synthetic */ RequestExt(int i10, @SerialName(Cookie.CONFIG_EXTENSION) String str, @SerialName("signals") String str2, @SerialName("config_last_validated_ts") Long l9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i10 & 2) == 0) {
                this.signals = null;
            } else {
                this.signals = str2;
            }
            if ((i10 & 4) == 0) {
                this.configLastValidatedTimestamp = null;
            } else {
                this.configLastValidatedTimestamp = l9;
            }
        }

        public RequestExt(String str, String str2, Long l9) {
            this.configExtension = str;
            this.signals = str2;
            this.configLastValidatedTimestamp = l9;
        }

        public /* synthetic */ RequestExt(String str, String str2, Long l9, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l9);
        }

        @SerialName(Cookie.CONFIG_EXTENSION)
        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        @SerialName("config_last_validated_ts")
        public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
        }

        @SerialName("signals")
        public static /* synthetic */ void getSignals$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class RequestParam {
        public static final Companion Companion = new Companion(null);
        private AdSizeParam adSize;
        private final Long adStartTime;
        private final String advAppId;
        private final String placementReferenceId;
        private final List<String> placements;
        private final String user;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<RequestParam> serializer() {
                return CommonRequestBody$RequestParam$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public RequestParam() {
            this((List) null, (AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, 63, (u) null);
        }

        public static /* synthetic */ RequestParam copy$default(RequestParam requestParam, List list, AdSizeParam adSizeParam, Long l9, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = requestParam.placements;
            }
            if ((i10 & 2) != 0) {
                adSizeParam = requestParam.adSize;
            }
            if ((i10 & 4) != 0) {
                l9 = requestParam.adStartTime;
            }
            if ((i10 & 8) != 0) {
                str = requestParam.advAppId;
            }
            if ((i10 & 16) != 0) {
                str2 = requestParam.placementReferenceId;
            }
            if ((i10 & 32) != 0) {
                str3 = requestParam.user;
            }
            String str4 = str2;
            String str5 = str3;
            return requestParam.copy(list, adSizeParam, l9, str, str4, str5);
        }

        public static final void write$Self(RequestParam self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.placements != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, new ArrayListSerializer(StringSerializer.INSTANCE), self.placements);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.adSize != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CommonRequestBody$AdSizeParam$$serializer.INSTANCE, self.adSize);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.adStartTime != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.adStartTime);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.advAppId != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.advAppId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.placementReferenceId != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.placementReferenceId);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.user == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.user);
        }

        public final List<String> component1() {
            return this.placements;
        }

        public final AdSizeParam component2() {
            return this.adSize;
        }

        public final Long component3() {
            return this.adStartTime;
        }

        public final String component4() {
            return this.advAppId;
        }

        public final String component5() {
            return this.placementReferenceId;
        }

        public final String component6() {
            return this.user;
        }

        public final RequestParam copy(List<String> list, AdSizeParam adSizeParam, Long l9, String str, String str2, String str3) {
            return new RequestParam(list, adSizeParam, l9, str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestParam)) {
                return false;
            }
            RequestParam requestParam = (RequestParam) obj;
            return e0.areEqual(this.placements, requestParam.placements) && e0.areEqual(this.adSize, requestParam.adSize) && e0.areEqual(this.adStartTime, requestParam.adStartTime) && e0.areEqual(this.advAppId, requestParam.advAppId) && e0.areEqual(this.placementReferenceId, requestParam.placementReferenceId) && e0.areEqual(this.user, requestParam.user);
        }

        public final AdSizeParam getAdSize() {
            return this.adSize;
        }

        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final List<String> getPlacements() {
            return this.placements;
        }

        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            List<String> list = this.placements;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            AdSizeParam adSizeParam = this.adSize;
            int iHashCode2 = (iHashCode + (adSizeParam == null ? 0 : adSizeParam.hashCode())) * 31;
            Long l9 = this.adStartTime;
            int iHashCode3 = (iHashCode2 + (l9 == null ? 0 : l9.hashCode())) * 31;
            String str = this.advAppId;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placementReferenceId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.user;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setAdSize(AdSizeParam adSizeParam) {
            this.adSize = adSizeParam;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RequestParam(placements=");
            sb2.append(this.placements);
            sb2.append(", adSize=");
            sb2.append(this.adSize);
            sb2.append(", adStartTime=");
            sb2.append(this.adStartTime);
            sb2.append(", advAppId=");
            sb2.append(this.advAppId);
            sb2.append(", placementReferenceId=");
            sb2.append(this.placementReferenceId);
            sb2.append(", user=");
            return o2.q(sb2, this.user, ')');
        }

        @f
        public /* synthetic */ RequestParam(int i10, List list, @SerialName("ad_size") AdSizeParam adSizeParam, @SerialName("ad_start_time") Long l9, @SerialName("app_id") String str, @SerialName("placement_reference_id") String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i10 & 2) == 0) {
                this.adSize = null;
            } else {
                this.adSize = adSizeParam;
            }
            if ((i10 & 4) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l9;
            }
            if ((i10 & 8) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str;
            }
            if ((i10 & 16) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str2;
            }
            if ((i10 & 32) == 0) {
                this.user = null;
            } else {
                this.user = str3;
            }
        }

        public RequestParam(List<String> list, AdSizeParam adSizeParam, Long l9, String str, String str2, String str3) {
            this.placements = list;
            this.adSize = adSizeParam;
            this.adStartTime = l9;
            this.advAppId = str;
            this.placementReferenceId = str2;
            this.user = str3;
        }

        public /* synthetic */ RequestParam(List list, AdSizeParam adSizeParam, Long l9, String str, String str2, String str3, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : adSizeParam, (i10 & 4) != 0 ? null : l9, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3);
        }

        @SerialName("ad_size")
        public static /* synthetic */ void getAdSize$annotations() {
        }

        @SerialName("ad_start_time")
        public static /* synthetic */ void getAdStartTime$annotations() {
        }

        @SerialName("app_id")
        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        @SerialName("placement_reference_id")
        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class User {
        public static final Companion Companion = new Companion(null);
        private CCPA ccpa;
        private COPPA coppa;
        private FirstPartyData fpd;
        private GDPR gdpr;
        private IAB iab;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<User> serializer() {
                return CommonRequestBody$User$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public User() {
            this((GDPR) null, (CCPA) null, (COPPA) null, (FirstPartyData) null, (IAB) null, 31, (u) null);
        }

        public static /* synthetic */ User copy$default(User user, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gdpr = user.gdpr;
            }
            if ((i10 & 2) != 0) {
                ccpa = user.ccpa;
            }
            if ((i10 & 4) != 0) {
                coppa = user.coppa;
            }
            if ((i10 & 8) != 0) {
                firstPartyData = user.fpd;
            }
            if ((i10 & 16) != 0) {
                iab = user.iab;
            }
            IAB iab2 = iab;
            COPPA coppa2 = coppa;
            return user.copy(gdpr, ccpa, coppa2, firstPartyData, iab2);
        }

        public static final void write$Self(User self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.gdpr != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, self.gdpr);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ccpa != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, self.ccpa);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.coppa != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, self.coppa);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.fpd != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, FirstPartyData$$serializer.INSTANCE, self.fpd);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.iab == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 4, CommonRequestBody$IAB$$serializer.INSTANCE, self.iab);
        }

        public final GDPR component1() {
            return this.gdpr;
        }

        public final CCPA component2() {
            return this.ccpa;
        }

        public final COPPA component3() {
            return this.coppa;
        }

        public final FirstPartyData component4() {
            return this.fpd;
        }

        public final IAB component5() {
            return this.iab;
        }

        public final User copy(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab) {
            return new User(gdpr, ccpa, coppa, firstPartyData, iab);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return e0.areEqual(this.gdpr, user.gdpr) && e0.areEqual(this.ccpa, user.ccpa) && e0.areEqual(this.coppa, user.coppa) && e0.areEqual(this.fpd, user.fpd) && e0.areEqual(this.iab, user.iab);
        }

        public final CCPA getCcpa() {
            return this.ccpa;
        }

        public final COPPA getCoppa() {
            return this.coppa;
        }

        public final FirstPartyData getFpd() {
            return this.fpd;
        }

        public final GDPR getGdpr() {
            return this.gdpr;
        }

        public final IAB getIab() {
            return this.iab;
        }

        public int hashCode() {
            GDPR gdpr = this.gdpr;
            int iHashCode = (gdpr == null ? 0 : gdpr.hashCode()) * 31;
            CCPA ccpa = this.ccpa;
            int iHashCode2 = (iHashCode + (ccpa == null ? 0 : ccpa.hashCode())) * 31;
            COPPA coppa = this.coppa;
            int iHashCode3 = (iHashCode2 + (coppa == null ? 0 : coppa.hashCode())) * 31;
            FirstPartyData firstPartyData = this.fpd;
            int iHashCode4 = (iHashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
            IAB iab = this.iab;
            return iHashCode4 + (iab != null ? iab.hashCode() : 0);
        }

        public final void setCcpa(CCPA ccpa) {
            this.ccpa = ccpa;
        }

        public final void setCoppa(COPPA coppa) {
            this.coppa = coppa;
        }

        public final void setFpd(FirstPartyData firstPartyData) {
            this.fpd = firstPartyData;
        }

        public final void setGdpr(GDPR gdpr) {
            this.gdpr = gdpr;
        }

        public final void setIab(IAB iab) {
            this.iab = iab;
        }

        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
        }

        @f
        public /* synthetic */ User(int i10, GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gdpr;
            }
            if ((i10 & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = ccpa;
            }
            if ((i10 & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = coppa;
            }
            if ((i10 & 8) == 0) {
                this.fpd = null;
            } else {
                this.fpd = firstPartyData;
            }
            if ((i10 & 16) == 0) {
                this.iab = null;
            } else {
                this.iab = iab;
            }
        }

        public User(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab) {
            this.gdpr = gdpr;
            this.ccpa = ccpa;
            this.coppa = coppa;
            this.fpd = firstPartyData;
            this.iab = iab;
        }

        public /* synthetic */ User(GDPR gdpr, CCPA ccpa, COPPA coppa, FirstPartyData firstPartyData, IAB iab, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : gdpr, (i10 & 2) != 0 ? null : ccpa, (i10 & 4) != 0 ? null : coppa, (i10 & 8) != 0 ? null : firstPartyData, (i10 & 16) != 0 ? null : iab);
        }
    }

    @f
    public /* synthetic */ CommonRequestBody(int i10, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, CommonRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.app = null;
        } else {
            this.app = appNode;
        }
        if ((i10 & 4) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 16) == 0) {
            this.request = null;
        } else {
            this.request = requestParam;
        }
    }

    public static /* synthetic */ CommonRequestBody copy$default(CommonRequestBody commonRequestBody, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deviceNode = commonRequestBody.device;
        }
        if ((i10 & 2) != 0) {
            appNode = commonRequestBody.app;
        }
        if ((i10 & 4) != 0) {
            user = commonRequestBody.user;
        }
        if ((i10 & 8) != 0) {
            requestExt = commonRequestBody.ext;
        }
        if ((i10 & 16) != 0) {
            requestParam = commonRequestBody.request;
        }
        RequestParam requestParam2 = requestParam;
        User user2 = user;
        return commonRequestBody.copy(deviceNode, appNode, user2, requestExt, requestParam2);
    }

    public static final void write$Self(CommonRequestBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, DeviceNode$$serializer.INSTANCE, self.device);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.app != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, AppNode$$serializer.INSTANCE, self.app);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.user != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, CommonRequestBody$User$$serializer.INSTANCE, self.user);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.ext != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, self.ext);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.request == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, self.request);
    }

    public final DeviceNode component1() {
        return this.device;
    }

    public final AppNode component2() {
        return this.app;
    }

    public final User component3() {
        return this.user;
    }

    public final RequestExt component4() {
        return this.ext;
    }

    public final RequestParam component5() {
        return this.request;
    }

    public final CommonRequestBody copy(DeviceNode device, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        e0.checkNotNullParameter(device, "device");
        return new CommonRequestBody(device, appNode, user, requestExt, requestParam);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonRequestBody)) {
            return false;
        }
        CommonRequestBody commonRequestBody = (CommonRequestBody) obj;
        return e0.areEqual(this.device, commonRequestBody.device) && e0.areEqual(this.app, commonRequestBody.app) && e0.areEqual(this.user, commonRequestBody.user) && e0.areEqual(this.ext, commonRequestBody.ext) && e0.areEqual(this.request, commonRequestBody.request);
    }

    public final AppNode getApp() {
        return this.app;
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final RequestExt getExt() {
        return this.ext;
    }

    public final RequestParam getRequest() {
        return this.request;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        AppNode appNode = this.app;
        int iHashCode2 = (iHashCode + (appNode == null ? 0 : appNode.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        RequestExt requestExt = this.ext;
        int iHashCode4 = (iHashCode3 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RequestParam requestParam = this.request;
        return iHashCode4 + (requestParam != null ? requestParam.hashCode() : 0);
    }

    public final void setExt(RequestExt requestExt) {
        this.ext = requestExt;
    }

    public final void setRequest(RequestParam requestParam) {
        this.request = requestParam;
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Serializable
    public static final class AdSizeParam {
        public static final Companion Companion = new Companion(null);
        private final int height;
        private final int width;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final KSerializer<AdSizeParam> serializer() {
                return CommonRequestBody$AdSizeParam$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public AdSizeParam(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static /* synthetic */ AdSizeParam copy$default(AdSizeParam adSizeParam, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = adSizeParam.width;
            }
            if ((i12 & 2) != 0) {
                i11 = adSizeParam.height;
            }
            return adSizeParam.copy(i10, i11);
        }

        public static final void write$Self(AdSizeParam self, CompositeEncoder output, SerialDescriptor serialDesc) {
            e0.checkNotNullParameter(self, "self");
            e0.checkNotNullParameter(output, "output");
            e0.checkNotNullParameter(serialDesc, "serialDesc");
            output.encodeIntElement(serialDesc, 0, self.width);
            output.encodeIntElement(serialDesc, 1, self.height);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final AdSizeParam copy(int i10, int i11) {
            return new AdSizeParam(i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdSizeParam)) {
                return false;
            }
            AdSizeParam adSizeParam = (AdSizeParam) obj;
            return this.width == adSizeParam.width && this.height == adSizeParam.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AdSizeParam(width=");
            sb2.append(this.width);
            sb2.append(", height=");
            return g.m(sb2, this.height, ')');
        }

        @f
        public /* synthetic */ AdSizeParam(int i10, @SerialName("w") int i11, @SerialName(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME) int i12, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i10 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i10, 3, CommonRequestBody$AdSizeParam$$serializer.INSTANCE.getDescriptor());
            }
            this.width = i11;
            this.height = i12;
        }

        @SerialName(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME)
        public static /* synthetic */ void getHeight$annotations() {
        }

        @SerialName("w")
        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    public CommonRequestBody(DeviceNode device, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        e0.checkNotNullParameter(device, "device");
        this.device = device;
        this.app = appNode;
        this.user = user;
        this.ext = requestExt;
        this.request = requestParam;
    }

    public /* synthetic */ CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i10, u uVar) {
        this(deviceNode, (i10 & 2) != 0 ? null : appNode, (i10 & 4) != 0 ? null : user, (i10 & 8) != 0 ? null : requestExt, (i10 & 16) != 0 ? null : requestParam);
    }
}
