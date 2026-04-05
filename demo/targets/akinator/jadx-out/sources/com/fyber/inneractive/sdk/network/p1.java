package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xv.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p1 extends i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final xv.l0 f24265a = new xv.l0().newBuilder().build();

    public static HashMap b(xv.v0 v0Var) {
        HashMap map = new HashMap();
        if (v0Var != null) {
            xv.f0 f0VarHeaders = v0Var.headers();
            for (int i10 = 0; i10 < f0VarHeaders.size(); i10++) {
                String strName = f0VarHeaders.name(i10);
                map.put(strName, Collections.singletonList(f0VarHeaders.get(strName)));
            }
        }
        return map;
    }

    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) throws Exception {
        IAlog.a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(t0Var.r());
            Pair pairA = a(t0Var.r(), t0Var, arrayList, str, str2);
            Object obj = pairA.second;
            String strMessage = obj != null ? ((xv.v0) obj).message() : "";
            FilterInputStream filterInputStreamA = a((xv.v0) pairA.second);
            Object obj2 = pairA.second;
            int iCode = obj2 == null ? -1 : ((xv.v0) obj2).code();
            HashMap mapB = b((xv.v0) pairA.second);
            xv.v0 v0Var = (xv.v0) pairA.second;
            o1 o1Var = new o1(i.a(filterInputStreamA, iCode, strMessage, mapB, v0Var != null ? v0Var.headers().get("Last-Modified") : null), (xv.v0) pairA.second);
            Iterator it = ((List) pairA.first).iterator();
            while (it.hasNext()) {
                o1Var.f24242f.add((String) it.next());
            }
            return o1Var;
        } catch (b e10) {
            IAlog.b("%s cannot connect exception: %s", "OkHttpExecutorImpl", e10.getMessage());
            throw e10;
        } catch (Exception e11) {
            IAlog.b("%s exception: %s", "OkHttpExecutorImpl", e11.getMessage());
            throw e11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb A[Catch: all -> 0x0161, Exception -> 0x0164, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0164, all -> 0x0161, blocks: (B:16:0x00a4, B:18:0x00b0, B:37:0x00e0, B:39:0x00ea, B:51:0x012e, B:29:0x00cb), top: B:78:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0 A[Catch: all -> 0x0161, Exception -> 0x0164, TRY_ENTER, TryCatch #5 {Exception -> 0x0164, all -> 0x0161, blocks: (B:16:0x00a4, B:18:0x00b0, B:37:0x00e0, B:39:0x00ea, B:51:0x012e, B:29:0x00cb), top: B:78:0x00a4 }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(java.lang.String r9, com.fyber.inneractive.sdk.network.t0 r10, java.util.ArrayList r11, java.lang.String r12, java.lang.String r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.p1.a(java.lang.String, com.fyber.inneractive.sdk.network.t0, java.util.ArrayList, java.lang.String, java.lang.String):android.util.Pair");
    }

    public static FilterInputStream a(xv.v0 v0Var) {
        if (v0Var == null) {
            return null;
        }
        try {
            if (v0Var.body() == null) {
                return null;
            }
            return i.a(v0Var.body().byteStream(), TextUtils.equals("gzip", v0Var.headers().get("content-encoding")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(o0.a aVar, String str, String str2) {
        IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        aVar.addHeader(str, str2);
    }
}
