package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3231g8 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36780a = "POST";

    /* renamed from: b, reason: collision with root package name */
    private static final String f36781b = "GET";

    /* renamed from: c, reason: collision with root package name */
    private static final String f36782c = "ISHttpService";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.g8$a */
    public static class a {

        /* renamed from: h, reason: collision with root package name */
        private static final int f36783h = 15000;

        /* renamed from: i, reason: collision with root package name */
        private static final int f36784i = 15000;

        /* renamed from: j, reason: collision with root package name */
        private static final String f36785j = "UTF-8";

        /* renamed from: a, reason: collision with root package name */
        final String f36786a;

        /* renamed from: b, reason: collision with root package name */
        final String f36787b;

        /* renamed from: c, reason: collision with root package name */
        final String f36788c;

        /* renamed from: d, reason: collision with root package name */
        final int f36789d;

        /* renamed from: e, reason: collision with root package name */
        final int f36790e;

        /* renamed from: f, reason: collision with root package name */
        final String f36791f;

        /* renamed from: g, reason: collision with root package name */
        ArrayList<Pair<String, String>> f36792g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.g8$a$a, reason: collision with other inner class name */
        public static class C0226a {

            /* renamed from: b, reason: collision with root package name */
            String f36794b;

            /* renamed from: d, reason: collision with root package name */
            String f36796d;

            /* renamed from: a, reason: collision with root package name */
            List<Pair<String, String>> f36793a = new ArrayList();

            /* renamed from: c, reason: collision with root package name */
            String f36795c = "POST";

            /* renamed from: e, reason: collision with root package name */
            int f36797e = 15000;

            /* renamed from: f, reason: collision with root package name */
            int f36798f = 15000;

            /* renamed from: g, reason: collision with root package name */
            String f36799g = "UTF-8";

            public C0226a a(String str) {
                this.f36796d = str;
                return this;
            }

            public C0226a b(String str) {
                this.f36799g = str;
                return this;
            }

            public C0226a c(String str) {
                this.f36794b = str;
                return this;
            }

            public C0226a d(String str) {
                this.f36795c = str;
                return this;
            }

            public C0226a a(int i10) {
                this.f36797e = i10;
                return this;
            }

            public C0226a b(int i10) {
                this.f36798f = i10;
                return this;
            }

            public C0226a a(Pair<String, String> pair) {
                this.f36793a.add(pair);
                return this;
            }

            public C0226a a(List<Pair<String, String>> list) {
                this.f36793a.addAll(list);
                return this;
            }

            public a a() {
                return new a(this);
            }
        }

        public a(C0226a c0226a) {
            this.f36786a = c0226a.f36794b;
            this.f36787b = c0226a.f36795c;
            this.f36788c = c0226a.f36796d;
            this.f36792g = new ArrayList<>(c0226a.f36793a);
            this.f36789d = c0226a.f36797e;
            this.f36790e = c0226a.f36798f;
            this.f36791f = c0226a.f36799g;
        }

        public boolean a() {
            return "POST".equals(this.f36787b);
        }
    }

    public static Gd a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C0226a c0226a = new a.C0226a();
        c0226a.c(uriBuild.toString()).a(str2).d("GET").a(list);
        return b(c0226a.a());
    }

    public static Gd b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C0226a c0226a = new a.C0226a();
        c0226a.c(str).a(str2).d("POST").a(list);
        return b(c0226a.a());
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0067: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:32:0x0067 */
    public static com.ironsource.Gd b(com.ironsource.C3231g8.a r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C3231g8.b(com.ironsource.g8$a):com.ironsource.Gd");
    }

    private static void a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.a()) {
            byte[] bytes = aVar.f36788c.getBytes(aVar.f36791f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            a(httpURLConnection, bytes);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    private static boolean a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    private static HttpURLConnection a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f36786a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f36789d);
        httpURLConnection.setReadTimeout(aVar.f36790e);
        httpURLConnection.setRequestMethod(aVar.f36787b);
        return httpURLConnection;
    }
}
