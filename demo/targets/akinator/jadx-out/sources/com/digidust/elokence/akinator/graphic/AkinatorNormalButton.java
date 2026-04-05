package com.digidust.elokence.akinator.graphic;

import android.content.Context;
import android.util.AttributeSet;
import com.digidust.elokence.akinator.freemium.R;
import da.a;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AkinatorNormalButton extends a {
    public AkinatorNormalButton(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context);
        a(context);
    }

    @Override // da.a
    public final void a(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.a(context);
        setBackgroundResource(R.drawable.gen_button);
        setTextSize(0, getResources().getDimensionPixelSize(R.dimen.gen_button_text_size));
    }

    public AkinatorNormalButton(Context context, AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet);
        a(context);
    }

    public AkinatorNormalButton(Context context, AttributeSet attributeSet, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet, i10);
        a(context);
    }
}
