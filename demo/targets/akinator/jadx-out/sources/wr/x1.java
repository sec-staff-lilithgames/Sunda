package wr;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public List f91181a;

    /* renamed from: b, reason: collision with root package name */
    public List f91182b;

    public x1() {
        List list = Collections.EMPTY_LIST;
        this.f91181a = list;
        this.f91182b = list;
    }

    public y1 build() {
        return new y1(this.f91181a, this.f91182b);
    }

    public x1 setSockets(List<v2> list) {
        mh.p1.checkState(this.f91181a.isEmpty());
        this.f91182b = Collections.unmodifiableList((List) mh.p1.checkNotNull(list));
        return this;
    }

    public x1 setSubchannels(List<v2> list) {
        mh.p1.checkState(this.f91182b.isEmpty());
        this.f91181a = Collections.unmodifiableList((List) mh.p1.checkNotNull(list));
        return this;
    }

    public x1 setCallsFailed(long j10) {
        return this;
    }

    public x1 setCallsStarted(long j10) {
        return this;
    }

    public x1 setCallsSucceeded(long j10) {
        return this;
    }

    public x1 setChannelTrace(d2 d2Var) {
        return this;
    }

    public x1 setLastCallStartedNanos(long j10) {
        return this;
    }

    public x1 setState(f0 f0Var) {
        return this;
    }

    public x1 setTarget(String str) {
        return this;
    }
}
