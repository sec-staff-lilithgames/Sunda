package com.sfbx.appconsent.core.model;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p0.o2;
import tu.f;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class DataRetentionCore {
    public static final Companion Companion = new Companion(null);
    private final Map<String, Integer> purposes;
    private final Map<String, Integer> specialPurposes;
    private final int stdRetention;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<DataRetentionCore> serializer() {
            return DataRetentionCore$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DataRetentionCore() {
        this(0, (Map) null, (Map) null, 7, (u) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataRetentionCore copy$default(DataRetentionCore dataRetentionCore, int i10, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = dataRetentionCore.stdRetention;
        }
        if ((i11 & 2) != 0) {
            map = dataRetentionCore.purposes;
        }
        if ((i11 & 4) != 0) {
            map2 = dataRetentionCore.specialPurposes;
        }
        return dataRetentionCore.copy(i10, map, map2);
    }

    public static final void write$Self(DataRetentionCore self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.stdRetention != 30) {
            output.encodeIntElement(serialDesc, 0, self.stdRetention);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !e0.areEqual(self.purposes, p1.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), self.purposes);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && e0.areEqual(self.specialPurposes, p1.emptyMap())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), self.specialPurposes);
    }

    public final int component1() {
        return this.stdRetention;
    }

    public final Map<String, Integer> component2() {
        return this.purposes;
    }

    public final Map<String, Integer> component3() {
        return this.specialPurposes;
    }

    public final DataRetentionCore copy(int i10, Map<String, Integer> purposes, Map<String, Integer> specialPurposes) {
        e0.checkNotNullParameter(purposes, "purposes");
        e0.checkNotNullParameter(specialPurposes, "specialPurposes");
        return new DataRetentionCore(i10, purposes, specialPurposes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataRetentionCore)) {
            return false;
        }
        DataRetentionCore dataRetentionCore = (DataRetentionCore) obj;
        return this.stdRetention == dataRetentionCore.stdRetention && e0.areEqual(this.purposes, dataRetentionCore.purposes) && e0.areEqual(this.specialPurposes, dataRetentionCore.specialPurposes);
    }

    public final Map<String, Integer> getPurposes() {
        return this.purposes;
    }

    public final Map<String, Integer> getSpecialPurposes() {
        return this.specialPurposes;
    }

    public final int getStdRetention() {
        return this.stdRetention;
    }

    public int hashCode() {
        return this.specialPurposes.hashCode() + o2.f(this.purposes, Integer.hashCode(this.stdRetention) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataRetentionCore(stdRetention=");
        sb2.append(this.stdRetention);
        sb2.append(", purposes=");
        sb2.append(this.purposes);
        sb2.append(", specialPurposes=");
        return j1.o2.q(sb2, this.specialPurposes, ')');
    }

    @f
    public /* synthetic */ DataRetentionCore(int i10, int i11, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        this.stdRetention = (i10 & 1) == 0 ? 30 : i11;
        if ((i10 & 2) == 0) {
            this.purposes = p1.emptyMap();
        } else {
            this.purposes = map;
        }
        if ((i10 & 4) == 0) {
            this.specialPurposes = p1.emptyMap();
        } else {
            this.specialPurposes = map2;
        }
    }

    public DataRetentionCore(int i10, Map<String, Integer> purposes, Map<String, Integer> specialPurposes) {
        e0.checkNotNullParameter(purposes, "purposes");
        e0.checkNotNullParameter(specialPurposes, "specialPurposes");
        this.stdRetention = i10;
        this.purposes = purposes;
        this.specialPurposes = specialPurposes;
    }

    public /* synthetic */ DataRetentionCore(int i10, Map map, Map map2, int i11, u uVar) {
        this((i11 & 1) != 0 ? 30 : i10, (i11 & 2) != 0 ? p1.emptyMap() : map, (i11 & 4) != 0 ? p1.emptyMap() : map2);
    }
}
