package com.apm.insight.l;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private Writer f13175a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f13176b = new ArrayList();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13177a = new a("EMPTY_ARRAY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f13178b = new a("NONEMPTY_ARRAY", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f13179c = new a("EMPTY_OBJECT", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f13180d = new a("DANGLING_KEY", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f13181e = new a("NONEMPTY_OBJECT", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f13182f = new a("NULL", 5);

        private a(String str, int i10) {
        }
    }

    private h(Writer writer) {
        this.f13175a = writer;
    }

    private h a() throws JSONException, IOException {
        return a(a.f13177a, C3191e4.i.f36529d);
    }

    private h b() throws JSONException, IOException {
        a aVar = a.f13177a;
        return a(C3191e4.i.f36531e);
    }

    private h c() throws JSONException, IOException {
        return a(a.f13179c, "{");
    }

    private h d() throws JSONException, IOException {
        a aVar = a.f13177a;
        return a("}");
    }

    private a e() throws JSONException {
        return (a) o2.g(1, this.f13176b);
    }

    private void f() throws JSONException, IOException {
        if (this.f13176b.isEmpty()) {
            return;
        }
        a aVarE = e();
        if (aVarE == a.f13177a) {
            a(a.f13178b);
            return;
        }
        if (aVarE == a.f13178b) {
            this.f13175a.write(44);
        } else if (aVarE == a.f13180d) {
            this.f13175a.write(":");
            a(a.f13181e);
        } else if (aVarE != a.f13182f) {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    private h a(a aVar, String str) throws JSONException, IOException {
        f();
        this.f13176b.add(aVar);
        this.f13175a.write(str);
        return this;
    }

    private void b(String str) throws IOException {
        this.f13175a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.f13175a.write("\\f");
            } else if (cCharAt != '\r') {
                if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                    switch (cCharAt) {
                        case '\b':
                            this.f13175a.write("\\b");
                            continue;
                        case '\t':
                            this.f13175a.write("\\t");
                            continue;
                        case '\n':
                            this.f13175a.write("\\n");
                            continue;
                        default:
                            if (cCharAt <= 31) {
                                this.f13175a.write(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f13175a.write(92);
                }
                this.f13175a.write(cCharAt);
            } else {
                this.f13175a.write("\\r");
            }
        }
        this.f13175a.write("\"");
    }

    private h c(String str) throws JSONException, IOException {
        a aVarE = e();
        if (aVarE == a.f13181e) {
            this.f13175a.write(44);
        } else if (aVarE != a.f13179c) {
            throw new JSONException("Nesting problem");
        }
        a(a.f13180d);
        b(str);
        return this;
    }

    private h a(String str) throws JSONException, IOException {
        e();
        this.f13176b.remove(r0.size() - 1);
        this.f13175a.write(str);
        return this;
    }

    private void a(a aVar) {
        this.f13176b.set(r0.size() - 1, aVar);
    }

    private h a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        f();
        if (obj != null && obj != JSONObject.NULL) {
            if (obj instanceof Boolean) {
                this.f13175a.write(String.valueOf(obj));
                return this;
            }
            if (obj instanceof Number) {
                this.f13175a.write(JSONObject.numberToString((Number) obj));
                return this;
            }
            b(obj.toString());
            return this;
        }
        this.f13175a.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public static void a(JSONObject jSONObject, Writer writer) throws Throwable {
        new h(writer).a(jSONObject);
        writer.flush();
    }

    public static void a(JSONArray jSONArray, Writer writer) throws Throwable {
        new h(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) throws JSONException, IOException {
        c();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            c(next).a(jSONObject.get(next));
        }
        d();
    }

    private void a(JSONArray jSONArray) throws JSONException, IOException {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }
}
