package com.fyber.inneractive.sdk.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.util.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class CloseButtonFlowManager implements com.fyber.inneractive.sdk.flow.storepromo.observer.a, CloseButtonConfigurationChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f26704a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f26705b;

    /* renamed from: c, reason: collision with root package name */
    public final View f26706c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f26707d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f26708e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26709f = false;

    /* renamed from: g, reason: collision with root package name */
    public final CloseButtonConfiguration f26710g = new CloseButtonConfiguration(this);

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        View viewFindViewById = inneractiveFullscreenAdActivity.findViewById(R.id.ia_fl_close_button);
        this.f26704a = viewFindViewById;
        this.f26705b = (TextView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_tv_close_button);
        View viewFindViewById2 = inneractiveFullscreenAdActivity.findViewById(R.id.ia_clickable_close_button);
        this.f26706c = viewFindViewById2;
        this.f26707d = (ImageView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_iv_close_button);
        this.f26708e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(R.id.close_button_container);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setOnClickListener(new a(inneractiveFullscreenAdActivity));
    }

    @Override // com.fyber.inneractive.sdk.ui.CloseButtonConfigurationChangeListener
    public final void a(CloseButtonConfiguration closeButtonConfiguration) {
        int i10;
        int i11;
        if (closeButtonConfiguration.f26702f) {
            this.f26704a.setVisibility(8);
            this.f26705b.setVisibility(8);
            this.f26707d.setVisibility(8);
            this.f26706c.setVisibility(8);
            return;
        }
        CloseButtonConfiguration closeButtonConfiguration2 = this.f26710g;
        if (closeButtonConfiguration2.f26698b) {
            if (!closeButtonConfiguration2.f26699c || this.f26709f) {
                this.f26704a.setAlpha(1.0f);
                this.f26707d.setAlpha(1.0f);
            } else {
                this.f26704a.setAlpha(0.0f);
                this.f26707d.setAlpha(0.0f);
            }
            this.f26705b.setText("");
            this.f26705b.setVisibility(8);
            int i12 = closeButtonConfiguration2.f26700d;
            if (i12 >= 5) {
                int iA = o.a(i12);
                this.f26707d.getLayoutParams().width = iA;
                this.f26707d.getLayoutParams().height = iA;
            }
            int i13 = closeButtonConfiguration2.f26701e;
            if (i13 >= 5) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26707d.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f26704a.getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f26706c.getLayoutParams();
                int iA2 = o.a(i13);
                int i14 = layoutParams.width;
                int i15 = iA2 - i14;
                if (iA2 <= i14 || i15 <= (i11 = layoutParams2.rightMargin)) {
                    layoutParams3.width = iA2;
                    layoutParams3.height = iA2;
                    i10 = layoutParams2.rightMargin;
                    if (i15 < i10) {
                        i10 -= i15 / 2;
                    }
                } else {
                    int i16 = (i14 / 2) + (iA2 / 2) + i11;
                    layoutParams3.width = i16;
                    layoutParams3.height = i16;
                    layoutParams2.gravity = 53;
                    i10 = 0;
                }
                layoutParams3.setMargins(i10, i10, i10, i10);
                layoutParams3.gravity = 17;
            }
        }
        this.f26704a.setVisibility((closeButtonConfiguration.f26697a || closeButtonConfiguration.f26698b) ? 0 : 8);
        this.f26705b.setVisibility(closeButtonConfiguration.f26697a ? 0 : 8);
        int i17 = closeButtonConfiguration.f26698b ? 0 : 8;
        this.f26707d.setVisibility(i17);
        this.f26706c.setVisibility(i17);
        this.f26706c.setEnabled(closeButtonConfiguration.f26698b);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        CloseButtonConfiguration closeButtonConfiguration = this.f26710g;
        closeButtonConfiguration.f26702f = bVar.f23878a;
        closeButtonConfiguration.f26703g.a(closeButtonConfiguration);
    }
}
