package com.sfbx.appconsentv3.ui.model;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DataCategoryProtoMapperCore {

    /* renamed from: id, reason: collision with root package name */
    private final int f50541id;
    private final I18NStringCore name;

    public DataCategoryProtoMapperCore(int i10, I18NStringCore name) {
        e0.checkNotNullParameter(name, "name");
        this.f50541id = i10;
        this.name = name;
    }

    public static /* synthetic */ DataCategoryProtoMapperCore copy$default(DataCategoryProtoMapperCore dataCategoryProtoMapperCore, int i10, I18NStringCore i18NStringCore, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = dataCategoryProtoMapperCore.f50541id;
        }
        if ((i11 & 2) != 0) {
            i18NStringCore = dataCategoryProtoMapperCore.name;
        }
        return dataCategoryProtoMapperCore.copy(i10, i18NStringCore);
    }

    public final int component1() {
        return this.f50541id;
    }

    public final I18NStringCore component2() {
        return this.name;
    }

    public final DataCategoryProtoMapperCore copy(int i10, I18NStringCore name) {
        e0.checkNotNullParameter(name, "name");
        return new DataCategoryProtoMapperCore(i10, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCategoryProtoMapperCore)) {
            return false;
        }
        DataCategoryProtoMapperCore dataCategoryProtoMapperCore = (DataCategoryProtoMapperCore) obj;
        return this.f50541id == dataCategoryProtoMapperCore.f50541id && e0.areEqual(this.name, dataCategoryProtoMapperCore.name);
    }

    public final int getId() {
        return this.f50541id;
    }

    public final I18NStringCore getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.f50541id) * 31);
    }

    public String toString() {
        return "DataCategoryProtoMapperCore(id=" + this.f50541id + ", name=" + this.name + ')';
    }
}
