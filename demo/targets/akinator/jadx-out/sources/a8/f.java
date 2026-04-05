package a8;

import java.util.List;
import java.util.Locale;
import p0.o2;
import y7.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f4190a;

    /* renamed from: b, reason: collision with root package name */
    public final r7.h f4191b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4192c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4193d;

    /* renamed from: e, reason: collision with root package name */
    public final d f4194e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4195f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4196g;

    /* renamed from: h, reason: collision with root package name */
    public final List f4197h;

    /* renamed from: i, reason: collision with root package name */
    public final n f4198i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4199j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4200k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4201l;

    /* renamed from: m, reason: collision with root package name */
    public final float f4202m;

    /* renamed from: n, reason: collision with root package name */
    public final float f4203n;

    /* renamed from: o, reason: collision with root package name */
    public final float f4204o;

    /* renamed from: p, reason: collision with root package name */
    public final float f4205p;

    /* renamed from: q, reason: collision with root package name */
    public final y7.j f4206q;

    /* renamed from: r, reason: collision with root package name */
    public final y7.k f4207r;

    /* renamed from: s, reason: collision with root package name */
    public final y7.b f4208s;

    /* renamed from: t, reason: collision with root package name */
    public final List f4209t;

    /* renamed from: u, reason: collision with root package name */
    public final e f4210u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4211v;

    /* renamed from: w, reason: collision with root package name */
    public final z7.a f4212w;

    /* renamed from: x, reason: collision with root package name */
    public final c8.j f4213x;

    /* renamed from: y, reason: collision with root package name */
    public final z7.h f4214y;

    public f(List<z7.c> list, r7.h hVar, String str, long j10, d dVar, long j11, String str2, List<z7.j> list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, y7.j jVar, y7.k kVar, List<f8.a> list3, e eVar, y7.b bVar, boolean z10, z7.a aVar, c8.j jVar2, z7.h hVar2) {
        this.f4190a = list;
        this.f4191b = hVar;
        this.f4192c = str;
        this.f4193d = j10;
        this.f4194e = dVar;
        this.f4195f = j11;
        this.f4196g = str2;
        this.f4197h = list2;
        this.f4198i = nVar;
        this.f4199j = i10;
        this.f4200k = i11;
        this.f4201l = i12;
        this.f4202m = f10;
        this.f4203n = f11;
        this.f4204o = f12;
        this.f4205p = f13;
        this.f4206q = jVar;
        this.f4207r = kVar;
        this.f4209t = list3;
        this.f4210u = eVar;
        this.f4208s = bVar;
        this.f4211v = z10;
        this.f4212w = aVar;
        this.f4213x = jVar2;
        this.f4214y = hVar2;
    }

    public z7.h getBlendMode() {
        return this.f4214y;
    }

    public z7.a getBlurEffect() {
        return this.f4212w;
    }

    public c8.j getDropShadowEffect() {
        return this.f4213x;
    }

    public long getId() {
        return this.f4193d;
    }

    public d getLayerType() {
        return this.f4194e;
    }

    public String getName() {
        return this.f4192c;
    }

    public String getRefId() {
        return this.f4196g;
    }

    public boolean isHidden() {
        return this.f4211v;
    }

    public String toString(String str) {
        int i10;
        StringBuilder sbU = o2.u(str);
        sbU.append(getName());
        sbU.append("\n");
        long j10 = this.f4195f;
        r7.h hVar = this.f4191b;
        f fVarLayerModelForId = hVar.layerModelForId(j10);
        if (fVarLayerModelForId != null) {
            sbU.append("\t\tParents: ");
            sbU.append(fVarLayerModelForId.getName());
            for (f fVarLayerModelForId2 = hVar.layerModelForId(fVarLayerModelForId.f4195f); fVarLayerModelForId2 != null; fVarLayerModelForId2 = hVar.layerModelForId(fVarLayerModelForId2.f4195f)) {
                sbU.append("->");
                sbU.append(fVarLayerModelForId2.getName());
            }
            sbU.append(str);
            sbU.append("\n");
        }
        List list = this.f4197h;
        if (!list.isEmpty()) {
            sbU.append(str);
            sbU.append("\tMasks: ");
            sbU.append(list.size());
            sbU.append("\n");
        }
        int i11 = this.f4199j;
        if (i11 != 0 && (i10 = this.f4200k) != 0) {
            sbU.append(str);
            sbU.append("\tBackground: ");
            sbU.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f4201l)));
        }
        List list2 = this.f4190a;
        if (!list2.isEmpty()) {
            sbU.append(str);
            sbU.append("\tShapes:\n");
            for (Object obj : list2) {
                sbU.append(str);
                sbU.append("\t\t");
                sbU.append(obj);
                sbU.append("\n");
            }
        }
        return sbU.toString();
    }

    public String toString() {
        return toString("");
    }
}
