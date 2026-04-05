package li;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.os.Bundle;
import ee.p;
import ee.u;
import io.odeeo.internal.b.g;
import io.odeeo.internal.d.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Function;
import jd.m;
import ko.e0;
import ko.z;
import m2.x0;
import m2.y;
import m2.z0;
import me.o;
import me.q;
import mk.r;
import mn.f;
import ne.e;
import nh.k1;
import nh.m1;
import w2.j;
import w2.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements b, e0, g.a, z0, m, u, mk.u, f, l, k1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f73379b;

    public /* synthetic */ a(int i10) {
        this.f73379b = i10;
    }

    public static /* bridge */ /* synthetic */ EncryptedTopic a(Object obj) {
        return (EncryptedTopic) obj;
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse b(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic c(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager d(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return TopicsManager.class;
    }

    @Override // w2.l
    public Object attachCompleter(j jVar) {
        jVar.setException(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    @Override // mn.f
    public String buildCacheKey(ln.m mVar) {
        String str = mVar.f73474h;
        return str != null ? str : mVar.f73467a.toString();
    }

    @Override // mk.u
    public Object construct() {
        switch (this.f73379b) {
            case 16:
                return new r();
            case 17:
                return new LinkedHashMap();
            case 18:
                return new TreeMap();
            case 19:
                return new ConcurrentHashMap();
            case 20:
                return new ConcurrentSkipListMap();
            case 21:
                return new ArrayList();
            case 22:
                return new LinkedHashSet();
            case 23:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    @Override // ee.u
    public p[] createExtractors() {
        switch (this.f73379b) {
            case 12:
                return new p[]{new o()};
            case 13:
                return new p[]{new q()};
            default:
                return new p[]{new e()};
        }
    }

    @Override // m2.z0
    public x0 filter(g2.b text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        return new x0(text, y.f73998a.getIdentity());
    }

    @Override // io.odeeo.internal.b.g.a
    /* renamed from: fromBundle */
    public g mo3834fromBundle(Bundle bundle) {
        switch (this.f73379b) {
            case 4:
                return d.a(bundle);
            default:
                return io.odeeo.internal.d0.a.a(bundle);
        }
    }

    @Override // nh.k1
    public Spliterator newFlatMapSpliterator(Spliterator spliterator, Spliterator spliterator2, Function function, int i10, long j10) {
        return new m1((Spliterator.OfDouble) spliterator, spliterator2, function, i10, j10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    @Override // li.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parse(android.util.JsonReader r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.a.parse(android.util.JsonReader):java.lang.Object");
    }

    @Override // ko.e0
    /* renamed from: createExtractors */
    public z[] mo3833createExtractors() {
        return new z[]{new lo.a()};
    }

    @Override // jd.m
    public void onSchedule(Exception exc) {
    }
}
