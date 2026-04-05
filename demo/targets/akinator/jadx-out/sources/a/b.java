package a;

import a2.a3;
import a2.g5;
import a2.w3;
import a2.z4;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.p;
import kv.q;
import p0.a6;
import p0.q4;
import p0.w;
import x1.x0;
import z1.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static int A(int i10, int i11, int i12, int i13) {
        return ((i10 / i11) * i12) + i13;
    }

    public static /* synthetic */ String B(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? AbstractJsonLexerKt.NULL : "REMOVING" : "ADDING" : "NONE";
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static z4 b(w3 w3Var, String str, String str2) {
        e0.checkNotNullParameter(w3Var, str);
        w3Var.setName(str2);
        return w3Var.getProperties();
    }

    public static ClassCastException c(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object d(w wVar, int i10) {
        wVar.startReplaceableGroup(i10);
        return wVar.consume(a3.getLocalDensity());
    }

    public static String e(int i10, String str) {
        return str + i10;
    }

    public static String f(int i10, String str, StringBuilder sb2) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String g(long j10, String str, StringBuilder sb2) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String h(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String i(Class cls, String str) {
        return str + cls;
    }

    public static String j(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String n(StringBuilder sb2, float f10, char c10) {
        sb2.append(f10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String o(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, boolean z10, char c10) {
        sb2.append(z10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, boolean z10, String str) {
        sb2.append(z10);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder r(int i10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(i10);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder s(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(c10);
        return sb2;
    }

    public static StringBuilder t(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static Map u() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static p v(f fVar, w wVar, x0 x0Var, w wVar2, s2.e eVar) {
        a6.m5787setimpl(wVar, x0Var, fVar.getSetMeasurePolicy());
        a6.m5787setimpl(wVar2, eVar, fVar.getSetDensity());
        return fVar.getSetLayoutDirection();
    }

    public static q4 w(f fVar, w wVar, g5 g5Var, w wVar2, w wVar3) {
        a6.m5787setimpl(wVar, g5Var, fVar.getSetViewConfiguration());
        wVar2.enableReusing();
        return q4.m5830boximpl(q4.m5831constructorimpl(wVar3));
    }

    public static void x(int i10, int i11, String str, String str2, StringBuilder sb2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static void y(int i10, q qVar, q4 q4Var, w wVar, int i11) {
        qVar.invoke(q4Var, wVar, Integer.valueOf(i10));
        wVar.startReplaceableGroup(i11);
    }

    public static void z(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
    }
}
