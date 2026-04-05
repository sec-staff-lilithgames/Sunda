package n3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f75574a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f75575b;

    /* renamed from: c, reason: collision with root package name */
    public int f75576c;

    public d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f75574a = shader;
        this.f75575b = colorStateList;
        this.f75576c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0161, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n3.d a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):n3.d");
    }

    public static d inflate(Resources resources, int i10, Resources.Theme theme) {
        try {
            return a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    public int getColor() {
        return this.f75576c;
    }

    public Shader getShader() {
        return this.f75574a;
    }

    public boolean isGradient() {
        return this.f75574a != null;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        return this.f75574a == null && (colorStateList = this.f75575b) != null && colorStateList.isStateful();
    }

    public boolean onStateChanged(int[] iArr) {
        if (!isStateful()) {
            return false;
        }
        ColorStateList colorStateList = this.f75575b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f75576c) {
            return false;
        }
        this.f75576c = colorForState;
        return true;
    }

    public void setColor(int i10) {
        this.f75576c = i10;
    }

    public boolean willDraw() {
        return isGradient() || this.f75576c != 0;
    }
}
