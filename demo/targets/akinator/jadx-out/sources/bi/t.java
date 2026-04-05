package bi;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t implements yi.d, yi.c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9592a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f9593b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9594c;

    public t(Executor executor) {
        this.f9594c = executor;
    }

    @Override // yi.c
    public void publish(yi.a aVar) {
        Set<Map.Entry> setEntrySet;
        z.checkNotNull(aVar);
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f9593b;
                if (arrayDeque != null) {
                    arrayDeque.add(aVar);
                    return;
                }
                synchronized (this) {
                    try {
                        Map map = (Map) this.f9592a.get(aVar.getType());
                        setEntrySet = map == null ? Collections.EMPTY_SET : map.entrySet();
                    } finally {
                    }
                }
                for (Map.Entry entry : setEntrySet) {
                    ((Executor) entry.getValue()).execute(new af.n(10, entry, aVar));
                }
            } finally {
            }
        }
    }

    @Override // yi.d
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, yi.b bVar) {
        try {
            z.checkNotNull(cls);
            z.checkNotNull(bVar);
            z.checkNotNull(executor);
            if (!this.f9592a.containsKey(cls)) {
                this.f9592a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f9592a.get(cls)).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // yi.d
    public synchronized <T> void unsubscribe(Class<T> cls, yi.b bVar) {
        z.checkNotNull(cls);
        z.checkNotNull(bVar);
        if (this.f9592a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f9592a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f9592a.remove(cls);
            }
        }
    }

    @Override // yi.d
    public <T> void subscribe(Class<T> cls, yi.b bVar) {
        subscribe(cls, this.f9594c, bVar);
    }
}
