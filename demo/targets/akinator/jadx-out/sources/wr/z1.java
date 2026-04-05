package wr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public Long f91217a;

    /* renamed from: b, reason: collision with root package name */
    public Long f91218b;

    /* renamed from: c, reason: collision with root package name */
    public List f91219c = Collections.EMPTY_LIST;

    public d2 build() {
        mh.p1.checkNotNull(this.f91217a, "numEventsLogged");
        mh.p1.checkNotNull(this.f91218b, "creationTimeNanos");
        this.f91217a.getClass();
        this.f91218b.getClass();
        return new d2(this.f91219c);
    }

    public z1 setCreationTimeNanos(long j10) {
        this.f91218b = Long.valueOf(j10);
        return this;
    }

    public z1 setEvents(List<c2> list) {
        this.f91219c = Collections.unmodifiableList(new ArrayList(list));
        return this;
    }

    public z1 setNumEventsLogged(long j10) {
        this.f91217a = Long.valueOf(j10);
        return this;
    }
}
