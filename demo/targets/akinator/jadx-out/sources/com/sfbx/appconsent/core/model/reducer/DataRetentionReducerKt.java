package com.sfbx.appconsent.core.model.reducer;

import com.sfbx.appconsent.core.model.DataRetentionCore;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DataRetentionReducerKt {
    public static final DataRetentionCore toCore(DataRetentionReducer dataRetentionReducer) {
        e0.checkNotNullParameter(dataRetentionReducer, "<this>");
        return new DataRetentionCore(dataRetentionReducer.getStdRetention(), dataRetentionReducer.getPurposes(), dataRetentionReducer.getSpecialPurposes());
    }
}
