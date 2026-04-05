package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MediationTraitsMetadataReader extends MetadataReader<JSONObject> {
    public static final String BOLD_SDK_ENABLED = "boldSdkEnabled";
    public static final Companion Companion = new Companion(null);
    public static final String MEDIATION_TRAITS = "mediation.traits.value";
    public static final String USE_REFACTORED_HTTP_CLIENT = "useRefactoredHttpClient";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationTraitsMetadataReader(JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_TRAITS);
        e0.checkNotNullParameter(jsonStorage, "jsonStorage");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean getBooleanTrait(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            com.unity3d.services.core.misc.JsonStorage r0 = r3.getJsonStorage()
            java.lang.String r1 = r3.getKey()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r2 = "get(key)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r2)
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 != 0) goto L22
        L21:
            r0 = r1
        L22:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L39
            boolean r2 = r0.has(r4)
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L39
            boolean r4 = r0.optBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.getBooleanTrait(java.lang.String):java.lang.Boolean");
    }
}
