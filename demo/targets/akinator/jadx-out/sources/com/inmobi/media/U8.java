package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class U8 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final byte f32357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U8(Context context, byte b10) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f32357a = b10;
    }

    public abstract void a(C2970r8 c2970r8, V8 v82, int i10, int i11, N8 n82);

    public final byte getType() {
        return this.f32357a;
    }
}
