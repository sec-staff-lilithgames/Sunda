package com.applovin.impl.sdk;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import android.view.InputEvent;
import b0.e2;
import com.applovin.impl.b6;
import com.applovin.impl.o4;
import com.applovin.impl.p6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final k f15675a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f15676b;

    /* renamed from: e, reason: collision with root package name */
    private final MeasurementManager f15679e;

    /* renamed from: h, reason: collision with root package name */
    private final TopicsManager f15682h;

    /* renamed from: c, reason: collision with root package name */
    private final Set f15677c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f15678d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f15680f = new AtomicReference(new JSONArray());

    /* renamed from: g, reason: collision with root package name */
    private final d f15681g = new d(this, null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements OutcomeReceiver {
        public a() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            r.this.f15675a.O();
            if (o.a()) {
                r.this.f15675a.O().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        public void onResult(Object obj) {
            r.this.f15675a.O();
            if (o.a()) {
                r.this.f15675a.O().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            r.this.f15675a.O();
            if (o.a()) {
                r.this.f15675a.O().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        public void onResult(Object obj) {
            r.this.f15675a.O();
            if (o.a()) {
                r.this.f15675a.O().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements OutcomeReceiver {
        public c() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            r.this.f15675a.O();
            if (o.a()) {
                r.this.f15675a.O().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        public void onResult(Object obj) {
            r.this.f15675a.O();
            if (o.a()) {
                r.this.f15675a.O().a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements OutcomeReceiver {
        private d() {
        }

        public void a(GetTopicsResponse getTopicsResponse) {
            List<Topic> topics = getTopicsResponse.getTopics();
            int size = topics.size();
            r.this.f15675a.O();
            if (o.a()) {
                r.this.f15675a.O().d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<Topic> it = topics.iterator();
            while (it.hasNext()) {
                Topic topicC = li.a.c(it.next());
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, "id", topicC.getTopicId());
                JsonUtils.putLong(jSONObject, "model", topicC.getModelVersion());
                JsonUtils.putLong(jSONObject, "taxonomy", topicC.getTaxonomyVersion());
                jSONArray.put(jSONObject);
            }
            r.this.f15680f.set(jSONArray);
            r.this.b(((Boolean) r.this.f15675a.a(v4.X6)).booleanValue(), ((Long) r.this.f15675a.a(v4.V6)).longValue());
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            a(li.a.b(obj));
        }

        public /* synthetic */ d(r rVar, a aVar) {
            this();
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            String str;
            Long l9 = (Long) r.this.f15675a.a(v4.W6);
            boolean z10 = l9.longValue() == -1;
            r.this.f15675a.O();
            if (o.a()) {
                o oVarO = r.this.f15675a.O();
                StringBuilder sb2 = new StringBuilder("Failed to retrieve topics");
                if (z10) {
                    str = "";
                } else {
                    str = ", retrying in " + l9 + " ms";
                }
                sb2.append(str);
                oVarO.a("PrivacySandboxService", sb2.toString(), exc);
            }
            if (z10) {
                return;
            }
            r.this.b(((Boolean) r.this.f15675a.a(v4.Y6)).booleanValue(), l9.longValue());
        }
    }

    public r(k kVar) {
        this.f15675a = kVar;
        this.f15676b = kVar.r0().b();
        Context contextO = k.o();
        this.f15679e = j1.u.b(contextO.getSystemService(j1.u.l()));
        this.f15682h = li.a.d(contextO.getSystemService(li.a.e()));
        if (((Boolean) kVar.a(v4.U6)).booleanValue()) {
            b(((Boolean) kVar.a(v4.X6)).booleanValue(), 0L);
        }
    }

    private boolean c(String str) {
        synchronized (this.f15678d) {
            try {
                if (this.f15677c.contains(str)) {
                    return false;
                }
                this.f15677c.add(str);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(List list) {
        a("register impression", new t(7, this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list == null || list.isEmpty() || this.f15679e == null || !o4.e(k.E0)) {
            return;
        }
        this.f15675a.O();
        if (o.a()) {
            this.f15675a.O().a("PrivacySandboxService", "Registering impression...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f15679e.registerSource(Uri.parse((String) it.next()), null, this.f15676b, new a());
        }
    }

    public void b(List list, InputEvent inputEvent) {
        a("register click", new s(this, 4, list, inputEvent));
    }

    public void b(String str) {
        a("register conversion trigger event", new t(8, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10, long j10) {
        a("retrieve topics", new a0(this, z10, j10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.f15679e == null || !o4.e(k.E0)) {
            return;
        }
        this.f15675a.O();
        if (o.a()) {
            this.f15675a.O().a("PrivacySandboxService", "Registering click...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f15679e.registerSource(Uri.parse((String) it.next()), inputEvent, this.f15676b, new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str) || this.f15679e == null || !o4.e(k.E0)) {
            return;
        }
        this.f15675a.O();
        if (o.a()) {
            e2.y("Registering conversion: ", str, this.f15675a.O(), "PrivacySandboxService");
        }
        this.f15679e.registerTrigger(Uri.parse(str), this.f15676b, new c());
    }

    public JSONArray a() {
        return (JSONArray) this.f15680f.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, long j10) {
        if (this.f15682h == null) {
            return;
        }
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setShouldRecordObservation(z10).setAdsSdkName("AppLovin").build();
        if (j10 > 0) {
            this.f15675a.r0().a(new p6(this.f15675a, true, "getTopics", new t(6, this, getTopicsRequestBuild)), b6.b.OTHER, j10);
        } else {
            this.f15682h.getTopics(getTopicsRequestBuild, this.f15676b, this.f15681g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(GetTopicsRequest getTopicsRequest) {
        this.f15682h.getTopics(getTopicsRequest, this.f15676b, this.f15681g);
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f15675a.O();
            if (o.a()) {
                this.f15675a.O().a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th2) {
            this.f15675a.O();
            if (o.a()) {
                this.f15675a.O().a("PrivacySandboxService", "Failed to run operation: " + str, th2);
            }
            if (c(str)) {
                this.f15675a.E().a("PrivacySandboxService", str, th2);
            }
        }
    }
}
