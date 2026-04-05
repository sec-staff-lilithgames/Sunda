package fw;

import com.applovin.shadow.okhttp3.internal.http2.Header;
import pw.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final pw.l f56137d;

    /* renamed from: e, reason: collision with root package name */
    public static final pw.l f56138e;

    /* renamed from: f, reason: collision with root package name */
    public static final pw.l f56139f;

    /* renamed from: g, reason: collision with root package name */
    public static final pw.l f56140g;

    /* renamed from: h, reason: collision with root package name */
    public static final pw.l f56141h;

    /* renamed from: i, reason: collision with root package name */
    public static final pw.l f56142i;

    /* renamed from: a, reason: collision with root package name */
    public final pw.l f56143a;

    /* renamed from: b, reason: collision with root package name */
    public final pw.l f56144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56145c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        l.a aVar = pw.l.f81911f;
        f56137d = aVar.encodeUtf8(":");
        f56138e = aVar.encodeUtf8(Header.RESPONSE_STATUS_UTF8);
        f56139f = aVar.encodeUtf8(Header.TARGET_METHOD_UTF8);
        f56140g = aVar.encodeUtf8(Header.TARGET_PATH_UTF8);
        f56141h = aVar.encodeUtf8(Header.TARGET_SCHEME_UTF8);
        f56142i = aVar.encodeUtf8(Header.TARGET_AUTHORITY_UTF8);
    }

    public f(pw.l name, pw.l value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f56143a = name;
        this.f56144b = value;
        this.f56145c = value.size() + name.size() + 32;
    }

    public static /* synthetic */ f copy$default(f fVar, pw.l lVar, pw.l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = fVar.f56143a;
        }
        if ((i10 & 2) != 0) {
            lVar2 = fVar.f56144b;
        }
        return fVar.copy(lVar, lVar2);
    }

    public final pw.l component1() {
        return this.f56143a;
    }

    public final pw.l component2() {
        return this.f56144b;
    }

    public final f copy(pw.l name, pw.l value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        return new f(name, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56143a, fVar.f56143a) && kotlin.jvm.internal.e0.areEqual(this.f56144b, fVar.f56144b);
    }

    public int hashCode() {
        return this.f56144b.hashCode() + (this.f56143a.hashCode() * 31);
    }

    public String toString() {
        return this.f56143a.utf8() + ": " + this.f56144b.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(String name, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        l.a aVar = pw.l.f81911f;
        this(aVar.encodeUtf8(name), aVar.encodeUtf8(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(pw.l name, String value) {
        this(name, pw.l.f81911f.encodeUtf8(value));
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
    }
}
