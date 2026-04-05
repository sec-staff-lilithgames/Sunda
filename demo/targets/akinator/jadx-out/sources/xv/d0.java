package xv;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends u0 {

    /* renamed from: e, reason: collision with root package name */
    public static final j0 f93580e;

    /* renamed from: c, reason: collision with root package name */
    public final List f93581c;

    /* renamed from: d, reason: collision with root package name */
    public final List f93582d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Charset f93583a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f93584b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f93585c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a add(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f93584b.add(nw.a.canonicalizeWithCharset$default(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f93583a, 91, null));
            this.f93585c.add(nw.a.canonicalizeWithCharset$default(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, this.f93583a, 91, null));
            return this;
        }

        public final a addEncoded(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this.f93584b.add(nw.a.canonicalizeWithCharset$default(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f93583a, 83, null));
            this.f93585c.add(nw.a.canonicalizeWithCharset$default(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, this.f93583a, 83, null));
            return this;
        }

        public final d0 build() {
            return new d0(this.f93584b, this.f93585c);
        }

        public a(Charset charset) {
            this.f93583a = charset;
            this.f93584b = new ArrayList();
            this.f93585c = new ArrayList();
        }

        public /* synthetic */ a(Charset charset, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new b(null);
        f93580e = j0.f93670e.get("application/x-www-form-urlencoded");
    }

    public d0(List<String> encodedNames, List<String> encodedValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(encodedNames, "encodedNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(encodedValues, "encodedValues");
        this.f93581c = yv.i.toImmutableList(encodedNames);
        this.f93582d = yv.i.toImmutableList(encodedValues);
    }

    @tu.f
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m7882deprecated_size() {
        return size();
    }

    public final long a(pw.j jVar, boolean z10) throws EOFException {
        pw.g buffer;
        if (z10) {
            buffer = new pw.g();
        } else {
            kotlin.jvm.internal.e0.checkNotNull(jVar);
            buffer = jVar.getBuffer();
        }
        List list = this.f93581c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) list.get(i10));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f93582d.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // xv.u0
    public long contentLength() {
        return a(null, true);
    }

    @Override // xv.u0
    public j0 contentType() {
        return f93580e;
    }

    public final String encodedName(int i10) {
        return (String) this.f93581c.get(i10);
    }

    public final String encodedValue(int i10) {
        return (String) this.f93582d.get(i10);
    }

    public final String name(int i10) {
        return nw.a.percentDecode$default(encodedName(i10), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.f93581c.size();
    }

    public final String value(int i10) {
        return nw.a.percentDecode$default(encodedValue(i10), 0, 0, true, 3, null);
    }

    @Override // xv.u0
    public void writeTo(pw.j sink) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
