package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z2 implements zu.k {

    /* renamed from: e, reason: collision with root package name */
    public static final String f70582e;

    /* renamed from: b, reason: collision with root package name */
    public final z2 f70583b;

    /* renamed from: c, reason: collision with root package name */
    public final p f70584c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release() {
            return z2.f70582e;
        }
    }

    static {
        new a(null);
        f70582e = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    }

    public z2(z2 z2Var, p instance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instance, "instance");
        this.f70583b = z2Var;
        this.f70584c = instance;
    }

    public final void checkNotUpdating(n candidate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(candidate, "candidate");
        if (this.f70584c == candidate) {
            throw new IllegalStateException(f70582e.toString());
        }
        z2 z2Var = this.f70583b;
        if (z2Var != null) {
            z2Var.checkNotUpdating(candidate);
        }
    }

    @Override // zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) zu.j.fold(this, r10, pVar);
    }

    @Override // zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) zu.j.get(this, lVar);
    }

    @Override // zu.k
    public zu.l getKey() {
        return y2.f70566b;
    }

    @Override // zu.k, zu.m
    public zu.m minusKey(zu.l lVar) {
        return zu.j.minusKey(this, lVar);
    }

    @Override // zu.k, zu.m
    public zu.m plus(zu.m mVar) {
        return zu.j.plus(this, mVar);
    }
}
