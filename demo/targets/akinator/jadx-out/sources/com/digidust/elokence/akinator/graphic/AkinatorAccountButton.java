package com.digidust.elokence.akinator.graphic;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.digidust.elokence.akinator.freemium.R;
import da.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AkinatorAccountButton extends a {
    public AkinatorAccountButton(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context);
        a(context);
    }

    @Override // da.a
    public final void a(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.a(context);
        setBackgroundResource(R.drawable.btn_delete_account2x);
        setTextColor(Color.parseColor("#FFFFFF"));
        setTextSize(0, getResources().getDimensionPixelSize(R.dimen.soundlike_button_text_size));
    }

    public AkinatorAccountButton(Context context, AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet);
        a(context);
    }

    public AkinatorAccountButton(Context context, AttributeSet attributeSet, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet, i10);
        a(context);
    }
}
