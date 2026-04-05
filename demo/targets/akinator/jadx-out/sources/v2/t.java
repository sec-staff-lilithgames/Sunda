package v2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.applovin.shadow.okio.Segment;
import p0.g3;
import p0.h3;
import p0.o0;
import p0.o4;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f88933a = o0.compositionLocalOf$default(null, b.f88876e, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0232 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Popup(v2.e0 r23, kv.a r24, v2.f0 r25, kv.p r26, p0.w r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.t.Popup(v2.e0, kv.a, v2.f0, kv.p, p0.w, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0151  */
    /* renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7431PopupK5zGePQ(e1.d r25, long r26, kv.a r28, v2.f0 r29, kv.p r30, p0.w r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.t.m7431PopupK5zGePQ(e1.d, long, kv.a, v2.f0, kv.p, p0.w, int, int):void");
    }

    public static final void PopupTestTag(String tag, kv.p content, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-498879600);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(tag) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            o0.CompositionLocalProvider(new h3[]{f88933a.provides(tag)}, content, wVarStartRestartGroup, (i11 & 112) | 8);
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new r(tag, content, i10));
    }

    /* renamed from: access$Popup$lambda-1, reason: not valid java name */
    public static final kv.p m7432access$Popup$lambda1(v5 v5Var) {
        return (kv.p) v5Var.getValue();
    }

    public static final s2.s access$toIntBounds(Rect rect) {
        return new s2.s(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final g3 getLocalPopupTestTag() {
        return f88933a;
    }

    public static final boolean isFlagSecureEnabled(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & Segment.SIZE) == 0) ? false : true;
    }

    public static final boolean isPopupLayout(View view, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (view instanceof a0) {
            return str == null || kotlin.jvm.internal.e0.areEqual(str, ((a0) view).getTestTag());
        }
        return false;
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }
}
