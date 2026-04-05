package a2;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0.g3 f3420a = p0.o0.staticCompositionLocalOf(i2.f3651e);

    /* renamed from: b, reason: collision with root package name */
    public static final p0.g3 f3421b = p0.o0.staticCompositionLocalOf(j2.f3665e);

    /* renamed from: c, reason: collision with root package name */
    public static final p0.g3 f3422c = p0.o0.staticCompositionLocalOf(k2.f3692e);

    /* renamed from: d, reason: collision with root package name */
    public static final p0.g3 f3423d = p0.o0.staticCompositionLocalOf(l2.f3704e);

    /* renamed from: e, reason: collision with root package name */
    public static final p0.g3 f3424e = p0.o0.staticCompositionLocalOf(m2.f3726e);

    /* renamed from: f, reason: collision with root package name */
    public static final p0.g3 f3425f = p0.o0.staticCompositionLocalOf(n2.f3733e);

    /* renamed from: g, reason: collision with root package name */
    public static final p0.g3 f3426g = p0.o0.staticCompositionLocalOf(p2.f3766e);

    /* renamed from: h, reason: collision with root package name */
    public static final p0.g3 f3427h = p0.o0.staticCompositionLocalOf(o2.f3742e);

    /* renamed from: i, reason: collision with root package name */
    public static final p0.g3 f3428i = p0.o0.staticCompositionLocalOf(q2.f3779e);

    /* renamed from: j, reason: collision with root package name */
    public static final p0.g3 f3429j = p0.o0.staticCompositionLocalOf(r2.f3786e);

    /* renamed from: k, reason: collision with root package name */
    public static final p0.g3 f3430k = p0.o0.staticCompositionLocalOf(s2.f3795e);

    /* renamed from: l, reason: collision with root package name */
    public static final p0.g3 f3431l = p0.o0.staticCompositionLocalOf(u2.f3856e);

    /* renamed from: m, reason: collision with root package name */
    public static final p0.g3 f3432m = p0.o0.staticCompositionLocalOf(v2.f3864e);

    /* renamed from: n, reason: collision with root package name */
    public static final p0.g3 f3433n = p0.o0.staticCompositionLocalOf(w2.f3871e);

    /* renamed from: o, reason: collision with root package name */
    public static final p0.g3 f3434o = p0.o0.staticCompositionLocalOf(x2.f3882e);

    /* renamed from: p, reason: collision with root package name */
    public static final p0.g3 f3435p = p0.o0.staticCompositionLocalOf(y2.f3890e);

    /* renamed from: q, reason: collision with root package name */
    public static final p0.g3 f3436q = p0.o0.staticCompositionLocalOf(t2.f3847e);

    public static final void ProvideCommonCompositionLocals(z1.s1 owner, x4 uriHandler, kv.p content, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
        kotlin.jvm.internal.e0.checkNotNullParameter(uriHandler, "uriHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(874662829);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(owner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(uriHandler) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= wVarStartRestartGroup.changed(content) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i11 & 731) == 146 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            p0.o0.CompositionLocalProvider(new p0.h3[]{f3420a.provides(owner.getAccessibilityManager()), f3421b.provides(owner.getAutofill()), f3422c.provides(owner.getAutofillTree()), f3423d.provides(owner.getClipboardManager()), f3424e.provides(owner.getDensity()), f3425f.provides(owner.getFocusManager()), f3426g.providesDefault(owner.getFontLoader()), f3427h.providesDefault(owner.getFontFamilyResolver()), f3428i.provides(owner.getHapticFeedBack()), f3429j.provides(owner.getInputModeManager()), f3430k.provides(owner.getLayoutDirection()), f3431l.provides(owner.getTextInputService()), f3432m.provides(owner.getTextToolbar()), f3433n.provides(uriHandler), f3434o.provides(owner.getViewConfiguration()), f3435p.provides(owner.getWindowInfo()), f3436q.provides(owner.getPointerIconService())}, content, wVarStartRestartGroup, ((i11 >> 3) & 112) | 8);
        }
        p0.o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new z2(owner, uriHandler, content, i10));
    }

    public static final Void access$noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final p0.g3 getLocalAccessibilityManager() {
        return f3420a;
    }

    public static final p0.g3 getLocalAutofill() {
        return f3421b;
    }

    public static final p0.g3 getLocalAutofillTree() {
        return f3422c;
    }

    public static final p0.g3 getLocalClipboardManager() {
        return f3423d;
    }

    public static final p0.g3 getLocalDensity() {
        return f3424e;
    }

    public static final p0.g3 getLocalFocusManager() {
        return f3425f;
    }

    public static final p0.g3 getLocalFontFamilyResolver() {
        return f3427h;
    }

    public static final p0.g3 getLocalFontLoader() {
        return f3426g;
    }

    public static final p0.g3 getLocalHapticFeedback() {
        return f3428i;
    }

    public static final p0.g3 getLocalInputModeManager() {
        return f3429j;
    }

    public static final p0.g3 getLocalLayoutDirection() {
        return f3430k;
    }

    public static final p0.g3 getLocalPointerIconService() {
        return f3436q;
    }

    public static final p0.g3 getLocalTextInputService() {
        return f3431l;
    }

    public static final p0.g3 getLocalTextToolbar() {
        return f3432m;
    }

    public static final p0.g3 getLocalUriHandler() {
        return f3433n;
    }

    public static final p0.g3 getLocalViewConfiguration() {
        return f3434o;
    }

    public static final p0.g3 getLocalWindowInfo() {
        return f3435p;
    }

    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @tu.f
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }
}
