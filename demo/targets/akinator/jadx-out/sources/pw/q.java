package pw;

import java.util.ArrayList;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81955a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81956b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f81957c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f81958d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f81959e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f81960f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f81961g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f81962h;

    public q() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ q copy$default(q qVar, boolean z10, boolean z11, n0 n0Var, Long l9, Long l10, Long l11, Long l12, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = qVar.f81955a;
        }
        if ((i10 & 2) != 0) {
            z11 = qVar.f81956b;
        }
        if ((i10 & 4) != 0) {
            n0Var = qVar.f81957c;
        }
        if ((i10 & 8) != 0) {
            l9 = qVar.f81958d;
        }
        if ((i10 & 16) != 0) {
            l10 = qVar.f81959e;
        }
        if ((i10 & 32) != 0) {
            l11 = qVar.f81960f;
        }
        if ((i10 & 64) != 0) {
            l12 = qVar.f81961g;
        }
        if ((i10 & 128) != 0) {
            map = qVar.f81962h;
        }
        Long l13 = l12;
        Map map2 = map;
        Long l14 = l10;
        Long l15 = l11;
        return qVar.copy(z10, z11, n0Var, l9, l14, l15, l13, map2);
    }

    public final q copy(boolean z10, boolean z11, n0 n0Var, Long l9, Long l10, Long l11, Long l12, Map<KClass<?>, ? extends Object> extras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        return new q(z10, z11, n0Var, l9, l10, l11, l12, extras);
    }

    public final <T> T extra(KClass<? extends T> type) {
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        Object obj = this.f81962h.get(type);
        if (obj == null) {
            return null;
        }
        return (T) KClasses.cast(type, obj);
    }

    public final Long getCreatedAtMillis() {
        return this.f81959e;
    }

    public final Map<KClass<?>, Object> getExtras() {
        return this.f81962h;
    }

    public final Long getLastAccessedAtMillis() {
        return this.f81961g;
    }

    public final Long getLastModifiedAtMillis() {
        return this.f81960f;
    }

    public final Long getSize() {
        return this.f81958d;
    }

    public final n0 getSymlinkTarget() {
        return this.f81957c;
    }

    public final boolean isDirectory() {
        return this.f81956b;
    }

    public final boolean isRegularFile() {
        return this.f81955a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f81955a) {
            arrayList.add("isRegularFile");
        }
        if (this.f81956b) {
            arrayList.add("isDirectory");
        }
        Long l9 = this.f81958d;
        if (l9 != null) {
            arrayList.add("byteCount=" + l9);
        }
        Long l10 = this.f81959e;
        if (l10 != null) {
            arrayList.add("createdAt=" + l10);
        }
        Long l11 = this.f81960f;
        if (l11 != null) {
            arrayList.add("lastModifiedAt=" + l11);
        }
        Long l12 = this.f81961g;
        if (l12 != null) {
            arrayList.add("lastAccessedAt=" + l12);
        }
        Map map = this.f81962h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return uu.y0.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public q(boolean z10, boolean z11, n0 n0Var, Long l9, Long l10, Long l11, Long l12, Map<KClass<?>, ? extends Object> extras) {
        kotlin.jvm.internal.e0.checkNotNullParameter(extras, "extras");
        this.f81955a = z10;
        this.f81956b = z11;
        this.f81957c = n0Var;
        this.f81958d = l9;
        this.f81959e = l10;
        this.f81960f = l11;
        this.f81961g = l12;
        this.f81962h = p1.toMap(extras);
    }

    public /* synthetic */ q(boolean z10, boolean z11, n0 n0Var, Long l9, Long l10, Long l11, Long l12, Map map, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : n0Var, (i10 & 8) != 0 ? null : l9, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? null : l11, (i10 & 64) != 0 ? null : l12, (i10 & 128) != 0 ? p1.emptyMap() : map);
    }
}
