package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nq extends jj {
    public nq(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        this.xyk += 6;
        if (this.f51if.tic()) {
            com.bytedance.sdk.component.adexpress.jj.jpo jpoVar = new com.bytedance.sdk.component.adexpress.jj.jpo(context, this.f51if.qk(), this.f51if.my(), 1, this.f51if.xyk());
            this.prr = jpoVar;
            jpoVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.prr = textView;
            textView.setIncludeFontPadding(false);
        }
        this.prr.setTag(Integer.valueOf(getClickArea()));
        addView(this.prr, getWidgetLayoutParams());
    }

    private boolean jpo() {
        DynamicRootView dynamicRootView = this.oya;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.oya.getRenderRequest().yd() == 4) ? false : true;
    }

    private void ju() {
        if (this.prr instanceof com.bytedance.sdk.component.adexpress.jj.jpo) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.optString(i10));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.jj.jpo) this.prr).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.jj.jpo) this.prr).setTextColor(this.f51if.qk());
            ((com.bytedance.sdk.component.adexpress.jj.jpo) this.prr).setTextSize(this.f51if.my());
            ((com.bytedance.sdk.component.adexpress.jj.jpo) this.prr).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.jj.jpo) this.prr).setAnimationType(this.f51if.vrc());
            ((com.bytedance.sdk.component.adexpress.jj.jpo) this.prr).setAnimationDuration(this.f51if.va() * 1000);
            ((com.bytedance.sdk.component.adexpress.jj.jpo) this.prr).jpo();
        }
    }

    private void yd() {
        int iJpo;
        if (a.v(this.f18236au, "source") || a.v(this.f18236au, "title") || a.v(this.f18236au, "text_star")) {
            int[] iArrJd = com.bytedance.sdk.component.adexpress.dynamic.my.ju.jd(this.f51if.jj(), this.f51if.my(), true);
            int iJpo2 = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), this.f51if.jd());
            int iJpo3 = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), this.f51if.wqx());
            int iJpo4 = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), this.f51if.cm());
            int iJpo5 = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), this.f51if.jpo());
            int iMin = Math.min(iJpo2, iJpo5);
            if (a.v(this.f18236au, "source") && (iJpo = ((this.xyk - ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), this.f51if.my()))) - iJpo2) - iJpo5) > 1 && iJpo <= iMin * 2) {
                int i10 = iJpo / 2;
                this.prr.setPadding(iJpo3, iJpo2 - i10, iJpo4, iJpo5 - (iJpo - i10));
                return;
            }
            int i11 = (((iArrJd[1] + iJpo2) + iJpo5) - this.xyk) - 2;
            if (i11 <= 1) {
                return;
            }
            if (i11 <= iMin * 2) {
                int i12 = i11 / 2;
                this.prr.setPadding(iJpo3, iJpo2 - i12, iJpo4, iJpo5 - (i11 - i12));
            } else if (i11 > iJpo2 + iJpo5) {
                final int i13 = (i11 - iJpo2) - iJpo5;
                this.prr.setPadding(iJpo3, 0, iJpo4, 0);
                if (i13 <= ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), 1.0f)) + 1) {
                    ((TextView) this.prr).setTextSize(this.f51if.my() - 1.0f);
                } else if (i13 <= (((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.prr).setTextSize(this.f51if.my() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nq.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = nq.this.prr.getLayoutParams();
                                nq nqVar = nq.this;
                                layoutParams.height = nqVar.xyk + i13;
                                nqVar.prr.setLayoutParams(layoutParams);
                                nq.this.prr.setTranslationY(-i13);
                                ((ViewGroup) nq.this.prr.getParent()).setClipChildren(false);
                                ((ViewGroup) nq.this.prr.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iJpo2 > iJpo5) {
                this.prr.setPadding(iJpo3, iJpo2 - (i11 - iMin), iJpo4, iJpo5 - iMin);
            } else {
                this.prr.setPadding(iJpo3, iJpo2 - iMin, iJpo4, iJpo5 - (i11 - iMin));
            }
        }
        if (a.v(this.f18236au, "fillButton")) {
            this.prr.setTextAlignment(2);
            ((TextView) this.prr).setGravity(17);
        }
    }

    public String getText() {
        String strJj = this.f51if.jj();
        if (TextUtils.isEmpty(strJj)) {
            if (!com.bytedance.sdk.component.adexpress.cm.jd() && a.v(this.f18236au, "text_star")) {
                strJj = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.cm.jd() && a.v(this.f18236au, "score-count")) {
                strJj = "6870";
            }
        }
        return (a.v(this.f18236au, "title") || a.v(this.f18236au, "subtitle")) ? strJj.replace("\n", "") : strJj;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() throws NumberFormatException {
        int i10;
        double d10;
        super.zz();
        if (TextUtils.isEmpty(getText())) {
            this.prr.setVisibility(4);
            return true;
        }
        if (this.f51if.tic()) {
            ju();
            return true;
        }
        ((TextView) this.prr).setText(this.f51if.jj());
        ((TextView) this.prr).setTextDirection(5);
        this.prr.setTextAlignment(this.f51if.xyk());
        ((TextView) this.prr).setTextColor(this.f51if.qk());
        ((TextView) this.prr).setTextSize(this.f51if.my());
        if (this.f51if.tu()) {
            int iDt = this.f51if.dt();
            if (iDt > 0) {
                ((TextView) this.prr).setLines(iDt);
                ((TextView) this.prr).setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            ((TextView) this.prr).setMaxLines(1);
            ((TextView) this.prr).setGravity(17);
            ((TextView) this.prr).setEllipsize(TextUtils.TruncateAt.END);
        }
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar = this.f18236au;
        if (xykVar != null && xykVar.yd() != null) {
            if (com.bytedance.sdk.component.adexpress.cm.jd() && jpo() && (a.v(this.f18236au, "text_star") || a.v(this.f18236au, "score-count") || a.v(this.f18236au, "score-count-type-1") || a.v(this.f18236au, "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (a.v(this.f18236au, "score-count") || a.v(this.f18236au, "score-count-type-2")) {
                try {
                    try {
                        i10 = Integer.parseInt(getText());
                    } catch (NumberFormatException unused) {
                        i10 = -1;
                    }
                    if (i10 < 0) {
                        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                            setVisibility(8);
                            return true;
                        }
                        this.prr.setVisibility(0);
                    }
                    if (TextUtils.equals(this.f18236au.yd().jd(), "score-count-type-2")) {
                        ((TextView) this.prr).setText(String.format(new DecimalFormat("(###,###,###)").format(i10), Integer.valueOf(i10)));
                        ((TextView) this.prr).setGravity(17);
                        return true;
                    }
                    jpo((TextView) this.prr, i10, getContext(), "tt_comment_num");
                } catch (Exception unused2) {
                }
            } else if (a.v(this.f18236au, "text_star")) {
                try {
                    d10 = Double.parseDouble(getText());
                } catch (Exception unused3) {
                    d10 = -1.0d;
                }
                if (d10 < 0.0d || d10 > 5.0d) {
                    if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                        setVisibility(8);
                        return true;
                    }
                    this.prr.setVisibility(0);
                }
                ((TextView) this.prr).setIncludeFontPadding(false);
                ((TextView) this.prr).setText(String.format("%.1f", Double.valueOf(d10)));
            } else if (TextUtils.equals("privacy-detail", this.f18236au.yd().jd())) {
                ((TextView) this.prr).setText("Permission list | Privacy policy");
            } else if (a.v(this.f18236au, "development-name")) {
                ((TextView) this.prr).setText(com.bytedance.sdk.component.utils.dt.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), "tt_text_privacy_development") + getText());
            } else if (a.v(this.f18236au, "app-version")) {
                ((TextView) this.prr).setText(com.bytedance.sdk.component.utils.dt.jpo(com.bytedance.sdk.component.adexpress.cm.jpo(), "tt_text_privacy_app_version") + getText());
            } else {
                ((TextView) this.prr).setText(getText());
            }
            this.prr.setTextAlignment(this.f51if.xyk());
            ((TextView) this.prr).setGravity(this.f51if.zz());
            if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                yd();
            }
        }
        return true;
    }

    public void jpo(TextView textView, int i10, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.dt.jpo(context, str), Integer.valueOf(i10)) + ")");
        if (i10 == -1) {
            textView.setVisibility(8);
        }
    }
}
