package l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: g, reason: collision with root package name */
    public static final v f72178g;

    /* renamed from: a, reason: collision with root package name */
    public final kv.l f72179a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f72180b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.l f72181c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.l f72182d;

    /* renamed from: e, reason: collision with root package name */
    public final kv.l f72183e;

    /* renamed from: f, reason: collision with root package name */
    public final kv.l f72184f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final v getDefault() {
            return v.f72178g;
        }
    }

    static {
        new a(null);
        f72178g = new v(null, null, null, null, null, null, 63, null);
    }

    public v() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final kv.l getOnDone() {
        return this.f72179a;
    }

    public final kv.l getOnGo() {
        return this.f72180b;
    }

    public final kv.l getOnNext() {
        return this.f72181c;
    }

    public final kv.l getOnPrevious() {
        return this.f72182d;
    }

    public final kv.l getOnSearch() {
        return this.f72183e;
    }

    public final kv.l getOnSend() {
        return this.f72184f;
    }

    public v(kv.l lVar, kv.l lVar2, kv.l lVar3, kv.l lVar4, kv.l lVar5, kv.l lVar6) {
        this.f72179a = lVar;
        this.f72180b = lVar2;
        this.f72181c = lVar3;
        this.f72182d = lVar4;
        this.f72183e = lVar5;
        this.f72184f = lVar6;
    }

    public /* synthetic */ v(kv.l lVar, kv.l lVar2, kv.l lVar3, kv.l lVar4, kv.l lVar5, kv.l lVar6, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? null : lVar2, (i10 & 4) != 0 ? null : lVar3, (i10 & 8) != 0 ? null : lVar4, (i10 & 16) != 0 ? null : lVar5, (i10 & 32) != 0 ? null : lVar6);
    }
}
