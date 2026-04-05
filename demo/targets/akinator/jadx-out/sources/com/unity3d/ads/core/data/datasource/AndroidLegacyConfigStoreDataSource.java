package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";
    private final StorageManager storageManager;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidLegacyConfigStoreDataSource(StorageManager storageManager) {
        e0.checkNotNullParameter(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(d<? super ByteStringStoreOuterClass.ByteStringStore> dVar) {
        Object objM7131constructorimpl;
        Object obj = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        String str = obj instanceof String ? (String) obj : null;
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(str != null ? ProtobufExtensionsKt.fromBase64(str, true) : null);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        ByteString EMPTY = (ByteString) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (EMPTY == null) {
            EMPTY = ByteString.EMPTY;
            e0.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        dsl_create.setData(EMPTY);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, d<? super x0> dVar) {
        Storage storage = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return x0.f87415a;
    }
}
