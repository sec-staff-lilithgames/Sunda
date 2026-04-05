package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.view.View;
import android.view.ViewGroup;
import com.apm.insight.b.El.rJqlArycrfkilN;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class wqx {
    private static volatile wqx jpo;

    private wqx() {
    }

    public static wqx jpo() {
        if (jpo == null) {
            synchronized (wqx.class) {
                try {
                    if (jpo == null) {
                        jpo = new wqx();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public cm jpo(View view, com.bytedance.sdk.component.adexpress.dynamic.cm.jpo jpoVar) {
        if (jpoVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(jpoVar.zz())) {
            return new ju(view, jpoVar);
        }
        if ("translate".equals(jpoVar.zz())) {
            return new prr(view, jpoVar);
        }
        if (rJqlArycrfkilN.zkFfmPDYMDK.equals(jpoVar.zz())) {
            return new xyk(view, jpoVar);
        }
        if ("marquee".equals(jpoVar.zz())) {
            return new qk(view, jpoVar);
        }
        if ("waggle".equals(jpoVar.zz())) {
            return new hna(view, jpoVar);
        }
        if ("shine".equals(jpoVar.zz())) {
            return new Cif(view, jpoVar);
        }
        if ("swing".equals(jpoVar.zz())) {
            return new oya(view, jpoVar);
        }
        if ("fade".equals(jpoVar.zz())) {
            return new jpo(view, jpoVar);
        }
        if ("rubIn".equals(jpoVar.zz())) {
            return new yd(view, jpoVar);
        }
        if ("rotate".equals(jpoVar.zz())) {
            return new zz(view, jpoVar);
        }
        if ("cutIn".equals(jpoVar.zz())) {
            return new jj(view, jpoVar);
        }
        if ("stretch".equals(jpoVar.zz())) {
            return new au(view, jpoVar);
        }
        if ("bounce".equals(jpoVar.zz())) {
            return new my(view, jpoVar);
        }
        return null;
    }
}
