package sv;

import cv.BLca.YsiBvdpw;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final b f86155d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final l f86156e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f86157f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f86158a;

    /* renamed from: b, reason: collision with root package name */
    public final a f86159b;

    /* renamed from: c, reason: collision with root package name */
    public final c f86160c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: j, reason: collision with root package name */
        public static final C0782a f86161j = new C0782a(null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f86162k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* renamed from: a, reason: collision with root package name */
        public final int f86163a;

        /* renamed from: b, reason: collision with root package name */
        public final int f86164b;

        /* renamed from: c, reason: collision with root package name */
        public final String f86165c;

        /* renamed from: d, reason: collision with root package name */
        public final String f86166d;

        /* renamed from: e, reason: collision with root package name */
        public final String f86167e;

        /* renamed from: f, reason: collision with root package name */
        public final String f86168f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f86169g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f86170h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f86171i;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: sv.l$a$a, reason: collision with other inner class name */
        public static final class C0782a {
            public C0782a(kotlin.jvm.internal.u uVar) {
            }

            public final a getDefault$kotlin_stdlib() {
                return a.f86162k;
            }
        }

        public a(int i10, int i11, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            kotlin.jvm.internal.e0.checkNotNullParameter(groupSeparator, "groupSeparator");
            kotlin.jvm.internal.e0.checkNotNullParameter(byteSeparator, "byteSeparator");
            kotlin.jvm.internal.e0.checkNotNullParameter(bytePrefix, "bytePrefix");
            kotlin.jvm.internal.e0.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.f86163a = i10;
            this.f86164b = i11;
            this.f86165c = groupSeparator;
            this.f86166d = byteSeparator;
            this.f86167e = bytePrefix;
            this.f86168f = byteSuffix;
            this.f86169g = i10 == Integer.MAX_VALUE && i11 == Integer.MAX_VALUE;
            this.f86170h = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f86171i = m.access$isCaseSensitive(groupSeparator) || m.access$isCaseSensitive(byteSeparator) || m.access$isCaseSensitive(bytePrefix) || m.access$isCaseSensitive(byteSuffix);
        }

        public final StringBuilder appendOptionsTo$kotlin_stdlib(StringBuilder sb2, String indent) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sb2, "sb");
            kotlin.jvm.internal.e0.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f86163a);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f86164b);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f86165c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f86166d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f86167e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f86168f);
            sb2.append("\"");
            return sb2;
        }

        public final String getBytePrefix() {
            return this.f86167e;
        }

        public final String getByteSeparator() {
            return this.f86166d;
        }

        public final String getByteSuffix() {
            return this.f86168f;
        }

        public final int getBytesPerGroup() {
            return this.f86164b;
        }

        public final int getBytesPerLine() {
            return this.f86163a;
        }

        public final String getGroupSeparator() {
            return this.f86165c;
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
            return this.f86171i;
        }

        public final boolean getNoLineAndGroupSeparator$kotlin_stdlib() {
            return this.f86169g;
        }

        public final boolean getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() {
            return this.f86170h;
        }

        public String toString() {
            StringBuilder sbU = o2.u("BytesHexFormat(\n");
            appendOptionsTo$kotlin_stdlib(sbU, "    ").append('\n');
            sbU.append(")");
            return sbU.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final l getDefault() {
            return l.f86156e;
        }

        public final l getUpperCase() {
            return l.f86157f;
        }
    }

    static {
        a.C0782a c0782a = a.f86161j;
        a default$kotlin_stdlib = c0782a.getDefault$kotlin_stdlib();
        c.a aVar = c.f86172h;
        f86156e = new l(false, default$kotlin_stdlib, aVar.getDefault$kotlin_stdlib());
        f86157f = new l(true, c0782a.getDefault$kotlin_stdlib(), aVar.getDefault$kotlin_stdlib());
    }

    public l(boolean z10, a bytes, c number) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        kotlin.jvm.internal.e0.checkNotNullParameter(number, "number");
        this.f86158a = z10;
        this.f86159b = bytes;
        this.f86160c = number;
    }

    public final a getBytes() {
        return this.f86159b;
    }

    public final c getNumber() {
        return this.f86160c;
    }

    public final boolean getUpperCase() {
        return this.f86158a;
    }

    public String toString() {
        StringBuilder sbU = o2.u("HexFormat(\n    upperCase = ");
        sbU.append(this.f86158a);
        sbU.append(YsiBvdpw.fsPxJOeGtCq);
        this.f86159b.appendOptionsTo$kotlin_stdlib(sbU, "        ").append('\n');
        sbU.append("    ),");
        sbU.append('\n');
        sbU.append("    number = NumberHexFormat(");
        sbU.append('\n');
        this.f86160c.appendOptionsTo$kotlin_stdlib(sbU, "        ").append('\n');
        sbU.append("    )");
        sbU.append('\n');
        sbU.append(")");
        return sbU.toString();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: h, reason: collision with root package name */
        public static final a f86172h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final c f86173i = new c("", "", false, 1);

        /* renamed from: a, reason: collision with root package name */
        public final String f86174a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86175b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f86176c;

        /* renamed from: d, reason: collision with root package name */
        public final int f86177d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f86178e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f86179f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f86180g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(kotlin.jvm.internal.u uVar) {
            }

            public final c getDefault$kotlin_stdlib() {
                return c.f86173i;
            }
        }

        public c(String prefix, String suffix, boolean z10, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
            kotlin.jvm.internal.e0.checkNotNullParameter(suffix, "suffix");
            this.f86174a = prefix;
            this.f86175b = suffix;
            this.f86176c = z10;
            this.f86177d = i10;
            boolean z11 = prefix.length() == 0 && suffix.length() == 0;
            this.f86178e = z11;
            this.f86179f = z11 && i10 == 1;
            this.f86180g = m.access$isCaseSensitive(prefix) || m.access$isCaseSensitive(suffix);
        }

        public final StringBuilder appendOptionsTo$kotlin_stdlib(StringBuilder sb2, String indent) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sb2, "sb");
            kotlin.jvm.internal.e0.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.f86174a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.f86175b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f86176c);
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.f86177d);
            return sb2;
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
            return this.f86180g;
        }

        public final int getMinLength() {
            return this.f86177d;
        }

        public final String getPrefix() {
            return this.f86174a;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.f86176c;
        }

        public final String getSuffix() {
            return this.f86175b;
        }

        public final boolean isDigitsOnly$kotlin_stdlib() {
            return this.f86178e;
        }

        public final boolean isDigitsOnlyAndNoPadding$kotlin_stdlib() {
            return this.f86179f;
        }

        public String toString() {
            StringBuilder sbU = o2.u("NumberHexFormat(\n");
            appendOptionsTo$kotlin_stdlib(sbU, "    ").append('\n');
            sbU.append(")");
            return sbU.toString();
        }

        public static /* synthetic */ void getMinLength$annotations() {
        }
    }
}
