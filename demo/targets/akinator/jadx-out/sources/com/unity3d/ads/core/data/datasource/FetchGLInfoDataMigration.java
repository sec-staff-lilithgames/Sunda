package com.unity3d.ads.core.data.datasource;

import bv.b;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import k4.h;
import kotlin.jvm.internal.e0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FetchGLInfoDataMigration implements h {
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(GetOpenGLRendererInfo getOpenGLRendererInfo) {
        e0.checkNotNullParameter(getOpenGLRendererInfo, "getOpenGLRendererInfo");
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
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
        ByteString byteStringGatherOpenGLRendererInfo;
        try {
            byteStringGatherOpenGLRendererInfo = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            byteStringGatherOpenGLRendererInfo = ByteString.EMPTY;
            e0.checkNotNullExpressionValue(byteStringGatherOpenGLRendererInfo, "{\n            ByteString.EMPTY\n        }");
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteStringGatherOpenGLRendererInfo).build();
        e0.checkNotNullExpressionValue(byteStringStoreBuild, "newBuilder()\n           …rer)\n            .build()");
        return byteStringStoreBuild;
    }

    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, d<? super Boolean> dVar) {
        return b.boxBoolean(byteStringStore.getData().isEmpty());
    }
}
