package q2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import i1.o;
import j1.b2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: b, reason: collision with root package name */
    public final b2 f82396b;

    /* renamed from: c, reason: collision with root package name */
    public o f82397c;

    public a(b2 shaderBrush) {
        e0.checkNotNullParameter(shaderBrush, "shaderBrush");
        this.f82396b = shaderBrush;
    }

    public final b2 getShaderBrush() {
        return this.f82396b;
    }

    /* renamed from: getSize-VsRJwc0, reason: not valid java name */
    public final o m5975getSizeVsRJwc0() {
        return this.f82397c;
    }

    /* renamed from: setSize-iaC8Vc4, reason: not valid java name */
    public final void m5976setSizeiaC8Vc4(o oVar) {
        this.f82397c = oVar;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        o oVar;
        if (textPaint == null || (oVar = this.f82397c) == null) {
            return;
        }
        textPaint.setShader(this.f82396b.mo4695createShaderuvyYCjk(oVar.m4257unboximpl()));
    }
}
