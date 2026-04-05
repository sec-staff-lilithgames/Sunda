package com.fyber.inneractive.sdk.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.os.OutcomeReceiver;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f26687a;

    public a(b bVar) {
        this.f26687a = bVar;
    }

    public final void onError(Throwable th2) {
        IAlog.a("%sTopic Experienced an error, and did not return successfully: %s", IAlog.a(b.class), ((Exception) th2).getMessage());
    }

    public final void onResult(Object obj) {
        GetTopicsResponse getTopicsResponseB = li.a.b(obj);
        b bVar = this.f26687a;
        if (bVar.f26688a) {
            List<Topic> topics = getTopicsResponseB.getTopics();
            if (topics.isEmpty()) {
                IAlog.a("Topic results returned empty", new Object[0]);
            } else {
                bVar.f26693f = new ArrayList();
                for (int i10 = 0; i10 < topics.size(); i10++) {
                    IAlog.a("Topic returned %s", li.a.c(topics.get(i10)).toString());
                    bVar.f26693f.add(li.a.c(topics.get(i10)));
                }
            }
        }
        if (this.f26687a.f26689b && IAConfigManager.c()) {
            b bVar2 = this.f26687a;
            List encryptedTopics = getTopicsResponseB.getEncryptedTopics();
            bVar2.getClass();
            if (encryptedTopics.isEmpty()) {
                IAlog.a("EncryptedTopic results returned empty", new Object[0]);
                return;
            }
            bVar2.f26692e = new ArrayList();
            for (int i11 = 0; i11 < encryptedTopics.size(); i11++) {
                IAlog.a("EncryptedTopic returned %s", li.a.a(encryptedTopics.get(i11)).toString());
                bVar2.f26692e.add(li.a.a(encryptedTopics.get(i11)));
            }
        }
    }
}
