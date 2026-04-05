package e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f53695a;

    /* renamed from: b, reason: collision with root package name */
    public d3.g f53696b;

    /* renamed from: c, reason: collision with root package name */
    public o f53697c;

    /* renamed from: d, reason: collision with root package name */
    public d3.f f53698d;

    /* renamed from: e, reason: collision with root package name */
    public final i f53699e = new i(this);

    /* renamed from: f, reason: collision with root package name */
    public int f53700f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53701g = false;

    /* renamed from: h, reason: collision with root package name */
    public final h f53702h = new h(this);

    /* renamed from: i, reason: collision with root package name */
    public final h f53703i = new h(this);

    /* renamed from: j, reason: collision with root package name */
    public int f53704j = 1;

    public s(d3.g gVar) {
        this.f53696b = gVar;
    }

    public static void a(h hVar, h hVar2, int i10) {
        hVar.f53673l.add(hVar2);
        hVar.f53667f = i10;
        hVar2.f53672k.add(hVar);
    }

    public static h f(d3.e eVar) {
        d3.e eVar2 = eVar.f51762f;
        if (eVar2 == null) {
            return null;
        }
        d3.g gVar = eVar2.f51760d;
        int iOrdinal = eVar2.f51761e.ordinal();
        if (iOrdinal == 1) {
            return gVar.f51777d.f53702h;
        }
        if (iOrdinal == 2) {
            return gVar.f51779e.f53702h;
        }
        if (iOrdinal == 3) {
            return gVar.f51777d.f53703i;
        }
        if (iOrdinal == 4) {
            return gVar.f51779e.f53703i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return gVar.f51779e.f53679k;
    }

    public static h g(d3.e eVar, int i10) {
        d3.e eVar2 = eVar.f51762f;
        if (eVar2 == null) {
            return null;
        }
        d3.g gVar = eVar2.f51760d;
        s sVar = i10 == 0 ? gVar.f51777d : gVar.f51779e;
        int iOrdinal = eVar2.f51761e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return sVar.f53702h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return sVar.f53703i;
        }
        return null;
    }

    public abstract void applyToWidget();

    public final void b(h hVar, h hVar2, int i10, i iVar) {
        hVar.f53673l.add(hVar2);
        hVar.f53673l.add(this.f53699e);
        hVar.f53669h = i10;
        hVar.f53670i = iVar;
        hVar2.f53672k.add(hVar);
        iVar.f53672k.add(hVar);
    }

    public abstract void c();

    public abstract void d();

    public final int e(int i10, int i11) {
        if (i11 == 0) {
            d3.g gVar = this.f53696b;
            int i12 = gVar.f51817x;
            int iMax = Math.max(gVar.f51815w, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            d3.g gVar2 = this.f53696b;
            int i13 = gVar2.A;
            int iMax2 = Math.max(gVar2.f51821z, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public long getWrapDimension() {
        if (this.f53699e.f53671j) {
            return r0.f53668g;
        }
        return 0L;
    }

    public abstract boolean h();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(d3.e r13, d3.e r14, int r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.s.i(d3.e, d3.e, int):void");
    }

    public boolean isCenterConnection() {
        h hVar = this.f53702h;
        int size = hVar.f53673l.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((h) hVar.f53673l.get(i11)).f53665d != this) {
                i10++;
            }
        }
        h hVar2 = this.f53703i;
        int size2 = hVar2.f53673l.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (((h) hVar2.f53673l.get(i12)).f53665d != this) {
                i10++;
            }
        }
        return i10 >= 2;
    }

    public boolean isDimensionResolved() {
        return this.f53699e.f53671j;
    }

    public boolean isResolved() {
        return this.f53701g;
    }

    public long wrapSize(int i10) {
        i iVar = this.f53699e;
        if (!iVar.f53671j) {
            return 0L;
        }
        long j10 = iVar.f53668g;
        boolean zIsCenterConnection = isCenterConnection();
        h hVar = this.f53703i;
        h hVar2 = this.f53702h;
        return zIsCenterConnection ? j10 + (hVar2.f53667f - hVar.f53667f) : i10 == 0 ? j10 + hVar2.f53667f : j10 - hVar.f53667f;
    }

    @Override // e3.e
    public void update(e eVar) {
    }
}
