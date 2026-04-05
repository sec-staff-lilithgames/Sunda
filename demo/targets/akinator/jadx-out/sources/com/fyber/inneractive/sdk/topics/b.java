package com.fyber.inneractive.sdk.topics;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.util.Base64;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26688a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26689b;

    /* renamed from: g, reason: collision with root package name */
    public a f26694g;

    /* renamed from: h, reason: collision with root package name */
    public GetTopicsRequest f26695h;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f26690c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f26691d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f26692e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f26693f = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f26696i = new AtomicBoolean(false);

    public final void a(boolean z10, boolean z11) {
        if (this.f26696i.compareAndSet(false, true)) {
            this.f26688a = z10;
            this.f26689b = z11;
            GetTopicsRequest.Builder builder = new GetTopicsRequest.Builder();
            builder.setAdsSdkName("com.fyber.inneractive.sdk");
            this.f26695h = builder.build();
            this.f26694g = new a(this);
        }
    }

    public final JSONArray b() throws JSONException {
        JSONObject jSONObject;
        if (this.f26693f.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f26693f.iterator();
        while (it.hasNext()) {
            Topic topicC = li.a.c(it.next());
            if (this.f26691d.containsKey(topicC)) {
                jSONObject = (JSONObject) this.f26691d.get(topicC);
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", topicC.getTopicId());
                    jSONObject2.put("mv", topicC.getModelVersion());
                    jSONObject2.put("tv", topicC.getTaxonomyVersion());
                    this.f26691d.put(topicC, jSONObject2);
                    jSONObject = jSONObject2;
                } catch (Exception e10) {
                    IAlog.a("%sException when convertTopicToJSON called", e10, IAlog.a(this));
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }

    public final void c() {
        TopicsManager topicsManagerD;
        Context baseContext = o.f26796a.getBaseContext();
        if (baseContext == null || (topicsManagerD = li.a.d(baseContext.getSystemService(li.a.e()))) == null) {
            return;
        }
        topicsManagerD.getTopics(this.f26695h, r.f26803a, this.f26694g);
    }

    public final JSONArray a() throws JSONException {
        JSONObject jSONObject;
        if (this.f26692e.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f26692e.iterator();
        while (it.hasNext()) {
            EncryptedTopic encryptedTopicA = li.a.a(it.next());
            if (!IAConfigManager.c()) {
                jSONObject = null;
            } else if (this.f26690c.containsKey(encryptedTopicA)) {
                jSONObject = (JSONObject) this.f26690c.get(encryptedTopicA);
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    byte[] encryptedTopic = encryptedTopicA.getEncryptedTopic();
                    jSONObject2.put(ApsMetricsDataMap.APSMETRICS_FIELD_ENDTIME, encryptedTopic == null ? null : Base64.encodeToString(encryptedTopic, 10));
                    jSONObject2.put("ki", encryptedTopicA.getKeyIdentifier());
                    byte[] encapsulatedKey = encryptedTopicA.getEncapsulatedKey();
                    jSONObject2.put("ek", encapsulatedKey == null ? null : Base64.encodeToString(encapsulatedKey, 10));
                    this.f26690c.put(encryptedTopicA, jSONObject2);
                    jSONObject = jSONObject2;
                } catch (Exception e10) {
                    IAlog.a("%sException when convertEncryptedTopicToJSON called", e10, IAlog.a(this));
                }
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}
