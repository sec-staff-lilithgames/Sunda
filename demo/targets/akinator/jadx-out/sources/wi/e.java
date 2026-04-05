package wi;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import ui.h;
import ui.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements vi.b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f90631e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f90632f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f90633g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f90634h = new d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f90635a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f90636b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public ui.f f90637c = f90631e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f90638d = false;

    /* JADX WARN: Type inference failed for: r0v1, types: [wi.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [wi.b] */
    static {
        final int i10 = 0;
        f90631e = new a(i10);
        f90632f = new h() { // from class: wi.b
            @Override // ui.h, ui.b
            public final void encode(Object obj, Object obj2) throws IOException {
                switch (i10) {
                    case 0:
                        a aVar = e.f90631e;
                        ((i) obj2).add((String) obj);
                        break;
                    default:
                        a aVar2 = e.f90631e;
                        ((i) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f90633g = new h() { // from class: wi.b
            @Override // ui.h, ui.b
            public final void encode(Object obj, Object obj2) throws IOException {
                switch (i11) {
                    case 0:
                        a aVar = e.f90631e;
                        ((i) obj2).add((String) obj);
                        break;
                    default:
                        a aVar2 = e.f90631e;
                        ((i) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public e() {
        registerEncoder(String.class, (h) f90632f);
        registerEncoder(Boolean.class, (h) f90633g);
        registerEncoder(Date.class, (h) f90634h);
    }

    public ui.a build() {
        return new c(this);
    }

    public e configureWith(vi.a aVar) {
        aVar.configure(this);
        return this;
    }

    public e ignoreNullValues(boolean z10) {
        this.f90638d = z10;
        return this;
    }

    public e registerFallbackEncoder(ui.f fVar) {
        this.f90637c = fVar;
        return this;
    }

    @Override // vi.b
    public <T> e registerEncoder(Class<T> cls, ui.f fVar) {
        this.f90635a.put(cls, fVar);
        this.f90636b.remove(cls);
        return this;
    }

    @Override // vi.b
    public <T> e registerEncoder(Class<T> cls, h hVar) {
        this.f90636b.put(cls, hVar);
        this.f90635a.remove(cls);
        return this;
    }
}
