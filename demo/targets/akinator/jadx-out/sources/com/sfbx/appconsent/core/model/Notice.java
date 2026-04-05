package com.sfbx.appconsent.core.model;

import j1.o2;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Notice {
    public static final Companion Companion = new Companion(null);
    private final List<Consentable> consentables;
    private final List<DataCategoryCore> dataCategories;
    private final List<Stack> stacks;
    private final List<Vendor> vendors;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Notice> serializer() {
            return Notice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Notice() {
        this((List) null, (List) null, (List) null, (List) null, 15, (u) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Notice copy$default(Notice notice, List list, List list2, List list3, List list4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = notice.consentables;
        }
        if ((i10 & 2) != 0) {
            list2 = notice.stacks;
        }
        if ((i10 & 4) != 0) {
            list3 = notice.vendors;
        }
        if ((i10 & 8) != 0) {
            list4 = notice.dataCategories;
        }
        return notice.copy(list, list2, list3, list4);
    }

    public static final void write$Self(Notice self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !e0.areEqual(self.consentables, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(Consentable$$serializer.INSTANCE), self.consentables);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !e0.areEqual(self.stacks, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(Stack$$serializer.INSTANCE), self.stacks);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !e0.areEqual(self.vendors, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 2, new ArrayListSerializer(Vendor$$serializer.INSTANCE), self.vendors);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && e0.areEqual(self.dataCategories, p0.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, new ArrayListSerializer(DataCategoryCore$$serializer.INSTANCE), self.dataCategories);
    }

    public final List<Consentable> component1() {
        return this.consentables;
    }

    public final List<Stack> component2() {
        return this.stacks;
    }

    public final List<Vendor> component3() {
        return this.vendors;
    }

    public final List<DataCategoryCore> component4() {
        return this.dataCategories;
    }

    public final Notice copy(List<Consentable> consentables, List<Stack> stacks, List<Vendor> vendors, List<DataCategoryCore> dataCategories) {
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(stacks, "stacks");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        return new Notice(consentables, stacks, vendors, dataCategories);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notice)) {
            return false;
        }
        Notice notice = (Notice) obj;
        return e0.areEqual(this.consentables, notice.consentables) && e0.areEqual(this.stacks, notice.stacks) && e0.areEqual(this.vendors, notice.vendors) && e0.areEqual(this.dataCategories, notice.dataCategories);
    }

    public final List<Consentable> getConsentables() {
        return this.consentables;
    }

    public final List<DataCategoryCore> getDataCategories() {
        return this.dataCategories;
    }

    public final List<Stack> getStacks() {
        return this.stacks;
    }

    public final List<Vendor> getVendors() {
        return this.vendors;
    }

    public int hashCode() {
        return this.dataCategories.hashCode() + o2.c(o2.c(this.consentables.hashCode() * 31, 31, this.stacks), 31, this.vendors);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Notice(consentables=");
        sb2.append(this.consentables);
        sb2.append(", stacks=");
        sb2.append(this.stacks);
        sb2.append(", vendors=");
        sb2.append(this.vendors);
        sb2.append(", dataCategories=");
        return o2.p(sb2, this.dataCategories, ')');
    }

    @f
    public /* synthetic */ Notice(int i10, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        this.consentables = (i10 & 1) == 0 ? p0.emptyList() : list;
        if ((i10 & 2) == 0) {
            this.stacks = p0.emptyList();
        } else {
            this.stacks = list2;
        }
        if ((i10 & 4) == 0) {
            this.vendors = p0.emptyList();
        } else {
            this.vendors = list3;
        }
        if ((i10 & 8) == 0) {
            this.dataCategories = p0.emptyList();
        } else {
            this.dataCategories = list4;
        }
    }

    public Notice(List<Consentable> consentables, List<Stack> stacks, List<Vendor> vendors, List<DataCategoryCore> dataCategories) {
        e0.checkNotNullParameter(consentables, "consentables");
        e0.checkNotNullParameter(stacks, "stacks");
        e0.checkNotNullParameter(vendors, "vendors");
        e0.checkNotNullParameter(dataCategories, "dataCategories");
        this.consentables = consentables;
        this.stacks = stacks;
        this.vendors = vendors;
        this.dataCategories = dataCategories;
    }

    public /* synthetic */ Notice(List list, List list2, List list3, List list4, int i10, u uVar) {
        this((i10 & 1) != 0 ? p0.emptyList() : list, (i10 & 2) != 0 ? p0.emptyList() : list2, (i10 & 4) != 0 ? p0.emptyList() : list3, (i10 & 8) != 0 ? p0.emptyList() : list4);
    }
}
