package androidx.compose.ui.platform;

import a2.a1;
import a2.b1;
import a2.c1;
import a2.d1;
import a2.e1;
import a2.e3;
import a2.f1;
import a2.g1;
import a2.h1;
import a2.i3;
import a2.t;
import a2.w0;
import a2.w1;
import a2.x0;
import a2.y0;
import a2.z0;
import android.content.Context;
import android.content.res.Configuration;
import d2.b;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import p0.g3;
import p0.h3;
import p0.j2;
import p0.k1;
import p0.o0;
import p0.o4;
import p0.v;
import p0.w;
import p0.z4;
import z0.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f5309a = o0.compositionLocalOf(z4.neverEqualPolicy(), w0.f3869e);

    /* renamed from: b, reason: collision with root package name */
    public static final g3 f5310b = o0.staticCompositionLocalOf(x0.f3880e);

    /* renamed from: c, reason: collision with root package name */
    public static final g3 f5311c = o0.staticCompositionLocalOf(y0.f3887e);

    /* renamed from: d, reason: collision with root package name */
    public static final g3 f5312d = o0.staticCompositionLocalOf(z0.f3897e);

    /* renamed from: e, reason: collision with root package name */
    public static final g3 f5313e = o0.staticCompositionLocalOf(a1.f3419e);

    /* renamed from: f, reason: collision with root package name */
    public static final g3 f5314f = o0.staticCompositionLocalOf(b1.f3456e);

    public static final void ProvideAndroidCompositionLocals(t owner, p content, w wVar, int i10) {
        e0.checkNotNullParameter(owner, "owner");
        e0.checkNotNullParameter(content, "content");
        w wVarStartRestartGroup = wVar.startRestartGroup(1396852028);
        Context context = owner.getContext();
        wVarStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
        v vVar = v.f80515a;
        if (objRememberedValue == vVar.getEmpty()) {
            objRememberedValue = z4.mutableStateOf(context.getResources().getConfiguration(), z4.neverEqualPolicy());
            wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        wVarStartRestartGroup.endReplaceableGroup();
        j2 j2Var = (j2) objRememberedValue;
        wVarStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = wVarStartRestartGroup.changed(j2Var);
        Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == vVar.getEmpty()) {
            objRememberedValue2 = new c1(j2Var);
            wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        wVarStartRestartGroup.endReplaceableGroup();
        owner.setConfigurationChangeObserver((l) objRememberedValue2);
        wVarStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = wVarStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == vVar.getEmpty()) {
            e0.checkNotNullExpressionValue(context, "context");
            objRememberedValue3 = new w1(context);
            wVarStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        wVarStartRestartGroup.endReplaceableGroup();
        w1 w1Var = (w1) objRememberedValue3;
        t.b viewTreeOwners = owner.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        wVarStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue4 = wVarStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == vVar.getEmpty()) {
            objRememberedValue4 = i3.DisposableSaveableStateRegistry(owner, viewTreeOwners.getSavedStateRegistryOwner());
            wVarStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        wVarStartRestartGroup.endReplaceableGroup();
        e3 e3Var = (e3) objRememberedValue4;
        k1.DisposableEffect(tu.x0.f87415a, new d1(e3Var), wVarStartRestartGroup, 0);
        e0.checkNotNullExpressionValue(context, "context");
        Object obj = (Configuration) j2Var.getValue();
        wVarStartRestartGroup.startReplaceableGroup(-485908294);
        wVarStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue5 = wVarStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == vVar.getEmpty()) {
            objRememberedValue5 = new b();
            wVarStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        wVarStartRestartGroup.endReplaceableGroup();
        b bVar = (b) objRememberedValue5;
        kotlin.jvm.internal.b1 b1Var = new kotlin.jvm.internal.b1();
        wVarStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue6 = wVarStartRestartGroup.rememberedValue();
        if (objRememberedValue6 == vVar.getEmpty()) {
            wVarStartRestartGroup.updateRememberedValue(obj);
        } else {
            obj = objRememberedValue6;
        }
        wVarStartRestartGroup.endReplaceableGroup();
        b1Var.f71816b = obj;
        wVarStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue7 = wVarStartRestartGroup.rememberedValue();
        if (objRememberedValue7 == vVar.getEmpty()) {
            objRememberedValue7 = new h1(b1Var, bVar);
            wVarStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        wVarStartRestartGroup.endReplaceableGroup();
        k1.DisposableEffect(bVar, new g1(context, (h1) objRememberedValue7), wVarStartRestartGroup, 8);
        wVarStartRestartGroup.endReplaceableGroup();
        Configuration configuration = (Configuration) j2Var.getValue();
        e0.checkNotNullExpressionValue(configuration, "configuration");
        o0.CompositionLocalProvider(new h3[]{f5309a.provides(configuration), f5310b.provides(context), f5312d.provides(viewTreeOwners.getLifecycleOwner()), f5313e.provides(viewTreeOwners.getSavedStateRegistryOwner()), a1.l.getLocalSaveableStateRegistry().provides(e3Var), f5314f.provides(owner.getView()), f5311c.provides(bVar)}, u.composableLambda(wVarStartRestartGroup, 1471621628, true, new e1(owner, w1Var, content, i10)), wVarStartRestartGroup, 56);
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new f1(owner, content, i10));
    }

    public static final Void access$noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final g3 getLocalConfiguration() {
        return f5309a;
    }

    public static final g3 getLocalContext() {
        return f5310b;
    }

    public static final g3 getLocalImageVectorCache() {
        return f5311c;
    }

    public static final g3 getLocalLifecycleOwner() {
        return f5312d;
    }

    public static final g3 getLocalSavedStateRegistryOwner() {
        return f5313e;
    }

    public static final g3 getLocalView() {
        return f5314f;
    }
}
