package j1;

import android.graphics.Color;
import android.util.Log;
import android.util.Pair;
import android.widget.Button;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.JsonElement;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o2 {
    public static void A(b1.a aVar, String str, TextView textView) {
        textView.setText(aVar.sharedInstance().getTraductionFromToken(str));
    }

    public static int B(int i10, int i11, int i12, int i13) {
        return (i10 * i11) + i12 + i13;
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) * i12) + i13;
    }

    public static int c(int i10, int i11, List list) {
        return (list.hashCode() + i10) * i11;
    }

    public static long d(int i10, int i11, long j10) {
        return s2.r.IntOffset(i11, s2.q.m6931getYimpl(j10) + i10);
    }

    public static Object e(int i10, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String f(char c10, String str, String str2) {
        return str + str2 + c10;
    }

    public static String g(int i10, String str, String str2) {
        return str + str2 + i10;
    }

    public static String h(File file, String str) {
        return str + file;
    }

    public static String i(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String j(Object obj, String str) {
        return str + obj;
    }

    public static String k(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String n(String str, boolean z10) {
        return str + z10;
    }

    public static String o(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String p(StringBuilder sb2, List list, char c10) {
        sb2.append(list);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, Map map, char c10) {
        sb2.append(map);
        sb2.append(c10);
        return sb2.toString();
    }

    public static tu.k r() {
        FlowKt.noImpl();
        return new tu.k();
    }

    public static ui.e s(int i10, ui.d dVar) {
        return dVar.withProperty(xi.b.builder().tag(i10).build()).build();
    }

    public static void t(int i10, int i11, int i12, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i10, i11, i12)));
    }

    public static void u(int i10, String str, String str2) {
        Log.w(str2, str + i10);
    }

    public static void v(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    public static void w(Button button, String str) {
        button.setText(lb.b1.sharedInstance().getTraductionFromToken(str));
    }

    public static void x(TextView textView, String str) {
        textView.setText(lb.b1.sharedInstance().getTraductionFromToken(str));
    }

    public static void y(Class cls, StringBuilder sb2, String str, JsonElement jsonElement, String str2) {
        sb2.append(kotlin.jvm.internal.c1.getOrCreateKotlinClass(cls).getSimpleName());
        sb2.append(str);
        sb2.append(kotlin.jvm.internal.c1.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName());
        sb2.append(str2);
    }

    public static void z(String str, String str2, ArrayList arrayList) {
        arrayList.add(new Pair(str, str2));
    }
}
