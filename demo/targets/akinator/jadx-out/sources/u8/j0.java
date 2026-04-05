package u8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f88088a;

    public j0() {
        this(250L);
    }

    public void clear() {
        this.f88088a.clearMemory();
    }

    public Object get(Object obj, int i10, int i11) {
        i0 i0VarA = i0.a(i10, i11, obj);
        Object obj2 = this.f88088a.get(i0VarA);
        i0VarA.release();
        return obj2;
    }

    public void put(Object obj, int i10, int i11, Object obj2) {
        this.f88088a.put(i0.a(i10, i11, obj), obj2);
    }

    public j0(long j10) {
        this.f88088a = new h0(j10);
    }
}
