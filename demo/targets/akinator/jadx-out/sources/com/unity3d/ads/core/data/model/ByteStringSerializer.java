package com.unity3d.ads.core.data.model;

import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import k4.e;
import k4.h2;
import kotlin.jvm.internal.e0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ByteStringSerializer implements h2 {
    private final ByteStringStoreOuterClass.ByteStringStore defaultValue;

    public ByteStringSerializer() {
        ByteStringStoreOuterClass.ByteStringStore defaultInstance = ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance();
        e0.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // k4.h2
    public Object readFrom(InputStream inputStream, d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) throws IOException {
        try {
            ByteStringStoreOuterClass.ByteStringStore from = ByteStringStoreOuterClass.ByteStringStore.parseFrom(inputStream);
            e0.checkNotNullExpressionValue(from, "parseFrom(input)");
            return from;
        } catch (InvalidProtocolBufferException e10) {
            throw new e("Cannot read proto.", e10);
        }
    }

    @Override // k4.h2
    public /* bridge */ /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, d dVar) {
        return writeTo((ByteStringStoreOuterClass.ByteStringStore) obj, outputStream, (d<? super x0>) dVar);
    }

    @Override // k4.h2
    public ByteStringStoreOuterClass.ByteStringStore getDefaultValue() {
        return this.defaultValue;
    }

    public Object writeTo(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OutputStream outputStream, d<? super x0> dVar) throws IOException {
        byteStringStore.writeTo(outputStream);
        return x0.f87415a;
    }
}
