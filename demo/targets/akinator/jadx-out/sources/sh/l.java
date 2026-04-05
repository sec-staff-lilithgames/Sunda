package sh;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class l extends kotlin.jvm.internal.d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f85830b = AtomicReferenceFieldUpdater.newUpdater(s.class, Thread.class, "a");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f85831c = AtomicReferenceFieldUpdater.newUpdater(s.class, s.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f85832d = AtomicReferenceFieldUpdater.newUpdater(t.class, s.class, "e");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f85833e = AtomicReferenceFieldUpdater.newUpdater(t.class, h.class, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f85834f = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    @Override // kotlin.jvm.internal.d0
    public final void B(s sVar, s sVar2) {
        f85831c.lazySet(sVar, sVar2);
    }

    @Override // kotlin.jvm.internal.d0
    public final void D(s sVar, Thread thread) {
        f85830b.lazySet(sVar, thread);
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean d(k kVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f85833e;
            if (atomicReferenceFieldUpdater.compareAndSet(kVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(kVar) == hVar);
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean f(t tVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f85834f;
            if (atomicReferenceFieldUpdater.compareAndSet(tVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(tVar) == obj);
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    public final boolean h(t tVar, s sVar, s sVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f85832d;
            if (atomicReferenceFieldUpdater.compareAndSet(tVar, sVar, sVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(tVar) == sVar);
        return false;
    }

    @Override // kotlin.jvm.internal.d0
    public final h l(k kVar) {
        return (h) f85833e.getAndSet(kVar, h.f85813d);
    }

    @Override // kotlin.jvm.internal.d0
    public final s m(k kVar) {
        return (s) f85832d.getAndSet(kVar, s.f85854c);
    }
}
