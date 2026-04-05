package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import li.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TopicsReceiver implements OutcomeReceiver {
    private final IEventSender eventSender;

    public TopicsReceiver(IEventSender eventSender) {
        e0.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final JSONObject formatTopic(Topic topic) throws JSONException {
        e0.checkNotNullParameter(topic, "topic");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taxonomyVersion", topic.getTaxonomyVersion());
        jSONObject.put("modelVersion", topic.getModelVersion());
        jSONObject.put("topicId", topic.getTopicId());
        return jSONObject;
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        onResult(a.b(obj));
    }

    public void onError(Exception error) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(error, "error");
        DeviceLog.debug("GetTopics exception: " + error);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, error.toString());
    }

    public void onResult(GetTopicsResponse result) {
        e0.checkNotNullParameter(result, "result");
        JSONArray jSONArray = new JSONArray();
        List<Topic> topics = result.getTopics();
        e0.checkNotNullExpressionValue(topics, "result.topics");
        Iterator<T> it = topics.iterator();
        while (it.hasNext()) {
            Topic it2 = a.c(it.next());
            e0.checkNotNullExpressionValue(it2, "it");
            jSONArray.put(formatTopic(it2));
        }
        IEventSender iEventSender = this.eventSender;
        WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOPICS;
        TopicsEvents topicsEvents = TopicsEvents.TOPICS_AVAILABLE;
        String string = jSONArray.toString();
        e0.checkNotNullExpressionValue(string, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, string);
    }
}
