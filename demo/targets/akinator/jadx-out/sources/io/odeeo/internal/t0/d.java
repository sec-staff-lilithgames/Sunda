package io.odeeo.internal.t0;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d implements io.odeeo.internal.t0.v<Character> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends x {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f66369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, String str) {
            super(dVar);
            this.f66369b = str;
        }

        @Override // io.odeeo.internal.t0.d.w, io.odeeo.internal.t0.d
        public String toString() {
            return this.f66369b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a0 extends d {

        /* renamed from: a, reason: collision with root package name */
        public final String f66371a;

        /* renamed from: b, reason: collision with root package name */
        public final char[] f66372b;

        /* renamed from: c, reason: collision with root package name */
        public final char[] f66373c;

        public a0(String str, char[] cArr, char[] cArr2) {
            this.f66371a = str;
            this.f66372b = cArr;
            this.f66373c = cArr2;
            io.odeeo.internal.t0.u.checkArgument(cArr.length == cArr2.length);
            int i10 = 0;
            while (i10 < cArr.length) {
                io.odeeo.internal.t0.u.checkArgument(cArr[i10] <= cArr2[i10]);
                int i11 = i10 + 1;
                if (i11 < cArr.length) {
                    io.odeeo.internal.t0.u.checkArgument(cArr2[i10] < cArr[i11]);
                }
                i10 = i11;
            }
        }

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            int iBinarySearch = Arrays.binarySearch(this.f66372b, c10);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i10 = (~iBinarySearch) - 1;
            return i10 >= 0 && c10 <= this.f66373c[i10];
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return this.f66371a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final d f66374a;

        /* renamed from: b, reason: collision with root package name */
        public final d f66375b;

        public b(d dVar, d dVar2) {
            this.f66374a = (d) io.odeeo.internal.t0.u.checkNotNull(dVar);
            this.f66375b = (d) io.odeeo.internal.t0.u.checkNotNull(dVar2);
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f66374a.a(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f66375b.a(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return this.f66374a.matches(c10) && this.f66375b.matches(c10);
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.and(" + this.f66374a + ", " + this.f66375b + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b0 extends a0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b0 f66376d = new b0();

        public b0() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends v {

        /* renamed from: b, reason: collision with root package name */
        public static final c f66377b = new c();

        public c() {
            super("CharMatcher.any()");
        }

        @Override // io.odeeo.internal.t0.d
        public d and(d dVar) {
            return (d) io.odeeo.internal.t0.u.checkNotNull(dVar);
        }

        @Override // io.odeeo.internal.t0.d
        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.length() == 0 ? "" : String.valueOf(c10);
        }

        @Override // io.odeeo.internal.t0.d
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // io.odeeo.internal.t0.d
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // io.odeeo.internal.t0.d
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return true;
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matchesAllOf(CharSequence charSequence) {
            io.odeeo.internal.t0.u.checkNotNull(charSequence);
            return true;
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // io.odeeo.internal.t0.d.i, io.odeeo.internal.t0.d
        public d negate() {
            return d.none();
        }

        @Override // io.odeeo.internal.t0.d
        public d or(d dVar) {
            io.odeeo.internal.t0.u.checkNotNull(dVar);
            return this;
        }

        @Override // io.odeeo.internal.t0.d
        public String replaceFrom(CharSequence charSequence, char c10) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c10);
            return new String(cArr);
        }

        @Override // io.odeeo.internal.t0.d
        public String trimFrom(CharSequence charSequence) {
            io.odeeo.internal.t0.u.checkNotNull(charSequence);
            return "";
        }

        @Override // io.odeeo.internal.t0.d
        public int indexIn(CharSequence charSequence, int i10) {
            int length = charSequence.length();
            io.odeeo.internal.t0.u.checkPositionIndex(i10, length);
            if (i10 == length) {
                return -1;
            }
            return i10;
        }

        @Override // io.odeeo.internal.t0.d
        public String removeFrom(CharSequence charSequence) {
            io.odeeo.internal.t0.u.checkNotNull(charSequence);
            return QpyI.vTqhiNLAhEnm;
        }

        @Override // io.odeeo.internal.t0.d
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence2.length() * charSequence.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c0 extends v {

        /* renamed from: b, reason: collision with root package name */
        public static final int f66378b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c, reason: collision with root package name */
        public static final c0 f66379c = new c0();

        public c0() {
            super("CharMatcher.whitespace()");
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            for (int i10 = 0; i10 < 32; i10++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i10));
            }
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f66378b) == c10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.t0.d$d, reason: collision with other inner class name */
    public static final class C0649d extends d {

        /* renamed from: a, reason: collision with root package name */
        public final char[] f66380a;

        public C0649d(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f66380a = charArray;
            Arrays.sort(charArray);
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            for (char c10 : this.f66380a) {
                bitSet.set(c10);
            }
        }

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return Arrays.binarySearch(this.f66380a, c10) >= 0;
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c10 : this.f66380a) {
                sb2.append(d.b(c10));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends v {

        /* renamed from: b, reason: collision with root package name */
        public static final e f66381b = new e();

        public e() {
            super("CharMatcher.ascii()");
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return c10 <= 127;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends v {

        /* renamed from: b, reason: collision with root package name */
        public final BitSet f66382b;

        public /* synthetic */ f(BitSet bitSet, String str, a aVar) {
            this(bitSet, str);
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            bitSet.or(this.f66382b);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return this.f66382b.get(c10);
        }

        public f(BitSet bitSet, String str) {
            super(str);
            this.f66382b = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f66383a = new g();

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            if (c10 != ' ' && c10 != 133 && c10 != 5760) {
                if (c10 != 8199) {
                    if (c10 != 8287 && c10 != 12288 && c10 != 8232 && c10 != 8233) {
                        switch (c10) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c10 >= 8192 && c10 <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends a0 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f66384d = new h();

        public h() {
            super("CharMatcher.digit()", c(), b());
        }

        public static char[] b() {
            char[] cArr = new char[37];
            for (int i10 = 0; i10 < 37; i10++) {
                cArr[i10] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i10) + '\t');
            }
            return cArr;
        }

        public static char[] c() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j extends d {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.t0.v<? super Character> f66385a;

        public j(io.odeeo.internal.t0.v<? super Character> vVar) {
            this.f66385a = (io.odeeo.internal.t0.v) io.odeeo.internal.t0.u.checkNotNull(vVar);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return this.f66385a.apply(Character.valueOf(c10));
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f66385a + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        public boolean apply(Character ch2) {
            return this.f66385a.apply(io.odeeo.internal.t0.u.checkNotNull(ch2));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k extends i {

        /* renamed from: a, reason: collision with root package name */
        public final char f66386a;

        /* renamed from: b, reason: collision with root package name */
        public final char f66387b;

        public k(char c10, char c11) {
            io.odeeo.internal.t0.u.checkArgument(c11 >= c10);
            this.f66386a = c10;
            this.f66387b = c11;
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            bitSet.set(this.f66386a, this.f66387b + 1);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return this.f66386a <= c10 && c10 <= this.f66387b;
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.inRange('" + d.b(this.f66386a) + "', '" + d.b(this.f66387b) + "')";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l extends a0 {

        /* renamed from: d, reason: collision with root package name */
        public static final l f66388d = new l();

        public l() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m extends i {

        /* renamed from: a, reason: collision with root package name */
        public final char f66389a;

        public m(char c10) {
            this.f66389a = c10;
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            bitSet.set(this.f66389a);
        }

        @Override // io.odeeo.internal.t0.d
        public d and(d dVar) {
            return dVar.matches(this.f66389a) ? this : d.none();
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return c10 == this.f66389a;
        }

        @Override // io.odeeo.internal.t0.d.i, io.odeeo.internal.t0.d
        public d negate() {
            return d.isNot(this.f66389a);
        }

        @Override // io.odeeo.internal.t0.d
        public d or(d dVar) {
            return dVar.matches(this.f66389a) ? dVar : super.or(dVar);
        }

        @Override // io.odeeo.internal.t0.d
        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString().replace(this.f66389a, c10);
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.is('" + d.b(this.f66389a) + "')";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n extends i {

        /* renamed from: a, reason: collision with root package name */
        public final char f66390a;

        /* renamed from: b, reason: collision with root package name */
        public final char f66391b;

        public n(char c10, char c11) {
            this.f66390a = c10;
            this.f66391b = c11;
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            bitSet.set(this.f66390a);
            bitSet.set(this.f66391b);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return c10 == this.f66390a || c10 == this.f66391b;
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.anyOf(\"" + d.b(this.f66390a) + d.b(this.f66391b) + "\")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o extends i {

        /* renamed from: a, reason: collision with root package name */
        public final char f66392a;

        public o(char c10) {
            this.f66392a = c10;
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            bitSet.set(0, this.f66392a);
            bitSet.set(this.f66392a + 1, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }

        @Override // io.odeeo.internal.t0.d
        public d and(d dVar) {
            return dVar.matches(this.f66392a) ? super.and(dVar) : dVar;
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return c10 != this.f66392a;
        }

        @Override // io.odeeo.internal.t0.d.i, io.odeeo.internal.t0.d
        public d negate() {
            return d.is(this.f66392a);
        }

        @Override // io.odeeo.internal.t0.d
        public d or(d dVar) {
            return dVar.matches(this.f66392a) ? d.any() : this;
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.isNot('" + d.b(this.f66392a) + "')";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class p extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final p f66393a = new p();

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return Character.isDigit(c10);
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class q extends v {

        /* renamed from: b, reason: collision with root package name */
        public static final q f66394b = new q();

        public q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            if (c10 > 31) {
                return c10 >= 127 && c10 <= 159;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class r extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final r f66395a = new r();

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return Character.isLetter(c10);
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class s extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final s f66396a = new s();

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class t extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final t f66397a = new t();

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return Character.isLowerCase(c10);
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class u extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final u f66398a = new u();

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return Character.isUpperCase(c10);
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class v extends i {

        /* renamed from: a, reason: collision with root package name */
        public final String f66399a;

        public v(String str) {
            this.f66399a = (String) io.odeeo.internal.t0.u.checkNotNull(str);
        }

        @Override // io.odeeo.internal.t0.d
        public final String toString() {
            return this.f66399a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class w extends d {

        /* renamed from: a, reason: collision with root package name */
        public final d f66400a;

        public w(d dVar) {
            this.f66400a = (d) io.odeeo.internal.t0.u.checkNotNull(dVar);
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f66400a.a(bitSet2);
            bitSet2.flip(0, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            bitSet.or(bitSet2);
        }

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f66400a.countIn(charSequence);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return !this.f66400a.matches(c10);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f66400a.matchesNoneOf(charSequence);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f66400a.matchesAllOf(charSequence);
        }

        @Override // io.odeeo.internal.t0.d
        public d negate() {
            return this.f66400a;
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return this.f66400a + ".negate()";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class y extends v {

        /* renamed from: b, reason: collision with root package name */
        public static final y f66401b = new y();

        public y() {
            super("CharMatcher.none()");
        }

        @Override // io.odeeo.internal.t0.d
        public d and(d dVar) {
            io.odeeo.internal.t0.u.checkNotNull(dVar);
            return this;
        }

        @Override // io.odeeo.internal.t0.d
        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // io.odeeo.internal.t0.d
        public int countIn(CharSequence charSequence) {
            io.odeeo.internal.t0.u.checkNotNull(charSequence);
            return 0;
        }

        @Override // io.odeeo.internal.t0.d
        public int indexIn(CharSequence charSequence) {
            io.odeeo.internal.t0.u.checkNotNull(charSequence);
            return -1;
        }

        @Override // io.odeeo.internal.t0.d
        public int lastIndexIn(CharSequence charSequence) {
            io.odeeo.internal.t0.u.checkNotNull(charSequence);
            return -1;
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return false;
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matchesNoneOf(CharSequence charSequence) {
            io.odeeo.internal.t0.u.checkNotNull(charSequence);
            return true;
        }

        @Override // io.odeeo.internal.t0.d.i, io.odeeo.internal.t0.d
        public d negate() {
            return d.any();
        }

        @Override // io.odeeo.internal.t0.d
        public d or(d dVar) {
            return (d) io.odeeo.internal.t0.u.checkNotNull(dVar);
        }

        @Override // io.odeeo.internal.t0.d
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // io.odeeo.internal.t0.d
        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // io.odeeo.internal.t0.d
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // io.odeeo.internal.t0.d
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // io.odeeo.internal.t0.d
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // io.odeeo.internal.t0.d
        public int indexIn(CharSequence charSequence, int i10) {
            io.odeeo.internal.t0.u.checkPositionIndex(i10, charSequence.length());
            return -1;
        }

        @Override // io.odeeo.internal.t0.d
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            io.odeeo.internal.t0.u.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class z extends d {

        /* renamed from: a, reason: collision with root package name */
        public final d f66402a;

        /* renamed from: b, reason: collision with root package name */
        public final d f66403b;

        public z(d dVar, d dVar2) {
            this.f66402a = (d) io.odeeo.internal.t0.u.checkNotNull(dVar);
            this.f66403b = (d) io.odeeo.internal.t0.u.checkNotNull(dVar2);
        }

        @Override // io.odeeo.internal.t0.d
        public void a(BitSet bitSet) {
            this.f66402a.a(bitSet);
            this.f66403b.a(bitSet);
        }

        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public boolean matches(char c10) {
            return this.f66402a.matches(c10) || this.f66403b.matches(c10);
        }

        @Override // io.odeeo.internal.t0.d
        public String toString() {
            return "CharMatcher.or(" + this.f66402a + ", " + this.f66403b + ")";
        }
    }

    public static boolean a(int i10, int i11) {
        return i10 <= 1023 && i11 > i10 * 64;
    }

    public static d any() {
        return c.f66377b;
    }

    public static d anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new C0649d(charSequence) : a(charSequence.charAt(0), charSequence.charAt(1)) : is(charSequence.charAt(0)) : none();
    }

    public static d ascii() {
        return e.f66381b;
    }

    public static String b(char c10) {
        char[] cArr = new char[6];
        cArr[0] = AbstractJsonLexerKt.STRING_ESC;
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static d breakingWhitespace() {
        return g.f66383a;
    }

    @Deprecated
    public static d digit() {
        return h.f66384d;
    }

    public static d forPredicate(io.odeeo.internal.t0.v<? super Character> vVar) {
        return vVar instanceof d ? (d) vVar : new j(vVar);
    }

    public static d inRange(char c10, char c11) {
        return new k(c10, c11);
    }

    @Deprecated
    public static d invisible() {
        return l.f66388d;
    }

    public static d is(char c10) {
        return new m(c10);
    }

    public static d isNot(char c10) {
        return new o(c10);
    }

    @Deprecated
    public static d javaDigit() {
        return p.f66393a;
    }

    public static d javaIsoControl() {
        return q.f66394b;
    }

    @Deprecated
    public static d javaLetter() {
        return r.f66395a;
    }

    @Deprecated
    public static d javaLetterOrDigit() {
        return s.f66396a;
    }

    @Deprecated
    public static d javaLowerCase() {
        return t.f66397a;
    }

    @Deprecated
    public static d javaUpperCase() {
        return u.f66398a;
    }

    public static d none() {
        return y.f66401b;
    }

    public static d noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    @Deprecated
    public static d singleWidth() {
        return b0.f66376d;
    }

    public static d whitespace() {
        return c0.f66379c;
    }

    public d and(d dVar) {
        return new b(this, dVar);
    }

    public String collapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (matches(cCharAt)) {
                if (cCharAt != c10 || (i10 != length - 1 && matches(charSequence.charAt(i10 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                    sb2.append(c10);
                    return a(charSequence, i10 + 1, length, c10, sb2, true);
                }
                i10++;
            }
            i10++;
            c10 = c10;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (matches(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c10);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public d negate() {
        return new w(this);
    }

    public d or(d dVar) {
        return new z(this, dVar);
    }

    public d precomputed() {
        return io.odeeo.internal.t0.t.a(this);
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i10 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    break;
                }
                charArray[iIndexIn - i10] = charArray[iIndexIn];
                iIndexIn++;
            }
            return new String(charArray, 0, iIndexIn - i10);
            i10++;
        }
    }

    public String replaceFrom(CharSequence charSequence, char c10) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c10;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = c10;
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && matches(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && matches(charSequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return collapseFrom(charSequence, c10);
        }
        int i13 = i12 + 1;
        return a(charSequence, i11, i13, c10, new StringBuilder(i13 - i11), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && matches(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && matches(charSequence.charAt(i11))) {
            i11--;
        }
        return charSequence.subSequence(i10, i11 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!matches(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // io.odeeo.internal.t0.v
    @Deprecated
    public boolean apply(Character ch2) {
        return matches(ch2.charValue());
    }

    public int indexIn(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        io.odeeo.internal.t0.u.checkPositionIndex(i10, length);
        while (i10 < length) {
            if (matches(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public d a() {
        String strConcat;
        BitSet bitSet = new BitSet();
        a(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return a(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i10 = C.DEFAULT_BUFFER_SEGMENT_SIZE - iCardinality;
        String string = toString();
        if (!string.endsWith(".negate()")) {
            strConcat = string.concat(".negate()");
        } else {
            strConcat = string.substring(0, string.length() - 9);
        }
        return new a(a(i10, bitSet, strConcat), string);
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i10 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(a.b.a(length2, 3, 2, 16));
        do {
            sb2.append((CharSequence) string, i10, iIndexIn);
            sb2.append(charSequence2);
            i10 = iIndexIn + 1;
            iIndexIn = indexIn(string, i10);
        } while (iIndexIn != -1);
        sb2.append((CharSequence) string, i10, length2);
        return sb2.toString();
    }

    public static d a(int i10, BitSet bitSet, String str) {
        if (i10 == 0) {
            return none();
        }
        if (i10 == 1) {
            return is((char) bitSet.nextSetBit(0));
        }
        if (i10 != 2) {
            return a(i10, bitSet.length()) ? io.odeeo.internal.t0.y.a(bitSet, str) : new f(bitSet, str, null);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return a(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class i extends d {
        @Override // io.odeeo.internal.t0.d, io.odeeo.internal.t0.v
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // io.odeeo.internal.t0.d
        public d negate() {
            return new x(this);
        }

        @Override // io.odeeo.internal.t0.d
        public final d precomputed() {
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class x extends w {
        public x(d dVar) {
            super(dVar);
        }

        @Override // io.odeeo.internal.t0.d
        public final d precomputed() {
            return this;
        }
    }

    public void a(BitSet bitSet) {
        for (int i10 = Settings.DEFAULT_INITIAL_WINDOW_SIZE; i10 >= 0; i10--) {
            if (matches((char) i10)) {
                bitSet.set(i10);
            }
        }
    }

    public final String a(CharSequence charSequence, int i10, int i11, char c10, StringBuilder sb2, boolean z10) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (!matches(cCharAt)) {
                sb2.append(cCharAt);
                z10 = false;
            } else if (!z10) {
                sb2.append(c10);
                z10 = true;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static n a(char c10, char c11) {
        return new n(c10, c11);
    }
}
