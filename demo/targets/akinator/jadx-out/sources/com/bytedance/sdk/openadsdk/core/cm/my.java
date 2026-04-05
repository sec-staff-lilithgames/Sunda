package com.bytedance.sdk.openadsdk.core.cm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.cm.jj;
import com.bytedance.sdk.openadsdk.core.model.tu;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: jd, reason: collision with root package name */
    private jj f20271jd;

    /* renamed from: jj, reason: collision with root package name */
    private final jj.jd f20272jj;
    private tu jpo;

    /* renamed from: qk, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f20273qk;
    private final jj.jpo xyk;
    private List<jpo> wqx = new ArrayList();

    /* renamed from: cm, reason: collision with root package name */
    private final String f20270cm = "BannerSwiperManager";
    private int my = -1;

    public my(tu tuVar, Context context, int i10, int i11) {
        jj.jd jdVar = new jj.jd() { // from class: com.bytedance.sdk.openadsdk.core.cm.my.1
            @Override // com.bytedance.sdk.openadsdk.core.cm.jj.jd
            public void jpo(boolean z10) {
                try {
                    if (z10) {
                        my.this.cm();
                    } else {
                        my.this.wqx();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.f20272jj = jdVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.my.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                my.this.my();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (my.this.wqx != null && !my.this.wqx.isEmpty()) {
                    for (int i12 = 0; i12 < my.this.wqx.size(); i12++) {
                        ((jpo) my.this.wqx.get(i12)).jj();
                    }
                }
                my.this.my = -1;
                if (my.this.f20271jd != null) {
                    my.this.f20271jd.cm();
                }
            }
        };
        this.f20273qk = onAttachStateChangeListener;
        jj.jpo jpoVar = new jj.jpo() { // from class: com.bytedance.sdk.openadsdk.core.cm.my.3
            @Override // com.bytedance.sdk.openadsdk.core.cm.jj.jpo
            public void jpo(boolean z10) {
                if (z10) {
                    my.this.cm();
                } else {
                    my.this.wqx();
                }
            }
        };
        this.xyk = jpoVar;
        this.jpo = tuVar;
        jj jjVar = new jj(context);
        this.f20271jd = jjVar;
        jjVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f20271jd.setSwiperWindowFocusChangedListener(jdVar);
        this.f20271jd.setSwiperVisibleChangeListener(jpoVar);
        jpo(context, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        jj jjVar;
        tu tuVar = this.jpo;
        if (tuVar != null && tuVar.jd() == 1 && (jjVar = this.f20271jd) != null) {
            jjVar.my();
        }
        int i10 = this.my;
        if (i10 >= 0) {
            jpo(i10);
            jd(this.my);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void my() {
        if (this.jpo == null) {
            this.jpo = new tu();
        }
        this.f20271jd.jpo(TextUtils.equals(this.jpo.jpo(), "vertical") ? 1 : 0).jpo("dot").wqx(false).cm(this.jpo.cm() == 1).jpo(this.jpo.jd() == 1).wqx(this.jpo.zz()).my(this.jpo.yd() == 1).cm(this.jpo.xyk()).jd(this.jpo.wqx() == 1).xyk(this.jpo.my()).zz(this.jpo.jj()).qk(this.jpo.qk());
        this.f20271jd.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.jj.wqx() { // from class: com.bytedance.sdk.openadsdk.core.cm.my.4
            @Override // com.bytedance.adsdk.ugeno.jj.wqx
            public void jpo(boolean z10, int i10, float f10, int i11) {
            }

            @Override // com.bytedance.adsdk.ugeno.jj.wqx
            public void jpo(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                my.this.wqx(i10);
                my.this.my = i10;
                my.this.jpo(i10);
                my.this.jd(i10);
            }

            @Override // com.bytedance.adsdk.ugeno.jj.wqx
            public void jpo(boolean z10, int i10) {
                if (i10 == 1 || i10 == 2) {
                    my.this.jd(-1);
                } else if (i10 == 0) {
                    my myVar = my.this;
                    myVar.jpo(myVar.my);
                }
            }
        });
        jd(this.wqx);
        this.f20271jd.wqx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx() {
        jj jjVar;
        tu tuVar = this.jpo;
        if (tuVar != null && tuVar.jd() == 1 && (jjVar = this.f20271jd) != null) {
            jjVar.jj();
        }
        if (this.my >= 0) {
            jd(-1);
        }
    }

    public void jd(int i10) {
        jpo jpoVar;
        for (int i11 = 0; i11 < this.wqx.size(); i11++) {
            try {
                if (i11 != i10 && (jpoVar = this.wqx.get(i11)) != null) {
                    jpoVar.zz();
                }
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
    }

    public void jpo(Context context, float f10, float f11) {
        int iJd = va.jd(context, f10);
        int iJd2 = va.jd(context, f11);
        ViewGroup.LayoutParams layoutParams = this.f20271jd.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iJd, iJd2);
        }
        layoutParams.width = iJd;
        layoutParams.height = iJd2;
        this.f20271jd.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx(int i10) {
        jpo jpoVar;
        try {
            int i11 = this.my;
            if (i11 != -1 && i11 != i10 && (jpoVar = this.wqx.get(i11)) != null) {
                jpoVar.cm();
                jpoVar.xyk();
            }
            jpo jpoVar2 = this.wqx.get(i10);
            if (jpoVar2 != null) {
                jpoVar2.my();
            }
        } catch (Throwable unused) {
        }
    }

    private void jd(List<jpo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f20271jd.jpo((jj) list.get(i10).jpo());
        }
    }

    public View jd() {
        return this.f20271jd;
    }

    public void jpo(List<jpo> list) {
        this.wqx = list;
    }

    public void jpo(final int i10) {
        jpo jpoVar;
        try {
            final int size = this.wqx.size();
            if (i10 < size && (jpoVar = this.wqx.get(i10)) != null) {
                jpoVar.jpo(new com.bytedance.sdk.openadsdk.jpo.jpo.jd() { // from class: com.bytedance.sdk.openadsdk.core.cm.my.5
                    @Override // com.bytedance.sdk.openadsdk.jpo.jpo.jd
                    public void jpo() {
                        int i11 = i10 + 1;
                        if (i11 >= size) {
                            return;
                        }
                        my.this.jpo(i11);
                    }
                });
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void jpo() {
        if (this.f20271jd != null) {
            try {
                List<jpo> list = this.wqx;
                if (list != null && !list.isEmpty()) {
                    for (int i10 = 0; i10 < this.wqx.size(); i10++) {
                        this.wqx.get(i10).qk();
                    }
                }
                this.my = -1;
                this.f20271jd.cm();
                this.f20271jd.setSwiperWindowFocusChangedListener(null);
                this.f20271jd.setSwiperVisibleChangeListener(null);
                this.f20271jd.removeOnAttachStateChangeListener(this.f20273qk);
                this.f20271jd = null;
            } catch (Throwable unused) {
            }
        }
    }
}
