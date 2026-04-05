package com.bytedance.sdk.openadsdk.wqx;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.rv;
import com.bytedance.sdk.openadsdk.wqx.Cif;
import com.bytedance.sdk.openadsdk.wqx.cm;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements rv {

    /* renamed from: cm, reason: collision with root package name */
    private boolean f21643cm;

    /* renamed from: jd, reason: collision with root package name */
    private final Context f21644jd;
    public Cif jpo;
    private rv.jpo my;
    private cm wqx;

    public wqx(Context context, String str, List<FilterWord> list, String str2, dt dtVar) {
        this.f21644jd = context;
        jpo(str, list, str2, dtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        Context context = this.f21644jd;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.jpo.isShowing()) {
            return;
        }
        this.jpo.show();
    }

    private void jpo(String str, List<FilterWord> list, String str2, dt dtVar) {
        this.wqx = new cm(this.f21644jd, str, list);
        Cif cif = new Cif(this.f21644jd, this.wqx.getDislikeManager());
        this.jpo = cif;
        cif.jpo(str2, dtVar);
        this.jpo.jpo(new Cif.jpo() { // from class: com.bytedance.sdk.openadsdk.wqx.wqx.1
            @Override // com.bytedance.sdk.openadsdk.wqx.Cif.jpo
            public void jd() {
                wqx.this.jpo();
            }

            @Override // com.bytedance.sdk.openadsdk.wqx.Cif.jpo
            public void jpo() {
            }

            @Override // com.bytedance.sdk.openadsdk.wqx.Cif.jpo
            public void wqx() {
                wqx.this.jpo();
            }

            @Override // com.bytedance.sdk.openadsdk.wqx.Cif.jpo
            public void jpo(int i10, FilterWord filterWord, String str3) {
                wqx.this.wqx.onSuggestionSubmit(str3);
                wqx.this.jpo();
            }
        });
        this.wqx.jpo(new cm.jpo() { // from class: com.bytedance.sdk.openadsdk.wqx.wqx.2
            @Override // com.bytedance.sdk.openadsdk.wqx.cm.jpo
            public void jd() {
                try {
                    if (wqx.this.my != null) {
                        wqx.this.my.jpo();
                    }
                } catch (Throwable th2) {
                    nmd.jpo("TTAdDislikeImpl", "dislike callback cancel error: ", th2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.wqx.cm.jpo
            public void jpo() {
                wqx.this.jpo(true);
                if (wqx.this.wqx != null && wqx.this.wqx.isShowing()) {
                    wqx.this.wqx.hide();
                }
                wqx.this.cm();
            }

            @Override // com.bytedance.sdk.openadsdk.wqx.cm.jpo
            public void jpo(int i10, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && wqx.this.my != null) {
                        wqx.this.my.jpo(i10, filterWord.getName());
                    }
                    filterWord.getName();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.rv
    public void jd() {
        cm cmVar = this.wqx;
        if (cmVar != null) {
            cmVar.destroy();
        }
    }

    public boolean wqx() {
        return this.f21643cm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rv
    public void jpo() {
        Context context = this.f21644jd;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.wqx.isShowing()) {
            return;
        }
        this.wqx.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.rv
    public void jpo(rv.jpo jpoVar) {
        this.my = jpoVar;
    }

    public void jpo(String str) {
        cm cmVar = this.wqx;
        if (cmVar != null) {
            cmVar.jpo(str);
        }
    }

    public void jpo(boolean z10) {
        this.f21643cm = z10;
    }
}
