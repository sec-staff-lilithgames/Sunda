package dw;

import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import pw.l;
import sv.k0;
import xv.f0;
import xv.g0;
import xv.t;
import xv.v;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final pw.l f52913a;

    /* renamed from: b, reason: collision with root package name */
    public static final pw.l f52914b;

    static {
        l.a aVar = pw.l.f81911f;
        f52913a = aVar.encodeUtf8("\"\\");
        f52914b = aVar.encodeUtf8("\t ,=");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x010c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010c, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(pw.g r18, java.util.ArrayList r19) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.i.a(pw.g, java.util.ArrayList):void");
    }

    public static final String b(pw.g gVar) {
        long jIndexOfElement = gVar.indexOfElement(f52914b);
        if (jIndexOfElement == -1) {
            jIndexOfElement = gVar.size();
        }
        if (jIndexOfElement != 0) {
            return gVar.readUtf8(jIndexOfElement);
        }
        return null;
    }

    public static final boolean c(pw.g gVar) throws EOFException {
        boolean z10 = false;
        while (!gVar.exhausted()) {
            byte b10 = gVar.getByte(0L);
            if (b10 != 44) {
                if (b10 != 32 && b10 != 9) {
                    break;
                }
                gVar.readByte();
            } else {
                gVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    @tu.f
    public static final boolean hasBody(v0 response) {
        e0.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    public static final boolean promisesBody(v0 v0Var) {
        e0.checkNotNullParameter(v0Var, "<this>");
        if (e0.areEqual(v0Var.request().method(), "HEAD")) {
            return false;
        }
        int iCode = v0Var.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && yv.i.headersContentLength(v0Var) == -1 && !k0.equals("chunked", v0.header$default(v0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    public static final void receiveHeaders(v vVar, g0 url, f0 headers) {
        e0.checkNotNullParameter(vVar, "<this>");
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(headers, "headers");
        if (vVar == v.f93862a) {
            return;
        }
        List<t> all = t.f93833k.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        vVar.saveFromResponse(url, all);
    }

    public static final List<xv.m> parseChallenges(f0 f0Var, String str) {
        e0.checkNotNullParameter(f0Var, "<this>");
        e0.checkNotNullParameter(str, LJjmO.PkseFUSUvmNHI);
        ArrayList arrayList = new ArrayList();
        int size = f0Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (k0.equals(str, f0Var.name(i10), true)) {
                try {
                    a(new pw.g().writeUtf8(f0Var.value(i10)), arrayList);
                } catch (EOFException e10) {
                    okhttp3.internal.platform.c.f79515a.get().log("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }
}
