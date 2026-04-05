package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.wqx.yd;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements yd.jd {

    /* renamed from: cm, reason: collision with root package name */
    private View f19145cm;

    /* renamed from: jd, reason: collision with root package name */
    protected List<FilterWord> f19146jd;
    protected String jpo;
    protected final yd wqx;

    public TTDislikeDialogAbstract(Context context) {
        super(context);
        yd ydVar = new yd();
        this.wqx = ydVar;
        ydVar.jpo(this);
    }

    public void destroy() {
        yd ydVar = this.wqx;
        if (ydVar != null) {
            ydVar.jpo();
        }
    }

    public yd getDislikeManager() {
        return this.wqx;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19145cm = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.f19145cm;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        yd ydVar = this.wqx;
        if (ydVar != null) {
            ydVar.wqx(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.jpo = str;
        this.f19146jd = list;
        this.wqx.jpo(str);
        this.wqx.jpo(this.f19146jd);
    }

    public TTDislikeDialogAbstract(Context context, int i10) {
        super(context, i10);
        yd ydVar = new yd();
        this.wqx = ydVar;
        ydVar.jpo(this);
    }
}
