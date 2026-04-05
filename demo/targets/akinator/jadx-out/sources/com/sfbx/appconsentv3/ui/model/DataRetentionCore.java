package com.sfbx.appconsentv3.ui.model;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DataRetentionCore {
    private final Map<String, Integer> purposes;
    private final Map<String, Integer> specialPurposes;
    private final int stdRetention;

    public DataRetentionCore() {
        this(0, null, null, 7, null);
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
