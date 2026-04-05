package m0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 implements t1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f73830a;

    /* renamed from: e, reason: collision with root package name */
    public kv.l f73834e;

    /* renamed from: f, reason: collision with root package name */
    public kv.q f73835f;

    /* renamed from: g, reason: collision with root package name */
    public kv.l f73836g;

    /* renamed from: h, reason: collision with root package name */
    public kv.s f73837h;

    /* renamed from: i, reason: collision with root package name */
    public kv.a f73838i;

    /* renamed from: j, reason: collision with root package name */
    public kv.l f73839j;

    /* renamed from: k, reason: collision with root package name */
    public kv.l f73840k;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f73831b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f73832c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f73833d = new AtomicLong(1);

    /* renamed from: l, reason: collision with root package name */
    public final p0.j2 f73841l = o5.mutableStateOf$default(uu.p1.emptyMap(), null, 2, null);

    public final kv.l getAfterSelectableUnsubscribe$foundation_release() {
        return this.f73840k;
    }

    public final kv.l getOnPositionChangeCallback$foundation_release() {
        return this.f73834e;
    }

    public final kv.l getOnSelectableChangeCallback$foundation_release() {
        return this.f73839j;
    }

    public final kv.s getOnSelectionUpdateCallback$foundation_release() {
        return this.f73837h;
    }

    public final kv.a getOnSelectionUpdateEndCallback$foundation_release() {
        return this.f73838i;
    }

    public final kv.l getOnSelectionUpdateSelectAll$foundation_release() {
        return this.f73836g;
    }

    public final kv.q getOnSelectionUpdateStartCallback$foundation_release() {
        return this.f73835f;
    }

    public final Map<Long, r> getSelectableMap$foundation_release() {
        return this.f73832c;
    }

    public final List<r> getSelectables$foundation_release() {
        return this.f73831b;
    }

    public final boolean getSorted$foundation_release() {
        return this.f73830a;
    }

    @Override // m0.t1
    public Map<Long, s> getSubselections() {
        return (Map) this.f73841l.getValue();
    }

    @Override // m0.t1
    public long nextSelectableId() {
        AtomicLong atomicLong = this.f73833d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // m0.t1
    public void notifyPositionChange(long j10) {
        this.f73830a = false;
        kv.l lVar = this.f73834e;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // m0.t1
    public void notifySelectableChange(long j10) {
        kv.l lVar = this.f73839j;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // m0.t1
    /* renamed from: notifySelectionUpdate-5iVPX68 */
    public boolean mo5570notifySelectionUpdate5iVPX68(x1.d0 layoutCoordinates, long j10, long j11, boolean z10, b0 adjustment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        kv.s sVar = this.f73837h;
        if (sVar != null) {
            return ((Boolean) sVar.invoke(layoutCoordinates, i1.h.m4174boximpl(j10), i1.h.m4174boximpl(j11), Boolean.valueOf(z10), adjustment)).booleanValue();
        }
        return true;
    }

    @Override // m0.t1
    public void notifySelectionUpdateEnd() {
        kv.a aVar = this.f73838i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // m0.t1
    public void notifySelectionUpdateSelectAll(long j10) {
        kv.l lVar = this.f73836g;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j10));
        }
    }

    @Override // m0.t1
    /* renamed from: notifySelectionUpdateStart-d-4ec7I */
    public void mo5571notifySelectionUpdateStartd4ec7I(x1.d0 layoutCoordinates, long j10, b0 adjustment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        kv.q qVar = this.f73835f;
        if (qVar != null) {
            qVar.invoke(layoutCoordinates, i1.h.m4174boximpl(j10), adjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(kv.l lVar) {
        this.f73840k = lVar;
    }

    public final void setOnPositionChangeCallback$foundation_release(kv.l lVar) {
        this.f73834e = lVar;
    }

    public final void setOnSelectableChangeCallback$foundation_release(kv.l lVar) {
        this.f73839j = lVar;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(kv.s sVar) {
        this.f73837h = sVar;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(kv.a aVar) {
        this.f73838i = aVar;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(kv.l lVar) {
        this.f73836g = lVar;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(kv.q qVar) {
        this.f73835f = qVar;
    }

    public final void setSorted$foundation_release(boolean z10) {
        this.f73830a = z10;
    }

    public void setSubselections(Map<Long, s> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<set-?>");
        this.f73841l.setValue(map);
    }

    public final List<r> sort(x1.d0 containerLayoutCoordinates) {
        kotlin.jvm.internal.e0.checkNotNullParameter(containerLayoutCoordinates, "containerLayoutCoordinates");
        if (!this.f73830a) {
            uu.u0.sortWith(this.f73831b, new bg.d(containerLayoutCoordinates, 2));
            this.f73830a = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // m0.t1
    public r subscribe(r selectable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(selectable, "selectable");
        if (selectable.getSelectableId() == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        }
        Long lValueOf = Long.valueOf(selectable.getSelectableId());
        LinkedHashMap linkedHashMap = this.f73832c;
        if (linkedHashMap.containsKey(lValueOf)) {
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
        }
        linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selectable);
        this.f73831b.add(selectable);
        this.f73830a = false;
        return selectable;
    }

    @Override // m0.t1
    public void unsubscribe(r selectable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(selectable, "selectable");
        Long lValueOf = Long.valueOf(selectable.getSelectableId());
        LinkedHashMap linkedHashMap = this.f73832c;
        if (linkedHashMap.containsKey(lValueOf)) {
            this.f73831b.remove(selectable);
            linkedHashMap.remove(Long.valueOf(selectable.getSelectableId()));
            kv.l lVar = this.f73840k;
            if (lVar != null) {
                lVar.invoke(Long.valueOf(selectable.getSelectableId()));
            }
        }
    }
}
