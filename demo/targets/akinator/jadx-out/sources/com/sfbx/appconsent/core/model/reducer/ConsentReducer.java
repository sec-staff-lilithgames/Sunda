package com.sfbx.appconsent.core.model.reducer;

import j1.o2;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import tu.f;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class ConsentReducer {
    public static final Companion Companion = new Companion(null);
    private final List<ConsentableReducer> consentables;
    private final Map<Integer, DataCategoryReducer> dataCategories;
    private final List<StackReducer> stacks;
    private final Integer type;
    private final String uuid;
    private final List<VendorReducer> vendors;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<ConsentReducer> serializer() {
            return ConsentReducer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ConsentReducer() {
        this((List) null, (List) null, (List) null, (String) null, (Integer) null, (Map) null, 63, (u) null);
    }

    public static /* synthetic */ ConsentReducer copy$default(ConsentReducer consentReducer, List list, List list2, List list3, String str, Integer num, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = consentReducer.consentables;
        }
        if ((i10 & 2) != 0) {
            list2 = consentReducer.vendors;
        }
        if ((i10 & 4) != 0) {
            list3 = consentReducer.stacks;
        }
        if ((i10 & 8) != 0) {
            str = consentReducer.uuid;
        }
        if ((i10 & 16) != 0) {
            num = consentReducer.type;
        }
        if ((i10 & 32) != 0) {
            map = consentReducer.dataCategories;
        }
        Integer num2 = num;
        Map map2 = map;
        return consentReducer.copy(list, list2, list3, str, num2, map2);
    }

    public static final void write$Self(ConsentReducer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !e0.areEqual(self.consentables, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(ConsentableReducer$$serializer.INSTANCE), self.consentables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !e0.areEqual(self.vendors, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(VendorReducer$$serializer.INSTANCE), self.vendors);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !e0.areEqual(self.stacks, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 2, new ArrayListSerializer(StackReducer$$serializer.INSTANCE), self.stacks);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.uuid != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.uuid);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.type);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && e0.areEqual(self.dataCategories, p1.emptyMap())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, new LinkedHashMapSerializer(IntSerializer.INSTANCE, DataCategoryReducer$$serializer.INSTANCE), self.dataCategories);
    }

    public final List<ConsentableReducer> component1() {
        return this.consentables;
    }

    public final List<VendorReducer> component2() {
        return this.vendors;
    }

    public final List<StackReducer> component3() {
        return this.stacks;
    }

    public final String component4() {
        return this.uuid;
    }

    public final Integer component5() {
        return this.type;
    }

    public final Map<Integer, DataCategoryReducer> component6() {
        return this.dataCategories;
    }

    public final ConsentReducer copy(List<ConsentableReducer> consentables, List<VendorReducer> vendors, List<StackReducer> stacks, String str, Integer num, Map<Integer, DataCategoryReducer> dataCategories) {
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(stacks, "stacks");
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        return new ConsentReducer(consentables, vendors, stacks, str, num, dataCategories);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentReducer)) {
            return false;
        }
        ConsentReducer consentReducer = (ConsentReducer) obj;
        return e0.areEqual(this.consentables, consentReducer.consentables) && e0.areEqual(this.vendors, consentReducer.vendors) && e0.areEqual(this.stacks, consentReducer.stacks) && e0.areEqual(this.uuid, consentReducer.uuid) && e0.areEqual(this.type, consentReducer.type) && e0.areEqual(this.dataCategories, consentReducer.dataCategories);
    }

    public final List<ConsentableReducer> getConsentables() {
        return this.consentables;
    }

    public final Map<Integer, DataCategoryReducer> getDataCategories() {
        return this.dataCategories;
    }

    public final List<StackReducer> getStacks() {
        return this.stacks;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final List<VendorReducer> getVendors() {
        return this.vendors;
    }

    public int hashCode() {
        int iC = o2.c(o2.c(this.consentables.hashCode() * 31, 31, this.vendors), 31, this.stacks);
        String str = this.uuid;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        return this.dataCategories.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConsentReducer(consentables=");
        sb2.append(this.consentables);
        sb2.append(", vendors=");
        sb2.append(this.vendors);
        sb2.append(", stacks=");
        sb2.append(this.stacks);
        sb2.append(", uuid=");
        sb2.append(this.uuid);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", dataCategories=");
        return o2.q(sb2, this.dataCategories, ')');
    }

    @f
    public /* synthetic */ ConsentReducer(int i10, List list, List list2, List list3, String str, Integer num, @SerialName("dataCategories") Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.consentables = (i10 & 1) == 0 ? p0.emptyList() : list;
        if ((i10 & 2) == 0) {
            this.vendors = p0.emptyList();
        } else {
            this.vendors = list2;
        }
        if ((i10 & 4) == 0) {
            this.stacks = p0.emptyList();
        } else {
            this.stacks = list3;
        }
        if ((i10 & 8) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str;
        }
        if ((i10 & 16) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i10 & 32) == 0) {
            this.dataCategories = p1.emptyMap();
        } else {
            this.dataCategories = map;
        }
    }

    public ConsentReducer(List<ConsentableReducer> consentables, List<VendorReducer> vendors, List<StackReducer> stacks, String str, Integer num, Map<Integer, DataCategoryReducer> dataCategories) {
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(stacks, "stacks");
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        this.consentables = consentables;
        this.vendors = vendors;
        this.stacks = stacks;
        this.uuid = str;
        this.type = num;
        this.dataCategories = dataCategories;
    }

    @SerialName("dataCategories")
    public static /* synthetic */ void getDataCategories$annotations() {
    }

    public /* synthetic */ ConsentReducer(List list, List list2, List list3, String str, Integer num, Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? p0.emptyList() : list, (i10 & 2) != 0 ? p0.emptyList() : list2, (i10 & 4) != 0 ? p0.emptyList() : list3, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? p1.emptyMap() : map);
    }
}
