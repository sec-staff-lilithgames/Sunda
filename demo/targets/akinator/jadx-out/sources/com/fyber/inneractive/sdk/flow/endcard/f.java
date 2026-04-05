package com.fyber.inneractive.sdk.flow.endcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends a {

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f23566c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f23567d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f23568e;

    public f(b bVar) {
        super(bVar);
        View viewInflate = LayoutInflater.from(IAConfigManager.O.f23227v.a()).inflate(R.layout.ia_layout_default_video_end_card, (ViewGroup) null);
        this.f23567d = (Button) viewInflate.findViewById(R.id.ia_b_end_card_call_to_action);
        this.f23568e = (TextView) viewInflate.findViewById(R.id.ia_endcard_tv_app_info_button);
        this.f23566c = a.a(viewInflate);
    }

    public final void a(com.fyber.inneractive.sdk.player.ui.b bVar, com.fyber.inneractive.sdk.player.ui.n nVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        Context context = this.f23567d.getContext();
        this.f23567d.setAllCaps(bVar.f26245b);
        this.f23567d.setVisibility(0);
        if (IAConfigManager.O.E.n() && (mVar = bVar.f26252i) != null && mVar == com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP) {
            this.f23567d.setText(R.string.ia_video_instant_install_text);
            if (bVar.f26250g) {
                String str = bVar.f26251h;
                if (str != null && str.length() == 1) {
                    TextView textView = this.f23568e;
                    int dimensionPixelSize = textView.getContext().getResources().getDimensionPixelSize(R.dimen.ia_image_control_size);
                    textView.setBackgroundResource(R.drawable.ia_bg_circle_overlay);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    layoutParams.width = dimensionPixelSize;
                    layoutParams.height = dimensionPixelSize;
                    textView.setLayoutParams(layoutParams);
                }
                this.f23568e.setText(str);
                this.f23568e.setVisibility(0);
            }
        } else {
            this.f23568e.setVisibility(8);
            Button button = this.f23567d;
            Context context2 = this.f23566c.getContext();
            String str2 = bVar.f26246c;
            button.setText(!TextUtils.isEmpty(str2) ? i1.a(str2, 15) : context2.getString(R.string.ia_video_install_now_text));
        }
        this.f23567d.setBackgroundResource(R.drawable.ia_bg_green);
        this.f23567d.setTextSize(0, context.getResources().getDimension(R.dimen.ia_video_overlay_text_large_plus));
        TextView textView2 = this.f23568e;
        if (nVar != null) {
            textView2.setOnTouchListener(new e(10, nVar));
        } else {
            textView2.setOnTouchListener(null);
        }
        Button button2 = this.f23567d;
        if (nVar != null) {
            button2.setOnTouchListener(new e(8, nVar));
        } else {
            button2.setOnTouchListener(null);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return this.f23566c;
    }
}
