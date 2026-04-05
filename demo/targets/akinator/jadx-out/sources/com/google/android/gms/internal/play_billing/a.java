package com.google.android.gms.internal.play_billing;

import a2.w3;
import a2.z4;
import android.widget.RelativeLayout;
import com.ironsource.D5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.sfbx.appconsent.core.model.ConsentStatus;
import com.sfbx.appconsent.core.model.TranslatableText$$serializer;
import java.nio.ByteBuffer;
import java.util.Set;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.KMutableProperty1;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import tu.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static void A(StringBuilder sb2, String str, String str2, IronLog ironLog) {
        sb2.append(str);
        sb2.append(str2);
        ironLog.verbose(sb2.toString());
    }

    public static void B(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void C(com.google.android.gms.measurement.internal.zzic zzicVar, String str) {
        zzicVar.zzaV().zze().zza(str);
    }

    public static void D(String str, String str2, String str3) {
        p0.a(str3, str + str2);
    }

    public static int a(float f10) {
        return u0.a(c.m().d(), f10);
    }

    public static int b(int i10, int i11, int i12) {
        return zzgr.zzz(i10) + i11 + i12;
    }

    public static int c(int i10, int i11, boolean z10) {
        return (Boolean.hashCode(z10) + i10) * i11;
    }

    public static z4 d(boolean z10, z4 z4Var, String str, w3 w3Var) {
        z4Var.set(str, Boolean.valueOf(z10));
        return w3Var.getProperties();
    }

    public static l e(String str) {
        return new l.b(str).a();
    }

    public static g f(h hVar) {
        return hVar.d(c.m().b());
    }

    public static Object g(TranslatableText$$serializer translatableText$$serializer, CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor, int i10, Object obj) {
        return compositeDecoder.decodeNullableSerializableElement(serialDescriptor, i10, new ArrayListSerializer(translatableText$$serializer), obj);
    }

    public static Object h(String str, CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor, int i10, Object obj) {
        return compositeDecoder.decodeSerializableElement(serialDescriptor, i10, EnumsKt.createSimpleEnumSerializer(str, ConsentStatus.values()), obj);
    }

    public static String i(String str, StringBuilder sb2) {
        sb2.append(str.intern());
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, Integer num, char c10) {
        sb2.append(num);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, String str2) {
        sb2.append(str.intern());
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder l(Throwable th2, com.mbridge.msdk.video.bt.component.a aVar, Object obj, String str) {
        aVar.a(obj, th2.getMessage());
        return new StringBuilder(str);
    }

    public static b1 m(Object obj) {
        a0.throwOnFailure(obj);
        return new b1();
    }

    public static KMutableProperty1 n(Class cls, String str, String str2, int i10) {
        return c1.mutableProperty1(new l0(cls, str, str2, i10));
    }

    public static CoroutineScope o() {
        return CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getMain());
    }

    public static CoroutineScope p(CompletableJob completableJob) {
        return CoroutineScopeKt.CoroutineScope(completableJob.plus(Dispatchers.getMain()));
    }

    public static KSerializer q(TranslatableText$$serializer translatableText$$serializer) {
        return BuiltinSerializersKt.getNullable(new ArrayListSerializer(translatableText$$serializer));
    }

    public static void r(com.google.android.gms.measurement.internal.zzic zzicVar, String str) {
        zzicVar.zzaV().zzb().zza(str);
    }

    public static void s(D5 d52, Set set) {
        set.add(Integer.valueOf(d52.b()));
    }

    public static void t(String str, int i10, RelativeLayout.LayoutParams layoutParams, int i11) {
        layoutParams.addRule(i11, str.substring(i10).hashCode());
    }

    public static void u(String str, String str2, IronLog ironLog) {
        ironLog.verbose(str + str2);
    }

    public static void v(String str, String str2, String str3) {
        p0.b(str3, str + str2);
    }

    public static void w(String str, String str2, String str3, String str4) {
        Logger.i(str4, str + str2 + str3);
    }

    public static void x(String str, String str2, Throwable th2) {
        p0.b(str2, str + th2);
    }

    public static void y(String str, String str2, char[] cArr, int i10, int i11) {
        ByteBuffer.wrap(str.getBytes(str2)).asCharBuffer().get(cArr, i10, i11);
    }

    public static void z(String str, StringBuilder sb2, Throwable th2) {
        sb2.append(th2.getMessage());
        p0.a(str, sb2.toString());
    }
}
