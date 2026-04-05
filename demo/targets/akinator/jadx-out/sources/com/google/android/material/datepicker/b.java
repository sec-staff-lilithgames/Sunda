package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b {
    public static b a(Context context, int i10) {
        w3.i.checkArgument(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, uf.a.f88475w);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ug.d.getColorStateList(context, typedArrayObtainStyledAttributes, 4);
        ug.d.getColorStateList(context, typedArrayObtainStyledAttributes, 9);
        ug.d.getColorStateList(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        yg.p.builder(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0)).build();
        typedArrayObtainStyledAttributes.recycle();
        b bVar = new b();
        w3.i.checkArgumentNonnegative(rect.left);
        w3.i.checkArgumentNonnegative(rect.top);
        w3.i.checkArgumentNonnegative(rect.right);
        w3.i.checkArgumentNonnegative(rect.bottom);
        return bVar;
    }
}
