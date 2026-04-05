package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import bv.b;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import k4.h;
import kotlin.jvm.internal.e0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PreservingByteStringPreferenceMigration implements h {
    private final Context context;
    private final GetByteStringData getByteStringData;
    private final String key;
    private final String name;

    public PreservingByteStringPreferenceMigration(Context context, String name, String key, GetByteStringData getByteStringData) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = name;
        this.key = key;
        this.getByteStringData = getByteStringData;
    }

    @Override // k4.h
    public Object cleanUp(d<? super x0> dVar) {
        return x0.f87415a;
    }

    @Override // k4.h
    public /* bridge */ /* synthetic */ Object migrate(Object obj, d dVar) {
        return migrate((ByteStringStoreOuterClass.ByteStringStore) obj, (d<? super ByteStringStoreOuterClass.ByteStringStore>) dVar);
    }

    @Override // k4.h
    public /* bridge */ /* synthetic */ Object shouldMigrate(Object obj, d dVar) {
        return shouldMigrate((ByteStringStoreOuterClass.ByteStringStore) obj, (d<? super Boolean>) dVar);
    }

    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
        String string;
        if (!byteStringStore.getData().isEmpty() || (string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null)) == null || string.length() == 0) {
            return byteStringStore;
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        e0.checkNotNullExpressionValue(byteStringStoreBuild, "newBuilder()\n           …                 .build()");
        return byteStringStoreBuild;
    }

    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, d<? super Boolean> dVar) {
        return b.boxBoolean(byteStringStore.getData().isEmpty());
    }
}
