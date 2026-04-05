package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage publicStorage;

    public AndroidDeveloperConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage publicStorage) {
        e0.checkNotNullParameter(flattenerRulesUseCase, "flattenerRulesUseCase");
        e0.checkNotNullParameter(publicStorage, "publicStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = publicStorage;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(String str, boolean z10) {
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setType(getDeveloperConsentType(str));
        if (dsl_create.getType() == DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            dsl_create.setCustomType(str);
        }
        dsl_create.setValue(getDeveloperConsentChoice(Boolean.valueOf(z10)));
        return dsl_create._build();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() throws org.json.JSONException {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.json.JSONObject r1 = r9.fetchData()
            java.util.Iterator r2 = r1.keys()
            java.lang.String r3 = "data.keys()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r3)
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            boolean r5 = r4 instanceof java.lang.Boolean
            java.lang.String r6 = "storedValue"
            java.lang.String r7 = "key"
            if (r5 == 0) goto L3b
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r7)
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption r3 = r9.createDeveloperConsentOption(r3, r4)
            goto L64
        L3b:
            boolean r5 = r4 instanceof java.lang.String
            r8 = 0
            if (r5 == 0) goto L57
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "true"
            r6 = 1
            boolean r5 = sv.k0.equals(r4, r5, r6)
            if (r5 != 0) goto L59
            java.lang.String r5 = "false"
            boolean r5 = sv.k0.equals(r4, r5, r6)
            if (r5 == 0) goto L57
            goto L59
        L57:
            r3 = r8
            goto L64
        L59:
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r7)
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            gatewayprotocol.v1.DeveloperConsentOuterClass$DeveloperConsentOption r3 = r9.createDeveloperConsentOption(r3, r4)
        L64:
            if (r3 == 0) goto L12
            r0.add(r3)
            goto L12
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource.developerConsentList():java.util.List");
    }

    private final JSONObject fetchData() {
        if (this.publicStorage.getData() == null) {
            return new JSONObject();
        }
        JSONObject jSONObjectFlattenJson = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
        e0.checkNotNullExpressionValue(jSONObjectFlattenJson, "flattener.flattenJson(\".… flattenerRulesUseCase())");
        return jSONObjectFlattenJson;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(Boolean bool) {
        return e0.areEqual(bool, Boolean.TRUE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE : e0.areEqual(bool, Boolean.FALSE) ? DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE : DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(String str) {
        if (str == null) {
            return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
        }
        switch (str.hashCode()) {
            case -1998919769:
                if (str.equals("user.nonbehavioral")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case -1078801183:
                if (str.equals("pipl.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                break;
            case -5454905:
                if (str.equals(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY)) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                break;
            case 194451659:
                if (str.equals("gdpr.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                break;
            case 519433140:
                if (str.equals("privacy.consent")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                break;
            case 2033752033:
                if (str.equals("privacy.useroveragelimit")) {
                    return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                break;
        }
        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
    }

    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllOptions(dsl_create.getOptions(), developerConsentList());
        return dsl_create._build();
    }
}
