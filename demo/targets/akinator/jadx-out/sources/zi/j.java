package zi;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o4.j;
import o4.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j.a f97995b = n.longKey("fire-global");

    /* renamed from: c, reason: collision with root package name */
    public static final j.a f97996c = n.longKey("fire-count");

    /* renamed from: d, reason: collision with root package name */
    public static final j.a f97997d = n.stringKey("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    public final ri.i f97998a;

    public j(Context context, String str) {
        this.f97998a = new ri.i(context, a.b.k("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            for (Map.Entry<j.a, Object> entry : this.f97998a.getAllSync().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(k.create(entry.getKey().getName(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f97998a.editSync(new com.moloco.sdk.acm.http.g(jCurrentTimeMillis, 5));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String b(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j10)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public final synchronized j.a c(o4.d dVar, String str) {
        for (Map.Entry<j.a, Object> entry : dVar.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return n.stringSetKey(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(o4.d dVar, String str) {
        try {
            j.a aVarC = c(dVar, str);
            if (aVarC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) ri.j.getOrDefault(dVar, aVarC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                dVar.remove(aVarC);
            } else {
                dVar.set(aVarC, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean e(j.a aVar, long j10) {
        long jLongValue;
        jLongValue = ((Long) this.f97998a.getSync(aVar, -1L)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j10))) {
            return false;
        }
        this.f97998a.putSync(aVar, Long.valueOf(j10));
        return true;
    }
}
