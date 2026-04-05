package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.nmd;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface my {
    public static final jd<JSONObject> jpo = new jd<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.my.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.my.jd
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public JSONObject jd(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                nmd.jpo("ISettingsDataRepository", "", e10);
                return null;
            }
        }
    };

    /* renamed from: jd, reason: collision with root package name */
    public static final jd<Set<String>> f20881jd = new jd<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.my.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.my.jd
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public Set<String> jd(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.getString(i10));
                }
                return hashSet;
            } catch (Exception e10) {
                nmd.jpo("ISettingsDataRepository", "", e10);
                return hashSet;
            }
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd<T> {
        T jd(String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        jpo jpo(String str);

        jpo jpo(String str, float f10);

        jpo jpo(String str, int i10);

        jpo jpo(String str, long j10);

        jpo jpo(String str, String str2);

        jpo jpo(String str, boolean z10);

        void jpo();
    }

    void jpo(JSONObject jSONObject);
}
