package ji;

import com.applovin.shadow.okio.Segment;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final j f69618a;

    /* renamed from: b, reason: collision with root package name */
    public final ii.g f69619b;

    /* renamed from: c, reason: collision with root package name */
    public String f69620c;

    /* renamed from: d, reason: collision with root package name */
    public final a f69621d = new a(false);

    /* renamed from: e, reason: collision with root package name */
    public final a f69622e = new a(true);

    /* renamed from: f, reason: collision with root package name */
    public final s f69623f = new s(128);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicMarkableReference f69624g = new AtomicMarkableReference(null, false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference f69625a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference f69626b = new AtomicReference(null);

        /* renamed from: c, reason: collision with root package name */
        public final boolean f69627c;

        public a(boolean z10) {
            this.f69627c = z10;
            this.f69625a = new AtomicMarkableReference(new f(64, z10 ? Segment.SIZE : 1024), false);
        }

        public final void a() {
            AtomicReference atomicReference;
            t tVar = new t(this, 0);
            do {
                atomicReference = this.f69626b;
                if (atomicReference.compareAndSet(null, tVar)) {
                    u.this.f69619b.f59615b.submit(tVar);
                    return;
                }
            } while (atomicReference.get() == null);
        }

        public Map<String, String> getKeys() {
            return ((f) this.f69625a.getReference()).getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((f) this.f69625a.getReference()).setKey(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f69625a;
                    atomicMarkableReference.set((f) atomicMarkableReference.getReference(), true);
                    a();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void setKeys(Map<String, String> map) {
            synchronized (this) {
                ((f) this.f69625a.getReference()).setKeys(map);
                AtomicMarkableReference atomicMarkableReference = this.f69625a;
                atomicMarkableReference.set((f) atomicMarkableReference.getReference(), true);
            }
            a();
        }
    }

    public u(String str, ni.d dVar, ii.g gVar) {
        this.f69620c = str;
        this.f69618a = new j(dVar);
        this.f69619b = gVar;
    }

    public static u loadFromExistingSession(String str, ni.d dVar, ii.g gVar) {
        j jVar = new j(dVar);
        u uVar = new u(str, dVar, gVar);
        ((f) uVar.f69621d.f69625a.getReference()).setKeys(jVar.c(str, false));
        ((f) uVar.f69622e.f69625a.getReference()).setKeys(jVar.c(str, true));
        uVar.f69624g.set(jVar.readUserId(str), false);
        uVar.f69623f.updateRolloutAssignmentList(jVar.readRolloutsState(str));
        return uVar;
    }

    public static String readUserId(String str, ni.d dVar) {
        return new j(dVar).readUserId(str);
    }

    public Map<String, String> getCustomKeys(Map<String, String> map) {
        boolean zIsEmpty = map.isEmpty();
        a aVar = this.f69621d;
        if (zIsEmpty) {
            return aVar.getKeys();
        }
        HashMap map2 = new HashMap(aVar.getKeys());
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strSanitizeString = f.sanitizeString(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strSanitizeString)) {
                map2.put(strSanitizeString, f.sanitizeString(entry.getValue(), 1024));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            ei.f.getLogger().w("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> getInternalKeys() {
        return this.f69622e.getKeys();
    }

    public List<f2.e.d.AbstractC0731e> getRolloutsState() {
        return this.f69623f.getReportRolloutsState();
    }

    public String getUserId() {
        return (String) this.f69624g.getReference();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.f69621d.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.f69621d.setKeys(map);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.f69622e.setKey(str, str2);
    }

    public void setNewSession(String str) {
        synchronized (this.f69620c) {
            this.f69620c = str;
            this.f69619b.f59615b.submit(new al.a(26, str, (Object) this, (Object) this.f69621d.getKeys(), (Object) this.f69623f.getRolloutAssignmentList()));
        }
    }

    public void setUserId(String str) {
        String strSanitizeString = f.sanitizeString(str, 1024);
        synchronized (this.f69624g) {
            try {
                if (hi.j.nullSafeEquals(strSanitizeString, (String) this.f69624g.getReference())) {
                    return;
                }
                this.f69624g.set(strSanitizeString, true);
                this.f69619b.f59615b.submit(new com.unity3d.services.banners.view.a(this, 29));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean updateRolloutsState(List<r> list) {
        synchronized (this.f69623f) {
            try {
                if (!this.f69623f.updateRolloutAssignmentList(list)) {
                    return false;
                }
                this.f69619b.f59615b.submit(new im.k(17, this, this.f69623f.getRolloutAssignmentList()));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Map<String, String> getCustomKeys() {
        return this.f69621d.getKeys();
    }
}
