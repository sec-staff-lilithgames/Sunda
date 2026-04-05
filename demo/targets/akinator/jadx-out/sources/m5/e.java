package m5;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f74037a = new e();

    public final d convertResponse$ads_adservices_release(GetTopicsResponse response) {
        e0.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator<Topic> it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicC = li.a.c(it.next());
            arrayList.add(new f(topicC.getTaxonomyVersion(), topicC.getModelVersion(), topicC.getTopicId()));
        }
        return new d(arrayList);
    }

    public final d convertResponseWithEncryptedTopics$ads_adservices_release(GetTopicsResponse response) {
        e0.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator<Topic> it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicC = li.a.c(it.next());
            arrayList.add(new f(topicC.getTaxonomyVersion(), topicC.getModelVersion(), topicC.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            EncryptedTopic encryptedTopicA = li.a.a(it2.next());
            byte[] encryptedTopic = encryptedTopicA.getEncryptedTopic();
            e0.checkNotNullExpressionValue(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicA.getKeyIdentifier();
            e0.checkNotNullExpressionValue(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicA.getEncapsulatedKey();
            e0.checkNotNullExpressionValue(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new a(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new d(arrayList, arrayList2);
    }
}
