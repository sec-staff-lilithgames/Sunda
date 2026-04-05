package com.sfbx.appconsent.core.model.reducer;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sfbx.appconsent.core.BuildConfig;
import e3.g;
import j1.o2;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class State {
    public static final Companion Companion = new Companion(null);
    private final int cmpVersion;
    private final String consentString;
    private final ConsentReducer consents;
    private final List<EventReducer> events;
    private final VendorListReducer vendorList;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<State> serializer() {
            return State$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @f
    public /* synthetic */ State(int i10, ConsentReducer consentReducer, @SerialName("vendorlist") VendorListReducer vendorListReducer, @SerialName("consentstring") String str, @SerialName("CMP_VERSION") int i11, @SerialName("events") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, State$$serializer.INSTANCE.getDescriptor());
        }
        this.consents = consentReducer;
        if ((i10 & 2) == 0) {
            this.vendorList = new VendorListReducer(false, 0, 0, 0, (String) null, (String) null, (List) null, (List) null, (String) null, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, (u) null);
        } else {
            this.vendorList = vendorListReducer;
        }
        this.consentString = (i10 & 4) == 0 ? null : str;
        this.cmpVersion = (i10 & 8) == 0 ? BuildConfig.VERSION_CODE : i11;
        this.events = (i10 & 16) == 0 ? p0.emptyList() : list;
    }

    public static /* synthetic */ State copy$default(State state, ConsentReducer consentReducer, VendorListReducer vendorListReducer, String str, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            consentReducer = state.consents;
        }
        if ((i11 & 2) != 0) {
            vendorListReducer = state.vendorList;
        }
        if ((i11 & 4) != 0) {
            str = state.consentString;
        }
        if ((i11 & 8) != 0) {
            i10 = state.cmpVersion;
        }
        if ((i11 & 16) != 0) {
            list = state.events;
        }
        List list2 = list;
        String str2 = str;
        return state.copy(consentReducer, vendorListReducer, str2, i10, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self(com.sfbx.appconsent.core.model.reducer.State r18, kotlinx.serialization.encoding.CompositeEncoder r19, kotlinx.serialization.descriptors.SerialDescriptor r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "self"
            kotlin.jvm.internal.e0.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "output"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "serialDesc"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r3)
            com.sfbx.appconsent.core.model.reducer.ConsentReducer$$serializer r3 = com.sfbx.appconsent.core.model.reducer.ConsentReducer$$serializer.INSTANCE
            com.sfbx.appconsent.core.model.reducer.ConsentReducer r4 = r0.consents
            r5 = 0
            r1.encodeSerializableElement(r2, r5, r3, r4)
            r3 = 1
            boolean r4 = r1.shouldEncodeElementDefault(r2, r3)
            if (r4 == 0) goto L25
            goto L40
        L25:
            com.sfbx.appconsent.core.model.reducer.VendorListReducer r4 = r0.vendorList
            com.sfbx.appconsent.core.model.reducer.VendorListReducer r5 = new com.sfbx.appconsent.core.model.reducer.VendorListReducer
            r16 = 1023(0x3ff, float:1.434E-42)
            r17 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r4 = kotlin.jvm.internal.e0.areEqual(r4, r5)
            if (r4 != 0) goto L47
        L40:
            com.sfbx.appconsent.core.model.reducer.VendorListReducer$$serializer r4 = com.sfbx.appconsent.core.model.reducer.VendorListReducer$$serializer.INSTANCE
            com.sfbx.appconsent.core.model.reducer.VendorListReducer r5 = r0.vendorList
            r1.encodeSerializableElement(r2, r3, r4, r5)
        L47:
            r3 = 2
            boolean r4 = r1.shouldEncodeElementDefault(r2, r3)
            if (r4 == 0) goto L4f
            goto L53
        L4f:
            java.lang.String r4 = r0.consentString
            if (r4 == 0) goto L5a
        L53:
            kotlinx.serialization.internal.StringSerializer r4 = kotlinx.serialization.internal.StringSerializer.INSTANCE
            java.lang.String r5 = r0.consentString
            r1.encodeNullableSerializableElement(r2, r3, r4, r5)
        L5a:
            r3 = 3
            boolean r4 = r1.shouldEncodeElementDefault(r2, r3)
            if (r4 == 0) goto L62
            goto L68
        L62:
            int r4 = r0.cmpVersion
            r5 = 3600(0xe10, float:5.045E-42)
            if (r4 == r5) goto L6d
        L68:
            int r4 = r0.cmpVersion
            r1.encodeIntElement(r2, r3, r4)
        L6d:
            r3 = 4
            boolean r4 = r1.shouldEncodeElementDefault(r2, r3)
            if (r4 == 0) goto L75
            goto L81
        L75:
            java.util.List<com.sfbx.appconsent.core.model.reducer.EventReducer> r4 = r0.events
            java.util.List r5 = uu.p0.emptyList()
            boolean r4 = kotlin.jvm.internal.e0.areEqual(r4, r5)
            if (r4 != 0) goto L8d
        L81:
            kotlinx.serialization.internal.ArrayListSerializer r4 = new kotlinx.serialization.internal.ArrayListSerializer
            com.sfbx.appconsent.core.model.reducer.EventReducer$$serializer r5 = com.sfbx.appconsent.core.model.reducer.EventReducer$$serializer.INSTANCE
            r4.<init>(r5)
            java.util.List<com.sfbx.appconsent.core.model.reducer.EventReducer> r0 = r0.events
            r1.encodeSerializableElement(r2, r3, r4, r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.model.reducer.State.write$Self(com.sfbx.appconsent.core.model.reducer.State, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final ConsentReducer component1() {
        return this.consents;
    }

    public final VendorListReducer component2() {
        return this.vendorList;
    }

    public final String component3() {
        return this.consentString;
    }

    public final int component4() {
        return this.cmpVersion;
    }

    public final List<EventReducer> component5() {
        return this.events;
    }

    public final State copy(ConsentReducer consents, VendorListReducer vendorList, String str, int i10, List<EventReducer> events) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(vendorList, "vendorList");
        e0.checkNotNullParameter(events, "events");
        return new State(consents, vendorList, str, i10, events);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        return e0.areEqual(this.consents, state.consents) && e0.areEqual(this.vendorList, state.vendorList) && e0.areEqual(this.consentString, state.consentString) && this.cmpVersion == state.cmpVersion && e0.areEqual(this.events, state.events);
    }

    public final int getCmpVersion() {
        return this.cmpVersion;
    }

    public final String getConsentString() {
        return this.consentString;
    }

    public final ConsentReducer getConsents() {
        return this.consents;
    }

    public final List<EventReducer> getEvents() {
        return this.events;
    }

    public final VendorListReducer getVendorList() {
        return this.vendorList;
    }

    public int hashCode() {
        int iHashCode = (this.vendorList.hashCode() + (this.consents.hashCode() * 31)) * 31;
        String str = this.consentString;
        return this.events.hashCode() + g.d(this.cmpVersion, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("State(consents=");
        sb2.append(this.consents);
        sb2.append(", vendorList=");
        sb2.append(this.vendorList);
        sb2.append(", consentString=");
        sb2.append(this.consentString);
        sb2.append(", cmpVersion=");
        sb2.append(this.cmpVersion);
        sb2.append(", events=");
        return o2.p(sb2, this.events, ')');
    }

    public State(ConsentReducer consents, VendorListReducer vendorList, String str, int i10, List<EventReducer> events) {
        e0.checkNotNullParameter(consents, "consents");
        e0.checkNotNullParameter(vendorList, "vendorList");
        e0.checkNotNullParameter(events, "events");
        this.consents = consents;
        this.vendorList = vendorList;
        this.consentString = str;
        this.cmpVersion = i10;
        this.events = events;
    }

    public /* synthetic */ State(ConsentReducer consentReducer, VendorListReducer vendorListReducer, String str, int i10, List list, int i11, u uVar) {
        this(consentReducer, (i11 & 2) != 0 ? new VendorListReducer(false, 0, 0, 0, (String) null, (String) null, (List) null, (List) null, (String) null, false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, (u) null) : vendorListReducer, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? BuildConfig.VERSION_CODE : i10, (i11 & 16) != 0 ? p0.emptyList() : list);
    }

    @SerialName("CMP_VERSION")
    public static /* synthetic */ void getCmpVersion$annotations() {
    }

    @SerialName("consentstring")
    public static /* synthetic */ void getConsentString$annotations() {
    }

    @SerialName("events")
    public static /* synthetic */ void getEvents$annotations() {
    }

    @SerialName("vendorlist")
    public static /* synthetic */ void getVendorList$annotations() {
    }
}
