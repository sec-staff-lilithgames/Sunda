package wk;

import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.type.Color;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearAlpha() {
        copyOnWrite();
        ((Color) this.instance).clearAlpha();
        return this;
    }

    public b clearBlue() {
        copyOnWrite();
        ((Color) this.instance).clearBlue();
        return this;
    }

    public b clearGreen() {
        copyOnWrite();
        ((Color) this.instance).clearGreen();
        return this;
    }

    public b clearRed() {
        copyOnWrite();
        ((Color) this.instance).clearRed();
        return this;
    }

    @Override // wk.c
    public FloatValue getAlpha() {
        return ((Color) this.instance).getAlpha();
    }

    @Override // wk.c
    public float getBlue() {
        return ((Color) this.instance).getBlue();
    }

    @Override // wk.c
    public float getGreen() {
        return ((Color) this.instance).getGreen();
    }

    @Override // wk.c
    public float getRed() {
        return ((Color) this.instance).getRed();
    }

    @Override // wk.c
    public boolean hasAlpha() {
        return ((Color) this.instance).hasAlpha();
    }

    public b mergeAlpha(FloatValue floatValue) {
        copyOnWrite();
        ((Color) this.instance).mergeAlpha(floatValue);
        return this;
    }

    public b setAlpha(FloatValue floatValue) {
        copyOnWrite();
        ((Color) this.instance).setAlpha(floatValue);
        return this;
    }

    public b setBlue(float f10) {
        copyOnWrite();
        ((Color) this.instance).setBlue(f10);
        return this;
    }

    public b setGreen(float f10) {
        copyOnWrite();
        ((Color) this.instance).setGreen(f10);
        return this;
    }

    public b setRed(float f10) {
        copyOnWrite();
        ((Color) this.instance).setRed(f10);
        return this;
    }

    public b setAlpha(FloatValue.Builder builder) {
        copyOnWrite();
        ((Color) this.instance).setAlpha(builder.build());
        return this;
    }
}
