package v6;

import java.util.List;
import java.util.Set;
import kotlin.reflect.KClass;
import o5.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 implements p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f89154c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final y0 f89155a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f89156b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return uu.p0.emptyList();
        }
    }

    public r0(y0 __db) {
        kotlin.jvm.internal.e0.checkNotNullParameter(__db, "__db");
        this.f89155a = __db;
        this.f89156b = new q0();
    }

    @Override // v6.p0
    public void deleteByWorkSpecId(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        u5.c.performBlocking(this.f89155a, false, true, new i0(id2, 6));
    }

    @Override // v6.p0
    public List<String> getTagsForWorkSpecId(String id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return (List) u5.c.performBlocking(this.f89155a, true, false, new i0(id2, 7));
    }

    @Override // v6.p0
    public List<String> getWorkSpecIdsWithTag(String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        return (List) u5.c.performBlocking(this.f89155a, true, false, new i0(tag, 8));
    }

    @Override // v6.p0
    public void insert(o0 workTag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workTag, "workTag");
        u5.c.performBlocking(this.f89155a, false, true, new zi.i(1, this, workTag));
    }

    @Override // v6.p0
    public /* bridge */ /* synthetic */ void insertTags(String str, Set set) {
        super.insertTags(str, set);
    }
}
