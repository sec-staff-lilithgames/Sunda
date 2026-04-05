package m5;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.e0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f74035a;

    /* renamed from: b, reason: collision with root package name */
    public final List f74036b;

    public d(List<f> topics, List<a> encryptedTopics) {
        e0.checkNotNullParameter(topics, "topics");
        e0.checkNotNullParameter(encryptedTopics, "encryptedTopics");
        this.f74035a = topics;
        this.f74036b = encryptedTopics;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        List list = this.f74035a;
        int size = list.size();
        d dVar = (d) obj;
        List list2 = dVar.f74036b;
        List list3 = dVar.f74035a;
        if (size == list3.size()) {
            List list4 = this.f74036b;
            if (list4.size() == list2.size() && e0.areEqual(new HashSet(list), new HashSet(list3)) && e0.areEqual(new HashSet(list4), new HashSet(list2))) {
                return true;
            }
        }
        return false;
    }

    public final List<a> getEncryptedTopics() {
        return this.f74036b;
    }

    public final List<f> getTopics() {
        return this.f74035a;
    }

    public int hashCode() {
        return Objects.hash(this.f74035a, this.f74036b);
    }

    public String toString() {
        return "GetTopicsResponse: Topics=" + this.f74035a + ", EncryptedTopics=" + this.f74036b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(List<f> topics) {
        this(topics, p0.emptyList());
        e0.checkNotNullParameter(topics, "topics");
    }
}
