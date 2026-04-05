package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface ByteStringDataSource {
    Object get(d<? super ByteStringStoreOuterClass.ByteStringStore> dVar);

    Object set(ByteString byteString, d<? super x0> dVar);
}
