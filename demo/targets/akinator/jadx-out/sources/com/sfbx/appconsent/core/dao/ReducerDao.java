package com.sfbx.appconsent.core.dao;

import android.content.Context;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ReducerDao {
    private final Context context;
    private final o reducerAsString$delegate;

    public ReducerDao(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
        this.reducerAsString$delegate = q.lazy(new ReducerDao$reducerAsString$2(this));
    }

    private final String getReducerAsString() {
        return (String) this.reducerAsString$delegate.getValue();
    }

    public final String getAssetReducer() {
        return getReducerAsString();
    }
}
