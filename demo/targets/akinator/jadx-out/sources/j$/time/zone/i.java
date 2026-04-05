package j$.time.zone;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArrayList f68729b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentMap f68730c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f68731a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f68729b = copyOnWriteArrayList;
        f68730c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static f a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f68730c;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new g("No time-zone data files registered");
            }
            throw new g("Unknown time-zone ID: ".concat(str));
        }
        if (iVar.f68731a.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new g("Not a built-in time zone: ".concat(str));
    }

    public static void b(i iVar) {
        Objects.requireNonNull(iVar, IronSourceConstants.EVENTS_PROVIDER);
        synchronized (i.class) {
            try {
                for (String str : iVar.f68731a) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((i) ((ConcurrentHashMap) f68730c).putIfAbsent(str, iVar)) != null) {
                        throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
                    }
                }
                Collections.unmodifiableSet(new HashSet(((ConcurrentHashMap) f68730c).keySet()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f68729b.add(iVar);
    }

    public i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f68731a = Collections.unmodifiableSet(linkedHashSet);
    }
}
