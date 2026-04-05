package com.vungle.ads.fpd;

import com.amazon.device.ads.DtbConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class FirstPartyData {
    public static final Companion Companion = new Companion(null);
    private Map<String, String> _customData;
    private volatile Demographic _demographic;
    private volatile Location _location;
    private volatile Revenue _revenue;
    private volatile SessionContext _sessionContext;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<FirstPartyData> serializer() {
            return FirstPartyData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FirstPartyData() {
    }

    public static final void write$Self(FirstPartyData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self._sessionContext != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SessionContext$$serializer.INSTANCE, self._sessionContext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self._demographic != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, Demographic$$serializer.INSTANCE, self._demographic);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self._location != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, Location$$serializer.INSTANCE, self._location);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self._revenue != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, Revenue$$serializer.INSTANCE, self._revenue);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self._customData == null) {
            return;
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self._customData);
    }

    public final synchronized void clearAll() {
        try {
            this._sessionContext = null;
            this._demographic = null;
            this._location = null;
            this._revenue = null;
            Map<String, String> map = this._customData;
            if (map != null) {
                map.clear();
            }
            this._customData = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this._customData;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this._customData = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    public final synchronized Demographic getDemographic() {
        Demographic demographic;
        demographic = this._demographic;
        if (demographic == null) {
            demographic = new Demographic();
            this._demographic = demographic;
        }
        return demographic;
    }

    public final synchronized Location getLocation() {
        Location location;
        location = this._location;
        if (location == null) {
            location = new Location();
            this._location = location;
        }
        return location;
    }

    public final synchronized Revenue getRevenue() {
        Revenue revenue;
        revenue = this._revenue;
        if (revenue == null) {
            revenue = new Revenue();
            this._revenue = revenue;
        }
        return revenue;
    }

    public final synchronized SessionContext getSessionContext() {
        SessionContext sessionContext;
        sessionContext = this._sessionContext;
        if (sessionContext == null) {
            sessionContext = new SessionContext();
            this._sessionContext = sessionContext;
        }
        return sessionContext;
    }

    @f
    public /* synthetic */ FirstPartyData(int i10, @SerialName("session_context") SessionContext sessionContext, @SerialName("demographic") Demographic demographic, @SerialName(DtbConstants.PRIVACY_LOCATION_KEY) Location location, @SerialName("revenue") Revenue revenue, @SerialName("custom_data") Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this._sessionContext = null;
        } else {
            this._sessionContext = sessionContext;
        }
        if ((i10 & 2) == 0) {
            this._demographic = null;
        } else {
            this._demographic = demographic;
        }
        if ((i10 & 4) == 0) {
            this._location = null;
        } else {
            this._location = location;
        }
        if ((i10 & 8) == 0) {
            this._revenue = null;
        } else {
            this._revenue = revenue;
        }
        if ((i10 & 16) == 0) {
            this._customData = null;
        } else {
            this._customData = map;
        }
    }

    @SerialName("custom_data")
    private static /* synthetic */ void get_customData$annotations() {
    }

    @SerialName("demographic")
    private static /* synthetic */ void get_demographic$annotations() {
    }

    @SerialName(DtbConstants.PRIVACY_LOCATION_KEY)
    private static /* synthetic */ void get_location$annotations() {
    }

    @SerialName("revenue")
    private static /* synthetic */ void get_revenue$annotations() {
    }

    @SerialName("session_context")
    private static /* synthetic */ void get_sessionContext$annotations() {
    }
}
