package com.unity3d.ads.datastore;

import com.unity3d.ads.datastore.UniversalRequestStoreKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class UniversalRequestStoreKtKt {
    /* renamed from: -initializeuniversalRequestStore, reason: not valid java name */
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore m3510initializeuniversalRequestStore(l block) {
        e0.checkNotNullParameter(block, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.Companion;
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builderNewBuilder = UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        UniversalRequestStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UniversalRequestStoreOuterClass.UniversalRequestStore copy(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, l block) {
        e0.checkNotNullParameter(universalRequestStore, "<this>");
        e0.checkNotNullParameter(block, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.Companion;
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = universalRequestStore.toBuilder();
        e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
        UniversalRequestStoreKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
