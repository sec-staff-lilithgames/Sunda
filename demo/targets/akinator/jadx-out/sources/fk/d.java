package fk;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f55729a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f55730b = Collections.synchronizedMap(new LinkedHashMap());

    public static b a(e eVar) {
        Map dependencies = f55730b;
        e0.checkNotNullExpressionValue(dependencies, "dependencies");
        Object obj = dependencies.get(eVar);
        if (obj != null) {
            e0.checkNotNullExpressionValue(obj, "getOrElse(...)");
            return (b) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + eVar + ". Dependencies should be added at class load time.");
    }

    public static final void addDependency(e subscriberName) {
        e0.checkNotNullParameter(subscriberName, "subscriberName");
        Map dependencies = f55730b;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("FirebaseSessions", "Dependency " + subscriberName + " already added.");
            return;
        }
        e0.checkNotNullExpressionValue(dependencies, "dependencies");
        dependencies.put(subscriberName, new b(MutexKt.Mutex(true), null, 2, null));
        Log.d("FirebaseSessions", "Dependency to " + subscriberName + " added.");
    }

    public static final void register(g subscriber) {
        e0.checkNotNullParameter(subscriber, "subscriber");
        e sessionSubscriberName = subscriber.getSessionSubscriberName();
        b bVarA = a(sessionSubscriberName);
        if (bVarA.getSubscriber() != null) {
            Log.d("FirebaseSessions", "Subscriber " + sessionSubscriberName + " already registered.");
            return;
        }
        bVarA.setSubscriber(subscriber);
        Log.d("FirebaseSessions", "Subscriber " + sessionSubscriberName + " registered.");
        Mutex.DefaultImpls.unlock$default(bVarA.getMutex(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009e -> B:27:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(zu.d<? super java.util.Map<fk.e, ? extends fk.g>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof fk.c
            if (r0 == 0) goto L13
            r0 = r11
            fk.c r0 = (fk.c) r0
            int r1 = r0.f55728q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55728q = r1
            goto L18
        L13:
            fk.c r0 = new fk.c
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f55726o
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f55728q
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r2 = r0.f55725n
            java.util.Map r5 = r0.f55724m
            java.util.Map r5 = (java.util.Map) r5
            kotlinx.coroutines.sync.Mutex r6 = r0.f55723l
            fk.e r7 = r0.f55722k
            java.util.Iterator r8 = r0.f55721j
            java.util.Map r9 = r0.f55720i
            java.util.Map r9 = (java.util.Map) r9
            tu.a0.throwOnFailure(r11)
            goto L9f
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L42:
            tu.a0.throwOnFailure(r11)
            java.lang.String r11 = "dependencies"
            java.util.Map r2 = fk.d.f55730b
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            int r5 = r2.size()
            int r5 = uu.o1.mapCapacity(r5)
            r11.<init>(r5)
            java.util.Set r2 = r2.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r5 = r11
            r8 = r2
        L65:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb2
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            fk.e r7 = (fk.e) r7
            java.lang.Object r11 = r11.getValue()
            fk.b r11 = (fk.b) r11
            kotlinx.coroutines.sync.Mutex r6 = r11.getMutex()
            r11 = r5
            java.util.Map r11 = (java.util.Map) r11
            r0.f55720i = r11
            r0.f55721j = r8
            r0.f55722k = r7
            r0.f55723l = r6
            r0.f55724m = r11
            r0.f55725n = r2
            r0.f55728q = r3
            java.lang.Object r11 = r6.lock(r4, r0)
            if (r11 != r1) goto L9e
            return r1
        L9e:
            r9 = r5
        L9f:
            fk.d r11 = fk.d.f55729a     // Catch: java.lang.Throwable -> Lad
            fk.g r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch: java.lang.Throwable -> Lad
            r6.unlock(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L65
        Lad:
            r11 = move-exception
            r6.unlock(r4)
            throw r11
        Lb2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.d.getRegisteredSubscribers$com_google_firebase_firebase_sessions(zu.d):java.lang.Object");
    }

    public final g getSubscriber$com_google_firebase_firebase_sessions(e subscriberName) {
        e0.checkNotNullParameter(subscriberName, "subscriberName");
        g subscriber = a(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    public final void reset$com_google_firebase_firebase_sessions() {
        f55730b.clear();
    }
}
