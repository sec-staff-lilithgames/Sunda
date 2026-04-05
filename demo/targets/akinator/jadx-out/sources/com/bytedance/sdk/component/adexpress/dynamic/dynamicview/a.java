package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.b;
import com.explorestack.protobuf.b9;
import com.explorestack.protobuf.g8;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.p8;
import com.explorestack.protobuf.x4;
import com.google.android.exoplayer2.util.f0;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzhvt;
import com.google.android.gms.internal.gtm.zzzi;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzlm;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static Object A(int i10) {
        return b.getDescriptor().getEnumTypes().get(i10);
    }

    public static int B(int i10, int i11, int i12) {
        return zzzi.zzC(i10) + i11 + i12;
    }

    public static int C(int i10, int i11, int i12) {
        return zzlm.zzz(i10) + i11 + i12;
    }

    public static int a(int i10, int i11) {
        return String.valueOf(i10).length() + i11;
    }

    public static int b(int i10, int i11, int i12) {
        return zzhvt.zzA(i10) + i11 + i12;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return h0.computeUInt32SizeNoTag(i10) + i11 + i12 + i13;
    }

    public static int d(int i10, int i11, int i12, int i13, int i14) {
        return (((i10 + i11) * i12) + i13) * i14;
    }

    public static int e(g8 g8Var, int i10, int i11) {
        return k7.computeStringSizeNoTag(g8Var.getRaw(i10)) + i11;
    }

    public static int f(g8 g8Var, int i10, h0 h0Var, int i11, int i12, int i13) throws IOException {
        k7.writeString(h0Var, i11, g8Var.getRaw(i10));
        return i12 + i13;
    }

    public static int g(Map.Entry entry, p8 p8Var, int i10, int i11) {
        return h0.computeMessageSize(i10, p8Var.setValue(entry.getValue()).build()) + i11;
    }

    public static com.bytedance.sdk.openadsdk.sq.jd.jpo h(String str) {
        com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
        jpoVar.jd(str);
        return jpoVar;
    }

    public static Struct i(Struct struct, Struct struct2) {
        return Struct.newBuilder(struct).mergeFrom(struct2).buildPartial();
    }

    public static IObjectWrapper j(Parcel parcel) {
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperAsInterface;
    }

    public static Object k(int i10) {
        return x4.getDescriptor().getMessageTypes().get(i10);
    }

    public static Object l(zzbk zzbkVar, int i10, List list, int i11) {
        zzh.zza(zzbkVar.name(), i10, list);
        return list.get(i11);
    }

    public static String m(int i10, int i11, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        return sb2.toString();
    }

    public static Iterator n(b9 b9Var) {
        return b9Var.getMap().entrySet().iterator();
    }

    public static void o(int i10, int i11, String str, String str2, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
    }

    public static void p(int i10, String str, String str2) {
        f0.w(str2, str + i10);
    }

    public static void q(Bundle bundle, String str) {
        bundle.putLong(str, zzt.zzk().currentTimeMillis());
    }

    public static void r(String str, String str2, String str3) {
        zzdt.zzc(str3, str2.concat(String.valueOf(str)));
    }

    public static void s(StringBuilder sb2, String str, int i10, String str2) {
        sb2.append(str);
        sb2.append(i10);
        zzdt.zzc(str2, sb2.toString());
    }

    public static void t(HashMap map, String str, Integer num, int i10, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i10));
    }

    public static void u(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    public static boolean v(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar, String str) {
        return TextUtils.equals(xykVar.yd().jd(), str);
    }

    public static boolean w(JSONObject jSONObject, String str, Boolean bool) {
        return bool.equals(Boolean.valueOf(jSONObject.optBoolean(str)));
    }

    public static int x(int i10, int i11, int i12) {
        int i13 = i10 / i11;
        return i13 + i13 + i12;
    }

    public static int y(int i10, int i11, int i12, int i13) {
        return ((i10 + i11) - i12) + i13;
    }

    public static int z(int i10, int i11, int i12, int i13, int i14) {
        return Math.max(((i10 * i11) / i12) + i13, i14);
    }
}
