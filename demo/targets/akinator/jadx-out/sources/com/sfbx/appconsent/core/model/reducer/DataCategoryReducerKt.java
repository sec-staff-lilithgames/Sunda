package com.sfbx.appconsent.core.model.reducer;

import com.sfbx.appconsent.core.model.DataCategoryCore;
import com.sfbx.appconsent.core.model.api.proto.DataCategoryProtoMapper;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DataCategoryReducerKt {
    public static final DataCategoryCore toCore(DataCategoryReducer dataCategoryReducer) {
        e0.checkNotNullParameter(dataCategoryReducer, "<this>");
        return new DataCategoryCore(dataCategoryReducer.getId(), dataCategoryReducer.getName());
    }

    public static final DataCategoryProtoMapper toMapper(DataCategoryReducer dataCategoryReducer) {
        e0.checkNotNullParameter(dataCategoryReducer, "<this>");
        return new DataCategoryProtoMapper(dataCategoryReducer.getId(), dataCategoryReducer.getName());
    }
}
