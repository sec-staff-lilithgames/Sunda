package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class N7 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f32049a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f32050b = Executors.newSingleThreadExecutor(new Q5("MultiEventBus"));

    public static final void a(C2762f2 event, N7 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "$event");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        int i10 = event.f32830a;
        this$0.a(event);
    }

    public final void b(C2762f2 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        try {
            this.f32050b.execute(new zk.n(4, event, this));
        } catch (InternalError unused) {
            a(event);
        }
    }

    public final void a(int[] eventIds, kv.l subscriber) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventIds, "eventIds");
        kotlin.jvm.internal.e0.checkNotNullParameter(subscriber, "subscriber");
        this.f32049a.put(new M7(eventIds), new WeakReference(subscriber));
    }

    public final void a(kv.l subscriber) {
        kotlin.jvm.internal.e0.checkNotNullParameter(subscriber, "subscriber");
        Iterator it = this.f32049a.entrySet().iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.e0.areEqual(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(C2762f2 c2762f2) {
        kv.l lVar;
        Set<Map.Entry> setEntrySet = this.f32049a.entrySet();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        for (Map.Entry entry : setEntrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f32049a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> setEntrySet2 = this.f32049a.entrySet();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setEntrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : setEntrySet2) {
            kotlin.jvm.internal.e0.checkNotNull(entry2);
            kv.l lVar2 = (kv.l) entry2.getKey();
            WeakReference weakReference = (WeakReference) entry2.getValue();
            try {
                if (((Boolean) lVar2.invoke(c2762f2)).booleanValue() && (lVar = (kv.l) weakReference.get()) != null) {
                    lVar.invoke(c2762f2);
                }
            } catch (Exception e10) {
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
    }
}
