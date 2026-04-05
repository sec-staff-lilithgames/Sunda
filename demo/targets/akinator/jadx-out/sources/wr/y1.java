package wr;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f91194a;

    /* renamed from: b, reason: collision with root package name */
    public final List f91195b;

    public y1(List list, List list2) {
        mh.p1.checkState(list.isEmpty() || list2.isEmpty(), "channels can have subchannels only, subchannels can have either sockets OR subchannels, neither can have both");
        this.f91194a = (List) mh.p1.checkNotNull(list);
        this.f91195b = (List) mh.p1.checkNotNull(list2);
    }
}
