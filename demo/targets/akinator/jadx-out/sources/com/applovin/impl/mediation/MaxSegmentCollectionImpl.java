package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxSegmentCollectionImpl extends MaxSegmentCollection {

    /* renamed from: a, reason: collision with root package name */
    private final List f14503a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f14504b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* renamed from: a, reason: collision with root package name */
        private final List f14505a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f14505a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f14504b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f14503a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f14503a + "}";
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f14505a;
        this.f14503a = list;
        this.f14504b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f14504b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
