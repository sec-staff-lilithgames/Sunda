package qn;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import nh.b5;
import qn.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f83357a;

    /* renamed from: b, reason: collision with root package name */
    public final b5 f83358b;

    /* renamed from: c, reason: collision with root package name */
    public final long f83359c;

    /* renamed from: d, reason: collision with root package name */
    public final List f83360d;

    /* renamed from: e, reason: collision with root package name */
    public final List f83361e;

    /* renamed from: f, reason: collision with root package name */
    public final List f83362f;

    /* renamed from: g, reason: collision with root package name */
    public final i f83363g;

    public l(io.bidmachine.media3.common.b bVar, List list, m mVar, List list2, List list3, List list4) {
        io.bidmachine.media3.common.util.a.checkArgument(!list.isEmpty());
        this.f83357a = bVar;
        this.f83358b = b5.copyOf((Collection) list);
        this.f83360d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f83361e = list3;
        this.f83362f = list4;
        this.f83363g = mVar.getInitialization(this);
        this.f83359c = mVar.getPresentationTimeOffsetUs();
    }

    public static l newInstance(long j10, io.bidmachine.media3.common.b bVar, List<b> list, m mVar) {
        return newInstance(j10, bVar, list, mVar, null, b5.of(), b5.of(), null);
    }

    public abstract String getCacheKey();

    public abstract pn.q getIndex();

    public abstract i getIndexUri();

    public i getInitializationUri() {
        return this.f83363g;
    }

    public static l newInstance(long j10, io.bidmachine.media3.common.b bVar, List<b> list, m mVar, List<e> list2, List<e> list3, List<e> list4, String str) {
        if (mVar instanceof m.e) {
            return new k(j10, bVar, list, (m.e) mVar, list2, list3, list4, str, -1L);
        }
        if (mVar instanceof m.a) {
            return new j(j10, bVar, list, (m.a) mVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }
}
