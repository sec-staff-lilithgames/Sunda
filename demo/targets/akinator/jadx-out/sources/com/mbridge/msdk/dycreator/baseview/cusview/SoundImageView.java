package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class SoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40018a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40018a = true;
    }

    public boolean getStatus() {
        return this.f40018a;
    }

    public void setSoundStatus(boolean z10) {
        this.f40018a = z10;
        if (z10) {
            setImageResource(h0.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(h0.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40018a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f40018a = true;
    }
}
