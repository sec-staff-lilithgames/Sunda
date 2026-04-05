package m2;

import kotlin.jvm.internal.c1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements d {
    @Override // m2.d
    public void applyTo(g buffer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        buffer.commitComposition$ui_text_release();
    }

    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    public int hashCode() {
        return c1.getOrCreateKotlinClass(i.class).hashCode();
    }

    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
