package yw;

import com.ironsource.G5;
import io.ktor.util.date.GMTDateParser;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class k {

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f96712f = {'x', GMTDateParser.MINUTES, 'l', 'n', GMTDateParser.SECONDS};

    /* renamed from: g, reason: collision with root package name */
    public static final char[] f96713g = {'&', 'l', 't', ';'};

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f96714h = {'&', 'g', 't', ';'};

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f96715i = {'&', 'q', AbstractJsonLexerKt.UNICODE_ESC, 'o', 't', ';'};

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f96716j = {'&', 'a', 'p', 'o', GMTDateParser.SECONDS, ';'};

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f96717k = {'&', 'a', GMTDateParser.MINUTES, 'p', ';'};

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f96718l = {'<', '!', '-', '-', ' '};

    /* renamed from: m, reason: collision with root package name */
    public static final char[] f96719m = {' ', '-', '-', '>'};

    /* renamed from: a, reason: collision with root package name */
    public final e0 f96720a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public final m f96721b;

    /* renamed from: c, reason: collision with root package name */
    public final BufferedWriter f96722c;

    /* renamed from: d, reason: collision with root package name */
    public final String f96723d;

    /* renamed from: e, reason: collision with root package name */
    public int f96724e;

    public k(Writer writer, j jVar) {
        this.f96722c = new BufferedWriter(writer, 1024);
        this.f96721b = new m(jVar);
        this.f96723d = jVar.getProlog();
    }

    public final void a(String str) throws IOException {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            char[] cArr = cCharAt != '\"' ? cCharAt != '<' ? cCharAt != '>' ? cCharAt != '&' ? cCharAt != '\'' ? null : f96716j : f96717k : f96714h : f96713g : f96715i;
            if (cArr != null) {
                e0 e0Var = this.f96720a;
                BufferedWriter bufferedWriter = this.f96722c;
                e0Var.write(bufferedWriter);
                e0Var.clear();
                bufferedWriter.write(cArr);
            } else {
                b(cCharAt);
            }
        }
    }

    public final void b(char c10) throws IOException {
        e0 e0Var = this.f96720a;
        BufferedWriter bufferedWriter = this.f96722c;
        e0Var.write(bufferedWriter);
        e0Var.clear();
        bufferedWriter.write(c10);
    }

    public final void c(String str) throws IOException {
        e0 e0Var = this.f96720a;
        BufferedWriter bufferedWriter = this.f96722c;
        e0Var.write(bufferedWriter);
        e0Var.clear();
        bufferedWriter.write(str);
    }

    public void flush() throws Exception {
        e0 e0Var = this.f96720a;
        BufferedWriter bufferedWriter = this.f96722c;
        e0Var.write(bufferedWriter);
        e0Var.clear();
        bufferedWriter.flush();
    }

    public void writeAttribute(String str, String str2, String str3) throws Exception {
        if (this.f96724e != 2) {
            throw new x("Start element required");
        }
        b(' ');
        e0 e0Var = this.f96720a;
        BufferedWriter bufferedWriter = this.f96722c;
        e0Var.write(bufferedWriter);
        e0Var.clear();
        if (str3 != null && str3.length() != 0) {
            bufferedWriter.write(str3);
            bufferedWriter.write(58);
        }
        bufferedWriter.write(str);
        b(G5.T);
        b(AbstractJsonLexerKt.STRING);
        a(str2);
        b(AbstractJsonLexerKt.STRING);
    }

    public void writeComment(String str) throws Exception {
        String pVar = this.f96721b.top();
        int i10 = this.f96724e;
        e0 e0Var = this.f96720a;
        if (i10 == 2) {
            e0Var.append('>');
        }
        if (pVar != null) {
            e0Var.append(pVar);
            e0Var.append(f96718l);
            e0Var.append(str);
            e0Var.append(f96719m);
        }
        this.f96724e = 1;
    }

    public void writeEnd(String str, String str2) throws Exception {
        String strPop = this.f96721b.pop();
        int i10 = this.f96724e;
        if (i10 == 2) {
            b('/');
            b('>');
        } else {
            if (i10 != 3) {
                c(strPop);
            }
            if (this.f96724e != 2) {
                b('<');
                b('/');
                e0 e0Var = this.f96720a;
                BufferedWriter bufferedWriter = this.f96722c;
                e0Var.write(bufferedWriter);
                e0Var.clear();
                if (str2 != null && str2.length() != 0) {
                    bufferedWriter.write(str2);
                    bufferedWriter.write(58);
                }
                bufferedWriter.write(str);
                b('>');
            }
        }
        this.f96724e = 4;
    }

    public void writeNamespace(String str, String str2) throws Exception {
        if (this.f96724e != 2) {
            throw new x("Start element required");
        }
        b(' ');
        e0 e0Var = this.f96720a;
        BufferedWriter bufferedWriter = this.f96722c;
        e0Var.write(bufferedWriter);
        e0Var.clear();
        bufferedWriter.write(f96712f);
        if (str2 != null && str2.length() != 0) {
            b(AbstractJsonLexerKt.COLON);
            c(str2);
        }
        b(G5.T);
        b(AbstractJsonLexerKt.STRING);
        a(str);
        b(AbstractJsonLexerKt.STRING);
    }

    public void writeProlog() throws Exception {
        String str = this.f96723d;
        if (str != null) {
            c(str);
            c("\n");
        }
    }

    public void writeStart(String str, String str2) throws Exception {
        String strPush = this.f96721b.push();
        int i10 = this.f96724e;
        e0 e0Var = this.f96720a;
        if (i10 == 2) {
            e0Var.append('>');
        }
        flush();
        e0Var.append(strPush);
        e0Var.append('<');
        if (str2 != null && str2.length() != 0) {
            e0Var.append(str2);
            e0Var.append(AbstractJsonLexerKt.COLON);
        }
        e0Var.append(str);
        this.f96724e = 2;
    }

    public void writeText(String str) throws Exception {
        writeText(str, t.f96760c);
    }

    public void writeText(String str, t tVar) throws Exception {
        if (this.f96724e == 2) {
            b('>');
        }
        if (tVar == t.f96759b) {
            c("<![CDATA[");
            c(str);
            c("]]>");
        } else {
            a(str);
        }
        this.f96724e = 3;
    }
}
