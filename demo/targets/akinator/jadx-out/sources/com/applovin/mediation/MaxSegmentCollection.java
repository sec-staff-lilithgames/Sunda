package com.applovin.mediation;

import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class MaxSegmentCollection {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Builder {
        Builder addSegment(MaxSegment maxSegment);

        MaxSegmentCollection build();
    }

    public static Builder builder() {
        return new MaxSegmentCollectionImpl.BuilderImpl();
    }

    public abstract List<MaxSegment> getSegments();
}
